package com.yanyuan.first.controller;

import com.yanyuan.first.common.R;
import com.yanyuan.first.queue.ImageCompressionProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: yanyuan
 * @Date: 2020/10/27 11:19
 * @Description:
 */
@RestController
public class ImgController {

    @Autowired
    ImageCompressionProducer imageCompressionProducer;

    @GetMapping("img/compression")
    public R.Result imgCompression(@RequestParam("imgUrl") String imgUrl,
                                   @RequestParam("style") String style){
        imageCompressionProducer.send(imgUrl, style);
        return R.success("ok");
    }
}
