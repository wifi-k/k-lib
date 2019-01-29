package tbcloud.elastic.model;

/**
 * @author dzh
 * @version 0.0.1
 * @date May 18, 2018 11:13:34 AM
 */
public class ESDocAsUpsert extends ESObject {

    public static final ESDocAsUpsert create(Object doc) {
        ESDocAsUpsert upsert = new ESDocAsUpsert();
        upsert.setDoc(doc).setDoc_as_upsert(true);
        return upsert;
    }

    private Object doc;

    private boolean doc_as_upsert;

    public Object getDoc() {
        return doc;
    }

    public ESDocAsUpsert setDoc(Object doc) {
        this.doc = doc;
        return this;
    }

    public boolean isDoc_as_upsert() {
        return doc_as_upsert;
    }

    public ESDocAsUpsert setDoc_as_upsert(boolean doc_as_upsert) {
        this.doc_as_upsert = doc_as_upsert;
        return this;
    }

}
