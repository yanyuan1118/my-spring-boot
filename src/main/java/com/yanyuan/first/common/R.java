package com.yanyuan.first.common;


/**
 * @author: yanyuan
 * @Date: 2020/9/23 10:38
 * @Description: 统一返回格式
 */
public class R {
    public R() {
    }

    public static R.Result success(Object obj) {
        return new R.Result(0, "成功", obj);
    }

    public static R.Result success(Integer code, Object obj) {
        return new R.Result(code, "成功", obj);
    }

    public static R.Result error() {
        return new R.Result(-1, "失败");
    }

    public static R.Result error(int code, String msg) {
        return new R.Result(code, msg);
    }

    public static class Result<T> {
        private Integer code;
        private String message;
        private T data;
        private Long times = System.currentTimeMillis();

        public Result() {
        }

        public boolean success() {
            if (this.code == null) {
                return false;
            } else {
                return this.code == 0;
            }
        }

        public Result(Integer code) {
            this.code = code;
        }

        public Result(Integer code, String message) {
            this.code = code;
            this.message = message;
        }

        public Result(Integer code, String message, T data) {
            this.code = code;
            this.message = message;
            this.data = data;
        }

        public Integer getCode() {
            return this.code;
        }

        public void setCode(Integer code) {
            this.code = code;
        }

        public String getMessage() {
            return this.message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public T getData() {
            return this.data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Long getTimes() {
            return times;
        }

        public void setTimes(Long times) {
            this.times = times;
        }
    }
}
