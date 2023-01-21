package com.telusko.springAnno_without_bean_annotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Snapdragon implements MobileProcessor {

	@Override
	public void process() {
		
		System.out.println("World Best CPU");
	}

}
