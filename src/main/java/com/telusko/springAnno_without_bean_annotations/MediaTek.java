package com.telusko.springAnno_without_bean_annotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MediaTek implements MobileProcessor {

	@Override
	public void process() {
		
		System.out.println("2nd Best CPU");
	}

}
