package spittr.entity;

import java.io.Serializable;
import java.util.Date;




public class Spittle implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String message;
    private Date time;

    private Double latitude;
    private Double longitude;

    //TODO can setup relationship
    private Spitter spitter;

    public Spittle() {
    }

    public Spittle(String message, Date time) {
        this(null, message, time, null, null);
    }

    //TODO can remove id
    public Spittle(Long id, String message, Date time, Double longitude, Double latitude) {
        this.id = id;
        this.message = message;
        this.time = time;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Spittle(Long id, String message, Date time, Double longitude, Double latitude, Spitter spitter) {
        this.id = id;
        this.message = message;
        this.time = time;
        this.longitude = longitude;
        this.latitude = latitude;
        this.spitter = spitter;
    }

    public Spitter getSpitter() {
        return spitter;
    }

    public void setSpitter(Spitter spitter) {
        this.spitter = spitter;
    }

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Date getTime() {
        return time;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Double getLatitude() {
        return latitude;
    }


/*  public void setId(Long id) {
    this.id = id;
  }*/

    public void setMessage(String message) {
        this.message = message;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }


}
