package com.kjpmj.spring.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kjpmj.spring.externalutil.AllatUtil;

@RestController
public class AllatController {

	@RequestMapping(path = "/approval")
	public String allatApproval(String mid, String apikey, String payamt, String encdata) {
		return AllatUtil.approval(mid, apikey, payamt, encdata);
	}
}
