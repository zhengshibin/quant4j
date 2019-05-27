package com.quant.common.to;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by yang on 2019/5/28.
 */
@NoArgsConstructor
@Data
public class BuyAndSellIndicatorTo {


    /**
     * stopLoss : 0
     * stopGain : 5
     * kline : 30min
     * size : 2000
     * symbol : ethusdt
     * indicatorBuy : [{"condition":"or","compare":{"value":"num_down","label":"小于"},"ruleFirst":{"name":"价格","value":"price","params":"默认指标"},"ruleSecond":{"value":"240"}},{"condition":"and","compare":{"value":"num_down","label":"小于"},"ruleFirst":{"name":"rsi-14","value":"RSI","params":"14"},"ruleSecond":{"value":"30"}}]
     * indicatorSell : [{"condition":"and","compare":{"value":"num_over","label":"大于"},"ruleFirst":{"name":"价格","value":"price","params":"默认指标"},"ruleSecond":{"value":"270"}},{"condition":"and","compare":{"value":"num_over","label":"大于"},"ruleFirst":{"name":"rsi-14","value":"RSI","params":"14"},"ruleSecond":{"value":"70"}}]
     */

    private Double stopLoss;
    private Double stopGain;
    private String kline;
    private String size;
    private String symbol;
    private List<IndicatorBuyBean> indicatorBuy;
    private List<IndicatorSellBean> indicatorSell;

    @NoArgsConstructor
    @Data
    public static class IndicatorBuyBean implements IndicatorBean{
        /**
         * condition : or
         * compare : {"value":"num_down","label":"小于"}
         * ruleFirst : {"name":"价格","value":"price","params":"默认指标"}
         * ruleSecond : {"value":"240"}
         */

        private String condition;
        private CompareBean compare;
        private RuleFirstBean ruleFirst;
        private RuleSecondBean ruleSecond;

        @NoArgsConstructor
        @Data
        public static class CompareBean {
            /**
             * value : num_down
             * label : 小于
             */

            private String value;
            private String label;
        }

        @NoArgsConstructor
        @Data
        public static class RuleFirstBean {
            /**
             * name : 价格
             * value : price
             * params : 默认指标
             */

            private String name;
            private String value;
            private String params;
        }

        @NoArgsConstructor
        @Data
        public static class RuleSecondBean {
            /**
             * value : 240
             */

            private String value;

            private String params;
        }
    }

    @NoArgsConstructor
    @Data
    public static class IndicatorSellBean implements IndicatorBean{
        /**
         * condition : and
         * compare : {"value":"num_over","label":"大于"}
         * ruleFirst : {"name":"价格","value":"price","params":"默认指标"}
         * ruleSecond : {"value":"270"}
         */

        private String condition;
        private CompareBeanX compare;
        private RuleFirstBeanX ruleFirst;
        private RuleSecondBeanX ruleSecond;

        @NoArgsConstructor
        @Data
        public static class CompareBeanX {
            /**
             * value : num_over
             * label : 大于
             */

            private String value;
            private String label;
        }

        @NoArgsConstructor
        @Data
        public static class RuleFirstBeanX {
            /**
             * name : 价格
             * value : price
             * params : 默认指标
             */

            private String name;
            private String value;
            private String params;
        }

        @NoArgsConstructor
        @Data
        public static class RuleSecondBeanX {
            /**
             * value : 270
             */

            private String value;
            private String params;
        }
    }
}
