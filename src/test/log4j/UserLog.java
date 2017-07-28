package test.log4j;

import org.apache.log4j.Logger;

/**
 * ���O���o�͂���N���X
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

	// synchronized: ���\�b�h���I������܂ő��̃X���b�h����Ă΂�Ȃ����Ƃ��ۏ؂����
	private static synchronized void initLog() {
		log = Logger.getLogger(UserLog.class.getName());
	}
}
