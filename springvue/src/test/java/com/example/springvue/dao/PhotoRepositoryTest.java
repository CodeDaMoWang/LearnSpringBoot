package com.example.springvue.dao;

import com.example.springvue.entity.Photo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PhotoRepositoryTest {

    @Resource
    private PhotoRepository photoRepository;
    @Test
    public void initData(){
        Photo[] photos = {
                new Photo("变化","http://image.uczzd.cn/13979493346659019163.jpg?id=0&from=export&height=140&width=270"),
                new Photo("破傲","http://image.uczzd.cn/2127756167747640383.jpg?id=0&from=export&height=140&width=270"),
                new Photo("文件","http://image.uczzd.cn/5773389149299163866.jpg?id=0&from=export&height=140&width=270"),
                new Photo("折扣","http://image.uczzd.cn/1353382117719111136.jpg?id=0&from=export&height=140&width=270"),
                new Photo("军队","http://image.uczzd.cn/18083499113940148183.jpg?id=0&from=export&height=140&width=270"),
                new Photo("害怕","http://image.uczzd.cn/1265963392292581456.jpg?id=0&from=export&height=140&width=270"),
                new Photo("牛杂","http://image.uczzd.cn/18346127336673572953.jpg?id=0&from=export&height=140&width=270"),
                new Photo("哈佛导师","http://image.uczzd.cn/9814085870098084040.jpg?id=0&from=export&height=140&width=270"),
                new Photo("技术的","http://image.uczzd.cn/1353382117719111136.jpg?id=0&from=export&height=140&width=270"),
                new Photo("来上课","http://image.uczzd.cn/18083499113940148183.jpg?id=0&from=export&height=140&width=270"),
                new Photo("客服","http://image.uczzd.cn/1265963392292581456.jpg?id=0&from=export&height=140&width=270"),
                new Photo("牛杂氪","http://image.uczzd.cn/18346127336673572953.jpg?id=0&from=export&height=140&width=270"),
                new Photo("佛系导师","http://image.uczzd.cn/9814085870098084040.jpg?id=0&from=export&height=140&width=270")
        };
        for(int i=0;i<photos.length;i++){
            photoRepository.save(photos[i]);
        }
    }
}
