package pub.okapi.cc.singleton;

public class Singleton {
	// 单件模式，确保一个类只有一个实例，并且提供一个全局访问点
	// 双重检查加锁（Double Check）将synchronized关键字修饰的同步部分减少，提升程序执行效率
	private static volatile Singleton uniqueInstance;
	
	private Singleton() {}

	public static Singleton getInstance() {
		if(uniqueInstance == null) {
			synchronized (Singleton.class) {
				if(uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
	// 保证原子操作的方法有：
	// 1.synchronized
	// 2.Lock
	// 3.java.util.concurrent.atomic包
}