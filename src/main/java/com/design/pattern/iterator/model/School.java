package com.design.pattern.iterator.model;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 学校类
 *
 * @author 曾俊凯
 * @date 2022/5/7
 */
public class School {
    private List<Personnel> personnels;

    public School(SchoolBuilder builder) {
        this.personnels = builder.personnels;
    }

    public static SchoolBuilder builder() {
        return new SchoolBuilder();
    }

    public static class SchoolBuilder {
        private List<Personnel> personnels;

        public SchoolBuilder appendPersonnel(Personnel personnel) {
            if (personnels == null) {
                synchronized (this) {
                    if (personnels == null) {
                        personnels = new ArrayList<>();
                    }
                }
            }
            personnels.add(personnel);
            return this;
        }

        public School build() {
            return new School(this);
        }
    }

    public Iterator iterator() {
        return new SchoolIterator();
    }

    private class SchoolIterator implements Iterator<Personnel> {
        private Integer cursor = 0;

        @Override
        public Boolean hasNext() {
            return this.isEmpty() || this.cursor < personnels.size();
        }

        @Override
        public Boolean isEmpty() {
            return CollectionUtils.isEmpty(personnels);
        }

        @Override
        public Personnel next() {
            return personnels.get(cursor++);
        }
    }
}
