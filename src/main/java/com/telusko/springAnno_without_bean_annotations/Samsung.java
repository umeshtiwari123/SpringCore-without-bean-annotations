package com.telusko.springAnno_without_bean_annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//Non-qualified and de-capitalized
@Component
public class Samsung {

	@Autowired
	@Qualifier("snapdragon")
	MobileProcessor cpu;
	
	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void config()
	{
		System.out.println("Octa Core, 4gb Ram, 12 MP Camera");
		cpu.process();
	}
}
