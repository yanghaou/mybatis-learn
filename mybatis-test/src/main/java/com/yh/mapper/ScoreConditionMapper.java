package com.yh.mapper;

import com.yh.entity.ScoreCondition;

public interface ScoreConditionMapper {
    ScoreCondition getById(int id);
    void add(ScoreCondition condition);
    void update(ScoreCondition condition);
}
