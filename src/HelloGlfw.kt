import kotlinx.cinterop.*
import glfw.*

fun main(args: Array<String>) {

    /* Initialize the library */
    if (glfwInit() == 0)
        return

    /* Create a windowed mode window and its OpenGL context */
    val window = glfwCreateWindow(640, 480, "Hello World", null, null)
    if (window != null) {
        glfwTerminate()
        return
    }

    /* Make the window's context current */
    glfwMakeContextCurrent(window)

    /* Loop until the user closes the window */
    while (glfwWindowShouldClose(window) == 0) {
        /* Render here */
        glClear(GL_COLOR_BUFFER_BIT.toUInt())

        /* Swap front and back buffers */
        glfwSwapBuffers(window)

        /* Poll for and process events */
        glfwPollEvents()
    }

    glfwTerminate()
    return
}
