package net.sf.kerner.utils;

import java.util.Properties;

public class ExceptionIllegalArgument extends RuntimeExceptionProperty {

    private static final long serialVersionUID = -209264429262542218L;

    public ExceptionIllegalArgument() {
        super();

    }

    public ExceptionIllegalArgument(final Properties pro) {
        super(pro);

    }

    public ExceptionIllegalArgument(final String arg0) {
        super(arg0);

    }

    public ExceptionIllegalArgument(final String arg0, final Properties pro) {
        super(arg0, pro);

    }

    public ExceptionIllegalArgument(final String arg0, final Throwable arg1) {
        super(arg0, arg1);

    }

    public ExceptionIllegalArgument(final String arg0, final Throwable arg1, final Properties pro) {
        super(arg0, arg1, pro);

    }

    public ExceptionIllegalArgument(final Throwable arg0) {
        super(arg0);

    }

    public ExceptionIllegalArgument(final Throwable arg0, final Properties pro) {
        super(arg0, pro);

    }

}
