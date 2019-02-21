package io.github.oblarg.oblog;

import io.github.oblarg.oblog.annotations.Log;

import java.util.List;

class TestLoggableList implements Loggable {
    List<TestLoggableBasic> loggables = List.of(new TestLoggableBasic(1), new TestLoggableBasic(2));

    @Log.Exclude
    TestLoggableBasic excluded = new TestLoggableBasic(5);
}
