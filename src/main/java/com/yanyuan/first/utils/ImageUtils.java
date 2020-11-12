package com.yanyuan.first.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;

/**
 * @author: yanyuan
 * @Date: 2020/11/12 17:26
 * @Description: 图片工具类
 */
@Slf4j
public class ImageUtils {
    public static final Integer LIMIT_WITH = 360;
    public static final Integer LIMIT_HEIGHT = 480;

    public void checkWithAndHeight(File file) {
        long times = System.currentTimeMillis();
        try {
            checkWithAndHeight(new FileInputStream(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        log.info("校验图片尺寸耗时：{}ms", (System.currentTimeMillis() - times));
    }

    public void checkWithAndHeight(MultipartFile file) {
        long times = System.currentTimeMillis();
        try {
            checkWithAndHeight(file.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        log.info("校验图片尺寸耗时：{}ms", (System.currentTimeMillis() - times));
    }

    public static void checkWithAndHeight(InputStream inputStream) {
        long times = System.currentTimeMillis();
        if (inputStream == null) {
            return;
        }
        if (LIMIT_WITH.intValue() == 0 && LIMIT_HEIGHT.intValue() == 0) {
            return;
        }
        // InputStream转BufferedImage
        BufferedImage bufferedImage = null;
        try {
            bufferedImage = ImageIO.read(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (bufferedImage == null) {
            return;
        }
        if (LIMIT_WITH > 0 && LIMIT_WITH > bufferedImage.getWidth()) {
            log.error("图片尺寸过小  limitWith = {} ， realWith = {}",
                    LIMIT_WITH,
                    bufferedImage.getWidth());
            throw new RuntimeException("图片尺寸过小");
        }
        if (LIMIT_HEIGHT > 0 && LIMIT_HEIGHT > bufferedImage.getHeight()) {
            log.error("图片尺寸过小  limitHeight = {} ， realHeight = {}",
                    LIMIT_HEIGHT,
                    bufferedImage.getHeight());
            throw new RuntimeException("图片尺寸过小");
        }
        log.info("校验图片尺寸耗时：{}ms", (System.currentTimeMillis() - times));
    }


}
