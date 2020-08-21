package com.yh;

import com.yh.entity.ScoreCondition;
import com.yh.mapper.ScoreConditionMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

public class MapperTest {
    private SqlSessionFactory factory;

    @Before
    public void setUp() throws Exception {
        factory = new SqlSessionFactoryBuilder()
                .build(Resources.getResourceAsReader("mybatis-config.xml"));

    }

    @Test
    public void testLocalCache() throws Exception {
        SqlSession sqlSession = factory.openSession(true); // 自动提交事务
        ScoreConditionMapper scoreConditionMapper = sqlSession.getMapper(ScoreConditionMapper.class);
        ScoreCondition scoreCondition = scoreConditionMapper.getById(1);
        sqlSession.close();
        System.out.println();
    }
}
