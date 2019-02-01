package com.github.openshift.circe.yaml;

public class TestClasses {

    public static interface I {
        public String getSomeIValue();
    }

    public static class Z {

        public int getZVal() {
            return 6;
        }
        protected boolean getZBool() {
            return false;
        }
        public String getZSimpleString() {
            return "Z: this is a simple String";
        }

        public String getZComplexString() {
            return "   <]Z: this is a \"complex\" String\nwith multiple\nlines and\n     <]preceding space and\na line with only space and ended by newline\n   \n";
        }

        public YamlProvider getFreeFormPrimitive() {
            return new YamlProvider() {
                @Override
                public String toYaml() {
                    return "5";
                }
            };
        }

        public YamlProvider getFreeFormList() {
            return new YamlProvider() {
                @Override
                public String toYaml() {
                    return "- 1\n- 2\n- 3\n";
                }
            };
        }

        public I getThisWouldBeI() {
            return (I)YamlProvider.buildFor("somethingCompletelyDifferent: 3", I.class);
        }


    }


    public static class Y {

        public int getYVal() {
            return 5;
        }
        public boolean getYBool() {
            return true;
        }
        public String getYSimpleString() {
            return "Y: this is a simple String";
        }

        public Z getZ() {
            return new Z();
        }

    }

    public static class R {
        public int getRVal() {
            return 50;
        }
    }

    public static class X extends Z {

        public int getVal() {
            return 5;
        }

        public R getR() {
            return new R();
        }

        public boolean getBool() {
            return true;
        }

        public String getSimpleString() {
            return "X: this is a simple String";
        }

        public Y getY() {
            return new Y();
        }

        public int[] getXInts() {
            return new int[]{ 1, 2, 3, 4, 5 };
        }

        public Y[] getYs() {
            return new Y[]{ new Y(), new Y() };
        }

        public Z[] getZs() {
            return new Z[]{ new Z(), new Z() };
        }

        @YamlLiteralNullValue
        public String getThisShouldBeNull() {
            throw new UnsupportedOperationException();
        }

    }

}