package br.com.theoldpinkeye.meuscontatos.models;

import android.os.Parcel;
import android.os.Parcelable;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class ContactEntry implements Parcelable
{

  private String entryId;
  private String label;
  private String type;
  private String uri;
  public final static Parcelable.Creator<ContactEntry> CREATOR = new Creator<ContactEntry>() {


    @SuppressWarnings({
        "unchecked"
    })
    public ContactEntry createFromParcel(Parcel in) {
      return new ContactEntry(in);
    }

    public ContactEntry[] newArray(int size) {
      return (new ContactEntry[size]);
    }

  }
      ;

  protected ContactEntry(Parcel in) {
    this.entryId = ((String) in.readValue((String.class.getClassLoader())));
    this.label = ((String) in.readValue((String.class.getClassLoader())));
    this.type = ((String) in.readValue((String.class.getClassLoader())));
    this.uri = ((String) in.readValue((String.class.getClassLoader())));
  }

  /**
   * No args constructor for use in serialization
   *
   */
  public ContactEntry() {
  }

  /**
   *
   * @param label
   * @param type
   * @param uri
   * @param entryId
   */
  public ContactEntry(String entryId, String label, String type, String uri) {
    super();
    this.entryId = entryId;
    this.label = label;
    this.type = type;
    this.uri = uri;
  }

  public String getEntryId() {
    return entryId;
  }

  public void setEntryId(String entryId) {
    this.entryId = entryId;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this).append("entryId", entryId).append("label", label).append("type", type).append("uri", uri).toString();
  }

  public void writeToParcel(Parcel dest, int flags) {
    dest.writeValue(entryId);
    dest.writeValue(label);
    dest.writeValue(type);
    dest.writeValue(uri);
  }

  public int describeContents() {
    return 0;
  }

}