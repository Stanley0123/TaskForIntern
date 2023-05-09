import java.util.Map;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyPredicate {
    public static Predicate<Map<String, Object>> columnOneToPredicate(String str) {
        Predicate<Map<String, Object>> predicate = null;
        String regex = "^\\s*\\Qcolumn[1]\\E";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            int startSign = matcher.end();
            String bufferString = str.substring(startSign, str.length());

            if (bufferString.matches("\\s*=\\s*(\\d+)\\s*")) {
                Pattern pattern2 = Pattern.compile("(\\d+)");
                Matcher matcher2 = pattern2.matcher(bufferString);
                if (matcher2.find()) {
                    int start = matcher2.start();
                    int finale = matcher2.end();
                    Integer substring = Integer.parseInt(bufferString.substring(start, finale));
                    predicate = x -> x.get("column[1]").equals(substring);
                }
            }
            else if (bufferString.matches("\\s*<>\\s*(\\d+)\\s*")) {
                Pattern pattern2 = Pattern.compile("(\\d+)");
                Matcher matcher2 = pattern2.matcher(bufferString);
                if (matcher2.find()) {
                    int start = matcher2.start();
                    int finale = matcher2.end();
                    Integer substring = Integer.parseInt(bufferString.substring(start, finale));
                    predicate = x -> !(x.get("column[1]").equals(substring));
                }
            }
            else if (bufferString.matches("\\s*>\\s*(\\d+)\\s*")) {
                Pattern pattern2 = Pattern.compile("(\\d+)");
                Matcher matcher2 = pattern2.matcher(bufferString);
                if (matcher2.find()) {
                    int start = matcher2.start();
                    int finale = matcher2.end();
                    Integer substring = Integer.parseInt(bufferString.substring(start, finale));
                    predicate = x -> ((Integer) x.get("column[1]")) > substring;
                }
            } else if (bufferString.matches("\\s*<\\s*(\\d+)\\s*")) {
                Pattern pattern2 = Pattern.compile("(\\d+)");
                Matcher matcher2 = pattern2.matcher(bufferString);
                if (matcher2.find()) {
                    int start = matcher2.start();
                    int finale = matcher2.end();
                    Integer substring = Integer.parseInt(bufferString.substring(start, finale));
                    predicate = x -> ((Integer) x.get("column[1]")) < substring;
                }
            }
        }
        return predicate;
    }
    public static Predicate<Map<String, Object>> columnThreeToPredicate(String str) {
        Predicate<Map<String, Object>> predicate = null;
        String regex = "^\\s*\\Qcolumn[3]\\E";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            int startSign = matcher.end();
            String bufferString = str.substring(startSign, str.length());
            if (bufferString.matches("\\s*=\\s*('.*')\\s*")) {
                Pattern pattern2 = Pattern.compile("'.*'");
                Matcher matcher2 = pattern2.matcher(bufferString);
                if (matcher2.find()) {
                    int start = matcher2.start();
                    int finale = matcher2.end();
                    String substring = bufferString.substring(start + 1, finale - 1);
                    predicate = x -> x.get("column[3]").equals(substring);
                }
            } else if (bufferString.matches("\\s*<>\\s*('.*')\\s*")) {
                Pattern pattern2 = Pattern.compile("'.*'");
                Matcher matcher2 = pattern2.matcher(bufferString);
                if (matcher2.find()) {
                    int start = matcher2.start();
                    int finale = matcher2.end();
                    String substring = bufferString.substring(start + 1, finale - 1);
                    predicate = x -> !(x.get("column[3]").equals(substring));
                }
            }
        }
        return predicate;
    }
    public static Predicate<Map<String, Object>> columnFourToPredicate(String str) {
        Predicate<Map<String, Object>> predicate = null;
        String regex = "^\\s*\\Qcolumn[4]\\E";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            int startSign = matcher.end();
            String bufferString = str.substring(startSign, str.length());
            if (bufferString.matches("\\s*=\\s*('.*')\\s*")) {
                Pattern pattern2 = Pattern.compile("'.*'");
                Matcher matcher2 = pattern2.matcher(bufferString);
                if (matcher2.find()) {
                    int start = matcher2.start();
                    int finale = matcher2.end();
                    String substring = bufferString.substring(start + 1, finale - 1);
                    predicate = x -> x.get("column[4]").equals(substring);
                }
            } else if (bufferString.matches("\\s*<>\\s*('.*')\\s*")) {
                Pattern pattern2 = Pattern.compile("'.*'");
                Matcher matcher2 = pattern2.matcher(bufferString);
                if (matcher2.find()) {
                    int start = matcher2.start();
                    int finale = matcher2.end();
                    String substring = bufferString.substring(start + 1, finale - 1);
                    predicate = x -> !(x.get("column[4]").equals(substring));
                }
            }
        }
        return predicate;
    }
    public static Predicate<Map<String, Object>> columnFiveToPredicate(String str) {
        Predicate<Map<String, Object>> predicate = null;
        String regex = "^\\s*\\Qcolumn[5]\\E";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            int startSign = matcher.end();
            String bufferString = str.substring(startSign, str.length());
            if (bufferString.matches("\\s*=\\s*('.*')\\s*")) {
                Pattern pattern2 = Pattern.compile("'.*'");
                Matcher matcher2 = pattern2.matcher(bufferString);
                if (matcher2.find()) {
                    int start = matcher2.start();
                    int finale = matcher2.end();
                    String substring = bufferString.substring(start + 1, finale - 1);
                    predicate = x -> x.get("column[5]").equals(substring);
                }
            } else if (bufferString.matches("\\s*<>\\s*('.*')\\s*")) {
                Pattern pattern2 = Pattern.compile("'.*'");
                Matcher matcher2 = pattern2.matcher(bufferString);
                if (matcher2.find()) {
                    int start = matcher2.start();
                    int finale = matcher2.end();
                    String substring = bufferString.substring(start + 1, finale - 1);
                    predicate = x -> !(x.get("column[5]").equals(substring));
                }
            }
        }
        return predicate;
    }
    public static Predicate<Map<String, Object>> columnSixToPredicate(String str) {
        Predicate<Map<String, Object>> predicate = null;
        String regex = "^\\s*\\Qcolumn[6]\\E";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            int startSign = matcher.end();
            String bufferString = str.substring(startSign, str.length());
            if (bufferString.matches("\\s*=\\s*('.*')\\s*")) {
                Pattern pattern2 = Pattern.compile("'.*'");
                Matcher matcher2 = pattern2.matcher(bufferString);
                if (matcher2.find()) {
                    int start = matcher2.start();
                    int finale = matcher2.end();
                    String substring = bufferString.substring(start + 1, finale - 1);
                    predicate = x -> x.get("column[6]").equals(substring);
                }
            } else if (bufferString.matches("\\s*<>\\s*('.*')\\s*")) {
                Pattern pattern2 = Pattern.compile("'.*'");
                Matcher matcher2 = pattern2.matcher(bufferString);
                if (matcher2.find()) {
                    int start = matcher2.start();
                    int finale = matcher2.end();
                    String substring = bufferString.substring(start + 1, finale - 1);
                    predicate = x -> !(x.get("column[6]").equals(substring));
                }
            }
        }
        return predicate;
    }
    public static Predicate<Map<String, Object>> columnSevenToPredicate(String str) {
        Predicate<Map<String, Object>> predicate = null;
        String regex = "^\\s*\\Qcolumn[7]\\E";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            int startSign = matcher.end();
            String bufferString = str.substring(startSign, str.length());
            if (bufferString.matches("\\s*=\\s*(-?\\d+[.]\\d+)\\s*")) {
                Pattern pattern2 = Pattern.compile("(-?\\d+[.]\\d+)");
                Matcher matcher2 = pattern2.matcher(bufferString);
                if (matcher2.find()) {
                    int start = matcher2.start();
                    int finale = matcher2.end();
                    Double substring = Double.parseDouble(bufferString.substring(start, finale));
                    predicate = x -> x.get("column[7]").equals(substring);
                }
            }
            else if (bufferString.matches("\\s*<>\\s*(-?\\d+[.]\\d+)\\s*")) {
                Pattern pattern2 = Pattern.compile("(-?\\d+[.]\\d+)");
                Matcher matcher2 = pattern2.matcher(bufferString);
                if (matcher2.find()) {
                    int start = matcher2.start();
                    int finale = matcher2.end();
                    Double substring = Double.parseDouble(bufferString.substring(start, finale));
                    predicate = x -> !(x.get("column[7]").equals(substring));
                }
            }
            else if (bufferString.matches("\\s*>\\s*(-?\\d+[.]\\d+)\\s*")) {
                Pattern pattern2 = Pattern.compile("(-?\\d+[.]\\d+)");
                Matcher matcher2 = pattern2.matcher(bufferString);
                if (matcher2.find()) {
                    int start = matcher2.start();
                    int finale = matcher2.end();
                    Double substring = Double.parseDouble(bufferString.substring(start, finale));
                    predicate = x -> ((Double) x.get("column[7]")) > substring;
                }
            } else if (bufferString.matches("\\s*<\\s*(-?\\d+[.]\\d+)\\s*")) {
                Pattern pattern2 = Pattern.compile("(-?\\d+[.]\\d+)");
                Matcher matcher2 = pattern2.matcher(bufferString);
                if (matcher2.find()) {
                    int start = matcher2.start();
                    int finale = matcher2.end();
                    Double substring = Double.parseDouble(bufferString.substring(start, finale));
                    predicate = x -> ((Double) x.get("column[7]")) < substring;
                }
            }
        }
        return predicate;
    }
    public static Predicate<Map<String, Object>> columnEightToPredicate(String str) {
        Predicate<Map<String, Object>> predicate = null;
        String regex = "^\\s*\\Qcolumn[8]\\E";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            int startSign = matcher.end();
            String bufferString = str.substring(startSign, str.length());
            if (bufferString.matches("\\s*=\\s*(-?\\d+[.]\\d+)\\s*")) {
                Pattern pattern2 = Pattern.compile("(-?\\d+[.]\\d+)");
                Matcher matcher2 = pattern2.matcher(bufferString);
                if (matcher2.find()) {
                    int start = matcher2.start();
                    int finale = matcher2.end();
                    Double substring = Double.parseDouble(bufferString.substring(start, finale));
                    predicate = x -> x.get("column[8]").equals(substring);
                }
            }
            else if (bufferString.matches("\\s*<>\\s*(-?\\d+[.]\\d+)\\s*")) {
                Pattern pattern2 = Pattern.compile("(-?\\d+[.]\\d+)");
                Matcher matcher2 = pattern2.matcher(bufferString);
                if (matcher2.find()) {
                    int start = matcher2.start();
                    int finale = matcher2.end();
                    Double substring = Double.parseDouble(bufferString.substring(start, finale));
                    predicate = x -> !(x.get("column[8]").equals(substring));
                }
            }
            else if (bufferString.matches("\\s*>\\s*(-?\\d+[.]\\d+)\\s*")) {
                Pattern pattern2 = Pattern.compile("(-?\\d+[.]\\d+)");
                Matcher matcher2 = pattern2.matcher(bufferString);
                if (matcher2.find()) {
                    int start = matcher2.start();
                    int finale = matcher2.end();
                    Double substring = Double.parseDouble(bufferString.substring(start, finale));
                    predicate = x -> ((Double) x.get("column[8]")) > substring;
                }
            } else if (bufferString.matches("\\s*<\\s*(-?\\d+[.]\\d+)\\s*")) {
                Pattern pattern2 = Pattern.compile("(-?\\d+[.]\\d+)");
                Matcher matcher2 = pattern2.matcher(bufferString);
                if (matcher2.find()) {
                    int start = matcher2.start();
                    int finale = matcher2.end();
                    Double substring = Double.parseDouble(bufferString.substring(start, finale));
                    predicate = x -> ((Double) x.get("column[8]")) < substring;
                }
            }
        }
        return predicate;
    }
    public static Predicate<Map<String, Object>> columnNineToPredicate(String str) {
        Predicate<Map<String, Object>> predicate = null;
        String regex = "^\\s*\\Qcolumn[9]\\E";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            int startSign = matcher.end();
            String bufferString = str.substring(startSign, str.length());

            if (bufferString.matches("\\s*=\\s*(-?\\d+)\\s*")) {
                Pattern pattern2 = Pattern.compile("(-?\\d+)");
                Matcher matcher2 = pattern2.matcher(bufferString);
                if (matcher2.find()) {
                    int start = matcher2.start();
                    int finale = matcher2.end();
                    Integer substring = Integer.parseInt(bufferString.substring(start, finale));
                    predicate = x -> x.get("column[9]").equals(substring);
                }
            }
            else if (bufferString.matches("\\s*<>\\s*(-?\\d+)\\s*")) {
                Pattern pattern2 = Pattern.compile("(-?\\d+)");
                Matcher matcher2 = pattern2.matcher(bufferString);
                if (matcher2.find()) {
                    int start = matcher2.start();
                    int finale = matcher2.end();
                    Integer substring = Integer.parseInt(bufferString.substring(start, finale));
                    predicate = x -> !(x.get("column[9]").equals(substring));
                }
            }
            else if (bufferString.matches("\\s*>\\s*(-?\\d+)\\s*")) {
                Pattern pattern2 = Pattern.compile("(-?\\d+)");
                Matcher matcher2 = pattern2.matcher(bufferString);
                if (matcher2.find()) {
                    int start = matcher2.start();
                    int finale = matcher2.end();
                    Integer substring = Integer.parseInt(bufferString.substring(start, finale));
                    predicate = x -> ((Integer) x.get("column[9]")) > substring;
                }
            } else if (bufferString.matches("\\s*<\\s*(-?\\d+)\\s*")) {
                Pattern pattern2 = Pattern.compile("(-?\\d+)");
                Matcher matcher2 = pattern2.matcher(bufferString);
                if (matcher2.find()) {
                    int start = matcher2.start();
                    int finale = matcher2.end();
                    Integer substring = Integer.parseInt(bufferString.substring(start, finale));
                    predicate = x -> ((Integer) x.get("column[9]")) < substring;
                }
            }
        }
        return predicate;
    }
    public static Predicate<Map<String, Object>> columnTenToPredicate(String str) {
        String NWord = "\\s*\\b\\\\N\\b\\s*";
        Predicate<Map<String, Object>> predicate = null;
        String regex = "^\\s*\\Qcolumn[10]\\E";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            int startSign = matcher.end();
            String bufferString = str.substring(startSign, str.length());
            if (bufferString.matches("\\s*=\\s*(-?\\d+([.]\\d+)?|\\\\N)\\s*")) {
                if (Pattern.compile(NWord).matcher(bufferString).find()) {
                    predicate = x -> x.get("column[10]") == null;
                } else {
                    Pattern pattern2 = Pattern.compile("(-?\\d+([.]\\d+)?)");
                    Matcher matcher2 = pattern2.matcher(bufferString);
                    if (matcher2.find()) {
                        int start = matcher2.start();
                        int finale = matcher2.end();
                        Double substring = Double.parseDouble(bufferString.substring(start, finale));
                        predicate = x -> {
                            boolean flag = false;
                            if (x.get("column[10]") != null) {
                                flag = x.get("column[10]").equals(substring);
                            }
                            return flag;
                        };
                    }
                }
            } else if (bufferString.matches("\\s*<>\\s*(-?\\d+([.]\\d+)?|\\\\N)\\s*")) {
                if (Pattern.compile(NWord).matcher(bufferString).find()) {
                    predicate = x -> x.get("column[10]") != null;
                } else {
                    Pattern pattern2 = Pattern.compile("(-?\\d+([.]\\d+)?)");
                    Matcher matcher2 = pattern2.matcher(bufferString);
                    if (matcher2.find()) {
                        int start = matcher2.start();
                        int finale = matcher2.end();
                        Double substring = Double.parseDouble(bufferString.substring(start, finale));
                        predicate = x -> {
                            boolean flag = true;
                            if (x.get("column[10]") != null) {
                                flag = !(x.get("column[10]").equals(substring));
                            }
                            return flag;
                        };
                    }
                }
            } else if (bufferString.matches("\\s*>\\s*(-?\\d+([.]\\d+)?)\\s*")) {
                Pattern pattern2 = Pattern.compile("(-?\\d+([.]\\d+)?)");
                Matcher matcher2 = pattern2.matcher(bufferString);
                if (matcher2.find()) {
                    int start = matcher2.start();
                    int finale = matcher2.end();
                    Double substring = Double.parseDouble(bufferString.substring(start, finale));
                    predicate = x -> {
                        boolean flag = false;
                        if (x.get("column[10]") != null) {
                            flag = ((Double) x.get("column[10]")) > substring;
                        }
                        return flag;
                    };
                }
            } else if (bufferString.matches("\\s*<\\s*(-?\\d+([.]\\d+)?)\\s*")) {
                Pattern pattern2 = Pattern.compile("(-?\\d+([.]\\d+)?)");
                Matcher matcher2 = pattern2.matcher(bufferString);
                if (matcher2.find()) {
                    int start = matcher2.start();
                    int finale = matcher2.end();
                    Double substring = Double.parseDouble(bufferString.substring(start, finale));
                    predicate = x -> {
                        boolean flag = false;
                        if (x.get("column[10]") != null) {
                            flag = ((Double) x.get("column[10]")) < substring;
                        }
                        return flag;
                    };
                }
            }
        }
        return predicate;
    }
    public static Predicate<Map<String, Object>> columnElevenToPredicate(String str) {
        Predicate<Map<String, Object>> predicate = null;
        String regex = "^\\s*\\Qcolumn[11]\\E";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            int startSign = matcher.end();
            String bufferString = str.substring(startSign, str.length());
            if (bufferString.matches("\\s*=\\s*('.*')\\s*")) {
                Pattern pattern2 = Pattern.compile("'.*'");
                Matcher matcher2 = pattern2.matcher(bufferString);
                if (matcher2.find()) {
                    int start = matcher2.start();
                    int finale = matcher2.end();
                    String substring = bufferString.substring(start + 1, finale - 1);
                    predicate = x -> x.get("column[11]").equals(substring);
                }
            } else if (bufferString.matches("\\s*<>\\s*('.*')\\s*")) {
                Pattern pattern2 = Pattern.compile("'.*'");
                Matcher matcher2 = pattern2.matcher(bufferString);
                if (matcher2.find()) {
                    int start = matcher2.start();
                    int finale = matcher2.end();
                    String substring = bufferString.substring(start + 1, finale - 1);
                    predicate = x -> !(x.get("column[11]").equals(substring));
                }
            }
        }
        return predicate;
    }
    public static Predicate<Map<String, Object>> columnTwelveToPredicate(String str) {
        Predicate<Map<String, Object>> predicate = null;
        String regex = "^\\s*\\Qcolumn[12]\\E";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            int startSign = matcher.end();
            String bufferString = str.substring(startSign, str.length());
            if (bufferString.matches("\\s*=\\s*('.*')\\s*")) {
                Pattern pattern2 = Pattern.compile("'.*'");
                Matcher matcher2 = pattern2.matcher(bufferString);
                if (matcher2.find()) {
                    int start = matcher2.start();
                    int finale = matcher2.end();
                    String substring = bufferString.substring(start + 1, finale - 1);
                    predicate = x -> x.get("column[12]").equals(substring);
                }
            } else if (bufferString.matches("\\s*<>\\s*('.*')\\s*")) {
                Pattern pattern2 = Pattern.compile("'.*'");
                Matcher matcher2 = pattern2.matcher(bufferString);
                if (matcher2.find()) {
                    int start = matcher2.start();
                    int finale = matcher2.end();
                    String substring = bufferString.substring(start + 1, finale - 1);
                    predicate = x -> !(x.get("column[12]").equals(substring));
                }
            }
        }
        return predicate;
    }
    public static Predicate<Map<String, Object>> columnThirteenToPredicate(String str) {
        Predicate<Map<String, Object>> predicate = null;
        String regex = "^\\s*\\Qcolumn[13]\\E";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            int startSign = matcher.end();
            String bufferString = str.substring(startSign, str.length());
            if (bufferString.matches("\\s*=\\s*('.*')\\s*")) {
                Pattern pattern2 = Pattern.compile("'.*'");
                Matcher matcher2 = pattern2.matcher(bufferString);
                if (matcher2.find()) {
                    int start = matcher2.start();
                    int finale = matcher2.end();
                    String substring = bufferString.substring(start + 1, finale - 1);
                    predicate = x -> x.get("column[13]").equals(substring);
                }
            } else if (bufferString.matches("\\s*<>\\s*('.*')\\s*")) {
                Pattern pattern2 = Pattern.compile("'.*'");
                Matcher matcher2 = pattern2.matcher(bufferString);
                if (matcher2.find()) {
                    int start = matcher2.start();
                    int finale = matcher2.end();
                    String substring = bufferString.substring(start + 1, finale - 1);
                    predicate = x -> !(x.get("column[13]").equals(substring));
                }
            }
        }
        return predicate;
    }
    public static Predicate<Map<String, Object>> columnFourteenToPredicate(String str) {
        Predicate<Map<String, Object>> predicate = null;
        String regex = "^\\s*\\Qcolumn[14]\\E";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            int startSign = matcher.end();
            String bufferString = str.substring(startSign, str.length());
            if (bufferString.matches("\\s*=\\s*('.*')\\s*")) {
                Pattern pattern2 = Pattern.compile("'.*'");
                Matcher matcher2 = pattern2.matcher(bufferString);
                if (matcher2.find()) {
                    int start = matcher2.start();
                    int finale = matcher2.end();
                    String substring = bufferString.substring(start + 1, finale - 1);
                    predicate = x -> x.get("column[14]").equals(substring);
                }
            } else if (bufferString.matches("\\s*<>\\s*('.*')\\s*")) {
                Pattern pattern2 = Pattern.compile("'.*'");
                Matcher matcher2 = pattern2.matcher(bufferString);
                if (matcher2.find()) {
                    int start = matcher2.start();
                    int finale = matcher2.end();
                    String substring = bufferString.substring(start + 1, finale - 1);
                    predicate = x -> !(x.get("column[14]").equals(substring));
                }
            }
        }
        return predicate;
    }
}
