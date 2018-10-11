package com.lq.dao;

import com.lq.entity.Walks;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lq on 2018/10/8.
 * 步数的Repository接口
 *
 */
public interface WalksRepository extends JpaRepository<Walks,Integer> {
}
