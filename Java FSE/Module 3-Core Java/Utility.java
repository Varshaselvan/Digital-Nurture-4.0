/ Module: com.utils
module com.utils {
    exports com.utils;
}

// Utility class in com.utils
package com.utils;

public class Utility {
    public static String getMessage() {
        return "Hello from Utility!";
    }
}

// Module: com.greetings
module com.greetings {
    requires com.utils;
}

// Greetings class in com.greetings
package com.greetings;

import com.utils.Utility;

public class Greetings {
    public static void main(String[] args) {
        System.out.println(Utility.getMessage());
    }
}