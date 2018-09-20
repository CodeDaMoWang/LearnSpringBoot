package com.example.quickstart.DAO;


import com.example.quickstart.entity.Author;

import lombok.Data;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Data
@Configuration
public class ResDAO {
    public List<Author> getAuthors(){
        Author[] authors = {
                new Author("1.jpg","Navis","09月05日","11.jpg","触摸板即是屏幕 — 灵耀 X Pro 长测","华硕灵耀 X Pro 在 2018 台北电脑展上发布，" +
                        " 它将触摸板变成了第二块屏幕，在键鼠之外开拓新的交互方式。"),
                new Author("2.jpg","WindsorDK","08月31日","22.jpg","网易做了一款「好听」的音箱，想让听歌这件事变得更纯粹","在尝试这款音箱之前，我" +
                        "们觉得它只是众多国产智能音箱中的又一个「追风者」。"),
                new Author("3.jpg","nerd_du","07月30日","33.jpg","欣赏音乐的同时保持「耳听八方」，用骨传导耳机来解放你的双耳","不把耳机塞进耳朵里，我们还可以听歌吗？" +
                        "AfterShokz Trekz Air 就是这样一副耳机。"),
                new Author("4.jpg","王禹效","07月27日","44.png","吸尘器到底如何买？美诺 vs 戴森","简单介绍吸尘器的特性，从续航，吸力，有线与无线，集尘袋与集尘盒，" +
                        "更替式和水洗式 HEPA 等方面来聊聊哪些特性实用。"),
        };

        List<Author> authorList = Arrays.asList(authors);
        return authorList;
    }


}
