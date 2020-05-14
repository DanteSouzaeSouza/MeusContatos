package br.com.theoldpinkeye.meuscontatos.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;


public class Contato implements Parcelable
{

  private String avatar;
  private String largeAvatar;
  private String birthday;
  private String checksum;
  private String city;
  private List<ContactEntry> contactEntries = null;
  private String contactId;
  private String country;
  private String countryCode;
  private String displayName;
  private String fname;
  private String lname;
  private String notes;
  private String state;
  private String street;
  private String zip;
  public final static Parcelable.Creator<Contato> CREATOR = new Creator<Contato>() {


    @SuppressWarnings({
        "unchecked"
    })
    public Contato createFromParcel(Parcel in) {
      return new Contato(in);
    }

    public Contato[] newArray(int size) {
      return (new Contato[size]);
    }

  }
      ;

  protected Contato(Parcel in) {
    this.avatar = ((String) in.readValue((String.class.getClassLoader())));
    this.largeAvatar = ((String) in.readValue((String.class.getClassLoader())));
    this.birthday = ((String) in.readValue((String.class.getClassLoader())));
    this.checksum = ((String) in.readValue((String.class.getClassLoader())));
    this.city = ((String) in.readValue((String.class.getClassLoader())));
    in.readList(this.contactEntries, (br.com.theoldpinkeye.meuscontatos.models.ContactEntry.class.getClassLoader()));
    this.contactId = ((String) in.readValue((String.class.getClassLoader())));
    this.country = ((String) in.readValue((String.class.getClassLoader())));
    this.countryCode = ((String) in.readValue((String.class.getClassLoader())));
    this.displayName = ((String) in.readValue((String.class.getClassLoader())));
    this.fname = ((String) in.readValue((String.class.getClassLoader())));
    this.lname = ((String) in.readValue((String.class.getClassLoader())));
    this.notes = ((String) in.readValue((String.class.getClassLoader())));
    this.state = ((String) in.readValue((String.class.getClassLoader())));
    this.street = ((String) in.readValue((String.class.getClassLoader())));
    this.zip = ((String) in.readValue((String.class.getClassLoader())));
  }

  /**
   * No args constructor for use in serialization
   *
   */
  public Contato() {
  }

  /**
   *
   * @param birthday
   * @param zip
   * @param country
   * @param fname
   * @param notes
   * @param city
   * @param contactId
   * @param displayName
   * @param contactEntries
   * @param avatar
   * @param lname
   * @param countryCode
   * @param street
   * @param checksum
   * @param largeAvatar
   * @param state
   */
  public Contato(String avatar, String largeAvatar, String birthday, String checksum, String city, List<ContactEntry> contactEntries, String contactId, String country, String countryCode, String displayName, String fname, String lname, String notes, String state, String street, String zip) {
    super();
    this.avatar = avatar;
    this.largeAvatar = largeAvatar;
    this.birthday = birthday;
    this.checksum = checksum;
    this.city = city;
    this.contactEntries = contactEntries;
    this.contactId = contactId;
    this.country = country;
    this.countryCode = countryCode;
    this.displayName = displayName;
    this.fname = fname;
    this.lname = lname;
    this.notes = notes;
    this.state = state;
    this.street = street;
    this.zip = zip;
  }

  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public String getLargeAvatar() {
    return largeAvatar;
  }

  public void setLargeAvatar(String largeAvatar) {
    this.largeAvatar = largeAvatar;
  }

  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }

  public String getChecksum() {
    return checksum;
  }

  public void setChecksum(String checksum) {
    this.checksum = checksum;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public List<ContactEntry> getContactEntries() {
    return contactEntries;
  }

  public void setContactEntries(List<ContactEntry> contactEntries) {
    this.contactEntries = contactEntries;
  }

  public String getContactId() {
    return contactId;
  }

  public void setContactId(String contactId) {
    this.contactId = contactId;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public String getFname() {
    return fname;
  }

  public void setFname(String fname) {
    this.fname = fname;
  }

  public String getLname() {
    return lname;
  }

  public void setLname(String lname) {
    this.lname = lname;
  }

  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this).append("avatar", avatar).append("largeAvatar", largeAvatar).append("birthday", birthday).append("checksum", checksum).append("city", city).append("contactEntries", contactEntries).append("contactId", contactId).append("country", country).append("countryCode", countryCode).append("displayName", displayName).append("fname", fname).append("lname", lname).append("notes", notes).append("state", state).append("street", street).append("zip", zip).toString();
  }

  public void writeToParcel(Parcel dest, int flags) {
    dest.writeValue(avatar);
    dest.writeValue(largeAvatar);
    dest.writeValue(birthday);
    dest.writeValue(checksum);
    dest.writeValue(city);
    dest.writeList(contactEntries);
    dest.writeValue(contactId);
    dest.writeValue(country);
    dest.writeValue(countryCode);
    dest.writeValue(displayName);
    dest.writeValue(fname);
    dest.writeValue(lname);
    dest.writeValue(notes);
    dest.writeValue(state);
    dest.writeValue(street);
    dest.writeValue(zip);
  }

  public int describeContents() {
    return 0;
  }

}