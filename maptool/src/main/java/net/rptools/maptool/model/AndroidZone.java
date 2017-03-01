package net.rptools.maptool.model;


import java.util.HashMap;
import java.util.Map;

public class AndroidZone {
    private GUID id = new GUID();
    private int gridOffsetX = 0;
    private int gridoffsetY = 0;
    private int gridSize;

    private final Map<GUID, Token> tokenMap;

    private String name;
    private boolean isVisible;

    public AndroidZone(GUID id, int gridOffsetX, int gridoffsetY, int gridSize,
                       Map<GUID, Token> tokenMap, String name, boolean isVisible) {
        this.id = id;
        this.gridOffsetX = gridOffsetX;
        this.gridoffsetY = gridoffsetY;
        this.gridSize = gridSize;
        this.name = name;
        this.isVisible = isVisible;
        this.tokenMap = tokenMap;
    }
}
