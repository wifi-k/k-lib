package tbcloud.lib.api.msg;

import java.util.Arrays;
import java.util.List;

/**
 * @author dzh
 * @date 2018-12-28 16:17
 */
public class DeleteQiniuObject {

    private String id; // qiniu config id
    private List<String> key; // object key

    public static final DeleteQiniuObject create(String id, String... key) {
        DeleteQiniuObject deleteQiniuObject = new DeleteQiniuObject();
        deleteQiniuObject.setId(id);
        if (key != null) deleteQiniuObject.setKey(Arrays.asList(key));
        return deleteQiniuObject;
    }

    public static final DeleteQiniuObject create(String id, List<String> key) {
        DeleteQiniuObject deleteQiniuObject = new DeleteQiniuObject();
        deleteQiniuObject.setId(id);
        deleteQiniuObject.setKey(key);
        return deleteQiniuObject;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getKey() {
        return key;
    }

    public void setKey(List<String> key) {
        this.key = key;
    }
}
