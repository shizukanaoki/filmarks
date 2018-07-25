package filmarks.domain;

import filmarks.dbflute.exentity.Album;

/**
 * timelineに表示する要素が実装するインターフェース
 *
 * @author naoki.shizuka
 */
public interface Postable {
    public String getDescription();
    public String getContent();
    public Album getRelatedAlbum();
}
