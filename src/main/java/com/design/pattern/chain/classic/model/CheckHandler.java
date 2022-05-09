package com.design.pattern.chain.classic.model;

/**
 * 请假审批链
 *
 * @author 曾俊凯
 * @date 2022/5/3
 */
public abstract class CheckHandler {
    protected CheckHandler handler;

    public void appendHandler(CheckHandler handler) {
        this.handler = handler;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private CheckHandler first;
        private CheckHandler last;

        public Builder appendHandler(CheckHandler handler) {
            if (this.first == null) {
                this.first = this.last = handler;
                return this;
            }
            // 设置下一个处理者
            this.last.appendHandler(handler);
            this.last = handler;
            return this;
        }

        public CheckHandler build() {
            return this.first;
        }
    }

    public abstract Boolean handler(Integer date);
}
