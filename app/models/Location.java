package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Location {

    private String ip;
    private String hostname;

    public Location(String ip, String hostname) {
        this.ip = ip;
        this.hostname = hostname;
    }

    @JsonProperty
    public String getIp() {
        return ip;
    }

    @JsonProperty
    public String getHostname() {
        return hostname;
    }

}
