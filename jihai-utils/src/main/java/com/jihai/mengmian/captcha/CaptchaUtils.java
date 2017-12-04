package com.jihai.mengmian.captcha;

import cn.apiclub.captcha.Captcha;
import cn.apiclub.captcha.backgrounds.GradiatedBackgroundProducer;
import cn.apiclub.captcha.gimpy.FishEyeGimpyRenderer;

import javax.imageio.ImageIO;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Created by kevinchen on 2017/2/25.
 */
public class CaptchaUtils {


    public static Captcha getCaptcha(){
        return new Captcha.Builder(CaptchaConstant.captchaW, CaptchaConstant.captchaH)
                .addText().addBackground(new GradiatedBackgroundProducer())
                .gimp(new FishEyeGimpyRenderer())
                .build();
    }

    public static byte[] getCaptchaStream(Captcha captcha) {
        if (captcha == null) return null;
        //验证码的图片返回
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            ImageIO.write(captcha.getImage(), "png", bos);
            return bos.toByteArray();
        } catch (IOException e) {
            return null;
        }
    }

}
