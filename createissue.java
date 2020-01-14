
//usr/bin/env jbang "$0" "$@" ; exit $?
//DEPS org.kohsuke:github-api:1.101
import static java.lang.System.*;

import java.util.Arrays;

import org.kohsuke.github.*;

public class createissue {

    public static void main(String... args) throws Exception {
        // If you don't specify the GitHub user id then the sdk will retrieve it via /user endpoint
        
        GitHub github = new GitHubBuilder().withOAuthToken(getenv("GITHUB_TOKEN")).build();

        var repo = github.getRepository(getenv("GITHUB_REPOSITORY"));

        var message = "Test message with home set to " + getProperty("user.home");
        message = message + "\n" + Arrays.toString(args); 
        var x = repo.createIssue("Testing create issue from jbang").body(message).create();
        out.println(x.getHtmlUrl());

    }
}
