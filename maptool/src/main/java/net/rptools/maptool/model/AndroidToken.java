package net.rptools.maptool.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import net.rptools.CaseInsensitiveHashMap;
import net.rptools.lib.MD5Key;

/**
 * Created by me on 01.03.2017.
 */
public class AndroidToken {
    public GUID id;
    public boolean beingImpersonated ;
    public GUID exposedAreaGUID;

    public int x;
    public int y;
    public int z;

    public int anchorX;
    public int anchorY;

    public double sizeScale = 1;

    public int lastX;
    public int lastY;
    
    public MD5Key charsheetImage;
    public MD5Key portraitImage;
    

    public boolean isVisible = true;
    public boolean visibleOnlyToOwner = false;

    public String name;
    public Set<String> ownerList;

    public Map<String, MD5Key> imageAssetMap;
    public Map<String, Boolean> state;
    public Map<String, String> properties;
    
    public boolean pc;
    
    public String layer;
    public TokenProperty tokenProperties;

    public AndroidToken(){}

    public AndroidToken(GUID id, boolean beingImpersonated, GUID exposedAreaGUID, int x, int y, int z, int anchorX, int anchorY, int lastX, int lastY, String name, Set<String> ownerList, MD5Key charsheetImage, MD5Key portraitImage, Map<String, MD5Key> imageAssetMap, boolean pc, Map<String, Object> states, CaseInsensitiveHashMap<Object> propertyMapCI, String layer, boolean isVisible) {
        this.id = id;
        this.beingImpersonated = beingImpersonated;
        this.exposedAreaGUID = exposedAreaGUID;
        this.x = x;
        this.y = y;
        this.z = z;
        this.anchorX = anchorX;
        this.anchorY = anchorY;
        this.lastX = lastX;
        this.lastY = lastY;
        this.name = name;
        this.ownerList = ownerList;
        this.charsheetImage = charsheetImage;
        this.portraitImage = portraitImage;
        this.imageAssetMap = imageAssetMap;
        this.pc = pc;
        this.isVisible = isVisible;
        
        this.state = new HashMap<>();
        this.properties = new HashMap<>();
        
        this.layer = layer;

        if(states != null)
	        for (Entry<String, Object> entry : states.entrySet()) {
				if(entry.getValue() == null){
					state.put(entry.getKey(), null);
				}else if(entry.getValue() instanceof Boolean){
					state.put(entry.getKey(), (Boolean)entry.getValue());
				}else{
					//cant parse, ignore
				}
			}
        if(propertyMapCI != null)
	        for (Entry<String, Object> entry : propertyMapCI.entrySet()) {
				if(entry.getValue() == null){
					properties.put(entry.getKey(), null);
				}else{
					properties.put(entry.getKey(), (String)entry.getValue());
				}
			}
    }
}
