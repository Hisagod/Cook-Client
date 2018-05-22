package com.aib.entity;

import java.util.List;

public class TypeEntity {
    private CategoryInfoBean categoryInfo;
    private List<ChildsBeanX> childs;

    public CategoryInfoBean getCategoryInfo() {
        return categoryInfo;
    }

    public void setCategoryInfo(CategoryInfoBean categoryInfo) {
        this.categoryInfo = categoryInfo;
    }

    public List<ChildsBeanX> getChilds() {
        return childs;
    }

    public void setChilds(List<ChildsBeanX> childs) {
        this.childs = childs;
    }

    public static class CategoryInfoBean {
        /**
         * ctgId : 0010001001
         * name : 全部菜谱
         */

        private String ctgId;
        private String name;

        public String getCtgId() {
            return ctgId;
        }

        public void setCtgId(String ctgId) {
            this.ctgId = ctgId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class ChildsBeanX {
        /**
         * categoryInfo : {"ctgId":"0010001002","name":"按菜品选择菜谱","parentId":"0010001001"}
         * childs : [{"categoryInfo":{"ctgId":"0010001007","name":"荤菜","parentId":"0010001002"}},{"categoryInfo":{"ctgId":"0010001008","name":"素菜","parentId":"0010001002"}},{"categoryInfo":{"ctgId":"0010001009","name":"汤粥","parentId":"0010001002"}},{"categoryInfo":{"ctgId":"0010001010","name":"西点","parentId":"0010001002"}},{"categoryInfo":{"ctgId":"0010001011","name":"主食","parentId":"0010001002"}},{"categoryInfo":{"ctgId":"0010001012","name":"饮品","parentId":"0010001002"}},{"categoryInfo":{"ctgId":"0010001013","name":"便当","parentId":"0010001002"}},{"categoryInfo":{"ctgId":"0010001014","name":"小吃","parentId":"0010001002"}}]
         */

        private CategoryInfoBeanX categoryInfo;
        private List<ChildsBean> childs;

        public CategoryInfoBeanX getCategoryInfo() {
            return categoryInfo;
        }

        public void setCategoryInfo(CategoryInfoBeanX categoryInfo) {
            this.categoryInfo = categoryInfo;
        }

        public List<ChildsBean> getChilds() {
            return childs;
        }

        public void setChilds(List<ChildsBean> childs) {
            this.childs = childs;
        }

        public static class CategoryInfoBeanX {
            /**
             * ctgId : 0010001002
             * name : 按菜品选择菜谱
             * parentId : 0010001001
             */

            private String ctgId;
            private String name;
            private String parentId;

            public String getCtgId() {
                return ctgId;
            }

            public void setCtgId(String ctgId) {
                this.ctgId = ctgId;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getParentId() {
                return parentId;
            }

            public void setParentId(String parentId) {
                this.parentId = parentId;
            }
        }

        public static class ChildsBean {
            /**
             * categoryInfo : {"ctgId":"0010001007","name":"荤菜","parentId":"0010001002"}
             */

            private CategoryInfoBeanXX categoryInfo;

            public CategoryInfoBeanXX getCategoryInfo() {
                return categoryInfo;
            }

            public void setCategoryInfo(CategoryInfoBeanXX categoryInfo) {
                this.categoryInfo = categoryInfo;
            }

            public static class CategoryInfoBeanXX {
                /**
                 * ctgId : 0010001007
                 * name : 荤菜
                 * parentId : 0010001002
                 */

                private String ctgId;
                private String name;
                private String parentId;

                public String getCtgId() {
                    return ctgId;
                }

                public void setCtgId(String ctgId) {
                    this.ctgId = ctgId;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getParentId() {
                    return parentId;
                }

                public void setParentId(String parentId) {
                    this.parentId = parentId;
                }
            }
        }
    }
}
