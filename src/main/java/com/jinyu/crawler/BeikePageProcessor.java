package com.jinyu.crawler;

import org.springframework.stereotype.Component;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

@Component
public class BeikePageProcessor implements PageProcessor {

    private Site site = Site.me().setRetryTimes(3).setSleepTime(1000);

    @Override
    public void process(Page page) {
        System.out.println(page.getRawText());
    }

    @Override
    public Site getSite() {
        return this.site;
    }

    public static void main(String[] args) {
        Spider.create(new BeikePageProcessor())
                //从"https://github.com/code4craft"开始抓
                .addUrl("https://yc.fang.ke.com/loupan")
                //开启5个线程抓取
                .thread(5)
                //启动爬虫
                .run();
    }
}
