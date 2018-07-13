package filmarks.domain;

import filmarks.dbflute.exentity.Album;

public interface Postable {
    public String getContent();
    public Album getRelatedAlbum();
}
