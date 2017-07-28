package test.log4j;

import org.apache.log4j.Logger;

/**
 * ログを出力するクラス
 */
public class UserLog {
	private static Logger log = null;

	static{
	}

	public UserLog() {
	}

	public Logger getLog() {
		if(log == null) {
			initLog();
		}

		return log;
	}

	// synchronized: メソッドが終了するまで他のスレッドから呼ばれないことが保証される
	private static synchronized void initLog() {
		log = Logger.getLogger(UserLog.class.getName());
	}
}
