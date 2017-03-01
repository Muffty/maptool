package net.rptools.maptool.model;

import java.util.List;
import java.util.Map;

/**
 * Created by me on 28.02.2017.
 */
public class AndroidCampaignProperties {

    private Map<String, List<TokenProperty>> tokenTypeMap;

    public AndroidCampaignProperties(Map<String, List<TokenProperty>> tokenTypeMap) {
        this.tokenTypeMap = tokenTypeMap;
    }
}
