package com.design.pattern.creator.simple.model;

import org.apache.commons.lang3.StringUtils;

/**
 * 机器人类
 *
 * @author 曾俊凯
 * @date 2022/4/28
 */
public class Robot {
    private final String head;
    private final String body;
    private final String foot;

    private Robot(String head, String body, String foot) {
        this.head = head;
        this.body = body;
        this.foot = foot;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String head;
        private String body;
        private String foot;


        public Builder head(String head) {
            this.head = head;
            return this;
        }

        public Builder body(String body) {
            this.body = body;
            return this;
        }

        public Builder foot(String foot) {
            this.foot = foot;
            return this;
        }

        public Robot build() {
            if (StringUtils.isEmpty(this.head) || StringUtils.isEmpty(this.body) || StringUtils.isEmpty(foot)) {
                throw new IllegalArgumentException("机器人缺少必须参数");
            }
            return new Robot(this.head, this.body, this.foot);
        }

    }

    @Override
    public String toString() {
        return "Robot{" +
                "head='" + head + '\'' +
                ", body='" + body + '\'' +
                ", foot='" + foot + '\'' +
                '}';
    }
}
