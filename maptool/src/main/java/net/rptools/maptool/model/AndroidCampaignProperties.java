package net.rptools.maptool.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import net.rptools.maptool.client.ui.token.BooleanTokenOverlay;

/**
 * Created by me on 28.02.2017.
 */
public class AndroidCampaignProperties {

    public Map<String, List<TokenProperty>> tokenTypeMap;
    public Map<String, AndroidTokenState> tokenStates;

    public AndroidCampaignProperties(){}

    public AndroidCampaignProperties(Map<String, List<TokenProperty>> tokenTypeMap, Map<String, BooleanTokenOverlay> tokenStates) {
        this.tokenTypeMap = tokenTypeMap;
        
        this.tokenStates = new HashMap<>(tokenStates.size());
        for (Entry<String, BooleanTokenOverlay> state : tokenStates.entrySet()) {
        	this.tokenStates.put(state.getKey(), state.getValue().toAndroidTokenState());
		}
    }
}
