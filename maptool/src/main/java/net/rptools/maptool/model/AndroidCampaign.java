package net.rptools.maptool.model;


import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class AndroidCampaign {
    private GUID id = new GUID();
    private Map<GUID, AndroidZone> zones;
    private AndroidCampaignProperties campaignProperties;


    public AndroidCampaign(GUID id, Map<GUID, AndroidZone> zones, AndroidCampaignProperties campaignProperties) {
        this.id = id;
        this.zones = zones;
        this.campaignProperties = campaignProperties;
    }
}
