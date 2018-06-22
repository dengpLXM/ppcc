package com.dp.first.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import org.apache.http.client.HttpClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.netty.util.concurrent.EventExecutor;
import utils.HttpXmlClient;

@RestController
@RequestMapping("/solar")
public class MyController {

		
		@RequestMapping("/test.do")
		public String test() throws Exception {
//			Map<String, String> params = new HashMap<>();
//			params.put("cmd", "createProcess");
//			HttpXmlClient.post("http://localhost:8088/portal/workflow/login.wf", params);
			return "123456asdaa";
		}
		
		public static void main(String[] args) throws InterruptedException {
			System.out.println("begin...测试分支");
//			new Thread(new Runnable() {
//				
//				@Override
//				public void run() {
//					try {
//						Thread.sleep(5000);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					
//				}
//			}).start();
			//线程池
			Executors.newSingleThreadExecutor().submit(new Runnable() {
				
				@Override
				public void run() {
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			System.out.println("end...");
		}
}
