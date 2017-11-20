package com.redhat;

import java.util.ArrayList;
import java.util.List;

public class Server
{
    private String url;

    public Server(String url) {
        this.url = url;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public static void main(String[] args)
    {
        List<Server> listServers = new ArrayList<Server>();
        listServers.add(new Server("www.google.com"));
        listServers.add(new Server("www.seznam.cz"));
        listServers.add(new Server("www.howtofixit.com"));

        listServers.forEach(s -> System.out.println(s.toString()));

    }

    @Override
    public String toString() {
        return "Server{" +
                "url='" + url + '\'' +
                '}';
    }
}
