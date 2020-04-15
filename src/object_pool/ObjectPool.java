package object_pool;

import java.util.Enumeration;
import java.util.Hashtable;

public abstract class ObjectPool<T> {
    private long expirationTime;
    private Hashtable<T, Long> locked, unlocked;

    public ObjectPool() {
        expirationTime = 30000; // 30 seconds
        locked = new Hashtable<>();
        unlocked = new Hashtable<>();
    }

    protected abstract T create();

    protected abstract boolean validate(T o);

    protected abstract void expire(T o);

    public synchronized T checkout() {

        long now = System.currentTimeMillis();
        T newObject;

        if (unlocked.size() > 0) {
            Enumeration<T> e = unlocked.keys();
            while (e.hasMoreElements()) {
                newObject = e.nextElement();
                unlocked.remove(newObject);

                if (now - unlocked.get(newObject) > expirationTime) {
                    unlocked.remove(newObject);
                    expire(newObject);
                } else {
                    if (validate(newObject)) {
                        locked.put(newObject, now);
                        return newObject;
                    } else {
                        expire(newObject);
                    }
                }

            }
        }
        newObject = create();
        locked.put(newObject, now);
        return newObject;

    }

    public synchronized void checkin(T t) {
        locked.remove(t);
        unlocked.put(t, System.currentTimeMillis());
    }
}
