package com.example.springvue.dao;

import com.example.springvue.entity.Album;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AlbumRepositoryTest {
    @Resource
    private AlbumRepository albumRepository;


    @Test
    public void init() {
        Album[] albums ={
                new Album("https://open-image.nosdn.127.net/b90b83aa40cc43fcbc2df3f0f9204447.png?imageView&thumbnail=750y422&quality=95","看奥斯卡最佳动画，练就超级听力耳！","海底总动员/冰雪奇缘/极地大冒险",4),
                new Album("https://open-image.nosdn.127.net/bbe8138c40844967940d96265cf42035.jpg?imageView&thumbnail=750y422&quality=95","零基础朋友圈营销实战：你的朋友圈价值百万","教你如何优雅地在朋友圈里赚钱",54),
                new Album("https://open-image.nosdn.127.net/b53b0975201b4023b9f1d3f78671c2b3.jpg?imageView&thumbnail=750y422&quality=95","扎克伯格给女儿的科学启蒙课","下一个诺奖得主就是你的宝宝",45),
                new Album("https://open-image.nosdn.127.net/b1c4f59aec454ad3992e66d53d5a85f0.png?imageView&thumbnail=750y422&quality=95","R语言初阶-简单好用的数据处理&分析工具","美国定量研究博士，带你数据分析",43),
                new Album("https://open-image.nosdn.127.net/b1c4f59aec454ad3992e66d53d5a85f0.png?imageView&thumbnail=750y422&quality=95","R语言初阶-简单好用的数据处理&分析工具","美国定量研究博士，带你数据分析",43),
                new Album("https://open-image.nosdn.127.net/b1c4f59aec454ad3992e66d53d5a85f0.png?imageView&thumbnail=750y422&quality=95","R语言初阶-简单好用的数据处理&分析工具","美国定量研究博士，带你数据分析",43),

        };
        for (Album a:albums) {
            albumRepository.save(a);
        }
    }

    @Test
    public void findHotAlbums() {
    }
}