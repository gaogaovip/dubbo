package cn.gaogao.service;

import org.apache.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;





import cn.gaogao.api.UserService;

@Service(version="1.0.0",interfaceClass=UserService.class,timeout=1000,retries=3,executes=2)
public class UserServiceImpl implements UserService{
	
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public String say() {
		logger.info("say hello--------------------");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "hello world";
	}

}
