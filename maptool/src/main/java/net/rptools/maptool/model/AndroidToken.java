package net.rptools.maptool.model;

import java.util.Set;

/**
 * Created by me on 01.03.2017.
 */
public class AndroidToken {
    public final GUID id;
    public final boolean beingImpersonated ;
    public final GUID exposedAreaGUID;




    public final int x;
    public final int y;
    public final int z;

    public final int anchorX;
    public final int anchorY;

    public final double sizeScale = 1;

    public final int lastX;
    public final int lastY;
    public final Path<? extends AbstractPoint> lastPath;



    public final boolean isVisible = true;
    public final boolean visibleOnlyToOwner = false;

    public final String name;
    public final Set<String> ownerList;

    public AndroidToken(GUID id, boolean beingImpersonated, GUID exposedAreaGUID, int x, int y, int z, int anchorX, int anchorY, int lastX, int lastY, Path<? extends AbstractPoint> lastPath, String name, Set<String> ownerList) {
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
        this.lastPath = lastPath;
        this.name = name;
        this.ownerList = ownerList;
    }
}
