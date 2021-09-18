package icu.sgwxm.controller;

import icu.sgwxm.entities.Payment;
import icu.sgwxm.vo.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    public static final String PAYMENT_URL = "http://provider-service";


    @PostMapping("/consumer/payment/insert")
    public CommonResult<Payment> insert(Payment payment){
        log.info("====== 请求插入：" + payment);
        return restTemplate.postForObject(PAYMENT_URL + "/payment/insert", payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
    }
}
