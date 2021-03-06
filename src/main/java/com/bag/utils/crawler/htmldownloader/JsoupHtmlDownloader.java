package com.bag.utils.crawler.htmldownloader;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by johnny on 24/11/15.
 */

@Service
public class JsoupHtmlDownloader implements HtmlDownloader {

    @Override
    public Document getHtmlDocument(String url) throws IOException {
        Document doc = Jsoup.connect(url).get();
        return doc;
    }

}
