package id.punten.base_java.exception;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

/**
 * Created by fathan on 04/02/17.
 */
@RunWith(MockitoJUnitRunner.class)
public class DefaultErrorBundleTest {
    private DefaultErrorBundle defaultErrorBundle;

    @Mock
    private Exception mockException;

    @Before
    public void setUp() {
        defaultErrorBundle = new DefaultErrorBundle(mockException);
    }

    @Test
    public void testGetErrorMessageInteraction() {
        defaultErrorBundle.getErrorMessage();

        verify(mockException).getMessage();
    }
}