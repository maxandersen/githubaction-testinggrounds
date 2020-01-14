//usr/bin/env jbang "$0" "$@" ; exit $?
//DEPS org.kohsuke:github-api:jar:1.101

import static java.lang.System.*;

public class createissue {

    public static void main(String... args) {
        out.println("Hello World");
        out.println(getenv().getOrDefault("GITHUB_TOKEN", "token empty"));
    }
}
