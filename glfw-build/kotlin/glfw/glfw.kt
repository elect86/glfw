@file:kotlinx.cinterop.InteropStubs
@file:Suppress("UNUSED_VARIABLE", "UNUSED_EXPRESSION")
package glfw

import kotlin.native.SymbolName
import kotlinx.cinterop.*
import cnames.structs.GLFWcursor
import cnames.structs.GLFWmonitor
import cnames.structs.GLFWwindow
import cnames.structs.__GLsync
import cnames.structs._cl_context
import cnames.structs._cl_event
import platform.posix.ptrdiff_t

// NOTE THIS FILE IS AUTO-GENERATED

fun glClearIndex(c: GLfloat): Unit {
    return kniBridge0(c)
}

fun glClearColor(red: GLclampf, green: GLclampf, blue: GLclampf, alpha: GLclampf): Unit {
    return kniBridge1(red, green, blue, alpha)
}

fun glClear(mask: GLbitfield): Unit {
    return kniBridge2(mask)
}

fun glIndexMask(mask: GLuint): Unit {
    return kniBridge3(mask)
}

fun glColorMask(red: GLboolean, green: GLboolean, blue: GLboolean, alpha: GLboolean): Unit {
    return kniBridge4(red, green, blue, alpha)
}

fun glAlphaFunc(func: GLenum, ref: GLclampf): Unit {
    return kniBridge5(func, ref)
}

fun glBlendFunc(sfactor: GLenum, dfactor: GLenum): Unit {
    return kniBridge6(sfactor, dfactor)
}

fun glLogicOp(opcode: GLenum): Unit {
    return kniBridge7(opcode)
}

fun glCullFace(mode: GLenum): Unit {
    return kniBridge8(mode)
}

fun glFrontFace(mode: GLenum): Unit {
    return kniBridge9(mode)
}

fun glPointSize(size: GLfloat): Unit {
    return kniBridge10(size)
}

fun glLineWidth(width: GLfloat): Unit {
    return kniBridge11(width)
}

fun glLineStipple(factor: GLint, pattern: GLushort): Unit {
    return kniBridge12(factor, pattern)
}

fun glPolygonMode(face: GLenum, mode: GLenum): Unit {
    return kniBridge13(face, mode)
}

fun glPolygonOffset(factor: GLfloat, units: GLfloat): Unit {
    return kniBridge14(factor, units)
}

fun glPolygonStipple(mask: CValuesRef<GLubyteVar>?): Unit {
    memScoped {
        return kniBridge15(mask?.getPointer(memScope).rawValue)
    }
}

fun glGetPolygonStipple(mask: CValuesRef<GLubyteVar>?): Unit {
    memScoped {
        return kniBridge16(mask?.getPointer(memScope).rawValue)
    }
}

fun glEdgeFlag(flag: GLboolean): Unit {
    return kniBridge17(flag)
}

fun glEdgeFlagv(flag: CValuesRef<GLbooleanVar>?): Unit {
    memScoped {
        return kniBridge18(flag?.getPointer(memScope).rawValue)
    }
}

fun glScissor(x: GLint, y: GLint, width: GLsizei, height: GLsizei): Unit {
    return kniBridge19(x, y, width, height)
}

fun glClipPlane(plane: GLenum, equation: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge20(plane, equation?.getPointer(memScope).rawValue)
    }
}

fun glGetClipPlane(plane: GLenum, equation: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge21(plane, equation?.getPointer(memScope).rawValue)
    }
}

fun glDrawBuffer(mode: GLenum): Unit {
    return kniBridge22(mode)
}

fun glReadBuffer(mode: GLenum): Unit {
    return kniBridge23(mode)
}

fun glEnable(cap: GLenum): Unit {
    return kniBridge24(cap)
}

fun glDisable(cap: GLenum): Unit {
    return kniBridge25(cap)
}

fun glIsEnabled(cap: GLenum): GLboolean {
    return kniBridge26(cap)
}

fun glEnableClientState(cap: GLenum): Unit {
    return kniBridge27(cap)
}

fun glDisableClientState(cap: GLenum): Unit {
    return kniBridge28(cap)
}

fun glGetBooleanv(pname: GLenum, params: CValuesRef<GLbooleanVar>?): Unit {
    memScoped {
        return kniBridge29(pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGetDoublev(pname: GLenum, params: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge30(pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGetFloatv(pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge31(pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGetIntegerv(pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge32(pname, params?.getPointer(memScope).rawValue)
    }
}

fun glPushAttrib(mask: GLbitfield): Unit {
    return kniBridge33(mask)
}

fun glPopAttrib(): Unit {
    return kniBridge34()
}

fun glPushClientAttrib(mask: GLbitfield): Unit {
    return kniBridge35(mask)
}

fun glPopClientAttrib(): Unit {
    return kniBridge36()
}

fun glRenderMode(mode: GLenum): GLint {
    return kniBridge37(mode)
}

fun glGetError(): GLenum {
    return kniBridge38()
}

fun glGetString(name: GLenum): CPointer<GLubyteVar>? {
    return interpretCPointer<GLubyteVar>(kniBridge39(name))
}

fun glFinish(): Unit {
    return kniBridge40()
}

fun glFlush(): Unit {
    return kniBridge41()
}

fun glHint(target: GLenum, mode: GLenum): Unit {
    return kniBridge42(target, mode)
}

fun glClearDepth(depth: GLclampd): Unit {
    return kniBridge43(depth)
}

fun glDepthFunc(func: GLenum): Unit {
    return kniBridge44(func)
}

fun glDepthMask(flag: GLboolean): Unit {
    return kniBridge45(flag)
}

fun glDepthRange(near_val: GLclampd, far_val: GLclampd): Unit {
    return kniBridge46(near_val, far_val)
}

fun glClearAccum(red: GLfloat, green: GLfloat, blue: GLfloat, alpha: GLfloat): Unit {
    return kniBridge47(red, green, blue, alpha)
}

fun glAccum(op: GLenum, value: GLfloat): Unit {
    return kniBridge48(op, value)
}

fun glMatrixMode(mode: GLenum): Unit {
    return kniBridge49(mode)
}

fun glOrtho(left: GLdouble, right: GLdouble, bottom: GLdouble, top: GLdouble, near_val: GLdouble, far_val: GLdouble): Unit {
    return kniBridge50(left, right, bottom, top, near_val, far_val)
}

fun glFrustum(left: GLdouble, right: GLdouble, bottom: GLdouble, top: GLdouble, near_val: GLdouble, far_val: GLdouble): Unit {
    return kniBridge51(left, right, bottom, top, near_val, far_val)
}

fun glViewport(x: GLint, y: GLint, width: GLsizei, height: GLsizei): Unit {
    return kniBridge52(x, y, width, height)
}

fun glPushMatrix(): Unit {
    return kniBridge53()
}

fun glPopMatrix(): Unit {
    return kniBridge54()
}

fun glLoadIdentity(): Unit {
    return kniBridge55()
}

fun glLoadMatrixd(m: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge56(m?.getPointer(memScope).rawValue)
    }
}

fun glLoadMatrixf(m: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge57(m?.getPointer(memScope).rawValue)
    }
}

fun glMultMatrixd(m: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge58(m?.getPointer(memScope).rawValue)
    }
}

fun glMultMatrixf(m: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge59(m?.getPointer(memScope).rawValue)
    }
}

fun glRotated(angle: GLdouble, x: GLdouble, y: GLdouble, z: GLdouble): Unit {
    return kniBridge60(angle, x, y, z)
}

fun glRotatef(angle: GLfloat, x: GLfloat, y: GLfloat, z: GLfloat): Unit {
    return kniBridge61(angle, x, y, z)
}

fun glScaled(x: GLdouble, y: GLdouble, z: GLdouble): Unit {
    return kniBridge62(x, y, z)
}

fun glScalef(x: GLfloat, y: GLfloat, z: GLfloat): Unit {
    return kniBridge63(x, y, z)
}

fun glTranslated(x: GLdouble, y: GLdouble, z: GLdouble): Unit {
    return kniBridge64(x, y, z)
}

fun glTranslatef(x: GLfloat, y: GLfloat, z: GLfloat): Unit {
    return kniBridge65(x, y, z)
}

fun glIsList(list: GLuint): GLboolean {
    return kniBridge66(list)
}

fun glDeleteLists(list: GLuint, range: GLsizei): Unit {
    return kniBridge67(list, range)
}

fun glGenLists(range: GLsizei): GLuint {
    return kniBridge68(range)
}

fun glNewList(list: GLuint, mode: GLenum): Unit {
    return kniBridge69(list, mode)
}

fun glEndList(): Unit {
    return kniBridge70()
}

fun glCallList(list: GLuint): Unit {
    return kniBridge71(list)
}

fun glCallLists(n: GLsizei, type: GLenum, lists: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge72(n, type, lists?.getPointer(memScope).rawValue)
    }
}

fun glListBase(base: GLuint): Unit {
    return kniBridge73(base)
}

fun glBegin(mode: GLenum): Unit {
    return kniBridge74(mode)
}

fun glEnd(): Unit {
    return kniBridge75()
}

fun glVertex2d(x: GLdouble, y: GLdouble): Unit {
    return kniBridge76(x, y)
}

fun glVertex2f(x: GLfloat, y: GLfloat): Unit {
    return kniBridge77(x, y)
}

fun glVertex2i(x: GLint, y: GLint): Unit {
    return kniBridge78(x, y)
}

fun glVertex2s(x: GLshort, y: GLshort): Unit {
    return kniBridge79(x, y)
}

fun glVertex3d(x: GLdouble, y: GLdouble, z: GLdouble): Unit {
    return kniBridge80(x, y, z)
}

fun glVertex3f(x: GLfloat, y: GLfloat, z: GLfloat): Unit {
    return kniBridge81(x, y, z)
}

fun glVertex3i(x: GLint, y: GLint, z: GLint): Unit {
    return kniBridge82(x, y, z)
}

fun glVertex3s(x: GLshort, y: GLshort, z: GLshort): Unit {
    return kniBridge83(x, y, z)
}

fun glVertex4d(x: GLdouble, y: GLdouble, z: GLdouble, w: GLdouble): Unit {
    return kniBridge84(x, y, z, w)
}

fun glVertex4f(x: GLfloat, y: GLfloat, z: GLfloat, w: GLfloat): Unit {
    return kniBridge85(x, y, z, w)
}

fun glVertex4i(x: GLint, y: GLint, z: GLint, w: GLint): Unit {
    return kniBridge86(x, y, z, w)
}

fun glVertex4s(x: GLshort, y: GLshort, z: GLshort, w: GLshort): Unit {
    return kniBridge87(x, y, z, w)
}

fun glVertex2dv(v: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge88(v?.getPointer(memScope).rawValue)
    }
}

fun glVertex2fv(v: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge89(v?.getPointer(memScope).rawValue)
    }
}

fun glVertex2iv(v: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge90(v?.getPointer(memScope).rawValue)
    }
}

fun glVertex2sv(v: CValuesRef<GLshortVar>?): Unit {
    memScoped {
        return kniBridge91(v?.getPointer(memScope).rawValue)
    }
}

fun glVertex3dv(v: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge92(v?.getPointer(memScope).rawValue)
    }
}

fun glVertex3fv(v: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge93(v?.getPointer(memScope).rawValue)
    }
}

fun glVertex3iv(v: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge94(v?.getPointer(memScope).rawValue)
    }
}

fun glVertex3sv(v: CValuesRef<GLshortVar>?): Unit {
    memScoped {
        return kniBridge95(v?.getPointer(memScope).rawValue)
    }
}

fun glVertex4dv(v: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge96(v?.getPointer(memScope).rawValue)
    }
}

fun glVertex4fv(v: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge97(v?.getPointer(memScope).rawValue)
    }
}

fun glVertex4iv(v: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge98(v?.getPointer(memScope).rawValue)
    }
}

fun glVertex4sv(v: CValuesRef<GLshortVar>?): Unit {
    memScoped {
        return kniBridge99(v?.getPointer(memScope).rawValue)
    }
}

fun glNormal3b(nx: GLbyte, ny: GLbyte, nz: GLbyte): Unit {
    return kniBridge100(nx, ny, nz)
}

fun glNormal3d(nx: GLdouble, ny: GLdouble, nz: GLdouble): Unit {
    return kniBridge101(nx, ny, nz)
}

fun glNormal3f(nx: GLfloat, ny: GLfloat, nz: GLfloat): Unit {
    return kniBridge102(nx, ny, nz)
}

fun glNormal3i(nx: GLint, ny: GLint, nz: GLint): Unit {
    return kniBridge103(nx, ny, nz)
}

fun glNormal3s(nx: GLshort, ny: GLshort, nz: GLshort): Unit {
    return kniBridge104(nx, ny, nz)
}

fun glNormal3bv(v: CValuesRef<GLbyteVar>?): Unit {
    memScoped {
        return kniBridge105(v?.getPointer(memScope).rawValue)
    }
}

fun glNormal3dv(v: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge106(v?.getPointer(memScope).rawValue)
    }
}

fun glNormal3fv(v: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge107(v?.getPointer(memScope).rawValue)
    }
}

fun glNormal3iv(v: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge108(v?.getPointer(memScope).rawValue)
    }
}

fun glNormal3sv(v: CValuesRef<GLshortVar>?): Unit {
    memScoped {
        return kniBridge109(v?.getPointer(memScope).rawValue)
    }
}

fun glIndexd(c: GLdouble): Unit {
    return kniBridge110(c)
}

fun glIndexf(c: GLfloat): Unit {
    return kniBridge111(c)
}

fun glIndexi(c: GLint): Unit {
    return kniBridge112(c)
}

fun glIndexs(c: GLshort): Unit {
    return kniBridge113(c)
}

fun glIndexub(c: GLubyte): Unit {
    return kniBridge114(c)
}

fun glIndexdv(c: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge115(c?.getPointer(memScope).rawValue)
    }
}

fun glIndexfv(c: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge116(c?.getPointer(memScope).rawValue)
    }
}

fun glIndexiv(c: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge117(c?.getPointer(memScope).rawValue)
    }
}

fun glIndexsv(c: CValuesRef<GLshortVar>?): Unit {
    memScoped {
        return kniBridge118(c?.getPointer(memScope).rawValue)
    }
}

fun glIndexubv(c: CValuesRef<GLubyteVar>?): Unit {
    memScoped {
        return kniBridge119(c?.getPointer(memScope).rawValue)
    }
}

fun glColor3b(red: GLbyte, green: GLbyte, blue: GLbyte): Unit {
    return kniBridge120(red, green, blue)
}

fun glColor3d(red: GLdouble, green: GLdouble, blue: GLdouble): Unit {
    return kniBridge121(red, green, blue)
}

fun glColor3f(red: GLfloat, green: GLfloat, blue: GLfloat): Unit {
    return kniBridge122(red, green, blue)
}

fun glColor3i(red: GLint, green: GLint, blue: GLint): Unit {
    return kniBridge123(red, green, blue)
}

fun glColor3s(red: GLshort, green: GLshort, blue: GLshort): Unit {
    return kniBridge124(red, green, blue)
}

fun glColor3ub(red: GLubyte, green: GLubyte, blue: GLubyte): Unit {
    return kniBridge125(red, green, blue)
}

fun glColor3ui(red: GLuint, green: GLuint, blue: GLuint): Unit {
    return kniBridge126(red, green, blue)
}

fun glColor3us(red: GLushort, green: GLushort, blue: GLushort): Unit {
    return kniBridge127(red, green, blue)
}

fun glColor4b(red: GLbyte, green: GLbyte, blue: GLbyte, alpha: GLbyte): Unit {
    return kniBridge128(red, green, blue, alpha)
}

fun glColor4d(red: GLdouble, green: GLdouble, blue: GLdouble, alpha: GLdouble): Unit {
    return kniBridge129(red, green, blue, alpha)
}

fun glColor4f(red: GLfloat, green: GLfloat, blue: GLfloat, alpha: GLfloat): Unit {
    return kniBridge130(red, green, blue, alpha)
}

fun glColor4i(red: GLint, green: GLint, blue: GLint, alpha: GLint): Unit {
    return kniBridge131(red, green, blue, alpha)
}

fun glColor4s(red: GLshort, green: GLshort, blue: GLshort, alpha: GLshort): Unit {
    return kniBridge132(red, green, blue, alpha)
}

fun glColor4ub(red: GLubyte, green: GLubyte, blue: GLubyte, alpha: GLubyte): Unit {
    return kniBridge133(red, green, blue, alpha)
}

fun glColor4ui(red: GLuint, green: GLuint, blue: GLuint, alpha: GLuint): Unit {
    return kniBridge134(red, green, blue, alpha)
}

fun glColor4us(red: GLushort, green: GLushort, blue: GLushort, alpha: GLushort): Unit {
    return kniBridge135(red, green, blue, alpha)
}

fun glColor3bv(v: CValuesRef<GLbyteVar>?): Unit {
    memScoped {
        return kniBridge136(v?.getPointer(memScope).rawValue)
    }
}

fun glColor3dv(v: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge137(v?.getPointer(memScope).rawValue)
    }
}

fun glColor3fv(v: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge138(v?.getPointer(memScope).rawValue)
    }
}

fun glColor3iv(v: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge139(v?.getPointer(memScope).rawValue)
    }
}

fun glColor3sv(v: CValuesRef<GLshortVar>?): Unit {
    memScoped {
        return kniBridge140(v?.getPointer(memScope).rawValue)
    }
}

fun glColor3ubv(v: CValuesRef<GLubyteVar>?): Unit {
    memScoped {
        return kniBridge141(v?.getPointer(memScope).rawValue)
    }
}

fun glColor3uiv(v: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge142(v?.getPointer(memScope).rawValue)
    }
}

fun glColor3usv(v: CValuesRef<GLushortVar>?): Unit {
    memScoped {
        return kniBridge143(v?.getPointer(memScope).rawValue)
    }
}

fun glColor4bv(v: CValuesRef<GLbyteVar>?): Unit {
    memScoped {
        return kniBridge144(v?.getPointer(memScope).rawValue)
    }
}

fun glColor4dv(v: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge145(v?.getPointer(memScope).rawValue)
    }
}

fun glColor4fv(v: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge146(v?.getPointer(memScope).rawValue)
    }
}

fun glColor4iv(v: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge147(v?.getPointer(memScope).rawValue)
    }
}

fun glColor4sv(v: CValuesRef<GLshortVar>?): Unit {
    memScoped {
        return kniBridge148(v?.getPointer(memScope).rawValue)
    }
}

fun glColor4ubv(v: CValuesRef<GLubyteVar>?): Unit {
    memScoped {
        return kniBridge149(v?.getPointer(memScope).rawValue)
    }
}

fun glColor4uiv(v: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge150(v?.getPointer(memScope).rawValue)
    }
}

fun glColor4usv(v: CValuesRef<GLushortVar>?): Unit {
    memScoped {
        return kniBridge151(v?.getPointer(memScope).rawValue)
    }
}

fun glTexCoord1d(s: GLdouble): Unit {
    return kniBridge152(s)
}

fun glTexCoord1f(s: GLfloat): Unit {
    return kniBridge153(s)
}

fun glTexCoord1i(s: GLint): Unit {
    return kniBridge154(s)
}

fun glTexCoord1s(s: GLshort): Unit {
    return kniBridge155(s)
}

fun glTexCoord2d(s: GLdouble, t: GLdouble): Unit {
    return kniBridge156(s, t)
}

fun glTexCoord2f(s: GLfloat, t: GLfloat): Unit {
    return kniBridge157(s, t)
}

fun glTexCoord2i(s: GLint, t: GLint): Unit {
    return kniBridge158(s, t)
}

fun glTexCoord2s(s: GLshort, t: GLshort): Unit {
    return kniBridge159(s, t)
}

fun glTexCoord3d(s: GLdouble, t: GLdouble, r: GLdouble): Unit {
    return kniBridge160(s, t, r)
}

fun glTexCoord3f(s: GLfloat, t: GLfloat, r: GLfloat): Unit {
    return kniBridge161(s, t, r)
}

fun glTexCoord3i(s: GLint, t: GLint, r: GLint): Unit {
    return kniBridge162(s, t, r)
}

fun glTexCoord3s(s: GLshort, t: GLshort, r: GLshort): Unit {
    return kniBridge163(s, t, r)
}

fun glTexCoord4d(s: GLdouble, t: GLdouble, r: GLdouble, q: GLdouble): Unit {
    return kniBridge164(s, t, r, q)
}

fun glTexCoord4f(s: GLfloat, t: GLfloat, r: GLfloat, q: GLfloat): Unit {
    return kniBridge165(s, t, r, q)
}

fun glTexCoord4i(s: GLint, t: GLint, r: GLint, q: GLint): Unit {
    return kniBridge166(s, t, r, q)
}

fun glTexCoord4s(s: GLshort, t: GLshort, r: GLshort, q: GLshort): Unit {
    return kniBridge167(s, t, r, q)
}

fun glTexCoord1dv(v: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge168(v?.getPointer(memScope).rawValue)
    }
}

fun glTexCoord1fv(v: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge169(v?.getPointer(memScope).rawValue)
    }
}

fun glTexCoord1iv(v: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge170(v?.getPointer(memScope).rawValue)
    }
}

fun glTexCoord1sv(v: CValuesRef<GLshortVar>?): Unit {
    memScoped {
        return kniBridge171(v?.getPointer(memScope).rawValue)
    }
}

fun glTexCoord2dv(v: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge172(v?.getPointer(memScope).rawValue)
    }
}

fun glTexCoord2fv(v: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge173(v?.getPointer(memScope).rawValue)
    }
}

fun glTexCoord2iv(v: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge174(v?.getPointer(memScope).rawValue)
    }
}

fun glTexCoord2sv(v: CValuesRef<GLshortVar>?): Unit {
    memScoped {
        return kniBridge175(v?.getPointer(memScope).rawValue)
    }
}

fun glTexCoord3dv(v: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge176(v?.getPointer(memScope).rawValue)
    }
}

fun glTexCoord3fv(v: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge177(v?.getPointer(memScope).rawValue)
    }
}

fun glTexCoord3iv(v: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge178(v?.getPointer(memScope).rawValue)
    }
}

fun glTexCoord3sv(v: CValuesRef<GLshortVar>?): Unit {
    memScoped {
        return kniBridge179(v?.getPointer(memScope).rawValue)
    }
}

fun glTexCoord4dv(v: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge180(v?.getPointer(memScope).rawValue)
    }
}

fun glTexCoord4fv(v: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge181(v?.getPointer(memScope).rawValue)
    }
}

fun glTexCoord4iv(v: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge182(v?.getPointer(memScope).rawValue)
    }
}

fun glTexCoord4sv(v: CValuesRef<GLshortVar>?): Unit {
    memScoped {
        return kniBridge183(v?.getPointer(memScope).rawValue)
    }
}

fun glRasterPos2d(x: GLdouble, y: GLdouble): Unit {
    return kniBridge184(x, y)
}

fun glRasterPos2f(x: GLfloat, y: GLfloat): Unit {
    return kniBridge185(x, y)
}

fun glRasterPos2i(x: GLint, y: GLint): Unit {
    return kniBridge186(x, y)
}

fun glRasterPos2s(x: GLshort, y: GLshort): Unit {
    return kniBridge187(x, y)
}

fun glRasterPos3d(x: GLdouble, y: GLdouble, z: GLdouble): Unit {
    return kniBridge188(x, y, z)
}

fun glRasterPos3f(x: GLfloat, y: GLfloat, z: GLfloat): Unit {
    return kniBridge189(x, y, z)
}

fun glRasterPos3i(x: GLint, y: GLint, z: GLint): Unit {
    return kniBridge190(x, y, z)
}

fun glRasterPos3s(x: GLshort, y: GLshort, z: GLshort): Unit {
    return kniBridge191(x, y, z)
}

fun glRasterPos4d(x: GLdouble, y: GLdouble, z: GLdouble, w: GLdouble): Unit {
    return kniBridge192(x, y, z, w)
}

fun glRasterPos4f(x: GLfloat, y: GLfloat, z: GLfloat, w: GLfloat): Unit {
    return kniBridge193(x, y, z, w)
}

fun glRasterPos4i(x: GLint, y: GLint, z: GLint, w: GLint): Unit {
    return kniBridge194(x, y, z, w)
}

fun glRasterPos4s(x: GLshort, y: GLshort, z: GLshort, w: GLshort): Unit {
    return kniBridge195(x, y, z, w)
}

fun glRasterPos2dv(v: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge196(v?.getPointer(memScope).rawValue)
    }
}

fun glRasterPos2fv(v: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge197(v?.getPointer(memScope).rawValue)
    }
}

fun glRasterPos2iv(v: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge198(v?.getPointer(memScope).rawValue)
    }
}

fun glRasterPos2sv(v: CValuesRef<GLshortVar>?): Unit {
    memScoped {
        return kniBridge199(v?.getPointer(memScope).rawValue)
    }
}

fun glRasterPos3dv(v: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge200(v?.getPointer(memScope).rawValue)
    }
}

fun glRasterPos3fv(v: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge201(v?.getPointer(memScope).rawValue)
    }
}

fun glRasterPos3iv(v: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge202(v?.getPointer(memScope).rawValue)
    }
}

fun glRasterPos3sv(v: CValuesRef<GLshortVar>?): Unit {
    memScoped {
        return kniBridge203(v?.getPointer(memScope).rawValue)
    }
}

fun glRasterPos4dv(v: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge204(v?.getPointer(memScope).rawValue)
    }
}

fun glRasterPos4fv(v: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge205(v?.getPointer(memScope).rawValue)
    }
}

fun glRasterPos4iv(v: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge206(v?.getPointer(memScope).rawValue)
    }
}

fun glRasterPos4sv(v: CValuesRef<GLshortVar>?): Unit {
    memScoped {
        return kniBridge207(v?.getPointer(memScope).rawValue)
    }
}

fun glRectd(x1: GLdouble, y1: GLdouble, x2: GLdouble, y2: GLdouble): Unit {
    return kniBridge208(x1, y1, x2, y2)
}

fun glRectf(x1: GLfloat, y1: GLfloat, x2: GLfloat, y2: GLfloat): Unit {
    return kniBridge209(x1, y1, x2, y2)
}

fun glRecti(x1: GLint, y1: GLint, x2: GLint, y2: GLint): Unit {
    return kniBridge210(x1, y1, x2, y2)
}

fun glRects(x1: GLshort, y1: GLshort, x2: GLshort, y2: GLshort): Unit {
    return kniBridge211(x1, y1, x2, y2)
}

fun glRectdv(v1: CValuesRef<GLdoubleVar>?, v2: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge212(v1?.getPointer(memScope).rawValue, v2?.getPointer(memScope).rawValue)
    }
}

fun glRectfv(v1: CValuesRef<GLfloatVar>?, v2: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge213(v1?.getPointer(memScope).rawValue, v2?.getPointer(memScope).rawValue)
    }
}

fun glRectiv(v1: CValuesRef<GLintVar>?, v2: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge214(v1?.getPointer(memScope).rawValue, v2?.getPointer(memScope).rawValue)
    }
}

fun glRectsv(v1: CValuesRef<GLshortVar>?, v2: CValuesRef<GLshortVar>?): Unit {
    memScoped {
        return kniBridge215(v1?.getPointer(memScope).rawValue, v2?.getPointer(memScope).rawValue)
    }
}

fun glVertexPointer(size: GLint, type: GLenum, stride: GLsizei, ptr: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge216(size, type, stride, ptr?.getPointer(memScope).rawValue)
    }
}

fun glNormalPointer(type: GLenum, stride: GLsizei, ptr: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge217(type, stride, ptr?.getPointer(memScope).rawValue)
    }
}

fun glColorPointer(size: GLint, type: GLenum, stride: GLsizei, ptr: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge218(size, type, stride, ptr?.getPointer(memScope).rawValue)
    }
}

fun glIndexPointer(type: GLenum, stride: GLsizei, ptr: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge219(type, stride, ptr?.getPointer(memScope).rawValue)
    }
}

fun glTexCoordPointer(size: GLint, type: GLenum, stride: GLsizei, ptr: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge220(size, type, stride, ptr?.getPointer(memScope).rawValue)
    }
}

fun glEdgeFlagPointer(stride: GLsizei, ptr: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge221(stride, ptr?.getPointer(memScope).rawValue)
    }
}

fun glGetPointerv(pname: GLenum, params: CValuesRef<COpaquePointerVar>?): Unit {
    memScoped {
        return kniBridge222(pname, params?.getPointer(memScope).rawValue)
    }
}

fun glArrayElement(i: GLint): Unit {
    return kniBridge223(i)
}

fun glDrawArrays(mode: GLenum, first: GLint, count: GLsizei): Unit {
    return kniBridge224(mode, first, count)
}

fun glDrawElements(mode: GLenum, count: GLsizei, type: GLenum, indices: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge225(mode, count, type, indices?.getPointer(memScope).rawValue)
    }
}

fun glInterleavedArrays(format: GLenum, stride: GLsizei, pointer: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge226(format, stride, pointer?.getPointer(memScope).rawValue)
    }
}

fun glShadeModel(mode: GLenum): Unit {
    return kniBridge227(mode)
}

fun glLightf(light: GLenum, pname: GLenum, param: GLfloat): Unit {
    return kniBridge228(light, pname, param)
}

fun glLighti(light: GLenum, pname: GLenum, param: GLint): Unit {
    return kniBridge229(light, pname, param)
}

fun glLightfv(light: GLenum, pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge230(light, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glLightiv(light: GLenum, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge231(light, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGetLightfv(light: GLenum, pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge232(light, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGetLightiv(light: GLenum, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge233(light, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glLightModelf(pname: GLenum, param: GLfloat): Unit {
    return kniBridge234(pname, param)
}

fun glLightModeli(pname: GLenum, param: GLint): Unit {
    return kniBridge235(pname, param)
}

fun glLightModelfv(pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge236(pname, params?.getPointer(memScope).rawValue)
    }
}

fun glLightModeliv(pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge237(pname, params?.getPointer(memScope).rawValue)
    }
}

fun glMaterialf(face: GLenum, pname: GLenum, param: GLfloat): Unit {
    return kniBridge238(face, pname, param)
}

fun glMateriali(face: GLenum, pname: GLenum, param: GLint): Unit {
    return kniBridge239(face, pname, param)
}

fun glMaterialfv(face: GLenum, pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge240(face, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glMaterialiv(face: GLenum, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge241(face, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGetMaterialfv(face: GLenum, pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge242(face, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGetMaterialiv(face: GLenum, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge243(face, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glColorMaterial(face: GLenum, mode: GLenum): Unit {
    return kniBridge244(face, mode)
}

fun glPixelZoom(xfactor: GLfloat, yfactor: GLfloat): Unit {
    return kniBridge245(xfactor, yfactor)
}

fun glPixelStoref(pname: GLenum, param: GLfloat): Unit {
    return kniBridge246(pname, param)
}

fun glPixelStorei(pname: GLenum, param: GLint): Unit {
    return kniBridge247(pname, param)
}

fun glPixelTransferf(pname: GLenum, param: GLfloat): Unit {
    return kniBridge248(pname, param)
}

fun glPixelTransferi(pname: GLenum, param: GLint): Unit {
    return kniBridge249(pname, param)
}

fun glPixelMapfv(map: GLenum, mapsize: GLsizei, values: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge250(map, mapsize, values?.getPointer(memScope).rawValue)
    }
}

fun glPixelMapuiv(map: GLenum, mapsize: GLsizei, values: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge251(map, mapsize, values?.getPointer(memScope).rawValue)
    }
}

fun glPixelMapusv(map: GLenum, mapsize: GLsizei, values: CValuesRef<GLushortVar>?): Unit {
    memScoped {
        return kniBridge252(map, mapsize, values?.getPointer(memScope).rawValue)
    }
}

fun glGetPixelMapfv(map: GLenum, values: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge253(map, values?.getPointer(memScope).rawValue)
    }
}

fun glGetPixelMapuiv(map: GLenum, values: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge254(map, values?.getPointer(memScope).rawValue)
    }
}

fun glGetPixelMapusv(map: GLenum, values: CValuesRef<GLushortVar>?): Unit {
    memScoped {
        return kniBridge255(map, values?.getPointer(memScope).rawValue)
    }
}

fun glBitmap(width: GLsizei, height: GLsizei, xorig: GLfloat, yorig: GLfloat, xmove: GLfloat, ymove: GLfloat, bitmap: CValuesRef<GLubyteVar>?): Unit {
    memScoped {
        return kniBridge256(width, height, xorig, yorig, xmove, ymove, bitmap?.getPointer(memScope).rawValue)
    }
}

fun glReadPixels(x: GLint, y: GLint, width: GLsizei, height: GLsizei, format: GLenum, type: GLenum, pixels: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge257(x, y, width, height, format, type, pixels?.getPointer(memScope).rawValue)
    }
}

fun glDrawPixels(width: GLsizei, height: GLsizei, format: GLenum, type: GLenum, pixels: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge258(width, height, format, type, pixels?.getPointer(memScope).rawValue)
    }
}

fun glCopyPixels(x: GLint, y: GLint, width: GLsizei, height: GLsizei, type: GLenum): Unit {
    return kniBridge259(x, y, width, height, type)
}

fun glStencilFunc(func: GLenum, ref: GLint, mask: GLuint): Unit {
    return kniBridge260(func, ref, mask)
}

fun glStencilMask(mask: GLuint): Unit {
    return kniBridge261(mask)
}

fun glStencilOp(fail: GLenum, zfail: GLenum, zpass: GLenum): Unit {
    return kniBridge262(fail, zfail, zpass)
}

fun glClearStencil(s: GLint): Unit {
    return kniBridge263(s)
}

fun glTexGend(coord: GLenum, pname: GLenum, param: GLdouble): Unit {
    return kniBridge264(coord, pname, param)
}

fun glTexGenf(coord: GLenum, pname: GLenum, param: GLfloat): Unit {
    return kniBridge265(coord, pname, param)
}

fun glTexGeni(coord: GLenum, pname: GLenum, param: GLint): Unit {
    return kniBridge266(coord, pname, param)
}

fun glTexGendv(coord: GLenum, pname: GLenum, params: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge267(coord, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glTexGenfv(coord: GLenum, pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge268(coord, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glTexGeniv(coord: GLenum, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge269(coord, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGetTexGendv(coord: GLenum, pname: GLenum, params: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge270(coord, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGetTexGenfv(coord: GLenum, pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge271(coord, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGetTexGeniv(coord: GLenum, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge272(coord, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glTexEnvf(target: GLenum, pname: GLenum, param: GLfloat): Unit {
    return kniBridge273(target, pname, param)
}

fun glTexEnvi(target: GLenum, pname: GLenum, param: GLint): Unit {
    return kniBridge274(target, pname, param)
}

fun glTexEnvfv(target: GLenum, pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge275(target, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glTexEnviv(target: GLenum, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge276(target, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGetTexEnvfv(target: GLenum, pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge277(target, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGetTexEnviv(target: GLenum, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge278(target, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glTexParameterf(target: GLenum, pname: GLenum, param: GLfloat): Unit {
    return kniBridge279(target, pname, param)
}

fun glTexParameteri(target: GLenum, pname: GLenum, param: GLint): Unit {
    return kniBridge280(target, pname, param)
}

fun glTexParameterfv(target: GLenum, pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge281(target, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glTexParameteriv(target: GLenum, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge282(target, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGetTexParameterfv(target: GLenum, pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge283(target, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGetTexParameteriv(target: GLenum, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge284(target, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGetTexLevelParameterfv(target: GLenum, level: GLint, pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge285(target, level, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGetTexLevelParameteriv(target: GLenum, level: GLint, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge286(target, level, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glTexImage1D(target: GLenum, level: GLint, internalFormat: GLint, width: GLsizei, border: GLint, format: GLenum, type: GLenum, pixels: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge287(target, level, internalFormat, width, border, format, type, pixels?.getPointer(memScope).rawValue)
    }
}

fun glTexImage2D(target: GLenum, level: GLint, internalFormat: GLint, width: GLsizei, height: GLsizei, border: GLint, format: GLenum, type: GLenum, pixels: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge288(target, level, internalFormat, width, height, border, format, type, pixels?.getPointer(memScope).rawValue)
    }
}

fun glGetTexImage(target: GLenum, level: GLint, format: GLenum, type: GLenum, pixels: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge289(target, level, format, type, pixels?.getPointer(memScope).rawValue)
    }
}

fun glGenTextures(n: GLsizei, textures: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge290(n, textures?.getPointer(memScope).rawValue)
    }
}

fun glDeleteTextures(n: GLsizei, textures: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge291(n, textures?.getPointer(memScope).rawValue)
    }
}

fun glBindTexture(target: GLenum, texture: GLuint): Unit {
    return kniBridge292(target, texture)
}

fun glPrioritizeTextures(n: GLsizei, textures: CValuesRef<GLuintVar>?, priorities: CValuesRef<GLclampfVar>?): Unit {
    memScoped {
        return kniBridge293(n, textures?.getPointer(memScope).rawValue, priorities?.getPointer(memScope).rawValue)
    }
}

fun glAreTexturesResident(n: GLsizei, textures: CValuesRef<GLuintVar>?, residences: CValuesRef<GLbooleanVar>?): GLboolean {
    memScoped {
        return kniBridge294(n, textures?.getPointer(memScope).rawValue, residences?.getPointer(memScope).rawValue)
    }
}

fun glIsTexture(texture: GLuint): GLboolean {
    return kniBridge295(texture)
}

fun glTexSubImage1D(target: GLenum, level: GLint, xoffset: GLint, width: GLsizei, format: GLenum, type: GLenum, pixels: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge296(target, level, xoffset, width, format, type, pixels?.getPointer(memScope).rawValue)
    }
}

fun glTexSubImage2D(target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint, width: GLsizei, height: GLsizei, format: GLenum, type: GLenum, pixels: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge297(target, level, xoffset, yoffset, width, height, format, type, pixels?.getPointer(memScope).rawValue)
    }
}

fun glCopyTexImage1D(target: GLenum, level: GLint, internalformat: GLenum, x: GLint, y: GLint, width: GLsizei, border: GLint): Unit {
    return kniBridge298(target, level, internalformat, x, y, width, border)
}

fun glCopyTexImage2D(target: GLenum, level: GLint, internalformat: GLenum, x: GLint, y: GLint, width: GLsizei, height: GLsizei, border: GLint): Unit {
    return kniBridge299(target, level, internalformat, x, y, width, height, border)
}

fun glCopyTexSubImage1D(target: GLenum, level: GLint, xoffset: GLint, x: GLint, y: GLint, width: GLsizei): Unit {
    return kniBridge300(target, level, xoffset, x, y, width)
}

fun glCopyTexSubImage2D(target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint, x: GLint, y: GLint, width: GLsizei, height: GLsizei): Unit {
    return kniBridge301(target, level, xoffset, yoffset, x, y, width, height)
}

fun glMap1d(target: GLenum, u1: GLdouble, u2: GLdouble, stride: GLint, order: GLint, points: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge302(target, u1, u2, stride, order, points?.getPointer(memScope).rawValue)
    }
}

fun glMap1f(target: GLenum, u1: GLfloat, u2: GLfloat, stride: GLint, order: GLint, points: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge303(target, u1, u2, stride, order, points?.getPointer(memScope).rawValue)
    }
}

fun glMap2d(target: GLenum, u1: GLdouble, u2: GLdouble, ustride: GLint, uorder: GLint, v1: GLdouble, v2: GLdouble, vstride: GLint, vorder: GLint, points: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge304(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points?.getPointer(memScope).rawValue)
    }
}

fun glMap2f(target: GLenum, u1: GLfloat, u2: GLfloat, ustride: GLint, uorder: GLint, v1: GLfloat, v2: GLfloat, vstride: GLint, vorder: GLint, points: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge305(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points?.getPointer(memScope).rawValue)
    }
}

fun glGetMapdv(target: GLenum, query: GLenum, v: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge306(target, query, v?.getPointer(memScope).rawValue)
    }
}

fun glGetMapfv(target: GLenum, query: GLenum, v: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge307(target, query, v?.getPointer(memScope).rawValue)
    }
}

fun glGetMapiv(target: GLenum, query: GLenum, v: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge308(target, query, v?.getPointer(memScope).rawValue)
    }
}

fun glEvalCoord1d(u: GLdouble): Unit {
    return kniBridge309(u)
}

fun glEvalCoord1f(u: GLfloat): Unit {
    return kniBridge310(u)
}

fun glEvalCoord1dv(u: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge311(u?.getPointer(memScope).rawValue)
    }
}

fun glEvalCoord1fv(u: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge312(u?.getPointer(memScope).rawValue)
    }
}

fun glEvalCoord2d(u: GLdouble, v: GLdouble): Unit {
    return kniBridge313(u, v)
}

fun glEvalCoord2f(u: GLfloat, v: GLfloat): Unit {
    return kniBridge314(u, v)
}

fun glEvalCoord2dv(u: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge315(u?.getPointer(memScope).rawValue)
    }
}

fun glEvalCoord2fv(u: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge316(u?.getPointer(memScope).rawValue)
    }
}

fun glMapGrid1d(un: GLint, u1: GLdouble, u2: GLdouble): Unit {
    return kniBridge317(un, u1, u2)
}

fun glMapGrid1f(un: GLint, u1: GLfloat, u2: GLfloat): Unit {
    return kniBridge318(un, u1, u2)
}

fun glMapGrid2d(un: GLint, u1: GLdouble, u2: GLdouble, vn: GLint, v1: GLdouble, v2: GLdouble): Unit {
    return kniBridge319(un, u1, u2, vn, v1, v2)
}

fun glMapGrid2f(un: GLint, u1: GLfloat, u2: GLfloat, vn: GLint, v1: GLfloat, v2: GLfloat): Unit {
    return kniBridge320(un, u1, u2, vn, v1, v2)
}

fun glEvalPoint1(i: GLint): Unit {
    return kniBridge321(i)
}

fun glEvalPoint2(i: GLint, j: GLint): Unit {
    return kniBridge322(i, j)
}

fun glEvalMesh1(mode: GLenum, i1: GLint, i2: GLint): Unit {
    return kniBridge323(mode, i1, i2)
}

fun glEvalMesh2(mode: GLenum, i1: GLint, i2: GLint, j1: GLint, j2: GLint): Unit {
    return kniBridge324(mode, i1, i2, j1, j2)
}

fun glFogf(pname: GLenum, param: GLfloat): Unit {
    return kniBridge325(pname, param)
}

fun glFogi(pname: GLenum, param: GLint): Unit {
    return kniBridge326(pname, param)
}

fun glFogfv(pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge327(pname, params?.getPointer(memScope).rawValue)
    }
}

fun glFogiv(pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge328(pname, params?.getPointer(memScope).rawValue)
    }
}

fun glFeedbackBuffer(size: GLsizei, type: GLenum, buffer: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge329(size, type, buffer?.getPointer(memScope).rawValue)
    }
}

fun glPassThrough(token: GLfloat): Unit {
    return kniBridge330(token)
}

fun glSelectBuffer(size: GLsizei, buffer: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge331(size, buffer?.getPointer(memScope).rawValue)
    }
}

fun glInitNames(): Unit {
    return kniBridge332()
}

fun glLoadName(name: GLuint): Unit {
    return kniBridge333(name)
}

fun glPushName(name: GLuint): Unit {
    return kniBridge334(name)
}

fun glPopName(): Unit {
    return kniBridge335()
}

fun glDrawRangeElements(mode: GLenum, start: GLuint, end: GLuint, count: GLsizei, type: GLenum, indices: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge336(mode, start, end, count, type, indices?.getPointer(memScope).rawValue)
    }
}

fun glTexImage3D(target: GLenum, level: GLint, internalFormat: GLint, width: GLsizei, height: GLsizei, depth: GLsizei, border: GLint, format: GLenum, type: GLenum, pixels: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge337(target, level, internalFormat, width, height, depth, border, format, type, pixels?.getPointer(memScope).rawValue)
    }
}

fun glTexSubImage3D(target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint, zoffset: GLint, width: GLsizei, height: GLsizei, depth: GLsizei, format: GLenum, type: GLenum, pixels: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge338(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels?.getPointer(memScope).rawValue)
    }
}

fun glCopyTexSubImage3D(target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint, zoffset: GLint, x: GLint, y: GLint, width: GLsizei, height: GLsizei): Unit {
    return kniBridge339(target, level, xoffset, yoffset, zoffset, x, y, width, height)
}

fun glColorTable(target: GLenum, internalformat: GLenum, width: GLsizei, format: GLenum, type: GLenum, table: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge340(target, internalformat, width, format, type, table?.getPointer(memScope).rawValue)
    }
}

fun glColorSubTable(target: GLenum, start: GLsizei, count: GLsizei, format: GLenum, type: GLenum, data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge341(target, start, count, format, type, data?.getPointer(memScope).rawValue)
    }
}

fun glColorTableParameteriv(target: GLenum, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge342(target, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glColorTableParameterfv(target: GLenum, pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge343(target, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glCopyColorSubTable(target: GLenum, start: GLsizei, x: GLint, y: GLint, width: GLsizei): Unit {
    return kniBridge344(target, start, x, y, width)
}

fun glCopyColorTable(target: GLenum, internalformat: GLenum, x: GLint, y: GLint, width: GLsizei): Unit {
    return kniBridge345(target, internalformat, x, y, width)
}

fun glGetColorTable(target: GLenum, format: GLenum, type: GLenum, table: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge346(target, format, type, table?.getPointer(memScope).rawValue)
    }
}

fun glGetColorTableParameterfv(target: GLenum, pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge347(target, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGetColorTableParameteriv(target: GLenum, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge348(target, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glBlendEquation(mode: GLenum): Unit {
    return kniBridge349(mode)
}

fun glBlendColor(red: GLclampf, green: GLclampf, blue: GLclampf, alpha: GLclampf): Unit {
    return kniBridge350(red, green, blue, alpha)
}

fun glHistogram(target: GLenum, width: GLsizei, internalformat: GLenum, sink: GLboolean): Unit {
    return kniBridge351(target, width, internalformat, sink)
}

fun glResetHistogram(target: GLenum): Unit {
    return kniBridge352(target)
}

fun glGetHistogram(target: GLenum, reset: GLboolean, format: GLenum, type: GLenum, values: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge353(target, reset, format, type, values?.getPointer(memScope).rawValue)
    }
}

fun glGetHistogramParameterfv(target: GLenum, pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge354(target, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGetHistogramParameteriv(target: GLenum, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge355(target, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glMinmax(target: GLenum, internalformat: GLenum, sink: GLboolean): Unit {
    return kniBridge356(target, internalformat, sink)
}

fun glResetMinmax(target: GLenum): Unit {
    return kniBridge357(target)
}

fun glGetMinmax(target: GLenum, reset: GLboolean, format: GLenum, types: GLenum, values: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge358(target, reset, format, types, values?.getPointer(memScope).rawValue)
    }
}

fun glGetMinmaxParameterfv(target: GLenum, pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge359(target, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGetMinmaxParameteriv(target: GLenum, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge360(target, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glConvolutionFilter1D(target: GLenum, internalformat: GLenum, width: GLsizei, format: GLenum, type: GLenum, image: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge361(target, internalformat, width, format, type, image?.getPointer(memScope).rawValue)
    }
}

fun glConvolutionFilter2D(target: GLenum, internalformat: GLenum, width: GLsizei, height: GLsizei, format: GLenum, type: GLenum, image: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge362(target, internalformat, width, height, format, type, image?.getPointer(memScope).rawValue)
    }
}

fun glConvolutionParameterf(target: GLenum, pname: GLenum, params: GLfloat): Unit {
    return kniBridge363(target, pname, params)
}

fun glConvolutionParameterfv(target: GLenum, pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge364(target, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glConvolutionParameteri(target: GLenum, pname: GLenum, params: GLint): Unit {
    return kniBridge365(target, pname, params)
}

fun glConvolutionParameteriv(target: GLenum, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge366(target, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glCopyConvolutionFilter1D(target: GLenum, internalformat: GLenum, x: GLint, y: GLint, width: GLsizei): Unit {
    return kniBridge367(target, internalformat, x, y, width)
}

fun glCopyConvolutionFilter2D(target: GLenum, internalformat: GLenum, x: GLint, y: GLint, width: GLsizei, height: GLsizei): Unit {
    return kniBridge368(target, internalformat, x, y, width, height)
}

fun glGetConvolutionFilter(target: GLenum, format: GLenum, type: GLenum, image: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge369(target, format, type, image?.getPointer(memScope).rawValue)
    }
}

fun glGetConvolutionParameterfv(target: GLenum, pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge370(target, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGetConvolutionParameteriv(target: GLenum, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge371(target, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glSeparableFilter2D(target: GLenum, internalformat: GLenum, width: GLsizei, height: GLsizei, format: GLenum, type: GLenum, row: CValuesRef<*>?, column: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge372(target, internalformat, width, height, format, type, row?.getPointer(memScope).rawValue, column?.getPointer(memScope).rawValue)
    }
}

fun glGetSeparableFilter(target: GLenum, format: GLenum, type: GLenum, row: CValuesRef<*>?, column: CValuesRef<*>?, span: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge373(target, format, type, row?.getPointer(memScope).rawValue, column?.getPointer(memScope).rawValue, span?.getPointer(memScope).rawValue)
    }
}

fun glActiveTexture(texture: GLenum): Unit {
    return kniBridge374(texture)
}

fun glClientActiveTexture(texture: GLenum): Unit {
    return kniBridge375(texture)
}

fun glCompressedTexImage1D(target: GLenum, level: GLint, internalformat: GLenum, width: GLsizei, border: GLint, imageSize: GLsizei, data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge376(target, level, internalformat, width, border, imageSize, data?.getPointer(memScope).rawValue)
    }
}

fun glCompressedTexImage2D(target: GLenum, level: GLint, internalformat: GLenum, width: GLsizei, height: GLsizei, border: GLint, imageSize: GLsizei, data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge377(target, level, internalformat, width, height, border, imageSize, data?.getPointer(memScope).rawValue)
    }
}

fun glCompressedTexImage3D(target: GLenum, level: GLint, internalformat: GLenum, width: GLsizei, height: GLsizei, depth: GLsizei, border: GLint, imageSize: GLsizei, data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge378(target, level, internalformat, width, height, depth, border, imageSize, data?.getPointer(memScope).rawValue)
    }
}

fun glCompressedTexSubImage1D(target: GLenum, level: GLint, xoffset: GLint, width: GLsizei, format: GLenum, imageSize: GLsizei, data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge379(target, level, xoffset, width, format, imageSize, data?.getPointer(memScope).rawValue)
    }
}

fun glCompressedTexSubImage2D(target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint, width: GLsizei, height: GLsizei, format: GLenum, imageSize: GLsizei, data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge380(target, level, xoffset, yoffset, width, height, format, imageSize, data?.getPointer(memScope).rawValue)
    }
}

fun glCompressedTexSubImage3D(target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint, zoffset: GLint, width: GLsizei, height: GLsizei, depth: GLsizei, format: GLenum, imageSize: GLsizei, data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge381(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data?.getPointer(memScope).rawValue)
    }
}

fun glGetCompressedTexImage(target: GLenum, lod: GLint, img: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge382(target, lod, img?.getPointer(memScope).rawValue)
    }
}

fun glMultiTexCoord1d(target: GLenum, s: GLdouble): Unit {
    return kniBridge383(target, s)
}

fun glMultiTexCoord1dv(target: GLenum, v: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge384(target, v?.getPointer(memScope).rawValue)
    }
}

fun glMultiTexCoord1f(target: GLenum, s: GLfloat): Unit {
    return kniBridge385(target, s)
}

fun glMultiTexCoord1fv(target: GLenum, v: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge386(target, v?.getPointer(memScope).rawValue)
    }
}

fun glMultiTexCoord1i(target: GLenum, s: GLint): Unit {
    return kniBridge387(target, s)
}

fun glMultiTexCoord1iv(target: GLenum, v: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge388(target, v?.getPointer(memScope).rawValue)
    }
}

fun glMultiTexCoord1s(target: GLenum, s: GLshort): Unit {
    return kniBridge389(target, s)
}

fun glMultiTexCoord1sv(target: GLenum, v: CValuesRef<GLshortVar>?): Unit {
    memScoped {
        return kniBridge390(target, v?.getPointer(memScope).rawValue)
    }
}

fun glMultiTexCoord2d(target: GLenum, s: GLdouble, t: GLdouble): Unit {
    return kniBridge391(target, s, t)
}

fun glMultiTexCoord2dv(target: GLenum, v: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge392(target, v?.getPointer(memScope).rawValue)
    }
}

fun glMultiTexCoord2f(target: GLenum, s: GLfloat, t: GLfloat): Unit {
    return kniBridge393(target, s, t)
}

fun glMultiTexCoord2fv(target: GLenum, v: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge394(target, v?.getPointer(memScope).rawValue)
    }
}

fun glMultiTexCoord2i(target: GLenum, s: GLint, t: GLint): Unit {
    return kniBridge395(target, s, t)
}

fun glMultiTexCoord2iv(target: GLenum, v: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge396(target, v?.getPointer(memScope).rawValue)
    }
}

fun glMultiTexCoord2s(target: GLenum, s: GLshort, t: GLshort): Unit {
    return kniBridge397(target, s, t)
}

fun glMultiTexCoord2sv(target: GLenum, v: CValuesRef<GLshortVar>?): Unit {
    memScoped {
        return kniBridge398(target, v?.getPointer(memScope).rawValue)
    }
}

fun glMultiTexCoord3d(target: GLenum, s: GLdouble, t: GLdouble, r: GLdouble): Unit {
    return kniBridge399(target, s, t, r)
}

fun glMultiTexCoord3dv(target: GLenum, v: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge400(target, v?.getPointer(memScope).rawValue)
    }
}

fun glMultiTexCoord3f(target: GLenum, s: GLfloat, t: GLfloat, r: GLfloat): Unit {
    return kniBridge401(target, s, t, r)
}

fun glMultiTexCoord3fv(target: GLenum, v: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge402(target, v?.getPointer(memScope).rawValue)
    }
}

fun glMultiTexCoord3i(target: GLenum, s: GLint, t: GLint, r: GLint): Unit {
    return kniBridge403(target, s, t, r)
}

fun glMultiTexCoord3iv(target: GLenum, v: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge404(target, v?.getPointer(memScope).rawValue)
    }
}

fun glMultiTexCoord3s(target: GLenum, s: GLshort, t: GLshort, r: GLshort): Unit {
    return kniBridge405(target, s, t, r)
}

fun glMultiTexCoord3sv(target: GLenum, v: CValuesRef<GLshortVar>?): Unit {
    memScoped {
        return kniBridge406(target, v?.getPointer(memScope).rawValue)
    }
}

fun glMultiTexCoord4d(target: GLenum, s: GLdouble, t: GLdouble, r: GLdouble, q: GLdouble): Unit {
    return kniBridge407(target, s, t, r, q)
}

fun glMultiTexCoord4dv(target: GLenum, v: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge408(target, v?.getPointer(memScope).rawValue)
    }
}

fun glMultiTexCoord4f(target: GLenum, s: GLfloat, t: GLfloat, r: GLfloat, q: GLfloat): Unit {
    return kniBridge409(target, s, t, r, q)
}

fun glMultiTexCoord4fv(target: GLenum, v: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge410(target, v?.getPointer(memScope).rawValue)
    }
}

fun glMultiTexCoord4i(target: GLenum, s: GLint, t: GLint, r: GLint, q: GLint): Unit {
    return kniBridge411(target, s, t, r, q)
}

fun glMultiTexCoord4iv(target: GLenum, v: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge412(target, v?.getPointer(memScope).rawValue)
    }
}

fun glMultiTexCoord4s(target: GLenum, s: GLshort, t: GLshort, r: GLshort, q: GLshort): Unit {
    return kniBridge413(target, s, t, r, q)
}

fun glMultiTexCoord4sv(target: GLenum, v: CValuesRef<GLshortVar>?): Unit {
    memScoped {
        return kniBridge414(target, v?.getPointer(memScope).rawValue)
    }
}

fun glLoadTransposeMatrixd(m: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge415(m?.getPointer(memScope).rawValue)
    }
}

fun glLoadTransposeMatrixf(m: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge416(m?.getPointer(memScope).rawValue)
    }
}

fun glMultTransposeMatrixd(m: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge417(m?.getPointer(memScope).rawValue)
    }
}

fun glMultTransposeMatrixf(m: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge418(m?.getPointer(memScope).rawValue)
    }
}

fun glSampleCoverage(value: GLclampf, invert: GLboolean): Unit {
    return kniBridge419(value, invert)
}

fun glActiveTextureARB(texture: GLenum): Unit {
    return kniBridge420(texture)
}

fun glClientActiveTextureARB(texture: GLenum): Unit {
    return kniBridge421(texture)
}

fun glMultiTexCoord1dARB(target: GLenum, s: GLdouble): Unit {
    return kniBridge422(target, s)
}

fun glMultiTexCoord1dvARB(target: GLenum, v: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge423(target, v?.getPointer(memScope).rawValue)
    }
}

fun glMultiTexCoord1fARB(target: GLenum, s: GLfloat): Unit {
    return kniBridge424(target, s)
}

fun glMultiTexCoord1fvARB(target: GLenum, v: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge425(target, v?.getPointer(memScope).rawValue)
    }
}

fun glMultiTexCoord1iARB(target: GLenum, s: GLint): Unit {
    return kniBridge426(target, s)
}

fun glMultiTexCoord1ivARB(target: GLenum, v: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge427(target, v?.getPointer(memScope).rawValue)
    }
}

fun glMultiTexCoord1sARB(target: GLenum, s: GLshort): Unit {
    return kniBridge428(target, s)
}

fun glMultiTexCoord1svARB(target: GLenum, v: CValuesRef<GLshortVar>?): Unit {
    memScoped {
        return kniBridge429(target, v?.getPointer(memScope).rawValue)
    }
}

fun glMultiTexCoord2dARB(target: GLenum, s: GLdouble, t: GLdouble): Unit {
    return kniBridge430(target, s, t)
}

fun glMultiTexCoord2dvARB(target: GLenum, v: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge431(target, v?.getPointer(memScope).rawValue)
    }
}

fun glMultiTexCoord2fARB(target: GLenum, s: GLfloat, t: GLfloat): Unit {
    return kniBridge432(target, s, t)
}

fun glMultiTexCoord2fvARB(target: GLenum, v: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge433(target, v?.getPointer(memScope).rawValue)
    }
}

fun glMultiTexCoord2iARB(target: GLenum, s: GLint, t: GLint): Unit {
    return kniBridge434(target, s, t)
}

fun glMultiTexCoord2ivARB(target: GLenum, v: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge435(target, v?.getPointer(memScope).rawValue)
    }
}

fun glMultiTexCoord2sARB(target: GLenum, s: GLshort, t: GLshort): Unit {
    return kniBridge436(target, s, t)
}

fun glMultiTexCoord2svARB(target: GLenum, v: CValuesRef<GLshortVar>?): Unit {
    memScoped {
        return kniBridge437(target, v?.getPointer(memScope).rawValue)
    }
}

fun glMultiTexCoord3dARB(target: GLenum, s: GLdouble, t: GLdouble, r: GLdouble): Unit {
    return kniBridge438(target, s, t, r)
}

fun glMultiTexCoord3dvARB(target: GLenum, v: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge439(target, v?.getPointer(memScope).rawValue)
    }
}

fun glMultiTexCoord3fARB(target: GLenum, s: GLfloat, t: GLfloat, r: GLfloat): Unit {
    return kniBridge440(target, s, t, r)
}

fun glMultiTexCoord3fvARB(target: GLenum, v: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge441(target, v?.getPointer(memScope).rawValue)
    }
}

fun glMultiTexCoord3iARB(target: GLenum, s: GLint, t: GLint, r: GLint): Unit {
    return kniBridge442(target, s, t, r)
}

fun glMultiTexCoord3ivARB(target: GLenum, v: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge443(target, v?.getPointer(memScope).rawValue)
    }
}

fun glMultiTexCoord3sARB(target: GLenum, s: GLshort, t: GLshort, r: GLshort): Unit {
    return kniBridge444(target, s, t, r)
}

fun glMultiTexCoord3svARB(target: GLenum, v: CValuesRef<GLshortVar>?): Unit {
    memScoped {
        return kniBridge445(target, v?.getPointer(memScope).rawValue)
    }
}

fun glMultiTexCoord4dARB(target: GLenum, s: GLdouble, t: GLdouble, r: GLdouble, q: GLdouble): Unit {
    return kniBridge446(target, s, t, r, q)
}

fun glMultiTexCoord4dvARB(target: GLenum, v: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge447(target, v?.getPointer(memScope).rawValue)
    }
}

fun glMultiTexCoord4fARB(target: GLenum, s: GLfloat, t: GLfloat, r: GLfloat, q: GLfloat): Unit {
    return kniBridge448(target, s, t, r, q)
}

fun glMultiTexCoord4fvARB(target: GLenum, v: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge449(target, v?.getPointer(memScope).rawValue)
    }
}

fun glMultiTexCoord4iARB(target: GLenum, s: GLint, t: GLint, r: GLint, q: GLint): Unit {
    return kniBridge450(target, s, t, r, q)
}

fun glMultiTexCoord4ivARB(target: GLenum, v: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge451(target, v?.getPointer(memScope).rawValue)
    }
}

fun glMultiTexCoord4sARB(target: GLenum, s: GLshort, t: GLshort, r: GLshort, q: GLshort): Unit {
    return kniBridge452(target, s, t, r, q)
}

fun glMultiTexCoord4svARB(target: GLenum, v: CValuesRef<GLshortVar>?): Unit {
    memScoped {
        return kniBridge453(target, v?.getPointer(memScope).rawValue)
    }
}

fun imaxabs(__n: intmax_t): intmax_t {
    return kniBridge454(__n)
}

fun imaxdiv(__numer: intmax_t, __denom: intmax_t): CValue<imaxdiv_t> {
    val kniRetVal = nativeHeap.alloc<imaxdiv_t>()
    try {
        kniBridge455(__numer, __denom, kniRetVal.rawPtr)
        return kniRetVal.readValue()
    } finally { nativeHeap.free(kniRetVal) }
}

fun strtoimax(__nptr: String?, __endptr: CValuesRef<CPointerVar<ByteVar>>?, __base: Int): intmax_t {
    memScoped {
        return kniBridge456(__nptr?.cstr?.getPointer(memScope).rawValue, __endptr?.getPointer(memScope).rawValue, __base)
    }
}

fun strtoumax(__nptr: String?, __endptr: CValuesRef<CPointerVar<ByteVar>>?, __base: Int): uintmax_t {
    memScoped {
        return kniBridge457(__nptr?.cstr?.getPointer(memScope).rawValue, __endptr?.getPointer(memScope).rawValue, __base)
    }
}

fun wcstoimax(__nptr: CValuesRef<__gwchar_tVar>?, __endptr: CValuesRef<CPointerVar<__gwchar_tVar>>?, __base: Int): intmax_t {
    memScoped {
        return kniBridge458(__nptr?.getPointer(memScope).rawValue, __endptr?.getPointer(memScope).rawValue, __base)
    }
}

fun wcstoumax(__nptr: CValuesRef<__gwchar_tVar>?, __endptr: CValuesRef<CPointerVar<__gwchar_tVar>>?, __base: Int): uintmax_t {
    memScoped {
        return kniBridge459(__nptr?.getPointer(memScope).rawValue, __endptr?.getPointer(memScope).rawValue, __base)
    }
}

fun glBlendEquationSeparateATI(modeRGB: GLenum, modeA: GLenum): Unit {
    return kniBridge460(modeRGB, modeA)
}

fun glfwInit(): Int {
    return kniBridge461()
}

fun glfwTerminate(): Unit {
    return kniBridge462()
}

fun glfwGetVersion(major: CValuesRef<IntVar>?, minor: CValuesRef<IntVar>?, rev: CValuesRef<IntVar>?): Unit {
    memScoped {
        return kniBridge463(major?.getPointer(memScope).rawValue, minor?.getPointer(memScope).rawValue, rev?.getPointer(memScope).rawValue)
    }
}

fun glfwGetVersionString(): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge464())
}

fun glfwSetErrorCallback(cbfun: GLFWerrorfun?): GLFWerrorfun? {
    return interpretCPointer<CFunction<(Int, CPointer<ByteVar>?) -> Unit>>(kniBridge465(cbfun.rawValue))
}

fun glfwGetMonitors(count: CValuesRef<IntVar>?): CPointer<CPointerVar<GLFWmonitor>>? {
    memScoped {
        return interpretCPointer<CPointerVar<GLFWmonitor>>(kniBridge466(count?.getPointer(memScope).rawValue))
    }
}

fun glfwGetPrimaryMonitor(): CPointer<GLFWmonitor>? {
    return interpretCPointer<GLFWmonitor>(kniBridge467())
}

fun glfwGetMonitorPos(monitor: CValuesRef<GLFWmonitor>?, xpos: CValuesRef<IntVar>?, ypos: CValuesRef<IntVar>?): Unit {
    memScoped {
        return kniBridge468(monitor?.getPointer(memScope).rawValue, xpos?.getPointer(memScope).rawValue, ypos?.getPointer(memScope).rawValue)
    }
}

fun glfwGetMonitorPhysicalSize(monitor: CValuesRef<GLFWmonitor>?, widthMM: CValuesRef<IntVar>?, heightMM: CValuesRef<IntVar>?): Unit {
    memScoped {
        return kniBridge469(monitor?.getPointer(memScope).rawValue, widthMM?.getPointer(memScope).rawValue, heightMM?.getPointer(memScope).rawValue)
    }
}

fun glfwGetMonitorName(monitor: CValuesRef<GLFWmonitor>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge470(monitor?.getPointer(memScope).rawValue))
    }
}

fun glfwSetMonitorCallback(cbfun: GLFWmonitorfun?): GLFWmonitorfun? {
    return interpretCPointer<CFunction<(CPointer<GLFWmonitor>?, Int) -> Unit>>(kniBridge471(cbfun.rawValue))
}

fun glfwGetVideoModes(monitor: CValuesRef<GLFWmonitor>?, count: CValuesRef<IntVar>?): CPointer<GLFWvidmode>? {
    memScoped {
        return interpretCPointer<GLFWvidmode>(kniBridge472(monitor?.getPointer(memScope).rawValue, count?.getPointer(memScope).rawValue))
    }
}

fun glfwGetVideoMode(monitor: CValuesRef<GLFWmonitor>?): CPointer<GLFWvidmode>? {
    memScoped {
        return interpretCPointer<GLFWvidmode>(kniBridge473(monitor?.getPointer(memScope).rawValue))
    }
}

fun glfwSetGamma(monitor: CValuesRef<GLFWmonitor>?, gamma: Float): Unit {
    memScoped {
        return kniBridge474(monitor?.getPointer(memScope).rawValue, gamma)
    }
}

fun glfwGetGammaRamp(monitor: CValuesRef<GLFWmonitor>?): CPointer<GLFWgammaramp>? {
    memScoped {
        return interpretCPointer<GLFWgammaramp>(kniBridge475(monitor?.getPointer(memScope).rawValue))
    }
}

fun glfwSetGammaRamp(monitor: CValuesRef<GLFWmonitor>?, ramp: CValuesRef<GLFWgammaramp>?): Unit {
    memScoped {
        return kniBridge476(monitor?.getPointer(memScope).rawValue, ramp?.getPointer(memScope).rawValue)
    }
}

fun glfwDefaultWindowHints(): Unit {
    return kniBridge477()
}

fun glfwWindowHint(hint: Int, value: Int): Unit {
    return kniBridge478(hint, value)
}

fun glfwCreateWindow(width: Int, height: Int, title: String?, monitor: CValuesRef<GLFWmonitor>?, share: CValuesRef<GLFWwindow>?): CPointer<GLFWwindow>? {
    memScoped {
        return interpretCPointer<GLFWwindow>(kniBridge479(width, height, title?.cstr?.getPointer(memScope).rawValue, monitor?.getPointer(memScope).rawValue, share?.getPointer(memScope).rawValue))
    }
}

fun glfwDestroyWindow(window: CValuesRef<GLFWwindow>?): Unit {
    memScoped {
        return kniBridge480(window?.getPointer(memScope).rawValue)
    }
}

fun glfwWindowShouldClose(window: CValuesRef<GLFWwindow>?): Int {
    memScoped {
        return kniBridge481(window?.getPointer(memScope).rawValue)
    }
}

fun glfwSetWindowShouldClose(window: CValuesRef<GLFWwindow>?, value: Int): Unit {
    memScoped {
        return kniBridge482(window?.getPointer(memScope).rawValue, value)
    }
}

fun glfwSetWindowTitle(window: CValuesRef<GLFWwindow>?, title: String?): Unit {
    memScoped {
        return kniBridge483(window?.getPointer(memScope).rawValue, title?.cstr?.getPointer(memScope).rawValue)
    }
}

fun glfwSetWindowIcon(window: CValuesRef<GLFWwindow>?, count: Int, images: CValuesRef<GLFWimage>?): Unit {
    memScoped {
        return kniBridge484(window?.getPointer(memScope).rawValue, count, images?.getPointer(memScope).rawValue)
    }
}

fun glfwGetWindowPos(window: CValuesRef<GLFWwindow>?, xpos: CValuesRef<IntVar>?, ypos: CValuesRef<IntVar>?): Unit {
    memScoped {
        return kniBridge485(window?.getPointer(memScope).rawValue, xpos?.getPointer(memScope).rawValue, ypos?.getPointer(memScope).rawValue)
    }
}

fun glfwSetWindowPos(window: CValuesRef<GLFWwindow>?, xpos: Int, ypos: Int): Unit {
    memScoped {
        return kniBridge486(window?.getPointer(memScope).rawValue, xpos, ypos)
    }
}

fun glfwGetWindowSize(window: CValuesRef<GLFWwindow>?, width: CValuesRef<IntVar>?, height: CValuesRef<IntVar>?): Unit {
    memScoped {
        return kniBridge487(window?.getPointer(memScope).rawValue, width?.getPointer(memScope).rawValue, height?.getPointer(memScope).rawValue)
    }
}

fun glfwSetWindowSizeLimits(window: CValuesRef<GLFWwindow>?, minwidth: Int, minheight: Int, maxwidth: Int, maxheight: Int): Unit {
    memScoped {
        return kniBridge488(window?.getPointer(memScope).rawValue, minwidth, minheight, maxwidth, maxheight)
    }
}

fun glfwSetWindowAspectRatio(window: CValuesRef<GLFWwindow>?, numer: Int, denom: Int): Unit {
    memScoped {
        return kniBridge489(window?.getPointer(memScope).rawValue, numer, denom)
    }
}

fun glfwSetWindowSize(window: CValuesRef<GLFWwindow>?, width: Int, height: Int): Unit {
    memScoped {
        return kniBridge490(window?.getPointer(memScope).rawValue, width, height)
    }
}

fun glfwGetFramebufferSize(window: CValuesRef<GLFWwindow>?, width: CValuesRef<IntVar>?, height: CValuesRef<IntVar>?): Unit {
    memScoped {
        return kniBridge491(window?.getPointer(memScope).rawValue, width?.getPointer(memScope).rawValue, height?.getPointer(memScope).rawValue)
    }
}

fun glfwGetWindowFrameSize(window: CValuesRef<GLFWwindow>?, left: CValuesRef<IntVar>?, top: CValuesRef<IntVar>?, right: CValuesRef<IntVar>?, bottom: CValuesRef<IntVar>?): Unit {
    memScoped {
        return kniBridge492(window?.getPointer(memScope).rawValue, left?.getPointer(memScope).rawValue, top?.getPointer(memScope).rawValue, right?.getPointer(memScope).rawValue, bottom?.getPointer(memScope).rawValue)
    }
}

fun glfwIconifyWindow(window: CValuesRef<GLFWwindow>?): Unit {
    memScoped {
        return kniBridge493(window?.getPointer(memScope).rawValue)
    }
}

fun glfwRestoreWindow(window: CValuesRef<GLFWwindow>?): Unit {
    memScoped {
        return kniBridge494(window?.getPointer(memScope).rawValue)
    }
}

fun glfwMaximizeWindow(window: CValuesRef<GLFWwindow>?): Unit {
    memScoped {
        return kniBridge495(window?.getPointer(memScope).rawValue)
    }
}

fun glfwShowWindow(window: CValuesRef<GLFWwindow>?): Unit {
    memScoped {
        return kniBridge496(window?.getPointer(memScope).rawValue)
    }
}

fun glfwHideWindow(window: CValuesRef<GLFWwindow>?): Unit {
    memScoped {
        return kniBridge497(window?.getPointer(memScope).rawValue)
    }
}

fun glfwFocusWindow(window: CValuesRef<GLFWwindow>?): Unit {
    memScoped {
        return kniBridge498(window?.getPointer(memScope).rawValue)
    }
}

fun glfwGetWindowMonitor(window: CValuesRef<GLFWwindow>?): CPointer<GLFWmonitor>? {
    memScoped {
        return interpretCPointer<GLFWmonitor>(kniBridge499(window?.getPointer(memScope).rawValue))
    }
}

fun glfwSetWindowMonitor(window: CValuesRef<GLFWwindow>?, monitor: CValuesRef<GLFWmonitor>?, xpos: Int, ypos: Int, width: Int, height: Int, refreshRate: Int): Unit {
    memScoped {
        return kniBridge500(window?.getPointer(memScope).rawValue, monitor?.getPointer(memScope).rawValue, xpos, ypos, width, height, refreshRate)
    }
}

fun glfwGetWindowAttrib(window: CValuesRef<GLFWwindow>?, attrib: Int): Int {
    memScoped {
        return kniBridge501(window?.getPointer(memScope).rawValue, attrib)
    }
}

fun glfwSetWindowUserPointer(window: CValuesRef<GLFWwindow>?, pointer: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge502(window?.getPointer(memScope).rawValue, pointer?.getPointer(memScope).rawValue)
    }
}

fun glfwGetWindowUserPointer(window: CValuesRef<GLFWwindow>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge503(window?.getPointer(memScope).rawValue))
    }
}

fun glfwSetWindowPosCallback(window: CValuesRef<GLFWwindow>?, cbfun: GLFWwindowposfun?): GLFWwindowposfun? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<GLFWwindow>?, Int, Int) -> Unit>>(kniBridge504(window?.getPointer(memScope).rawValue, cbfun.rawValue))
    }
}

fun glfwSetWindowSizeCallback(window: CValuesRef<GLFWwindow>?, cbfun: GLFWwindowsizefun?): GLFWwindowsizefun? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<GLFWwindow>?, Int, Int) -> Unit>>(kniBridge505(window?.getPointer(memScope).rawValue, cbfun.rawValue))
    }
}

fun glfwSetWindowCloseCallback(window: CValuesRef<GLFWwindow>?, cbfun: GLFWwindowclosefun?): GLFWwindowclosefun? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<GLFWwindow>?) -> Unit>>(kniBridge506(window?.getPointer(memScope).rawValue, cbfun.rawValue))
    }
}

fun glfwSetWindowRefreshCallback(window: CValuesRef<GLFWwindow>?, cbfun: GLFWwindowrefreshfun?): GLFWwindowrefreshfun? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<GLFWwindow>?) -> Unit>>(kniBridge507(window?.getPointer(memScope).rawValue, cbfun.rawValue))
    }
}

fun glfwSetWindowFocusCallback(window: CValuesRef<GLFWwindow>?, cbfun: GLFWwindowfocusfun?): GLFWwindowfocusfun? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<GLFWwindow>?, Int) -> Unit>>(kniBridge508(window?.getPointer(memScope).rawValue, cbfun.rawValue))
    }
}

fun glfwSetWindowIconifyCallback(window: CValuesRef<GLFWwindow>?, cbfun: GLFWwindowiconifyfun?): GLFWwindowiconifyfun? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<GLFWwindow>?, Int) -> Unit>>(kniBridge509(window?.getPointer(memScope).rawValue, cbfun.rawValue))
    }
}

fun glfwSetFramebufferSizeCallback(window: CValuesRef<GLFWwindow>?, cbfun: GLFWframebuffersizefun?): GLFWframebuffersizefun? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<GLFWwindow>?, Int, Int) -> Unit>>(kniBridge510(window?.getPointer(memScope).rawValue, cbfun.rawValue))
    }
}

fun glfwPollEvents(): Unit {
    return kniBridge511()
}

fun glfwWaitEvents(): Unit {
    return kniBridge512()
}

fun glfwWaitEventsTimeout(timeout: Double): Unit {
    return kniBridge513(timeout)
}

fun glfwPostEmptyEvent(): Unit {
    return kniBridge514()
}

fun glfwGetInputMode(window: CValuesRef<GLFWwindow>?, mode: Int): Int {
    memScoped {
        return kniBridge515(window?.getPointer(memScope).rawValue, mode)
    }
}

fun glfwSetInputMode(window: CValuesRef<GLFWwindow>?, mode: Int, value: Int): Unit {
    memScoped {
        return kniBridge516(window?.getPointer(memScope).rawValue, mode, value)
    }
}

fun glfwGetKeyName(key: Int, scancode: Int): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge517(key, scancode))
}

fun glfwGetKey(window: CValuesRef<GLFWwindow>?, key: Int): Int {
    memScoped {
        return kniBridge518(window?.getPointer(memScope).rawValue, key)
    }
}

fun glfwGetMouseButton(window: CValuesRef<GLFWwindow>?, button: Int): Int {
    memScoped {
        return kniBridge519(window?.getPointer(memScope).rawValue, button)
    }
}

fun glfwGetCursorPos(window: CValuesRef<GLFWwindow>?, xpos: CValuesRef<DoubleVar>?, ypos: CValuesRef<DoubleVar>?): Unit {
    memScoped {
        return kniBridge520(window?.getPointer(memScope).rawValue, xpos?.getPointer(memScope).rawValue, ypos?.getPointer(memScope).rawValue)
    }
}

fun glfwSetCursorPos(window: CValuesRef<GLFWwindow>?, xpos: Double, ypos: Double): Unit {
    memScoped {
        return kniBridge521(window?.getPointer(memScope).rawValue, xpos, ypos)
    }
}

fun glfwCreateCursor(image: CValuesRef<GLFWimage>?, xhot: Int, yhot: Int): CPointer<GLFWcursor>? {
    memScoped {
        return interpretCPointer<GLFWcursor>(kniBridge522(image?.getPointer(memScope).rawValue, xhot, yhot))
    }
}

fun glfwCreateStandardCursor(shape: Int): CPointer<GLFWcursor>? {
    return interpretCPointer<GLFWcursor>(kniBridge523(shape))
}

fun glfwDestroyCursor(cursor: CValuesRef<GLFWcursor>?): Unit {
    memScoped {
        return kniBridge524(cursor?.getPointer(memScope).rawValue)
    }
}

fun glfwSetCursor(window: CValuesRef<GLFWwindow>?, cursor: CValuesRef<GLFWcursor>?): Unit {
    memScoped {
        return kniBridge525(window?.getPointer(memScope).rawValue, cursor?.getPointer(memScope).rawValue)
    }
}

fun glfwSetKeyCallback(window: CValuesRef<GLFWwindow>?, cbfun: GLFWkeyfun?): GLFWkeyfun? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<GLFWwindow>?, Int, Int, Int, Int) -> Unit>>(kniBridge526(window?.getPointer(memScope).rawValue, cbfun.rawValue))
    }
}

fun glfwSetCharCallback(window: CValuesRef<GLFWwindow>?, cbfun: GLFWcharfun?): GLFWcharfun? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<GLFWwindow>?, UInt) -> Unit>>(kniBridge527(window?.getPointer(memScope).rawValue, cbfun.rawValue))
    }
}

fun glfwSetCharModsCallback(window: CValuesRef<GLFWwindow>?, cbfun: GLFWcharmodsfun?): GLFWcharmodsfun? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<GLFWwindow>?, UInt, Int) -> Unit>>(kniBridge528(window?.getPointer(memScope).rawValue, cbfun.rawValue))
    }
}

fun glfwSetMouseButtonCallback(window: CValuesRef<GLFWwindow>?, cbfun: GLFWmousebuttonfun?): GLFWmousebuttonfun? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<GLFWwindow>?, Int, Int, Int) -> Unit>>(kniBridge529(window?.getPointer(memScope).rawValue, cbfun.rawValue))
    }
}

fun glfwSetCursorPosCallback(window: CValuesRef<GLFWwindow>?, cbfun: GLFWcursorposfun?): GLFWcursorposfun? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<GLFWwindow>?, Double, Double) -> Unit>>(kniBridge530(window?.getPointer(memScope).rawValue, cbfun.rawValue))
    }
}

fun glfwSetCursorEnterCallback(window: CValuesRef<GLFWwindow>?, cbfun: GLFWcursorenterfun?): GLFWcursorenterfun? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<GLFWwindow>?, Int) -> Unit>>(kniBridge531(window?.getPointer(memScope).rawValue, cbfun.rawValue))
    }
}

fun glfwSetScrollCallback(window: CValuesRef<GLFWwindow>?, cbfun: GLFWscrollfun?): GLFWscrollfun? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<GLFWwindow>?, Double, Double) -> Unit>>(kniBridge532(window?.getPointer(memScope).rawValue, cbfun.rawValue))
    }
}

fun glfwSetDropCallback(window: CValuesRef<GLFWwindow>?, cbfun: GLFWdropfun?): GLFWdropfun? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<GLFWwindow>?, Int, CPointer<CPointerVar<ByteVar>>?) -> Unit>>(kniBridge533(window?.getPointer(memScope).rawValue, cbfun.rawValue))
    }
}

fun glfwJoystickPresent(joy: Int): Int {
    return kniBridge534(joy)
}

fun glfwGetJoystickAxes(joy: Int, count: CValuesRef<IntVar>?): CPointer<FloatVar>? {
    memScoped {
        return interpretCPointer<FloatVar>(kniBridge535(joy, count?.getPointer(memScope).rawValue))
    }
}

fun glfwGetJoystickButtons(joy: Int, count: CValuesRef<IntVar>?): CPointer<UByteVar>? {
    memScoped {
        return interpretCPointer<UByteVar>(kniBridge536(joy, count?.getPointer(memScope).rawValue))
    }
}

fun glfwGetJoystickName(joy: Int): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge537(joy))
}

fun glfwSetJoystickCallback(cbfun: GLFWjoystickfun?): GLFWjoystickfun? {
    return interpretCPointer<CFunction<(Int, Int) -> Unit>>(kniBridge538(cbfun.rawValue))
}

fun glfwSetClipboardString(window: CValuesRef<GLFWwindow>?, string: String?): Unit {
    memScoped {
        return kniBridge539(window?.getPointer(memScope).rawValue, string?.cstr?.getPointer(memScope).rawValue)
    }
}

fun glfwGetClipboardString(window: CValuesRef<GLFWwindow>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge540(window?.getPointer(memScope).rawValue))
    }
}

fun glfwGetTime(): Double {
    return kniBridge541()
}

fun glfwSetTime(time: Double): Unit {
    return kniBridge542(time)
}

fun glfwGetTimerValue(): uint64_t {
    return kniBridge543()
}

fun glfwGetTimerFrequency(): uint64_t {
    return kniBridge544()
}

fun glfwMakeContextCurrent(window: CValuesRef<GLFWwindow>?): Unit {
    memScoped {
        return kniBridge545(window?.getPointer(memScope).rawValue)
    }
}

fun glfwGetCurrentContext(): CPointer<GLFWwindow>? {
    return interpretCPointer<GLFWwindow>(kniBridge546())
}

fun glfwSwapBuffers(window: CValuesRef<GLFWwindow>?): Unit {
    memScoped {
        return kniBridge547(window?.getPointer(memScope).rawValue)
    }
}

fun glfwSwapInterval(interval: Int): Unit {
    return kniBridge548(interval)
}

fun glfwExtensionSupported(extension: String?): Int {
    memScoped {
        return kniBridge549(extension?.cstr?.getPointer(memScope).rawValue)
    }
}

fun glfwGetProcAddress(procname: String?): GLFWglproc? {
    memScoped {
        return interpretCPointer<CFunction<() -> Unit>>(kniBridge550(procname?.cstr?.getPointer(memScope).rawValue))
    }
}

fun glfwVulkanSupported(): Int {
    return kniBridge551()
}

fun glfwGetRequiredInstanceExtensions(count: CValuesRef<uint32_tVar>?): CPointer<CPointerVar<ByteVar>>? {
    memScoped {
        return interpretCPointer<CPointerVar<ByteVar>>(kniBridge552(count?.getPointer(memScope).rawValue))
    }
}

const val _STDINT_H: Int = 1

const val _FEATURES_H: Int = 1

const val _DEFAULT_SOURCE: Int = 1

const val __USE_ISOC11: Int = 1

const val __USE_ISOC99: Int = 1

const val __USE_ISOC95: Int = 1

const val __USE_POSIX_IMPLICITLY: Int = 1

const val _POSIX_SOURCE: Int = 1

const val _POSIX_C_SOURCE: Long = 200809

const val __USE_POSIX: Int = 1

const val __USE_POSIX2: Int = 1

const val __USE_POSIX199309: Int = 1

const val __USE_POSIX199506: Int = 1

const val __USE_XOPEN2K: Int = 1

const val __USE_XOPEN2K8: Int = 1

const val _ATFILE_SOURCE: Int = 1

const val __USE_MISC: Int = 1

const val __USE_ATFILE: Int = 1

const val __USE_FORTIFY_LEVEL: Int = 0

const val __GLIBC_USE_DEPRECATED_GETS: Int = 0

const val _STDC_PREDEF_H: Int = 1

const val __STDC_IEC_559__: Int = 1

const val __STDC_IEC_559_COMPLEX__: Int = 1

const val __STDC_ISO_10646__: Long = 201706

const val __GNU_LIBRARY__: Int = 6

const val __GLIBC__: Int = 2

const val __GLIBC_MINOR__: Int = 28

const val _SYS_CDEFS_H: Int = 1

const val __glibc_c99_flexarr_available: Int = 1

const val __WORDSIZE: Int = 64

const val __WORDSIZE_TIME64_COMPAT32: Int = 1

const val __SYSCALL_WORDSIZE: Int = 64

const val __HAVE_GENERIC_SELECTION: Int = 1

const val __GLIBC_USE_LIB_EXT2: Int = 0

const val __GLIBC_USE_IEC_60559_BFP_EXT: Int = 0

const val __GLIBC_USE_IEC_60559_FUNCS_EXT: Int = 0

const val __GLIBC_USE_IEC_60559_TYPES_EXT: Int = 0

const val _BITS_TYPES_H: Int = 1

const val _BITS_TYPESIZES_H: Int = 1

const val __OFF_T_MATCHES_OFF64_T: Int = 1

const val __INO_T_MATCHES_INO64_T: Int = 1

const val __RLIM_T_MATCHES_RLIM64_T: Int = 1

const val __FD_SETSIZE: Int = 1024

const val _BITS_WCHAR_H: Int = 1

const val __WCHAR_MAX: Int = 2147483647

const val __WCHAR_MIN: Int = -2147483648

const val _BITS_STDINT_INTN_H: Int = 1

const val _BITS_STDINT_UINTN_H: Int = 1

const val INT8_MIN: Int = -128

const val INT16_MIN: Int = -32768

const val INT32_MIN: Int = -2147483648

const val INT64_MIN: Long = -9223372036854775807 - 1

const val INT8_MAX: Int = 127

const val INT16_MAX: Int = 32767

const val INT32_MAX: Int = 2147483647

const val INT64_MAX: Long = 9223372036854775807

const val UINT8_MAX: Int = 255

const val UINT16_MAX: Int = 65535

const val UINT32_MAX: UInt = 4294967295u

const val UINT64_MAX: ULong = 18446744073709551615u

const val INT_LEAST8_MIN: Int = -128

const val INT_LEAST16_MIN: Int = -32768

const val INT_LEAST32_MIN: Int = -2147483648

const val INT_LEAST64_MIN: Long = -9223372036854775807 - 1

const val INT_LEAST8_MAX: Int = 127

const val INT_LEAST16_MAX: Int = 32767

const val INT_LEAST32_MAX: Int = 2147483647

const val INT_LEAST64_MAX: Long = 9223372036854775807

const val UINT_LEAST8_MAX: Int = 255

const val UINT_LEAST16_MAX: Int = 65535

const val UINT_LEAST32_MAX: UInt = 4294967295u

const val UINT_LEAST64_MAX: ULong = 18446744073709551615u

const val INT_FAST8_MIN: Int = -128

const val INT_FAST16_MIN: Long = -9223372036854775807 - 1

const val INT_FAST32_MIN: Long = -9223372036854775807 - 1

const val INT_FAST64_MIN: Long = -9223372036854775807 - 1

const val INT_FAST8_MAX: Int = 127

const val INT_FAST16_MAX: Long = 9223372036854775807

const val INT_FAST32_MAX: Long = 9223372036854775807

const val INT_FAST64_MAX: Long = 9223372036854775807

const val UINT_FAST8_MAX: Int = 255

const val UINT_FAST16_MAX: ULong = 18446744073709551615u

const val UINT_FAST32_MAX: ULong = 18446744073709551615u

const val UINT_FAST64_MAX: ULong = 18446744073709551615u

const val INTPTR_MIN: Long = -9223372036854775807 - 1

const val INTPTR_MAX: Long = 9223372036854775807

const val UINTPTR_MAX: ULong = 18446744073709551615u

const val INTMAX_MIN: Long = -9223372036854775807 - 1

const val INTMAX_MAX: Long = 9223372036854775807

const val UINTMAX_MAX: ULong = 18446744073709551615u

const val PTRDIFF_MIN: Long = -9223372036854775807 - 1

const val PTRDIFF_MAX: Long = 9223372036854775807

const val SIG_ATOMIC_MIN: Int = -2147483648

const val SIG_ATOMIC_MAX: Int = 2147483647

const val SIZE_MAX: ULong = 18446744073709551615u

const val WCHAR_MIN: Int = -2147483648

const val WCHAR_MAX: Int = 2147483647

const val WINT_MIN: UInt = 0u

const val WINT_MAX: UInt = 4294967295u

const val GL_VERSION_1_1: Int = 1

const val GL_VERSION_1_2: Int = 1

const val GL_VERSION_1_3: Int = 1

const val GL_ARB_imaging: Int = 1

const val GL_FALSE: Int = 0

const val GL_TRUE: Int = 1

const val GL_BYTE: Int = 5120

const val GL_UNSIGNED_BYTE: Int = 5121

const val GL_SHORT: Int = 5122

const val GL_UNSIGNED_SHORT: Int = 5123

const val GL_INT: Int = 5124

const val GL_UNSIGNED_INT: Int = 5125

const val GL_FLOAT: Int = 5126

const val GL_2_BYTES: Int = 5127

const val GL_3_BYTES: Int = 5128

const val GL_4_BYTES: Int = 5129

const val GL_DOUBLE: Int = 5130

const val GL_POINTS: Int = 0

const val GL_LINES: Int = 1

const val GL_LINE_LOOP: Int = 2

const val GL_LINE_STRIP: Int = 3

const val GL_TRIANGLES: Int = 4

const val GL_TRIANGLE_STRIP: Int = 5

const val GL_TRIANGLE_FAN: Int = 6

const val GL_QUADS: Int = 7

const val GL_QUAD_STRIP: Int = 8

const val GL_POLYGON: Int = 9

const val GL_VERTEX_ARRAY: Int = 32884

const val GL_NORMAL_ARRAY: Int = 32885

const val GL_COLOR_ARRAY: Int = 32886

const val GL_INDEX_ARRAY: Int = 32887

const val GL_TEXTURE_COORD_ARRAY: Int = 32888

const val GL_EDGE_FLAG_ARRAY: Int = 32889

const val GL_VERTEX_ARRAY_SIZE: Int = 32890

const val GL_VERTEX_ARRAY_TYPE: Int = 32891

const val GL_VERTEX_ARRAY_STRIDE: Int = 32892

const val GL_NORMAL_ARRAY_TYPE: Int = 32894

const val GL_NORMAL_ARRAY_STRIDE: Int = 32895

const val GL_COLOR_ARRAY_SIZE: Int = 32897

const val GL_COLOR_ARRAY_TYPE: Int = 32898

const val GL_COLOR_ARRAY_STRIDE: Int = 32899

const val GL_INDEX_ARRAY_TYPE: Int = 32901

const val GL_INDEX_ARRAY_STRIDE: Int = 32902

const val GL_TEXTURE_COORD_ARRAY_SIZE: Int = 32904

const val GL_TEXTURE_COORD_ARRAY_TYPE: Int = 32905

const val GL_TEXTURE_COORD_ARRAY_STRIDE: Int = 32906

const val GL_EDGE_FLAG_ARRAY_STRIDE: Int = 32908

const val GL_VERTEX_ARRAY_POINTER: Int = 32910

const val GL_NORMAL_ARRAY_POINTER: Int = 32911

const val GL_COLOR_ARRAY_POINTER: Int = 32912

const val GL_INDEX_ARRAY_POINTER: Int = 32913

const val GL_TEXTURE_COORD_ARRAY_POINTER: Int = 32914

const val GL_EDGE_FLAG_ARRAY_POINTER: Int = 32915

const val GL_V2F: Int = 10784

const val GL_V3F: Int = 10785

const val GL_C4UB_V2F: Int = 10786

const val GL_C4UB_V3F: Int = 10787

const val GL_C3F_V3F: Int = 10788

const val GL_N3F_V3F: Int = 10789

const val GL_C4F_N3F_V3F: Int = 10790

const val GL_T2F_V3F: Int = 10791

const val GL_T4F_V4F: Int = 10792

const val GL_T2F_C4UB_V3F: Int = 10793

const val GL_T2F_C3F_V3F: Int = 10794

const val GL_T2F_N3F_V3F: Int = 10795

const val GL_T2F_C4F_N3F_V3F: Int = 10796

const val GL_T4F_C4F_N3F_V4F: Int = 10797

const val GL_MATRIX_MODE: Int = 2976

const val GL_MODELVIEW: Int = 5888

const val GL_PROJECTION: Int = 5889

const val GL_TEXTURE: Int = 5890

const val GL_POINT_SMOOTH: Int = 2832

const val GL_POINT_SIZE: Int = 2833

const val GL_POINT_SIZE_GRANULARITY: Int = 2835

const val GL_POINT_SIZE_RANGE: Int = 2834

const val GL_LINE_SMOOTH: Int = 2848

const val GL_LINE_STIPPLE: Int = 2852

const val GL_LINE_STIPPLE_PATTERN: Int = 2853

const val GL_LINE_STIPPLE_REPEAT: Int = 2854

const val GL_LINE_WIDTH: Int = 2849

const val GL_LINE_WIDTH_GRANULARITY: Int = 2851

const val GL_LINE_WIDTH_RANGE: Int = 2850

const val GL_POINT: Int = 6912

const val GL_LINE: Int = 6913

const val GL_FILL: Int = 6914

const val GL_CW: Int = 2304

const val GL_CCW: Int = 2305

const val GL_FRONT: Int = 1028

const val GL_BACK: Int = 1029

const val GL_POLYGON_MODE: Int = 2880

const val GL_POLYGON_SMOOTH: Int = 2881

const val GL_POLYGON_STIPPLE: Int = 2882

const val GL_EDGE_FLAG: Int = 2883

const val GL_CULL_FACE: Int = 2884

const val GL_CULL_FACE_MODE: Int = 2885

const val GL_FRONT_FACE: Int = 2886

const val GL_POLYGON_OFFSET_FACTOR: Int = 32824

const val GL_POLYGON_OFFSET_UNITS: Int = 10752

const val GL_POLYGON_OFFSET_POINT: Int = 10753

const val GL_POLYGON_OFFSET_LINE: Int = 10754

const val GL_POLYGON_OFFSET_FILL: Int = 32823

const val GL_COMPILE: Int = 4864

const val GL_COMPILE_AND_EXECUTE: Int = 4865

const val GL_LIST_BASE: Int = 2866

const val GL_LIST_INDEX: Int = 2867

const val GL_LIST_MODE: Int = 2864

const val GL_NEVER: Int = 512

const val GL_LESS: Int = 513

const val GL_EQUAL: Int = 514

const val GL_LEQUAL: Int = 515

const val GL_GREATER: Int = 516

const val GL_NOTEQUAL: Int = 517

const val GL_GEQUAL: Int = 518

const val GL_ALWAYS: Int = 519

const val GL_DEPTH_TEST: Int = 2929

const val GL_DEPTH_BITS: Int = 3414

const val GL_DEPTH_CLEAR_VALUE: Int = 2931

const val GL_DEPTH_FUNC: Int = 2932

const val GL_DEPTH_RANGE: Int = 2928

const val GL_DEPTH_WRITEMASK: Int = 2930

const val GL_DEPTH_COMPONENT: Int = 6402

const val GL_LIGHTING: Int = 2896

const val GL_LIGHT0: Int = 16384

const val GL_LIGHT1: Int = 16385

const val GL_LIGHT2: Int = 16386

const val GL_LIGHT3: Int = 16387

const val GL_LIGHT4: Int = 16388

const val GL_LIGHT5: Int = 16389

const val GL_LIGHT6: Int = 16390

const val GL_LIGHT7: Int = 16391

const val GL_SPOT_EXPONENT: Int = 4613

const val GL_SPOT_CUTOFF: Int = 4614

const val GL_CONSTANT_ATTENUATION: Int = 4615

const val GL_LINEAR_ATTENUATION: Int = 4616

const val GL_QUADRATIC_ATTENUATION: Int = 4617

const val GL_AMBIENT: Int = 4608

const val GL_DIFFUSE: Int = 4609

const val GL_SPECULAR: Int = 4610

const val GL_SHININESS: Int = 5633

const val GL_EMISSION: Int = 5632

const val GL_POSITION: Int = 4611

const val GL_SPOT_DIRECTION: Int = 4612

const val GL_AMBIENT_AND_DIFFUSE: Int = 5634

const val GL_COLOR_INDEXES: Int = 5635

const val GL_LIGHT_MODEL_TWO_SIDE: Int = 2898

const val GL_LIGHT_MODEL_LOCAL_VIEWER: Int = 2897

const val GL_LIGHT_MODEL_AMBIENT: Int = 2899

const val GL_FRONT_AND_BACK: Int = 1032

const val GL_SHADE_MODEL: Int = 2900

const val GL_FLAT: Int = 7424

const val GL_SMOOTH: Int = 7425

const val GL_COLOR_MATERIAL: Int = 2903

const val GL_COLOR_MATERIAL_FACE: Int = 2901

const val GL_COLOR_MATERIAL_PARAMETER: Int = 2902

const val GL_NORMALIZE: Int = 2977

const val GL_CLIP_PLANE0: Int = 12288

const val GL_CLIP_PLANE1: Int = 12289

const val GL_CLIP_PLANE2: Int = 12290

const val GL_CLIP_PLANE3: Int = 12291

const val GL_CLIP_PLANE4: Int = 12292

const val GL_CLIP_PLANE5: Int = 12293

const val GL_ACCUM_RED_BITS: Int = 3416

const val GL_ACCUM_GREEN_BITS: Int = 3417

const val GL_ACCUM_BLUE_BITS: Int = 3418

const val GL_ACCUM_ALPHA_BITS: Int = 3419

const val GL_ACCUM_CLEAR_VALUE: Int = 2944

const val GL_ACCUM: Int = 256

const val GL_ADD: Int = 260

const val GL_LOAD: Int = 257

const val GL_MULT: Int = 259

const val GL_RETURN: Int = 258

const val GL_ALPHA_TEST: Int = 3008

const val GL_ALPHA_TEST_REF: Int = 3010

const val GL_ALPHA_TEST_FUNC: Int = 3009

const val GL_BLEND: Int = 3042

const val GL_BLEND_SRC: Int = 3041

const val GL_BLEND_DST: Int = 3040

const val GL_ZERO: Int = 0

const val GL_ONE: Int = 1

const val GL_SRC_COLOR: Int = 768

const val GL_ONE_MINUS_SRC_COLOR: Int = 769

const val GL_SRC_ALPHA: Int = 770

const val GL_ONE_MINUS_SRC_ALPHA: Int = 771

const val GL_DST_ALPHA: Int = 772

const val GL_ONE_MINUS_DST_ALPHA: Int = 773

const val GL_DST_COLOR: Int = 774

const val GL_ONE_MINUS_DST_COLOR: Int = 775

const val GL_SRC_ALPHA_SATURATE: Int = 776

const val GL_FEEDBACK: Int = 7169

const val GL_RENDER: Int = 7168

const val GL_SELECT: Int = 7170

const val GL_2D: Int = 1536

const val GL_3D: Int = 1537

const val GL_3D_COLOR: Int = 1538

const val GL_3D_COLOR_TEXTURE: Int = 1539

const val GL_4D_COLOR_TEXTURE: Int = 1540

const val GL_POINT_TOKEN: Int = 1793

const val GL_LINE_TOKEN: Int = 1794

const val GL_LINE_RESET_TOKEN: Int = 1799

const val GL_POLYGON_TOKEN: Int = 1795

const val GL_BITMAP_TOKEN: Int = 1796

const val GL_DRAW_PIXEL_TOKEN: Int = 1797

const val GL_COPY_PIXEL_TOKEN: Int = 1798

const val GL_PASS_THROUGH_TOKEN: Int = 1792

const val GL_FEEDBACK_BUFFER_POINTER: Int = 3568

const val GL_FEEDBACK_BUFFER_SIZE: Int = 3569

const val GL_FEEDBACK_BUFFER_TYPE: Int = 3570

const val GL_SELECTION_BUFFER_POINTER: Int = 3571

const val GL_SELECTION_BUFFER_SIZE: Int = 3572

const val GL_FOG: Int = 2912

const val GL_FOG_MODE: Int = 2917

const val GL_FOG_DENSITY: Int = 2914

const val GL_FOG_COLOR: Int = 2918

const val GL_FOG_INDEX: Int = 2913

const val GL_FOG_START: Int = 2915

const val GL_FOG_END: Int = 2916

const val GL_LINEAR: Int = 9729

const val GL_EXP: Int = 2048

const val GL_EXP2: Int = 2049

const val GL_LOGIC_OP: Int = 3057

const val GL_INDEX_LOGIC_OP: Int = 3057

const val GL_COLOR_LOGIC_OP: Int = 3058

const val GL_LOGIC_OP_MODE: Int = 3056

const val GL_CLEAR: Int = 5376

const val GL_SET: Int = 5391

const val GL_COPY: Int = 5379

const val GL_COPY_INVERTED: Int = 5388

const val GL_NOOP: Int = 5381

const val GL_INVERT: Int = 5386

const val GL_AND: Int = 5377

const val GL_NAND: Int = 5390

const val GL_OR: Int = 5383

const val GL_NOR: Int = 5384

const val GL_XOR: Int = 5382

const val GL_EQUIV: Int = 5385

const val GL_AND_REVERSE: Int = 5378

const val GL_AND_INVERTED: Int = 5380

const val GL_OR_REVERSE: Int = 5387

const val GL_OR_INVERTED: Int = 5389

const val GL_STENCIL_BITS: Int = 3415

const val GL_STENCIL_TEST: Int = 2960

const val GL_STENCIL_CLEAR_VALUE: Int = 2961

const val GL_STENCIL_FUNC: Int = 2962

const val GL_STENCIL_VALUE_MASK: Int = 2963

const val GL_STENCIL_FAIL: Int = 2964

const val GL_STENCIL_PASS_DEPTH_FAIL: Int = 2965

const val GL_STENCIL_PASS_DEPTH_PASS: Int = 2966

const val GL_STENCIL_REF: Int = 2967

const val GL_STENCIL_WRITEMASK: Int = 2968

const val GL_STENCIL_INDEX: Int = 6401

const val GL_KEEP: Int = 7680

const val GL_REPLACE: Int = 7681

const val GL_INCR: Int = 7682

const val GL_DECR: Int = 7683

const val GL_NONE: Int = 0

const val GL_LEFT: Int = 1030

const val GL_RIGHT: Int = 1031

const val GL_FRONT_LEFT: Int = 1024

const val GL_FRONT_RIGHT: Int = 1025

const val GL_BACK_LEFT: Int = 1026

const val GL_BACK_RIGHT: Int = 1027

const val GL_AUX0: Int = 1033

const val GL_AUX1: Int = 1034

const val GL_AUX2: Int = 1035

const val GL_AUX3: Int = 1036

const val GL_COLOR_INDEX: Int = 6400

const val GL_RED: Int = 6403

const val GL_GREEN: Int = 6404

const val GL_BLUE: Int = 6405

const val GL_ALPHA: Int = 6406

const val GL_LUMINANCE: Int = 6409

const val GL_LUMINANCE_ALPHA: Int = 6410

const val GL_ALPHA_BITS: Int = 3413

const val GL_RED_BITS: Int = 3410

const val GL_GREEN_BITS: Int = 3411

const val GL_BLUE_BITS: Int = 3412

const val GL_INDEX_BITS: Int = 3409

const val GL_SUBPIXEL_BITS: Int = 3408

const val GL_AUX_BUFFERS: Int = 3072

const val GL_READ_BUFFER: Int = 3074

const val GL_DRAW_BUFFER: Int = 3073

const val GL_DOUBLEBUFFER: Int = 3122

const val GL_STEREO: Int = 3123

const val GL_BITMAP: Int = 6656

const val GL_COLOR: Int = 6144

const val GL_DEPTH: Int = 6145

const val GL_STENCIL: Int = 6146

const val GL_DITHER: Int = 3024

const val GL_RGB: Int = 6407

const val GL_RGBA: Int = 6408

const val GL_MAX_LIST_NESTING: Int = 2865

const val GL_MAX_EVAL_ORDER: Int = 3376

const val GL_MAX_LIGHTS: Int = 3377

const val GL_MAX_CLIP_PLANES: Int = 3378

const val GL_MAX_TEXTURE_SIZE: Int = 3379

const val GL_MAX_PIXEL_MAP_TABLE: Int = 3380

const val GL_MAX_ATTRIB_STACK_DEPTH: Int = 3381

const val GL_MAX_MODELVIEW_STACK_DEPTH: Int = 3382

const val GL_MAX_NAME_STACK_DEPTH: Int = 3383

const val GL_MAX_PROJECTION_STACK_DEPTH: Int = 3384

const val GL_MAX_TEXTURE_STACK_DEPTH: Int = 3385

const val GL_MAX_VIEWPORT_DIMS: Int = 3386

const val GL_MAX_CLIENT_ATTRIB_STACK_DEPTH: Int = 3387

const val GL_ATTRIB_STACK_DEPTH: Int = 2992

const val GL_CLIENT_ATTRIB_STACK_DEPTH: Int = 2993

const val GL_COLOR_CLEAR_VALUE: Int = 3106

const val GL_COLOR_WRITEMASK: Int = 3107

const val GL_CURRENT_INDEX: Int = 2817

const val GL_CURRENT_COLOR: Int = 2816

const val GL_CURRENT_NORMAL: Int = 2818

const val GL_CURRENT_RASTER_COLOR: Int = 2820

const val GL_CURRENT_RASTER_DISTANCE: Int = 2825

const val GL_CURRENT_RASTER_INDEX: Int = 2821

const val GL_CURRENT_RASTER_POSITION: Int = 2823

const val GL_CURRENT_RASTER_TEXTURE_COORDS: Int = 2822

const val GL_CURRENT_RASTER_POSITION_VALID: Int = 2824

const val GL_CURRENT_TEXTURE_COORDS: Int = 2819

const val GL_INDEX_CLEAR_VALUE: Int = 3104

const val GL_INDEX_MODE: Int = 3120

const val GL_INDEX_WRITEMASK: Int = 3105

const val GL_MODELVIEW_MATRIX: Int = 2982

const val GL_MODELVIEW_STACK_DEPTH: Int = 2979

const val GL_NAME_STACK_DEPTH: Int = 3440

const val GL_PROJECTION_MATRIX: Int = 2983

const val GL_PROJECTION_STACK_DEPTH: Int = 2980

const val GL_RENDER_MODE: Int = 3136

const val GL_RGBA_MODE: Int = 3121

const val GL_TEXTURE_MATRIX: Int = 2984

const val GL_TEXTURE_STACK_DEPTH: Int = 2981

const val GL_VIEWPORT: Int = 2978

const val GL_AUTO_NORMAL: Int = 3456

const val GL_MAP1_COLOR_4: Int = 3472

const val GL_MAP1_INDEX: Int = 3473

const val GL_MAP1_NORMAL: Int = 3474

const val GL_MAP1_TEXTURE_COORD_1: Int = 3475

const val GL_MAP1_TEXTURE_COORD_2: Int = 3476

const val GL_MAP1_TEXTURE_COORD_3: Int = 3477

const val GL_MAP1_TEXTURE_COORD_4: Int = 3478

const val GL_MAP1_VERTEX_3: Int = 3479

const val GL_MAP1_VERTEX_4: Int = 3480

const val GL_MAP2_COLOR_4: Int = 3504

const val GL_MAP2_INDEX: Int = 3505

const val GL_MAP2_NORMAL: Int = 3506

const val GL_MAP2_TEXTURE_COORD_1: Int = 3507

const val GL_MAP2_TEXTURE_COORD_2: Int = 3508

const val GL_MAP2_TEXTURE_COORD_3: Int = 3509

const val GL_MAP2_TEXTURE_COORD_4: Int = 3510

const val GL_MAP2_VERTEX_3: Int = 3511

const val GL_MAP2_VERTEX_4: Int = 3512

const val GL_MAP1_GRID_DOMAIN: Int = 3536

const val GL_MAP1_GRID_SEGMENTS: Int = 3537

const val GL_MAP2_GRID_DOMAIN: Int = 3538

const val GL_MAP2_GRID_SEGMENTS: Int = 3539

const val GL_COEFF: Int = 2560

const val GL_ORDER: Int = 2561

const val GL_DOMAIN: Int = 2562

const val GL_PERSPECTIVE_CORRECTION_HINT: Int = 3152

const val GL_POINT_SMOOTH_HINT: Int = 3153

const val GL_LINE_SMOOTH_HINT: Int = 3154

const val GL_POLYGON_SMOOTH_HINT: Int = 3155

const val GL_FOG_HINT: Int = 3156

const val GL_DONT_CARE: Int = 4352

const val GL_FASTEST: Int = 4353

const val GL_NICEST: Int = 4354

const val GL_SCISSOR_BOX: Int = 3088

const val GL_SCISSOR_TEST: Int = 3089

const val GL_MAP_COLOR: Int = 3344

const val GL_MAP_STENCIL: Int = 3345

const val GL_INDEX_SHIFT: Int = 3346

const val GL_INDEX_OFFSET: Int = 3347

const val GL_RED_SCALE: Int = 3348

const val GL_RED_BIAS: Int = 3349

const val GL_GREEN_SCALE: Int = 3352

const val GL_GREEN_BIAS: Int = 3353

const val GL_BLUE_SCALE: Int = 3354

const val GL_BLUE_BIAS: Int = 3355

const val GL_ALPHA_SCALE: Int = 3356

const val GL_ALPHA_BIAS: Int = 3357

const val GL_DEPTH_SCALE: Int = 3358

const val GL_DEPTH_BIAS: Int = 3359

const val GL_PIXEL_MAP_S_TO_S_SIZE: Int = 3249

const val GL_PIXEL_MAP_I_TO_I_SIZE: Int = 3248

const val GL_PIXEL_MAP_I_TO_R_SIZE: Int = 3250

const val GL_PIXEL_MAP_I_TO_G_SIZE: Int = 3251

const val GL_PIXEL_MAP_I_TO_B_SIZE: Int = 3252

const val GL_PIXEL_MAP_I_TO_A_SIZE: Int = 3253

const val GL_PIXEL_MAP_R_TO_R_SIZE: Int = 3254

const val GL_PIXEL_MAP_G_TO_G_SIZE: Int = 3255

const val GL_PIXEL_MAP_B_TO_B_SIZE: Int = 3256

const val GL_PIXEL_MAP_A_TO_A_SIZE: Int = 3257

const val GL_PIXEL_MAP_S_TO_S: Int = 3185

const val GL_PIXEL_MAP_I_TO_I: Int = 3184

const val GL_PIXEL_MAP_I_TO_R: Int = 3186

const val GL_PIXEL_MAP_I_TO_G: Int = 3187

const val GL_PIXEL_MAP_I_TO_B: Int = 3188

const val GL_PIXEL_MAP_I_TO_A: Int = 3189

const val GL_PIXEL_MAP_R_TO_R: Int = 3190

const val GL_PIXEL_MAP_G_TO_G: Int = 3191

const val GL_PIXEL_MAP_B_TO_B: Int = 3192

const val GL_PIXEL_MAP_A_TO_A: Int = 3193

const val GL_PACK_ALIGNMENT: Int = 3333

const val GL_PACK_LSB_FIRST: Int = 3329

const val GL_PACK_ROW_LENGTH: Int = 3330

const val GL_PACK_SKIP_PIXELS: Int = 3332

const val GL_PACK_SKIP_ROWS: Int = 3331

const val GL_PACK_SWAP_BYTES: Int = 3328

const val GL_UNPACK_ALIGNMENT: Int = 3317

const val GL_UNPACK_LSB_FIRST: Int = 3313

const val GL_UNPACK_ROW_LENGTH: Int = 3314

const val GL_UNPACK_SKIP_PIXELS: Int = 3316

const val GL_UNPACK_SKIP_ROWS: Int = 3315

const val GL_UNPACK_SWAP_BYTES: Int = 3312

const val GL_ZOOM_X: Int = 3350

const val GL_ZOOM_Y: Int = 3351

const val GL_TEXTURE_ENV: Int = 8960

const val GL_TEXTURE_ENV_MODE: Int = 8704

const val GL_TEXTURE_1D: Int = 3552

const val GL_TEXTURE_2D: Int = 3553

const val GL_TEXTURE_WRAP_S: Int = 10242

const val GL_TEXTURE_WRAP_T: Int = 10243

const val GL_TEXTURE_MAG_FILTER: Int = 10240

const val GL_TEXTURE_MIN_FILTER: Int = 10241

const val GL_TEXTURE_ENV_COLOR: Int = 8705

const val GL_TEXTURE_GEN_S: Int = 3168

const val GL_TEXTURE_GEN_T: Int = 3169

const val GL_TEXTURE_GEN_R: Int = 3170

const val GL_TEXTURE_GEN_Q: Int = 3171

const val GL_TEXTURE_GEN_MODE: Int = 9472

const val GL_TEXTURE_BORDER_COLOR: Int = 4100

const val GL_TEXTURE_WIDTH: Int = 4096

const val GL_TEXTURE_HEIGHT: Int = 4097

const val GL_TEXTURE_BORDER: Int = 4101

const val GL_TEXTURE_COMPONENTS: Int = 4099

const val GL_TEXTURE_RED_SIZE: Int = 32860

const val GL_TEXTURE_GREEN_SIZE: Int = 32861

const val GL_TEXTURE_BLUE_SIZE: Int = 32862

const val GL_TEXTURE_ALPHA_SIZE: Int = 32863

const val GL_TEXTURE_LUMINANCE_SIZE: Int = 32864

const val GL_TEXTURE_INTENSITY_SIZE: Int = 32865

const val GL_NEAREST_MIPMAP_NEAREST: Int = 9984

const val GL_NEAREST_MIPMAP_LINEAR: Int = 9986

const val GL_LINEAR_MIPMAP_NEAREST: Int = 9985

const val GL_LINEAR_MIPMAP_LINEAR: Int = 9987

const val GL_OBJECT_LINEAR: Int = 9217

const val GL_OBJECT_PLANE: Int = 9473

const val GL_EYE_LINEAR: Int = 9216

const val GL_EYE_PLANE: Int = 9474

const val GL_SPHERE_MAP: Int = 9218

const val GL_DECAL: Int = 8449

const val GL_MODULATE: Int = 8448

const val GL_NEAREST: Int = 9728

const val GL_REPEAT: Int = 10497

const val GL_CLAMP: Int = 10496

const val GL_S: Int = 8192

const val GL_T: Int = 8193

const val GL_R: Int = 8194

const val GL_Q: Int = 8195

const val GL_VENDOR: Int = 7936

const val GL_RENDERER: Int = 7937

const val GL_VERSION: Int = 7938

const val GL_EXTENSIONS: Int = 7939

const val GL_NO_ERROR: Int = 0

const val GL_INVALID_ENUM: Int = 1280

const val GL_INVALID_VALUE: Int = 1281

const val GL_INVALID_OPERATION: Int = 1282

const val GL_STACK_OVERFLOW: Int = 1283

const val GL_STACK_UNDERFLOW: Int = 1284

const val GL_OUT_OF_MEMORY: Int = 1285

const val GL_CURRENT_BIT: Int = 1

const val GL_POINT_BIT: Int = 2

const val GL_LINE_BIT: Int = 4

const val GL_POLYGON_BIT: Int = 8

const val GL_POLYGON_STIPPLE_BIT: Int = 16

const val GL_PIXEL_MODE_BIT: Int = 32

const val GL_LIGHTING_BIT: Int = 64

const val GL_FOG_BIT: Int = 128

const val GL_DEPTH_BUFFER_BIT: Int = 256

const val GL_ACCUM_BUFFER_BIT: Int = 512

const val GL_STENCIL_BUFFER_BIT: Int = 1024

const val GL_VIEWPORT_BIT: Int = 2048

const val GL_TRANSFORM_BIT: Int = 4096

const val GL_ENABLE_BIT: Int = 8192

const val GL_COLOR_BUFFER_BIT: Int = 16384

const val GL_HINT_BIT: Int = 32768

const val GL_EVAL_BIT: Int = 65536

const val GL_LIST_BIT: Int = 131072

const val GL_TEXTURE_BIT: Int = 262144

const val GL_SCISSOR_BIT: Int = 524288

const val GL_ALL_ATTRIB_BITS: UInt = 4294967295u

const val GL_PROXY_TEXTURE_1D: Int = 32867

const val GL_PROXY_TEXTURE_2D: Int = 32868

const val GL_TEXTURE_PRIORITY: Int = 32870

const val GL_TEXTURE_RESIDENT: Int = 32871

const val GL_TEXTURE_BINDING_1D: Int = 32872

const val GL_TEXTURE_BINDING_2D: Int = 32873

const val GL_TEXTURE_INTERNAL_FORMAT: Int = 4099

const val GL_ALPHA4: Int = 32827

const val GL_ALPHA8: Int = 32828

const val GL_ALPHA12: Int = 32829

const val GL_ALPHA16: Int = 32830

const val GL_LUMINANCE4: Int = 32831

const val GL_LUMINANCE8: Int = 32832

const val GL_LUMINANCE12: Int = 32833

const val GL_LUMINANCE16: Int = 32834

const val GL_LUMINANCE4_ALPHA4: Int = 32835

const val GL_LUMINANCE6_ALPHA2: Int = 32836

const val GL_LUMINANCE8_ALPHA8: Int = 32837

const val GL_LUMINANCE12_ALPHA4: Int = 32838

const val GL_LUMINANCE12_ALPHA12: Int = 32839

const val GL_LUMINANCE16_ALPHA16: Int = 32840

const val GL_INTENSITY: Int = 32841

const val GL_INTENSITY4: Int = 32842

const val GL_INTENSITY8: Int = 32843

const val GL_INTENSITY12: Int = 32844

const val GL_INTENSITY16: Int = 32845

const val GL_R3_G3_B2: Int = 10768

const val GL_RGB4: Int = 32847

const val GL_RGB5: Int = 32848

const val GL_RGB8: Int = 32849

const val GL_RGB10: Int = 32850

const val GL_RGB12: Int = 32851

const val GL_RGB16: Int = 32852

const val GL_RGBA2: Int = 32853

const val GL_RGBA4: Int = 32854

const val GL_RGB5_A1: Int = 32855

const val GL_RGBA8: Int = 32856

const val GL_RGB10_A2: Int = 32857

const val GL_RGBA12: Int = 32858

const val GL_RGBA16: Int = 32859

const val GL_CLIENT_PIXEL_STORE_BIT: Int = 1

const val GL_CLIENT_VERTEX_ARRAY_BIT: Int = 2

const val GL_ALL_CLIENT_ATTRIB_BITS: UInt = 4294967295u

const val GL_CLIENT_ALL_ATTRIB_BITS: UInt = 4294967295u

const val GL_RESCALE_NORMAL: Int = 32826

const val GL_CLAMP_TO_EDGE: Int = 33071

const val GL_MAX_ELEMENTS_VERTICES: Int = 33000

const val GL_MAX_ELEMENTS_INDICES: Int = 33001

const val GL_BGR: Int = 32992

const val GL_BGRA: Int = 32993

const val GL_UNSIGNED_BYTE_3_3_2: Int = 32818

const val GL_UNSIGNED_BYTE_2_3_3_REV: Int = 33634

const val GL_UNSIGNED_SHORT_5_6_5: Int = 33635

const val GL_UNSIGNED_SHORT_5_6_5_REV: Int = 33636

const val GL_UNSIGNED_SHORT_4_4_4_4: Int = 32819

const val GL_UNSIGNED_SHORT_4_4_4_4_REV: Int = 33637

const val GL_UNSIGNED_SHORT_5_5_5_1: Int = 32820

const val GL_UNSIGNED_SHORT_1_5_5_5_REV: Int = 33638

const val GL_UNSIGNED_INT_8_8_8_8: Int = 32821

const val GL_UNSIGNED_INT_8_8_8_8_REV: Int = 33639

const val GL_UNSIGNED_INT_10_10_10_2: Int = 32822

const val GL_UNSIGNED_INT_2_10_10_10_REV: Int = 33640

const val GL_LIGHT_MODEL_COLOR_CONTROL: Int = 33272

const val GL_SINGLE_COLOR: Int = 33273

const val GL_SEPARATE_SPECULAR_COLOR: Int = 33274

const val GL_TEXTURE_MIN_LOD: Int = 33082

const val GL_TEXTURE_MAX_LOD: Int = 33083

const val GL_TEXTURE_BASE_LEVEL: Int = 33084

const val GL_TEXTURE_MAX_LEVEL: Int = 33085

const val GL_SMOOTH_POINT_SIZE_RANGE: Int = 2834

const val GL_SMOOTH_POINT_SIZE_GRANULARITY: Int = 2835

const val GL_SMOOTH_LINE_WIDTH_RANGE: Int = 2850

const val GL_SMOOTH_LINE_WIDTH_GRANULARITY: Int = 2851

const val GL_ALIASED_POINT_SIZE_RANGE: Int = 33901

const val GL_ALIASED_LINE_WIDTH_RANGE: Int = 33902

const val GL_PACK_SKIP_IMAGES: Int = 32875

const val GL_PACK_IMAGE_HEIGHT: Int = 32876

const val GL_UNPACK_SKIP_IMAGES: Int = 32877

const val GL_UNPACK_IMAGE_HEIGHT: Int = 32878

const val GL_TEXTURE_3D: Int = 32879

const val GL_PROXY_TEXTURE_3D: Int = 32880

const val GL_TEXTURE_DEPTH: Int = 32881

const val GL_TEXTURE_WRAP_R: Int = 32882

const val GL_MAX_3D_TEXTURE_SIZE: Int = 32883

const val GL_TEXTURE_BINDING_3D: Int = 32874

const val GL_CONSTANT_COLOR: Int = 32769

const val GL_ONE_MINUS_CONSTANT_COLOR: Int = 32770

const val GL_CONSTANT_ALPHA: Int = 32771

const val GL_ONE_MINUS_CONSTANT_ALPHA: Int = 32772

const val GL_COLOR_TABLE: Int = 32976

const val GL_POST_CONVOLUTION_COLOR_TABLE: Int = 32977

const val GL_POST_COLOR_MATRIX_COLOR_TABLE: Int = 32978

const val GL_PROXY_COLOR_TABLE: Int = 32979

const val GL_PROXY_POST_CONVOLUTION_COLOR_TABLE: Int = 32980

const val GL_PROXY_POST_COLOR_MATRIX_COLOR_TABLE: Int = 32981

const val GL_COLOR_TABLE_SCALE: Int = 32982

const val GL_COLOR_TABLE_BIAS: Int = 32983

const val GL_COLOR_TABLE_FORMAT: Int = 32984

const val GL_COLOR_TABLE_WIDTH: Int = 32985

const val GL_COLOR_TABLE_RED_SIZE: Int = 32986

const val GL_COLOR_TABLE_GREEN_SIZE: Int = 32987

const val GL_COLOR_TABLE_BLUE_SIZE: Int = 32988

const val GL_COLOR_TABLE_ALPHA_SIZE: Int = 32989

const val GL_COLOR_TABLE_LUMINANCE_SIZE: Int = 32990

const val GL_COLOR_TABLE_INTENSITY_SIZE: Int = 32991

const val GL_CONVOLUTION_1D: Int = 32784

const val GL_CONVOLUTION_2D: Int = 32785

const val GL_SEPARABLE_2D: Int = 32786

const val GL_CONVOLUTION_BORDER_MODE: Int = 32787

const val GL_CONVOLUTION_FILTER_SCALE: Int = 32788

const val GL_CONVOLUTION_FILTER_BIAS: Int = 32789

const val GL_REDUCE: Int = 32790

const val GL_CONVOLUTION_FORMAT: Int = 32791

const val GL_CONVOLUTION_WIDTH: Int = 32792

const val GL_CONVOLUTION_HEIGHT: Int = 32793

const val GL_MAX_CONVOLUTION_WIDTH: Int = 32794

const val GL_MAX_CONVOLUTION_HEIGHT: Int = 32795

const val GL_POST_CONVOLUTION_RED_SCALE: Int = 32796

const val GL_POST_CONVOLUTION_GREEN_SCALE: Int = 32797

const val GL_POST_CONVOLUTION_BLUE_SCALE: Int = 32798

const val GL_POST_CONVOLUTION_ALPHA_SCALE: Int = 32799

const val GL_POST_CONVOLUTION_RED_BIAS: Int = 32800

const val GL_POST_CONVOLUTION_GREEN_BIAS: Int = 32801

const val GL_POST_CONVOLUTION_BLUE_BIAS: Int = 32802

const val GL_POST_CONVOLUTION_ALPHA_BIAS: Int = 32803

const val GL_CONSTANT_BORDER: Int = 33105

const val GL_REPLICATE_BORDER: Int = 33107

const val GL_CONVOLUTION_BORDER_COLOR: Int = 33108

const val GL_COLOR_MATRIX: Int = 32945

const val GL_COLOR_MATRIX_STACK_DEPTH: Int = 32946

const val GL_MAX_COLOR_MATRIX_STACK_DEPTH: Int = 32947

const val GL_POST_COLOR_MATRIX_RED_SCALE: Int = 32948

const val GL_POST_COLOR_MATRIX_GREEN_SCALE: Int = 32949

const val GL_POST_COLOR_MATRIX_BLUE_SCALE: Int = 32950

const val GL_POST_COLOR_MATRIX_ALPHA_SCALE: Int = 32951

const val GL_POST_COLOR_MATRIX_RED_BIAS: Int = 32952

const val GL_POST_COLOR_MATRIX_GREEN_BIAS: Int = 32953

const val GL_POST_COLOR_MATRIX_BLUE_BIAS: Int = 32954

const val GL_POST_COLOR_MATRIX_ALPHA_BIAS: Int = 32955

const val GL_HISTOGRAM: Int = 32804

const val GL_PROXY_HISTOGRAM: Int = 32805

const val GL_HISTOGRAM_WIDTH: Int = 32806

const val GL_HISTOGRAM_FORMAT: Int = 32807

const val GL_HISTOGRAM_RED_SIZE: Int = 32808

const val GL_HISTOGRAM_GREEN_SIZE: Int = 32809

const val GL_HISTOGRAM_BLUE_SIZE: Int = 32810

const val GL_HISTOGRAM_ALPHA_SIZE: Int = 32811

const val GL_HISTOGRAM_LUMINANCE_SIZE: Int = 32812

const val GL_HISTOGRAM_SINK: Int = 32813

const val GL_MINMAX: Int = 32814

const val GL_MINMAX_FORMAT: Int = 32815

const val GL_MINMAX_SINK: Int = 32816

const val GL_TABLE_TOO_LARGE: Int = 32817

const val GL_BLEND_EQUATION: Int = 32777

const val GL_MIN: Int = 32775

const val GL_MAX: Int = 32776

const val GL_FUNC_ADD: Int = 32774

const val GL_FUNC_SUBTRACT: Int = 32778

const val GL_FUNC_REVERSE_SUBTRACT: Int = 32779

const val GL_BLEND_COLOR: Int = 32773

const val GL_TEXTURE0: Int = 33984

const val GL_TEXTURE1: Int = 33985

const val GL_TEXTURE2: Int = 33986

const val GL_TEXTURE3: Int = 33987

const val GL_TEXTURE4: Int = 33988

const val GL_TEXTURE5: Int = 33989

const val GL_TEXTURE6: Int = 33990

const val GL_TEXTURE7: Int = 33991

const val GL_TEXTURE8: Int = 33992

const val GL_TEXTURE9: Int = 33993

const val GL_TEXTURE10: Int = 33994

const val GL_TEXTURE11: Int = 33995

const val GL_TEXTURE12: Int = 33996

const val GL_TEXTURE13: Int = 33997

const val GL_TEXTURE14: Int = 33998

const val GL_TEXTURE15: Int = 33999

const val GL_TEXTURE16: Int = 34000

const val GL_TEXTURE17: Int = 34001

const val GL_TEXTURE18: Int = 34002

const val GL_TEXTURE19: Int = 34003

const val GL_TEXTURE20: Int = 34004

const val GL_TEXTURE21: Int = 34005

const val GL_TEXTURE22: Int = 34006

const val GL_TEXTURE23: Int = 34007

const val GL_TEXTURE24: Int = 34008

const val GL_TEXTURE25: Int = 34009

const val GL_TEXTURE26: Int = 34010

const val GL_TEXTURE27: Int = 34011

const val GL_TEXTURE28: Int = 34012

const val GL_TEXTURE29: Int = 34013

const val GL_TEXTURE30: Int = 34014

const val GL_TEXTURE31: Int = 34015

const val GL_ACTIVE_TEXTURE: Int = 34016

const val GL_CLIENT_ACTIVE_TEXTURE: Int = 34017

const val GL_MAX_TEXTURE_UNITS: Int = 34018

const val GL_NORMAL_MAP: Int = 34065

const val GL_REFLECTION_MAP: Int = 34066

const val GL_TEXTURE_CUBE_MAP: Int = 34067

const val GL_TEXTURE_BINDING_CUBE_MAP: Int = 34068

const val GL_TEXTURE_CUBE_MAP_POSITIVE_X: Int = 34069

const val GL_TEXTURE_CUBE_MAP_NEGATIVE_X: Int = 34070

const val GL_TEXTURE_CUBE_MAP_POSITIVE_Y: Int = 34071

const val GL_TEXTURE_CUBE_MAP_NEGATIVE_Y: Int = 34072

const val GL_TEXTURE_CUBE_MAP_POSITIVE_Z: Int = 34073

const val GL_TEXTURE_CUBE_MAP_NEGATIVE_Z: Int = 34074

const val GL_PROXY_TEXTURE_CUBE_MAP: Int = 34075

const val GL_MAX_CUBE_MAP_TEXTURE_SIZE: Int = 34076

const val GL_COMPRESSED_ALPHA: Int = 34025

const val GL_COMPRESSED_LUMINANCE: Int = 34026

const val GL_COMPRESSED_LUMINANCE_ALPHA: Int = 34027

const val GL_COMPRESSED_INTENSITY: Int = 34028

const val GL_COMPRESSED_RGB: Int = 34029

const val GL_COMPRESSED_RGBA: Int = 34030

const val GL_TEXTURE_COMPRESSION_HINT: Int = 34031

const val GL_TEXTURE_COMPRESSED_IMAGE_SIZE: Int = 34464

const val GL_TEXTURE_COMPRESSED: Int = 34465

const val GL_NUM_COMPRESSED_TEXTURE_FORMATS: Int = 34466

const val GL_COMPRESSED_TEXTURE_FORMATS: Int = 34467

const val GL_MULTISAMPLE: Int = 32925

const val GL_SAMPLE_ALPHA_TO_COVERAGE: Int = 32926

const val GL_SAMPLE_ALPHA_TO_ONE: Int = 32927

const val GL_SAMPLE_COVERAGE: Int = 32928

const val GL_SAMPLE_BUFFERS: Int = 32936

const val GL_SAMPLES: Int = 32937

const val GL_SAMPLE_COVERAGE_VALUE: Int = 32938

const val GL_SAMPLE_COVERAGE_INVERT: Int = 32939

const val GL_MULTISAMPLE_BIT: Int = 536870912

const val GL_TRANSPOSE_MODELVIEW_MATRIX: Int = 34019

const val GL_TRANSPOSE_PROJECTION_MATRIX: Int = 34020

const val GL_TRANSPOSE_TEXTURE_MATRIX: Int = 34021

const val GL_TRANSPOSE_COLOR_MATRIX: Int = 34022

const val GL_COMBINE: Int = 34160

const val GL_COMBINE_RGB: Int = 34161

const val GL_COMBINE_ALPHA: Int = 34162

const val GL_SOURCE0_RGB: Int = 34176

const val GL_SOURCE1_RGB: Int = 34177

const val GL_SOURCE2_RGB: Int = 34178

const val GL_SOURCE0_ALPHA: Int = 34184

const val GL_SOURCE1_ALPHA: Int = 34185

const val GL_SOURCE2_ALPHA: Int = 34186

const val GL_OPERAND0_RGB: Int = 34192

const val GL_OPERAND1_RGB: Int = 34193

const val GL_OPERAND2_RGB: Int = 34194

const val GL_OPERAND0_ALPHA: Int = 34200

const val GL_OPERAND1_ALPHA: Int = 34201

const val GL_OPERAND2_ALPHA: Int = 34202

const val GL_RGB_SCALE: Int = 34163

const val GL_ADD_SIGNED: Int = 34164

const val GL_INTERPOLATE: Int = 34165

const val GL_SUBTRACT: Int = 34023

const val GL_CONSTANT: Int = 34166

const val GL_PRIMARY_COLOR: Int = 34167

const val GL_PREVIOUS: Int = 34168

const val GL_DOT3_RGB: Int = 34478

const val GL_DOT3_RGBA: Int = 34479

const val GL_CLAMP_TO_BORDER: Int = 33069

const val GL_ARB_multitexture: Int = 1

const val GL_TEXTURE0_ARB: Int = 33984

const val GL_TEXTURE1_ARB: Int = 33985

const val GL_TEXTURE2_ARB: Int = 33986

const val GL_TEXTURE3_ARB: Int = 33987

const val GL_TEXTURE4_ARB: Int = 33988

const val GL_TEXTURE5_ARB: Int = 33989

const val GL_TEXTURE6_ARB: Int = 33990

const val GL_TEXTURE7_ARB: Int = 33991

const val GL_TEXTURE8_ARB: Int = 33992

const val GL_TEXTURE9_ARB: Int = 33993

const val GL_TEXTURE10_ARB: Int = 33994

const val GL_TEXTURE11_ARB: Int = 33995

const val GL_TEXTURE12_ARB: Int = 33996

const val GL_TEXTURE13_ARB: Int = 33997

const val GL_TEXTURE14_ARB: Int = 33998

const val GL_TEXTURE15_ARB: Int = 33999

const val GL_TEXTURE16_ARB: Int = 34000

const val GL_TEXTURE17_ARB: Int = 34001

const val GL_TEXTURE18_ARB: Int = 34002

const val GL_TEXTURE19_ARB: Int = 34003

const val GL_TEXTURE20_ARB: Int = 34004

const val GL_TEXTURE21_ARB: Int = 34005

const val GL_TEXTURE22_ARB: Int = 34006

const val GL_TEXTURE23_ARB: Int = 34007

const val GL_TEXTURE24_ARB: Int = 34008

const val GL_TEXTURE25_ARB: Int = 34009

const val GL_TEXTURE26_ARB: Int = 34010

const val GL_TEXTURE27_ARB: Int = 34011

const val GL_TEXTURE28_ARB: Int = 34012

const val GL_TEXTURE29_ARB: Int = 34013

const val GL_TEXTURE30_ARB: Int = 34014

const val GL_TEXTURE31_ARB: Int = 34015

const val GL_ACTIVE_TEXTURE_ARB: Int = 34016

const val GL_CLIENT_ACTIVE_TEXTURE_ARB: Int = 34017

const val GL_MAX_TEXTURE_UNITS_ARB: Int = 34018

const val __glext_h_: Int = 1

const val GL_GLEXT_VERSION: Int = 20171010

const val GL_VERSION_1_4: Int = 1

const val GL_BLEND_DST_RGB: Int = 32968

const val GL_BLEND_SRC_RGB: Int = 32969

const val GL_BLEND_DST_ALPHA: Int = 32970

const val GL_BLEND_SRC_ALPHA: Int = 32971

const val GL_POINT_FADE_THRESHOLD_SIZE: Int = 33064

const val GL_DEPTH_COMPONENT16: Int = 33189

const val GL_DEPTH_COMPONENT24: Int = 33190

const val GL_DEPTH_COMPONENT32: Int = 33191

const val GL_MIRRORED_REPEAT: Int = 33648

const val GL_MAX_TEXTURE_LOD_BIAS: Int = 34045

const val GL_TEXTURE_LOD_BIAS: Int = 34049

const val GL_INCR_WRAP: Int = 34055

const val GL_DECR_WRAP: Int = 34056

const val GL_TEXTURE_DEPTH_SIZE: Int = 34890

const val GL_TEXTURE_COMPARE_MODE: Int = 34892

const val GL_TEXTURE_COMPARE_FUNC: Int = 34893

const val GL_POINT_SIZE_MIN: Int = 33062

const val GL_POINT_SIZE_MAX: Int = 33063

const val GL_POINT_DISTANCE_ATTENUATION: Int = 33065

const val GL_GENERATE_MIPMAP: Int = 33169

const val GL_GENERATE_MIPMAP_HINT: Int = 33170

const val GL_FOG_COORDINATE_SOURCE: Int = 33872

const val GL_FOG_COORDINATE: Int = 33873

const val GL_FRAGMENT_DEPTH: Int = 33874

const val GL_CURRENT_FOG_COORDINATE: Int = 33875

const val GL_FOG_COORDINATE_ARRAY_TYPE: Int = 33876

const val GL_FOG_COORDINATE_ARRAY_STRIDE: Int = 33877

const val GL_FOG_COORDINATE_ARRAY_POINTER: Int = 33878

const val GL_FOG_COORDINATE_ARRAY: Int = 33879

const val GL_COLOR_SUM: Int = 33880

const val GL_CURRENT_SECONDARY_COLOR: Int = 33881

const val GL_SECONDARY_COLOR_ARRAY_SIZE: Int = 33882

const val GL_SECONDARY_COLOR_ARRAY_TYPE: Int = 33883

const val GL_SECONDARY_COLOR_ARRAY_STRIDE: Int = 33884

const val GL_SECONDARY_COLOR_ARRAY_POINTER: Int = 33885

const val GL_SECONDARY_COLOR_ARRAY: Int = 33886

const val GL_TEXTURE_FILTER_CONTROL: Int = 34048

const val GL_DEPTH_TEXTURE_MODE: Int = 34891

const val GL_COMPARE_R_TO_TEXTURE: Int = 34894

const val GL_VERSION_1_5: Int = 1

const val GL_BUFFER_SIZE: Int = 34660

const val GL_BUFFER_USAGE: Int = 34661

const val GL_QUERY_COUNTER_BITS: Int = 34916

const val GL_CURRENT_QUERY: Int = 34917

const val GL_QUERY_RESULT: Int = 34918

const val GL_QUERY_RESULT_AVAILABLE: Int = 34919

const val GL_ARRAY_BUFFER: Int = 34962

const val GL_ELEMENT_ARRAY_BUFFER: Int = 34963

const val GL_ARRAY_BUFFER_BINDING: Int = 34964

const val GL_ELEMENT_ARRAY_BUFFER_BINDING: Int = 34965

const val GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING: Int = 34975

const val GL_READ_ONLY: Int = 35000

const val GL_WRITE_ONLY: Int = 35001

const val GL_READ_WRITE: Int = 35002

const val GL_BUFFER_ACCESS: Int = 35003

const val GL_BUFFER_MAPPED: Int = 35004

const val GL_BUFFER_MAP_POINTER: Int = 35005

const val GL_STREAM_DRAW: Int = 35040

const val GL_STREAM_READ: Int = 35041

const val GL_STREAM_COPY: Int = 35042

const val GL_STATIC_DRAW: Int = 35044

const val GL_STATIC_READ: Int = 35045

const val GL_STATIC_COPY: Int = 35046

const val GL_DYNAMIC_DRAW: Int = 35048

const val GL_DYNAMIC_READ: Int = 35049

const val GL_DYNAMIC_COPY: Int = 35050

const val GL_SAMPLES_PASSED: Int = 35092

const val GL_SRC1_ALPHA: Int = 34185

const val GL_VERTEX_ARRAY_BUFFER_BINDING: Int = 34966

const val GL_NORMAL_ARRAY_BUFFER_BINDING: Int = 34967

const val GL_COLOR_ARRAY_BUFFER_BINDING: Int = 34968

const val GL_INDEX_ARRAY_BUFFER_BINDING: Int = 34969

const val GL_TEXTURE_COORD_ARRAY_BUFFER_BINDING: Int = 34970

const val GL_EDGE_FLAG_ARRAY_BUFFER_BINDING: Int = 34971

const val GL_SECONDARY_COLOR_ARRAY_BUFFER_BINDING: Int = 34972

const val GL_FOG_COORDINATE_ARRAY_BUFFER_BINDING: Int = 34973

const val GL_WEIGHT_ARRAY_BUFFER_BINDING: Int = 34974

const val GL_FOG_COORD_SRC: Int = 33872

const val GL_FOG_COORD: Int = 33873

const val GL_CURRENT_FOG_COORD: Int = 33875

const val GL_FOG_COORD_ARRAY_TYPE: Int = 33876

const val GL_FOG_COORD_ARRAY_STRIDE: Int = 33877

const val GL_FOG_COORD_ARRAY_POINTER: Int = 33878

const val GL_FOG_COORD_ARRAY: Int = 33879

const val GL_FOG_COORD_ARRAY_BUFFER_BINDING: Int = 34973

const val GL_SRC0_RGB: Int = 34176

const val GL_SRC1_RGB: Int = 34177

const val GL_SRC2_RGB: Int = 34178

const val GL_SRC0_ALPHA: Int = 34184

const val GL_SRC2_ALPHA: Int = 34186

const val GL_VERSION_2_0: Int = 1

const val GL_BLEND_EQUATION_RGB: Int = 32777

const val GL_VERTEX_ATTRIB_ARRAY_ENABLED: Int = 34338

const val GL_VERTEX_ATTRIB_ARRAY_SIZE: Int = 34339

const val GL_VERTEX_ATTRIB_ARRAY_STRIDE: Int = 34340

const val GL_VERTEX_ATTRIB_ARRAY_TYPE: Int = 34341

const val GL_CURRENT_VERTEX_ATTRIB: Int = 34342

const val GL_VERTEX_PROGRAM_POINT_SIZE: Int = 34370

const val GL_VERTEX_ATTRIB_ARRAY_POINTER: Int = 34373

const val GL_STENCIL_BACK_FUNC: Int = 34816

const val GL_STENCIL_BACK_FAIL: Int = 34817

const val GL_STENCIL_BACK_PASS_DEPTH_FAIL: Int = 34818

const val GL_STENCIL_BACK_PASS_DEPTH_PASS: Int = 34819

const val GL_MAX_DRAW_BUFFERS: Int = 34852

const val GL_DRAW_BUFFER0: Int = 34853

const val GL_DRAW_BUFFER1: Int = 34854

const val GL_DRAW_BUFFER2: Int = 34855

const val GL_DRAW_BUFFER3: Int = 34856

const val GL_DRAW_BUFFER4: Int = 34857

const val GL_DRAW_BUFFER5: Int = 34858

const val GL_DRAW_BUFFER6: Int = 34859

const val GL_DRAW_BUFFER7: Int = 34860

const val GL_DRAW_BUFFER8: Int = 34861

const val GL_DRAW_BUFFER9: Int = 34862

const val GL_DRAW_BUFFER10: Int = 34863

const val GL_DRAW_BUFFER11: Int = 34864

const val GL_DRAW_BUFFER12: Int = 34865

const val GL_DRAW_BUFFER13: Int = 34866

const val GL_DRAW_BUFFER14: Int = 34867

const val GL_DRAW_BUFFER15: Int = 34868

const val GL_BLEND_EQUATION_ALPHA: Int = 34877

const val GL_MAX_VERTEX_ATTRIBS: Int = 34921

const val GL_VERTEX_ATTRIB_ARRAY_NORMALIZED: Int = 34922

const val GL_MAX_TEXTURE_IMAGE_UNITS: Int = 34930

const val GL_FRAGMENT_SHADER: Int = 35632

const val GL_VERTEX_SHADER: Int = 35633

const val GL_MAX_FRAGMENT_UNIFORM_COMPONENTS: Int = 35657

const val GL_MAX_VERTEX_UNIFORM_COMPONENTS: Int = 35658

const val GL_MAX_VARYING_FLOATS: Int = 35659

const val GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS: Int = 35660

const val GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS: Int = 35661

const val GL_SHADER_TYPE: Int = 35663

const val GL_FLOAT_VEC2: Int = 35664

const val GL_FLOAT_VEC3: Int = 35665

const val GL_FLOAT_VEC4: Int = 35666

const val GL_INT_VEC2: Int = 35667

const val GL_INT_VEC3: Int = 35668

const val GL_INT_VEC4: Int = 35669

const val GL_BOOL: Int = 35670

const val GL_BOOL_VEC2: Int = 35671

const val GL_BOOL_VEC3: Int = 35672

const val GL_BOOL_VEC4: Int = 35673

const val GL_FLOAT_MAT2: Int = 35674

const val GL_FLOAT_MAT3: Int = 35675

const val GL_FLOAT_MAT4: Int = 35676

const val GL_SAMPLER_1D: Int = 35677

const val GL_SAMPLER_2D: Int = 35678

const val GL_SAMPLER_3D: Int = 35679

const val GL_SAMPLER_CUBE: Int = 35680

const val GL_SAMPLER_1D_SHADOW: Int = 35681

const val GL_SAMPLER_2D_SHADOW: Int = 35682

const val GL_DELETE_STATUS: Int = 35712

const val GL_COMPILE_STATUS: Int = 35713

const val GL_LINK_STATUS: Int = 35714

const val GL_VALIDATE_STATUS: Int = 35715

const val GL_INFO_LOG_LENGTH: Int = 35716

const val GL_ATTACHED_SHADERS: Int = 35717

const val GL_ACTIVE_UNIFORMS: Int = 35718

const val GL_ACTIVE_UNIFORM_MAX_LENGTH: Int = 35719

const val GL_SHADER_SOURCE_LENGTH: Int = 35720

const val GL_ACTIVE_ATTRIBUTES: Int = 35721

const val GL_ACTIVE_ATTRIBUTE_MAX_LENGTH: Int = 35722

const val GL_FRAGMENT_SHADER_DERIVATIVE_HINT: Int = 35723

const val GL_SHADING_LANGUAGE_VERSION: Int = 35724

const val GL_CURRENT_PROGRAM: Int = 35725

const val GL_POINT_SPRITE_COORD_ORIGIN: Int = 36000

const val GL_LOWER_LEFT: Int = 36001

const val GL_UPPER_LEFT: Int = 36002

const val GL_STENCIL_BACK_REF: Int = 36003

const val GL_STENCIL_BACK_VALUE_MASK: Int = 36004

const val GL_STENCIL_BACK_WRITEMASK: Int = 36005

const val GL_VERTEX_PROGRAM_TWO_SIDE: Int = 34371

const val GL_POINT_SPRITE: Int = 34913

const val GL_COORD_REPLACE: Int = 34914

const val GL_MAX_TEXTURE_COORDS: Int = 34929

const val GL_VERSION_2_1: Int = 1

const val GL_PIXEL_PACK_BUFFER: Int = 35051

const val GL_PIXEL_UNPACK_BUFFER: Int = 35052

const val GL_PIXEL_PACK_BUFFER_BINDING: Int = 35053

const val GL_PIXEL_UNPACK_BUFFER_BINDING: Int = 35055

const val GL_FLOAT_MAT2x3: Int = 35685

const val GL_FLOAT_MAT2x4: Int = 35686

const val GL_FLOAT_MAT3x2: Int = 35687

const val GL_FLOAT_MAT3x4: Int = 35688

const val GL_FLOAT_MAT4x2: Int = 35689

const val GL_FLOAT_MAT4x3: Int = 35690

const val GL_SRGB: Int = 35904

const val GL_SRGB8: Int = 35905

const val GL_SRGB_ALPHA: Int = 35906

const val GL_SRGB8_ALPHA8: Int = 35907

const val GL_COMPRESSED_SRGB: Int = 35912

const val GL_COMPRESSED_SRGB_ALPHA: Int = 35913

const val GL_CURRENT_RASTER_SECONDARY_COLOR: Int = 33887

const val GL_SLUMINANCE_ALPHA: Int = 35908

const val GL_SLUMINANCE8_ALPHA8: Int = 35909

const val GL_SLUMINANCE: Int = 35910

const val GL_SLUMINANCE8: Int = 35911

const val GL_COMPRESSED_SLUMINANCE: Int = 35914

const val GL_COMPRESSED_SLUMINANCE_ALPHA: Int = 35915

const val GL_VERSION_3_0: Int = 1

const val GL_COMPARE_REF_TO_TEXTURE: Int = 34894

const val GL_CLIP_DISTANCE0: Int = 12288

const val GL_CLIP_DISTANCE1: Int = 12289

const val GL_CLIP_DISTANCE2: Int = 12290

const val GL_CLIP_DISTANCE3: Int = 12291

const val GL_CLIP_DISTANCE4: Int = 12292

const val GL_CLIP_DISTANCE5: Int = 12293

const val GL_CLIP_DISTANCE6: Int = 12294

const val GL_CLIP_DISTANCE7: Int = 12295

const val GL_MAX_CLIP_DISTANCES: Int = 3378

const val GL_MAJOR_VERSION: Int = 33307

const val GL_MINOR_VERSION: Int = 33308

const val GL_NUM_EXTENSIONS: Int = 33309

const val GL_CONTEXT_FLAGS: Int = 33310

const val GL_COMPRESSED_RED: Int = 33317

const val GL_COMPRESSED_RG: Int = 33318

const val GL_CONTEXT_FLAG_FORWARD_COMPATIBLE_BIT: Int = 1

const val GL_RGBA32F: Int = 34836

const val GL_RGB32F: Int = 34837

const val GL_RGBA16F: Int = 34842

const val GL_RGB16F: Int = 34843

const val GL_VERTEX_ATTRIB_ARRAY_INTEGER: Int = 35069

const val GL_MAX_ARRAY_TEXTURE_LAYERS: Int = 35071

const val GL_MIN_PROGRAM_TEXEL_OFFSET: Int = 35076

const val GL_MAX_PROGRAM_TEXEL_OFFSET: Int = 35077

const val GL_CLAMP_READ_COLOR: Int = 35100

const val GL_FIXED_ONLY: Int = 35101

const val GL_MAX_VARYING_COMPONENTS: Int = 35659

const val GL_TEXTURE_1D_ARRAY: Int = 35864

const val GL_PROXY_TEXTURE_1D_ARRAY: Int = 35865

const val GL_TEXTURE_2D_ARRAY: Int = 35866

const val GL_PROXY_TEXTURE_2D_ARRAY: Int = 35867

const val GL_TEXTURE_BINDING_1D_ARRAY: Int = 35868

const val GL_TEXTURE_BINDING_2D_ARRAY: Int = 35869

const val GL_R11F_G11F_B10F: Int = 35898

const val GL_UNSIGNED_INT_10F_11F_11F_REV: Int = 35899

const val GL_RGB9_E5: Int = 35901

const val GL_UNSIGNED_INT_5_9_9_9_REV: Int = 35902

const val GL_TEXTURE_SHARED_SIZE: Int = 35903

const val GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH: Int = 35958

const val GL_TRANSFORM_FEEDBACK_BUFFER_MODE: Int = 35967

const val GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS: Int = 35968

const val GL_TRANSFORM_FEEDBACK_VARYINGS: Int = 35971

const val GL_TRANSFORM_FEEDBACK_BUFFER_START: Int = 35972

const val GL_TRANSFORM_FEEDBACK_BUFFER_SIZE: Int = 35973

const val GL_PRIMITIVES_GENERATED: Int = 35975

const val GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN: Int = 35976

const val GL_RASTERIZER_DISCARD: Int = 35977

const val GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS: Int = 35978

const val GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS: Int = 35979

const val GL_INTERLEAVED_ATTRIBS: Int = 35980

const val GL_SEPARATE_ATTRIBS: Int = 35981

const val GL_TRANSFORM_FEEDBACK_BUFFER: Int = 35982

const val GL_TRANSFORM_FEEDBACK_BUFFER_BINDING: Int = 35983

const val GL_RGBA32UI: Int = 36208

const val GL_RGB32UI: Int = 36209

const val GL_RGBA16UI: Int = 36214

const val GL_RGB16UI: Int = 36215

const val GL_RGBA8UI: Int = 36220

const val GL_RGB8UI: Int = 36221

const val GL_RGBA32I: Int = 36226

const val GL_RGB32I: Int = 36227

const val GL_RGBA16I: Int = 36232

const val GL_RGB16I: Int = 36233

const val GL_RGBA8I: Int = 36238

const val GL_RGB8I: Int = 36239

const val GL_RED_INTEGER: Int = 36244

const val GL_GREEN_INTEGER: Int = 36245

const val GL_BLUE_INTEGER: Int = 36246

const val GL_RGB_INTEGER: Int = 36248

const val GL_RGBA_INTEGER: Int = 36249

const val GL_BGR_INTEGER: Int = 36250

const val GL_BGRA_INTEGER: Int = 36251

const val GL_SAMPLER_1D_ARRAY: Int = 36288

const val GL_SAMPLER_2D_ARRAY: Int = 36289

const val GL_SAMPLER_1D_ARRAY_SHADOW: Int = 36291

const val GL_SAMPLER_2D_ARRAY_SHADOW: Int = 36292

const val GL_SAMPLER_CUBE_SHADOW: Int = 36293

const val GL_UNSIGNED_INT_VEC2: Int = 36294

const val GL_UNSIGNED_INT_VEC3: Int = 36295

const val GL_UNSIGNED_INT_VEC4: Int = 36296

const val GL_INT_SAMPLER_1D: Int = 36297

const val GL_INT_SAMPLER_2D: Int = 36298

const val GL_INT_SAMPLER_3D: Int = 36299

const val GL_INT_SAMPLER_CUBE: Int = 36300

const val GL_INT_SAMPLER_1D_ARRAY: Int = 36302

const val GL_INT_SAMPLER_2D_ARRAY: Int = 36303

const val GL_UNSIGNED_INT_SAMPLER_1D: Int = 36305

const val GL_UNSIGNED_INT_SAMPLER_2D: Int = 36306

const val GL_UNSIGNED_INT_SAMPLER_3D: Int = 36307

const val GL_UNSIGNED_INT_SAMPLER_CUBE: Int = 36308

const val GL_UNSIGNED_INT_SAMPLER_1D_ARRAY: Int = 36310

const val GL_UNSIGNED_INT_SAMPLER_2D_ARRAY: Int = 36311

const val GL_QUERY_WAIT: Int = 36371

const val GL_QUERY_NO_WAIT: Int = 36372

const val GL_QUERY_BY_REGION_WAIT: Int = 36373

const val GL_QUERY_BY_REGION_NO_WAIT: Int = 36374

const val GL_BUFFER_ACCESS_FLAGS: Int = 37151

const val GL_BUFFER_MAP_LENGTH: Int = 37152

const val GL_BUFFER_MAP_OFFSET: Int = 37153

const val GL_DEPTH_COMPONENT32F: Int = 36012

const val GL_DEPTH32F_STENCIL8: Int = 36013

const val GL_FLOAT_32_UNSIGNED_INT_24_8_REV: Int = 36269

const val GL_INVALID_FRAMEBUFFER_OPERATION: Int = 1286

const val GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING: Int = 33296

const val GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE: Int = 33297

const val GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE: Int = 33298

const val GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE: Int = 33299

const val GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE: Int = 33300

const val GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE: Int = 33301

const val GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE: Int = 33302

const val GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE: Int = 33303

const val GL_FRAMEBUFFER_DEFAULT: Int = 33304

const val GL_FRAMEBUFFER_UNDEFINED: Int = 33305

const val GL_DEPTH_STENCIL_ATTACHMENT: Int = 33306

const val GL_MAX_RENDERBUFFER_SIZE: Int = 34024

const val GL_DEPTH_STENCIL: Int = 34041

const val GL_UNSIGNED_INT_24_8: Int = 34042

const val GL_DEPTH24_STENCIL8: Int = 35056

const val GL_TEXTURE_STENCIL_SIZE: Int = 35057

const val GL_TEXTURE_RED_TYPE: Int = 35856

const val GL_TEXTURE_GREEN_TYPE: Int = 35857

const val GL_TEXTURE_BLUE_TYPE: Int = 35858

const val GL_TEXTURE_ALPHA_TYPE: Int = 35859

const val GL_TEXTURE_DEPTH_TYPE: Int = 35862

const val GL_UNSIGNED_NORMALIZED: Int = 35863

const val GL_FRAMEBUFFER_BINDING: Int = 36006

const val GL_DRAW_FRAMEBUFFER_BINDING: Int = 36006

const val GL_RENDERBUFFER_BINDING: Int = 36007

const val GL_READ_FRAMEBUFFER: Int = 36008

const val GL_DRAW_FRAMEBUFFER: Int = 36009

const val GL_READ_FRAMEBUFFER_BINDING: Int = 36010

const val GL_RENDERBUFFER_SAMPLES: Int = 36011

const val GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE: Int = 36048

const val GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME: Int = 36049

const val GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL: Int = 36050

const val GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE: Int = 36051

const val GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER: Int = 36052

const val GL_FRAMEBUFFER_COMPLETE: Int = 36053

const val GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT: Int = 36054

const val GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT: Int = 36055

const val GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER: Int = 36059

const val GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER: Int = 36060

const val GL_FRAMEBUFFER_UNSUPPORTED: Int = 36061

const val GL_MAX_COLOR_ATTACHMENTS: Int = 36063

const val GL_COLOR_ATTACHMENT0: Int = 36064

const val GL_COLOR_ATTACHMENT1: Int = 36065

const val GL_COLOR_ATTACHMENT2: Int = 36066

const val GL_COLOR_ATTACHMENT3: Int = 36067

const val GL_COLOR_ATTACHMENT4: Int = 36068

const val GL_COLOR_ATTACHMENT5: Int = 36069

const val GL_COLOR_ATTACHMENT6: Int = 36070

const val GL_COLOR_ATTACHMENT7: Int = 36071

const val GL_COLOR_ATTACHMENT8: Int = 36072

const val GL_COLOR_ATTACHMENT9: Int = 36073

const val GL_COLOR_ATTACHMENT10: Int = 36074

const val GL_COLOR_ATTACHMENT11: Int = 36075

const val GL_COLOR_ATTACHMENT12: Int = 36076

const val GL_COLOR_ATTACHMENT13: Int = 36077

const val GL_COLOR_ATTACHMENT14: Int = 36078

const val GL_COLOR_ATTACHMENT15: Int = 36079

const val GL_COLOR_ATTACHMENT16: Int = 36080

const val GL_COLOR_ATTACHMENT17: Int = 36081

const val GL_COLOR_ATTACHMENT18: Int = 36082

const val GL_COLOR_ATTACHMENT19: Int = 36083

const val GL_COLOR_ATTACHMENT20: Int = 36084

const val GL_COLOR_ATTACHMENT21: Int = 36085

const val GL_COLOR_ATTACHMENT22: Int = 36086

const val GL_COLOR_ATTACHMENT23: Int = 36087

const val GL_COLOR_ATTACHMENT24: Int = 36088

const val GL_COLOR_ATTACHMENT25: Int = 36089

const val GL_COLOR_ATTACHMENT26: Int = 36090

const val GL_COLOR_ATTACHMENT27: Int = 36091

const val GL_COLOR_ATTACHMENT28: Int = 36092

const val GL_COLOR_ATTACHMENT29: Int = 36093

const val GL_COLOR_ATTACHMENT30: Int = 36094

const val GL_COLOR_ATTACHMENT31: Int = 36095

const val GL_DEPTH_ATTACHMENT: Int = 36096

const val GL_STENCIL_ATTACHMENT: Int = 36128

const val GL_FRAMEBUFFER: Int = 36160

const val GL_RENDERBUFFER: Int = 36161

const val GL_RENDERBUFFER_WIDTH: Int = 36162

const val GL_RENDERBUFFER_HEIGHT: Int = 36163

const val GL_RENDERBUFFER_INTERNAL_FORMAT: Int = 36164

const val GL_STENCIL_INDEX1: Int = 36166

const val GL_STENCIL_INDEX4: Int = 36167

const val GL_STENCIL_INDEX8: Int = 36168

const val GL_STENCIL_INDEX16: Int = 36169

const val GL_RENDERBUFFER_RED_SIZE: Int = 36176

const val GL_RENDERBUFFER_GREEN_SIZE: Int = 36177

const val GL_RENDERBUFFER_BLUE_SIZE: Int = 36178

const val GL_RENDERBUFFER_ALPHA_SIZE: Int = 36179

const val GL_RENDERBUFFER_DEPTH_SIZE: Int = 36180

const val GL_RENDERBUFFER_STENCIL_SIZE: Int = 36181

const val GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE: Int = 36182

const val GL_MAX_SAMPLES: Int = 36183

const val GL_INDEX: Int = 33314

const val GL_TEXTURE_LUMINANCE_TYPE: Int = 35860

const val GL_TEXTURE_INTENSITY_TYPE: Int = 35861

const val GL_FRAMEBUFFER_SRGB: Int = 36281

const val GL_HALF_FLOAT: Int = 5131

const val GL_MAP_READ_BIT: Int = 1

const val GL_MAP_WRITE_BIT: Int = 2

const val GL_MAP_INVALIDATE_RANGE_BIT: Int = 4

const val GL_MAP_INVALIDATE_BUFFER_BIT: Int = 8

const val GL_MAP_FLUSH_EXPLICIT_BIT: Int = 16

const val GL_MAP_UNSYNCHRONIZED_BIT: Int = 32

const val GL_COMPRESSED_RED_RGTC1: Int = 36283

const val GL_COMPRESSED_SIGNED_RED_RGTC1: Int = 36284

const val GL_COMPRESSED_RG_RGTC2: Int = 36285

const val GL_COMPRESSED_SIGNED_RG_RGTC2: Int = 36286

const val GL_RG: Int = 33319

const val GL_RG_INTEGER: Int = 33320

const val GL_R8: Int = 33321

const val GL_R16: Int = 33322

const val GL_RG8: Int = 33323

const val GL_RG16: Int = 33324

const val GL_R16F: Int = 33325

const val GL_R32F: Int = 33326

const val GL_RG16F: Int = 33327

const val GL_RG32F: Int = 33328

const val GL_R8I: Int = 33329

const val GL_R8UI: Int = 33330

const val GL_R16I: Int = 33331

const val GL_R16UI: Int = 33332

const val GL_R32I: Int = 33333

const val GL_R32UI: Int = 33334

const val GL_RG8I: Int = 33335

const val GL_RG8UI: Int = 33336

const val GL_RG16I: Int = 33337

const val GL_RG16UI: Int = 33338

const val GL_RG32I: Int = 33339

const val GL_RG32UI: Int = 33340

const val GL_VERTEX_ARRAY_BINDING: Int = 34229

const val GL_CLAMP_VERTEX_COLOR: Int = 35098

const val GL_CLAMP_FRAGMENT_COLOR: Int = 35099

const val GL_ALPHA_INTEGER: Int = 36247

const val GL_VERSION_3_1: Int = 1

const val GL_SAMPLER_2D_RECT: Int = 35683

const val GL_SAMPLER_2D_RECT_SHADOW: Int = 35684

const val GL_SAMPLER_BUFFER: Int = 36290

const val GL_INT_SAMPLER_2D_RECT: Int = 36301

const val GL_INT_SAMPLER_BUFFER: Int = 36304

const val GL_UNSIGNED_INT_SAMPLER_2D_RECT: Int = 36309

const val GL_UNSIGNED_INT_SAMPLER_BUFFER: Int = 36312

const val GL_TEXTURE_BUFFER: Int = 35882

const val GL_MAX_TEXTURE_BUFFER_SIZE: Int = 35883

const val GL_TEXTURE_BINDING_BUFFER: Int = 35884

const val GL_TEXTURE_BUFFER_DATA_STORE_BINDING: Int = 35885

const val GL_TEXTURE_RECTANGLE: Int = 34037

const val GL_TEXTURE_BINDING_RECTANGLE: Int = 34038

const val GL_PROXY_TEXTURE_RECTANGLE: Int = 34039

const val GL_MAX_RECTANGLE_TEXTURE_SIZE: Int = 34040

const val GL_R8_SNORM: Int = 36756

const val GL_RG8_SNORM: Int = 36757

const val GL_RGB8_SNORM: Int = 36758

const val GL_RGBA8_SNORM: Int = 36759

const val GL_R16_SNORM: Int = 36760

const val GL_RG16_SNORM: Int = 36761

const val GL_RGB16_SNORM: Int = 36762

const val GL_RGBA16_SNORM: Int = 36763

const val GL_SIGNED_NORMALIZED: Int = 36764

const val GL_PRIMITIVE_RESTART: Int = 36765

const val GL_PRIMITIVE_RESTART_INDEX: Int = 36766

const val GL_COPY_READ_BUFFER: Int = 36662

const val GL_COPY_WRITE_BUFFER: Int = 36663

const val GL_UNIFORM_BUFFER: Int = 35345

const val GL_UNIFORM_BUFFER_BINDING: Int = 35368

const val GL_UNIFORM_BUFFER_START: Int = 35369

const val GL_UNIFORM_BUFFER_SIZE: Int = 35370

const val GL_MAX_VERTEX_UNIFORM_BLOCKS: Int = 35371

const val GL_MAX_GEOMETRY_UNIFORM_BLOCKS: Int = 35372

const val GL_MAX_FRAGMENT_UNIFORM_BLOCKS: Int = 35373

const val GL_MAX_COMBINED_UNIFORM_BLOCKS: Int = 35374

const val GL_MAX_UNIFORM_BUFFER_BINDINGS: Int = 35375

const val GL_MAX_UNIFORM_BLOCK_SIZE: Int = 35376

const val GL_MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS: Int = 35377

const val GL_MAX_COMBINED_GEOMETRY_UNIFORM_COMPONENTS: Int = 35378

const val GL_MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS: Int = 35379

const val GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT: Int = 35380

const val GL_ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH: Int = 35381

const val GL_ACTIVE_UNIFORM_BLOCKS: Int = 35382

const val GL_UNIFORM_TYPE: Int = 35383

const val GL_UNIFORM_SIZE: Int = 35384

const val GL_UNIFORM_NAME_LENGTH: Int = 35385

const val GL_UNIFORM_BLOCK_INDEX: Int = 35386

const val GL_UNIFORM_OFFSET: Int = 35387

const val GL_UNIFORM_ARRAY_STRIDE: Int = 35388

const val GL_UNIFORM_MATRIX_STRIDE: Int = 35389

const val GL_UNIFORM_IS_ROW_MAJOR: Int = 35390

const val GL_UNIFORM_BLOCK_BINDING: Int = 35391

const val GL_UNIFORM_BLOCK_DATA_SIZE: Int = 35392

const val GL_UNIFORM_BLOCK_NAME_LENGTH: Int = 35393

const val GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS: Int = 35394

const val GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES: Int = 35395

const val GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER: Int = 35396

const val GL_UNIFORM_BLOCK_REFERENCED_BY_GEOMETRY_SHADER: Int = 35397

const val GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER: Int = 35398

const val GL_INVALID_INDEX: UInt = 4294967295u

const val GL_VERSION_3_2: Int = 1

const val _INTTYPES_H: Int = 1

const val ____gwchar_t_defined: Int = 1

val __PRI64_PREFIX: String get() = "l"

val __PRIPTR_PREFIX: String get() = "l"

val PRId8: String get() = "d"

val PRId16: String get() = "d"

val PRId32: String get() = "d"

val PRId64: String get() = "ld"

val PRIdLEAST8: String get() = "d"

val PRIdLEAST16: String get() = "d"

val PRIdLEAST32: String get() = "d"

val PRIdLEAST64: String get() = "ld"

val PRIdFAST8: String get() = "d"

val PRIdFAST16: String get() = "ld"

val PRIdFAST32: String get() = "ld"

val PRIdFAST64: String get() = "ld"

val PRIi8: String get() = "i"

val PRIi16: String get() = "i"

val PRIi32: String get() = "i"

val PRIi64: String get() = "li"

val PRIiLEAST8: String get() = "i"

val PRIiLEAST16: String get() = "i"

val PRIiLEAST32: String get() = "i"

val PRIiLEAST64: String get() = "li"

val PRIiFAST8: String get() = "i"

val PRIiFAST16: String get() = "li"

val PRIiFAST32: String get() = "li"

val PRIiFAST64: String get() = "li"

val PRIo8: String get() = "o"

val PRIo16: String get() = "o"

val PRIo32: String get() = "o"

val PRIo64: String get() = "lo"

val PRIoLEAST8: String get() = "o"

val PRIoLEAST16: String get() = "o"

val PRIoLEAST32: String get() = "o"

val PRIoLEAST64: String get() = "lo"

val PRIoFAST8: String get() = "o"

val PRIoFAST16: String get() = "lo"

val PRIoFAST32: String get() = "lo"

val PRIoFAST64: String get() = "lo"

val PRIu8: String get() = "u"

val PRIu16: String get() = "u"

val PRIu32: String get() = "u"

val PRIu64: String get() = "lu"

val PRIuLEAST8: String get() = "u"

val PRIuLEAST16: String get() = "u"

val PRIuLEAST32: String get() = "u"

val PRIuLEAST64: String get() = "lu"

val PRIuFAST8: String get() = "u"

val PRIuFAST16: String get() = "lu"

val PRIuFAST32: String get() = "lu"

val PRIuFAST64: String get() = "lu"

val PRIx8: String get() = "x"

val PRIx16: String get() = "x"

val PRIx32: String get() = "x"

val PRIx64: String get() = "lx"

val PRIxLEAST8: String get() = "x"

val PRIxLEAST16: String get() = "x"

val PRIxLEAST32: String get() = "x"

val PRIxLEAST64: String get() = "lx"

val PRIxFAST8: String get() = "x"

val PRIxFAST16: String get() = "lx"

val PRIxFAST32: String get() = "lx"

val PRIxFAST64: String get() = "lx"

val PRIX8: String get() = "X"

val PRIX16: String get() = "X"

val PRIX32: String get() = "X"

val PRIX64: String get() = "lX"

val PRIXLEAST8: String get() = "X"

val PRIXLEAST16: String get() = "X"

val PRIXLEAST32: String get() = "X"

val PRIXLEAST64: String get() = "lX"

val PRIXFAST8: String get() = "X"

val PRIXFAST16: String get() = "lX"

val PRIXFAST32: String get() = "lX"

val PRIXFAST64: String get() = "lX"

val PRIdMAX: String get() = "ld"

val PRIiMAX: String get() = "li"

val PRIoMAX: String get() = "lo"

val PRIuMAX: String get() = "lu"

val PRIxMAX: String get() = "lx"

val PRIXMAX: String get() = "lX"

val PRIdPTR: String get() = "ld"

val PRIiPTR: String get() = "li"

val PRIoPTR: String get() = "lo"

val PRIuPTR: String get() = "lu"

val PRIxPTR: String get() = "lx"

val PRIXPTR: String get() = "lX"

val SCNd8: String get() = "hhd"

val SCNd16: String get() = "hd"

val SCNd32: String get() = "d"

val SCNd64: String get() = "ld"

val SCNdLEAST8: String get() = "hhd"

val SCNdLEAST16: String get() = "hd"

val SCNdLEAST32: String get() = "d"

val SCNdLEAST64: String get() = "ld"

val SCNdFAST8: String get() = "hhd"

val SCNdFAST16: String get() = "ld"

val SCNdFAST32: String get() = "ld"

val SCNdFAST64: String get() = "ld"

val SCNi8: String get() = "hhi"

val SCNi16: String get() = "hi"

val SCNi32: String get() = "i"

val SCNi64: String get() = "li"

val SCNiLEAST8: String get() = "hhi"

val SCNiLEAST16: String get() = "hi"

val SCNiLEAST32: String get() = "i"

val SCNiLEAST64: String get() = "li"

val SCNiFAST8: String get() = "hhi"

val SCNiFAST16: String get() = "li"

val SCNiFAST32: String get() = "li"

val SCNiFAST64: String get() = "li"

val SCNu8: String get() = "hhu"

val SCNu16: String get() = "hu"

val SCNu32: String get() = "u"

val SCNu64: String get() = "lu"

val SCNuLEAST8: String get() = "hhu"

val SCNuLEAST16: String get() = "hu"

val SCNuLEAST32: String get() = "u"

val SCNuLEAST64: String get() = "lu"

val SCNuFAST8: String get() = "hhu"

val SCNuFAST16: String get() = "lu"

val SCNuFAST32: String get() = "lu"

val SCNuFAST64: String get() = "lu"

val SCNo8: String get() = "hho"

val SCNo16: String get() = "ho"

val SCNo32: String get() = "o"

val SCNo64: String get() = "lo"

val SCNoLEAST8: String get() = "hho"

val SCNoLEAST16: String get() = "ho"

val SCNoLEAST32: String get() = "o"

val SCNoLEAST64: String get() = "lo"

val SCNoFAST8: String get() = "hho"

val SCNoFAST16: String get() = "lo"

val SCNoFAST32: String get() = "lo"

val SCNoFAST64: String get() = "lo"

val SCNx8: String get() = "hhx"

val SCNx16: String get() = "hx"

val SCNx32: String get() = "x"

val SCNx64: String get() = "lx"

val SCNxLEAST8: String get() = "hhx"

val SCNxLEAST16: String get() = "hx"

val SCNxLEAST32: String get() = "x"

val SCNxLEAST64: String get() = "lx"

val SCNxFAST8: String get() = "hhx"

val SCNxFAST16: String get() = "lx"

val SCNxFAST32: String get() = "lx"

val SCNxFAST64: String get() = "lx"

val SCNdMAX: String get() = "ld"

val SCNiMAX: String get() = "li"

val SCNoMAX: String get() = "lo"

val SCNuMAX: String get() = "lu"

val SCNxMAX: String get() = "lx"

val SCNdPTR: String get() = "ld"

val SCNiPTR: String get() = "li"

val SCNoPTR: String get() = "lo"

val SCNuPTR: String get() = "lu"

val SCNxPTR: String get() = "lx"

const val GL_CONTEXT_CORE_PROFILE_BIT: Int = 1

const val GL_CONTEXT_COMPATIBILITY_PROFILE_BIT: Int = 2

const val GL_LINES_ADJACENCY: Int = 10

const val GL_LINE_STRIP_ADJACENCY: Int = 11

const val GL_TRIANGLES_ADJACENCY: Int = 12

const val GL_TRIANGLE_STRIP_ADJACENCY: Int = 13

const val GL_PROGRAM_POINT_SIZE: Int = 34370

const val GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS: Int = 35881

const val GL_FRAMEBUFFER_ATTACHMENT_LAYERED: Int = 36263

const val GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS: Int = 36264

const val GL_GEOMETRY_SHADER: Int = 36313

const val GL_GEOMETRY_VERTICES_OUT: Int = 35094

const val GL_GEOMETRY_INPUT_TYPE: Int = 35095

const val GL_GEOMETRY_OUTPUT_TYPE: Int = 35096

const val GL_MAX_GEOMETRY_UNIFORM_COMPONENTS: Int = 36319

const val GL_MAX_GEOMETRY_OUTPUT_VERTICES: Int = 36320

const val GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS: Int = 36321

const val GL_MAX_VERTEX_OUTPUT_COMPONENTS: Int = 37154

const val GL_MAX_GEOMETRY_INPUT_COMPONENTS: Int = 37155

const val GL_MAX_GEOMETRY_OUTPUT_COMPONENTS: Int = 37156

const val GL_MAX_FRAGMENT_INPUT_COMPONENTS: Int = 37157

const val GL_CONTEXT_PROFILE_MASK: Int = 37158

const val GL_DEPTH_CLAMP: Int = 34383

const val GL_QUADS_FOLLOW_PROVOKING_VERTEX_CONVENTION: Int = 36428

const val GL_FIRST_VERTEX_CONVENTION: Int = 36429

const val GL_LAST_VERTEX_CONVENTION: Int = 36430

const val GL_PROVOKING_VERTEX: Int = 36431

const val GL_TEXTURE_CUBE_MAP_SEAMLESS: Int = 34895

const val GL_MAX_SERVER_WAIT_TIMEOUT: Int = 37137

const val GL_OBJECT_TYPE: Int = 37138

const val GL_SYNC_CONDITION: Int = 37139

const val GL_SYNC_STATUS: Int = 37140

const val GL_SYNC_FLAGS: Int = 37141

const val GL_SYNC_FENCE: Int = 37142

const val GL_SYNC_GPU_COMMANDS_COMPLETE: Int = 37143

const val GL_UNSIGNALED: Int = 37144

const val GL_SIGNALED: Int = 37145

const val GL_ALREADY_SIGNALED: Int = 37146

const val GL_TIMEOUT_EXPIRED: Int = 37147

const val GL_CONDITION_SATISFIED: Int = 37148

const val GL_WAIT_FAILED: Int = 37149

const val GL_TIMEOUT_IGNORED: ULong = 18446744073709551615u

const val GL_SYNC_FLUSH_COMMANDS_BIT: Int = 1

const val GL_SAMPLE_POSITION: Int = 36432

const val GL_SAMPLE_MASK: Int = 36433

const val GL_SAMPLE_MASK_VALUE: Int = 36434

const val GL_MAX_SAMPLE_MASK_WORDS: Int = 36441

const val GL_TEXTURE_2D_MULTISAMPLE: Int = 37120

const val GL_PROXY_TEXTURE_2D_MULTISAMPLE: Int = 37121

const val GL_TEXTURE_2D_MULTISAMPLE_ARRAY: Int = 37122

const val GL_PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY: Int = 37123

const val GL_TEXTURE_BINDING_2D_MULTISAMPLE: Int = 37124

const val GL_TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY: Int = 37125

const val GL_TEXTURE_SAMPLES: Int = 37126

const val GL_TEXTURE_FIXED_SAMPLE_LOCATIONS: Int = 37127

const val GL_SAMPLER_2D_MULTISAMPLE: Int = 37128

const val GL_INT_SAMPLER_2D_MULTISAMPLE: Int = 37129

const val GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE: Int = 37130

const val GL_SAMPLER_2D_MULTISAMPLE_ARRAY: Int = 37131

const val GL_INT_SAMPLER_2D_MULTISAMPLE_ARRAY: Int = 37132

const val GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE_ARRAY: Int = 37133

const val GL_MAX_COLOR_TEXTURE_SAMPLES: Int = 37134

const val GL_MAX_DEPTH_TEXTURE_SAMPLES: Int = 37135

const val GL_MAX_INTEGER_SAMPLES: Int = 37136

const val GL_VERSION_3_3: Int = 1

const val GL_VERTEX_ATTRIB_ARRAY_DIVISOR: Int = 35070

const val GL_SRC1_COLOR: Int = 35065

const val GL_ONE_MINUS_SRC1_COLOR: Int = 35066

const val GL_ONE_MINUS_SRC1_ALPHA: Int = 35067

const val GL_MAX_DUAL_SOURCE_DRAW_BUFFERS: Int = 35068

const val GL_ANY_SAMPLES_PASSED: Int = 35887

const val GL_SAMPLER_BINDING: Int = 35097

const val GL_RGB10_A2UI: Int = 36975

const val GL_TEXTURE_SWIZZLE_R: Int = 36418

const val GL_TEXTURE_SWIZZLE_G: Int = 36419

const val GL_TEXTURE_SWIZZLE_B: Int = 36420

const val GL_TEXTURE_SWIZZLE_A: Int = 36421

const val GL_TEXTURE_SWIZZLE_RGBA: Int = 36422

const val GL_TIME_ELAPSED: Int = 35007

const val GL_TIMESTAMP: Int = 36392

const val GL_INT_2_10_10_10_REV: Int = 36255

const val GL_VERSION_4_0: Int = 1

const val GL_SAMPLE_SHADING: Int = 35894

const val GL_MIN_SAMPLE_SHADING_VALUE: Int = 35895

const val GL_MIN_PROGRAM_TEXTURE_GATHER_OFFSET: Int = 36446

const val GL_MAX_PROGRAM_TEXTURE_GATHER_OFFSET: Int = 36447

const val GL_TEXTURE_CUBE_MAP_ARRAY: Int = 36873

const val GL_TEXTURE_BINDING_CUBE_MAP_ARRAY: Int = 36874

const val GL_PROXY_TEXTURE_CUBE_MAP_ARRAY: Int = 36875

const val GL_SAMPLER_CUBE_MAP_ARRAY: Int = 36876

const val GL_SAMPLER_CUBE_MAP_ARRAY_SHADOW: Int = 36877

const val GL_INT_SAMPLER_CUBE_MAP_ARRAY: Int = 36878

const val GL_UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY: Int = 36879

const val GL_DRAW_INDIRECT_BUFFER: Int = 36671

const val GL_DRAW_INDIRECT_BUFFER_BINDING: Int = 36675

const val GL_GEOMETRY_SHADER_INVOCATIONS: Int = 34943

const val GL_MAX_GEOMETRY_SHADER_INVOCATIONS: Int = 36442

const val GL_MIN_FRAGMENT_INTERPOLATION_OFFSET: Int = 36443

const val GL_MAX_FRAGMENT_INTERPOLATION_OFFSET: Int = 36444

const val GL_FRAGMENT_INTERPOLATION_OFFSET_BITS: Int = 36445

const val GL_MAX_VERTEX_STREAMS: Int = 36465

const val GL_DOUBLE_VEC2: Int = 36860

const val GL_DOUBLE_VEC3: Int = 36861

const val GL_DOUBLE_VEC4: Int = 36862

const val GL_DOUBLE_MAT2: Int = 36678

const val GL_DOUBLE_MAT3: Int = 36679

const val GL_DOUBLE_MAT4: Int = 36680

const val GL_DOUBLE_MAT2x3: Int = 36681

const val GL_DOUBLE_MAT2x4: Int = 36682

const val GL_DOUBLE_MAT3x2: Int = 36683

const val GL_DOUBLE_MAT3x4: Int = 36684

const val GL_DOUBLE_MAT4x2: Int = 36685

const val GL_DOUBLE_MAT4x3: Int = 36686

const val GL_ACTIVE_SUBROUTINES: Int = 36325

const val GL_ACTIVE_SUBROUTINE_UNIFORMS: Int = 36326

const val GL_ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS: Int = 36423

const val GL_ACTIVE_SUBROUTINE_MAX_LENGTH: Int = 36424

const val GL_ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH: Int = 36425

const val GL_MAX_SUBROUTINES: Int = 36327

const val GL_MAX_SUBROUTINE_UNIFORM_LOCATIONS: Int = 36328

const val GL_NUM_COMPATIBLE_SUBROUTINES: Int = 36426

const val GL_COMPATIBLE_SUBROUTINES: Int = 36427

const val GL_PATCHES: Int = 14

const val GL_PATCH_VERTICES: Int = 36466

const val GL_PATCH_DEFAULT_INNER_LEVEL: Int = 36467

const val GL_PATCH_DEFAULT_OUTER_LEVEL: Int = 36468

const val GL_TESS_CONTROL_OUTPUT_VERTICES: Int = 36469

const val GL_TESS_GEN_MODE: Int = 36470

const val GL_TESS_GEN_SPACING: Int = 36471

const val GL_TESS_GEN_VERTEX_ORDER: Int = 36472

const val GL_TESS_GEN_POINT_MODE: Int = 36473

const val GL_ISOLINES: Int = 36474

const val GL_FRACTIONAL_ODD: Int = 36475

const val GL_FRACTIONAL_EVEN: Int = 36476

const val GL_MAX_PATCH_VERTICES: Int = 36477

const val GL_MAX_TESS_GEN_LEVEL: Int = 36478

const val GL_MAX_TESS_CONTROL_UNIFORM_COMPONENTS: Int = 36479

const val GL_MAX_TESS_EVALUATION_UNIFORM_COMPONENTS: Int = 36480

const val GL_MAX_TESS_CONTROL_TEXTURE_IMAGE_UNITS: Int = 36481

const val GL_MAX_TESS_EVALUATION_TEXTURE_IMAGE_UNITS: Int = 36482

const val GL_MAX_TESS_CONTROL_OUTPUT_COMPONENTS: Int = 36483

const val GL_MAX_TESS_PATCH_COMPONENTS: Int = 36484

const val GL_MAX_TESS_CONTROL_TOTAL_OUTPUT_COMPONENTS: Int = 36485

const val GL_MAX_TESS_EVALUATION_OUTPUT_COMPONENTS: Int = 36486

const val GL_MAX_TESS_CONTROL_UNIFORM_BLOCKS: Int = 36489

const val GL_MAX_TESS_EVALUATION_UNIFORM_BLOCKS: Int = 36490

const val GL_MAX_TESS_CONTROL_INPUT_COMPONENTS: Int = 34924

const val GL_MAX_TESS_EVALUATION_INPUT_COMPONENTS: Int = 34925

const val GL_MAX_COMBINED_TESS_CONTROL_UNIFORM_COMPONENTS: Int = 36382

const val GL_MAX_COMBINED_TESS_EVALUATION_UNIFORM_COMPONENTS: Int = 36383

const val GL_UNIFORM_BLOCK_REFERENCED_BY_TESS_CONTROL_SHADER: Int = 34032

const val GL_UNIFORM_BLOCK_REFERENCED_BY_TESS_EVALUATION_SHADER: Int = 34033

const val GL_TESS_EVALUATION_SHADER: Int = 36487

const val GL_TESS_CONTROL_SHADER: Int = 36488

const val GL_TRANSFORM_FEEDBACK: Int = 36386

const val GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED: Int = 36387

const val GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE: Int = 36388

const val GL_TRANSFORM_FEEDBACK_BINDING: Int = 36389

const val GL_MAX_TRANSFORM_FEEDBACK_BUFFERS: Int = 36464

const val GL_VERSION_4_1: Int = 1

const val GL_FIXED: Int = 5132

const val GL_IMPLEMENTATION_COLOR_READ_TYPE: Int = 35738

const val GL_IMPLEMENTATION_COLOR_READ_FORMAT: Int = 35739

const val GL_LOW_FLOAT: Int = 36336

const val GL_MEDIUM_FLOAT: Int = 36337

const val GL_HIGH_FLOAT: Int = 36338

const val GL_LOW_INT: Int = 36339

const val GL_MEDIUM_INT: Int = 36340

const val GL_HIGH_INT: Int = 36341

const val GL_SHADER_COMPILER: Int = 36346

const val GL_SHADER_BINARY_FORMATS: Int = 36344

const val GL_NUM_SHADER_BINARY_FORMATS: Int = 36345

const val GL_MAX_VERTEX_UNIFORM_VECTORS: Int = 36347

const val GL_MAX_VARYING_VECTORS: Int = 36348

const val GL_MAX_FRAGMENT_UNIFORM_VECTORS: Int = 36349

const val GL_RGB565: Int = 36194

const val GL_PROGRAM_BINARY_RETRIEVABLE_HINT: Int = 33367

const val GL_PROGRAM_BINARY_LENGTH: Int = 34625

const val GL_NUM_PROGRAM_BINARY_FORMATS: Int = 34814

const val GL_PROGRAM_BINARY_FORMATS: Int = 34815

const val GL_VERTEX_SHADER_BIT: Int = 1

const val GL_FRAGMENT_SHADER_BIT: Int = 2

const val GL_GEOMETRY_SHADER_BIT: Int = 4

const val GL_TESS_CONTROL_SHADER_BIT: Int = 8

const val GL_TESS_EVALUATION_SHADER_BIT: Int = 16

const val GL_ALL_SHADER_BITS: UInt = 4294967295u

const val GL_PROGRAM_SEPARABLE: Int = 33368

const val GL_ACTIVE_PROGRAM: Int = 33369

const val GL_PROGRAM_PIPELINE_BINDING: Int = 33370

const val GL_MAX_VIEWPORTS: Int = 33371

const val GL_VIEWPORT_SUBPIXEL_BITS: Int = 33372

const val GL_VIEWPORT_BOUNDS_RANGE: Int = 33373

const val GL_LAYER_PROVOKING_VERTEX: Int = 33374

const val GL_VIEWPORT_INDEX_PROVOKING_VERTEX: Int = 33375

const val GL_UNDEFINED_VERTEX: Int = 33376

const val GL_VERSION_4_2: Int = 1

const val GL_COPY_READ_BUFFER_BINDING: Int = 36662

const val GL_COPY_WRITE_BUFFER_BINDING: Int = 36663

const val GL_TRANSFORM_FEEDBACK_ACTIVE: Int = 36388

const val GL_TRANSFORM_FEEDBACK_PAUSED: Int = 36387

const val GL_UNPACK_COMPRESSED_BLOCK_WIDTH: Int = 37159

const val GL_UNPACK_COMPRESSED_BLOCK_HEIGHT: Int = 37160

const val GL_UNPACK_COMPRESSED_BLOCK_DEPTH: Int = 37161

const val GL_UNPACK_COMPRESSED_BLOCK_SIZE: Int = 37162

const val GL_PACK_COMPRESSED_BLOCK_WIDTH: Int = 37163

const val GL_PACK_COMPRESSED_BLOCK_HEIGHT: Int = 37164

const val GL_PACK_COMPRESSED_BLOCK_DEPTH: Int = 37165

const val GL_PACK_COMPRESSED_BLOCK_SIZE: Int = 37166

const val GL_NUM_SAMPLE_COUNTS: Int = 37760

const val GL_MIN_MAP_BUFFER_ALIGNMENT: Int = 37052

const val GL_ATOMIC_COUNTER_BUFFER: Int = 37568

const val GL_ATOMIC_COUNTER_BUFFER_BINDING: Int = 37569

const val GL_ATOMIC_COUNTER_BUFFER_START: Int = 37570

const val GL_ATOMIC_COUNTER_BUFFER_SIZE: Int = 37571

const val GL_ATOMIC_COUNTER_BUFFER_DATA_SIZE: Int = 37572

const val GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTERS: Int = 37573

const val GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTER_INDICES: Int = 37574

const val GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_VERTEX_SHADER: Int = 37575

const val GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_CONTROL_SHADER: Int = 37576

const val GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_EVALUATION_SHADER: Int = 37577

const val GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_GEOMETRY_SHADER: Int = 37578

const val GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_FRAGMENT_SHADER: Int = 37579

const val GL_MAX_VERTEX_ATOMIC_COUNTER_BUFFERS: Int = 37580

const val GL_MAX_TESS_CONTROL_ATOMIC_COUNTER_BUFFERS: Int = 37581

const val GL_MAX_TESS_EVALUATION_ATOMIC_COUNTER_BUFFERS: Int = 37582

const val GL_MAX_GEOMETRY_ATOMIC_COUNTER_BUFFERS: Int = 37583

const val GL_MAX_FRAGMENT_ATOMIC_COUNTER_BUFFERS: Int = 37584

const val GL_MAX_COMBINED_ATOMIC_COUNTER_BUFFERS: Int = 37585

const val GL_MAX_VERTEX_ATOMIC_COUNTERS: Int = 37586

const val GL_MAX_TESS_CONTROL_ATOMIC_COUNTERS: Int = 37587

const val GL_MAX_TESS_EVALUATION_ATOMIC_COUNTERS: Int = 37588

const val GL_MAX_GEOMETRY_ATOMIC_COUNTERS: Int = 37589

const val GL_MAX_FRAGMENT_ATOMIC_COUNTERS: Int = 37590

const val GL_MAX_COMBINED_ATOMIC_COUNTERS: Int = 37591

const val GL_MAX_ATOMIC_COUNTER_BUFFER_SIZE: Int = 37592

const val GL_MAX_ATOMIC_COUNTER_BUFFER_BINDINGS: Int = 37596

const val GL_ACTIVE_ATOMIC_COUNTER_BUFFERS: Int = 37593

const val GL_UNIFORM_ATOMIC_COUNTER_BUFFER_INDEX: Int = 37594

const val GL_UNSIGNED_INT_ATOMIC_COUNTER: Int = 37595

const val GL_VERTEX_ATTRIB_ARRAY_BARRIER_BIT: Int = 1

const val GL_ELEMENT_ARRAY_BARRIER_BIT: Int = 2

const val GL_UNIFORM_BARRIER_BIT: Int = 4

const val GL_TEXTURE_FETCH_BARRIER_BIT: Int = 8

const val GL_SHADER_IMAGE_ACCESS_BARRIER_BIT: Int = 32

const val GL_COMMAND_BARRIER_BIT: Int = 64

const val GL_PIXEL_BUFFER_BARRIER_BIT: Int = 128

const val GL_TEXTURE_UPDATE_BARRIER_BIT: Int = 256

const val GL_BUFFER_UPDATE_BARRIER_BIT: Int = 512

const val GL_FRAMEBUFFER_BARRIER_BIT: Int = 1024

const val GL_TRANSFORM_FEEDBACK_BARRIER_BIT: Int = 2048

const val GL_ATOMIC_COUNTER_BARRIER_BIT: Int = 4096

const val GL_ALL_BARRIER_BITS: UInt = 4294967295u

const val GL_MAX_IMAGE_UNITS: Int = 36664

const val GL_MAX_COMBINED_IMAGE_UNITS_AND_FRAGMENT_OUTPUTS: Int = 36665

const val GL_IMAGE_BINDING_NAME: Int = 36666

const val GL_IMAGE_BINDING_LEVEL: Int = 36667

const val GL_IMAGE_BINDING_LAYERED: Int = 36668

const val GL_IMAGE_BINDING_LAYER: Int = 36669

const val GL_IMAGE_BINDING_ACCESS: Int = 36670

const val GL_IMAGE_1D: Int = 36940

const val GL_IMAGE_2D: Int = 36941

const val GL_IMAGE_3D: Int = 36942

const val GL_IMAGE_2D_RECT: Int = 36943

const val GL_IMAGE_CUBE: Int = 36944

const val GL_IMAGE_BUFFER: Int = 36945

const val GL_IMAGE_1D_ARRAY: Int = 36946

const val GL_IMAGE_2D_ARRAY: Int = 36947

const val GL_IMAGE_CUBE_MAP_ARRAY: Int = 36948

const val GL_IMAGE_2D_MULTISAMPLE: Int = 36949

const val GL_IMAGE_2D_MULTISAMPLE_ARRAY: Int = 36950

const val GL_INT_IMAGE_1D: Int = 36951

const val GL_INT_IMAGE_2D: Int = 36952

const val GL_INT_IMAGE_3D: Int = 36953

const val GL_INT_IMAGE_2D_RECT: Int = 36954

const val GL_INT_IMAGE_CUBE: Int = 36955

const val GL_INT_IMAGE_BUFFER: Int = 36956

const val GL_INT_IMAGE_1D_ARRAY: Int = 36957

const val GL_INT_IMAGE_2D_ARRAY: Int = 36958

const val GL_INT_IMAGE_CUBE_MAP_ARRAY: Int = 36959

const val GL_INT_IMAGE_2D_MULTISAMPLE: Int = 36960

const val GL_INT_IMAGE_2D_MULTISAMPLE_ARRAY: Int = 36961

const val GL_UNSIGNED_INT_IMAGE_1D: Int = 36962

const val GL_UNSIGNED_INT_IMAGE_2D: Int = 36963

const val GL_UNSIGNED_INT_IMAGE_3D: Int = 36964

const val GL_UNSIGNED_INT_IMAGE_2D_RECT: Int = 36965

const val GL_UNSIGNED_INT_IMAGE_CUBE: Int = 36966

const val GL_UNSIGNED_INT_IMAGE_BUFFER: Int = 36967

const val GL_UNSIGNED_INT_IMAGE_1D_ARRAY: Int = 36968

const val GL_UNSIGNED_INT_IMAGE_2D_ARRAY: Int = 36969

const val GL_UNSIGNED_INT_IMAGE_CUBE_MAP_ARRAY: Int = 36970

const val GL_UNSIGNED_INT_IMAGE_2D_MULTISAMPLE: Int = 36971

const val GL_UNSIGNED_INT_IMAGE_2D_MULTISAMPLE_ARRAY: Int = 36972

const val GL_MAX_IMAGE_SAMPLES: Int = 36973

const val GL_IMAGE_BINDING_FORMAT: Int = 36974

const val GL_IMAGE_FORMAT_COMPATIBILITY_TYPE: Int = 37063

const val GL_IMAGE_FORMAT_COMPATIBILITY_BY_SIZE: Int = 37064

const val GL_IMAGE_FORMAT_COMPATIBILITY_BY_CLASS: Int = 37065

const val GL_MAX_VERTEX_IMAGE_UNIFORMS: Int = 37066

const val GL_MAX_TESS_CONTROL_IMAGE_UNIFORMS: Int = 37067

const val GL_MAX_TESS_EVALUATION_IMAGE_UNIFORMS: Int = 37068

const val GL_MAX_GEOMETRY_IMAGE_UNIFORMS: Int = 37069

const val GL_MAX_FRAGMENT_IMAGE_UNIFORMS: Int = 37070

const val GL_MAX_COMBINED_IMAGE_UNIFORMS: Int = 37071

const val GL_COMPRESSED_RGBA_BPTC_UNORM: Int = 36492

const val GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM: Int = 36493

const val GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT: Int = 36494

const val GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT: Int = 36495

const val GL_TEXTURE_IMMUTABLE_FORMAT: Int = 37167

const val GL_VERSION_4_3: Int = 1

const val GL_NUM_SHADING_LANGUAGE_VERSIONS: Int = 33513

const val GL_VERTEX_ATTRIB_ARRAY_LONG: Int = 34638

const val GL_COMPRESSED_RGB8_ETC2: Int = 37492

const val GL_COMPRESSED_SRGB8_ETC2: Int = 37493

const val GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2: Int = 37494

const val GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2: Int = 37495

const val GL_COMPRESSED_RGBA8_ETC2_EAC: Int = 37496

const val GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC: Int = 37497

const val GL_COMPRESSED_R11_EAC: Int = 37488

const val GL_COMPRESSED_SIGNED_R11_EAC: Int = 37489

const val GL_COMPRESSED_RG11_EAC: Int = 37490

const val GL_COMPRESSED_SIGNED_RG11_EAC: Int = 37491

const val GL_PRIMITIVE_RESTART_FIXED_INDEX: Int = 36201

const val GL_ANY_SAMPLES_PASSED_CONSERVATIVE: Int = 36202

const val GL_MAX_ELEMENT_INDEX: Int = 36203

const val GL_COMPUTE_SHADER: Int = 37305

const val GL_MAX_COMPUTE_UNIFORM_BLOCKS: Int = 37307

const val GL_MAX_COMPUTE_TEXTURE_IMAGE_UNITS: Int = 37308

const val GL_MAX_COMPUTE_IMAGE_UNIFORMS: Int = 37309

const val GL_MAX_COMPUTE_SHARED_MEMORY_SIZE: Int = 33378

const val GL_MAX_COMPUTE_UNIFORM_COMPONENTS: Int = 33379

const val GL_MAX_COMPUTE_ATOMIC_COUNTER_BUFFERS: Int = 33380

const val GL_MAX_COMPUTE_ATOMIC_COUNTERS: Int = 33381

const val GL_MAX_COMBINED_COMPUTE_UNIFORM_COMPONENTS: Int = 33382

const val GL_MAX_COMPUTE_WORK_GROUP_INVOCATIONS: Int = 37099

const val GL_MAX_COMPUTE_WORK_GROUP_COUNT: Int = 37310

const val GL_MAX_COMPUTE_WORK_GROUP_SIZE: Int = 37311

const val GL_COMPUTE_WORK_GROUP_SIZE: Int = 33383

const val GL_UNIFORM_BLOCK_REFERENCED_BY_COMPUTE_SHADER: Int = 37100

const val GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_COMPUTE_SHADER: Int = 37101

const val GL_DISPATCH_INDIRECT_BUFFER: Int = 37102

const val GL_DISPATCH_INDIRECT_BUFFER_BINDING: Int = 37103

const val GL_COMPUTE_SHADER_BIT: Int = 32

const val GL_DEBUG_OUTPUT_SYNCHRONOUS: Int = 33346

const val GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH: Int = 33347

const val GL_DEBUG_CALLBACK_FUNCTION: Int = 33348

const val GL_DEBUG_CALLBACK_USER_PARAM: Int = 33349

const val GL_DEBUG_SOURCE_API: Int = 33350

const val GL_DEBUG_SOURCE_WINDOW_SYSTEM: Int = 33351

const val GL_DEBUG_SOURCE_SHADER_COMPILER: Int = 33352

const val GL_DEBUG_SOURCE_THIRD_PARTY: Int = 33353

const val GL_DEBUG_SOURCE_APPLICATION: Int = 33354

const val GL_DEBUG_SOURCE_OTHER: Int = 33355

const val GL_DEBUG_TYPE_ERROR: Int = 33356

const val GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR: Int = 33357

const val GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR: Int = 33358

const val GL_DEBUG_TYPE_PORTABILITY: Int = 33359

const val GL_DEBUG_TYPE_PERFORMANCE: Int = 33360

const val GL_DEBUG_TYPE_OTHER: Int = 33361

const val GL_MAX_DEBUG_MESSAGE_LENGTH: Int = 37187

const val GL_MAX_DEBUG_LOGGED_MESSAGES: Int = 37188

const val GL_DEBUG_LOGGED_MESSAGES: Int = 37189

const val GL_DEBUG_SEVERITY_HIGH: Int = 37190

const val GL_DEBUG_SEVERITY_MEDIUM: Int = 37191

const val GL_DEBUG_SEVERITY_LOW: Int = 37192

const val GL_DEBUG_TYPE_MARKER: Int = 33384

const val GL_DEBUG_TYPE_PUSH_GROUP: Int = 33385

const val GL_DEBUG_TYPE_POP_GROUP: Int = 33386

const val GL_DEBUG_SEVERITY_NOTIFICATION: Int = 33387

const val GL_MAX_DEBUG_GROUP_STACK_DEPTH: Int = 33388

const val GL_DEBUG_GROUP_STACK_DEPTH: Int = 33389

const val GL_BUFFER: Int = 33504

const val GL_SHADER: Int = 33505

const val GL_PROGRAM: Int = 33506

const val GL_QUERY: Int = 33507

const val GL_PROGRAM_PIPELINE: Int = 33508

const val GL_SAMPLER: Int = 33510

const val GL_MAX_LABEL_LENGTH: Int = 33512

const val GL_DEBUG_OUTPUT: Int = 37600

const val GL_CONTEXT_FLAG_DEBUG_BIT: Int = 2

const val GL_MAX_UNIFORM_LOCATIONS: Int = 33390

const val GL_FRAMEBUFFER_DEFAULT_WIDTH: Int = 37648

const val GL_FRAMEBUFFER_DEFAULT_HEIGHT: Int = 37649

const val GL_FRAMEBUFFER_DEFAULT_LAYERS: Int = 37650

const val GL_FRAMEBUFFER_DEFAULT_SAMPLES: Int = 37651

const val GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS: Int = 37652

const val GL_MAX_FRAMEBUFFER_WIDTH: Int = 37653

const val GL_MAX_FRAMEBUFFER_HEIGHT: Int = 37654

const val GL_MAX_FRAMEBUFFER_LAYERS: Int = 37655

const val GL_MAX_FRAMEBUFFER_SAMPLES: Int = 37656

const val GL_INTERNALFORMAT_SUPPORTED: Int = 33391

const val GL_INTERNALFORMAT_PREFERRED: Int = 33392

const val GL_INTERNALFORMAT_RED_SIZE: Int = 33393

const val GL_INTERNALFORMAT_GREEN_SIZE: Int = 33394

const val GL_INTERNALFORMAT_BLUE_SIZE: Int = 33395

const val GL_INTERNALFORMAT_ALPHA_SIZE: Int = 33396

const val GL_INTERNALFORMAT_DEPTH_SIZE: Int = 33397

const val GL_INTERNALFORMAT_STENCIL_SIZE: Int = 33398

const val GL_INTERNALFORMAT_SHARED_SIZE: Int = 33399

const val GL_INTERNALFORMAT_RED_TYPE: Int = 33400

const val GL_INTERNALFORMAT_GREEN_TYPE: Int = 33401

const val GL_INTERNALFORMAT_BLUE_TYPE: Int = 33402

const val GL_INTERNALFORMAT_ALPHA_TYPE: Int = 33403

const val GL_INTERNALFORMAT_DEPTH_TYPE: Int = 33404

const val GL_INTERNALFORMAT_STENCIL_TYPE: Int = 33405

const val GL_MAX_WIDTH: Int = 33406

const val GL_MAX_HEIGHT: Int = 33407

const val GL_MAX_DEPTH: Int = 33408

const val GL_MAX_LAYERS: Int = 33409

const val GL_MAX_COMBINED_DIMENSIONS: Int = 33410

const val GL_COLOR_COMPONENTS: Int = 33411

const val GL_DEPTH_COMPONENTS: Int = 33412

const val GL_STENCIL_COMPONENTS: Int = 33413

const val GL_COLOR_RENDERABLE: Int = 33414

const val GL_DEPTH_RENDERABLE: Int = 33415

const val GL_STENCIL_RENDERABLE: Int = 33416

const val GL_FRAMEBUFFER_RENDERABLE: Int = 33417

const val GL_FRAMEBUFFER_RENDERABLE_LAYERED: Int = 33418

const val GL_FRAMEBUFFER_BLEND: Int = 33419

const val GL_READ_PIXELS: Int = 33420

const val GL_READ_PIXELS_FORMAT: Int = 33421

const val GL_READ_PIXELS_TYPE: Int = 33422

const val GL_TEXTURE_IMAGE_FORMAT: Int = 33423

const val GL_TEXTURE_IMAGE_TYPE: Int = 33424

const val GL_GET_TEXTURE_IMAGE_FORMAT: Int = 33425

const val GL_GET_TEXTURE_IMAGE_TYPE: Int = 33426

const val GL_MIPMAP: Int = 33427

const val GL_MANUAL_GENERATE_MIPMAP: Int = 33428

const val GL_AUTO_GENERATE_MIPMAP: Int = 33429

const val GL_COLOR_ENCODING: Int = 33430

const val GL_SRGB_READ: Int = 33431

const val GL_SRGB_WRITE: Int = 33432

const val GL_FILTER: Int = 33434

const val GL_VERTEX_TEXTURE: Int = 33435

const val GL_TESS_CONTROL_TEXTURE: Int = 33436

const val GL_TESS_EVALUATION_TEXTURE: Int = 33437

const val GL_GEOMETRY_TEXTURE: Int = 33438

const val GL_FRAGMENT_TEXTURE: Int = 33439

const val GL_COMPUTE_TEXTURE: Int = 33440

const val GL_TEXTURE_SHADOW: Int = 33441

const val GL_TEXTURE_GATHER: Int = 33442

const val GL_TEXTURE_GATHER_SHADOW: Int = 33443

const val GL_SHADER_IMAGE_LOAD: Int = 33444

const val GL_SHADER_IMAGE_STORE: Int = 33445

const val GL_SHADER_IMAGE_ATOMIC: Int = 33446

const val GL_IMAGE_TEXEL_SIZE: Int = 33447

const val GL_IMAGE_COMPATIBILITY_CLASS: Int = 33448

const val GL_IMAGE_PIXEL_FORMAT: Int = 33449

const val GL_IMAGE_PIXEL_TYPE: Int = 33450

const val GL_SIMULTANEOUS_TEXTURE_AND_DEPTH_TEST: Int = 33452

const val GL_SIMULTANEOUS_TEXTURE_AND_STENCIL_TEST: Int = 33453

const val GL_SIMULTANEOUS_TEXTURE_AND_DEPTH_WRITE: Int = 33454

const val GL_SIMULTANEOUS_TEXTURE_AND_STENCIL_WRITE: Int = 33455

const val GL_TEXTURE_COMPRESSED_BLOCK_WIDTH: Int = 33457

const val GL_TEXTURE_COMPRESSED_BLOCK_HEIGHT: Int = 33458

const val GL_TEXTURE_COMPRESSED_BLOCK_SIZE: Int = 33459

const val GL_CLEAR_BUFFER: Int = 33460

const val GL_TEXTURE_VIEW: Int = 33461

const val GL_VIEW_COMPATIBILITY_CLASS: Int = 33462

const val GL_FULL_SUPPORT: Int = 33463

const val GL_CAVEAT_SUPPORT: Int = 33464

const val GL_IMAGE_CLASS_4_X_32: Int = 33465

const val GL_IMAGE_CLASS_2_X_32: Int = 33466

const val GL_IMAGE_CLASS_1_X_32: Int = 33467

const val GL_IMAGE_CLASS_4_X_16: Int = 33468

const val GL_IMAGE_CLASS_2_X_16: Int = 33469

const val GL_IMAGE_CLASS_1_X_16: Int = 33470

const val GL_IMAGE_CLASS_4_X_8: Int = 33471

const val GL_IMAGE_CLASS_2_X_8: Int = 33472

const val GL_IMAGE_CLASS_1_X_8: Int = 33473

const val GL_IMAGE_CLASS_11_11_10: Int = 33474

const val GL_IMAGE_CLASS_10_10_10_2: Int = 33475

const val GL_VIEW_CLASS_128_BITS: Int = 33476

const val GL_VIEW_CLASS_96_BITS: Int = 33477

const val GL_VIEW_CLASS_64_BITS: Int = 33478

const val GL_VIEW_CLASS_48_BITS: Int = 33479

const val GL_VIEW_CLASS_32_BITS: Int = 33480

const val GL_VIEW_CLASS_24_BITS: Int = 33481

const val GL_VIEW_CLASS_16_BITS: Int = 33482

const val GL_VIEW_CLASS_8_BITS: Int = 33483

const val GL_VIEW_CLASS_S3TC_DXT1_RGB: Int = 33484

const val GL_VIEW_CLASS_S3TC_DXT1_RGBA: Int = 33485

const val GL_VIEW_CLASS_S3TC_DXT3_RGBA: Int = 33486

const val GL_VIEW_CLASS_S3TC_DXT5_RGBA: Int = 33487

const val GL_VIEW_CLASS_RGTC1_RED: Int = 33488

const val GL_VIEW_CLASS_RGTC2_RG: Int = 33489

const val GL_VIEW_CLASS_BPTC_UNORM: Int = 33490

const val GL_VIEW_CLASS_BPTC_FLOAT: Int = 33491

const val GL_UNIFORM: Int = 37601

const val GL_UNIFORM_BLOCK: Int = 37602

const val GL_PROGRAM_INPUT: Int = 37603

const val GL_PROGRAM_OUTPUT: Int = 37604

const val GL_BUFFER_VARIABLE: Int = 37605

const val GL_SHADER_STORAGE_BLOCK: Int = 37606

const val GL_VERTEX_SUBROUTINE: Int = 37608

const val GL_TESS_CONTROL_SUBROUTINE: Int = 37609

const val GL_TESS_EVALUATION_SUBROUTINE: Int = 37610

const val GL_GEOMETRY_SUBROUTINE: Int = 37611

const val GL_FRAGMENT_SUBROUTINE: Int = 37612

const val GL_COMPUTE_SUBROUTINE: Int = 37613

const val GL_VERTEX_SUBROUTINE_UNIFORM: Int = 37614

const val GL_TESS_CONTROL_SUBROUTINE_UNIFORM: Int = 37615

const val GL_TESS_EVALUATION_SUBROUTINE_UNIFORM: Int = 37616

const val GL_GEOMETRY_SUBROUTINE_UNIFORM: Int = 37617

const val GL_FRAGMENT_SUBROUTINE_UNIFORM: Int = 37618

const val GL_COMPUTE_SUBROUTINE_UNIFORM: Int = 37619

const val GL_TRANSFORM_FEEDBACK_VARYING: Int = 37620

const val GL_ACTIVE_RESOURCES: Int = 37621

const val GL_MAX_NAME_LENGTH: Int = 37622

const val GL_MAX_NUM_ACTIVE_VARIABLES: Int = 37623

const val GL_MAX_NUM_COMPATIBLE_SUBROUTINES: Int = 37624

const val GL_NAME_LENGTH: Int = 37625

const val GL_TYPE: Int = 37626

const val GL_ARRAY_SIZE: Int = 37627

const val GL_OFFSET: Int = 37628

const val GL_BLOCK_INDEX: Int = 37629

const val GL_ARRAY_STRIDE: Int = 37630

const val GL_MATRIX_STRIDE: Int = 37631

const val GL_IS_ROW_MAJOR: Int = 37632

const val GL_ATOMIC_COUNTER_BUFFER_INDEX: Int = 37633

const val GL_BUFFER_BINDING: Int = 37634

const val GL_BUFFER_DATA_SIZE: Int = 37635

const val GL_NUM_ACTIVE_VARIABLES: Int = 37636

const val GL_ACTIVE_VARIABLES: Int = 37637

const val GL_REFERENCED_BY_VERTEX_SHADER: Int = 37638

const val GL_REFERENCED_BY_TESS_CONTROL_SHADER: Int = 37639

const val GL_REFERENCED_BY_TESS_EVALUATION_SHADER: Int = 37640

const val GL_REFERENCED_BY_GEOMETRY_SHADER: Int = 37641

const val GL_REFERENCED_BY_FRAGMENT_SHADER: Int = 37642

const val GL_REFERENCED_BY_COMPUTE_SHADER: Int = 37643

const val GL_TOP_LEVEL_ARRAY_SIZE: Int = 37644

const val GL_TOP_LEVEL_ARRAY_STRIDE: Int = 37645

const val GL_LOCATION: Int = 37646

const val GL_LOCATION_INDEX: Int = 37647

const val GL_IS_PER_PATCH: Int = 37607

const val GL_SHADER_STORAGE_BUFFER: Int = 37074

const val GL_SHADER_STORAGE_BUFFER_BINDING: Int = 37075

const val GL_SHADER_STORAGE_BUFFER_START: Int = 37076

const val GL_SHADER_STORAGE_BUFFER_SIZE: Int = 37077

const val GL_MAX_VERTEX_SHADER_STORAGE_BLOCKS: Int = 37078

const val GL_MAX_GEOMETRY_SHADER_STORAGE_BLOCKS: Int = 37079

const val GL_MAX_TESS_CONTROL_SHADER_STORAGE_BLOCKS: Int = 37080

const val GL_MAX_TESS_EVALUATION_SHADER_STORAGE_BLOCKS: Int = 37081

const val GL_MAX_FRAGMENT_SHADER_STORAGE_BLOCKS: Int = 37082

const val GL_MAX_COMPUTE_SHADER_STORAGE_BLOCKS: Int = 37083

const val GL_MAX_COMBINED_SHADER_STORAGE_BLOCKS: Int = 37084

const val GL_MAX_SHADER_STORAGE_BUFFER_BINDINGS: Int = 37085

const val GL_MAX_SHADER_STORAGE_BLOCK_SIZE: Int = 37086

const val GL_SHADER_STORAGE_BUFFER_OFFSET_ALIGNMENT: Int = 37087

const val GL_SHADER_STORAGE_BARRIER_BIT: Int = 8192

const val GL_MAX_COMBINED_SHADER_OUTPUT_RESOURCES: Int = 36665

const val GL_DEPTH_STENCIL_TEXTURE_MODE: Int = 37098

const val GL_TEXTURE_BUFFER_OFFSET: Int = 37277

const val GL_TEXTURE_BUFFER_SIZE: Int = 37278

const val GL_TEXTURE_BUFFER_OFFSET_ALIGNMENT: Int = 37279

const val GL_TEXTURE_VIEW_MIN_LEVEL: Int = 33499

const val GL_TEXTURE_VIEW_NUM_LEVELS: Int = 33500

const val GL_TEXTURE_VIEW_MIN_LAYER: Int = 33501

const val GL_TEXTURE_VIEW_NUM_LAYERS: Int = 33502

const val GL_TEXTURE_IMMUTABLE_LEVELS: Int = 33503

const val GL_VERTEX_ATTRIB_BINDING: Int = 33492

const val GL_VERTEX_ATTRIB_RELATIVE_OFFSET: Int = 33493

const val GL_VERTEX_BINDING_DIVISOR: Int = 33494

const val GL_VERTEX_BINDING_OFFSET: Int = 33495

const val GL_VERTEX_BINDING_STRIDE: Int = 33496

const val GL_MAX_VERTEX_ATTRIB_RELATIVE_OFFSET: Int = 33497

const val GL_MAX_VERTEX_ATTRIB_BINDINGS: Int = 33498

const val GL_VERTEX_BINDING_BUFFER: Int = 36687

const val GL_DISPLAY_LIST: Int = 33511

const val GL_VERSION_4_4: Int = 1

const val GL_MAX_VERTEX_ATTRIB_STRIDE: Int = 33509

const val GL_PRIMITIVE_RESTART_FOR_PATCHES_SUPPORTED: Int = 33313

const val GL_TEXTURE_BUFFER_BINDING: Int = 35882

const val GL_MAP_PERSISTENT_BIT: Int = 64

const val GL_MAP_COHERENT_BIT: Int = 128

const val GL_DYNAMIC_STORAGE_BIT: Int = 256

const val GL_CLIENT_STORAGE_BIT: Int = 512

const val GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT: Int = 16384

const val GL_BUFFER_IMMUTABLE_STORAGE: Int = 33311

const val GL_BUFFER_STORAGE_FLAGS: Int = 33312

const val GL_CLEAR_TEXTURE: Int = 37733

const val GL_LOCATION_COMPONENT: Int = 37706

const val GL_TRANSFORM_FEEDBACK_BUFFER_INDEX: Int = 37707

const val GL_TRANSFORM_FEEDBACK_BUFFER_STRIDE: Int = 37708

const val GL_QUERY_BUFFER: Int = 37266

const val GL_QUERY_BUFFER_BARRIER_BIT: Int = 32768

const val GL_QUERY_BUFFER_BINDING: Int = 37267

const val GL_QUERY_RESULT_NO_WAIT: Int = 37268

const val GL_MIRROR_CLAMP_TO_EDGE: Int = 34627

const val GL_VERSION_4_5: Int = 1

const val GL_CONTEXT_LOST: Int = 1287

const val GL_NEGATIVE_ONE_TO_ONE: Int = 37726

const val GL_ZERO_TO_ONE: Int = 37727

const val GL_CLIP_ORIGIN: Int = 37724

const val GL_CLIP_DEPTH_MODE: Int = 37725

const val GL_QUERY_WAIT_INVERTED: Int = 36375

const val GL_QUERY_NO_WAIT_INVERTED: Int = 36376

const val GL_QUERY_BY_REGION_WAIT_INVERTED: Int = 36377

const val GL_QUERY_BY_REGION_NO_WAIT_INVERTED: Int = 36378

const val GL_MAX_CULL_DISTANCES: Int = 33529

const val GL_MAX_COMBINED_CLIP_AND_CULL_DISTANCES: Int = 33530

const val GL_TEXTURE_TARGET: Int = 4102

const val GL_QUERY_TARGET: Int = 33514

const val GL_GUILTY_CONTEXT_RESET: Int = 33363

const val GL_INNOCENT_CONTEXT_RESET: Int = 33364

const val GL_UNKNOWN_CONTEXT_RESET: Int = 33365

const val GL_RESET_NOTIFICATION_STRATEGY: Int = 33366

const val GL_LOSE_CONTEXT_ON_RESET: Int = 33362

const val GL_NO_RESET_NOTIFICATION: Int = 33377

const val GL_CONTEXT_FLAG_ROBUST_ACCESS_BIT: Int = 4

const val GL_CONTEXT_RELEASE_BEHAVIOR: Int = 33531

const val GL_CONTEXT_RELEASE_BEHAVIOR_FLUSH: Int = 33532

const val GL_VERSION_4_6: Int = 1

const val GL_SHADER_BINARY_FORMAT_SPIR_V: Int = 38225

const val GL_SPIR_V_BINARY: Int = 38226

const val GL_PARAMETER_BUFFER: Int = 33006

const val GL_PARAMETER_BUFFER_BINDING: Int = 33007

const val GL_CONTEXT_FLAG_NO_ERROR_BIT: Int = 8

const val GL_VERTICES_SUBMITTED: Int = 33518

const val GL_PRIMITIVES_SUBMITTED: Int = 33519

const val GL_VERTEX_SHADER_INVOCATIONS: Int = 33520

const val GL_TESS_CONTROL_SHADER_PATCHES: Int = 33521

const val GL_TESS_EVALUATION_SHADER_INVOCATIONS: Int = 33522

const val GL_GEOMETRY_SHADER_PRIMITIVES_EMITTED: Int = 33523

const val GL_FRAGMENT_SHADER_INVOCATIONS: Int = 33524

const val GL_COMPUTE_SHADER_INVOCATIONS: Int = 33525

const val GL_CLIPPING_INPUT_PRIMITIVES: Int = 33526

const val GL_CLIPPING_OUTPUT_PRIMITIVES: Int = 33527

const val GL_POLYGON_OFFSET_CLAMP: Int = 36379

const val GL_SPIR_V_EXTENSIONS: Int = 38227

const val GL_NUM_SPIR_V_EXTENSIONS: Int = 38228

const val GL_TEXTURE_MAX_ANISOTROPY: Int = 34046

const val GL_MAX_TEXTURE_MAX_ANISOTROPY: Int = 34047

const val GL_TRANSFORM_FEEDBACK_OVERFLOW: Int = 33516

const val GL_TRANSFORM_FEEDBACK_STREAM_OVERFLOW: Int = 33517

const val GL_ARB_ES2_compatibility: Int = 1

const val GL_ARB_ES3_1_compatibility: Int = 1

const val GL_ARB_ES3_2_compatibility: Int = 1

const val GL_PRIMITIVE_BOUNDING_BOX_ARB: Int = 37566

const val GL_MULTISAMPLE_LINE_WIDTH_RANGE_ARB: Int = 37761

const val GL_MULTISAMPLE_LINE_WIDTH_GRANULARITY_ARB: Int = 37762

const val GL_ARB_ES3_compatibility: Int = 1

const val GL_ARB_arrays_of_arrays: Int = 1

const val GL_ARB_base_instance: Int = 1

const val GL_ARB_bindless_texture: Int = 1

const val GL_UNSIGNED_INT64_ARB: Int = 5135

const val GL_ARB_blend_func_extended: Int = 1

const val GL_ARB_buffer_storage: Int = 1

const val GL_ARB_cl_event: Int = 1

const val GL_SYNC_CL_EVENT_ARB: Int = 33344

const val GL_SYNC_CL_EVENT_COMPLETE_ARB: Int = 33345

const val GL_ARB_clear_buffer_object: Int = 1

const val GL_ARB_clear_texture: Int = 1

const val GL_ARB_clip_control: Int = 1

const val GL_ARB_color_buffer_float: Int = 1

const val GL_RGBA_FLOAT_MODE_ARB: Int = 34848

const val GL_CLAMP_VERTEX_COLOR_ARB: Int = 35098

const val GL_CLAMP_FRAGMENT_COLOR_ARB: Int = 35099

const val GL_CLAMP_READ_COLOR_ARB: Int = 35100

const val GL_FIXED_ONLY_ARB: Int = 35101

const val GL_ARB_compatibility: Int = 1

const val GL_ARB_compressed_texture_pixel_storage: Int = 1

const val GL_ARB_compute_shader: Int = 1

const val GL_ARB_compute_variable_group_size: Int = 1

const val GL_MAX_COMPUTE_VARIABLE_GROUP_INVOCATIONS_ARB: Int = 37700

const val GL_MAX_COMPUTE_FIXED_GROUP_INVOCATIONS_ARB: Int = 37099

const val GL_MAX_COMPUTE_VARIABLE_GROUP_SIZE_ARB: Int = 37701

const val GL_MAX_COMPUTE_FIXED_GROUP_SIZE_ARB: Int = 37311

const val GL_ARB_conditional_render_inverted: Int = 1

const val GL_ARB_conservative_depth: Int = 1

const val GL_ARB_copy_buffer: Int = 1

const val GL_ARB_copy_image: Int = 1

const val GL_ARB_cull_distance: Int = 1

const val GL_ARB_debug_output: Int = 1

const val GL_DEBUG_OUTPUT_SYNCHRONOUS_ARB: Int = 33346

const val GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH_ARB: Int = 33347

const val GL_DEBUG_CALLBACK_FUNCTION_ARB: Int = 33348

const val GL_DEBUG_CALLBACK_USER_PARAM_ARB: Int = 33349

const val GL_DEBUG_SOURCE_API_ARB: Int = 33350

const val GL_DEBUG_SOURCE_WINDOW_SYSTEM_ARB: Int = 33351

const val GL_DEBUG_SOURCE_SHADER_COMPILER_ARB: Int = 33352

const val GL_DEBUG_SOURCE_THIRD_PARTY_ARB: Int = 33353

const val GL_DEBUG_SOURCE_APPLICATION_ARB: Int = 33354

const val GL_DEBUG_SOURCE_OTHER_ARB: Int = 33355

const val GL_DEBUG_TYPE_ERROR_ARB: Int = 33356

const val GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR_ARB: Int = 33357

const val GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR_ARB: Int = 33358

const val GL_DEBUG_TYPE_PORTABILITY_ARB: Int = 33359

const val GL_DEBUG_TYPE_PERFORMANCE_ARB: Int = 33360

const val GL_DEBUG_TYPE_OTHER_ARB: Int = 33361

const val GL_MAX_DEBUG_MESSAGE_LENGTH_ARB: Int = 37187

const val GL_MAX_DEBUG_LOGGED_MESSAGES_ARB: Int = 37188

const val GL_DEBUG_LOGGED_MESSAGES_ARB: Int = 37189

const val GL_DEBUG_SEVERITY_HIGH_ARB: Int = 37190

const val GL_DEBUG_SEVERITY_MEDIUM_ARB: Int = 37191

const val GL_DEBUG_SEVERITY_LOW_ARB: Int = 37192

const val GL_ARB_depth_buffer_float: Int = 1

const val GL_ARB_depth_clamp: Int = 1

const val GL_ARB_depth_texture: Int = 1

const val GL_DEPTH_COMPONENT16_ARB: Int = 33189

const val GL_DEPTH_COMPONENT24_ARB: Int = 33190

const val GL_DEPTH_COMPONENT32_ARB: Int = 33191

const val GL_TEXTURE_DEPTH_SIZE_ARB: Int = 34890

const val GL_DEPTH_TEXTURE_MODE_ARB: Int = 34891

const val GL_ARB_derivative_control: Int = 1

const val GL_ARB_direct_state_access: Int = 1

const val GL_ARB_draw_buffers: Int = 1

const val GL_MAX_DRAW_BUFFERS_ARB: Int = 34852

const val GL_DRAW_BUFFER0_ARB: Int = 34853

const val GL_DRAW_BUFFER1_ARB: Int = 34854

const val GL_DRAW_BUFFER2_ARB: Int = 34855

const val GL_DRAW_BUFFER3_ARB: Int = 34856

const val GL_DRAW_BUFFER4_ARB: Int = 34857

const val GL_DRAW_BUFFER5_ARB: Int = 34858

const val GL_DRAW_BUFFER6_ARB: Int = 34859

const val GL_DRAW_BUFFER7_ARB: Int = 34860

const val GL_DRAW_BUFFER8_ARB: Int = 34861

const val GL_DRAW_BUFFER9_ARB: Int = 34862

const val GL_DRAW_BUFFER10_ARB: Int = 34863

const val GL_DRAW_BUFFER11_ARB: Int = 34864

const val GL_DRAW_BUFFER12_ARB: Int = 34865

const val GL_DRAW_BUFFER13_ARB: Int = 34866

const val GL_DRAW_BUFFER14_ARB: Int = 34867

const val GL_DRAW_BUFFER15_ARB: Int = 34868

const val GL_ARB_draw_buffers_blend: Int = 1

const val GL_ARB_draw_elements_base_vertex: Int = 1

const val GL_ARB_draw_indirect: Int = 1

const val GL_ARB_draw_instanced: Int = 1

const val GL_ARB_enhanced_layouts: Int = 1

const val GL_ARB_explicit_attrib_location: Int = 1

const val GL_ARB_explicit_uniform_location: Int = 1

const val GL_ARB_fragment_coord_conventions: Int = 1

const val GL_ARB_fragment_layer_viewport: Int = 1

const val GL_ARB_fragment_program: Int = 1

const val GL_FRAGMENT_PROGRAM_ARB: Int = 34820

const val GL_PROGRAM_FORMAT_ASCII_ARB: Int = 34933

const val GL_PROGRAM_LENGTH_ARB: Int = 34343

const val GL_PROGRAM_FORMAT_ARB: Int = 34934

const val GL_PROGRAM_BINDING_ARB: Int = 34423

const val GL_PROGRAM_INSTRUCTIONS_ARB: Int = 34976

const val GL_MAX_PROGRAM_INSTRUCTIONS_ARB: Int = 34977

const val GL_PROGRAM_NATIVE_INSTRUCTIONS_ARB: Int = 34978

const val GL_MAX_PROGRAM_NATIVE_INSTRUCTIONS_ARB: Int = 34979

const val GL_PROGRAM_TEMPORARIES_ARB: Int = 34980

const val GL_MAX_PROGRAM_TEMPORARIES_ARB: Int = 34981

const val GL_PROGRAM_NATIVE_TEMPORARIES_ARB: Int = 34982

const val GL_MAX_PROGRAM_NATIVE_TEMPORARIES_ARB: Int = 34983

const val GL_PROGRAM_PARAMETERS_ARB: Int = 34984

const val GL_MAX_PROGRAM_PARAMETERS_ARB: Int = 34985

const val GL_PROGRAM_NATIVE_PARAMETERS_ARB: Int = 34986

const val GL_MAX_PROGRAM_NATIVE_PARAMETERS_ARB: Int = 34987

const val GL_PROGRAM_ATTRIBS_ARB: Int = 34988

const val GL_MAX_PROGRAM_ATTRIBS_ARB: Int = 34989

const val GL_PROGRAM_NATIVE_ATTRIBS_ARB: Int = 34990

const val GL_MAX_PROGRAM_NATIVE_ATTRIBS_ARB: Int = 34991

const val GL_MAX_PROGRAM_LOCAL_PARAMETERS_ARB: Int = 34996

const val GL_MAX_PROGRAM_ENV_PARAMETERS_ARB: Int = 34997

const val GL_PROGRAM_UNDER_NATIVE_LIMITS_ARB: Int = 34998

const val GL_PROGRAM_ALU_INSTRUCTIONS_ARB: Int = 34821

const val GL_PROGRAM_TEX_INSTRUCTIONS_ARB: Int = 34822

const val GL_PROGRAM_TEX_INDIRECTIONS_ARB: Int = 34823

const val GL_PROGRAM_NATIVE_ALU_INSTRUCTIONS_ARB: Int = 34824

const val GL_PROGRAM_NATIVE_TEX_INSTRUCTIONS_ARB: Int = 34825

const val GL_PROGRAM_NATIVE_TEX_INDIRECTIONS_ARB: Int = 34826

const val GL_MAX_PROGRAM_ALU_INSTRUCTIONS_ARB: Int = 34827

const val GL_MAX_PROGRAM_TEX_INSTRUCTIONS_ARB: Int = 34828

const val GL_MAX_PROGRAM_TEX_INDIRECTIONS_ARB: Int = 34829

const val GL_MAX_PROGRAM_NATIVE_ALU_INSTRUCTIONS_ARB: Int = 34830

const val GL_MAX_PROGRAM_NATIVE_TEX_INSTRUCTIONS_ARB: Int = 34831

const val GL_MAX_PROGRAM_NATIVE_TEX_INDIRECTIONS_ARB: Int = 34832

const val GL_PROGRAM_STRING_ARB: Int = 34344

const val GL_PROGRAM_ERROR_POSITION_ARB: Int = 34379

const val GL_CURRENT_MATRIX_ARB: Int = 34369

const val GL_TRANSPOSE_CURRENT_MATRIX_ARB: Int = 34999

const val GL_CURRENT_MATRIX_STACK_DEPTH_ARB: Int = 34368

const val GL_MAX_PROGRAM_MATRICES_ARB: Int = 34351

const val GL_MAX_PROGRAM_MATRIX_STACK_DEPTH_ARB: Int = 34350

const val GL_MAX_TEXTURE_COORDS_ARB: Int = 34929

const val GL_MAX_TEXTURE_IMAGE_UNITS_ARB: Int = 34930

const val GL_PROGRAM_ERROR_STRING_ARB: Int = 34932

const val GL_MATRIX0_ARB: Int = 35008

const val GL_MATRIX1_ARB: Int = 35009

const val GL_MATRIX2_ARB: Int = 35010

const val GL_MATRIX3_ARB: Int = 35011

const val GL_MATRIX4_ARB: Int = 35012

const val GL_MATRIX5_ARB: Int = 35013

const val GL_MATRIX6_ARB: Int = 35014

const val GL_MATRIX7_ARB: Int = 35015

const val GL_MATRIX8_ARB: Int = 35016

const val GL_MATRIX9_ARB: Int = 35017

const val GL_MATRIX10_ARB: Int = 35018

const val GL_MATRIX11_ARB: Int = 35019

const val GL_MATRIX12_ARB: Int = 35020

const val GL_MATRIX13_ARB: Int = 35021

const val GL_MATRIX14_ARB: Int = 35022

const val GL_MATRIX15_ARB: Int = 35023

const val GL_MATRIX16_ARB: Int = 35024

const val GL_MATRIX17_ARB: Int = 35025

const val GL_MATRIX18_ARB: Int = 35026

const val GL_MATRIX19_ARB: Int = 35027

const val GL_MATRIX20_ARB: Int = 35028

const val GL_MATRIX21_ARB: Int = 35029

const val GL_MATRIX22_ARB: Int = 35030

const val GL_MATRIX23_ARB: Int = 35031

const val GL_MATRIX24_ARB: Int = 35032

const val GL_MATRIX25_ARB: Int = 35033

const val GL_MATRIX26_ARB: Int = 35034

const val GL_MATRIX27_ARB: Int = 35035

const val GL_MATRIX28_ARB: Int = 35036

const val GL_MATRIX29_ARB: Int = 35037

const val GL_MATRIX30_ARB: Int = 35038

const val GL_MATRIX31_ARB: Int = 35039

const val GL_ARB_fragment_program_shadow: Int = 1

const val GL_ARB_fragment_shader: Int = 1

const val GL_FRAGMENT_SHADER_ARB: Int = 35632

const val GL_MAX_FRAGMENT_UNIFORM_COMPONENTS_ARB: Int = 35657

const val GL_FRAGMENT_SHADER_DERIVATIVE_HINT_ARB: Int = 35723

const val GL_ARB_fragment_shader_interlock: Int = 1

const val GL_ARB_framebuffer_no_attachments: Int = 1

const val GL_ARB_framebuffer_object: Int = 1

const val GL_ARB_framebuffer_sRGB: Int = 1

const val GL_ARB_geometry_shader4: Int = 1

const val GL_LINES_ADJACENCY_ARB: Int = 10

const val GL_LINE_STRIP_ADJACENCY_ARB: Int = 11

const val GL_TRIANGLES_ADJACENCY_ARB: Int = 12

const val GL_TRIANGLE_STRIP_ADJACENCY_ARB: Int = 13

const val GL_PROGRAM_POINT_SIZE_ARB: Int = 34370

const val GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS_ARB: Int = 35881

const val GL_FRAMEBUFFER_ATTACHMENT_LAYERED_ARB: Int = 36263

const val GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS_ARB: Int = 36264

const val GL_FRAMEBUFFER_INCOMPLETE_LAYER_COUNT_ARB: Int = 36265

const val GL_GEOMETRY_SHADER_ARB: Int = 36313

const val GL_GEOMETRY_VERTICES_OUT_ARB: Int = 36314

const val GL_GEOMETRY_INPUT_TYPE_ARB: Int = 36315

const val GL_GEOMETRY_OUTPUT_TYPE_ARB: Int = 36316

const val GL_MAX_GEOMETRY_VARYING_COMPONENTS_ARB: Int = 36317

const val GL_MAX_VERTEX_VARYING_COMPONENTS_ARB: Int = 36318

const val GL_MAX_GEOMETRY_UNIFORM_COMPONENTS_ARB: Int = 36319

const val GL_MAX_GEOMETRY_OUTPUT_VERTICES_ARB: Int = 36320

const val GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS_ARB: Int = 36321

const val GL_ARB_get_program_binary: Int = 1

const val GL_ARB_get_texture_sub_image: Int = 1

const val GL_ARB_gl_spirv: Int = 1

const val GL_SHADER_BINARY_FORMAT_SPIR_V_ARB: Int = 38225

const val GL_SPIR_V_BINARY_ARB: Int = 38226

const val GL_ARB_gpu_shader5: Int = 1

const val GL_ARB_gpu_shader_fp64: Int = 1

const val GL_ARB_gpu_shader_int64: Int = 1

const val GL_INT64_ARB: Int = 5134

const val GL_INT64_VEC2_ARB: Int = 36841

const val GL_INT64_VEC3_ARB: Int = 36842

const val GL_INT64_VEC4_ARB: Int = 36843

const val GL_UNSIGNED_INT64_VEC2_ARB: Int = 36853

const val GL_UNSIGNED_INT64_VEC3_ARB: Int = 36854

const val GL_UNSIGNED_INT64_VEC4_ARB: Int = 36855

const val GL_ARB_half_float_pixel: Int = 1

const val GL_HALF_FLOAT_ARB: Int = 5131

const val GL_ARB_half_float_vertex: Int = 1

const val GL_ARB_indirect_parameters: Int = 1

const val GL_PARAMETER_BUFFER_ARB: Int = 33006

const val GL_PARAMETER_BUFFER_BINDING_ARB: Int = 33007

const val GL_ARB_instanced_arrays: Int = 1

const val GL_VERTEX_ATTRIB_ARRAY_DIVISOR_ARB: Int = 35070

const val GL_ARB_internalformat_query: Int = 1

const val GL_ARB_internalformat_query2: Int = 1

const val GL_SRGB_DECODE_ARB: Int = 33433

const val GL_ARB_invalidate_subdata: Int = 1

const val GL_ARB_map_buffer_alignment: Int = 1

const val GL_ARB_map_buffer_range: Int = 1

const val GL_ARB_matrix_palette: Int = 1

const val GL_MATRIX_PALETTE_ARB: Int = 34880

const val GL_MAX_MATRIX_PALETTE_STACK_DEPTH_ARB: Int = 34881

const val GL_MAX_PALETTE_MATRICES_ARB: Int = 34882

const val GL_CURRENT_PALETTE_MATRIX_ARB: Int = 34883

const val GL_MATRIX_INDEX_ARRAY_ARB: Int = 34884

const val GL_CURRENT_MATRIX_INDEX_ARB: Int = 34885

const val GL_MATRIX_INDEX_ARRAY_SIZE_ARB: Int = 34886

const val GL_MATRIX_INDEX_ARRAY_TYPE_ARB: Int = 34887

const val GL_MATRIX_INDEX_ARRAY_STRIDE_ARB: Int = 34888

const val GL_MATRIX_INDEX_ARRAY_POINTER_ARB: Int = 34889

const val GL_ARB_multi_bind: Int = 1

const val GL_ARB_multi_draw_indirect: Int = 1

const val GL_ARB_multisample: Int = 1

const val GL_MULTISAMPLE_ARB: Int = 32925

const val GL_SAMPLE_ALPHA_TO_COVERAGE_ARB: Int = 32926

const val GL_SAMPLE_ALPHA_TO_ONE_ARB: Int = 32927

const val GL_SAMPLE_COVERAGE_ARB: Int = 32928

const val GL_SAMPLE_BUFFERS_ARB: Int = 32936

const val GL_SAMPLES_ARB: Int = 32937

const val GL_SAMPLE_COVERAGE_VALUE_ARB: Int = 32938

const val GL_SAMPLE_COVERAGE_INVERT_ARB: Int = 32939

const val GL_MULTISAMPLE_BIT_ARB: Int = 536870912

const val GL_ARB_occlusion_query: Int = 1

const val GL_QUERY_COUNTER_BITS_ARB: Int = 34916

const val GL_CURRENT_QUERY_ARB: Int = 34917

const val GL_QUERY_RESULT_ARB: Int = 34918

const val GL_QUERY_RESULT_AVAILABLE_ARB: Int = 34919

const val GL_SAMPLES_PASSED_ARB: Int = 35092

const val GL_ARB_occlusion_query2: Int = 1

const val GL_ARB_parallel_shader_compile: Int = 1

const val GL_MAX_SHADER_COMPILER_THREADS_ARB: Int = 37296

const val GL_COMPLETION_STATUS_ARB: Int = 37297

const val GL_ARB_pipeline_statistics_query: Int = 1

const val GL_VERTICES_SUBMITTED_ARB: Int = 33518

const val GL_PRIMITIVES_SUBMITTED_ARB: Int = 33519

const val GL_VERTEX_SHADER_INVOCATIONS_ARB: Int = 33520

const val GL_TESS_CONTROL_SHADER_PATCHES_ARB: Int = 33521

const val GL_TESS_EVALUATION_SHADER_INVOCATIONS_ARB: Int = 33522

const val GL_GEOMETRY_SHADER_PRIMITIVES_EMITTED_ARB: Int = 33523

const val GL_FRAGMENT_SHADER_INVOCATIONS_ARB: Int = 33524

const val GL_COMPUTE_SHADER_INVOCATIONS_ARB: Int = 33525

const val GL_CLIPPING_INPUT_PRIMITIVES_ARB: Int = 33526

const val GL_CLIPPING_OUTPUT_PRIMITIVES_ARB: Int = 33527

const val GL_ARB_pixel_buffer_object: Int = 1

const val GL_PIXEL_PACK_BUFFER_ARB: Int = 35051

const val GL_PIXEL_UNPACK_BUFFER_ARB: Int = 35052

const val GL_PIXEL_PACK_BUFFER_BINDING_ARB: Int = 35053

const val GL_PIXEL_UNPACK_BUFFER_BINDING_ARB: Int = 35055

const val GL_ARB_point_parameters: Int = 1

const val GL_POINT_SIZE_MIN_ARB: Int = 33062

const val GL_POINT_SIZE_MAX_ARB: Int = 33063

const val GL_POINT_FADE_THRESHOLD_SIZE_ARB: Int = 33064

const val GL_POINT_DISTANCE_ATTENUATION_ARB: Int = 33065

const val GL_ARB_point_sprite: Int = 1

const val GL_POINT_SPRITE_ARB: Int = 34913

const val GL_COORD_REPLACE_ARB: Int = 34914

const val GL_ARB_polygon_offset_clamp: Int = 1

const val GL_ARB_post_depth_coverage: Int = 1

const val GL_ARB_program_interface_query: Int = 1

const val GL_ARB_provoking_vertex: Int = 1

const val GL_ARB_query_buffer_object: Int = 1

const val GL_ARB_robust_buffer_access_behavior: Int = 1

const val GL_ARB_robustness: Int = 1

const val GL_CONTEXT_FLAG_ROBUST_ACCESS_BIT_ARB: Int = 4

const val GL_LOSE_CONTEXT_ON_RESET_ARB: Int = 33362

const val GL_GUILTY_CONTEXT_RESET_ARB: Int = 33363

const val GL_INNOCENT_CONTEXT_RESET_ARB: Int = 33364

const val GL_UNKNOWN_CONTEXT_RESET_ARB: Int = 33365

const val GL_RESET_NOTIFICATION_STRATEGY_ARB: Int = 33366

const val GL_NO_RESET_NOTIFICATION_ARB: Int = 33377

const val GL_ARB_robustness_isolation: Int = 1

const val GL_ARB_sample_locations: Int = 1

const val GL_SAMPLE_LOCATION_SUBPIXEL_BITS_ARB: Int = 37693

const val GL_SAMPLE_LOCATION_PIXEL_GRID_WIDTH_ARB: Int = 37694

const val GL_SAMPLE_LOCATION_PIXEL_GRID_HEIGHT_ARB: Int = 37695

const val GL_PROGRAMMABLE_SAMPLE_LOCATION_TABLE_SIZE_ARB: Int = 37696

const val GL_SAMPLE_LOCATION_ARB: Int = 36432

const val GL_PROGRAMMABLE_SAMPLE_LOCATION_ARB: Int = 37697

const val GL_FRAMEBUFFER_PROGRAMMABLE_SAMPLE_LOCATIONS_ARB: Int = 37698

const val GL_FRAMEBUFFER_SAMPLE_LOCATION_PIXEL_GRID_ARB: Int = 37699

const val GL_ARB_sample_shading: Int = 1

const val GL_SAMPLE_SHADING_ARB: Int = 35894

const val GL_MIN_SAMPLE_SHADING_VALUE_ARB: Int = 35895

const val GL_ARB_sampler_objects: Int = 1

const val GL_ARB_seamless_cube_map: Int = 1

const val GL_ARB_seamless_cubemap_per_texture: Int = 1

const val GL_ARB_separate_shader_objects: Int = 1

const val GL_ARB_shader_atomic_counter_ops: Int = 1

const val GL_ARB_shader_atomic_counters: Int = 1

const val GL_ARB_shader_ballot: Int = 1

const val GL_ARB_shader_bit_encoding: Int = 1

const val GL_ARB_shader_clock: Int = 1

const val GL_ARB_shader_draw_parameters: Int = 1

const val GL_ARB_shader_group_vote: Int = 1

const val GL_ARB_shader_image_load_store: Int = 1

const val GL_ARB_shader_image_size: Int = 1

const val GL_ARB_shader_objects: Int = 1

const val GL_PROGRAM_OBJECT_ARB: Int = 35648

const val GL_SHADER_OBJECT_ARB: Int = 35656

const val GL_OBJECT_TYPE_ARB: Int = 35662

const val GL_OBJECT_SUBTYPE_ARB: Int = 35663

const val GL_FLOAT_VEC2_ARB: Int = 35664

const val GL_FLOAT_VEC3_ARB: Int = 35665

const val GL_FLOAT_VEC4_ARB: Int = 35666

const val GL_INT_VEC2_ARB: Int = 35667

const val GL_INT_VEC3_ARB: Int = 35668

const val GL_INT_VEC4_ARB: Int = 35669

const val GL_BOOL_ARB: Int = 35670

const val GL_BOOL_VEC2_ARB: Int = 35671

const val GL_BOOL_VEC3_ARB: Int = 35672

const val GL_BOOL_VEC4_ARB: Int = 35673

const val GL_FLOAT_MAT2_ARB: Int = 35674

const val GL_FLOAT_MAT3_ARB: Int = 35675

const val GL_FLOAT_MAT4_ARB: Int = 35676

const val GL_SAMPLER_1D_ARB: Int = 35677

const val GL_SAMPLER_2D_ARB: Int = 35678

const val GL_SAMPLER_3D_ARB: Int = 35679

const val GL_SAMPLER_CUBE_ARB: Int = 35680

const val GL_SAMPLER_1D_SHADOW_ARB: Int = 35681

const val GL_SAMPLER_2D_SHADOW_ARB: Int = 35682

const val GL_SAMPLER_2D_RECT_ARB: Int = 35683

const val GL_SAMPLER_2D_RECT_SHADOW_ARB: Int = 35684

const val GL_OBJECT_DELETE_STATUS_ARB: Int = 35712

const val GL_OBJECT_COMPILE_STATUS_ARB: Int = 35713

const val GL_OBJECT_LINK_STATUS_ARB: Int = 35714

const val GL_OBJECT_VALIDATE_STATUS_ARB: Int = 35715

const val GL_OBJECT_INFO_LOG_LENGTH_ARB: Int = 35716

const val GL_OBJECT_ATTACHED_OBJECTS_ARB: Int = 35717

const val GL_OBJECT_ACTIVE_UNIFORMS_ARB: Int = 35718

const val GL_OBJECT_ACTIVE_UNIFORM_MAX_LENGTH_ARB: Int = 35719

const val GL_OBJECT_SHADER_SOURCE_LENGTH_ARB: Int = 35720

const val GL_ARB_shader_precision: Int = 1

const val GL_ARB_shader_stencil_export: Int = 1

const val GL_ARB_shader_storage_buffer_object: Int = 1

const val GL_ARB_shader_subroutine: Int = 1

const val GL_ARB_shader_texture_image_samples: Int = 1

const val GL_ARB_shader_texture_lod: Int = 1

const val GL_ARB_shader_viewport_layer_array: Int = 1

const val GL_ARB_shading_language_100: Int = 1

const val GL_SHADING_LANGUAGE_VERSION_ARB: Int = 35724

const val GL_ARB_shading_language_420pack: Int = 1

const val GL_ARB_shading_language_include: Int = 1

const val GL_SHADER_INCLUDE_ARB: Int = 36270

const val GL_NAMED_STRING_LENGTH_ARB: Int = 36329

const val GL_NAMED_STRING_TYPE_ARB: Int = 36330

const val GL_ARB_shading_language_packing: Int = 1

const val GL_ARB_shadow: Int = 1

const val GL_TEXTURE_COMPARE_MODE_ARB: Int = 34892

const val GL_TEXTURE_COMPARE_FUNC_ARB: Int = 34893

const val GL_COMPARE_R_TO_TEXTURE_ARB: Int = 34894

const val GL_ARB_shadow_ambient: Int = 1

const val GL_TEXTURE_COMPARE_FAIL_VALUE_ARB: Int = 32959

const val GL_ARB_sparse_buffer: Int = 1

const val GL_SPARSE_STORAGE_BIT_ARB: Int = 1024

const val GL_SPARSE_BUFFER_PAGE_SIZE_ARB: Int = 33528

const val GL_ARB_sparse_texture: Int = 1

const val GL_TEXTURE_SPARSE_ARB: Int = 37286

const val GL_VIRTUAL_PAGE_SIZE_INDEX_ARB: Int = 37287

const val GL_NUM_SPARSE_LEVELS_ARB: Int = 37290

const val GL_NUM_VIRTUAL_PAGE_SIZES_ARB: Int = 37288

const val GL_VIRTUAL_PAGE_SIZE_X_ARB: Int = 37269

const val GL_VIRTUAL_PAGE_SIZE_Y_ARB: Int = 37270

const val GL_VIRTUAL_PAGE_SIZE_Z_ARB: Int = 37271

const val GL_MAX_SPARSE_TEXTURE_SIZE_ARB: Int = 37272

const val GL_MAX_SPARSE_3D_TEXTURE_SIZE_ARB: Int = 37273

const val GL_MAX_SPARSE_ARRAY_TEXTURE_LAYERS_ARB: Int = 37274

const val GL_SPARSE_TEXTURE_FULL_ARRAY_CUBE_MIPMAPS_ARB: Int = 37289

const val GL_ARB_sparse_texture2: Int = 1

const val GL_ARB_sparse_texture_clamp: Int = 1

const val GL_ARB_spirv_extensions: Int = 1

const val GL_ARB_stencil_texturing: Int = 1

const val GL_ARB_sync: Int = 1

const val GL_ARB_tessellation_shader: Int = 1

const val GL_ARB_texture_barrier: Int = 1

const val GL_ARB_texture_border_clamp: Int = 1

const val GL_CLAMP_TO_BORDER_ARB: Int = 33069

const val GL_ARB_texture_buffer_object: Int = 1

const val GL_TEXTURE_BUFFER_ARB: Int = 35882

const val GL_MAX_TEXTURE_BUFFER_SIZE_ARB: Int = 35883

const val GL_TEXTURE_BINDING_BUFFER_ARB: Int = 35884

const val GL_TEXTURE_BUFFER_DATA_STORE_BINDING_ARB: Int = 35885

const val GL_TEXTURE_BUFFER_FORMAT_ARB: Int = 35886

const val GL_ARB_texture_buffer_object_rgb32: Int = 1

const val GL_ARB_texture_buffer_range: Int = 1

const val GL_ARB_texture_compression: Int = 1

const val GL_COMPRESSED_ALPHA_ARB: Int = 34025

const val GL_COMPRESSED_LUMINANCE_ARB: Int = 34026

const val GL_COMPRESSED_LUMINANCE_ALPHA_ARB: Int = 34027

const val GL_COMPRESSED_INTENSITY_ARB: Int = 34028

const val GL_COMPRESSED_RGB_ARB: Int = 34029

const val GL_COMPRESSED_RGBA_ARB: Int = 34030

const val GL_TEXTURE_COMPRESSION_HINT_ARB: Int = 34031

const val GL_TEXTURE_COMPRESSED_IMAGE_SIZE_ARB: Int = 34464

const val GL_TEXTURE_COMPRESSED_ARB: Int = 34465

const val GL_NUM_COMPRESSED_TEXTURE_FORMATS_ARB: Int = 34466

const val GL_COMPRESSED_TEXTURE_FORMATS_ARB: Int = 34467

const val GL_ARB_texture_compression_bptc: Int = 1

const val GL_COMPRESSED_RGBA_BPTC_UNORM_ARB: Int = 36492

const val GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM_ARB: Int = 36493

const val GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT_ARB: Int = 36494

const val GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_ARB: Int = 36495

const val GL_ARB_texture_compression_rgtc: Int = 1

const val GL_ARB_texture_cube_map: Int = 1

const val GL_NORMAL_MAP_ARB: Int = 34065

const val GL_REFLECTION_MAP_ARB: Int = 34066

const val GL_TEXTURE_CUBE_MAP_ARB: Int = 34067

const val GL_TEXTURE_BINDING_CUBE_MAP_ARB: Int = 34068

const val GL_TEXTURE_CUBE_MAP_POSITIVE_X_ARB: Int = 34069

const val GL_TEXTURE_CUBE_MAP_NEGATIVE_X_ARB: Int = 34070

const val GL_TEXTURE_CUBE_MAP_POSITIVE_Y_ARB: Int = 34071

const val GL_TEXTURE_CUBE_MAP_NEGATIVE_Y_ARB: Int = 34072

const val GL_TEXTURE_CUBE_MAP_POSITIVE_Z_ARB: Int = 34073

const val GL_TEXTURE_CUBE_MAP_NEGATIVE_Z_ARB: Int = 34074

const val GL_PROXY_TEXTURE_CUBE_MAP_ARB: Int = 34075

const val GL_MAX_CUBE_MAP_TEXTURE_SIZE_ARB: Int = 34076

const val GL_ARB_texture_cube_map_array: Int = 1

const val GL_TEXTURE_CUBE_MAP_ARRAY_ARB: Int = 36873

const val GL_TEXTURE_BINDING_CUBE_MAP_ARRAY_ARB: Int = 36874

const val GL_PROXY_TEXTURE_CUBE_MAP_ARRAY_ARB: Int = 36875

const val GL_SAMPLER_CUBE_MAP_ARRAY_ARB: Int = 36876

const val GL_SAMPLER_CUBE_MAP_ARRAY_SHADOW_ARB: Int = 36877

const val GL_INT_SAMPLER_CUBE_MAP_ARRAY_ARB: Int = 36878

const val GL_UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY_ARB: Int = 36879

const val GL_ARB_texture_env_add: Int = 1

const val GL_ARB_texture_env_combine: Int = 1

const val GL_COMBINE_ARB: Int = 34160

const val GL_COMBINE_RGB_ARB: Int = 34161

const val GL_COMBINE_ALPHA_ARB: Int = 34162

const val GL_SOURCE0_RGB_ARB: Int = 34176

const val GL_SOURCE1_RGB_ARB: Int = 34177

const val GL_SOURCE2_RGB_ARB: Int = 34178

const val GL_SOURCE0_ALPHA_ARB: Int = 34184

const val GL_SOURCE1_ALPHA_ARB: Int = 34185

const val GL_SOURCE2_ALPHA_ARB: Int = 34186

const val GL_OPERAND0_RGB_ARB: Int = 34192

const val GL_OPERAND1_RGB_ARB: Int = 34193

const val GL_OPERAND2_RGB_ARB: Int = 34194

const val GL_OPERAND0_ALPHA_ARB: Int = 34200

const val GL_OPERAND1_ALPHA_ARB: Int = 34201

const val GL_OPERAND2_ALPHA_ARB: Int = 34202

const val GL_RGB_SCALE_ARB: Int = 34163

const val GL_ADD_SIGNED_ARB: Int = 34164

const val GL_INTERPOLATE_ARB: Int = 34165

const val GL_SUBTRACT_ARB: Int = 34023

const val GL_CONSTANT_ARB: Int = 34166

const val GL_PRIMARY_COLOR_ARB: Int = 34167

const val GL_PREVIOUS_ARB: Int = 34168

const val GL_ARB_texture_env_crossbar: Int = 1

const val GL_ARB_texture_env_dot3: Int = 1

const val GL_DOT3_RGB_ARB: Int = 34478

const val GL_DOT3_RGBA_ARB: Int = 34479

const val GL_ARB_texture_filter_anisotropic: Int = 1

const val GL_ARB_texture_filter_minmax: Int = 1

const val GL_TEXTURE_REDUCTION_MODE_ARB: Int = 37734

const val GL_WEIGHTED_AVERAGE_ARB: Int = 37735

const val GL_ARB_texture_float: Int = 1

const val GL_TEXTURE_RED_TYPE_ARB: Int = 35856

const val GL_TEXTURE_GREEN_TYPE_ARB: Int = 35857

const val GL_TEXTURE_BLUE_TYPE_ARB: Int = 35858

const val GL_TEXTURE_ALPHA_TYPE_ARB: Int = 35859

const val GL_TEXTURE_LUMINANCE_TYPE_ARB: Int = 35860

const val GL_TEXTURE_INTENSITY_TYPE_ARB: Int = 35861

const val GL_TEXTURE_DEPTH_TYPE_ARB: Int = 35862

const val GL_UNSIGNED_NORMALIZED_ARB: Int = 35863

const val GL_RGBA32F_ARB: Int = 34836

const val GL_RGB32F_ARB: Int = 34837

const val GL_ALPHA32F_ARB: Int = 34838

const val GL_INTENSITY32F_ARB: Int = 34839

const val GL_LUMINANCE32F_ARB: Int = 34840

const val GL_LUMINANCE_ALPHA32F_ARB: Int = 34841

const val GL_RGBA16F_ARB: Int = 34842

const val GL_RGB16F_ARB: Int = 34843

const val GL_ALPHA16F_ARB: Int = 34844

const val GL_INTENSITY16F_ARB: Int = 34845

const val GL_LUMINANCE16F_ARB: Int = 34846

const val GL_LUMINANCE_ALPHA16F_ARB: Int = 34847

const val GL_ARB_texture_gather: Int = 1

const val GL_MIN_PROGRAM_TEXTURE_GATHER_OFFSET_ARB: Int = 36446

const val GL_MAX_PROGRAM_TEXTURE_GATHER_OFFSET_ARB: Int = 36447

const val GL_MAX_PROGRAM_TEXTURE_GATHER_COMPONENTS_ARB: Int = 36767

const val GL_ARB_texture_mirror_clamp_to_edge: Int = 1

const val GL_ARB_texture_mirrored_repeat: Int = 1

const val GL_MIRRORED_REPEAT_ARB: Int = 33648

const val GL_ARB_texture_multisample: Int = 1

const val GL_ARB_texture_non_power_of_two: Int = 1

const val GL_ARB_texture_query_levels: Int = 1

const val GL_ARB_texture_query_lod: Int = 1

const val GL_ARB_texture_rectangle: Int = 1

const val GL_TEXTURE_RECTANGLE_ARB: Int = 34037

const val GL_TEXTURE_BINDING_RECTANGLE_ARB: Int = 34038

const val GL_PROXY_TEXTURE_RECTANGLE_ARB: Int = 34039

const val GL_MAX_RECTANGLE_TEXTURE_SIZE_ARB: Int = 34040

const val GL_ARB_texture_rg: Int = 1

const val GL_ARB_texture_rgb10_a2ui: Int = 1

const val GL_ARB_texture_stencil8: Int = 1

const val GL_ARB_texture_storage: Int = 1

const val GL_ARB_texture_storage_multisample: Int = 1

const val GL_ARB_texture_swizzle: Int = 1

const val GL_ARB_texture_view: Int = 1

const val GL_ARB_timer_query: Int = 1

const val GL_ARB_transform_feedback2: Int = 1

const val GL_ARB_transform_feedback3: Int = 1

const val GL_ARB_transform_feedback_instanced: Int = 1

const val GL_ARB_transform_feedback_overflow_query: Int = 1

const val GL_TRANSFORM_FEEDBACK_OVERFLOW_ARB: Int = 33516

const val GL_TRANSFORM_FEEDBACK_STREAM_OVERFLOW_ARB: Int = 33517

const val GL_ARB_transpose_matrix: Int = 1

const val GL_TRANSPOSE_MODELVIEW_MATRIX_ARB: Int = 34019

const val GL_TRANSPOSE_PROJECTION_MATRIX_ARB: Int = 34020

const val GL_TRANSPOSE_TEXTURE_MATRIX_ARB: Int = 34021

const val GL_TRANSPOSE_COLOR_MATRIX_ARB: Int = 34022

const val GL_ARB_uniform_buffer_object: Int = 1

const val GL_ARB_vertex_array_bgra: Int = 1

const val GL_ARB_vertex_array_object: Int = 1

const val GL_ARB_vertex_attrib_64bit: Int = 1

const val GL_ARB_vertex_attrib_binding: Int = 1

const val GL_ARB_vertex_blend: Int = 1

const val GL_MAX_VERTEX_UNITS_ARB: Int = 34468

const val GL_ACTIVE_VERTEX_UNITS_ARB: Int = 34469

const val GL_WEIGHT_SUM_UNITY_ARB: Int = 34470

const val GL_VERTEX_BLEND_ARB: Int = 34471

const val GL_CURRENT_WEIGHT_ARB: Int = 34472

const val GL_WEIGHT_ARRAY_TYPE_ARB: Int = 34473

const val GL_WEIGHT_ARRAY_STRIDE_ARB: Int = 34474

const val GL_WEIGHT_ARRAY_SIZE_ARB: Int = 34475

const val GL_WEIGHT_ARRAY_POINTER_ARB: Int = 34476

const val GL_WEIGHT_ARRAY_ARB: Int = 34477

const val GL_MODELVIEW0_ARB: Int = 5888

const val GL_MODELVIEW1_ARB: Int = 34058

const val GL_MODELVIEW2_ARB: Int = 34594

const val GL_MODELVIEW3_ARB: Int = 34595

const val GL_MODELVIEW4_ARB: Int = 34596

const val GL_MODELVIEW5_ARB: Int = 34597

const val GL_MODELVIEW6_ARB: Int = 34598

const val GL_MODELVIEW7_ARB: Int = 34599

const val GL_MODELVIEW8_ARB: Int = 34600

const val GL_MODELVIEW9_ARB: Int = 34601

const val GL_MODELVIEW10_ARB: Int = 34602

const val GL_MODELVIEW11_ARB: Int = 34603

const val GL_MODELVIEW12_ARB: Int = 34604

const val GL_MODELVIEW13_ARB: Int = 34605

const val GL_MODELVIEW14_ARB: Int = 34606

const val GL_MODELVIEW15_ARB: Int = 34607

const val GL_MODELVIEW16_ARB: Int = 34608

const val GL_MODELVIEW17_ARB: Int = 34609

const val GL_MODELVIEW18_ARB: Int = 34610

const val GL_MODELVIEW19_ARB: Int = 34611

const val GL_MODELVIEW20_ARB: Int = 34612

const val GL_MODELVIEW21_ARB: Int = 34613

const val GL_MODELVIEW22_ARB: Int = 34614

const val GL_MODELVIEW23_ARB: Int = 34615

const val GL_MODELVIEW24_ARB: Int = 34616

const val GL_MODELVIEW25_ARB: Int = 34617

const val GL_MODELVIEW26_ARB: Int = 34618

const val GL_MODELVIEW27_ARB: Int = 34619

const val GL_MODELVIEW28_ARB: Int = 34620

const val GL_MODELVIEW29_ARB: Int = 34621

const val GL_MODELVIEW30_ARB: Int = 34622

const val GL_MODELVIEW31_ARB: Int = 34623

const val GL_ARB_vertex_buffer_object: Int = 1

const val GL_BUFFER_SIZE_ARB: Int = 34660

const val GL_BUFFER_USAGE_ARB: Int = 34661

const val GL_ARRAY_BUFFER_ARB: Int = 34962

const val GL_ELEMENT_ARRAY_BUFFER_ARB: Int = 34963

const val GL_ARRAY_BUFFER_BINDING_ARB: Int = 34964

const val GL_ELEMENT_ARRAY_BUFFER_BINDING_ARB: Int = 34965

const val GL_VERTEX_ARRAY_BUFFER_BINDING_ARB: Int = 34966

const val GL_NORMAL_ARRAY_BUFFER_BINDING_ARB: Int = 34967

const val GL_COLOR_ARRAY_BUFFER_BINDING_ARB: Int = 34968

const val GL_INDEX_ARRAY_BUFFER_BINDING_ARB: Int = 34969

const val GL_TEXTURE_COORD_ARRAY_BUFFER_BINDING_ARB: Int = 34970

const val GL_EDGE_FLAG_ARRAY_BUFFER_BINDING_ARB: Int = 34971

const val GL_SECONDARY_COLOR_ARRAY_BUFFER_BINDING_ARB: Int = 34972

const val GL_FOG_COORDINATE_ARRAY_BUFFER_BINDING_ARB: Int = 34973

const val GL_WEIGHT_ARRAY_BUFFER_BINDING_ARB: Int = 34974

const val GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING_ARB: Int = 34975

const val GL_READ_ONLY_ARB: Int = 35000

const val GL_WRITE_ONLY_ARB: Int = 35001

const val GL_READ_WRITE_ARB: Int = 35002

const val GL_BUFFER_ACCESS_ARB: Int = 35003

const val GL_BUFFER_MAPPED_ARB: Int = 35004

const val GL_BUFFER_MAP_POINTER_ARB: Int = 35005

const val GL_STREAM_DRAW_ARB: Int = 35040

const val GL_STREAM_READ_ARB: Int = 35041

const val GL_STREAM_COPY_ARB: Int = 35042

const val GL_STATIC_DRAW_ARB: Int = 35044

const val GL_STATIC_READ_ARB: Int = 35045

const val GL_STATIC_COPY_ARB: Int = 35046

const val GL_DYNAMIC_DRAW_ARB: Int = 35048

const val GL_DYNAMIC_READ_ARB: Int = 35049

const val GL_DYNAMIC_COPY_ARB: Int = 35050

const val GL_ARB_vertex_program: Int = 1

const val GL_COLOR_SUM_ARB: Int = 33880

const val GL_VERTEX_PROGRAM_ARB: Int = 34336

const val GL_VERTEX_ATTRIB_ARRAY_ENABLED_ARB: Int = 34338

const val GL_VERTEX_ATTRIB_ARRAY_SIZE_ARB: Int = 34339

const val GL_VERTEX_ATTRIB_ARRAY_STRIDE_ARB: Int = 34340

const val GL_VERTEX_ATTRIB_ARRAY_TYPE_ARB: Int = 34341

const val GL_CURRENT_VERTEX_ATTRIB_ARB: Int = 34342

const val GL_VERTEX_PROGRAM_POINT_SIZE_ARB: Int = 34370

const val GL_VERTEX_PROGRAM_TWO_SIDE_ARB: Int = 34371

const val GL_VERTEX_ATTRIB_ARRAY_POINTER_ARB: Int = 34373

const val GL_MAX_VERTEX_ATTRIBS_ARB: Int = 34921

const val GL_VERTEX_ATTRIB_ARRAY_NORMALIZED_ARB: Int = 34922

const val GL_PROGRAM_ADDRESS_REGISTERS_ARB: Int = 34992

const val GL_MAX_PROGRAM_ADDRESS_REGISTERS_ARB: Int = 34993

const val GL_PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB: Int = 34994

const val GL_MAX_PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB: Int = 34995

const val GL_ARB_vertex_shader: Int = 1

const val GL_VERTEX_SHADER_ARB: Int = 35633

const val GL_MAX_VERTEX_UNIFORM_COMPONENTS_ARB: Int = 35658

const val GL_MAX_VARYING_FLOATS_ARB: Int = 35659

const val GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS_ARB: Int = 35660

const val GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS_ARB: Int = 35661

const val GL_OBJECT_ACTIVE_ATTRIBUTES_ARB: Int = 35721

const val GL_OBJECT_ACTIVE_ATTRIBUTE_MAX_LENGTH_ARB: Int = 35722

const val GL_ARB_vertex_type_10f_11f_11f_rev: Int = 1

const val GL_ARB_vertex_type_2_10_10_10_rev: Int = 1

const val GL_ARB_viewport_array: Int = 1

const val GL_ARB_window_pos: Int = 1

const val GL_KHR_blend_equation_advanced: Int = 1

const val GL_MULTIPLY_KHR: Int = 37524

const val GL_SCREEN_KHR: Int = 37525

const val GL_OVERLAY_KHR: Int = 37526

const val GL_DARKEN_KHR: Int = 37527

const val GL_LIGHTEN_KHR: Int = 37528

const val GL_COLORDODGE_KHR: Int = 37529

const val GL_COLORBURN_KHR: Int = 37530

const val GL_HARDLIGHT_KHR: Int = 37531

const val GL_SOFTLIGHT_KHR: Int = 37532

const val GL_DIFFERENCE_KHR: Int = 37534

const val GL_EXCLUSION_KHR: Int = 37536

const val GL_HSL_HUE_KHR: Int = 37549

const val GL_HSL_SATURATION_KHR: Int = 37550

const val GL_HSL_COLOR_KHR: Int = 37551

const val GL_HSL_LUMINOSITY_KHR: Int = 37552

const val GL_KHR_blend_equation_advanced_coherent: Int = 1

const val GL_BLEND_ADVANCED_COHERENT_KHR: Int = 37509

const val GL_KHR_context_flush_control: Int = 1

const val GL_KHR_debug: Int = 1

const val GL_KHR_no_error: Int = 1

const val GL_CONTEXT_FLAG_NO_ERROR_BIT_KHR: Int = 8

const val GL_KHR_parallel_shader_compile: Int = 1

const val GL_MAX_SHADER_COMPILER_THREADS_KHR: Int = 37296

const val GL_COMPLETION_STATUS_KHR: Int = 37297

const val GL_KHR_robust_buffer_access_behavior: Int = 1

const val GL_KHR_robustness: Int = 1

const val GL_CONTEXT_ROBUST_ACCESS: Int = 37107

const val GL_KHR_texture_compression_astc_hdr: Int = 1

const val GL_COMPRESSED_RGBA_ASTC_4x4_KHR: Int = 37808

const val GL_COMPRESSED_RGBA_ASTC_5x4_KHR: Int = 37809

const val GL_COMPRESSED_RGBA_ASTC_5x5_KHR: Int = 37810

const val GL_COMPRESSED_RGBA_ASTC_6x5_KHR: Int = 37811

const val GL_COMPRESSED_RGBA_ASTC_6x6_KHR: Int = 37812

const val GL_COMPRESSED_RGBA_ASTC_8x5_KHR: Int = 37813

const val GL_COMPRESSED_RGBA_ASTC_8x6_KHR: Int = 37814

const val GL_COMPRESSED_RGBA_ASTC_8x8_KHR: Int = 37815

const val GL_COMPRESSED_RGBA_ASTC_10x5_KHR: Int = 37816

const val GL_COMPRESSED_RGBA_ASTC_10x6_KHR: Int = 37817

const val GL_COMPRESSED_RGBA_ASTC_10x8_KHR: Int = 37818

const val GL_COMPRESSED_RGBA_ASTC_10x10_KHR: Int = 37819

const val GL_COMPRESSED_RGBA_ASTC_12x10_KHR: Int = 37820

const val GL_COMPRESSED_RGBA_ASTC_12x12_KHR: Int = 37821

const val GL_COMPRESSED_SRGB8_ALPHA8_ASTC_4x4_KHR: Int = 37840

const val GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x4_KHR: Int = 37841

const val GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x5_KHR: Int = 37842

const val GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x5_KHR: Int = 37843

const val GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x6_KHR: Int = 37844

const val GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x5_KHR: Int = 37845

const val GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x6_KHR: Int = 37846

const val GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x8_KHR: Int = 37847

const val GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x5_KHR: Int = 37848

const val GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x6_KHR: Int = 37849

const val GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x8_KHR: Int = 37850

const val GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x10_KHR: Int = 37851

const val GL_COMPRESSED_SRGB8_ALPHA8_ASTC_12x10_KHR: Int = 37852

const val GL_COMPRESSED_SRGB8_ALPHA8_ASTC_12x12_KHR: Int = 37853

const val GL_KHR_texture_compression_astc_ldr: Int = 1

const val GL_KHR_texture_compression_astc_sliced_3d: Int = 1

const val GL_OES_byte_coordinates: Int = 1

const val GL_OES_compressed_paletted_texture: Int = 1

const val GL_PALETTE4_RGB8_OES: Int = 35728

const val GL_PALETTE4_RGBA8_OES: Int = 35729

const val GL_PALETTE4_R5_G6_B5_OES: Int = 35730

const val GL_PALETTE4_RGBA4_OES: Int = 35731

const val GL_PALETTE4_RGB5_A1_OES: Int = 35732

const val GL_PALETTE8_RGB8_OES: Int = 35733

const val GL_PALETTE8_RGBA8_OES: Int = 35734

const val GL_PALETTE8_R5_G6_B5_OES: Int = 35735

const val GL_PALETTE8_RGBA4_OES: Int = 35736

const val GL_PALETTE8_RGB5_A1_OES: Int = 35737

const val GL_OES_fixed_point: Int = 1

const val GL_FIXED_OES: Int = 5132

const val GL_OES_query_matrix: Int = 1

const val GL_OES_read_format: Int = 1

const val GL_IMPLEMENTATION_COLOR_READ_TYPE_OES: Int = 35738

const val GL_IMPLEMENTATION_COLOR_READ_FORMAT_OES: Int = 35739

const val GL_OES_single_precision: Int = 1

const val GL_3DFX_multisample: Int = 1

const val GL_MULTISAMPLE_3DFX: Int = 34482

const val GL_SAMPLE_BUFFERS_3DFX: Int = 34483

const val GL_SAMPLES_3DFX: Int = 34484

const val GL_MULTISAMPLE_BIT_3DFX: Int = 536870912

const val GL_3DFX_tbuffer: Int = 1

const val GL_3DFX_texture_compression_FXT1: Int = 1

const val GL_COMPRESSED_RGB_FXT1_3DFX: Int = 34480

const val GL_COMPRESSED_RGBA_FXT1_3DFX: Int = 34481

const val GL_AMD_blend_minmax_factor: Int = 1

const val GL_FACTOR_MIN_AMD: Int = 36892

const val GL_FACTOR_MAX_AMD: Int = 36893

const val GL_AMD_conservative_depth: Int = 1

const val GL_AMD_debug_output: Int = 1

const val GL_MAX_DEBUG_MESSAGE_LENGTH_AMD: Int = 37187

const val GL_MAX_DEBUG_LOGGED_MESSAGES_AMD: Int = 37188

const val GL_DEBUG_LOGGED_MESSAGES_AMD: Int = 37189

const val GL_DEBUG_SEVERITY_HIGH_AMD: Int = 37190

const val GL_DEBUG_SEVERITY_MEDIUM_AMD: Int = 37191

const val GL_DEBUG_SEVERITY_LOW_AMD: Int = 37192

const val GL_DEBUG_CATEGORY_API_ERROR_AMD: Int = 37193

const val GL_DEBUG_CATEGORY_WINDOW_SYSTEM_AMD: Int = 37194

const val GL_DEBUG_CATEGORY_DEPRECATION_AMD: Int = 37195

const val GL_DEBUG_CATEGORY_UNDEFINED_BEHAVIOR_AMD: Int = 37196

const val GL_DEBUG_CATEGORY_PERFORMANCE_AMD: Int = 37197

const val GL_DEBUG_CATEGORY_SHADER_COMPILER_AMD: Int = 37198

const val GL_DEBUG_CATEGORY_APPLICATION_AMD: Int = 37199

const val GL_DEBUG_CATEGORY_OTHER_AMD: Int = 37200

const val GL_AMD_depth_clamp_separate: Int = 1

const val GL_DEPTH_CLAMP_NEAR_AMD: Int = 36894

const val GL_DEPTH_CLAMP_FAR_AMD: Int = 36895

const val GL_AMD_draw_buffers_blend: Int = 1

const val GL_AMD_framebuffer_sample_positions: Int = 1

const val GL_SUBSAMPLE_DISTANCE_AMD: Int = 34879

const val GL_PIXELS_PER_SAMPLE_PATTERN_X_AMD: Int = 37294

const val GL_PIXELS_PER_SAMPLE_PATTERN_Y_AMD: Int = 37295

const val GL_ALL_PIXELS_AMD: UInt = 4294967295u

const val GL_AMD_gcn_shader: Int = 1

const val GL_AMD_gpu_shader_half_float: Int = 1

const val GL_FLOAT16_NV: Int = 36856

const val GL_FLOAT16_VEC2_NV: Int = 36857

const val GL_FLOAT16_VEC3_NV: Int = 36858

const val GL_FLOAT16_VEC4_NV: Int = 36859

const val GL_FLOAT16_MAT2_AMD: Int = 37317

const val GL_FLOAT16_MAT3_AMD: Int = 37318

const val GL_FLOAT16_MAT4_AMD: Int = 37319

const val GL_FLOAT16_MAT2x3_AMD: Int = 37320

const val GL_FLOAT16_MAT2x4_AMD: Int = 37321

const val GL_FLOAT16_MAT3x2_AMD: Int = 37322

const val GL_FLOAT16_MAT3x4_AMD: Int = 37323

const val GL_FLOAT16_MAT4x2_AMD: Int = 37324

const val GL_FLOAT16_MAT4x3_AMD: Int = 37325

const val GL_AMD_gpu_shader_int16: Int = 1

const val GL_AMD_gpu_shader_int64: Int = 1

const val GL_INT64_NV: Int = 5134

const val GL_UNSIGNED_INT64_NV: Int = 5135

const val GL_INT8_NV: Int = 36832

const val GL_INT8_VEC2_NV: Int = 36833

const val GL_INT8_VEC3_NV: Int = 36834

const val GL_INT8_VEC4_NV: Int = 36835

const val GL_INT16_NV: Int = 36836

const val GL_INT16_VEC2_NV: Int = 36837

const val GL_INT16_VEC3_NV: Int = 36838

const val GL_INT16_VEC4_NV: Int = 36839

const val GL_INT64_VEC2_NV: Int = 36841

const val GL_INT64_VEC3_NV: Int = 36842

const val GL_INT64_VEC4_NV: Int = 36843

const val GL_UNSIGNED_INT8_NV: Int = 36844

const val GL_UNSIGNED_INT8_VEC2_NV: Int = 36845

const val GL_UNSIGNED_INT8_VEC3_NV: Int = 36846

const val GL_UNSIGNED_INT8_VEC4_NV: Int = 36847

const val GL_UNSIGNED_INT16_NV: Int = 36848

const val GL_UNSIGNED_INT16_VEC2_NV: Int = 36849

const val GL_UNSIGNED_INT16_VEC3_NV: Int = 36850

const val GL_UNSIGNED_INT16_VEC4_NV: Int = 36851

const val GL_UNSIGNED_INT64_VEC2_NV: Int = 36853

const val GL_UNSIGNED_INT64_VEC3_NV: Int = 36854

const val GL_UNSIGNED_INT64_VEC4_NV: Int = 36855

const val GL_AMD_interleaved_elements: Int = 1

const val GL_VERTEX_ELEMENT_SWIZZLE_AMD: Int = 37284

const val GL_VERTEX_ID_SWIZZLE_AMD: Int = 37285

const val GL_AMD_multi_draw_indirect: Int = 1

const val GL_AMD_name_gen_delete: Int = 1

const val GL_DATA_BUFFER_AMD: Int = 37201

const val GL_PERFORMANCE_MONITOR_AMD: Int = 37202

const val GL_QUERY_OBJECT_AMD: Int = 37203

const val GL_VERTEX_ARRAY_OBJECT_AMD: Int = 37204

const val GL_SAMPLER_OBJECT_AMD: Int = 37205

const val GL_AMD_occlusion_query_event: Int = 1

const val GL_OCCLUSION_QUERY_EVENT_MASK_AMD: Int = 34639

const val GL_QUERY_DEPTH_PASS_EVENT_BIT_AMD: Int = 1

const val GL_QUERY_DEPTH_FAIL_EVENT_BIT_AMD: Int = 2

const val GL_QUERY_STENCIL_FAIL_EVENT_BIT_AMD: Int = 4

const val GL_QUERY_DEPTH_BOUNDS_FAIL_EVENT_BIT_AMD: Int = 8

const val GL_QUERY_ALL_EVENT_BITS_AMD: UInt = 4294967295u

const val GL_AMD_performance_monitor: Int = 1

const val GL_COUNTER_TYPE_AMD: Int = 35776

const val GL_COUNTER_RANGE_AMD: Int = 35777

const val GL_UNSIGNED_INT64_AMD: Int = 35778

const val GL_PERCENTAGE_AMD: Int = 35779

const val GL_PERFMON_RESULT_AVAILABLE_AMD: Int = 35780

const val GL_PERFMON_RESULT_SIZE_AMD: Int = 35781

const val GL_PERFMON_RESULT_AMD: Int = 35782

const val GL_AMD_pinned_memory: Int = 1

const val GL_EXTERNAL_VIRTUAL_MEMORY_BUFFER_AMD: Int = 37216

const val GL_AMD_query_buffer_object: Int = 1

const val GL_QUERY_BUFFER_AMD: Int = 37266

const val GL_QUERY_BUFFER_BINDING_AMD: Int = 37267

const val GL_QUERY_RESULT_NO_WAIT_AMD: Int = 37268

const val GL_AMD_sample_positions: Int = 1

const val GL_AMD_seamless_cubemap_per_texture: Int = 1

const val GL_AMD_shader_atomic_counter_ops: Int = 1

const val GL_AMD_shader_ballot: Int = 1

const val GL_AMD_shader_explicit_vertex_parameter: Int = 1

const val GL_AMD_shader_image_load_store_lod: Int = 1

const val GL_AMD_shader_stencil_export: Int = 1

const val GL_AMD_shader_trinary_minmax: Int = 1

const val GL_AMD_sparse_texture: Int = 1

const val GL_VIRTUAL_PAGE_SIZE_X_AMD: Int = 37269

const val GL_VIRTUAL_PAGE_SIZE_Y_AMD: Int = 37270

const val GL_VIRTUAL_PAGE_SIZE_Z_AMD: Int = 37271

const val GL_MAX_SPARSE_TEXTURE_SIZE_AMD: Int = 37272

const val GL_MAX_SPARSE_3D_TEXTURE_SIZE_AMD: Int = 37273

const val GL_MAX_SPARSE_ARRAY_TEXTURE_LAYERS: Int = 37274

const val GL_MIN_SPARSE_LEVEL_AMD: Int = 37275

const val GL_MIN_LOD_WARNING_AMD: Int = 37276

const val GL_TEXTURE_STORAGE_SPARSE_BIT_AMD: Int = 1

const val GL_AMD_stencil_operation_extended: Int = 1

const val GL_SET_AMD: Int = 34634

const val GL_REPLACE_VALUE_AMD: Int = 34635

const val GL_STENCIL_OP_VALUE_AMD: Int = 34636

const val GL_STENCIL_BACK_OP_VALUE_AMD: Int = 34637

const val GL_AMD_texture_gather_bias_lod: Int = 1

const val GL_AMD_texture_texture4: Int = 1

const val GL_AMD_transform_feedback3_lines_triangles: Int = 1

const val GL_AMD_transform_feedback4: Int = 1

const val GL_STREAM_RASTERIZATION_AMD: Int = 37280

const val GL_AMD_vertex_shader_layer: Int = 1

const val GL_AMD_vertex_shader_tessellator: Int = 1

const val GL_SAMPLER_BUFFER_AMD: Int = 36865

const val GL_INT_SAMPLER_BUFFER_AMD: Int = 36866

const val GL_UNSIGNED_INT_SAMPLER_BUFFER_AMD: Int = 36867

const val GL_TESSELLATION_MODE_AMD: Int = 36868

const val GL_TESSELLATION_FACTOR_AMD: Int = 36869

const val GL_DISCRETE_AMD: Int = 36870

const val GL_CONTINUOUS_AMD: Int = 36871

const val GL_AMD_vertex_shader_viewport_index: Int = 1

const val GL_APPLE_aux_depth_stencil: Int = 1

const val GL_AUX_DEPTH_STENCIL_APPLE: Int = 35348

const val GL_APPLE_client_storage: Int = 1

const val GL_UNPACK_CLIENT_STORAGE_APPLE: Int = 34226

const val GL_APPLE_element_array: Int = 1

const val GL_ELEMENT_ARRAY_APPLE: Int = 35340

const val GL_ELEMENT_ARRAY_TYPE_APPLE: Int = 35341

const val GL_ELEMENT_ARRAY_POINTER_APPLE: Int = 35342

const val GL_APPLE_fence: Int = 1

const val GL_DRAW_PIXELS_APPLE: Int = 35338

const val GL_FENCE_APPLE: Int = 35339

const val GL_APPLE_float_pixels: Int = 1

const val GL_HALF_APPLE: Int = 5131

const val GL_RGBA_FLOAT32_APPLE: Int = 34836

const val GL_RGB_FLOAT32_APPLE: Int = 34837

const val GL_ALPHA_FLOAT32_APPLE: Int = 34838

const val GL_INTENSITY_FLOAT32_APPLE: Int = 34839

const val GL_LUMINANCE_FLOAT32_APPLE: Int = 34840

const val GL_LUMINANCE_ALPHA_FLOAT32_APPLE: Int = 34841

const val GL_RGBA_FLOAT16_APPLE: Int = 34842

const val GL_RGB_FLOAT16_APPLE: Int = 34843

const val GL_ALPHA_FLOAT16_APPLE: Int = 34844

const val GL_INTENSITY_FLOAT16_APPLE: Int = 34845

const val GL_LUMINANCE_FLOAT16_APPLE: Int = 34846

const val GL_LUMINANCE_ALPHA_FLOAT16_APPLE: Int = 34847

const val GL_COLOR_FLOAT_APPLE: Int = 35343

const val GL_APPLE_flush_buffer_range: Int = 1

const val GL_BUFFER_SERIALIZED_MODIFY_APPLE: Int = 35346

const val GL_BUFFER_FLUSHING_UNMAP_APPLE: Int = 35347

const val GL_APPLE_object_purgeable: Int = 1

const val GL_BUFFER_OBJECT_APPLE: Int = 34227

const val GL_RELEASED_APPLE: Int = 35353

const val GL_VOLATILE_APPLE: Int = 35354

const val GL_RETAINED_APPLE: Int = 35355

const val GL_UNDEFINED_APPLE: Int = 35356

const val GL_PURGEABLE_APPLE: Int = 35357

const val GL_APPLE_rgb_422: Int = 1

const val GL_RGB_422_APPLE: Int = 35359

const val GL_UNSIGNED_SHORT_8_8_APPLE: Int = 34234

const val GL_UNSIGNED_SHORT_8_8_REV_APPLE: Int = 34235

const val GL_RGB_RAW_422_APPLE: Int = 35409

const val GL_APPLE_row_bytes: Int = 1

const val GL_PACK_ROW_BYTES_APPLE: Int = 35349

const val GL_UNPACK_ROW_BYTES_APPLE: Int = 35350

const val GL_APPLE_specular_vector: Int = 1

const val GL_LIGHT_MODEL_SPECULAR_VECTOR_APPLE: Int = 34224

const val GL_APPLE_texture_range: Int = 1

const val GL_TEXTURE_RANGE_LENGTH_APPLE: Int = 34231

const val GL_TEXTURE_RANGE_POINTER_APPLE: Int = 34232

const val GL_TEXTURE_STORAGE_HINT_APPLE: Int = 34236

const val GL_STORAGE_PRIVATE_APPLE: Int = 34237

const val GL_STORAGE_CACHED_APPLE: Int = 34238

const val GL_STORAGE_SHARED_APPLE: Int = 34239

const val GL_APPLE_transform_hint: Int = 1

const val GL_TRANSFORM_HINT_APPLE: Int = 34225

const val GL_APPLE_vertex_array_object: Int = 1

const val GL_VERTEX_ARRAY_BINDING_APPLE: Int = 34229

const val GL_APPLE_vertex_array_range: Int = 1

const val GL_VERTEX_ARRAY_RANGE_APPLE: Int = 34077

const val GL_VERTEX_ARRAY_RANGE_LENGTH_APPLE: Int = 34078

const val GL_VERTEX_ARRAY_STORAGE_HINT_APPLE: Int = 34079

const val GL_VERTEX_ARRAY_RANGE_POINTER_APPLE: Int = 34081

const val GL_STORAGE_CLIENT_APPLE: Int = 34228

const val GL_APPLE_vertex_program_evaluators: Int = 1

const val GL_VERTEX_ATTRIB_MAP1_APPLE: Int = 35328

const val GL_VERTEX_ATTRIB_MAP2_APPLE: Int = 35329

const val GL_VERTEX_ATTRIB_MAP1_SIZE_APPLE: Int = 35330

const val GL_VERTEX_ATTRIB_MAP1_COEFF_APPLE: Int = 35331

const val GL_VERTEX_ATTRIB_MAP1_ORDER_APPLE: Int = 35332

const val GL_VERTEX_ATTRIB_MAP1_DOMAIN_APPLE: Int = 35333

const val GL_VERTEX_ATTRIB_MAP2_SIZE_APPLE: Int = 35334

const val GL_VERTEX_ATTRIB_MAP2_COEFF_APPLE: Int = 35335

const val GL_VERTEX_ATTRIB_MAP2_ORDER_APPLE: Int = 35336

const val GL_VERTEX_ATTRIB_MAP2_DOMAIN_APPLE: Int = 35337

const val GL_APPLE_ycbcr_422: Int = 1

const val GL_YCBCR_422_APPLE: Int = 34233

const val GL_ATI_draw_buffers: Int = 1

const val GL_MAX_DRAW_BUFFERS_ATI: Int = 34852

const val GL_DRAW_BUFFER0_ATI: Int = 34853

const val GL_DRAW_BUFFER1_ATI: Int = 34854

const val GL_DRAW_BUFFER2_ATI: Int = 34855

const val GL_DRAW_BUFFER3_ATI: Int = 34856

const val GL_DRAW_BUFFER4_ATI: Int = 34857

const val GL_DRAW_BUFFER5_ATI: Int = 34858

const val GL_DRAW_BUFFER6_ATI: Int = 34859

const val GL_DRAW_BUFFER7_ATI: Int = 34860

const val GL_DRAW_BUFFER8_ATI: Int = 34861

const val GL_DRAW_BUFFER9_ATI: Int = 34862

const val GL_DRAW_BUFFER10_ATI: Int = 34863

const val GL_DRAW_BUFFER11_ATI: Int = 34864

const val GL_DRAW_BUFFER12_ATI: Int = 34865

const val GL_DRAW_BUFFER13_ATI: Int = 34866

const val GL_DRAW_BUFFER14_ATI: Int = 34867

const val GL_DRAW_BUFFER15_ATI: Int = 34868

const val GL_ATI_element_array: Int = 1

const val GL_ELEMENT_ARRAY_ATI: Int = 34664

const val GL_ELEMENT_ARRAY_TYPE_ATI: Int = 34665

const val GL_ELEMENT_ARRAY_POINTER_ATI: Int = 34666

const val GL_ATI_envmap_bumpmap: Int = 1

const val GL_BUMP_ROT_MATRIX_ATI: Int = 34677

const val GL_BUMP_ROT_MATRIX_SIZE_ATI: Int = 34678

const val GL_BUMP_NUM_TEX_UNITS_ATI: Int = 34679

const val GL_BUMP_TEX_UNITS_ATI: Int = 34680

const val GL_DUDV_ATI: Int = 34681

const val GL_DU8DV8_ATI: Int = 34682

const val GL_BUMP_ENVMAP_ATI: Int = 34683

const val GL_BUMP_TARGET_ATI: Int = 34684

const val GL_ATI_fragment_shader: Int = 1

const val GL_FRAGMENT_SHADER_ATI: Int = 35104

const val GL_REG_0_ATI: Int = 35105

const val GL_REG_1_ATI: Int = 35106

const val GL_REG_2_ATI: Int = 35107

const val GL_REG_3_ATI: Int = 35108

const val GL_REG_4_ATI: Int = 35109

const val GL_REG_5_ATI: Int = 35110

const val GL_REG_6_ATI: Int = 35111

const val GL_REG_7_ATI: Int = 35112

const val GL_REG_8_ATI: Int = 35113

const val GL_REG_9_ATI: Int = 35114

const val GL_REG_10_ATI: Int = 35115

const val GL_REG_11_ATI: Int = 35116

const val GL_REG_12_ATI: Int = 35117

const val GL_REG_13_ATI: Int = 35118

const val GL_REG_14_ATI: Int = 35119

const val GL_REG_15_ATI: Int = 35120

const val GL_REG_16_ATI: Int = 35121

const val GL_REG_17_ATI: Int = 35122

const val GL_REG_18_ATI: Int = 35123

const val GL_REG_19_ATI: Int = 35124

const val GL_REG_20_ATI: Int = 35125

const val GL_REG_21_ATI: Int = 35126

const val GL_REG_22_ATI: Int = 35127

const val GL_REG_23_ATI: Int = 35128

const val GL_REG_24_ATI: Int = 35129

const val GL_REG_25_ATI: Int = 35130

const val GL_REG_26_ATI: Int = 35131

const val GL_REG_27_ATI: Int = 35132

const val GL_REG_28_ATI: Int = 35133

const val GL_REG_29_ATI: Int = 35134

const val GL_REG_30_ATI: Int = 35135

const val GL_REG_31_ATI: Int = 35136

const val GL_CON_0_ATI: Int = 35137

const val GL_CON_1_ATI: Int = 35138

const val GL_CON_2_ATI: Int = 35139

const val GL_CON_3_ATI: Int = 35140

const val GL_CON_4_ATI: Int = 35141

const val GL_CON_5_ATI: Int = 35142

const val GL_CON_6_ATI: Int = 35143

const val GL_CON_7_ATI: Int = 35144

const val GL_CON_8_ATI: Int = 35145

const val GL_CON_9_ATI: Int = 35146

const val GL_CON_10_ATI: Int = 35147

const val GL_CON_11_ATI: Int = 35148

const val GL_CON_12_ATI: Int = 35149

const val GL_CON_13_ATI: Int = 35150

const val GL_CON_14_ATI: Int = 35151

const val GL_CON_15_ATI: Int = 35152

const val GL_CON_16_ATI: Int = 35153

const val GL_CON_17_ATI: Int = 35154

const val GL_CON_18_ATI: Int = 35155

const val GL_CON_19_ATI: Int = 35156

const val GL_CON_20_ATI: Int = 35157

const val GL_CON_21_ATI: Int = 35158

const val GL_CON_22_ATI: Int = 35159

const val GL_CON_23_ATI: Int = 35160

const val GL_CON_24_ATI: Int = 35161

const val GL_CON_25_ATI: Int = 35162

const val GL_CON_26_ATI: Int = 35163

const val GL_CON_27_ATI: Int = 35164

const val GL_CON_28_ATI: Int = 35165

const val GL_CON_29_ATI: Int = 35166

const val GL_CON_30_ATI: Int = 35167

const val GL_CON_31_ATI: Int = 35168

const val GL_MOV_ATI: Int = 35169

const val GL_ADD_ATI: Int = 35171

const val GL_MUL_ATI: Int = 35172

const val GL_SUB_ATI: Int = 35173

const val GL_DOT3_ATI: Int = 35174

const val GL_DOT4_ATI: Int = 35175

const val GL_MAD_ATI: Int = 35176

const val GL_LERP_ATI: Int = 35177

const val GL_CND_ATI: Int = 35178

const val GL_CND0_ATI: Int = 35179

const val GL_DOT2_ADD_ATI: Int = 35180

const val GL_SECONDARY_INTERPOLATOR_ATI: Int = 35181

const val GL_NUM_FRAGMENT_REGISTERS_ATI: Int = 35182

const val GL_NUM_FRAGMENT_CONSTANTS_ATI: Int = 35183

const val GL_NUM_PASSES_ATI: Int = 35184

const val GL_NUM_INSTRUCTIONS_PER_PASS_ATI: Int = 35185

const val GL_NUM_INSTRUCTIONS_TOTAL_ATI: Int = 35186

const val GL_NUM_INPUT_INTERPOLATOR_COMPONENTS_ATI: Int = 35187

const val GL_NUM_LOOPBACK_COMPONENTS_ATI: Int = 35188

const val GL_COLOR_ALPHA_PAIRING_ATI: Int = 35189

const val GL_SWIZZLE_STR_ATI: Int = 35190

const val GL_SWIZZLE_STQ_ATI: Int = 35191

const val GL_SWIZZLE_STR_DR_ATI: Int = 35192

const val GL_SWIZZLE_STQ_DQ_ATI: Int = 35193

const val GL_SWIZZLE_STRQ_ATI: Int = 35194

const val GL_SWIZZLE_STRQ_DQ_ATI: Int = 35195

const val GL_RED_BIT_ATI: Int = 1

const val GL_GREEN_BIT_ATI: Int = 2

const val GL_BLUE_BIT_ATI: Int = 4

const val GL_2X_BIT_ATI: Int = 1

const val GL_4X_BIT_ATI: Int = 2

const val GL_8X_BIT_ATI: Int = 4

const val GL_HALF_BIT_ATI: Int = 8

const val GL_QUARTER_BIT_ATI: Int = 16

const val GL_EIGHTH_BIT_ATI: Int = 32

const val GL_SATURATE_BIT_ATI: Int = 64

const val GL_COMP_BIT_ATI: Int = 2

const val GL_NEGATE_BIT_ATI: Int = 4

const val GL_BIAS_BIT_ATI: Int = 8

const val GL_ATI_map_object_buffer: Int = 1

const val GL_ATI_meminfo: Int = 1

const val GL_VBO_FREE_MEMORY_ATI: Int = 34811

const val GL_TEXTURE_FREE_MEMORY_ATI: Int = 34812

const val GL_RENDERBUFFER_FREE_MEMORY_ATI: Int = 34813

const val GL_ATI_pixel_format_float: Int = 1

const val GL_RGBA_FLOAT_MODE_ATI: Int = 34848

const val GL_COLOR_CLEAR_UNCLAMPED_VALUE_ATI: Int = 34869

const val GL_ATI_pn_triangles: Int = 1

const val GL_PN_TRIANGLES_ATI: Int = 34800

const val GL_MAX_PN_TRIANGLES_TESSELATION_LEVEL_ATI: Int = 34801

const val GL_PN_TRIANGLES_POINT_MODE_ATI: Int = 34802

const val GL_PN_TRIANGLES_NORMAL_MODE_ATI: Int = 34803

const val GL_PN_TRIANGLES_TESSELATION_LEVEL_ATI: Int = 34804

const val GL_PN_TRIANGLES_POINT_MODE_LINEAR_ATI: Int = 34805

const val GL_PN_TRIANGLES_POINT_MODE_CUBIC_ATI: Int = 34806

const val GL_PN_TRIANGLES_NORMAL_MODE_LINEAR_ATI: Int = 34807

const val GL_PN_TRIANGLES_NORMAL_MODE_QUADRATIC_ATI: Int = 34808

const val GL_ATI_separate_stencil: Int = 1

const val GL_STENCIL_BACK_FUNC_ATI: Int = 34816

const val GL_STENCIL_BACK_FAIL_ATI: Int = 34817

const val GL_STENCIL_BACK_PASS_DEPTH_FAIL_ATI: Int = 34818

const val GL_STENCIL_BACK_PASS_DEPTH_PASS_ATI: Int = 34819

const val GL_ATI_text_fragment_shader: Int = 1

const val GL_TEXT_FRAGMENT_SHADER_ATI: Int = 33280

const val GL_ATI_texture_env_combine3: Int = 1

const val GL_MODULATE_ADD_ATI: Int = 34628

const val GL_MODULATE_SIGNED_ADD_ATI: Int = 34629

const val GL_MODULATE_SUBTRACT_ATI: Int = 34630

const val GL_ATI_texture_float: Int = 1

const val GL_RGBA_FLOAT32_ATI: Int = 34836

const val GL_RGB_FLOAT32_ATI: Int = 34837

const val GL_ALPHA_FLOAT32_ATI: Int = 34838

const val GL_INTENSITY_FLOAT32_ATI: Int = 34839

const val GL_LUMINANCE_FLOAT32_ATI: Int = 34840

const val GL_LUMINANCE_ALPHA_FLOAT32_ATI: Int = 34841

const val GL_RGBA_FLOAT16_ATI: Int = 34842

const val GL_RGB_FLOAT16_ATI: Int = 34843

const val GL_ALPHA_FLOAT16_ATI: Int = 34844

const val GL_INTENSITY_FLOAT16_ATI: Int = 34845

const val GL_LUMINANCE_FLOAT16_ATI: Int = 34846

const val GL_LUMINANCE_ALPHA_FLOAT16_ATI: Int = 34847

const val GL_ATI_texture_mirror_once: Int = 1

const val GL_MIRROR_CLAMP_ATI: Int = 34626

const val GL_MIRROR_CLAMP_TO_EDGE_ATI: Int = 34627

const val GL_ATI_vertex_array_object: Int = 1

const val GL_STATIC_ATI: Int = 34656

const val GL_DYNAMIC_ATI: Int = 34657

const val GL_PRESERVE_ATI: Int = 34658

const val GL_DISCARD_ATI: Int = 34659

const val GL_OBJECT_BUFFER_SIZE_ATI: Int = 34660

const val GL_OBJECT_BUFFER_USAGE_ATI: Int = 34661

const val GL_ARRAY_OBJECT_BUFFER_ATI: Int = 34662

const val GL_ARRAY_OBJECT_OFFSET_ATI: Int = 34663

const val GL_ATI_vertex_attrib_array_object: Int = 1

const val GL_ATI_vertex_streams: Int = 1

const val GL_MAX_VERTEX_STREAMS_ATI: Int = 34667

const val GL_VERTEX_STREAM0_ATI: Int = 34668

const val GL_VERTEX_STREAM1_ATI: Int = 34669

const val GL_VERTEX_STREAM2_ATI: Int = 34670

const val GL_VERTEX_STREAM3_ATI: Int = 34671

const val GL_VERTEX_STREAM4_ATI: Int = 34672

const val GL_VERTEX_STREAM5_ATI: Int = 34673

const val GL_VERTEX_STREAM6_ATI: Int = 34674

const val GL_VERTEX_STREAM7_ATI: Int = 34675

const val GL_VERTEX_SOURCE_ATI: Int = 34676

const val GL_EXT_422_pixels: Int = 1

const val GL_422_EXT: Int = 32972

const val GL_422_REV_EXT: Int = 32973

const val GL_422_AVERAGE_EXT: Int = 32974

const val GL_422_REV_AVERAGE_EXT: Int = 32975

const val GL_EXT_abgr: Int = 1

const val GL_ABGR_EXT: Int = 32768

const val GL_EXT_bgra: Int = 1

const val GL_BGR_EXT: Int = 32992

const val GL_BGRA_EXT: Int = 32993

const val GL_EXT_bindable_uniform: Int = 1

const val GL_MAX_VERTEX_BINDABLE_UNIFORMS_EXT: Int = 36322

const val GL_MAX_FRAGMENT_BINDABLE_UNIFORMS_EXT: Int = 36323

const val GL_MAX_GEOMETRY_BINDABLE_UNIFORMS_EXT: Int = 36324

const val GL_MAX_BINDABLE_UNIFORM_SIZE_EXT: Int = 36333

const val GL_UNIFORM_BUFFER_EXT: Int = 36334

const val GL_UNIFORM_BUFFER_BINDING_EXT: Int = 36335

const val GL_EXT_blend_color: Int = 1

const val GL_CONSTANT_COLOR_EXT: Int = 32769

const val GL_ONE_MINUS_CONSTANT_COLOR_EXT: Int = 32770

const val GL_CONSTANT_ALPHA_EXT: Int = 32771

const val GL_ONE_MINUS_CONSTANT_ALPHA_EXT: Int = 32772

const val GL_BLEND_COLOR_EXT: Int = 32773

const val GL_EXT_blend_equation_separate: Int = 1

const val GL_BLEND_EQUATION_RGB_EXT: Int = 32777

const val GL_BLEND_EQUATION_ALPHA_EXT: Int = 34877

const val GL_EXT_blend_func_separate: Int = 1

const val GL_BLEND_DST_RGB_EXT: Int = 32968

const val GL_BLEND_SRC_RGB_EXT: Int = 32969

const val GL_BLEND_DST_ALPHA_EXT: Int = 32970

const val GL_BLEND_SRC_ALPHA_EXT: Int = 32971

const val GL_EXT_blend_logic_op: Int = 1

const val GL_EXT_blend_minmax: Int = 1

const val GL_MIN_EXT: Int = 32775

const val GL_MAX_EXT: Int = 32776

const val GL_FUNC_ADD_EXT: Int = 32774

const val GL_BLEND_EQUATION_EXT: Int = 32777

const val GL_EXT_blend_subtract: Int = 1

const val GL_FUNC_SUBTRACT_EXT: Int = 32778

const val GL_FUNC_REVERSE_SUBTRACT_EXT: Int = 32779

const val GL_EXT_clip_volume_hint: Int = 1

const val GL_CLIP_VOLUME_CLIPPING_HINT_EXT: Int = 33008

const val GL_EXT_cmyka: Int = 1

const val GL_CMYK_EXT: Int = 32780

const val GL_CMYKA_EXT: Int = 32781

const val GL_PACK_CMYK_HINT_EXT: Int = 32782

const val GL_UNPACK_CMYK_HINT_EXT: Int = 32783

const val GL_EXT_color_subtable: Int = 1

const val GL_EXT_compiled_vertex_array: Int = 1

const val GL_ARRAY_ELEMENT_LOCK_FIRST_EXT: Int = 33192

const val GL_ARRAY_ELEMENT_LOCK_COUNT_EXT: Int = 33193

const val GL_EXT_convolution: Int = 1

const val GL_CONVOLUTION_1D_EXT: Int = 32784

const val GL_CONVOLUTION_2D_EXT: Int = 32785

const val GL_SEPARABLE_2D_EXT: Int = 32786

const val GL_CONVOLUTION_BORDER_MODE_EXT: Int = 32787

const val GL_CONVOLUTION_FILTER_SCALE_EXT: Int = 32788

const val GL_CONVOLUTION_FILTER_BIAS_EXT: Int = 32789

const val GL_REDUCE_EXT: Int = 32790

const val GL_CONVOLUTION_FORMAT_EXT: Int = 32791

const val GL_CONVOLUTION_WIDTH_EXT: Int = 32792

const val GL_CONVOLUTION_HEIGHT_EXT: Int = 32793

const val GL_MAX_CONVOLUTION_WIDTH_EXT: Int = 32794

const val GL_MAX_CONVOLUTION_HEIGHT_EXT: Int = 32795

const val GL_POST_CONVOLUTION_RED_SCALE_EXT: Int = 32796

const val GL_POST_CONVOLUTION_GREEN_SCALE_EXT: Int = 32797

const val GL_POST_CONVOLUTION_BLUE_SCALE_EXT: Int = 32798

const val GL_POST_CONVOLUTION_ALPHA_SCALE_EXT: Int = 32799

const val GL_POST_CONVOLUTION_RED_BIAS_EXT: Int = 32800

const val GL_POST_CONVOLUTION_GREEN_BIAS_EXT: Int = 32801

const val GL_POST_CONVOLUTION_BLUE_BIAS_EXT: Int = 32802

const val GL_POST_CONVOLUTION_ALPHA_BIAS_EXT: Int = 32803

const val GL_EXT_coordinate_frame: Int = 1

const val GL_TANGENT_ARRAY_EXT: Int = 33849

const val GL_BINORMAL_ARRAY_EXT: Int = 33850

const val GL_CURRENT_TANGENT_EXT: Int = 33851

const val GL_CURRENT_BINORMAL_EXT: Int = 33852

const val GL_TANGENT_ARRAY_TYPE_EXT: Int = 33854

const val GL_TANGENT_ARRAY_STRIDE_EXT: Int = 33855

const val GL_BINORMAL_ARRAY_TYPE_EXT: Int = 33856

const val GL_BINORMAL_ARRAY_STRIDE_EXT: Int = 33857

const val GL_TANGENT_ARRAY_POINTER_EXT: Int = 33858

const val GL_BINORMAL_ARRAY_POINTER_EXT: Int = 33859

const val GL_MAP1_TANGENT_EXT: Int = 33860

const val GL_MAP2_TANGENT_EXT: Int = 33861

const val GL_MAP1_BINORMAL_EXT: Int = 33862

const val GL_MAP2_BINORMAL_EXT: Int = 33863

const val GL_EXT_copy_texture: Int = 1

const val GL_EXT_cull_vertex: Int = 1

const val GL_CULL_VERTEX_EXT: Int = 33194

const val GL_CULL_VERTEX_EYE_POSITION_EXT: Int = 33195

const val GL_CULL_VERTEX_OBJECT_POSITION_EXT: Int = 33196

const val GL_EXT_debug_label: Int = 1

const val GL_PROGRAM_PIPELINE_OBJECT_EXT: Int = 35407

const val GL_PROGRAM_OBJECT_EXT: Int = 35648

const val GL_SHADER_OBJECT_EXT: Int = 35656

const val GL_BUFFER_OBJECT_EXT: Int = 37201

const val GL_QUERY_OBJECT_EXT: Int = 37203

const val GL_VERTEX_ARRAY_OBJECT_EXT: Int = 37204

const val GL_EXT_debug_marker: Int = 1

const val GL_EXT_depth_bounds_test: Int = 1

const val GL_DEPTH_BOUNDS_TEST_EXT: Int = 34960

const val GL_DEPTH_BOUNDS_EXT: Int = 34961

const val GL_EXT_direct_state_access: Int = 1

const val GL_PROGRAM_MATRIX_EXT: Int = 36397

const val GL_TRANSPOSE_PROGRAM_MATRIX_EXT: Int = 36398

const val GL_PROGRAM_MATRIX_STACK_DEPTH_EXT: Int = 36399

const val GL_EXT_draw_buffers2: Int = 1

const val GL_EXT_draw_instanced: Int = 1

const val GL_EXT_draw_range_elements: Int = 1

const val GL_MAX_ELEMENTS_VERTICES_EXT: Int = 33000

const val GL_MAX_ELEMENTS_INDICES_EXT: Int = 33001

const val GL_EXT_external_buffer: Int = 1

const val GL_EXT_fog_coord: Int = 1

const val GL_FOG_COORDINATE_SOURCE_EXT: Int = 33872

const val GL_FOG_COORDINATE_EXT: Int = 33873

const val GL_FRAGMENT_DEPTH_EXT: Int = 33874

const val GL_CURRENT_FOG_COORDINATE_EXT: Int = 33875

const val GL_FOG_COORDINATE_ARRAY_TYPE_EXT: Int = 33876

const val GL_FOG_COORDINATE_ARRAY_STRIDE_EXT: Int = 33877

const val GL_FOG_COORDINATE_ARRAY_POINTER_EXT: Int = 33878

const val GL_FOG_COORDINATE_ARRAY_EXT: Int = 33879

const val GL_EXT_framebuffer_blit: Int = 1

const val GL_READ_FRAMEBUFFER_EXT: Int = 36008

const val GL_DRAW_FRAMEBUFFER_EXT: Int = 36009

const val GL_DRAW_FRAMEBUFFER_BINDING_EXT: Int = 36006

const val GL_READ_FRAMEBUFFER_BINDING_EXT: Int = 36010

const val GL_EXT_framebuffer_multisample: Int = 1

const val GL_RENDERBUFFER_SAMPLES_EXT: Int = 36011

const val GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_EXT: Int = 36182

const val GL_MAX_SAMPLES_EXT: Int = 36183

const val GL_EXT_framebuffer_multisample_blit_scaled: Int = 1

const val GL_SCALED_RESOLVE_FASTEST_EXT: Int = 37050

const val GL_SCALED_RESOLVE_NICEST_EXT: Int = 37051

const val GL_EXT_framebuffer_object: Int = 1

const val GL_INVALID_FRAMEBUFFER_OPERATION_EXT: Int = 1286

const val GL_MAX_RENDERBUFFER_SIZE_EXT: Int = 34024

const val GL_FRAMEBUFFER_BINDING_EXT: Int = 36006

const val GL_RENDERBUFFER_BINDING_EXT: Int = 36007

const val GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE_EXT: Int = 36048

const val GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME_EXT: Int = 36049

const val GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL_EXT: Int = 36050

const val GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE_EXT: Int = 36051

const val GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_3D_ZOFFSET_EXT: Int = 36052

const val GL_FRAMEBUFFER_COMPLETE_EXT: Int = 36053

const val GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT_EXT: Int = 36054

const val GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT_EXT: Int = 36055

const val GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS_EXT: Int = 36057

const val GL_FRAMEBUFFER_INCOMPLETE_FORMATS_EXT: Int = 36058

const val GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER_EXT: Int = 36059

const val GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER_EXT: Int = 36060

const val GL_FRAMEBUFFER_UNSUPPORTED_EXT: Int = 36061

const val GL_MAX_COLOR_ATTACHMENTS_EXT: Int = 36063

const val GL_COLOR_ATTACHMENT0_EXT: Int = 36064

const val GL_COLOR_ATTACHMENT1_EXT: Int = 36065

const val GL_COLOR_ATTACHMENT2_EXT: Int = 36066

const val GL_COLOR_ATTACHMENT3_EXT: Int = 36067

const val GL_COLOR_ATTACHMENT4_EXT: Int = 36068

const val GL_COLOR_ATTACHMENT5_EXT: Int = 36069

const val GL_COLOR_ATTACHMENT6_EXT: Int = 36070

const val GL_COLOR_ATTACHMENT7_EXT: Int = 36071

const val GL_COLOR_ATTACHMENT8_EXT: Int = 36072

const val GL_COLOR_ATTACHMENT9_EXT: Int = 36073

const val GL_COLOR_ATTACHMENT10_EXT: Int = 36074

const val GL_COLOR_ATTACHMENT11_EXT: Int = 36075

const val GL_COLOR_ATTACHMENT12_EXT: Int = 36076

const val GL_COLOR_ATTACHMENT13_EXT: Int = 36077

const val GL_COLOR_ATTACHMENT14_EXT: Int = 36078

const val GL_COLOR_ATTACHMENT15_EXT: Int = 36079

const val GL_DEPTH_ATTACHMENT_EXT: Int = 36096

const val GL_STENCIL_ATTACHMENT_EXT: Int = 36128

const val GL_FRAMEBUFFER_EXT: Int = 36160

const val GL_RENDERBUFFER_EXT: Int = 36161

const val GL_RENDERBUFFER_WIDTH_EXT: Int = 36162

const val GL_RENDERBUFFER_HEIGHT_EXT: Int = 36163

const val GL_RENDERBUFFER_INTERNAL_FORMAT_EXT: Int = 36164

const val GL_STENCIL_INDEX1_EXT: Int = 36166

const val GL_STENCIL_INDEX4_EXT: Int = 36167

const val GL_STENCIL_INDEX8_EXT: Int = 36168

const val GL_STENCIL_INDEX16_EXT: Int = 36169

const val GL_RENDERBUFFER_RED_SIZE_EXT: Int = 36176

const val GL_RENDERBUFFER_GREEN_SIZE_EXT: Int = 36177

const val GL_RENDERBUFFER_BLUE_SIZE_EXT: Int = 36178

const val GL_RENDERBUFFER_ALPHA_SIZE_EXT: Int = 36179

const val GL_RENDERBUFFER_DEPTH_SIZE_EXT: Int = 36180

const val GL_RENDERBUFFER_STENCIL_SIZE_EXT: Int = 36181

const val GL_EXT_framebuffer_sRGB: Int = 1

const val GL_FRAMEBUFFER_SRGB_EXT: Int = 36281

const val GL_FRAMEBUFFER_SRGB_CAPABLE_EXT: Int = 36282

const val GL_EXT_geometry_shader4: Int = 1

const val GL_GEOMETRY_SHADER_EXT: Int = 36313

const val GL_GEOMETRY_VERTICES_OUT_EXT: Int = 36314

const val GL_GEOMETRY_INPUT_TYPE_EXT: Int = 36315

const val GL_GEOMETRY_OUTPUT_TYPE_EXT: Int = 36316

const val GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS_EXT: Int = 35881

const val GL_MAX_GEOMETRY_VARYING_COMPONENTS_EXT: Int = 36317

const val GL_MAX_VERTEX_VARYING_COMPONENTS_EXT: Int = 36318

const val GL_MAX_VARYING_COMPONENTS_EXT: Int = 35659

const val GL_MAX_GEOMETRY_UNIFORM_COMPONENTS_EXT: Int = 36319

const val GL_MAX_GEOMETRY_OUTPUT_VERTICES_EXT: Int = 36320

const val GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS_EXT: Int = 36321

const val GL_LINES_ADJACENCY_EXT: Int = 10

const val GL_LINE_STRIP_ADJACENCY_EXT: Int = 11

const val GL_TRIANGLES_ADJACENCY_EXT: Int = 12

const val GL_TRIANGLE_STRIP_ADJACENCY_EXT: Int = 13

const val GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS_EXT: Int = 36264

const val GL_FRAMEBUFFER_INCOMPLETE_LAYER_COUNT_EXT: Int = 36265

const val GL_FRAMEBUFFER_ATTACHMENT_LAYERED_EXT: Int = 36263

const val GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER_EXT: Int = 36052

const val GL_PROGRAM_POINT_SIZE_EXT: Int = 34370

const val GL_EXT_gpu_program_parameters: Int = 1

const val GL_EXT_gpu_shader4: Int = 1

const val GL_VERTEX_ATTRIB_ARRAY_INTEGER_EXT: Int = 35069

const val GL_SAMPLER_1D_ARRAY_EXT: Int = 36288

const val GL_SAMPLER_2D_ARRAY_EXT: Int = 36289

const val GL_SAMPLER_BUFFER_EXT: Int = 36290

const val GL_SAMPLER_1D_ARRAY_SHADOW_EXT: Int = 36291

const val GL_SAMPLER_2D_ARRAY_SHADOW_EXT: Int = 36292

const val GL_SAMPLER_CUBE_SHADOW_EXT: Int = 36293

const val GL_UNSIGNED_INT_VEC2_EXT: Int = 36294

const val GL_UNSIGNED_INT_VEC3_EXT: Int = 36295

const val GL_UNSIGNED_INT_VEC4_EXT: Int = 36296

const val GL_INT_SAMPLER_1D_EXT: Int = 36297

const val GL_INT_SAMPLER_2D_EXT: Int = 36298

const val GL_INT_SAMPLER_3D_EXT: Int = 36299

const val GL_INT_SAMPLER_CUBE_EXT: Int = 36300

const val GL_INT_SAMPLER_2D_RECT_EXT: Int = 36301

const val GL_INT_SAMPLER_1D_ARRAY_EXT: Int = 36302

const val GL_INT_SAMPLER_2D_ARRAY_EXT: Int = 36303

const val GL_INT_SAMPLER_BUFFER_EXT: Int = 36304

const val GL_UNSIGNED_INT_SAMPLER_1D_EXT: Int = 36305

const val GL_UNSIGNED_INT_SAMPLER_2D_EXT: Int = 36306

const val GL_UNSIGNED_INT_SAMPLER_3D_EXT: Int = 36307

const val GL_UNSIGNED_INT_SAMPLER_CUBE_EXT: Int = 36308

const val GL_UNSIGNED_INT_SAMPLER_2D_RECT_EXT: Int = 36309

const val GL_UNSIGNED_INT_SAMPLER_1D_ARRAY_EXT: Int = 36310

const val GL_UNSIGNED_INT_SAMPLER_2D_ARRAY_EXT: Int = 36311

const val GL_UNSIGNED_INT_SAMPLER_BUFFER_EXT: Int = 36312

const val GL_MIN_PROGRAM_TEXEL_OFFSET_EXT: Int = 35076

const val GL_MAX_PROGRAM_TEXEL_OFFSET_EXT: Int = 35077

const val GL_EXT_histogram: Int = 1

const val GL_HISTOGRAM_EXT: Int = 32804

const val GL_PROXY_HISTOGRAM_EXT: Int = 32805

const val GL_HISTOGRAM_WIDTH_EXT: Int = 32806

const val GL_HISTOGRAM_FORMAT_EXT: Int = 32807

const val GL_HISTOGRAM_RED_SIZE_EXT: Int = 32808

const val GL_HISTOGRAM_GREEN_SIZE_EXT: Int = 32809

const val GL_HISTOGRAM_BLUE_SIZE_EXT: Int = 32810

const val GL_HISTOGRAM_ALPHA_SIZE_EXT: Int = 32811

const val GL_HISTOGRAM_LUMINANCE_SIZE_EXT: Int = 32812

const val GL_HISTOGRAM_SINK_EXT: Int = 32813

const val GL_MINMAX_EXT: Int = 32814

const val GL_MINMAX_FORMAT_EXT: Int = 32815

const val GL_MINMAX_SINK_EXT: Int = 32816

const val GL_TABLE_TOO_LARGE_EXT: Int = 32817

const val GL_EXT_index_array_formats: Int = 1

const val GL_IUI_V2F_EXT: Int = 33197

const val GL_IUI_V3F_EXT: Int = 33198

const val GL_IUI_N3F_V2F_EXT: Int = 33199

const val GL_IUI_N3F_V3F_EXT: Int = 33200

const val GL_T2F_IUI_V2F_EXT: Int = 33201

const val GL_T2F_IUI_V3F_EXT: Int = 33202

const val GL_T2F_IUI_N3F_V2F_EXT: Int = 33203

const val GL_T2F_IUI_N3F_V3F_EXT: Int = 33204

const val GL_EXT_index_func: Int = 1

const val GL_INDEX_TEST_EXT: Int = 33205

const val GL_INDEX_TEST_FUNC_EXT: Int = 33206

const val GL_INDEX_TEST_REF_EXT: Int = 33207

const val GL_EXT_index_material: Int = 1

const val GL_INDEX_MATERIAL_EXT: Int = 33208

const val GL_INDEX_MATERIAL_PARAMETER_EXT: Int = 33209

const val GL_INDEX_MATERIAL_FACE_EXT: Int = 33210

const val GL_EXT_index_texture: Int = 1

const val GL_EXT_light_texture: Int = 1

const val GL_FRAGMENT_MATERIAL_EXT: Int = 33609

const val GL_FRAGMENT_NORMAL_EXT: Int = 33610

const val GL_FRAGMENT_COLOR_EXT: Int = 33612

const val GL_ATTENUATION_EXT: Int = 33613

const val GL_SHADOW_ATTENUATION_EXT: Int = 33614

const val GL_TEXTURE_APPLICATION_MODE_EXT: Int = 33615

const val GL_TEXTURE_LIGHT_EXT: Int = 33616

const val GL_TEXTURE_MATERIAL_FACE_EXT: Int = 33617

const val GL_TEXTURE_MATERIAL_PARAMETER_EXT: Int = 33618

const val GL_EXT_memory_object: Int = 1

const val GL_TEXTURE_TILING_EXT: Int = 38272

const val GL_DEDICATED_MEMORY_OBJECT_EXT: Int = 38273

const val GL_PROTECTED_MEMORY_OBJECT_EXT: Int = 38299

const val GL_NUM_TILING_TYPES_EXT: Int = 38274

const val GL_TILING_TYPES_EXT: Int = 38275

const val GL_OPTIMAL_TILING_EXT: Int = 38276

const val GL_LINEAR_TILING_EXT: Int = 38277

const val GL_NUM_DEVICE_UUIDS_EXT: Int = 38294

const val GL_DEVICE_UUID_EXT: Int = 38295

const val GL_DRIVER_UUID_EXT: Int = 38296

const val GL_UUID_SIZE_EXT: Int = 16

const val GL_EXT_memory_object_fd: Int = 1

const val GL_HANDLE_TYPE_OPAQUE_FD_EXT: Int = 38278

const val GL_EXT_memory_object_win32: Int = 1

const val GL_HANDLE_TYPE_OPAQUE_WIN32_EXT: Int = 38279

const val GL_HANDLE_TYPE_OPAQUE_WIN32_KMT_EXT: Int = 38280

const val GL_DEVICE_LUID_EXT: Int = 38297

const val GL_DEVICE_NODE_MASK_EXT: Int = 38298

const val GL_LUID_SIZE_EXT: Int = 8

const val GL_HANDLE_TYPE_D3D12_TILEPOOL_EXT: Int = 38281

const val GL_HANDLE_TYPE_D3D12_RESOURCE_EXT: Int = 38282

const val GL_HANDLE_TYPE_D3D11_IMAGE_EXT: Int = 38283

const val GL_HANDLE_TYPE_D3D11_IMAGE_KMT_EXT: Int = 38284

const val GL_EXT_misc_attribute: Int = 1

const val GL_EXT_multi_draw_arrays: Int = 1

const val GL_EXT_multisample: Int = 1

const val GL_MULTISAMPLE_EXT: Int = 32925

const val GL_SAMPLE_ALPHA_TO_MASK_EXT: Int = 32926

const val GL_SAMPLE_ALPHA_TO_ONE_EXT: Int = 32927

const val GL_SAMPLE_MASK_EXT: Int = 32928

const val GL_1PASS_EXT: Int = 32929

const val GL_2PASS_0_EXT: Int = 32930

const val GL_2PASS_1_EXT: Int = 32931

const val GL_4PASS_0_EXT: Int = 32932

const val GL_4PASS_1_EXT: Int = 32933

const val GL_4PASS_2_EXT: Int = 32934

const val GL_4PASS_3_EXT: Int = 32935

const val GL_SAMPLE_BUFFERS_EXT: Int = 32936

const val GL_SAMPLES_EXT: Int = 32937

const val GL_SAMPLE_MASK_VALUE_EXT: Int = 32938

const val GL_SAMPLE_MASK_INVERT_EXT: Int = 32939

const val GL_SAMPLE_PATTERN_EXT: Int = 32940

const val GL_MULTISAMPLE_BIT_EXT: Int = 536870912

const val GL_EXT_packed_depth_stencil: Int = 1

const val GL_DEPTH_STENCIL_EXT: Int = 34041

const val GL_UNSIGNED_INT_24_8_EXT: Int = 34042

const val GL_DEPTH24_STENCIL8_EXT: Int = 35056

const val GL_TEXTURE_STENCIL_SIZE_EXT: Int = 35057

const val GL_EXT_packed_float: Int = 1

const val GL_R11F_G11F_B10F_EXT: Int = 35898

const val GL_UNSIGNED_INT_10F_11F_11F_REV_EXT: Int = 35899

const val GL_RGBA_SIGNED_COMPONENTS_EXT: Int = 35900

const val GL_EXT_packed_pixels: Int = 1

const val GL_UNSIGNED_BYTE_3_3_2_EXT: Int = 32818

const val GL_UNSIGNED_SHORT_4_4_4_4_EXT: Int = 32819

const val GL_UNSIGNED_SHORT_5_5_5_1_EXT: Int = 32820

const val GL_UNSIGNED_INT_8_8_8_8_EXT: Int = 32821

const val GL_UNSIGNED_INT_10_10_10_2_EXT: Int = 32822

const val GL_EXT_paletted_texture: Int = 1

const val GL_COLOR_INDEX1_EXT: Int = 32994

const val GL_COLOR_INDEX2_EXT: Int = 32995

const val GL_COLOR_INDEX4_EXT: Int = 32996

const val GL_COLOR_INDEX8_EXT: Int = 32997

const val GL_COLOR_INDEX12_EXT: Int = 32998

const val GL_COLOR_INDEX16_EXT: Int = 32999

const val GL_TEXTURE_INDEX_SIZE_EXT: Int = 33005

const val GL_EXT_pixel_buffer_object: Int = 1

const val GL_PIXEL_PACK_BUFFER_EXT: Int = 35051

const val GL_PIXEL_UNPACK_BUFFER_EXT: Int = 35052

const val GL_PIXEL_PACK_BUFFER_BINDING_EXT: Int = 35053

const val GL_PIXEL_UNPACK_BUFFER_BINDING_EXT: Int = 35055

const val GL_EXT_pixel_transform: Int = 1

const val GL_PIXEL_TRANSFORM_2D_EXT: Int = 33584

const val GL_PIXEL_MAG_FILTER_EXT: Int = 33585

const val GL_PIXEL_MIN_FILTER_EXT: Int = 33586

const val GL_PIXEL_CUBIC_WEIGHT_EXT: Int = 33587

const val GL_CUBIC_EXT: Int = 33588

const val GL_AVERAGE_EXT: Int = 33589

const val GL_PIXEL_TRANSFORM_2D_STACK_DEPTH_EXT: Int = 33590

const val GL_MAX_PIXEL_TRANSFORM_2D_STACK_DEPTH_EXT: Int = 33591

const val GL_PIXEL_TRANSFORM_2D_MATRIX_EXT: Int = 33592

const val GL_EXT_pixel_transform_color_table: Int = 1

const val GL_EXT_point_parameters: Int = 1

const val GL_POINT_SIZE_MIN_EXT: Int = 33062

const val GL_POINT_SIZE_MAX_EXT: Int = 33063

const val GL_POINT_FADE_THRESHOLD_SIZE_EXT: Int = 33064

const val GL_DISTANCE_ATTENUATION_EXT: Int = 33065

const val GL_EXT_polygon_offset: Int = 1

const val GL_POLYGON_OFFSET_EXT: Int = 32823

const val GL_POLYGON_OFFSET_FACTOR_EXT: Int = 32824

const val GL_POLYGON_OFFSET_BIAS_EXT: Int = 32825

const val GL_EXT_polygon_offset_clamp: Int = 1

const val GL_POLYGON_OFFSET_CLAMP_EXT: Int = 36379

const val GL_EXT_post_depth_coverage: Int = 1

const val GL_EXT_provoking_vertex: Int = 1

const val GL_QUADS_FOLLOW_PROVOKING_VERTEX_CONVENTION_EXT: Int = 36428

const val GL_FIRST_VERTEX_CONVENTION_EXT: Int = 36429

const val GL_LAST_VERTEX_CONVENTION_EXT: Int = 36430

const val GL_PROVOKING_VERTEX_EXT: Int = 36431

const val GL_EXT_raster_multisample: Int = 1

const val GL_RASTER_MULTISAMPLE_EXT: Int = 37671

const val GL_RASTER_SAMPLES_EXT: Int = 37672

const val GL_MAX_RASTER_SAMPLES_EXT: Int = 37673

const val GL_RASTER_FIXED_SAMPLE_LOCATIONS_EXT: Int = 37674

const val GL_MULTISAMPLE_RASTERIZATION_ALLOWED_EXT: Int = 37675

const val GL_EFFECTIVE_RASTER_SAMPLES_EXT: Int = 37676

const val GL_EXT_rescale_normal: Int = 1

const val GL_RESCALE_NORMAL_EXT: Int = 32826

const val GL_EXT_secondary_color: Int = 1

const val GL_COLOR_SUM_EXT: Int = 33880

const val GL_CURRENT_SECONDARY_COLOR_EXT: Int = 33881

const val GL_SECONDARY_COLOR_ARRAY_SIZE_EXT: Int = 33882

const val GL_SECONDARY_COLOR_ARRAY_TYPE_EXT: Int = 33883

const val GL_SECONDARY_COLOR_ARRAY_STRIDE_EXT: Int = 33884

const val GL_SECONDARY_COLOR_ARRAY_POINTER_EXT: Int = 33885

const val GL_SECONDARY_COLOR_ARRAY_EXT: Int = 33886

const val GL_EXT_semaphore: Int = 1

const val GL_LAYOUT_GENERAL_EXT: Int = 38285

const val GL_LAYOUT_COLOR_ATTACHMENT_EXT: Int = 38286

const val GL_LAYOUT_DEPTH_STENCIL_ATTACHMENT_EXT: Int = 38287

const val GL_LAYOUT_DEPTH_STENCIL_READ_ONLY_EXT: Int = 38288

const val GL_LAYOUT_SHADER_READ_ONLY_EXT: Int = 38289

const val GL_LAYOUT_TRANSFER_SRC_EXT: Int = 38290

const val GL_LAYOUT_TRANSFER_DST_EXT: Int = 38291

const val GL_EXT_semaphore_fd: Int = 1

const val GL_EXT_semaphore_win32: Int = 1

const val GL_HANDLE_TYPE_D3D12_FENCE_EXT: Int = 38292

const val GL_D3D12_FENCE_VALUE_EXT: Int = 38293

const val GL_EXT_separate_shader_objects: Int = 1

const val GL_ACTIVE_PROGRAM_EXT: Int = 35725

const val GL_EXT_separate_specular_color: Int = 1

const val GL_LIGHT_MODEL_COLOR_CONTROL_EXT: Int = 33272

const val GL_SINGLE_COLOR_EXT: Int = 33273

const val GL_SEPARATE_SPECULAR_COLOR_EXT: Int = 33274

const val GL_EXT_shader_image_load_formatted: Int = 1

const val GL_EXT_shader_image_load_store: Int = 1

const val GL_MAX_IMAGE_UNITS_EXT: Int = 36664

const val GL_MAX_COMBINED_IMAGE_UNITS_AND_FRAGMENT_OUTPUTS_EXT: Int = 36665

const val GL_IMAGE_BINDING_NAME_EXT: Int = 36666

const val GL_IMAGE_BINDING_LEVEL_EXT: Int = 36667

const val GL_IMAGE_BINDING_LAYERED_EXT: Int = 36668

const val GL_IMAGE_BINDING_LAYER_EXT: Int = 36669

const val GL_IMAGE_BINDING_ACCESS_EXT: Int = 36670

const val GL_IMAGE_1D_EXT: Int = 36940

const val GL_IMAGE_2D_EXT: Int = 36941

const val GL_IMAGE_3D_EXT: Int = 36942

const val GL_IMAGE_2D_RECT_EXT: Int = 36943

const val GL_IMAGE_CUBE_EXT: Int = 36944

const val GL_IMAGE_BUFFER_EXT: Int = 36945

const val GL_IMAGE_1D_ARRAY_EXT: Int = 36946

const val GL_IMAGE_2D_ARRAY_EXT: Int = 36947

const val GL_IMAGE_CUBE_MAP_ARRAY_EXT: Int = 36948

const val GL_IMAGE_2D_MULTISAMPLE_EXT: Int = 36949

const val GL_IMAGE_2D_MULTISAMPLE_ARRAY_EXT: Int = 36950

const val GL_INT_IMAGE_1D_EXT: Int = 36951

const val GL_INT_IMAGE_2D_EXT: Int = 36952

const val GL_INT_IMAGE_3D_EXT: Int = 36953

const val GL_INT_IMAGE_2D_RECT_EXT: Int = 36954

const val GL_INT_IMAGE_CUBE_EXT: Int = 36955

const val GL_INT_IMAGE_BUFFER_EXT: Int = 36956

const val GL_INT_IMAGE_1D_ARRAY_EXT: Int = 36957

const val GL_INT_IMAGE_2D_ARRAY_EXT: Int = 36958

const val GL_INT_IMAGE_CUBE_MAP_ARRAY_EXT: Int = 36959

const val GL_INT_IMAGE_2D_MULTISAMPLE_EXT: Int = 36960

const val GL_INT_IMAGE_2D_MULTISAMPLE_ARRAY_EXT: Int = 36961

const val GL_UNSIGNED_INT_IMAGE_1D_EXT: Int = 36962

const val GL_UNSIGNED_INT_IMAGE_2D_EXT: Int = 36963

const val GL_UNSIGNED_INT_IMAGE_3D_EXT: Int = 36964

const val GL_UNSIGNED_INT_IMAGE_2D_RECT_EXT: Int = 36965

const val GL_UNSIGNED_INT_IMAGE_CUBE_EXT: Int = 36966

const val GL_UNSIGNED_INT_IMAGE_BUFFER_EXT: Int = 36967

const val GL_UNSIGNED_INT_IMAGE_1D_ARRAY_EXT: Int = 36968

const val GL_UNSIGNED_INT_IMAGE_2D_ARRAY_EXT: Int = 36969

const val GL_UNSIGNED_INT_IMAGE_CUBE_MAP_ARRAY_EXT: Int = 36970

const val GL_UNSIGNED_INT_IMAGE_2D_MULTISAMPLE_EXT: Int = 36971

const val GL_UNSIGNED_INT_IMAGE_2D_MULTISAMPLE_ARRAY_EXT: Int = 36972

const val GL_MAX_IMAGE_SAMPLES_EXT: Int = 36973

const val GL_IMAGE_BINDING_FORMAT_EXT: Int = 36974

const val GL_VERTEX_ATTRIB_ARRAY_BARRIER_BIT_EXT: Int = 1

const val GL_ELEMENT_ARRAY_BARRIER_BIT_EXT: Int = 2

const val GL_UNIFORM_BARRIER_BIT_EXT: Int = 4

const val GL_TEXTURE_FETCH_BARRIER_BIT_EXT: Int = 8

const val GL_SHADER_IMAGE_ACCESS_BARRIER_BIT_EXT: Int = 32

const val GL_COMMAND_BARRIER_BIT_EXT: Int = 64

const val GL_PIXEL_BUFFER_BARRIER_BIT_EXT: Int = 128

const val GL_TEXTURE_UPDATE_BARRIER_BIT_EXT: Int = 256

const val GL_BUFFER_UPDATE_BARRIER_BIT_EXT: Int = 512

const val GL_FRAMEBUFFER_BARRIER_BIT_EXT: Int = 1024

const val GL_TRANSFORM_FEEDBACK_BARRIER_BIT_EXT: Int = 2048

const val GL_ATOMIC_COUNTER_BARRIER_BIT_EXT: Int = 4096

const val GL_ALL_BARRIER_BITS_EXT: UInt = 4294967295u

const val GL_EXT_shader_integer_mix: Int = 1

const val GL_EXT_shadow_funcs: Int = 1

const val GL_EXT_shared_texture_palette: Int = 1

const val GL_SHARED_TEXTURE_PALETTE_EXT: Int = 33275

const val GL_EXT_sparse_texture2: Int = 1

const val GL_EXT_stencil_clear_tag: Int = 1

const val GL_STENCIL_TAG_BITS_EXT: Int = 35058

const val GL_STENCIL_CLEAR_TAG_VALUE_EXT: Int = 35059

const val GL_EXT_stencil_two_side: Int = 1

const val GL_STENCIL_TEST_TWO_SIDE_EXT: Int = 35088

const val GL_ACTIVE_STENCIL_FACE_EXT: Int = 35089

const val GL_EXT_stencil_wrap: Int = 1

const val GL_INCR_WRAP_EXT: Int = 34055

const val GL_DECR_WRAP_EXT: Int = 34056

const val GL_EXT_subtexture: Int = 1

const val GL_EXT_texture: Int = 1

const val GL_ALPHA4_EXT: Int = 32827

const val GL_ALPHA8_EXT: Int = 32828

const val GL_ALPHA12_EXT: Int = 32829

const val GL_ALPHA16_EXT: Int = 32830

const val GL_LUMINANCE4_EXT: Int = 32831

const val GL_LUMINANCE8_EXT: Int = 32832

const val GL_LUMINANCE12_EXT: Int = 32833

const val GL_LUMINANCE16_EXT: Int = 32834

const val GL_LUMINANCE4_ALPHA4_EXT: Int = 32835

const val GL_LUMINANCE6_ALPHA2_EXT: Int = 32836

const val GL_LUMINANCE8_ALPHA8_EXT: Int = 32837

const val GL_LUMINANCE12_ALPHA4_EXT: Int = 32838

const val GL_LUMINANCE12_ALPHA12_EXT: Int = 32839

const val GL_LUMINANCE16_ALPHA16_EXT: Int = 32840

const val GL_INTENSITY_EXT: Int = 32841

const val GL_INTENSITY4_EXT: Int = 32842

const val GL_INTENSITY8_EXT: Int = 32843

const val GL_INTENSITY12_EXT: Int = 32844

const val GL_INTENSITY16_EXT: Int = 32845

const val GL_RGB2_EXT: Int = 32846

const val GL_RGB4_EXT: Int = 32847

const val GL_RGB5_EXT: Int = 32848

const val GL_RGB8_EXT: Int = 32849

const val GL_RGB10_EXT: Int = 32850

const val GL_RGB12_EXT: Int = 32851

const val GL_RGB16_EXT: Int = 32852

const val GL_RGBA2_EXT: Int = 32853

const val GL_RGBA4_EXT: Int = 32854

const val GL_RGB5_A1_EXT: Int = 32855

const val GL_RGBA8_EXT: Int = 32856

const val GL_RGB10_A2_EXT: Int = 32857

const val GL_RGBA12_EXT: Int = 32858

const val GL_RGBA16_EXT: Int = 32859

const val GL_TEXTURE_RED_SIZE_EXT: Int = 32860

const val GL_TEXTURE_GREEN_SIZE_EXT: Int = 32861

const val GL_TEXTURE_BLUE_SIZE_EXT: Int = 32862

const val GL_TEXTURE_ALPHA_SIZE_EXT: Int = 32863

const val GL_TEXTURE_LUMINANCE_SIZE_EXT: Int = 32864

const val GL_TEXTURE_INTENSITY_SIZE_EXT: Int = 32865

const val GL_REPLACE_EXT: Int = 32866

const val GL_PROXY_TEXTURE_1D_EXT: Int = 32867

const val GL_PROXY_TEXTURE_2D_EXT: Int = 32868

const val GL_TEXTURE_TOO_LARGE_EXT: Int = 32869

const val GL_EXT_texture3D: Int = 1

const val GL_PACK_SKIP_IMAGES_EXT: Int = 32875

const val GL_PACK_IMAGE_HEIGHT_EXT: Int = 32876

const val GL_UNPACK_SKIP_IMAGES_EXT: Int = 32877

const val GL_UNPACK_IMAGE_HEIGHT_EXT: Int = 32878

const val GL_TEXTURE_3D_EXT: Int = 32879

const val GL_PROXY_TEXTURE_3D_EXT: Int = 32880

const val GL_TEXTURE_DEPTH_EXT: Int = 32881

const val GL_TEXTURE_WRAP_R_EXT: Int = 32882

const val GL_MAX_3D_TEXTURE_SIZE_EXT: Int = 32883

const val GL_EXT_texture_array: Int = 1

const val GL_TEXTURE_1D_ARRAY_EXT: Int = 35864

const val GL_PROXY_TEXTURE_1D_ARRAY_EXT: Int = 35865

const val GL_TEXTURE_2D_ARRAY_EXT: Int = 35866

const val GL_PROXY_TEXTURE_2D_ARRAY_EXT: Int = 35867

const val GL_TEXTURE_BINDING_1D_ARRAY_EXT: Int = 35868

const val GL_TEXTURE_BINDING_2D_ARRAY_EXT: Int = 35869

const val GL_MAX_ARRAY_TEXTURE_LAYERS_EXT: Int = 35071

const val GL_COMPARE_REF_DEPTH_TO_TEXTURE_EXT: Int = 34894

const val GL_EXT_texture_buffer_object: Int = 1

const val GL_TEXTURE_BUFFER_EXT: Int = 35882

const val GL_MAX_TEXTURE_BUFFER_SIZE_EXT: Int = 35883

const val GL_TEXTURE_BINDING_BUFFER_EXT: Int = 35884

const val GL_TEXTURE_BUFFER_DATA_STORE_BINDING_EXT: Int = 35885

const val GL_TEXTURE_BUFFER_FORMAT_EXT: Int = 35886

const val GL_EXT_texture_compression_latc: Int = 1

const val GL_COMPRESSED_LUMINANCE_LATC1_EXT: Int = 35952

const val GL_COMPRESSED_SIGNED_LUMINANCE_LATC1_EXT: Int = 35953

const val GL_COMPRESSED_LUMINANCE_ALPHA_LATC2_EXT: Int = 35954

const val GL_COMPRESSED_SIGNED_LUMINANCE_ALPHA_LATC2_EXT: Int = 35955

const val GL_EXT_texture_compression_rgtc: Int = 1

const val GL_COMPRESSED_RED_RGTC1_EXT: Int = 36283

const val GL_COMPRESSED_SIGNED_RED_RGTC1_EXT: Int = 36284

const val GL_COMPRESSED_RED_GREEN_RGTC2_EXT: Int = 36285

const val GL_COMPRESSED_SIGNED_RED_GREEN_RGTC2_EXT: Int = 36286

const val GL_EXT_texture_compression_s3tc: Int = 1

const val GL_COMPRESSED_RGB_S3TC_DXT1_EXT: Int = 33776

const val GL_COMPRESSED_RGBA_S3TC_DXT1_EXT: Int = 33777

const val GL_COMPRESSED_RGBA_S3TC_DXT3_EXT: Int = 33778

const val GL_COMPRESSED_RGBA_S3TC_DXT5_EXT: Int = 33779

const val GL_EXT_texture_cube_map: Int = 1

const val GL_NORMAL_MAP_EXT: Int = 34065

const val GL_REFLECTION_MAP_EXT: Int = 34066

const val GL_TEXTURE_CUBE_MAP_EXT: Int = 34067

const val GL_TEXTURE_BINDING_CUBE_MAP_EXT: Int = 34068

const val GL_TEXTURE_CUBE_MAP_POSITIVE_X_EXT: Int = 34069

const val GL_TEXTURE_CUBE_MAP_NEGATIVE_X_EXT: Int = 34070

const val GL_TEXTURE_CUBE_MAP_POSITIVE_Y_EXT: Int = 34071

const val GL_TEXTURE_CUBE_MAP_NEGATIVE_Y_EXT: Int = 34072

const val GL_TEXTURE_CUBE_MAP_POSITIVE_Z_EXT: Int = 34073

const val GL_TEXTURE_CUBE_MAP_NEGATIVE_Z_EXT: Int = 34074

const val GL_PROXY_TEXTURE_CUBE_MAP_EXT: Int = 34075

const val GL_MAX_CUBE_MAP_TEXTURE_SIZE_EXT: Int = 34076

const val GL_EXT_texture_env_add: Int = 1

const val GL_EXT_texture_env_combine: Int = 1

const val GL_COMBINE_EXT: Int = 34160

const val GL_COMBINE_RGB_EXT: Int = 34161

const val GL_COMBINE_ALPHA_EXT: Int = 34162

const val GL_RGB_SCALE_EXT: Int = 34163

const val GL_ADD_SIGNED_EXT: Int = 34164

const val GL_INTERPOLATE_EXT: Int = 34165

const val GL_CONSTANT_EXT: Int = 34166

const val GL_PRIMARY_COLOR_EXT: Int = 34167

const val GL_PREVIOUS_EXT: Int = 34168

const val GL_SOURCE0_RGB_EXT: Int = 34176

const val GL_SOURCE1_RGB_EXT: Int = 34177

const val GL_SOURCE2_RGB_EXT: Int = 34178

const val GL_SOURCE0_ALPHA_EXT: Int = 34184

const val GL_SOURCE1_ALPHA_EXT: Int = 34185

const val GL_SOURCE2_ALPHA_EXT: Int = 34186

const val GL_OPERAND0_RGB_EXT: Int = 34192

const val GL_OPERAND1_RGB_EXT: Int = 34193

const val GL_OPERAND2_RGB_EXT: Int = 34194

const val GL_OPERAND0_ALPHA_EXT: Int = 34200

const val GL_OPERAND1_ALPHA_EXT: Int = 34201

const val GL_OPERAND2_ALPHA_EXT: Int = 34202

const val GL_EXT_texture_env_dot3: Int = 1

const val GL_DOT3_RGB_EXT: Int = 34624

const val GL_DOT3_RGBA_EXT: Int = 34625

const val GL_EXT_texture_filter_anisotropic: Int = 1

const val GL_TEXTURE_MAX_ANISOTROPY_EXT: Int = 34046

const val GL_MAX_TEXTURE_MAX_ANISOTROPY_EXT: Int = 34047

const val GL_EXT_texture_filter_minmax: Int = 1

const val GL_EXT_texture_integer: Int = 1

const val GL_RGBA32UI_EXT: Int = 36208

const val GL_RGB32UI_EXT: Int = 36209

const val GL_ALPHA32UI_EXT: Int = 36210

const val GL_INTENSITY32UI_EXT: Int = 36211

const val GL_LUMINANCE32UI_EXT: Int = 36212

const val GL_LUMINANCE_ALPHA32UI_EXT: Int = 36213

const val GL_RGBA16UI_EXT: Int = 36214

const val GL_RGB16UI_EXT: Int = 36215

const val GL_ALPHA16UI_EXT: Int = 36216

const val GL_INTENSITY16UI_EXT: Int = 36217

const val GL_LUMINANCE16UI_EXT: Int = 36218

const val GL_LUMINANCE_ALPHA16UI_EXT: Int = 36219

const val GL_RGBA8UI_EXT: Int = 36220

const val GL_RGB8UI_EXT: Int = 36221

const val GL_ALPHA8UI_EXT: Int = 36222

const val GL_INTENSITY8UI_EXT: Int = 36223

const val GL_LUMINANCE8UI_EXT: Int = 36224

const val GL_LUMINANCE_ALPHA8UI_EXT: Int = 36225

const val GL_RGBA32I_EXT: Int = 36226

const val GL_RGB32I_EXT: Int = 36227

const val GL_ALPHA32I_EXT: Int = 36228

const val GL_INTENSITY32I_EXT: Int = 36229

const val GL_LUMINANCE32I_EXT: Int = 36230

const val GL_LUMINANCE_ALPHA32I_EXT: Int = 36231

const val GL_RGBA16I_EXT: Int = 36232

const val GL_RGB16I_EXT: Int = 36233

const val GL_ALPHA16I_EXT: Int = 36234

const val GL_INTENSITY16I_EXT: Int = 36235

const val GL_LUMINANCE16I_EXT: Int = 36236

const val GL_LUMINANCE_ALPHA16I_EXT: Int = 36237

const val GL_RGBA8I_EXT: Int = 36238

const val GL_RGB8I_EXT: Int = 36239

const val GL_ALPHA8I_EXT: Int = 36240

const val GL_INTENSITY8I_EXT: Int = 36241

const val GL_LUMINANCE8I_EXT: Int = 36242

const val GL_LUMINANCE_ALPHA8I_EXT: Int = 36243

const val GL_RED_INTEGER_EXT: Int = 36244

const val GL_GREEN_INTEGER_EXT: Int = 36245

const val GL_BLUE_INTEGER_EXT: Int = 36246

const val GL_ALPHA_INTEGER_EXT: Int = 36247

const val GL_RGB_INTEGER_EXT: Int = 36248

const val GL_RGBA_INTEGER_EXT: Int = 36249

const val GL_BGR_INTEGER_EXT: Int = 36250

const val GL_BGRA_INTEGER_EXT: Int = 36251

const val GL_LUMINANCE_INTEGER_EXT: Int = 36252

const val GL_LUMINANCE_ALPHA_INTEGER_EXT: Int = 36253

const val GL_RGBA_INTEGER_MODE_EXT: Int = 36254

const val GL_EXT_texture_lod_bias: Int = 1

const val GL_MAX_TEXTURE_LOD_BIAS_EXT: Int = 34045

const val GL_TEXTURE_FILTER_CONTROL_EXT: Int = 34048

const val GL_TEXTURE_LOD_BIAS_EXT: Int = 34049

const val GL_EXT_texture_mirror_clamp: Int = 1

const val GL_MIRROR_CLAMP_EXT: Int = 34626

const val GL_MIRROR_CLAMP_TO_EDGE_EXT: Int = 34627

const val GL_MIRROR_CLAMP_TO_BORDER_EXT: Int = 35090

const val GL_EXT_texture_object: Int = 1

const val GL_TEXTURE_PRIORITY_EXT: Int = 32870

const val GL_TEXTURE_RESIDENT_EXT: Int = 32871

const val GL_TEXTURE_1D_BINDING_EXT: Int = 32872

const val GL_TEXTURE_2D_BINDING_EXT: Int = 32873

const val GL_TEXTURE_3D_BINDING_EXT: Int = 32874

const val GL_EXT_texture_perturb_normal: Int = 1

const val GL_PERTURB_EXT: Int = 34222

const val GL_TEXTURE_NORMAL_EXT: Int = 34223

const val GL_EXT_texture_sRGB: Int = 1

const val GL_SRGB_EXT: Int = 35904

const val GL_SRGB8_EXT: Int = 35905

const val GL_SRGB_ALPHA_EXT: Int = 35906

const val GL_SRGB8_ALPHA8_EXT: Int = 35907

const val GL_SLUMINANCE_ALPHA_EXT: Int = 35908

const val GL_SLUMINANCE8_ALPHA8_EXT: Int = 35909

const val GL_SLUMINANCE_EXT: Int = 35910

const val GL_SLUMINANCE8_EXT: Int = 35911

const val GL_COMPRESSED_SRGB_EXT: Int = 35912

const val GL_COMPRESSED_SRGB_ALPHA_EXT: Int = 35913

const val GL_COMPRESSED_SLUMINANCE_EXT: Int = 35914

const val GL_COMPRESSED_SLUMINANCE_ALPHA_EXT: Int = 35915

const val GL_COMPRESSED_SRGB_S3TC_DXT1_EXT: Int = 35916

const val GL_COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT: Int = 35917

const val GL_COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT: Int = 35918

const val GL_COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT: Int = 35919

const val GL_EXT_texture_sRGB_decode: Int = 1

const val GL_TEXTURE_SRGB_DECODE_EXT: Int = 35400

const val GL_DECODE_EXT: Int = 35401

const val GL_SKIP_DECODE_EXT: Int = 35402

const val GL_EXT_texture_shared_exponent: Int = 1

const val GL_RGB9_E5_EXT: Int = 35901

const val GL_UNSIGNED_INT_5_9_9_9_REV_EXT: Int = 35902

const val GL_TEXTURE_SHARED_SIZE_EXT: Int = 35903

const val GL_EXT_texture_snorm: Int = 1

const val GL_ALPHA_SNORM: Int = 36880

const val GL_LUMINANCE_SNORM: Int = 36881

const val GL_LUMINANCE_ALPHA_SNORM: Int = 36882

const val GL_INTENSITY_SNORM: Int = 36883

const val GL_ALPHA8_SNORM: Int = 36884

const val GL_LUMINANCE8_SNORM: Int = 36885

const val GL_LUMINANCE8_ALPHA8_SNORM: Int = 36886

const val GL_INTENSITY8_SNORM: Int = 36887

const val GL_ALPHA16_SNORM: Int = 36888

const val GL_LUMINANCE16_SNORM: Int = 36889

const val GL_LUMINANCE16_ALPHA16_SNORM: Int = 36890

const val GL_INTENSITY16_SNORM: Int = 36891

const val GL_RED_SNORM: Int = 36752

const val GL_RG_SNORM: Int = 36753

const val GL_RGB_SNORM: Int = 36754

const val GL_RGBA_SNORM: Int = 36755

const val GL_EXT_texture_swizzle: Int = 1

const val GL_TEXTURE_SWIZZLE_R_EXT: Int = 36418

const val GL_TEXTURE_SWIZZLE_G_EXT: Int = 36419

const val GL_TEXTURE_SWIZZLE_B_EXT: Int = 36420

const val GL_TEXTURE_SWIZZLE_A_EXT: Int = 36421

const val GL_TEXTURE_SWIZZLE_RGBA_EXT: Int = 36422

const val GL_EXT_timer_query: Int = 1

const val GL_TIME_ELAPSED_EXT: Int = 35007

const val GL_EXT_transform_feedback: Int = 1

const val GL_TRANSFORM_FEEDBACK_BUFFER_EXT: Int = 35982

const val GL_TRANSFORM_FEEDBACK_BUFFER_START_EXT: Int = 35972

const val GL_TRANSFORM_FEEDBACK_BUFFER_SIZE_EXT: Int = 35973

const val GL_TRANSFORM_FEEDBACK_BUFFER_BINDING_EXT: Int = 35983

const val GL_INTERLEAVED_ATTRIBS_EXT: Int = 35980

const val GL_SEPARATE_ATTRIBS_EXT: Int = 35981

const val GL_PRIMITIVES_GENERATED_EXT: Int = 35975

const val GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN_EXT: Int = 35976

const val GL_RASTERIZER_DISCARD_EXT: Int = 35977

const val GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS_EXT: Int = 35978

const val GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS_EXT: Int = 35979

const val GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS_EXT: Int = 35968

const val GL_TRANSFORM_FEEDBACK_VARYINGS_EXT: Int = 35971

const val GL_TRANSFORM_FEEDBACK_BUFFER_MODE_EXT: Int = 35967

const val GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH_EXT: Int = 35958

const val GL_EXT_vertex_array: Int = 1

const val GL_VERTEX_ARRAY_EXT: Int = 32884

const val GL_NORMAL_ARRAY_EXT: Int = 32885

const val GL_COLOR_ARRAY_EXT: Int = 32886

const val GL_INDEX_ARRAY_EXT: Int = 32887

const val GL_TEXTURE_COORD_ARRAY_EXT: Int = 32888

const val GL_EDGE_FLAG_ARRAY_EXT: Int = 32889

const val GL_VERTEX_ARRAY_SIZE_EXT: Int = 32890

const val GL_VERTEX_ARRAY_TYPE_EXT: Int = 32891

const val GL_VERTEX_ARRAY_STRIDE_EXT: Int = 32892

const val GL_VERTEX_ARRAY_COUNT_EXT: Int = 32893

const val GL_NORMAL_ARRAY_TYPE_EXT: Int = 32894

const val GL_NORMAL_ARRAY_STRIDE_EXT: Int = 32895

const val GL_NORMAL_ARRAY_COUNT_EXT: Int = 32896

const val GL_COLOR_ARRAY_SIZE_EXT: Int = 32897

const val GL_COLOR_ARRAY_TYPE_EXT: Int = 32898

const val GL_COLOR_ARRAY_STRIDE_EXT: Int = 32899

const val GL_COLOR_ARRAY_COUNT_EXT: Int = 32900

const val GL_INDEX_ARRAY_TYPE_EXT: Int = 32901

const val GL_INDEX_ARRAY_STRIDE_EXT: Int = 32902

const val GL_INDEX_ARRAY_COUNT_EXT: Int = 32903

const val GL_TEXTURE_COORD_ARRAY_SIZE_EXT: Int = 32904

const val GL_TEXTURE_COORD_ARRAY_TYPE_EXT: Int = 32905

const val GL_TEXTURE_COORD_ARRAY_STRIDE_EXT: Int = 32906

const val GL_TEXTURE_COORD_ARRAY_COUNT_EXT: Int = 32907

const val GL_EDGE_FLAG_ARRAY_STRIDE_EXT: Int = 32908

const val GL_EDGE_FLAG_ARRAY_COUNT_EXT: Int = 32909

const val GL_VERTEX_ARRAY_POINTER_EXT: Int = 32910

const val GL_NORMAL_ARRAY_POINTER_EXT: Int = 32911

const val GL_COLOR_ARRAY_POINTER_EXT: Int = 32912

const val GL_INDEX_ARRAY_POINTER_EXT: Int = 32913

const val GL_TEXTURE_COORD_ARRAY_POINTER_EXT: Int = 32914

const val GL_EDGE_FLAG_ARRAY_POINTER_EXT: Int = 32915

const val GL_EXT_vertex_array_bgra: Int = 1

const val GL_EXT_vertex_attrib_64bit: Int = 1

const val GL_DOUBLE_VEC2_EXT: Int = 36860

const val GL_DOUBLE_VEC3_EXT: Int = 36861

const val GL_DOUBLE_VEC4_EXT: Int = 36862

const val GL_DOUBLE_MAT2_EXT: Int = 36678

const val GL_DOUBLE_MAT3_EXT: Int = 36679

const val GL_DOUBLE_MAT4_EXT: Int = 36680

const val GL_DOUBLE_MAT2x3_EXT: Int = 36681

const val GL_DOUBLE_MAT2x4_EXT: Int = 36682

const val GL_DOUBLE_MAT3x2_EXT: Int = 36683

const val GL_DOUBLE_MAT3x4_EXT: Int = 36684

const val GL_DOUBLE_MAT4x2_EXT: Int = 36685

const val GL_DOUBLE_MAT4x3_EXT: Int = 36686

const val GL_EXT_vertex_shader: Int = 1

const val GL_VERTEX_SHADER_EXT: Int = 34688

const val GL_VERTEX_SHADER_BINDING_EXT: Int = 34689

const val GL_OP_INDEX_EXT: Int = 34690

const val GL_OP_NEGATE_EXT: Int = 34691

const val GL_OP_DOT3_EXT: Int = 34692

const val GL_OP_DOT4_EXT: Int = 34693

const val GL_OP_MUL_EXT: Int = 34694

const val GL_OP_ADD_EXT: Int = 34695

const val GL_OP_MADD_EXT: Int = 34696

const val GL_OP_FRAC_EXT: Int = 34697

const val GL_OP_MAX_EXT: Int = 34698

const val GL_OP_MIN_EXT: Int = 34699

const val GL_OP_SET_GE_EXT: Int = 34700

const val GL_OP_SET_LT_EXT: Int = 34701

const val GL_OP_CLAMP_EXT: Int = 34702

const val GL_OP_FLOOR_EXT: Int = 34703

const val GL_OP_ROUND_EXT: Int = 34704

const val GL_OP_EXP_BASE_2_EXT: Int = 34705

const val GL_OP_LOG_BASE_2_EXT: Int = 34706

const val GL_OP_POWER_EXT: Int = 34707

const val GL_OP_RECIP_EXT: Int = 34708

const val GL_OP_RECIP_SQRT_EXT: Int = 34709

const val GL_OP_SUB_EXT: Int = 34710

const val GL_OP_CROSS_PRODUCT_EXT: Int = 34711

const val GL_OP_MULTIPLY_MATRIX_EXT: Int = 34712

const val GL_OP_MOV_EXT: Int = 34713

const val GL_OUTPUT_VERTEX_EXT: Int = 34714

const val GL_OUTPUT_COLOR0_EXT: Int = 34715

const val GL_OUTPUT_COLOR1_EXT: Int = 34716

const val GL_OUTPUT_TEXTURE_COORD0_EXT: Int = 34717

const val GL_OUTPUT_TEXTURE_COORD1_EXT: Int = 34718

const val GL_OUTPUT_TEXTURE_COORD2_EXT: Int = 34719

const val GL_OUTPUT_TEXTURE_COORD3_EXT: Int = 34720

const val GL_OUTPUT_TEXTURE_COORD4_EXT: Int = 34721

const val GL_OUTPUT_TEXTURE_COORD5_EXT: Int = 34722

const val GL_OUTPUT_TEXTURE_COORD6_EXT: Int = 34723

const val GL_OUTPUT_TEXTURE_COORD7_EXT: Int = 34724

const val GL_OUTPUT_TEXTURE_COORD8_EXT: Int = 34725

const val GL_OUTPUT_TEXTURE_COORD9_EXT: Int = 34726

const val GL_OUTPUT_TEXTURE_COORD10_EXT: Int = 34727

const val GL_OUTPUT_TEXTURE_COORD11_EXT: Int = 34728

const val GL_OUTPUT_TEXTURE_COORD12_EXT: Int = 34729

const val GL_OUTPUT_TEXTURE_COORD13_EXT: Int = 34730

const val GL_OUTPUT_TEXTURE_COORD14_EXT: Int = 34731

const val GL_OUTPUT_TEXTURE_COORD15_EXT: Int = 34732

const val GL_OUTPUT_TEXTURE_COORD16_EXT: Int = 34733

const val GL_OUTPUT_TEXTURE_COORD17_EXT: Int = 34734

const val GL_OUTPUT_TEXTURE_COORD18_EXT: Int = 34735

const val GL_OUTPUT_TEXTURE_COORD19_EXT: Int = 34736

const val GL_OUTPUT_TEXTURE_COORD20_EXT: Int = 34737

const val GL_OUTPUT_TEXTURE_COORD21_EXT: Int = 34738

const val GL_OUTPUT_TEXTURE_COORD22_EXT: Int = 34739

const val GL_OUTPUT_TEXTURE_COORD23_EXT: Int = 34740

const val GL_OUTPUT_TEXTURE_COORD24_EXT: Int = 34741

const val GL_OUTPUT_TEXTURE_COORD25_EXT: Int = 34742

const val GL_OUTPUT_TEXTURE_COORD26_EXT: Int = 34743

const val GL_OUTPUT_TEXTURE_COORD27_EXT: Int = 34744

const val GL_OUTPUT_TEXTURE_COORD28_EXT: Int = 34745

const val GL_OUTPUT_TEXTURE_COORD29_EXT: Int = 34746

const val GL_OUTPUT_TEXTURE_COORD30_EXT: Int = 34747

const val GL_OUTPUT_TEXTURE_COORD31_EXT: Int = 34748

const val GL_OUTPUT_FOG_EXT: Int = 34749

const val GL_SCALAR_EXT: Int = 34750

const val GL_VECTOR_EXT: Int = 34751

const val GL_MATRIX_EXT: Int = 34752

const val GL_VARIANT_EXT: Int = 34753

const val GL_INVARIANT_EXT: Int = 34754

const val GL_LOCAL_CONSTANT_EXT: Int = 34755

const val GL_LOCAL_EXT: Int = 34756

const val GL_MAX_VERTEX_SHADER_INSTRUCTIONS_EXT: Int = 34757

const val GL_MAX_VERTEX_SHADER_VARIANTS_EXT: Int = 34758

const val GL_MAX_VERTEX_SHADER_INVARIANTS_EXT: Int = 34759

const val GL_MAX_VERTEX_SHADER_LOCAL_CONSTANTS_EXT: Int = 34760

const val GL_MAX_VERTEX_SHADER_LOCALS_EXT: Int = 34761

const val GL_MAX_OPTIMIZED_VERTEX_SHADER_INSTRUCTIONS_EXT: Int = 34762

const val GL_MAX_OPTIMIZED_VERTEX_SHADER_VARIANTS_EXT: Int = 34763

const val GL_MAX_OPTIMIZED_VERTEX_SHADER_LOCAL_CONSTANTS_EXT: Int = 34764

const val GL_MAX_OPTIMIZED_VERTEX_SHADER_INVARIANTS_EXT: Int = 34765

const val GL_MAX_OPTIMIZED_VERTEX_SHADER_LOCALS_EXT: Int = 34766

const val GL_VERTEX_SHADER_INSTRUCTIONS_EXT: Int = 34767

const val GL_VERTEX_SHADER_VARIANTS_EXT: Int = 34768

const val GL_VERTEX_SHADER_INVARIANTS_EXT: Int = 34769

const val GL_VERTEX_SHADER_LOCAL_CONSTANTS_EXT: Int = 34770

const val GL_VERTEX_SHADER_LOCALS_EXT: Int = 34771

const val GL_VERTEX_SHADER_OPTIMIZED_EXT: Int = 34772

const val GL_X_EXT: Int = 34773

const val GL_Y_EXT: Int = 34774

const val GL_Z_EXT: Int = 34775

const val GL_W_EXT: Int = 34776

const val GL_NEGATIVE_X_EXT: Int = 34777

const val GL_NEGATIVE_Y_EXT: Int = 34778

const val GL_NEGATIVE_Z_EXT: Int = 34779

const val GL_NEGATIVE_W_EXT: Int = 34780

const val GL_ZERO_EXT: Int = 34781

const val GL_ONE_EXT: Int = 34782

const val GL_NEGATIVE_ONE_EXT: Int = 34783

const val GL_NORMALIZED_RANGE_EXT: Int = 34784

const val GL_FULL_RANGE_EXT: Int = 34785

const val GL_CURRENT_VERTEX_EXT: Int = 34786

const val GL_MVP_MATRIX_EXT: Int = 34787

const val GL_VARIANT_VALUE_EXT: Int = 34788

const val GL_VARIANT_DATATYPE_EXT: Int = 34789

const val GL_VARIANT_ARRAY_STRIDE_EXT: Int = 34790

const val GL_VARIANT_ARRAY_TYPE_EXT: Int = 34791

const val GL_VARIANT_ARRAY_EXT: Int = 34792

const val GL_VARIANT_ARRAY_POINTER_EXT: Int = 34793

const val GL_INVARIANT_VALUE_EXT: Int = 34794

const val GL_INVARIANT_DATATYPE_EXT: Int = 34795

const val GL_LOCAL_CONSTANT_VALUE_EXT: Int = 34796

const val GL_LOCAL_CONSTANT_DATATYPE_EXT: Int = 34797

const val GL_EXT_vertex_weighting: Int = 1

const val GL_MODELVIEW0_STACK_DEPTH_EXT: Int = 2979

const val GL_MODELVIEW1_STACK_DEPTH_EXT: Int = 34050

const val GL_MODELVIEW0_MATRIX_EXT: Int = 2982

const val GL_MODELVIEW1_MATRIX_EXT: Int = 34054

const val GL_VERTEX_WEIGHTING_EXT: Int = 34057

const val GL_MODELVIEW0_EXT: Int = 5888

const val GL_MODELVIEW1_EXT: Int = 34058

const val GL_CURRENT_VERTEX_WEIGHT_EXT: Int = 34059

const val GL_VERTEX_WEIGHT_ARRAY_EXT: Int = 34060

const val GL_VERTEX_WEIGHT_ARRAY_SIZE_EXT: Int = 34061

const val GL_VERTEX_WEIGHT_ARRAY_TYPE_EXT: Int = 34062

const val GL_VERTEX_WEIGHT_ARRAY_STRIDE_EXT: Int = 34063

const val GL_VERTEX_WEIGHT_ARRAY_POINTER_EXT: Int = 34064

const val GL_EXT_win32_keyed_mutex: Int = 1

const val GL_EXT_window_rectangles: Int = 1

const val GL_INCLUSIVE_EXT: Int = 36624

const val GL_EXCLUSIVE_EXT: Int = 36625

const val GL_WINDOW_RECTANGLE_EXT: Int = 36626

const val GL_WINDOW_RECTANGLE_MODE_EXT: Int = 36627

const val GL_MAX_WINDOW_RECTANGLES_EXT: Int = 36628

const val GL_NUM_WINDOW_RECTANGLES_EXT: Int = 36629

const val GL_EXT_x11_sync_object: Int = 1

const val GL_SYNC_X11_FENCE_EXT: Int = 37089

const val GL_GREMEDY_frame_terminator: Int = 1

const val GL_GREMEDY_string_marker: Int = 1

const val GL_HP_convolution_border_modes: Int = 1

const val GL_IGNORE_BORDER_HP: Int = 33104

const val GL_CONSTANT_BORDER_HP: Int = 33105

const val GL_REPLICATE_BORDER_HP: Int = 33107

const val GL_CONVOLUTION_BORDER_COLOR_HP: Int = 33108

const val GL_HP_image_transform: Int = 1

const val GL_IMAGE_SCALE_X_HP: Int = 33109

const val GL_IMAGE_SCALE_Y_HP: Int = 33110

const val GL_IMAGE_TRANSLATE_X_HP: Int = 33111

const val GL_IMAGE_TRANSLATE_Y_HP: Int = 33112

const val GL_IMAGE_ROTATE_ANGLE_HP: Int = 33113

const val GL_IMAGE_ROTATE_ORIGIN_X_HP: Int = 33114

const val GL_IMAGE_ROTATE_ORIGIN_Y_HP: Int = 33115

const val GL_IMAGE_MAG_FILTER_HP: Int = 33116

const val GL_IMAGE_MIN_FILTER_HP: Int = 33117

const val GL_IMAGE_CUBIC_WEIGHT_HP: Int = 33118

const val GL_CUBIC_HP: Int = 33119

const val GL_AVERAGE_HP: Int = 33120

const val GL_IMAGE_TRANSFORM_2D_HP: Int = 33121

const val GL_POST_IMAGE_TRANSFORM_COLOR_TABLE_HP: Int = 33122

const val GL_PROXY_POST_IMAGE_TRANSFORM_COLOR_TABLE_HP: Int = 33123

const val GL_HP_occlusion_test: Int = 1

const val GL_OCCLUSION_TEST_HP: Int = 33125

const val GL_OCCLUSION_TEST_RESULT_HP: Int = 33126

const val GL_HP_texture_lighting: Int = 1

const val GL_TEXTURE_LIGHTING_MODE_HP: Int = 33127

const val GL_TEXTURE_POST_SPECULAR_HP: Int = 33128

const val GL_TEXTURE_PRE_SPECULAR_HP: Int = 33129

const val GL_IBM_cull_vertex: Int = 1

const val GL_CULL_VERTEX_IBM: Int = 103050

const val GL_IBM_multimode_draw_arrays: Int = 1

const val GL_IBM_rasterpos_clip: Int = 1

const val GL_RASTER_POSITION_UNCLIPPED_IBM: Int = 103010

const val GL_IBM_static_data: Int = 1

const val GL_ALL_STATIC_DATA_IBM: Int = 103060

const val GL_STATIC_VERTEX_ARRAY_IBM: Int = 103061

const val GL_IBM_texture_mirrored_repeat: Int = 1

const val GL_MIRRORED_REPEAT_IBM: Int = 33648

const val GL_IBM_vertex_array_lists: Int = 1

const val GL_VERTEX_ARRAY_LIST_IBM: Int = 103070

const val GL_NORMAL_ARRAY_LIST_IBM: Int = 103071

const val GL_COLOR_ARRAY_LIST_IBM: Int = 103072

const val GL_INDEX_ARRAY_LIST_IBM: Int = 103073

const val GL_TEXTURE_COORD_ARRAY_LIST_IBM: Int = 103074

const val GL_EDGE_FLAG_ARRAY_LIST_IBM: Int = 103075

const val GL_FOG_COORDINATE_ARRAY_LIST_IBM: Int = 103076

const val GL_SECONDARY_COLOR_ARRAY_LIST_IBM: Int = 103077

const val GL_VERTEX_ARRAY_LIST_STRIDE_IBM: Int = 103080

const val GL_NORMAL_ARRAY_LIST_STRIDE_IBM: Int = 103081

const val GL_COLOR_ARRAY_LIST_STRIDE_IBM: Int = 103082

const val GL_INDEX_ARRAY_LIST_STRIDE_IBM: Int = 103083

const val GL_TEXTURE_COORD_ARRAY_LIST_STRIDE_IBM: Int = 103084

const val GL_EDGE_FLAG_ARRAY_LIST_STRIDE_IBM: Int = 103085

const val GL_FOG_COORDINATE_ARRAY_LIST_STRIDE_IBM: Int = 103086

const val GL_SECONDARY_COLOR_ARRAY_LIST_STRIDE_IBM: Int = 103087

const val GL_INGR_blend_func_separate: Int = 1

const val GL_INGR_color_clamp: Int = 1

const val GL_RED_MIN_CLAMP_INGR: Int = 34144

const val GL_GREEN_MIN_CLAMP_INGR: Int = 34145

const val GL_BLUE_MIN_CLAMP_INGR: Int = 34146

const val GL_ALPHA_MIN_CLAMP_INGR: Int = 34147

const val GL_RED_MAX_CLAMP_INGR: Int = 34148

const val GL_GREEN_MAX_CLAMP_INGR: Int = 34149

const val GL_BLUE_MAX_CLAMP_INGR: Int = 34150

const val GL_ALPHA_MAX_CLAMP_INGR: Int = 34151

const val GL_INGR_interlace_read: Int = 1

const val GL_INTERLACE_READ_INGR: Int = 34152

const val GL_INTEL_conservative_rasterization: Int = 1

const val GL_CONSERVATIVE_RASTERIZATION_INTEL: Int = 33790

const val GL_INTEL_fragment_shader_ordering: Int = 1

const val GL_INTEL_framebuffer_CMAA: Int = 1

const val GL_INTEL_map_texture: Int = 1

const val GL_TEXTURE_MEMORY_LAYOUT_INTEL: Int = 33791

const val GL_LAYOUT_DEFAULT_INTEL: Int = 0

const val GL_LAYOUT_LINEAR_INTEL: Int = 1

const val GL_LAYOUT_LINEAR_CPU_CACHED_INTEL: Int = 2

const val GL_INTEL_parallel_arrays: Int = 1

const val GL_PARALLEL_ARRAYS_INTEL: Int = 33780

const val GL_VERTEX_ARRAY_PARALLEL_POINTERS_INTEL: Int = 33781

const val GL_NORMAL_ARRAY_PARALLEL_POINTERS_INTEL: Int = 33782

const val GL_COLOR_ARRAY_PARALLEL_POINTERS_INTEL: Int = 33783

const val GL_TEXTURE_COORD_ARRAY_PARALLEL_POINTERS_INTEL: Int = 33784

const val GL_INTEL_performance_query: Int = 1

const val GL_PERFQUERY_SINGLE_CONTEXT_INTEL: Int = 0

const val GL_PERFQUERY_GLOBAL_CONTEXT_INTEL: Int = 1

const val GL_PERFQUERY_WAIT_INTEL: Int = 33787

const val GL_PERFQUERY_FLUSH_INTEL: Int = 33786

const val GL_PERFQUERY_DONOT_FLUSH_INTEL: Int = 33785

const val GL_PERFQUERY_COUNTER_EVENT_INTEL: Int = 38128

const val GL_PERFQUERY_COUNTER_DURATION_NORM_INTEL: Int = 38129

const val GL_PERFQUERY_COUNTER_DURATION_RAW_INTEL: Int = 38130

const val GL_PERFQUERY_COUNTER_THROUGHPUT_INTEL: Int = 38131

const val GL_PERFQUERY_COUNTER_RAW_INTEL: Int = 38132

const val GL_PERFQUERY_COUNTER_TIMESTAMP_INTEL: Int = 38133

const val GL_PERFQUERY_COUNTER_DATA_UINT32_INTEL: Int = 38136

const val GL_PERFQUERY_COUNTER_DATA_UINT64_INTEL: Int = 38137

const val GL_PERFQUERY_COUNTER_DATA_FLOAT_INTEL: Int = 38138

const val GL_PERFQUERY_COUNTER_DATA_DOUBLE_INTEL: Int = 38139

const val GL_PERFQUERY_COUNTER_DATA_BOOL32_INTEL: Int = 38140

const val GL_PERFQUERY_QUERY_NAME_LENGTH_MAX_INTEL: Int = 38141

const val GL_PERFQUERY_COUNTER_NAME_LENGTH_MAX_INTEL: Int = 38142

const val GL_PERFQUERY_COUNTER_DESC_LENGTH_MAX_INTEL: Int = 38143

const val GL_PERFQUERY_GPA_EXTENDED_COUNTERS_INTEL: Int = 38144

const val GL_MESAX_texture_stack: Int = 1

const val GL_TEXTURE_1D_STACK_MESAX: Int = 34649

const val GL_TEXTURE_2D_STACK_MESAX: Int = 34650

const val GL_PROXY_TEXTURE_1D_STACK_MESAX: Int = 34651

const val GL_PROXY_TEXTURE_2D_STACK_MESAX: Int = 34652

const val GL_TEXTURE_1D_STACK_BINDING_MESAX: Int = 34653

const val GL_TEXTURE_2D_STACK_BINDING_MESAX: Int = 34654

const val GL_MESA_pack_invert: Int = 1

const val GL_PACK_INVERT_MESA: Int = 34648

const val GL_MESA_program_binary_formats: Int = 1

const val GL_PROGRAM_BINARY_FORMAT_MESA: Int = 34655

const val GL_MESA_resize_buffers: Int = 1

const val GL_MESA_shader_integer_functions: Int = 1

const val GL_MESA_tile_raster_order: Int = 1

const val GL_TILE_RASTER_ORDER_FIXED_MESA: Int = 35768

const val GL_TILE_RASTER_ORDER_INCREASING_X_MESA: Int = 35769

const val GL_TILE_RASTER_ORDER_INCREASING_Y_MESA: Int = 35770

const val GL_MESA_window_pos: Int = 1

const val GL_MESA_ycbcr_texture: Int = 1

const val GL_UNSIGNED_SHORT_8_8_MESA: Int = 34234

const val GL_UNSIGNED_SHORT_8_8_REV_MESA: Int = 34235

const val GL_YCBCR_MESA: Int = 34647

const val GL_NVX_blend_equation_advanced_multi_draw_buffers: Int = 1

const val GL_NVX_conditional_render: Int = 1

const val GL_NVX_gpu_memory_info: Int = 1

const val GL_GPU_MEMORY_INFO_DEDICATED_VIDMEM_NVX: Int = 36935

const val GL_GPU_MEMORY_INFO_TOTAL_AVAILABLE_MEMORY_NVX: Int = 36936

const val GL_GPU_MEMORY_INFO_CURRENT_AVAILABLE_VIDMEM_NVX: Int = 36937

const val GL_GPU_MEMORY_INFO_EVICTION_COUNT_NVX: Int = 36938

const val GL_GPU_MEMORY_INFO_EVICTED_MEMORY_NVX: Int = 36939

const val GL_NVX_linked_gpu_multicast: Int = 1

const val GL_LGPU_SEPARATE_STORAGE_BIT_NVX: Int = 2048

const val GL_MAX_LGPU_GPUS_NVX: Int = 37562

const val GL_NV_alpha_to_coverage_dither_control: Int = 1

const val GL_ALPHA_TO_COVERAGE_DITHER_DEFAULT_NV: Int = 37709

const val GL_ALPHA_TO_COVERAGE_DITHER_ENABLE_NV: Int = 37710

const val GL_ALPHA_TO_COVERAGE_DITHER_DISABLE_NV: Int = 37711

const val GL_ALPHA_TO_COVERAGE_DITHER_MODE_NV: Int = 37567

const val GL_NV_bindless_multi_draw_indirect: Int = 1

const val GL_NV_bindless_multi_draw_indirect_count: Int = 1

const val GL_NV_bindless_texture: Int = 1

const val GL_NV_blend_equation_advanced: Int = 1

const val GL_BLEND_OVERLAP_NV: Int = 37505

const val GL_BLEND_PREMULTIPLIED_SRC_NV: Int = 37504

const val GL_BLUE_NV: Int = 6405

const val GL_COLORBURN_NV: Int = 37530

const val GL_COLORDODGE_NV: Int = 37529

const val GL_CONJOINT_NV: Int = 37508

const val GL_CONTRAST_NV: Int = 37537

const val GL_DARKEN_NV: Int = 37527

const val GL_DIFFERENCE_NV: Int = 37534

const val GL_DISJOINT_NV: Int = 37507

const val GL_DST_ATOP_NV: Int = 37519

const val GL_DST_IN_NV: Int = 37515

const val GL_DST_NV: Int = 37511

const val GL_DST_OUT_NV: Int = 37517

const val GL_DST_OVER_NV: Int = 37513

const val GL_EXCLUSION_NV: Int = 37536

const val GL_GREEN_NV: Int = 6404

const val GL_HARDLIGHT_NV: Int = 37531

const val GL_HARDMIX_NV: Int = 37545

const val GL_HSL_COLOR_NV: Int = 37551

const val GL_HSL_HUE_NV: Int = 37549

const val GL_HSL_LUMINOSITY_NV: Int = 37552

const val GL_HSL_SATURATION_NV: Int = 37550

const val GL_INVERT_OVG_NV: Int = 37556

const val GL_INVERT_RGB_NV: Int = 37539

const val GL_LIGHTEN_NV: Int = 37528

const val GL_LINEARBURN_NV: Int = 37541

const val GL_LINEARDODGE_NV: Int = 37540

const val GL_LINEARLIGHT_NV: Int = 37543

const val GL_MINUS_CLAMPED_NV: Int = 37555

const val GL_MINUS_NV: Int = 37535

const val GL_MULTIPLY_NV: Int = 37524

const val GL_OVERLAY_NV: Int = 37526

const val GL_PINLIGHT_NV: Int = 37544

const val GL_PLUS_CLAMPED_ALPHA_NV: Int = 37554

const val GL_PLUS_CLAMPED_NV: Int = 37553

const val GL_PLUS_DARKER_NV: Int = 37522

const val GL_PLUS_NV: Int = 37521

const val GL_RED_NV: Int = 6403

const val GL_SCREEN_NV: Int = 37525

const val GL_SOFTLIGHT_NV: Int = 37532

const val GL_SRC_ATOP_NV: Int = 37518

const val GL_SRC_IN_NV: Int = 37514

const val GL_SRC_NV: Int = 37510

const val GL_SRC_OUT_NV: Int = 37516

const val GL_SRC_OVER_NV: Int = 37512

const val GL_UNCORRELATED_NV: Int = 37506

const val GL_VIVIDLIGHT_NV: Int = 37542

const val GL_XOR_NV: Int = 5382

const val GL_NV_blend_equation_advanced_coherent: Int = 1

const val GL_BLEND_ADVANCED_COHERENT_NV: Int = 37509

const val GL_NV_blend_minmax_factor: Int = 1

const val GL_NV_blend_square: Int = 1

const val GL_NV_clip_space_w_scaling: Int = 1

const val GL_VIEWPORT_POSITION_W_SCALE_NV: Int = 37756

const val GL_VIEWPORT_POSITION_W_SCALE_X_COEFF_NV: Int = 37757

const val GL_VIEWPORT_POSITION_W_SCALE_Y_COEFF_NV: Int = 37758

const val GL_NV_command_list: Int = 1

const val GL_TERMINATE_SEQUENCE_COMMAND_NV: Int = 0

const val GL_NOP_COMMAND_NV: Int = 1

const val GL_DRAW_ELEMENTS_COMMAND_NV: Int = 2

const val GL_DRAW_ARRAYS_COMMAND_NV: Int = 3

const val GL_DRAW_ELEMENTS_STRIP_COMMAND_NV: Int = 4

const val GL_DRAW_ARRAYS_STRIP_COMMAND_NV: Int = 5

const val GL_DRAW_ELEMENTS_INSTANCED_COMMAND_NV: Int = 6

const val GL_DRAW_ARRAYS_INSTANCED_COMMAND_NV: Int = 7

const val GL_ELEMENT_ADDRESS_COMMAND_NV: Int = 8

const val GL_ATTRIBUTE_ADDRESS_COMMAND_NV: Int = 9

const val GL_UNIFORM_ADDRESS_COMMAND_NV: Int = 10

const val GL_BLEND_COLOR_COMMAND_NV: Int = 11

const val GL_STENCIL_REF_COMMAND_NV: Int = 12

const val GL_LINE_WIDTH_COMMAND_NV: Int = 13

const val GL_POLYGON_OFFSET_COMMAND_NV: Int = 14

const val GL_ALPHA_REF_COMMAND_NV: Int = 15

const val GL_VIEWPORT_COMMAND_NV: Int = 16

const val GL_SCISSOR_COMMAND_NV: Int = 17

const val GL_FRONT_FACE_COMMAND_NV: Int = 18

const val GL_NV_compute_program5: Int = 1

const val GL_COMPUTE_PROGRAM_NV: Int = 37115

const val GL_COMPUTE_PROGRAM_PARAMETER_BUFFER_NV: Int = 37116

const val GL_NV_conditional_render: Int = 1

const val GL_QUERY_WAIT_NV: Int = 36371

const val GL_QUERY_NO_WAIT_NV: Int = 36372

const val GL_QUERY_BY_REGION_WAIT_NV: Int = 36373

const val GL_QUERY_BY_REGION_NO_WAIT_NV: Int = 36374

const val GL_NV_conservative_raster: Int = 1

const val GL_CONSERVATIVE_RASTERIZATION_NV: Int = 37702

const val GL_SUBPIXEL_PRECISION_BIAS_X_BITS_NV: Int = 37703

const val GL_SUBPIXEL_PRECISION_BIAS_Y_BITS_NV: Int = 37704

const val GL_MAX_SUBPIXEL_PRECISION_BIAS_BITS_NV: Int = 37705

const val GL_NV_conservative_raster_dilate: Int = 1

const val GL_CONSERVATIVE_RASTER_DILATE_NV: Int = 37753

const val GL_CONSERVATIVE_RASTER_DILATE_RANGE_NV: Int = 37754

const val GL_CONSERVATIVE_RASTER_DILATE_GRANULARITY_NV: Int = 37755

const val GL_NV_conservative_raster_pre_snap_triangles: Int = 1

const val GL_CONSERVATIVE_RASTER_MODE_NV: Int = 38221

const val GL_CONSERVATIVE_RASTER_MODE_POST_SNAP_NV: Int = 38222

const val GL_CONSERVATIVE_RASTER_MODE_PRE_SNAP_TRIANGLES_NV: Int = 38223

const val GL_NV_copy_depth_to_color: Int = 1

const val GL_DEPTH_STENCIL_TO_RGBA_NV: Int = 34926

const val GL_DEPTH_STENCIL_TO_BGRA_NV: Int = 34927

const val GL_NV_copy_image: Int = 1

const val GL_NV_deep_texture3D: Int = 1

const val GL_MAX_DEEP_3D_TEXTURE_WIDTH_HEIGHT_NV: Int = 37072

const val GL_MAX_DEEP_3D_TEXTURE_DEPTH_NV: Int = 37073

const val GL_NV_depth_buffer_float: Int = 1

const val GL_DEPTH_COMPONENT32F_NV: Int = 36267

const val GL_DEPTH32F_STENCIL8_NV: Int = 36268

const val GL_FLOAT_32_UNSIGNED_INT_24_8_REV_NV: Int = 36269

const val GL_DEPTH_BUFFER_FLOAT_MODE_NV: Int = 36271

const val GL_NV_depth_clamp: Int = 1

const val GL_DEPTH_CLAMP_NV: Int = 34383

const val GL_NV_draw_texture: Int = 1

const val GL_NV_draw_vulkan_image: Int = 1

const val GL_NV_evaluators: Int = 1

const val GL_EVAL_2D_NV: Int = 34496

const val GL_EVAL_TRIANGULAR_2D_NV: Int = 34497

const val GL_MAP_TESSELLATION_NV: Int = 34498

const val GL_MAP_ATTRIB_U_ORDER_NV: Int = 34499

const val GL_MAP_ATTRIB_V_ORDER_NV: Int = 34500

const val GL_EVAL_FRACTIONAL_TESSELLATION_NV: Int = 34501

const val GL_EVAL_VERTEX_ATTRIB0_NV: Int = 34502

const val GL_EVAL_VERTEX_ATTRIB1_NV: Int = 34503

const val GL_EVAL_VERTEX_ATTRIB2_NV: Int = 34504

const val GL_EVAL_VERTEX_ATTRIB3_NV: Int = 34505

const val GL_EVAL_VERTEX_ATTRIB4_NV: Int = 34506

const val GL_EVAL_VERTEX_ATTRIB5_NV: Int = 34507

const val GL_EVAL_VERTEX_ATTRIB6_NV: Int = 34508

const val GL_EVAL_VERTEX_ATTRIB7_NV: Int = 34509

const val GL_EVAL_VERTEX_ATTRIB8_NV: Int = 34510

const val GL_EVAL_VERTEX_ATTRIB9_NV: Int = 34511

const val GL_EVAL_VERTEX_ATTRIB10_NV: Int = 34512

const val GL_EVAL_VERTEX_ATTRIB11_NV: Int = 34513

const val GL_EVAL_VERTEX_ATTRIB12_NV: Int = 34514

const val GL_EVAL_VERTEX_ATTRIB13_NV: Int = 34515

const val GL_EVAL_VERTEX_ATTRIB14_NV: Int = 34516

const val GL_EVAL_VERTEX_ATTRIB15_NV: Int = 34517

const val GL_MAX_MAP_TESSELLATION_NV: Int = 34518

const val GL_MAX_RATIONAL_EVAL_ORDER_NV: Int = 34519

const val GL_NV_explicit_multisample: Int = 1

const val GL_SAMPLE_POSITION_NV: Int = 36432

const val GL_SAMPLE_MASK_NV: Int = 36433

const val GL_SAMPLE_MASK_VALUE_NV: Int = 36434

const val GL_TEXTURE_BINDING_RENDERBUFFER_NV: Int = 36435

const val GL_TEXTURE_RENDERBUFFER_DATA_STORE_BINDING_NV: Int = 36436

const val GL_TEXTURE_RENDERBUFFER_NV: Int = 36437

const val GL_SAMPLER_RENDERBUFFER_NV: Int = 36438

const val GL_INT_SAMPLER_RENDERBUFFER_NV: Int = 36439

const val GL_UNSIGNED_INT_SAMPLER_RENDERBUFFER_NV: Int = 36440

const val GL_MAX_SAMPLE_MASK_WORDS_NV: Int = 36441

const val GL_NV_fence: Int = 1

const val GL_ALL_COMPLETED_NV: Int = 34034

const val GL_FENCE_STATUS_NV: Int = 34035

const val GL_FENCE_CONDITION_NV: Int = 34036

const val GL_NV_fill_rectangle: Int = 1

const val GL_FILL_RECTANGLE_NV: Int = 37692

const val GL_NV_float_buffer: Int = 1

const val GL_FLOAT_R_NV: Int = 34944

const val GL_FLOAT_RG_NV: Int = 34945

const val GL_FLOAT_RGB_NV: Int = 34946

const val GL_FLOAT_RGBA_NV: Int = 34947

const val GL_FLOAT_R16_NV: Int = 34948

const val GL_FLOAT_R32_NV: Int = 34949

const val GL_FLOAT_RG16_NV: Int = 34950

const val GL_FLOAT_RG32_NV: Int = 34951

const val GL_FLOAT_RGB16_NV: Int = 34952

const val GL_FLOAT_RGB32_NV: Int = 34953

const val GL_FLOAT_RGBA16_NV: Int = 34954

const val GL_FLOAT_RGBA32_NV: Int = 34955

const val GL_TEXTURE_FLOAT_COMPONENTS_NV: Int = 34956

const val GL_FLOAT_CLEAR_COLOR_VALUE_NV: Int = 34957

const val GL_FLOAT_RGBA_MODE_NV: Int = 34958

const val GL_NV_fog_distance: Int = 1

const val GL_FOG_DISTANCE_MODE_NV: Int = 34138

const val GL_EYE_RADIAL_NV: Int = 34139

const val GL_EYE_PLANE_ABSOLUTE_NV: Int = 34140

const val GL_NV_fragment_coverage_to_color: Int = 1

const val GL_FRAGMENT_COVERAGE_TO_COLOR_NV: Int = 37597

const val GL_FRAGMENT_COVERAGE_COLOR_NV: Int = 37598

const val GL_NV_fragment_program: Int = 1

const val GL_MAX_FRAGMENT_PROGRAM_LOCAL_PARAMETERS_NV: Int = 34920

const val GL_FRAGMENT_PROGRAM_NV: Int = 34928

const val GL_MAX_TEXTURE_COORDS_NV: Int = 34929

const val GL_MAX_TEXTURE_IMAGE_UNITS_NV: Int = 34930

const val GL_FRAGMENT_PROGRAM_BINDING_NV: Int = 34931

const val GL_PROGRAM_ERROR_STRING_NV: Int = 34932

const val GL_NV_fragment_program2: Int = 1

const val GL_MAX_PROGRAM_EXEC_INSTRUCTIONS_NV: Int = 35060

const val GL_MAX_PROGRAM_CALL_DEPTH_NV: Int = 35061

const val GL_MAX_PROGRAM_IF_DEPTH_NV: Int = 35062

const val GL_MAX_PROGRAM_LOOP_DEPTH_NV: Int = 35063

const val GL_MAX_PROGRAM_LOOP_COUNT_NV: Int = 35064

const val GL_NV_fragment_program4: Int = 1

const val GL_NV_fragment_program_option: Int = 1

const val GL_NV_fragment_shader_interlock: Int = 1

const val GL_NV_framebuffer_mixed_samples: Int = 1

const val GL_COVERAGE_MODULATION_TABLE_NV: Int = 37681

const val GL_COLOR_SAMPLES_NV: Int = 36384

const val GL_DEPTH_SAMPLES_NV: Int = 37677

const val GL_STENCIL_SAMPLES_NV: Int = 37678

const val GL_MIXED_DEPTH_SAMPLES_SUPPORTED_NV: Int = 37679

const val GL_MIXED_STENCIL_SAMPLES_SUPPORTED_NV: Int = 37680

const val GL_COVERAGE_MODULATION_NV: Int = 37682

const val GL_COVERAGE_MODULATION_TABLE_SIZE_NV: Int = 37683

const val GL_NV_framebuffer_multisample_coverage: Int = 1

const val GL_RENDERBUFFER_COVERAGE_SAMPLES_NV: Int = 36011

const val GL_RENDERBUFFER_COLOR_SAMPLES_NV: Int = 36368

const val GL_MAX_MULTISAMPLE_COVERAGE_MODES_NV: Int = 36369

const val GL_MULTISAMPLE_COVERAGE_MODES_NV: Int = 36370

const val GL_NV_geometry_program4: Int = 1

const val GL_GEOMETRY_PROGRAM_NV: Int = 35878

const val GL_MAX_PROGRAM_OUTPUT_VERTICES_NV: Int = 35879

const val GL_MAX_PROGRAM_TOTAL_OUTPUT_COMPONENTS_NV: Int = 35880

const val GL_NV_geometry_shader4: Int = 1

const val GL_NV_geometry_shader_passthrough: Int = 1

const val GL_NV_gpu_multicast: Int = 1

const val GL_PER_GPU_STORAGE_BIT_NV: Int = 2048

const val GL_MULTICAST_GPUS_NV: Int = 37562

const val GL_RENDER_GPU_MASK_NV: Int = 38232

const val GL_PER_GPU_STORAGE_NV: Int = 38216

const val GL_MULTICAST_PROGRAMMABLE_SAMPLE_LOCATION_NV: Int = 38217

const val GL_NV_gpu_program4: Int = 1

const val GL_MIN_PROGRAM_TEXEL_OFFSET_NV: Int = 35076

const val GL_MAX_PROGRAM_TEXEL_OFFSET_NV: Int = 35077

const val GL_PROGRAM_ATTRIB_COMPONENTS_NV: Int = 35078

const val GL_PROGRAM_RESULT_COMPONENTS_NV: Int = 35079

const val GL_MAX_PROGRAM_ATTRIB_COMPONENTS_NV: Int = 35080

const val GL_MAX_PROGRAM_RESULT_COMPONENTS_NV: Int = 35081

const val GL_MAX_PROGRAM_GENERIC_ATTRIBS_NV: Int = 36261

const val GL_MAX_PROGRAM_GENERIC_RESULTS_NV: Int = 36262

const val GL_NV_gpu_program5: Int = 1

const val GL_MAX_GEOMETRY_PROGRAM_INVOCATIONS_NV: Int = 36442

const val GL_MIN_FRAGMENT_INTERPOLATION_OFFSET_NV: Int = 36443

const val GL_MAX_FRAGMENT_INTERPOLATION_OFFSET_NV: Int = 36444

const val GL_FRAGMENT_PROGRAM_INTERPOLATION_OFFSET_BITS_NV: Int = 36445

const val GL_MIN_PROGRAM_TEXTURE_GATHER_OFFSET_NV: Int = 36446

const val GL_MAX_PROGRAM_TEXTURE_GATHER_OFFSET_NV: Int = 36447

const val GL_MAX_PROGRAM_SUBROUTINE_PARAMETERS_NV: Int = 36676

const val GL_MAX_PROGRAM_SUBROUTINE_NUM_NV: Int = 36677

const val GL_NV_gpu_program5_mem_extended: Int = 1

const val GL_NV_gpu_shader5: Int = 1

const val GL_NV_half_float: Int = 1

const val GL_HALF_FLOAT_NV: Int = 5131

const val GL_NV_internalformat_sample_query: Int = 1

const val GL_MULTISAMPLES_NV: Int = 37745

const val GL_SUPERSAMPLE_SCALE_X_NV: Int = 37746

const val GL_SUPERSAMPLE_SCALE_Y_NV: Int = 37747

const val GL_CONFORMANT_NV: Int = 37748

const val GL_NV_light_max_exponent: Int = 1

const val GL_MAX_SHININESS_NV: Int = 34052

const val GL_MAX_SPOT_EXPONENT_NV: Int = 34053

const val GL_NV_multisample_coverage: Int = 1

const val GL_NV_multisample_filter_hint: Int = 1

const val GL_MULTISAMPLE_FILTER_HINT_NV: Int = 34100

const val GL_NV_occlusion_query: Int = 1

const val GL_PIXEL_COUNTER_BITS_NV: Int = 34916

const val GL_CURRENT_OCCLUSION_QUERY_ID_NV: Int = 34917

const val GL_PIXEL_COUNT_NV: Int = 34918

const val GL_PIXEL_COUNT_AVAILABLE_NV: Int = 34919

const val GL_NV_packed_depth_stencil: Int = 1

const val GL_DEPTH_STENCIL_NV: Int = 34041

const val GL_UNSIGNED_INT_24_8_NV: Int = 34042

const val GL_NV_parameter_buffer_object: Int = 1

const val GL_MAX_PROGRAM_PARAMETER_BUFFER_BINDINGS_NV: Int = 36256

const val GL_MAX_PROGRAM_PARAMETER_BUFFER_SIZE_NV: Int = 36257

const val GL_VERTEX_PROGRAM_PARAMETER_BUFFER_NV: Int = 36258

const val GL_GEOMETRY_PROGRAM_PARAMETER_BUFFER_NV: Int = 36259

const val GL_FRAGMENT_PROGRAM_PARAMETER_BUFFER_NV: Int = 36260

const val GL_NV_parameter_buffer_object2: Int = 1

const val GL_NV_path_rendering: Int = 1

const val GL_PATH_FORMAT_SVG_NV: Int = 36976

const val GL_PATH_FORMAT_PS_NV: Int = 36977

const val GL_STANDARD_FONT_NAME_NV: Int = 36978

const val GL_SYSTEM_FONT_NAME_NV: Int = 36979

const val GL_FILE_NAME_NV: Int = 36980

const val GL_PATH_STROKE_WIDTH_NV: Int = 36981

const val GL_PATH_END_CAPS_NV: Int = 36982

const val GL_PATH_INITIAL_END_CAP_NV: Int = 36983

const val GL_PATH_TERMINAL_END_CAP_NV: Int = 36984

const val GL_PATH_JOIN_STYLE_NV: Int = 36985

const val GL_PATH_MITER_LIMIT_NV: Int = 36986

const val GL_PATH_DASH_CAPS_NV: Int = 36987

const val GL_PATH_INITIAL_DASH_CAP_NV: Int = 36988

const val GL_PATH_TERMINAL_DASH_CAP_NV: Int = 36989

const val GL_PATH_DASH_OFFSET_NV: Int = 36990

const val GL_PATH_CLIENT_LENGTH_NV: Int = 36991

const val GL_PATH_FILL_MODE_NV: Int = 36992

const val GL_PATH_FILL_MASK_NV: Int = 36993

const val GL_PATH_FILL_COVER_MODE_NV: Int = 36994

const val GL_PATH_STROKE_COVER_MODE_NV: Int = 36995

const val GL_PATH_STROKE_MASK_NV: Int = 36996

const val GL_COUNT_UP_NV: Int = 37000

const val GL_COUNT_DOWN_NV: Int = 37001

const val GL_PATH_OBJECT_BOUNDING_BOX_NV: Int = 37002

const val GL_CONVEX_HULL_NV: Int = 37003

const val GL_BOUNDING_BOX_NV: Int = 37005

const val GL_TRANSLATE_X_NV: Int = 37006

const val GL_TRANSLATE_Y_NV: Int = 37007

const val GL_TRANSLATE_2D_NV: Int = 37008

const val GL_TRANSLATE_3D_NV: Int = 37009

const val GL_AFFINE_2D_NV: Int = 37010

const val GL_AFFINE_3D_NV: Int = 37012

const val GL_TRANSPOSE_AFFINE_2D_NV: Int = 37014

const val GL_TRANSPOSE_AFFINE_3D_NV: Int = 37016

const val GL_UTF8_NV: Int = 37018

const val GL_UTF16_NV: Int = 37019

const val GL_BOUNDING_BOX_OF_BOUNDING_BOXES_NV: Int = 37020

const val GL_PATH_COMMAND_COUNT_NV: Int = 37021

const val GL_PATH_COORD_COUNT_NV: Int = 37022

const val GL_PATH_DASH_ARRAY_COUNT_NV: Int = 37023

const val GL_PATH_COMPUTED_LENGTH_NV: Int = 37024

const val GL_PATH_FILL_BOUNDING_BOX_NV: Int = 37025

const val GL_PATH_STROKE_BOUNDING_BOX_NV: Int = 37026

const val GL_SQUARE_NV: Int = 37027

const val GL_ROUND_NV: Int = 37028

const val GL_TRIANGULAR_NV: Int = 37029

const val GL_BEVEL_NV: Int = 37030

const val GL_MITER_REVERT_NV: Int = 37031

const val GL_MITER_TRUNCATE_NV: Int = 37032

const val GL_SKIP_MISSING_GLYPH_NV: Int = 37033

const val GL_USE_MISSING_GLYPH_NV: Int = 37034

const val GL_PATH_ERROR_POSITION_NV: Int = 37035

const val GL_ACCUM_ADJACENT_PAIRS_NV: Int = 37037

const val GL_ADJACENT_PAIRS_NV: Int = 37038

const val GL_FIRST_TO_REST_NV: Int = 37039

const val GL_PATH_GEN_MODE_NV: Int = 37040

const val GL_PATH_GEN_COEFF_NV: Int = 37041

const val GL_PATH_GEN_COMPONENTS_NV: Int = 37043

const val GL_PATH_STENCIL_FUNC_NV: Int = 37047

const val GL_PATH_STENCIL_REF_NV: Int = 37048

const val GL_PATH_STENCIL_VALUE_MASK_NV: Int = 37049

const val GL_PATH_STENCIL_DEPTH_OFFSET_FACTOR_NV: Int = 37053

const val GL_PATH_STENCIL_DEPTH_OFFSET_UNITS_NV: Int = 37054

const val GL_PATH_COVER_DEPTH_FUNC_NV: Int = 37055

const val GL_PATH_DASH_OFFSET_RESET_NV: Int = 37044

const val GL_MOVE_TO_RESETS_NV: Int = 37045

const val GL_MOVE_TO_CONTINUES_NV: Int = 37046

const val GL_CLOSE_PATH_NV: Int = 0

const val GL_MOVE_TO_NV: Int = 2

const val GL_RELATIVE_MOVE_TO_NV: Int = 3

const val GL_LINE_TO_NV: Int = 4

const val GL_RELATIVE_LINE_TO_NV: Int = 5

const val GL_HORIZONTAL_LINE_TO_NV: Int = 6

const val GL_RELATIVE_HORIZONTAL_LINE_TO_NV: Int = 7

const val GL_VERTICAL_LINE_TO_NV: Int = 8

const val GL_RELATIVE_VERTICAL_LINE_TO_NV: Int = 9

const val GL_QUADRATIC_CURVE_TO_NV: Int = 10

const val GL_RELATIVE_QUADRATIC_CURVE_TO_NV: Int = 11

const val GL_CUBIC_CURVE_TO_NV: Int = 12

const val GL_RELATIVE_CUBIC_CURVE_TO_NV: Int = 13

const val GL_SMOOTH_QUADRATIC_CURVE_TO_NV: Int = 14

const val GL_RELATIVE_SMOOTH_QUADRATIC_CURVE_TO_NV: Int = 15

const val GL_SMOOTH_CUBIC_CURVE_TO_NV: Int = 16

const val GL_RELATIVE_SMOOTH_CUBIC_CURVE_TO_NV: Int = 17

const val GL_SMALL_CCW_ARC_TO_NV: Int = 18

const val GL_RELATIVE_SMALL_CCW_ARC_TO_NV: Int = 19

const val GL_SMALL_CW_ARC_TO_NV: Int = 20

const val GL_RELATIVE_SMALL_CW_ARC_TO_NV: Int = 21

const val GL_LARGE_CCW_ARC_TO_NV: Int = 22

const val GL_RELATIVE_LARGE_CCW_ARC_TO_NV: Int = 23

const val GL_LARGE_CW_ARC_TO_NV: Int = 24

const val GL_RELATIVE_LARGE_CW_ARC_TO_NV: Int = 25

const val GL_RESTART_PATH_NV: Int = 240

const val GL_DUP_FIRST_CUBIC_CURVE_TO_NV: Int = 242

const val GL_DUP_LAST_CUBIC_CURVE_TO_NV: Int = 244

const val GL_RECT_NV: Int = 246

const val GL_CIRCULAR_CCW_ARC_TO_NV: Int = 248

const val GL_CIRCULAR_CW_ARC_TO_NV: Int = 250

const val GL_CIRCULAR_TANGENT_ARC_TO_NV: Int = 252

const val GL_ARC_TO_NV: Int = 254

const val GL_RELATIVE_ARC_TO_NV: Int = 255

const val GL_BOLD_BIT_NV: Int = 1

const val GL_ITALIC_BIT_NV: Int = 2

const val GL_GLYPH_WIDTH_BIT_NV: Int = 1

const val GL_GLYPH_HEIGHT_BIT_NV: Int = 2

const val GL_GLYPH_HORIZONTAL_BEARING_X_BIT_NV: Int = 4

const val GL_GLYPH_HORIZONTAL_BEARING_Y_BIT_NV: Int = 8

const val GL_GLYPH_HORIZONTAL_BEARING_ADVANCE_BIT_NV: Int = 16

const val GL_GLYPH_VERTICAL_BEARING_X_BIT_NV: Int = 32

const val GL_GLYPH_VERTICAL_BEARING_Y_BIT_NV: Int = 64

const val GL_GLYPH_VERTICAL_BEARING_ADVANCE_BIT_NV: Int = 128

const val GL_GLYPH_HAS_KERNING_BIT_NV: Int = 256

const val GL_FONT_X_MIN_BOUNDS_BIT_NV: Int = 65536

const val GL_FONT_Y_MIN_BOUNDS_BIT_NV: Int = 131072

const val GL_FONT_X_MAX_BOUNDS_BIT_NV: Int = 262144

const val GL_FONT_Y_MAX_BOUNDS_BIT_NV: Int = 524288

const val GL_FONT_UNITS_PER_EM_BIT_NV: Int = 1048576

const val GL_FONT_ASCENDER_BIT_NV: Int = 2097152

const val GL_FONT_DESCENDER_BIT_NV: Int = 4194304

const val GL_FONT_HEIGHT_BIT_NV: Int = 8388608

const val GL_FONT_MAX_ADVANCE_WIDTH_BIT_NV: Int = 16777216

const val GL_FONT_MAX_ADVANCE_HEIGHT_BIT_NV: Int = 33554432

const val GL_FONT_UNDERLINE_POSITION_BIT_NV: Int = 67108864

const val GL_FONT_UNDERLINE_THICKNESS_BIT_NV: Int = 134217728

const val GL_FONT_HAS_KERNING_BIT_NV: Int = 268435456

const val GL_ROUNDED_RECT_NV: Int = 232

const val GL_RELATIVE_ROUNDED_RECT_NV: Int = 233

const val GL_ROUNDED_RECT2_NV: Int = 234

const val GL_RELATIVE_ROUNDED_RECT2_NV: Int = 235

const val GL_ROUNDED_RECT4_NV: Int = 236

const val GL_RELATIVE_ROUNDED_RECT4_NV: Int = 237

const val GL_ROUNDED_RECT8_NV: Int = 238

const val GL_RELATIVE_ROUNDED_RECT8_NV: Int = 239

const val GL_RELATIVE_RECT_NV: Int = 247

const val GL_FONT_GLYPHS_AVAILABLE_NV: Int = 37736

const val GL_FONT_TARGET_UNAVAILABLE_NV: Int = 37737

const val GL_FONT_UNAVAILABLE_NV: Int = 37738

const val GL_FONT_UNINTELLIGIBLE_NV: Int = 37739

const val GL_CONIC_CURVE_TO_NV: Int = 26

const val GL_RELATIVE_CONIC_CURVE_TO_NV: Int = 27

const val GL_FONT_NUM_GLYPH_INDICES_BIT_NV: Int = 536870912

const val GL_STANDARD_FONT_FORMAT_NV: Int = 37740

const val GL_2_BYTES_NV: Int = 5127

const val GL_3_BYTES_NV: Int = 5128

const val GL_4_BYTES_NV: Int = 5129

const val GL_EYE_LINEAR_NV: Int = 9216

const val GL_OBJECT_LINEAR_NV: Int = 9217

const val GL_CONSTANT_NV: Int = 34166

const val GL_PATH_FOG_GEN_MODE_NV: Int = 37036

const val GL_PRIMARY_COLOR_NV: Int = 34092

const val GL_SECONDARY_COLOR_NV: Int = 34093

const val GL_PATH_GEN_COLOR_FORMAT_NV: Int = 37042

const val GL_PATH_PROJECTION_NV: Int = 5889

const val GL_PATH_MODELVIEW_NV: Int = 5888

const val GL_PATH_MODELVIEW_STACK_DEPTH_NV: Int = 2979

const val GL_PATH_MODELVIEW_MATRIX_NV: Int = 2982

const val GL_PATH_MAX_MODELVIEW_STACK_DEPTH_NV: Int = 3382

const val GL_PATH_TRANSPOSE_MODELVIEW_MATRIX_NV: Int = 34019

const val GL_PATH_PROJECTION_STACK_DEPTH_NV: Int = 2980

const val GL_PATH_PROJECTION_MATRIX_NV: Int = 2983

const val GL_PATH_MAX_PROJECTION_STACK_DEPTH_NV: Int = 3384

const val GL_PATH_TRANSPOSE_PROJECTION_MATRIX_NV: Int = 34020

const val GL_FRAGMENT_INPUT_NV: Int = 37741

const val GL_NV_path_rendering_shared_edge: Int = 1

const val GL_SHARED_EDGE_NV: Int = 192

const val GL_NV_pixel_data_range: Int = 1

const val GL_WRITE_PIXEL_DATA_RANGE_NV: Int = 34936

const val GL_READ_PIXEL_DATA_RANGE_NV: Int = 34937

const val GL_WRITE_PIXEL_DATA_RANGE_LENGTH_NV: Int = 34938

const val GL_READ_PIXEL_DATA_RANGE_LENGTH_NV: Int = 34939

const val GL_WRITE_PIXEL_DATA_RANGE_POINTER_NV: Int = 34940

const val GL_READ_PIXEL_DATA_RANGE_POINTER_NV: Int = 34941

const val GL_NV_point_sprite: Int = 1

const val GL_POINT_SPRITE_NV: Int = 34913

const val GL_COORD_REPLACE_NV: Int = 34914

const val GL_POINT_SPRITE_R_MODE_NV: Int = 34915

const val GL_NV_present_video: Int = 1

const val GL_FRAME_NV: Int = 36390

const val GL_FIELDS_NV: Int = 36391

const val GL_CURRENT_TIME_NV: Int = 36392

const val GL_NUM_FILL_STREAMS_NV: Int = 36393

const val GL_PRESENT_TIME_NV: Int = 36394

const val GL_PRESENT_DURATION_NV: Int = 36395

const val GL_NV_primitive_restart: Int = 1

const val GL_PRIMITIVE_RESTART_NV: Int = 34136

const val GL_PRIMITIVE_RESTART_INDEX_NV: Int = 34137

const val GL_NV_query_resource: Int = 1

const val GL_QUERY_RESOURCE_TYPE_VIDMEM_ALLOC_NV: Int = 38208

const val GL_QUERY_RESOURCE_MEMTYPE_VIDMEM_NV: Int = 38210

const val GL_QUERY_RESOURCE_SYS_RESERVED_NV: Int = 38212

const val GL_QUERY_RESOURCE_TEXTURE_NV: Int = 38213

const val GL_QUERY_RESOURCE_RENDERBUFFER_NV: Int = 38214

const val GL_QUERY_RESOURCE_BUFFEROBJECT_NV: Int = 38215

const val GL_NV_query_resource_tag: Int = 1

const val GL_NV_register_combiners: Int = 1

const val GL_REGISTER_COMBINERS_NV: Int = 34082

const val GL_VARIABLE_A_NV: Int = 34083

const val GL_VARIABLE_B_NV: Int = 34084

const val GL_VARIABLE_C_NV: Int = 34085

const val GL_VARIABLE_D_NV: Int = 34086

const val GL_VARIABLE_E_NV: Int = 34087

const val GL_VARIABLE_F_NV: Int = 34088

const val GL_VARIABLE_G_NV: Int = 34089

const val GL_CONSTANT_COLOR0_NV: Int = 34090

const val GL_CONSTANT_COLOR1_NV: Int = 34091

const val GL_SPARE0_NV: Int = 34094

const val GL_SPARE1_NV: Int = 34095

const val GL_DISCARD_NV: Int = 34096

const val GL_E_TIMES_F_NV: Int = 34097

const val GL_SPARE0_PLUS_SECONDARY_COLOR_NV: Int = 34098

const val GL_UNSIGNED_IDENTITY_NV: Int = 34102

const val GL_UNSIGNED_INVERT_NV: Int = 34103

const val GL_EXPAND_NORMAL_NV: Int = 34104

const val GL_EXPAND_NEGATE_NV: Int = 34105

const val GL_HALF_BIAS_NORMAL_NV: Int = 34106

const val GL_HALF_BIAS_NEGATE_NV: Int = 34107

const val GL_SIGNED_IDENTITY_NV: Int = 34108

const val GL_SIGNED_NEGATE_NV: Int = 34109

const val GL_SCALE_BY_TWO_NV: Int = 34110

const val GL_SCALE_BY_FOUR_NV: Int = 34111

const val GL_SCALE_BY_ONE_HALF_NV: Int = 34112

const val GL_BIAS_BY_NEGATIVE_ONE_HALF_NV: Int = 34113

const val GL_COMBINER_INPUT_NV: Int = 34114

const val GL_COMBINER_MAPPING_NV: Int = 34115

const val GL_COMBINER_COMPONENT_USAGE_NV: Int = 34116

const val GL_COMBINER_AB_DOT_PRODUCT_NV: Int = 34117

const val GL_COMBINER_CD_DOT_PRODUCT_NV: Int = 34118

const val GL_COMBINER_MUX_SUM_NV: Int = 34119

const val GL_COMBINER_SCALE_NV: Int = 34120

const val GL_COMBINER_BIAS_NV: Int = 34121

const val GL_COMBINER_AB_OUTPUT_NV: Int = 34122

const val GL_COMBINER_CD_OUTPUT_NV: Int = 34123

const val GL_COMBINER_SUM_OUTPUT_NV: Int = 34124

const val GL_MAX_GENERAL_COMBINERS_NV: Int = 34125

const val GL_NUM_GENERAL_COMBINERS_NV: Int = 34126

const val GL_COLOR_SUM_CLAMP_NV: Int = 34127

const val GL_COMBINER0_NV: Int = 34128

const val GL_COMBINER1_NV: Int = 34129

const val GL_COMBINER2_NV: Int = 34130

const val GL_COMBINER3_NV: Int = 34131

const val GL_COMBINER4_NV: Int = 34132

const val GL_COMBINER5_NV: Int = 34133

const val GL_COMBINER6_NV: Int = 34134

const val GL_COMBINER7_NV: Int = 34135

const val GL_NV_register_combiners2: Int = 1

const val GL_PER_STAGE_CONSTANTS_NV: Int = 34101

const val GL_NV_robustness_video_memory_purge: Int = 1

const val GL_PURGED_CONTEXT_RESET_NV: Int = 37563

const val GL_NV_sample_locations: Int = 1

const val GL_SAMPLE_LOCATION_SUBPIXEL_BITS_NV: Int = 37693

const val GL_SAMPLE_LOCATION_PIXEL_GRID_WIDTH_NV: Int = 37694

const val GL_SAMPLE_LOCATION_PIXEL_GRID_HEIGHT_NV: Int = 37695

const val GL_PROGRAMMABLE_SAMPLE_LOCATION_TABLE_SIZE_NV: Int = 37696

const val GL_SAMPLE_LOCATION_NV: Int = 36432

const val GL_PROGRAMMABLE_SAMPLE_LOCATION_NV: Int = 37697

const val GL_FRAMEBUFFER_PROGRAMMABLE_SAMPLE_LOCATIONS_NV: Int = 37698

const val GL_FRAMEBUFFER_SAMPLE_LOCATION_PIXEL_GRID_NV: Int = 37699

const val GL_NV_sample_mask_override_coverage: Int = 1

const val GL_NV_shader_atomic_counters: Int = 1

const val GL_NV_shader_atomic_float: Int = 1

const val GL_NV_shader_atomic_float64: Int = 1

const val GL_NV_shader_atomic_fp16_vector: Int = 1

const val GL_NV_shader_atomic_int64: Int = 1

const val GL_NV_shader_buffer_load: Int = 1

const val GL_BUFFER_GPU_ADDRESS_NV: Int = 36637

const val GL_GPU_ADDRESS_NV: Int = 36660

const val GL_MAX_SHADER_BUFFER_ADDRESS_NV: Int = 36661

const val GL_NV_shader_buffer_store: Int = 1

const val GL_SHADER_GLOBAL_ACCESS_BARRIER_BIT_NV: Int = 16

const val GL_NV_shader_storage_buffer_object: Int = 1

const val GL_NV_shader_thread_group: Int = 1

const val GL_WARP_SIZE_NV: Int = 37689

const val GL_WARPS_PER_SM_NV: Int = 37690

const val GL_SM_COUNT_NV: Int = 37691

const val GL_NV_shader_thread_shuffle: Int = 1

const val GL_NV_stereo_view_rendering: Int = 1

const val GL_NV_tessellation_program5: Int = 1

const val GL_MAX_PROGRAM_PATCH_ATTRIBS_NV: Int = 34520

const val GL_TESS_CONTROL_PROGRAM_NV: Int = 35102

const val GL_TESS_EVALUATION_PROGRAM_NV: Int = 35103

const val GL_TESS_CONTROL_PROGRAM_PARAMETER_BUFFER_NV: Int = 35956

const val GL_TESS_EVALUATION_PROGRAM_PARAMETER_BUFFER_NV: Int = 35957

const val GL_NV_texgen_emboss: Int = 1

const val GL_EMBOSS_LIGHT_NV: Int = 34141

const val GL_EMBOSS_CONSTANT_NV: Int = 34142

const val GL_EMBOSS_MAP_NV: Int = 34143

const val GL_NV_texgen_reflection: Int = 1

const val GL_NORMAL_MAP_NV: Int = 34065

const val GL_REFLECTION_MAP_NV: Int = 34066

const val GL_NV_texture_barrier: Int = 1

const val GL_NV_texture_compression_vtc: Int = 1

const val GL_NV_texture_env_combine4: Int = 1

const val GL_COMBINE4_NV: Int = 34051

const val GL_SOURCE3_RGB_NV: Int = 34179

const val GL_SOURCE3_ALPHA_NV: Int = 34187

const val GL_OPERAND3_RGB_NV: Int = 34195

const val GL_OPERAND3_ALPHA_NV: Int = 34203

const val GL_NV_texture_expand_normal: Int = 1

const val GL_TEXTURE_UNSIGNED_REMAP_MODE_NV: Int = 34959

const val GL_NV_texture_multisample: Int = 1

const val GL_TEXTURE_COVERAGE_SAMPLES_NV: Int = 36933

const val GL_TEXTURE_COLOR_SAMPLES_NV: Int = 36934

const val GL_NV_texture_rectangle: Int = 1

const val GL_TEXTURE_RECTANGLE_NV: Int = 34037

const val GL_TEXTURE_BINDING_RECTANGLE_NV: Int = 34038

const val GL_PROXY_TEXTURE_RECTANGLE_NV: Int = 34039

const val GL_MAX_RECTANGLE_TEXTURE_SIZE_NV: Int = 34040

const val GL_NV_texture_rectangle_compressed: Int = 1

const val GL_NV_texture_shader: Int = 1

const val GL_OFFSET_TEXTURE_RECTANGLE_NV: Int = 34380

const val GL_OFFSET_TEXTURE_RECTANGLE_SCALE_NV: Int = 34381

const val GL_DOT_PRODUCT_TEXTURE_RECTANGLE_NV: Int = 34382

const val GL_RGBA_UNSIGNED_DOT_PRODUCT_MAPPING_NV: Int = 34521

const val GL_UNSIGNED_INT_S8_S8_8_8_NV: Int = 34522

const val GL_UNSIGNED_INT_8_8_S8_S8_REV_NV: Int = 34523

const val GL_DSDT_MAG_INTENSITY_NV: Int = 34524

const val GL_SHADER_CONSISTENT_NV: Int = 34525

const val GL_TEXTURE_SHADER_NV: Int = 34526

const val GL_SHADER_OPERATION_NV: Int = 34527

const val GL_CULL_MODES_NV: Int = 34528

const val GL_OFFSET_TEXTURE_MATRIX_NV: Int = 34529

const val GL_OFFSET_TEXTURE_SCALE_NV: Int = 34530

const val GL_OFFSET_TEXTURE_BIAS_NV: Int = 34531

const val GL_OFFSET_TEXTURE_2D_MATRIX_NV: Int = 34529

const val GL_OFFSET_TEXTURE_2D_SCALE_NV: Int = 34530

const val GL_OFFSET_TEXTURE_2D_BIAS_NV: Int = 34531

const val GL_PREVIOUS_TEXTURE_INPUT_NV: Int = 34532

const val GL_CONST_EYE_NV: Int = 34533

const val GL_PASS_THROUGH_NV: Int = 34534

const val GL_CULL_FRAGMENT_NV: Int = 34535

const val GL_OFFSET_TEXTURE_2D_NV: Int = 34536

const val GL_DEPENDENT_AR_TEXTURE_2D_NV: Int = 34537

const val GL_DEPENDENT_GB_TEXTURE_2D_NV: Int = 34538

const val GL_DOT_PRODUCT_NV: Int = 34540

const val GL_DOT_PRODUCT_DEPTH_REPLACE_NV: Int = 34541

const val GL_DOT_PRODUCT_TEXTURE_2D_NV: Int = 34542

const val GL_DOT_PRODUCT_TEXTURE_CUBE_MAP_NV: Int = 34544

const val GL_DOT_PRODUCT_DIFFUSE_CUBE_MAP_NV: Int = 34545

const val GL_DOT_PRODUCT_REFLECT_CUBE_MAP_NV: Int = 34546

const val GL_DOT_PRODUCT_CONST_EYE_REFLECT_CUBE_MAP_NV: Int = 34547

const val GL_HILO_NV: Int = 34548

const val GL_DSDT_NV: Int = 34549

const val GL_DSDT_MAG_NV: Int = 34550

const val GL_DSDT_MAG_VIB_NV: Int = 34551

const val GL_HILO16_NV: Int = 34552

const val GL_SIGNED_HILO_NV: Int = 34553

const val GL_SIGNED_HILO16_NV: Int = 34554

const val GL_SIGNED_RGBA_NV: Int = 34555

const val GL_SIGNED_RGBA8_NV: Int = 34556

const val GL_SIGNED_RGB_NV: Int = 34558

const val GL_SIGNED_RGB8_NV: Int = 34559

const val GL_SIGNED_LUMINANCE_NV: Int = 34561

const val GL_SIGNED_LUMINANCE8_NV: Int = 34562

const val GL_SIGNED_LUMINANCE_ALPHA_NV: Int = 34563

const val GL_SIGNED_LUMINANCE8_ALPHA8_NV: Int = 34564

const val GL_SIGNED_ALPHA_NV: Int = 34565

const val GL_SIGNED_ALPHA8_NV: Int = 34566

const val GL_SIGNED_INTENSITY_NV: Int = 34567

const val GL_SIGNED_INTENSITY8_NV: Int = 34568

const val GL_DSDT8_NV: Int = 34569

const val GL_DSDT8_MAG8_NV: Int = 34570

const val GL_DSDT8_MAG8_INTENSITY8_NV: Int = 34571

const val GL_SIGNED_RGB_UNSIGNED_ALPHA_NV: Int = 34572

const val GL_SIGNED_RGB8_UNSIGNED_ALPHA8_NV: Int = 34573

const val GL_HI_SCALE_NV: Int = 34574

const val GL_LO_SCALE_NV: Int = 34575

const val GL_DS_SCALE_NV: Int = 34576

const val GL_DT_SCALE_NV: Int = 34577

const val GL_MAGNITUDE_SCALE_NV: Int = 34578

const val GL_VIBRANCE_SCALE_NV: Int = 34579

const val GL_HI_BIAS_NV: Int = 34580

const val GL_LO_BIAS_NV: Int = 34581

const val GL_DS_BIAS_NV: Int = 34582

const val GL_DT_BIAS_NV: Int = 34583

const val GL_MAGNITUDE_BIAS_NV: Int = 34584

const val GL_VIBRANCE_BIAS_NV: Int = 34585

const val GL_TEXTURE_BORDER_VALUES_NV: Int = 34586

const val GL_TEXTURE_HI_SIZE_NV: Int = 34587

const val GL_TEXTURE_LO_SIZE_NV: Int = 34588

const val GL_TEXTURE_DS_SIZE_NV: Int = 34589

const val GL_TEXTURE_DT_SIZE_NV: Int = 34590

const val GL_TEXTURE_MAG_SIZE_NV: Int = 34591

const val GL_NV_texture_shader2: Int = 1

const val GL_DOT_PRODUCT_TEXTURE_3D_NV: Int = 34543

const val GL_NV_texture_shader3: Int = 1

const val GL_OFFSET_PROJECTIVE_TEXTURE_2D_NV: Int = 34896

const val GL_OFFSET_PROJECTIVE_TEXTURE_2D_SCALE_NV: Int = 34897

const val GL_OFFSET_PROJECTIVE_TEXTURE_RECTANGLE_NV: Int = 34898

const val GL_OFFSET_PROJECTIVE_TEXTURE_RECTANGLE_SCALE_NV: Int = 34899

const val GL_OFFSET_HILO_TEXTURE_2D_NV: Int = 34900

const val GL_OFFSET_HILO_TEXTURE_RECTANGLE_NV: Int = 34901

const val GL_OFFSET_HILO_PROJECTIVE_TEXTURE_2D_NV: Int = 34902

const val GL_OFFSET_HILO_PROJECTIVE_TEXTURE_RECTANGLE_NV: Int = 34903

const val GL_DEPENDENT_HILO_TEXTURE_2D_NV: Int = 34904

const val GL_DEPENDENT_RGB_TEXTURE_3D_NV: Int = 34905

const val GL_DEPENDENT_RGB_TEXTURE_CUBE_MAP_NV: Int = 34906

const val GL_DOT_PRODUCT_PASS_THROUGH_NV: Int = 34907

const val GL_DOT_PRODUCT_TEXTURE_1D_NV: Int = 34908

const val GL_DOT_PRODUCT_AFFINE_DEPTH_REPLACE_NV: Int = 34909

const val GL_HILO8_NV: Int = 34910

const val GL_SIGNED_HILO8_NV: Int = 34911

const val GL_FORCE_BLUE_TO_ONE_NV: Int = 34912

const val GL_NV_transform_feedback: Int = 1

const val GL_BACK_PRIMARY_COLOR_NV: Int = 35959

const val GL_BACK_SECONDARY_COLOR_NV: Int = 35960

const val GL_TEXTURE_COORD_NV: Int = 35961

const val GL_CLIP_DISTANCE_NV: Int = 35962

const val GL_VERTEX_ID_NV: Int = 35963

const val GL_PRIMITIVE_ID_NV: Int = 35964

const val GL_GENERIC_ATTRIB_NV: Int = 35965

const val GL_TRANSFORM_FEEDBACK_ATTRIBS_NV: Int = 35966

const val GL_TRANSFORM_FEEDBACK_BUFFER_MODE_NV: Int = 35967

const val GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS_NV: Int = 35968

const val GL_ACTIVE_VARYINGS_NV: Int = 35969

const val GL_ACTIVE_VARYING_MAX_LENGTH_NV: Int = 35970

const val GL_TRANSFORM_FEEDBACK_VARYINGS_NV: Int = 35971

const val GL_TRANSFORM_FEEDBACK_BUFFER_START_NV: Int = 35972

const val GL_TRANSFORM_FEEDBACK_BUFFER_SIZE_NV: Int = 35973

const val GL_TRANSFORM_FEEDBACK_RECORD_NV: Int = 35974

const val GL_PRIMITIVES_GENERATED_NV: Int = 35975

const val GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN_NV: Int = 35976

const val GL_RASTERIZER_DISCARD_NV: Int = 35977

const val GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS_NV: Int = 35978

const val GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS_NV: Int = 35979

const val GL_INTERLEAVED_ATTRIBS_NV: Int = 35980

const val GL_SEPARATE_ATTRIBS_NV: Int = 35981

const val GL_TRANSFORM_FEEDBACK_BUFFER_NV: Int = 35982

const val GL_TRANSFORM_FEEDBACK_BUFFER_BINDING_NV: Int = 35983

const val GL_LAYER_NV: Int = 36266

const val GL_NEXT_BUFFER_NV: Int = -2

const val GL_SKIP_COMPONENTS4_NV: Int = -3

const val GL_SKIP_COMPONENTS3_NV: Int = -4

const val GL_SKIP_COMPONENTS2_NV: Int = -5

const val GL_SKIP_COMPONENTS1_NV: Int = -6

const val GL_NV_transform_feedback2: Int = 1

const val GL_TRANSFORM_FEEDBACK_NV: Int = 36386

const val GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED_NV: Int = 36387

const val GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE_NV: Int = 36388

const val GL_TRANSFORM_FEEDBACK_BINDING_NV: Int = 36389

const val GL_NV_uniform_buffer_unified_memory: Int = 1

const val GL_UNIFORM_BUFFER_UNIFIED_NV: Int = 37742

const val GL_UNIFORM_BUFFER_ADDRESS_NV: Int = 37743

const val GL_UNIFORM_BUFFER_LENGTH_NV: Int = 37744

const val GL_NV_vdpau_interop: Int = 1

const val GL_SURFACE_STATE_NV: Int = 34539

const val GL_SURFACE_REGISTERED_NV: Int = 34557

const val GL_SURFACE_MAPPED_NV: Int = 34560

const val GL_WRITE_DISCARD_NV: Int = 35006

const val GL_NV_vertex_array_range: Int = 1

const val GL_VERTEX_ARRAY_RANGE_NV: Int = 34077

const val GL_VERTEX_ARRAY_RANGE_LENGTH_NV: Int = 34078

const val GL_VERTEX_ARRAY_RANGE_VALID_NV: Int = 34079

const val GL_MAX_VERTEX_ARRAY_RANGE_ELEMENT_NV: Int = 34080

const val GL_VERTEX_ARRAY_RANGE_POINTER_NV: Int = 34081

const val GL_NV_vertex_array_range2: Int = 1

const val GL_VERTEX_ARRAY_RANGE_WITHOUT_FLUSH_NV: Int = 34099

const val GL_NV_vertex_attrib_integer_64bit: Int = 1

const val GL_NV_vertex_buffer_unified_memory: Int = 1

const val GL_VERTEX_ATTRIB_ARRAY_UNIFIED_NV: Int = 36638

const val GL_ELEMENT_ARRAY_UNIFIED_NV: Int = 36639

const val GL_VERTEX_ATTRIB_ARRAY_ADDRESS_NV: Int = 36640

const val GL_VERTEX_ARRAY_ADDRESS_NV: Int = 36641

const val GL_NORMAL_ARRAY_ADDRESS_NV: Int = 36642

const val GL_COLOR_ARRAY_ADDRESS_NV: Int = 36643

const val GL_INDEX_ARRAY_ADDRESS_NV: Int = 36644

const val GL_TEXTURE_COORD_ARRAY_ADDRESS_NV: Int = 36645

const val GL_EDGE_FLAG_ARRAY_ADDRESS_NV: Int = 36646

const val GL_SECONDARY_COLOR_ARRAY_ADDRESS_NV: Int = 36647

const val GL_FOG_COORD_ARRAY_ADDRESS_NV: Int = 36648

const val GL_ELEMENT_ARRAY_ADDRESS_NV: Int = 36649

const val GL_VERTEX_ATTRIB_ARRAY_LENGTH_NV: Int = 36650

const val GL_VERTEX_ARRAY_LENGTH_NV: Int = 36651

const val GL_NORMAL_ARRAY_LENGTH_NV: Int = 36652

const val GL_COLOR_ARRAY_LENGTH_NV: Int = 36653

const val GL_INDEX_ARRAY_LENGTH_NV: Int = 36654

const val GL_TEXTURE_COORD_ARRAY_LENGTH_NV: Int = 36655

const val GL_EDGE_FLAG_ARRAY_LENGTH_NV: Int = 36656

const val GL_SECONDARY_COLOR_ARRAY_LENGTH_NV: Int = 36657

const val GL_FOG_COORD_ARRAY_LENGTH_NV: Int = 36658

const val GL_ELEMENT_ARRAY_LENGTH_NV: Int = 36659

const val GL_DRAW_INDIRECT_UNIFIED_NV: Int = 36672

const val GL_DRAW_INDIRECT_ADDRESS_NV: Int = 36673

const val GL_DRAW_INDIRECT_LENGTH_NV: Int = 36674

const val GL_NV_vertex_program: Int = 1

const val GL_VERTEX_PROGRAM_NV: Int = 34336

const val GL_VERTEX_STATE_PROGRAM_NV: Int = 34337

const val GL_ATTRIB_ARRAY_SIZE_NV: Int = 34339

const val GL_ATTRIB_ARRAY_STRIDE_NV: Int = 34340

const val GL_ATTRIB_ARRAY_TYPE_NV: Int = 34341

const val GL_CURRENT_ATTRIB_NV: Int = 34342

const val GL_PROGRAM_LENGTH_NV: Int = 34343

const val GL_PROGRAM_STRING_NV: Int = 34344

const val GL_MODELVIEW_PROJECTION_NV: Int = 34345

const val GL_IDENTITY_NV: Int = 34346

const val GL_INVERSE_NV: Int = 34347

const val GL_TRANSPOSE_NV: Int = 34348

const val GL_INVERSE_TRANSPOSE_NV: Int = 34349

const val GL_MAX_TRACK_MATRIX_STACK_DEPTH_NV: Int = 34350

const val GL_MAX_TRACK_MATRICES_NV: Int = 34351

const val GL_MATRIX0_NV: Int = 34352

const val GL_MATRIX1_NV: Int = 34353

const val GL_MATRIX2_NV: Int = 34354

const val GL_MATRIX3_NV: Int = 34355

const val GL_MATRIX4_NV: Int = 34356

const val GL_MATRIX5_NV: Int = 34357

const val GL_MATRIX6_NV: Int = 34358

const val GL_MATRIX7_NV: Int = 34359

const val GL_CURRENT_MATRIX_STACK_DEPTH_NV: Int = 34368

const val GL_CURRENT_MATRIX_NV: Int = 34369

const val GL_VERTEX_PROGRAM_POINT_SIZE_NV: Int = 34370

const val GL_VERTEX_PROGRAM_TWO_SIDE_NV: Int = 34371

const val GL_PROGRAM_PARAMETER_NV: Int = 34372

const val GL_ATTRIB_ARRAY_POINTER_NV: Int = 34373

const val GL_PROGRAM_TARGET_NV: Int = 34374

const val GL_PROGRAM_RESIDENT_NV: Int = 34375

const val GL_TRACK_MATRIX_NV: Int = 34376

const val GL_TRACK_MATRIX_TRANSFORM_NV: Int = 34377

const val GL_VERTEX_PROGRAM_BINDING_NV: Int = 34378

const val GL_PROGRAM_ERROR_POSITION_NV: Int = 34379

const val GL_VERTEX_ATTRIB_ARRAY0_NV: Int = 34384

const val GL_VERTEX_ATTRIB_ARRAY1_NV: Int = 34385

const val GL_VERTEX_ATTRIB_ARRAY2_NV: Int = 34386

const val GL_VERTEX_ATTRIB_ARRAY3_NV: Int = 34387

const val GL_VERTEX_ATTRIB_ARRAY4_NV: Int = 34388

const val GL_VERTEX_ATTRIB_ARRAY5_NV: Int = 34389

const val GL_VERTEX_ATTRIB_ARRAY6_NV: Int = 34390

const val GL_VERTEX_ATTRIB_ARRAY7_NV: Int = 34391

const val GL_VERTEX_ATTRIB_ARRAY8_NV: Int = 34392

const val GL_VERTEX_ATTRIB_ARRAY9_NV: Int = 34393

const val GL_VERTEX_ATTRIB_ARRAY10_NV: Int = 34394

const val GL_VERTEX_ATTRIB_ARRAY11_NV: Int = 34395

const val GL_VERTEX_ATTRIB_ARRAY12_NV: Int = 34396

const val GL_VERTEX_ATTRIB_ARRAY13_NV: Int = 34397

const val GL_VERTEX_ATTRIB_ARRAY14_NV: Int = 34398

const val GL_VERTEX_ATTRIB_ARRAY15_NV: Int = 34399

const val GL_MAP1_VERTEX_ATTRIB0_4_NV: Int = 34400

const val GL_MAP1_VERTEX_ATTRIB1_4_NV: Int = 34401

const val GL_MAP1_VERTEX_ATTRIB2_4_NV: Int = 34402

const val GL_MAP1_VERTEX_ATTRIB3_4_NV: Int = 34403

const val GL_MAP1_VERTEX_ATTRIB4_4_NV: Int = 34404

const val GL_MAP1_VERTEX_ATTRIB5_4_NV: Int = 34405

const val GL_MAP1_VERTEX_ATTRIB6_4_NV: Int = 34406

const val GL_MAP1_VERTEX_ATTRIB7_4_NV: Int = 34407

const val GL_MAP1_VERTEX_ATTRIB8_4_NV: Int = 34408

const val GL_MAP1_VERTEX_ATTRIB9_4_NV: Int = 34409

const val GL_MAP1_VERTEX_ATTRIB10_4_NV: Int = 34410

const val GL_MAP1_VERTEX_ATTRIB11_4_NV: Int = 34411

const val GL_MAP1_VERTEX_ATTRIB12_4_NV: Int = 34412

const val GL_MAP1_VERTEX_ATTRIB13_4_NV: Int = 34413

const val GL_MAP1_VERTEX_ATTRIB14_4_NV: Int = 34414

const val GL_MAP1_VERTEX_ATTRIB15_4_NV: Int = 34415

const val GL_MAP2_VERTEX_ATTRIB0_4_NV: Int = 34416

const val GL_MAP2_VERTEX_ATTRIB1_4_NV: Int = 34417

const val GL_MAP2_VERTEX_ATTRIB2_4_NV: Int = 34418

const val GL_MAP2_VERTEX_ATTRIB3_4_NV: Int = 34419

const val GL_MAP2_VERTEX_ATTRIB4_4_NV: Int = 34420

const val GL_MAP2_VERTEX_ATTRIB5_4_NV: Int = 34421

const val GL_MAP2_VERTEX_ATTRIB6_4_NV: Int = 34422

const val GL_MAP2_VERTEX_ATTRIB7_4_NV: Int = 34423

const val GL_MAP2_VERTEX_ATTRIB8_4_NV: Int = 34424

const val GL_MAP2_VERTEX_ATTRIB9_4_NV: Int = 34425

const val GL_MAP2_VERTEX_ATTRIB10_4_NV: Int = 34426

const val GL_MAP2_VERTEX_ATTRIB11_4_NV: Int = 34427

const val GL_MAP2_VERTEX_ATTRIB12_4_NV: Int = 34428

const val GL_MAP2_VERTEX_ATTRIB13_4_NV: Int = 34429

const val GL_MAP2_VERTEX_ATTRIB14_4_NV: Int = 34430

const val GL_MAP2_VERTEX_ATTRIB15_4_NV: Int = 34431

const val GL_NV_vertex_program1_1: Int = 1

const val GL_NV_vertex_program2: Int = 1

const val GL_NV_vertex_program2_option: Int = 1

const val GL_NV_vertex_program3: Int = 1

const val GL_NV_vertex_program4: Int = 1

const val GL_VERTEX_ATTRIB_ARRAY_INTEGER_NV: Int = 35069

const val GL_NV_video_capture: Int = 1

const val GL_VIDEO_BUFFER_NV: Int = 36896

const val GL_VIDEO_BUFFER_BINDING_NV: Int = 36897

const val GL_FIELD_UPPER_NV: Int = 36898

const val GL_FIELD_LOWER_NV: Int = 36899

const val GL_NUM_VIDEO_CAPTURE_STREAMS_NV: Int = 36900

const val GL_NEXT_VIDEO_CAPTURE_BUFFER_STATUS_NV: Int = 36901

const val GL_VIDEO_CAPTURE_TO_422_SUPPORTED_NV: Int = 36902

const val GL_LAST_VIDEO_CAPTURE_STATUS_NV: Int = 36903

const val GL_VIDEO_BUFFER_PITCH_NV: Int = 36904

const val GL_VIDEO_COLOR_CONVERSION_MATRIX_NV: Int = 36905

const val GL_VIDEO_COLOR_CONVERSION_MAX_NV: Int = 36906

const val GL_VIDEO_COLOR_CONVERSION_MIN_NV: Int = 36907

const val GL_VIDEO_COLOR_CONVERSION_OFFSET_NV: Int = 36908

const val GL_VIDEO_BUFFER_INTERNAL_FORMAT_NV: Int = 36909

const val GL_PARTIAL_SUCCESS_NV: Int = 36910

const val GL_SUCCESS_NV: Int = 36911

const val GL_FAILURE_NV: Int = 36912

const val GL_YCBYCR8_422_NV: Int = 36913

const val GL_YCBAYCR8A_4224_NV: Int = 36914

const val GL_Z6Y10Z6CB10Z6Y10Z6CR10_422_NV: Int = 36915

const val GL_Z6Y10Z6CB10Z6A10Z6Y10Z6CR10Z6A10_4224_NV: Int = 36916

const val GL_Z4Y12Z4CB12Z4Y12Z4CR12_422_NV: Int = 36917

const val GL_Z4Y12Z4CB12Z4A12Z4Y12Z4CR12Z4A12_4224_NV: Int = 36918

const val GL_Z4Y12Z4CB12Z4CR12_444_NV: Int = 36919

const val GL_VIDEO_CAPTURE_FRAME_WIDTH_NV: Int = 36920

const val GL_VIDEO_CAPTURE_FRAME_HEIGHT_NV: Int = 36921

const val GL_VIDEO_CAPTURE_FIELD_UPPER_HEIGHT_NV: Int = 36922

const val GL_VIDEO_CAPTURE_FIELD_LOWER_HEIGHT_NV: Int = 36923

const val GL_VIDEO_CAPTURE_SURFACE_ORIGIN_NV: Int = 36924

const val GL_NV_viewport_array2: Int = 1

const val GL_NV_viewport_swizzle: Int = 1

const val GL_VIEWPORT_SWIZZLE_POSITIVE_X_NV: Int = 37712

const val GL_VIEWPORT_SWIZZLE_NEGATIVE_X_NV: Int = 37713

const val GL_VIEWPORT_SWIZZLE_POSITIVE_Y_NV: Int = 37714

const val GL_VIEWPORT_SWIZZLE_NEGATIVE_Y_NV: Int = 37715

const val GL_VIEWPORT_SWIZZLE_POSITIVE_Z_NV: Int = 37716

const val GL_VIEWPORT_SWIZZLE_NEGATIVE_Z_NV: Int = 37717

const val GL_VIEWPORT_SWIZZLE_POSITIVE_W_NV: Int = 37718

const val GL_VIEWPORT_SWIZZLE_NEGATIVE_W_NV: Int = 37719

const val GL_VIEWPORT_SWIZZLE_X_NV: Int = 37720

const val GL_VIEWPORT_SWIZZLE_Y_NV: Int = 37721

const val GL_VIEWPORT_SWIZZLE_Z_NV: Int = 37722

const val GL_VIEWPORT_SWIZZLE_W_NV: Int = 37723

const val GL_OML_interlace: Int = 1

const val GL_INTERLACE_OML: Int = 35200

const val GL_INTERLACE_READ_OML: Int = 35201

const val GL_OML_resample: Int = 1

const val GL_PACK_RESAMPLE_OML: Int = 35204

const val GL_UNPACK_RESAMPLE_OML: Int = 35205

const val GL_RESAMPLE_REPLICATE_OML: Int = 35206

const val GL_RESAMPLE_ZERO_FILL_OML: Int = 35207

const val GL_RESAMPLE_AVERAGE_OML: Int = 35208

const val GL_RESAMPLE_DECIMATE_OML: Int = 35209

const val GL_OML_subsample: Int = 1

const val GL_FORMAT_SUBSAMPLE_24_24_OML: Int = 35202

const val GL_FORMAT_SUBSAMPLE_244_244_OML: Int = 35203

const val GL_OVR_multiview: Int = 1

const val GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_NUM_VIEWS_OVR: Int = 38448

const val GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_BASE_VIEW_INDEX_OVR: Int = 38450

const val GL_MAX_VIEWS_OVR: Int = 38449

const val GL_FRAMEBUFFER_INCOMPLETE_VIEW_TARGETS_OVR: Int = 38451

const val GL_OVR_multiview2: Int = 1

const val GL_PGI_misc_hints: Int = 1

const val GL_PREFER_DOUBLEBUFFER_HINT_PGI: Int = 107000

const val GL_CONSERVE_MEMORY_HINT_PGI: Int = 107005

const val GL_RECLAIM_MEMORY_HINT_PGI: Int = 107006

const val GL_NATIVE_GRAPHICS_HANDLE_PGI: Int = 107010

const val GL_NATIVE_GRAPHICS_BEGIN_HINT_PGI: Int = 107011

const val GL_NATIVE_GRAPHICS_END_HINT_PGI: Int = 107012

const val GL_ALWAYS_FAST_HINT_PGI: Int = 107020

const val GL_ALWAYS_SOFT_HINT_PGI: Int = 107021

const val GL_ALLOW_DRAW_OBJ_HINT_PGI: Int = 107022

const val GL_ALLOW_DRAW_WIN_HINT_PGI: Int = 107023

const val GL_ALLOW_DRAW_FRG_HINT_PGI: Int = 107024

const val GL_ALLOW_DRAW_MEM_HINT_PGI: Int = 107025

const val GL_STRICT_DEPTHFUNC_HINT_PGI: Int = 107030

const val GL_STRICT_LIGHTING_HINT_PGI: Int = 107031

const val GL_STRICT_SCISSOR_HINT_PGI: Int = 107032

const val GL_FULL_STIPPLE_HINT_PGI: Int = 107033

const val GL_CLIP_NEAR_HINT_PGI: Int = 107040

const val GL_CLIP_FAR_HINT_PGI: Int = 107041

const val GL_WIDE_LINE_HINT_PGI: Int = 107042

const val GL_BACK_NORMALS_HINT_PGI: Int = 107043

const val GL_PGI_vertex_hints: Int = 1

const val GL_VERTEX_DATA_HINT_PGI: Int = 107050

const val GL_VERTEX_CONSISTENT_HINT_PGI: Int = 107051

const val GL_MATERIAL_SIDE_HINT_PGI: Int = 107052

const val GL_MAX_VERTEX_HINT_PGI: Int = 107053

const val GL_COLOR3_BIT_PGI: Int = 65536

const val GL_COLOR4_BIT_PGI: Int = 131072

const val GL_EDGEFLAG_BIT_PGI: Int = 262144

const val GL_INDEX_BIT_PGI: Int = 524288

const val GL_MAT_AMBIENT_BIT_PGI: Int = 1048576

const val GL_MAT_AMBIENT_AND_DIFFUSE_BIT_PGI: Int = 2097152

const val GL_MAT_DIFFUSE_BIT_PGI: Int = 4194304

const val GL_MAT_EMISSION_BIT_PGI: Int = 8388608

const val GL_MAT_COLOR_INDEXES_BIT_PGI: Int = 16777216

const val GL_MAT_SHININESS_BIT_PGI: Int = 33554432

const val GL_MAT_SPECULAR_BIT_PGI: Int = 67108864

const val GL_NORMAL_BIT_PGI: Int = 134217728

const val GL_TEXCOORD1_BIT_PGI: Int = 268435456

const val GL_TEXCOORD2_BIT_PGI: Int = 536870912

const val GL_TEXCOORD3_BIT_PGI: Int = 1073741824

const val GL_TEXCOORD4_BIT_PGI: UInt = 2147483648u

const val GL_VERTEX23_BIT_PGI: Int = 4

const val GL_VERTEX4_BIT_PGI: Int = 8

const val GL_REND_screen_coordinates: Int = 1

const val GL_SCREEN_COORDINATES_REND: Int = 33936

const val GL_INVERTED_SCREEN_W_REND: Int = 33937

const val GL_S3_s3tc: Int = 1

const val GL_RGB_S3TC: Int = 33696

const val GL_RGB4_S3TC: Int = 33697

const val GL_RGBA_S3TC: Int = 33698

const val GL_RGBA4_S3TC: Int = 33699

const val GL_RGBA_DXT5_S3TC: Int = 33700

const val GL_RGBA4_DXT5_S3TC: Int = 33701

const val GL_SGIS_detail_texture: Int = 1

const val GL_DETAIL_TEXTURE_2D_SGIS: Int = 32917

const val GL_DETAIL_TEXTURE_2D_BINDING_SGIS: Int = 32918

const val GL_LINEAR_DETAIL_SGIS: Int = 32919

const val GL_LINEAR_DETAIL_ALPHA_SGIS: Int = 32920

const val GL_LINEAR_DETAIL_COLOR_SGIS: Int = 32921

const val GL_DETAIL_TEXTURE_LEVEL_SGIS: Int = 32922

const val GL_DETAIL_TEXTURE_MODE_SGIS: Int = 32923

const val GL_DETAIL_TEXTURE_FUNC_POINTS_SGIS: Int = 32924

const val GL_SGIS_fog_function: Int = 1

const val GL_FOG_FUNC_SGIS: Int = 33066

const val GL_FOG_FUNC_POINTS_SGIS: Int = 33067

const val GL_MAX_FOG_FUNC_POINTS_SGIS: Int = 33068

const val GL_SGIS_generate_mipmap: Int = 1

const val GL_GENERATE_MIPMAP_SGIS: Int = 33169

const val GL_GENERATE_MIPMAP_HINT_SGIS: Int = 33170

const val GL_SGIS_multisample: Int = 1

const val GL_MULTISAMPLE_SGIS: Int = 32925

const val GL_SAMPLE_ALPHA_TO_MASK_SGIS: Int = 32926

const val GL_SAMPLE_ALPHA_TO_ONE_SGIS: Int = 32927

const val GL_SAMPLE_MASK_SGIS: Int = 32928

const val GL_1PASS_SGIS: Int = 32929

const val GL_2PASS_0_SGIS: Int = 32930

const val GL_2PASS_1_SGIS: Int = 32931

const val GL_4PASS_0_SGIS: Int = 32932

const val GL_4PASS_1_SGIS: Int = 32933

const val GL_4PASS_2_SGIS: Int = 32934

const val GL_4PASS_3_SGIS: Int = 32935

const val GL_SAMPLE_BUFFERS_SGIS: Int = 32936

const val GL_SAMPLES_SGIS: Int = 32937

const val GL_SAMPLE_MASK_VALUE_SGIS: Int = 32938

const val GL_SAMPLE_MASK_INVERT_SGIS: Int = 32939

const val GL_SAMPLE_PATTERN_SGIS: Int = 32940

const val GL_SGIS_pixel_texture: Int = 1

const val GL_PIXEL_TEXTURE_SGIS: Int = 33619

const val GL_PIXEL_FRAGMENT_RGB_SOURCE_SGIS: Int = 33620

const val GL_PIXEL_FRAGMENT_ALPHA_SOURCE_SGIS: Int = 33621

const val GL_PIXEL_GROUP_COLOR_SGIS: Int = 33622

const val GL_SGIS_point_line_texgen: Int = 1

const val GL_EYE_DISTANCE_TO_POINT_SGIS: Int = 33264

const val GL_OBJECT_DISTANCE_TO_POINT_SGIS: Int = 33265

const val GL_EYE_DISTANCE_TO_LINE_SGIS: Int = 33266

const val GL_OBJECT_DISTANCE_TO_LINE_SGIS: Int = 33267

const val GL_EYE_POINT_SGIS: Int = 33268

const val GL_OBJECT_POINT_SGIS: Int = 33269

const val GL_EYE_LINE_SGIS: Int = 33270

const val GL_OBJECT_LINE_SGIS: Int = 33271

const val GL_SGIS_point_parameters: Int = 1

const val GL_POINT_SIZE_MIN_SGIS: Int = 33062

const val GL_POINT_SIZE_MAX_SGIS: Int = 33063

const val GL_POINT_FADE_THRESHOLD_SIZE_SGIS: Int = 33064

const val GL_DISTANCE_ATTENUATION_SGIS: Int = 33065

const val GL_SGIS_sharpen_texture: Int = 1

const val GL_LINEAR_SHARPEN_SGIS: Int = 32941

const val GL_LINEAR_SHARPEN_ALPHA_SGIS: Int = 32942

const val GL_LINEAR_SHARPEN_COLOR_SGIS: Int = 32943

const val GL_SHARPEN_TEXTURE_FUNC_POINTS_SGIS: Int = 32944

const val GL_SGIS_texture4D: Int = 1

const val GL_PACK_SKIP_VOLUMES_SGIS: Int = 33072

const val GL_PACK_IMAGE_DEPTH_SGIS: Int = 33073

const val GL_UNPACK_SKIP_VOLUMES_SGIS: Int = 33074

const val GL_UNPACK_IMAGE_DEPTH_SGIS: Int = 33075

const val GL_TEXTURE_4D_SGIS: Int = 33076

const val GL_PROXY_TEXTURE_4D_SGIS: Int = 33077

const val GL_TEXTURE_4DSIZE_SGIS: Int = 33078

const val GL_TEXTURE_WRAP_Q_SGIS: Int = 33079

const val GL_MAX_4D_TEXTURE_SIZE_SGIS: Int = 33080

const val GL_TEXTURE_4D_BINDING_SGIS: Int = 33103

const val GL_SGIS_texture_border_clamp: Int = 1

const val GL_CLAMP_TO_BORDER_SGIS: Int = 33069

const val GL_SGIS_texture_color_mask: Int = 1

const val GL_TEXTURE_COLOR_WRITEMASK_SGIS: Int = 33263

const val GL_SGIS_texture_edge_clamp: Int = 1

const val GL_CLAMP_TO_EDGE_SGIS: Int = 33071

const val GL_SGIS_texture_filter4: Int = 1

const val GL_FILTER4_SGIS: Int = 33094

const val GL_TEXTURE_FILTER4_SIZE_SGIS: Int = 33095

const val GL_SGIS_texture_lod: Int = 1

const val GL_TEXTURE_MIN_LOD_SGIS: Int = 33082

const val GL_TEXTURE_MAX_LOD_SGIS: Int = 33083

const val GL_TEXTURE_BASE_LEVEL_SGIS: Int = 33084

const val GL_TEXTURE_MAX_LEVEL_SGIS: Int = 33085

const val GL_SGIS_texture_select: Int = 1

const val GL_DUAL_ALPHA4_SGIS: Int = 33040

const val GL_DUAL_ALPHA8_SGIS: Int = 33041

const val GL_DUAL_ALPHA12_SGIS: Int = 33042

const val GL_DUAL_ALPHA16_SGIS: Int = 33043

const val GL_DUAL_LUMINANCE4_SGIS: Int = 33044

const val GL_DUAL_LUMINANCE8_SGIS: Int = 33045

const val GL_DUAL_LUMINANCE12_SGIS: Int = 33046

const val GL_DUAL_LUMINANCE16_SGIS: Int = 33047

const val GL_DUAL_INTENSITY4_SGIS: Int = 33048

const val GL_DUAL_INTENSITY8_SGIS: Int = 33049

const val GL_DUAL_INTENSITY12_SGIS: Int = 33050

const val GL_DUAL_INTENSITY16_SGIS: Int = 33051

const val GL_DUAL_LUMINANCE_ALPHA4_SGIS: Int = 33052

const val GL_DUAL_LUMINANCE_ALPHA8_SGIS: Int = 33053

const val GL_QUAD_ALPHA4_SGIS: Int = 33054

const val GL_QUAD_ALPHA8_SGIS: Int = 33055

const val GL_QUAD_LUMINANCE4_SGIS: Int = 33056

const val GL_QUAD_LUMINANCE8_SGIS: Int = 33057

const val GL_QUAD_INTENSITY4_SGIS: Int = 33058

const val GL_QUAD_INTENSITY8_SGIS: Int = 33059

const val GL_DUAL_TEXTURE_SELECT_SGIS: Int = 33060

const val GL_QUAD_TEXTURE_SELECT_SGIS: Int = 33061

const val GL_SGIX_async: Int = 1

const val GL_ASYNC_MARKER_SGIX: Int = 33577

const val GL_SGIX_async_histogram: Int = 1

const val GL_ASYNC_HISTOGRAM_SGIX: Int = 33580

const val GL_MAX_ASYNC_HISTOGRAM_SGIX: Int = 33581

const val GL_SGIX_async_pixel: Int = 1

const val GL_ASYNC_TEX_IMAGE_SGIX: Int = 33628

const val GL_ASYNC_DRAW_PIXELS_SGIX: Int = 33629

const val GL_ASYNC_READ_PIXELS_SGIX: Int = 33630

const val GL_MAX_ASYNC_TEX_IMAGE_SGIX: Int = 33631

const val GL_MAX_ASYNC_DRAW_PIXELS_SGIX: Int = 33632

const val GL_MAX_ASYNC_READ_PIXELS_SGIX: Int = 33633

const val GL_SGIX_blend_alpha_minmax: Int = 1

const val GL_ALPHA_MIN_SGIX: Int = 33568

const val GL_ALPHA_MAX_SGIX: Int = 33569

const val GL_SGIX_calligraphic_fragment: Int = 1

const val GL_CALLIGRAPHIC_FRAGMENT_SGIX: Int = 33155

const val GL_SGIX_clipmap: Int = 1

const val GL_LINEAR_CLIPMAP_LINEAR_SGIX: Int = 33136

const val GL_TEXTURE_CLIPMAP_CENTER_SGIX: Int = 33137

const val GL_TEXTURE_CLIPMAP_FRAME_SGIX: Int = 33138

const val GL_TEXTURE_CLIPMAP_OFFSET_SGIX: Int = 33139

const val GL_TEXTURE_CLIPMAP_VIRTUAL_DEPTH_SGIX: Int = 33140

const val GL_TEXTURE_CLIPMAP_LOD_OFFSET_SGIX: Int = 33141

const val GL_TEXTURE_CLIPMAP_DEPTH_SGIX: Int = 33142

const val GL_MAX_CLIPMAP_DEPTH_SGIX: Int = 33143

const val GL_MAX_CLIPMAP_VIRTUAL_DEPTH_SGIX: Int = 33144

const val GL_NEAREST_CLIPMAP_NEAREST_SGIX: Int = 33869

const val GL_NEAREST_CLIPMAP_LINEAR_SGIX: Int = 33870

const val GL_LINEAR_CLIPMAP_NEAREST_SGIX: Int = 33871

const val GL_SGIX_convolution_accuracy: Int = 1

const val GL_CONVOLUTION_HINT_SGIX: Int = 33558

const val GL_SGIX_depth_pass_instrument: Int = 1

const val GL_SGIX_depth_texture: Int = 1

const val GL_DEPTH_COMPONENT16_SGIX: Int = 33189

const val GL_DEPTH_COMPONENT24_SGIX: Int = 33190

const val GL_DEPTH_COMPONENT32_SGIX: Int = 33191

const val GL_SGIX_flush_raster: Int = 1

const val GL_SGIX_fog_offset: Int = 1

const val GL_FOG_OFFSET_SGIX: Int = 33176

const val GL_FOG_OFFSET_VALUE_SGIX: Int = 33177

const val GL_SGIX_fragment_lighting: Int = 1

const val GL_FRAGMENT_LIGHTING_SGIX: Int = 33792

const val GL_FRAGMENT_COLOR_MATERIAL_SGIX: Int = 33793

const val GL_FRAGMENT_COLOR_MATERIAL_FACE_SGIX: Int = 33794

const val GL_FRAGMENT_COLOR_MATERIAL_PARAMETER_SGIX: Int = 33795

const val GL_MAX_FRAGMENT_LIGHTS_SGIX: Int = 33796

const val GL_MAX_ACTIVE_LIGHTS_SGIX: Int = 33797

const val GL_CURRENT_RASTER_NORMAL_SGIX: Int = 33798

const val GL_LIGHT_ENV_MODE_SGIX: Int = 33799

const val GL_FRAGMENT_LIGHT_MODEL_LOCAL_VIEWER_SGIX: Int = 33800

const val GL_FRAGMENT_LIGHT_MODEL_TWO_SIDE_SGIX: Int = 33801

const val GL_FRAGMENT_LIGHT_MODEL_AMBIENT_SGIX: Int = 33802

const val GL_FRAGMENT_LIGHT_MODEL_NORMAL_INTERPOLATION_SGIX: Int = 33803

const val GL_FRAGMENT_LIGHT0_SGIX: Int = 33804

const val GL_FRAGMENT_LIGHT1_SGIX: Int = 33805

const val GL_FRAGMENT_LIGHT2_SGIX: Int = 33806

const val GL_FRAGMENT_LIGHT3_SGIX: Int = 33807

const val GL_FRAGMENT_LIGHT4_SGIX: Int = 33808

const val GL_FRAGMENT_LIGHT5_SGIX: Int = 33809

const val GL_FRAGMENT_LIGHT6_SGIX: Int = 33810

const val GL_FRAGMENT_LIGHT7_SGIX: Int = 33811

const val GL_SGIX_framezoom: Int = 1

const val GL_FRAMEZOOM_SGIX: Int = 33163

const val GL_FRAMEZOOM_FACTOR_SGIX: Int = 33164

const val GL_MAX_FRAMEZOOM_FACTOR_SGIX: Int = 33165

const val GL_SGIX_igloo_interface: Int = 1

const val GL_SGIX_instruments: Int = 1

const val GL_INSTRUMENT_BUFFER_POINTER_SGIX: Int = 33152

const val GL_INSTRUMENT_MEASUREMENTS_SGIX: Int = 33153

const val GL_SGIX_interlace: Int = 1

const val GL_INTERLACE_SGIX: Int = 32916

const val GL_SGIX_ir_instrument1: Int = 1

const val GL_IR_INSTRUMENT1_SGIX: Int = 33151

const val GL_SGIX_list_priority: Int = 1

const val GL_LIST_PRIORITY_SGIX: Int = 33154

const val GL_SGIX_pixel_texture: Int = 1

const val GL_PIXEL_TEX_GEN_SGIX: Int = 33081

const val GL_PIXEL_TEX_GEN_MODE_SGIX: Int = 33579

const val GL_SGIX_pixel_tiles: Int = 1

const val GL_PIXEL_TILE_BEST_ALIGNMENT_SGIX: Int = 33086

const val GL_PIXEL_TILE_CACHE_INCREMENT_SGIX: Int = 33087

const val GL_PIXEL_TILE_WIDTH_SGIX: Int = 33088

const val GL_PIXEL_TILE_HEIGHT_SGIX: Int = 33089

const val GL_PIXEL_TILE_GRID_WIDTH_SGIX: Int = 33090

const val GL_PIXEL_TILE_GRID_HEIGHT_SGIX: Int = 33091

const val GL_PIXEL_TILE_GRID_DEPTH_SGIX: Int = 33092

const val GL_PIXEL_TILE_CACHE_SIZE_SGIX: Int = 33093

const val GL_SGIX_polynomial_ffd: Int = 1

const val GL_TEXTURE_DEFORMATION_BIT_SGIX: Int = 1

const val GL_GEOMETRY_DEFORMATION_BIT_SGIX: Int = 2

const val GL_GEOMETRY_DEFORMATION_SGIX: Int = 33172

const val GL_TEXTURE_DEFORMATION_SGIX: Int = 33173

const val GL_DEFORMATIONS_MASK_SGIX: Int = 33174

const val GL_MAX_DEFORMATION_ORDER_SGIX: Int = 33175

const val GL_SGIX_reference_plane: Int = 1

const val GL_REFERENCE_PLANE_SGIX: Int = 33149

const val GL_REFERENCE_PLANE_EQUATION_SGIX: Int = 33150

const val GL_SGIX_resample: Int = 1

const val GL_PACK_RESAMPLE_SGIX: Int = 33838

const val GL_UNPACK_RESAMPLE_SGIX: Int = 33839

const val GL_RESAMPLE_REPLICATE_SGIX: Int = 33843

const val GL_RESAMPLE_ZERO_FILL_SGIX: Int = 33844

const val GL_RESAMPLE_DECIMATE_SGIX: Int = 33840

const val GL_SGIX_scalebias_hint: Int = 1

const val GL_SCALEBIAS_HINT_SGIX: Int = 33570

const val GL_SGIX_shadow: Int = 1

const val GL_TEXTURE_COMPARE_SGIX: Int = 33178

const val GL_TEXTURE_COMPARE_OPERATOR_SGIX: Int = 33179

const val GL_TEXTURE_LEQUAL_R_SGIX: Int = 33180

const val GL_TEXTURE_GEQUAL_R_SGIX: Int = 33181

const val GL_SGIX_shadow_ambient: Int = 1

const val GL_SHADOW_AMBIENT_SGIX: Int = 32959

const val GL_SGIX_sprite: Int = 1

const val GL_SPRITE_SGIX: Int = 33096

const val GL_SPRITE_MODE_SGIX: Int = 33097

const val GL_SPRITE_AXIS_SGIX: Int = 33098

const val GL_SPRITE_TRANSLATION_SGIX: Int = 33099

const val GL_SPRITE_AXIAL_SGIX: Int = 33100

const val GL_SPRITE_OBJECT_ALIGNED_SGIX: Int = 33101

const val GL_SPRITE_EYE_ALIGNED_SGIX: Int = 33102

const val GL_SGIX_subsample: Int = 1

const val GL_PACK_SUBSAMPLE_RATE_SGIX: Int = 34208

const val GL_UNPACK_SUBSAMPLE_RATE_SGIX: Int = 34209

const val GL_PIXEL_SUBSAMPLE_4444_SGIX: Int = 34210

const val GL_PIXEL_SUBSAMPLE_2424_SGIX: Int = 34211

const val GL_PIXEL_SUBSAMPLE_4242_SGIX: Int = 34212

const val GL_SGIX_tag_sample_buffer: Int = 1

const val GL_SGIX_texture_add_env: Int = 1

const val GL_TEXTURE_ENV_BIAS_SGIX: Int = 32958

const val GL_SGIX_texture_coordinate_clamp: Int = 1

const val GL_TEXTURE_MAX_CLAMP_S_SGIX: Int = 33641

const val GL_TEXTURE_MAX_CLAMP_T_SGIX: Int = 33642

const val GL_TEXTURE_MAX_CLAMP_R_SGIX: Int = 33643

const val GL_SGIX_texture_lod_bias: Int = 1

const val GL_TEXTURE_LOD_BIAS_S_SGIX: Int = 33166

const val GL_TEXTURE_LOD_BIAS_T_SGIX: Int = 33167

const val GL_TEXTURE_LOD_BIAS_R_SGIX: Int = 33168

const val GL_SGIX_texture_multi_buffer: Int = 1

const val GL_TEXTURE_MULTI_BUFFER_HINT_SGIX: Int = 33070

const val GL_SGIX_texture_scale_bias: Int = 1

const val GL_POST_TEXTURE_FILTER_BIAS_SGIX: Int = 33145

const val GL_POST_TEXTURE_FILTER_SCALE_SGIX: Int = 33146

const val GL_POST_TEXTURE_FILTER_BIAS_RANGE_SGIX: Int = 33147

const val GL_POST_TEXTURE_FILTER_SCALE_RANGE_SGIX: Int = 33148

const val GL_SGIX_vertex_preclip: Int = 1

const val GL_VERTEX_PRECLIP_SGIX: Int = 33774

const val GL_VERTEX_PRECLIP_HINT_SGIX: Int = 33775

const val GL_SGIX_ycrcb: Int = 1

const val GL_YCRCB_422_SGIX: Int = 33211

const val GL_YCRCB_444_SGIX: Int = 33212

const val GL_SGIX_ycrcb_subsample: Int = 1

const val GL_SGIX_ycrcba: Int = 1

const val GL_YCRCB_SGIX: Int = 33560

const val GL_YCRCBA_SGIX: Int = 33561

const val GL_SGI_color_matrix: Int = 1

const val GL_COLOR_MATRIX_SGI: Int = 32945

const val GL_COLOR_MATRIX_STACK_DEPTH_SGI: Int = 32946

const val GL_MAX_COLOR_MATRIX_STACK_DEPTH_SGI: Int = 32947

const val GL_POST_COLOR_MATRIX_RED_SCALE_SGI: Int = 32948

const val GL_POST_COLOR_MATRIX_GREEN_SCALE_SGI: Int = 32949

const val GL_POST_COLOR_MATRIX_BLUE_SCALE_SGI: Int = 32950

const val GL_POST_COLOR_MATRIX_ALPHA_SCALE_SGI: Int = 32951

const val GL_POST_COLOR_MATRIX_RED_BIAS_SGI: Int = 32952

const val GL_POST_COLOR_MATRIX_GREEN_BIAS_SGI: Int = 32953

const val GL_POST_COLOR_MATRIX_BLUE_BIAS_SGI: Int = 32954

const val GL_POST_COLOR_MATRIX_ALPHA_BIAS_SGI: Int = 32955

const val GL_SGI_color_table: Int = 1

const val GL_COLOR_TABLE_SGI: Int = 32976

const val GL_POST_CONVOLUTION_COLOR_TABLE_SGI: Int = 32977

const val GL_POST_COLOR_MATRIX_COLOR_TABLE_SGI: Int = 32978

const val GL_PROXY_COLOR_TABLE_SGI: Int = 32979

const val GL_PROXY_POST_CONVOLUTION_COLOR_TABLE_SGI: Int = 32980

const val GL_PROXY_POST_COLOR_MATRIX_COLOR_TABLE_SGI: Int = 32981

const val GL_COLOR_TABLE_SCALE_SGI: Int = 32982

const val GL_COLOR_TABLE_BIAS_SGI: Int = 32983

const val GL_COLOR_TABLE_FORMAT_SGI: Int = 32984

const val GL_COLOR_TABLE_WIDTH_SGI: Int = 32985

const val GL_COLOR_TABLE_RED_SIZE_SGI: Int = 32986

const val GL_COLOR_TABLE_GREEN_SIZE_SGI: Int = 32987

const val GL_COLOR_TABLE_BLUE_SIZE_SGI: Int = 32988

const val GL_COLOR_TABLE_ALPHA_SIZE_SGI: Int = 32989

const val GL_COLOR_TABLE_LUMINANCE_SIZE_SGI: Int = 32990

const val GL_COLOR_TABLE_INTENSITY_SIZE_SGI: Int = 32991

const val GL_SGI_texture_color_table: Int = 1

const val GL_TEXTURE_COLOR_TABLE_SGI: Int = 32956

const val GL_PROXY_TEXTURE_COLOR_TABLE_SGI: Int = 32957

const val GL_SUNX_constant_data: Int = 1

const val GL_UNPACK_CONSTANT_DATA_SUNX: Int = 33237

const val GL_TEXTURE_CONSTANT_DATA_SUNX: Int = 33238

const val GL_SUN_convolution_border_modes: Int = 1

const val GL_WRAP_BORDER_SUN: Int = 33236

const val GL_SUN_global_alpha: Int = 1

const val GL_GLOBAL_ALPHA_SUN: Int = 33241

const val GL_GLOBAL_ALPHA_FACTOR_SUN: Int = 33242

const val GL_SUN_mesh_array: Int = 1

const val GL_QUAD_MESH_SUN: Int = 34324

const val GL_TRIANGLE_MESH_SUN: Int = 34325

const val GL_SUN_slice_accum: Int = 1

const val GL_SLICE_ACCUM_SUN: Int = 34252

const val GL_SUN_triangle_list: Int = 1

const val GL_RESTART_SUN: Int = 1

const val GL_REPLACE_MIDDLE_SUN: Int = 2

const val GL_REPLACE_OLDEST_SUN: Int = 3

const val GL_TRIANGLE_LIST_SUN: Int = 33239

const val GL_REPLACEMENT_CODE_SUN: Int = 33240

const val GL_REPLACEMENT_CODE_ARRAY_SUN: Int = 34240

const val GL_REPLACEMENT_CODE_ARRAY_TYPE_SUN: Int = 34241

const val GL_REPLACEMENT_CODE_ARRAY_STRIDE_SUN: Int = 34242

const val GL_REPLACEMENT_CODE_ARRAY_POINTER_SUN: Int = 34243

const val GL_R1UI_V3F_SUN: Int = 34244

const val GL_R1UI_C4UB_V3F_SUN: Int = 34245

const val GL_R1UI_C3F_V3F_SUN: Int = 34246

const val GL_R1UI_N3F_V3F_SUN: Int = 34247

const val GL_R1UI_C4F_N3F_V3F_SUN: Int = 34248

const val GL_R1UI_T2F_V3F_SUN: Int = 34249

const val GL_R1UI_T2F_N3F_V3F_SUN: Int = 34250

const val GL_R1UI_T2F_C4F_N3F_V3F_SUN: Int = 34251

const val GL_SUN_vertex: Int = 1

const val GL_WIN_phong_shading: Int = 1

const val GL_PHONG_WIN: Int = 33002

const val GL_PHONG_HINT_WIN: Int = 33003

const val GL_WIN_specular_fog: Int = 1

const val GL_FOG_SPECULAR_TEXTURE_WIN: Int = 33004

const val GL_MESA_packed_depth_stencil: Int = 1

const val GL_DEPTH_STENCIL_MESA: Int = 34640

const val GL_UNSIGNED_INT_24_8_MESA: Int = 34641

const val GL_UNSIGNED_INT_8_24_REV_MESA: Int = 34642

const val GL_UNSIGNED_SHORT_15_1_MESA: Int = 34643

const val GL_UNSIGNED_SHORT_1_15_REV_MESA: Int = 34644

const val GL_ATI_blend_equation_separate: Int = 1

const val GL_ALPHA_BLEND_EQUATION_ATI: Int = 34877

const val GL_OES_EGL_image: Int = 1

const val GLFW_VERSION_MAJOR: Int = 3

const val GLFW_VERSION_MINOR: Int = 2

const val GLFW_VERSION_REVISION: Int = 1

const val GLFW_TRUE: Int = 1

const val GLFW_FALSE: Int = 0

const val GLFW_RELEASE: Int = 0

const val GLFW_PRESS: Int = 1

const val GLFW_REPEAT: Int = 2

const val GLFW_KEY_UNKNOWN: Int = -1

const val GLFW_KEY_SPACE: Int = 32

const val GLFW_KEY_APOSTROPHE: Int = 39

const val GLFW_KEY_COMMA: Int = 44

const val GLFW_KEY_MINUS: Int = 45

const val GLFW_KEY_PERIOD: Int = 46

const val GLFW_KEY_SLASH: Int = 47

const val GLFW_KEY_0: Int = 48

const val GLFW_KEY_1: Int = 49

const val GLFW_KEY_2: Int = 50

const val GLFW_KEY_3: Int = 51

const val GLFW_KEY_4: Int = 52

const val GLFW_KEY_5: Int = 53

const val GLFW_KEY_6: Int = 54

const val GLFW_KEY_7: Int = 55

const val GLFW_KEY_8: Int = 56

const val GLFW_KEY_9: Int = 57

const val GLFW_KEY_SEMICOLON: Int = 59

const val GLFW_KEY_EQUAL: Int = 61

const val GLFW_KEY_A: Int = 65

const val GLFW_KEY_B: Int = 66

const val GLFW_KEY_C: Int = 67

const val GLFW_KEY_D: Int = 68

const val GLFW_KEY_E: Int = 69

const val GLFW_KEY_F: Int = 70

const val GLFW_KEY_G: Int = 71

const val GLFW_KEY_H: Int = 72

const val GLFW_KEY_I: Int = 73

const val GLFW_KEY_J: Int = 74

const val GLFW_KEY_K: Int = 75

const val GLFW_KEY_L: Int = 76

const val GLFW_KEY_M: Int = 77

const val GLFW_KEY_N: Int = 78

const val GLFW_KEY_O: Int = 79

const val GLFW_KEY_P: Int = 80

const val GLFW_KEY_Q: Int = 81

const val GLFW_KEY_R: Int = 82

const val GLFW_KEY_S: Int = 83

const val GLFW_KEY_T: Int = 84

const val GLFW_KEY_U: Int = 85

const val GLFW_KEY_V: Int = 86

const val GLFW_KEY_W: Int = 87

const val GLFW_KEY_X: Int = 88

const val GLFW_KEY_Y: Int = 89

const val GLFW_KEY_Z: Int = 90

const val GLFW_KEY_LEFT_BRACKET: Int = 91

const val GLFW_KEY_BACKSLASH: Int = 92

const val GLFW_KEY_RIGHT_BRACKET: Int = 93

const val GLFW_KEY_GRAVE_ACCENT: Int = 96

const val GLFW_KEY_WORLD_1: Int = 161

const val GLFW_KEY_WORLD_2: Int = 162

const val GLFW_KEY_ESCAPE: Int = 256

const val GLFW_KEY_ENTER: Int = 257

const val GLFW_KEY_TAB: Int = 258

const val GLFW_KEY_BACKSPACE: Int = 259

const val GLFW_KEY_INSERT: Int = 260

const val GLFW_KEY_DELETE: Int = 261

const val GLFW_KEY_RIGHT: Int = 262

const val GLFW_KEY_LEFT: Int = 263

const val GLFW_KEY_DOWN: Int = 264

const val GLFW_KEY_UP: Int = 265

const val GLFW_KEY_PAGE_UP: Int = 266

const val GLFW_KEY_PAGE_DOWN: Int = 267

const val GLFW_KEY_HOME: Int = 268

const val GLFW_KEY_END: Int = 269

const val GLFW_KEY_CAPS_LOCK: Int = 280

const val GLFW_KEY_SCROLL_LOCK: Int = 281

const val GLFW_KEY_NUM_LOCK: Int = 282

const val GLFW_KEY_PRINT_SCREEN: Int = 283

const val GLFW_KEY_PAUSE: Int = 284

const val GLFW_KEY_F1: Int = 290

const val GLFW_KEY_F2: Int = 291

const val GLFW_KEY_F3: Int = 292

const val GLFW_KEY_F4: Int = 293

const val GLFW_KEY_F5: Int = 294

const val GLFW_KEY_F6: Int = 295

const val GLFW_KEY_F7: Int = 296

const val GLFW_KEY_F8: Int = 297

const val GLFW_KEY_F9: Int = 298

const val GLFW_KEY_F10: Int = 299

const val GLFW_KEY_F11: Int = 300

const val GLFW_KEY_F12: Int = 301

const val GLFW_KEY_F13: Int = 302

const val GLFW_KEY_F14: Int = 303

const val GLFW_KEY_F15: Int = 304

const val GLFW_KEY_F16: Int = 305

const val GLFW_KEY_F17: Int = 306

const val GLFW_KEY_F18: Int = 307

const val GLFW_KEY_F19: Int = 308

const val GLFW_KEY_F20: Int = 309

const val GLFW_KEY_F21: Int = 310

const val GLFW_KEY_F22: Int = 311

const val GLFW_KEY_F23: Int = 312

const val GLFW_KEY_F24: Int = 313

const val GLFW_KEY_F25: Int = 314

const val GLFW_KEY_KP_0: Int = 320

const val GLFW_KEY_KP_1: Int = 321

const val GLFW_KEY_KP_2: Int = 322

const val GLFW_KEY_KP_3: Int = 323

const val GLFW_KEY_KP_4: Int = 324

const val GLFW_KEY_KP_5: Int = 325

const val GLFW_KEY_KP_6: Int = 326

const val GLFW_KEY_KP_7: Int = 327

const val GLFW_KEY_KP_8: Int = 328

const val GLFW_KEY_KP_9: Int = 329

const val GLFW_KEY_KP_DECIMAL: Int = 330

const val GLFW_KEY_KP_DIVIDE: Int = 331

const val GLFW_KEY_KP_MULTIPLY: Int = 332

const val GLFW_KEY_KP_SUBTRACT: Int = 333

const val GLFW_KEY_KP_ADD: Int = 334

const val GLFW_KEY_KP_ENTER: Int = 335

const val GLFW_KEY_KP_EQUAL: Int = 336

const val GLFW_KEY_LEFT_SHIFT: Int = 340

const val GLFW_KEY_LEFT_CONTROL: Int = 341

const val GLFW_KEY_LEFT_ALT: Int = 342

const val GLFW_KEY_LEFT_SUPER: Int = 343

const val GLFW_KEY_RIGHT_SHIFT: Int = 344

const val GLFW_KEY_RIGHT_CONTROL: Int = 345

const val GLFW_KEY_RIGHT_ALT: Int = 346

const val GLFW_KEY_RIGHT_SUPER: Int = 347

const val GLFW_KEY_MENU: Int = 348

const val GLFW_KEY_LAST: Int = 348

const val GLFW_MOD_SHIFT: Int = 1

const val GLFW_MOD_CONTROL: Int = 2

const val GLFW_MOD_ALT: Int = 4

const val GLFW_MOD_SUPER: Int = 8

const val GLFW_MOUSE_BUTTON_1: Int = 0

const val GLFW_MOUSE_BUTTON_2: Int = 1

const val GLFW_MOUSE_BUTTON_3: Int = 2

const val GLFW_MOUSE_BUTTON_4: Int = 3

const val GLFW_MOUSE_BUTTON_5: Int = 4

const val GLFW_MOUSE_BUTTON_6: Int = 5

const val GLFW_MOUSE_BUTTON_7: Int = 6

const val GLFW_MOUSE_BUTTON_8: Int = 7

const val GLFW_MOUSE_BUTTON_LAST: Int = 7

const val GLFW_MOUSE_BUTTON_LEFT: Int = 0

const val GLFW_MOUSE_BUTTON_RIGHT: Int = 1

const val GLFW_MOUSE_BUTTON_MIDDLE: Int = 2

const val GLFW_JOYSTICK_1: Int = 0

const val GLFW_JOYSTICK_2: Int = 1

const val GLFW_JOYSTICK_3: Int = 2

const val GLFW_JOYSTICK_4: Int = 3

const val GLFW_JOYSTICK_5: Int = 4

const val GLFW_JOYSTICK_6: Int = 5

const val GLFW_JOYSTICK_7: Int = 6

const val GLFW_JOYSTICK_8: Int = 7

const val GLFW_JOYSTICK_9: Int = 8

const val GLFW_JOYSTICK_10: Int = 9

const val GLFW_JOYSTICK_11: Int = 10

const val GLFW_JOYSTICK_12: Int = 11

const val GLFW_JOYSTICK_13: Int = 12

const val GLFW_JOYSTICK_14: Int = 13

const val GLFW_JOYSTICK_15: Int = 14

const val GLFW_JOYSTICK_16: Int = 15

const val GLFW_JOYSTICK_LAST: Int = 15

const val GLFW_NOT_INITIALIZED: Int = 65537

const val GLFW_NO_CURRENT_CONTEXT: Int = 65538

const val GLFW_INVALID_ENUM: Int = 65539

const val GLFW_INVALID_VALUE: Int = 65540

const val GLFW_OUT_OF_MEMORY: Int = 65541

const val GLFW_API_UNAVAILABLE: Int = 65542

const val GLFW_VERSION_UNAVAILABLE: Int = 65543

const val GLFW_PLATFORM_ERROR: Int = 65544

const val GLFW_FORMAT_UNAVAILABLE: Int = 65545

const val GLFW_NO_WINDOW_CONTEXT: Int = 65546

const val GLFW_FOCUSED: Int = 131073

const val GLFW_ICONIFIED: Int = 131074

const val GLFW_RESIZABLE: Int = 131075

const val GLFW_VISIBLE: Int = 131076

const val GLFW_DECORATED: Int = 131077

const val GLFW_AUTO_ICONIFY: Int = 131078

const val GLFW_FLOATING: Int = 131079

const val GLFW_MAXIMIZED: Int = 131080

const val GLFW_RED_BITS: Int = 135169

const val GLFW_GREEN_BITS: Int = 135170

const val GLFW_BLUE_BITS: Int = 135171

const val GLFW_ALPHA_BITS: Int = 135172

const val GLFW_DEPTH_BITS: Int = 135173

const val GLFW_STENCIL_BITS: Int = 135174

const val GLFW_ACCUM_RED_BITS: Int = 135175

const val GLFW_ACCUM_GREEN_BITS: Int = 135176

const val GLFW_ACCUM_BLUE_BITS: Int = 135177

const val GLFW_ACCUM_ALPHA_BITS: Int = 135178

const val GLFW_AUX_BUFFERS: Int = 135179

const val GLFW_STEREO: Int = 135180

const val GLFW_SAMPLES: Int = 135181

const val GLFW_SRGB_CAPABLE: Int = 135182

const val GLFW_REFRESH_RATE: Int = 135183

const val GLFW_DOUBLEBUFFER: Int = 135184

const val GLFW_CLIENT_API: Int = 139265

const val GLFW_CONTEXT_VERSION_MAJOR: Int = 139266

const val GLFW_CONTEXT_VERSION_MINOR: Int = 139267

const val GLFW_CONTEXT_REVISION: Int = 139268

const val GLFW_CONTEXT_ROBUSTNESS: Int = 139269

const val GLFW_OPENGL_FORWARD_COMPAT: Int = 139270

const val GLFW_OPENGL_DEBUG_CONTEXT: Int = 139271

const val GLFW_OPENGL_PROFILE: Int = 139272

const val GLFW_CONTEXT_RELEASE_BEHAVIOR: Int = 139273

const val GLFW_CONTEXT_NO_ERROR: Int = 139274

const val GLFW_CONTEXT_CREATION_API: Int = 139275

const val GLFW_NO_API: Int = 0

const val GLFW_OPENGL_API: Int = 196609

const val GLFW_OPENGL_ES_API: Int = 196610

const val GLFW_NO_ROBUSTNESS: Int = 0

const val GLFW_NO_RESET_NOTIFICATION: Int = 200705

const val GLFW_LOSE_CONTEXT_ON_RESET: Int = 200706

const val GLFW_OPENGL_ANY_PROFILE: Int = 0

const val GLFW_OPENGL_CORE_PROFILE: Int = 204801

const val GLFW_OPENGL_COMPAT_PROFILE: Int = 204802

const val GLFW_CURSOR: Int = 208897

const val GLFW_STICKY_KEYS: Int = 208898

const val GLFW_STICKY_MOUSE_BUTTONS: Int = 208899

const val GLFW_CURSOR_NORMAL: Int = 212993

const val GLFW_CURSOR_HIDDEN: Int = 212994

const val GLFW_CURSOR_DISABLED: Int = 212995

const val GLFW_ANY_RELEASE_BEHAVIOR: Int = 0

const val GLFW_RELEASE_BEHAVIOR_FLUSH: Int = 217089

const val GLFW_RELEASE_BEHAVIOR_NONE: Int = 217090

const val GLFW_NATIVE_CONTEXT_API: Int = 221185

const val GLFW_EGL_CONTEXT_API: Int = 221186

const val GLFW_ARROW_CURSOR: Int = 221185

const val GLFW_IBEAM_CURSOR: Int = 221186

const val GLFW_CROSSHAIR_CURSOR: Int = 221187

const val GLFW_HAND_CURSOR: Int = 221188

const val GLFW_HRESIZE_CURSOR: Int = 221189

const val GLFW_VRESIZE_CURSOR: Int = 221190

const val GLFW_CONNECTED: Int = 262145

const val GLFW_DISCONNECTED: Int = 262146

const val GLFW_DONT_CARE: Int = -1

class __fsid_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 4)
    
    val __val: CArrayPointer<IntVar>
        get() = arrayMemberAt(0)
    
}


class imaxdiv_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var quot: Long
        get() = memberAt<LongVar>(0).value
        set(value) { memberAt<LongVar>(0).value = value }
    
    var rem: Long
        get() = memberAt<LongVar>(8).value
        set(value) { memberAt<LongVar>(8).value = value }
    
}






class GLFWvidmode(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 4)
    
    var width: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var height: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var redBits: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var greenBits: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
    var blueBits: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
    var refreshRate: Int
        get() = memberAt<IntVar>(20).value
        set(value) { memberAt<IntVar>(20).value = value }
    
}

class GLFWgammaramp(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 8)
    
    var red: CPointer<UShortVar>?
        get() = memberAt<CPointerVar<UShortVar>>(0).value
        set(value) { memberAt<CPointerVar<UShortVar>>(0).value = value }
    
    var green: CPointer<UShortVar>?
        get() = memberAt<CPointerVar<UShortVar>>(8).value
        set(value) { memberAt<CPointerVar<UShortVar>>(8).value = value }
    
    var blue: CPointer<UShortVar>?
        get() = memberAt<CPointerVar<UShortVar>>(16).value
        set(value) { memberAt<CPointerVar<UShortVar>>(16).value = value }
    
    var size: UInt
        get() = memberAt<UIntVar>(24).value
        set(value) { memberAt<UIntVar>(24).value = value }
    
}

class GLFWimage(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var width: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var height: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var pixels: CPointer<UByteVar>?
        get() = memberAt<CPointerVar<UByteVar>>(8).value
        set(value) { memberAt<CPointerVar<UByteVar>>(8).value = value }
    
}

typealias __u_charVar = UByteVarOf<__u_char>
typealias __u_char = UByte

typealias __u_shortVar = UShortVarOf<__u_short>
typealias __u_short = UShort

typealias __u_intVar = UIntVarOf<__u_int>
typealias __u_int = UInt

typealias __u_longVar = ULongVarOf<__u_long>
typealias __u_long = ULong

typealias __int8_tVar = ByteVarOf<__int8_t>
typealias __int8_t = Byte

typealias __uint8_tVar = UByteVarOf<__uint8_t>
typealias __uint8_t = UByte

typealias __int16_tVar = ShortVarOf<__int16_t>
typealias __int16_t = Short

typealias __uint16_tVar = UShortVarOf<__uint16_t>
typealias __uint16_t = UShort

typealias __int32_tVar = IntVarOf<__int32_t>
typealias __int32_t = Int

typealias __uint32_tVar = UIntVarOf<__uint32_t>
typealias __uint32_t = UInt

typealias __int64_tVar = LongVarOf<__int64_t>
typealias __int64_t = Long

typealias __uint64_tVar = ULongVarOf<__uint64_t>
typealias __uint64_t = ULong

typealias __int_least8_tVar = ByteVarOf<__int_least8_t>
typealias __int_least8_t = __int8_t

typealias __uint_least8_tVar = UByteVarOf<__uint_least8_t>
typealias __uint_least8_t = __uint8_t

typealias __int_least16_tVar = ShortVarOf<__int_least16_t>
typealias __int_least16_t = __int16_t

typealias __uint_least16_tVar = UShortVarOf<__uint_least16_t>
typealias __uint_least16_t = __uint16_t

typealias __int_least32_tVar = IntVarOf<__int_least32_t>
typealias __int_least32_t = __int32_t

typealias __uint_least32_tVar = UIntVarOf<__uint_least32_t>
typealias __uint_least32_t = __uint32_t

typealias __int_least64_tVar = LongVarOf<__int_least64_t>
typealias __int_least64_t = __int64_t

typealias __uint_least64_tVar = ULongVarOf<__uint_least64_t>
typealias __uint_least64_t = __uint64_t

typealias __quad_tVar = LongVarOf<__quad_t>
typealias __quad_t = Long

typealias __u_quad_tVar = ULongVarOf<__u_quad_t>
typealias __u_quad_t = ULong

typealias __intmax_tVar = LongVarOf<__intmax_t>
typealias __intmax_t = Long

typealias __uintmax_tVar = ULongVarOf<__uintmax_t>
typealias __uintmax_t = ULong

typealias __dev_tVar = ULongVarOf<__dev_t>
typealias __dev_t = ULong

typealias __uid_tVar = UIntVarOf<__uid_t>
typealias __uid_t = UInt

typealias __gid_tVar = UIntVarOf<__gid_t>
typealias __gid_t = UInt

typealias __ino_tVar = ULongVarOf<__ino_t>
typealias __ino_t = ULong

typealias __ino64_tVar = ULongVarOf<__ino64_t>
typealias __ino64_t = ULong

typealias __mode_tVar = UIntVarOf<__mode_t>
typealias __mode_t = UInt

typealias __nlink_tVar = ULongVarOf<__nlink_t>
typealias __nlink_t = ULong

typealias __off_tVar = LongVarOf<__off_t>
typealias __off_t = Long

typealias __off64_tVar = LongVarOf<__off64_t>
typealias __off64_t = Long

typealias __pid_tVar = IntVarOf<__pid_t>
typealias __pid_t = Int

typealias __clock_tVar = LongVarOf<__clock_t>
typealias __clock_t = Long

typealias __rlim_tVar = ULongVarOf<__rlim_t>
typealias __rlim_t = ULong

typealias __rlim64_tVar = ULongVarOf<__rlim64_t>
typealias __rlim64_t = ULong

typealias __id_tVar = UIntVarOf<__id_t>
typealias __id_t = UInt

typealias __time_tVar = LongVarOf<__time_t>
typealias __time_t = Long

typealias __useconds_tVar = UIntVarOf<__useconds_t>
typealias __useconds_t = UInt

typealias __suseconds_tVar = LongVarOf<__suseconds_t>
typealias __suseconds_t = Long

typealias __daddr_tVar = IntVarOf<__daddr_t>
typealias __daddr_t = Int

typealias __key_tVar = IntVarOf<__key_t>
typealias __key_t = Int

typealias __clockid_tVar = IntVarOf<__clockid_t>
typealias __clockid_t = Int

typealias __timer_tVar = CPointerVarOf<__timer_t>
typealias __timer_t = COpaquePointer

typealias __blksize_tVar = LongVarOf<__blksize_t>
typealias __blksize_t = Long

typealias __blkcnt_tVar = LongVarOf<__blkcnt_t>
typealias __blkcnt_t = Long

typealias __blkcnt64_tVar = LongVarOf<__blkcnt64_t>
typealias __blkcnt64_t = Long

typealias __fsblkcnt_tVar = ULongVarOf<__fsblkcnt_t>
typealias __fsblkcnt_t = ULong

typealias __fsblkcnt64_tVar = ULongVarOf<__fsblkcnt64_t>
typealias __fsblkcnt64_t = ULong

typealias __fsfilcnt_tVar = ULongVarOf<__fsfilcnt_t>
typealias __fsfilcnt_t = ULong

typealias __fsfilcnt64_tVar = ULongVarOf<__fsfilcnt64_t>
typealias __fsfilcnt64_t = ULong

typealias __fsword_tVar = LongVarOf<__fsword_t>
typealias __fsword_t = Long

typealias __ssize_tVar = LongVarOf<__ssize_t>
typealias __ssize_t = Long

typealias __syscall_slong_tVar = LongVarOf<__syscall_slong_t>
typealias __syscall_slong_t = Long

typealias __syscall_ulong_tVar = ULongVarOf<__syscall_ulong_t>
typealias __syscall_ulong_t = ULong

typealias __loff_tVar = LongVarOf<__loff_t>
typealias __loff_t = __off64_t

typealias __caddr_tVar = CPointerVarOf<__caddr_t>
typealias __caddr_t = CPointer<ByteVar>

typealias __intptr_tVar = LongVarOf<__intptr_t>
typealias __intptr_t = Long

typealias __socklen_tVar = UIntVarOf<__socklen_t>
typealias __socklen_t = UInt

typealias __sig_atomic_tVar = IntVarOf<__sig_atomic_t>
typealias __sig_atomic_t = Int

typealias int8_tVar = ByteVarOf<int8_t>
typealias int8_t = __int8_t

typealias int16_tVar = ShortVarOf<int16_t>
typealias int16_t = __int16_t

typealias int32_tVar = IntVarOf<int32_t>
typealias int32_t = __int32_t

typealias int64_tVar = LongVarOf<int64_t>
typealias int64_t = __int64_t

typealias uint8_tVar = UByteVarOf<uint8_t>
typealias uint8_t = __uint8_t

typealias uint16_tVar = UShortVarOf<uint16_t>
typealias uint16_t = __uint16_t

typealias uint32_tVar = UIntVarOf<uint32_t>
typealias uint32_t = __uint32_t

typealias uint64_tVar = ULongVarOf<uint64_t>
typealias uint64_t = __uint64_t

typealias int_least8_tVar = ByteVarOf<int_least8_t>
typealias int_least8_t = __int_least8_t

typealias int_least16_tVar = ShortVarOf<int_least16_t>
typealias int_least16_t = __int_least16_t

typealias int_least32_tVar = IntVarOf<int_least32_t>
typealias int_least32_t = __int_least32_t

typealias int_least64_tVar = LongVarOf<int_least64_t>
typealias int_least64_t = __int_least64_t

typealias uint_least8_tVar = UByteVarOf<uint_least8_t>
typealias uint_least8_t = __uint_least8_t

typealias uint_least16_tVar = UShortVarOf<uint_least16_t>
typealias uint_least16_t = __uint_least16_t

typealias uint_least32_tVar = UIntVarOf<uint_least32_t>
typealias uint_least32_t = __uint_least32_t

typealias uint_least64_tVar = ULongVarOf<uint_least64_t>
typealias uint_least64_t = __uint_least64_t

typealias int_fast8_tVar = ByteVarOf<int_fast8_t>
typealias int_fast8_t = Byte

typealias int_fast16_tVar = LongVarOf<int_fast16_t>
typealias int_fast16_t = Long

typealias int_fast32_tVar = LongVarOf<int_fast32_t>
typealias int_fast32_t = Long

typealias int_fast64_tVar = LongVarOf<int_fast64_t>
typealias int_fast64_t = Long

typealias uint_fast8_tVar = UByteVarOf<uint_fast8_t>
typealias uint_fast8_t = UByte

typealias uint_fast16_tVar = ULongVarOf<uint_fast16_t>
typealias uint_fast16_t = ULong

typealias uint_fast32_tVar = ULongVarOf<uint_fast32_t>
typealias uint_fast32_t = ULong

typealias uint_fast64_tVar = ULongVarOf<uint_fast64_t>
typealias uint_fast64_t = ULong

typealias intptr_tVar = LongVarOf<intptr_t>
typealias intptr_t = Long

typealias uintptr_tVar = ULongVarOf<uintptr_t>
typealias uintptr_t = ULong

typealias intmax_tVar = LongVarOf<intmax_t>
typealias intmax_t = __intmax_t

typealias uintmax_tVar = ULongVarOf<uintmax_t>
typealias uintmax_t = __uintmax_t

typealias GLenumVar = UIntVarOf<GLenum>
typealias GLenum = UInt

typealias GLbooleanVar = UByteVarOf<GLboolean>
typealias GLboolean = UByte

typealias GLbitfieldVar = UIntVarOf<GLbitfield>
typealias GLbitfield = UInt

typealias GLbyteVar = ByteVarOf<GLbyte>
typealias GLbyte = Byte

typealias GLshortVar = ShortVarOf<GLshort>
typealias GLshort = Short

typealias GLintVar = IntVarOf<GLint>
typealias GLint = Int

typealias GLubyteVar = UByteVarOf<GLubyte>
typealias GLubyte = UByte

typealias GLushortVar = UShortVarOf<GLushort>
typealias GLushort = UShort

typealias GLuintVar = UIntVarOf<GLuint>
typealias GLuint = UInt

typealias GLsizeiVar = IntVarOf<GLsizei>
typealias GLsizei = Int

typealias GLfloatVar = FloatVarOf<GLfloat>
typealias GLfloat = Float

typealias GLclampfVar = FloatVarOf<GLclampf>
typealias GLclampf = Float

typealias GLdoubleVar = DoubleVarOf<GLdouble>
typealias GLdouble = Double

typealias GLclampdVar = DoubleVarOf<GLclampd>
typealias GLclampd = Double

typealias PFNGLDRAWRANGEELEMENTSPROCVar = CPointerVarOf<PFNGLDRAWRANGEELEMENTSPROC>
typealias PFNGLDRAWRANGEELEMENTSPROC = CPointer<CFunction<(GLenum, GLuint, GLuint, GLsizei, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLTEXIMAGE3DPROCVar = CPointerVarOf<PFNGLTEXIMAGE3DPROC>
typealias PFNGLTEXIMAGE3DPROC = CPointer<CFunction<(GLenum, GLint, GLint, GLsizei, GLsizei, GLsizei, GLint, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLTEXSUBIMAGE3DPROCVar = CPointerVarOf<PFNGLTEXSUBIMAGE3DPROC>
typealias PFNGLTEXSUBIMAGE3DPROC = CPointer<CFunction<(GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLCOPYTEXSUBIMAGE3DPROCVar = CPointerVarOf<PFNGLCOPYTEXSUBIMAGE3DPROC>
typealias PFNGLCOPYTEXSUBIMAGE3DPROC = CPointer<CFunction<(GLenum, GLint, GLint, GLint, GLint, GLint, GLint, GLsizei, GLsizei) -> Unit>>

typealias PFNGLACTIVETEXTUREPROCVar = CPointerVarOf<PFNGLACTIVETEXTUREPROC>
typealias PFNGLACTIVETEXTUREPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLSAMPLECOVERAGEPROCVar = CPointerVarOf<PFNGLSAMPLECOVERAGEPROC>
typealias PFNGLSAMPLECOVERAGEPROC = CPointer<CFunction<(GLclampf, GLboolean) -> Unit>>

typealias PFNGLCOMPRESSEDTEXIMAGE3DPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXIMAGE3DPROC>
typealias PFNGLCOMPRESSEDTEXIMAGE3DPROC = CPointer<CFunction<(GLenum, GLint, GLenum, GLsizei, GLsizei, GLsizei, GLint, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLCOMPRESSEDTEXIMAGE2DPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXIMAGE2DPROC>
typealias PFNGLCOMPRESSEDTEXIMAGE2DPROC = CPointer<CFunction<(GLenum, GLint, GLenum, GLsizei, GLsizei, GLint, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLCOMPRESSEDTEXIMAGE1DPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXIMAGE1DPROC>
typealias PFNGLCOMPRESSEDTEXIMAGE1DPROC = CPointer<CFunction<(GLenum, GLint, GLenum, GLsizei, GLint, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLCOMPRESSEDTEXSUBIMAGE3DPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXSUBIMAGE3DPROC>
typealias PFNGLCOMPRESSEDTEXSUBIMAGE3DPROC = CPointer<CFunction<(GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLCOMPRESSEDTEXSUBIMAGE2DPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXSUBIMAGE2DPROC>
typealias PFNGLCOMPRESSEDTEXSUBIMAGE2DPROC = CPointer<CFunction<(GLenum, GLint, GLint, GLint, GLsizei, GLsizei, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLCOMPRESSEDTEXSUBIMAGE1DPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXSUBIMAGE1DPROC>
typealias PFNGLCOMPRESSEDTEXSUBIMAGE1DPROC = CPointer<CFunction<(GLenum, GLint, GLint, GLsizei, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLGETCOMPRESSEDTEXIMAGEPROCVar = CPointerVarOf<PFNGLGETCOMPRESSEDTEXIMAGEPROC>
typealias PFNGLGETCOMPRESSEDTEXIMAGEPROC = CPointer<CFunction<(GLenum, GLint, COpaquePointer?) -> Unit>>

typealias PFNGLACTIVETEXTUREARBPROCVar = CPointerVarOf<PFNGLACTIVETEXTUREARBPROC>
typealias PFNGLACTIVETEXTUREARBPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLCLIENTACTIVETEXTUREARBPROCVar = CPointerVarOf<PFNGLCLIENTACTIVETEXTUREARBPROC>
typealias PFNGLCLIENTACTIVETEXTUREARBPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLMULTITEXCOORD1DARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD1DARBPROC>
typealias PFNGLMULTITEXCOORD1DARBPROC = CPointer<CFunction<(GLenum, GLdouble) -> Unit>>

typealias PFNGLMULTITEXCOORD1DVARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD1DVARBPROC>
typealias PFNGLMULTITEXCOORD1DVARBPROC = CPointer<CFunction<(GLenum, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLMULTITEXCOORD1FARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD1FARBPROC>
typealias PFNGLMULTITEXCOORD1FARBPROC = CPointer<CFunction<(GLenum, GLfloat) -> Unit>>

typealias PFNGLMULTITEXCOORD1FVARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD1FVARBPROC>
typealias PFNGLMULTITEXCOORD1FVARBPROC = CPointer<CFunction<(GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLMULTITEXCOORD1IARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD1IARBPROC>
typealias PFNGLMULTITEXCOORD1IARBPROC = CPointer<CFunction<(GLenum, GLint) -> Unit>>

typealias PFNGLMULTITEXCOORD1IVARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD1IVARBPROC>
typealias PFNGLMULTITEXCOORD1IVARBPROC = CPointer<CFunction<(GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLMULTITEXCOORD1SARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD1SARBPROC>
typealias PFNGLMULTITEXCOORD1SARBPROC = CPointer<CFunction<(GLenum, GLshort) -> Unit>>

typealias PFNGLMULTITEXCOORD1SVARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD1SVARBPROC>
typealias PFNGLMULTITEXCOORD1SVARBPROC = CPointer<CFunction<(GLenum, CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLMULTITEXCOORD2DARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD2DARBPROC>
typealias PFNGLMULTITEXCOORD2DARBPROC = CPointer<CFunction<(GLenum, GLdouble, GLdouble) -> Unit>>

typealias PFNGLMULTITEXCOORD2DVARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD2DVARBPROC>
typealias PFNGLMULTITEXCOORD2DVARBPROC = CPointer<CFunction<(GLenum, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLMULTITEXCOORD2FARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD2FARBPROC>
typealias PFNGLMULTITEXCOORD2FARBPROC = CPointer<CFunction<(GLenum, GLfloat, GLfloat) -> Unit>>

typealias PFNGLMULTITEXCOORD2FVARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD2FVARBPROC>
typealias PFNGLMULTITEXCOORD2FVARBPROC = CPointer<CFunction<(GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLMULTITEXCOORD2IARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD2IARBPROC>
typealias PFNGLMULTITEXCOORD2IARBPROC = CPointer<CFunction<(GLenum, GLint, GLint) -> Unit>>

typealias PFNGLMULTITEXCOORD2IVARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD2IVARBPROC>
typealias PFNGLMULTITEXCOORD2IVARBPROC = CPointer<CFunction<(GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLMULTITEXCOORD2SARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD2SARBPROC>
typealias PFNGLMULTITEXCOORD2SARBPROC = CPointer<CFunction<(GLenum, GLshort, GLshort) -> Unit>>

typealias PFNGLMULTITEXCOORD2SVARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD2SVARBPROC>
typealias PFNGLMULTITEXCOORD2SVARBPROC = CPointer<CFunction<(GLenum, CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLMULTITEXCOORD3DARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD3DARBPROC>
typealias PFNGLMULTITEXCOORD3DARBPROC = CPointer<CFunction<(GLenum, GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLMULTITEXCOORD3DVARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD3DVARBPROC>
typealias PFNGLMULTITEXCOORD3DVARBPROC = CPointer<CFunction<(GLenum, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLMULTITEXCOORD3FARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD3FARBPROC>
typealias PFNGLMULTITEXCOORD3FARBPROC = CPointer<CFunction<(GLenum, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLMULTITEXCOORD3FVARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD3FVARBPROC>
typealias PFNGLMULTITEXCOORD3FVARBPROC = CPointer<CFunction<(GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLMULTITEXCOORD3IARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD3IARBPROC>
typealias PFNGLMULTITEXCOORD3IARBPROC = CPointer<CFunction<(GLenum, GLint, GLint, GLint) -> Unit>>

typealias PFNGLMULTITEXCOORD3IVARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD3IVARBPROC>
typealias PFNGLMULTITEXCOORD3IVARBPROC = CPointer<CFunction<(GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLMULTITEXCOORD3SARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD3SARBPROC>
typealias PFNGLMULTITEXCOORD3SARBPROC = CPointer<CFunction<(GLenum, GLshort, GLshort, GLshort) -> Unit>>

typealias PFNGLMULTITEXCOORD3SVARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD3SVARBPROC>
typealias PFNGLMULTITEXCOORD3SVARBPROC = CPointer<CFunction<(GLenum, CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLMULTITEXCOORD4DARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD4DARBPROC>
typealias PFNGLMULTITEXCOORD4DARBPROC = CPointer<CFunction<(GLenum, GLdouble, GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLMULTITEXCOORD4DVARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD4DVARBPROC>
typealias PFNGLMULTITEXCOORD4DVARBPROC = CPointer<CFunction<(GLenum, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLMULTITEXCOORD4FARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD4FARBPROC>
typealias PFNGLMULTITEXCOORD4FARBPROC = CPointer<CFunction<(GLenum, GLfloat, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLMULTITEXCOORD4FVARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD4FVARBPROC>
typealias PFNGLMULTITEXCOORD4FVARBPROC = CPointer<CFunction<(GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLMULTITEXCOORD4IARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD4IARBPROC>
typealias PFNGLMULTITEXCOORD4IARBPROC = CPointer<CFunction<(GLenum, GLint, GLint, GLint, GLint) -> Unit>>

typealias PFNGLMULTITEXCOORD4IVARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD4IVARBPROC>
typealias PFNGLMULTITEXCOORD4IVARBPROC = CPointer<CFunction<(GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLMULTITEXCOORD4SARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD4SARBPROC>
typealias PFNGLMULTITEXCOORD4SARBPROC = CPointer<CFunction<(GLenum, GLshort, GLshort, GLshort, GLshort) -> Unit>>

typealias PFNGLMULTITEXCOORD4SVARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD4SVARBPROC>
typealias PFNGLMULTITEXCOORD4SVARBPROC = CPointer<CFunction<(GLenum, CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLBLENDFUNCSEPARATEPROCVar = CPointerVarOf<PFNGLBLENDFUNCSEPARATEPROC>
typealias PFNGLBLENDFUNCSEPARATEPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, GLenum) -> Unit>>

typealias PFNGLMULTIDRAWARRAYSPROCVar = CPointerVarOf<PFNGLMULTIDRAWARRAYSPROC>
typealias PFNGLMULTIDRAWARRAYSPROC = CPointer<CFunction<(GLenum, CPointer<GLintVar>?, CPointer<GLsizeiVar>?, GLsizei) -> Unit>>

typealias PFNGLMULTIDRAWELEMENTSPROCVar = CPointerVarOf<PFNGLMULTIDRAWELEMENTSPROC>
typealias PFNGLMULTIDRAWELEMENTSPROC = CPointer<CFunction<(GLenum, CPointer<GLsizeiVar>?, GLenum, CPointer<COpaquePointerVar>?, GLsizei) -> Unit>>

typealias PFNGLPOINTPARAMETERFPROCVar = CPointerVarOf<PFNGLPOINTPARAMETERFPROC>
typealias PFNGLPOINTPARAMETERFPROC = CPointer<CFunction<(GLenum, GLfloat) -> Unit>>

typealias PFNGLPOINTPARAMETERFVPROCVar = CPointerVarOf<PFNGLPOINTPARAMETERFVPROC>
typealias PFNGLPOINTPARAMETERFVPROC = CPointer<CFunction<(GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPOINTPARAMETERIPROCVar = CPointerVarOf<PFNGLPOINTPARAMETERIPROC>
typealias PFNGLPOINTPARAMETERIPROC = CPointer<CFunction<(GLenum, GLint) -> Unit>>

typealias PFNGLPOINTPARAMETERIVPROCVar = CPointerVarOf<PFNGLPOINTPARAMETERIVPROC>
typealias PFNGLPOINTPARAMETERIVPROC = CPointer<CFunction<(GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLFOGCOORDFPROCVar = CPointerVarOf<PFNGLFOGCOORDFPROC>
typealias PFNGLFOGCOORDFPROC = CPointer<CFunction<(GLfloat) -> Unit>>

typealias PFNGLFOGCOORDFVPROCVar = CPointerVarOf<PFNGLFOGCOORDFVPROC>
typealias PFNGLFOGCOORDFVPROC = CPointer<CFunction<(CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLFOGCOORDDPROCVar = CPointerVarOf<PFNGLFOGCOORDDPROC>
typealias PFNGLFOGCOORDDPROC = CPointer<CFunction<(GLdouble) -> Unit>>

typealias PFNGLFOGCOORDDVPROCVar = CPointerVarOf<PFNGLFOGCOORDDVPROC>
typealias PFNGLFOGCOORDDVPROC = CPointer<CFunction<(CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLFOGCOORDPOINTERPROCVar = CPointerVarOf<PFNGLFOGCOORDPOINTERPROC>
typealias PFNGLFOGCOORDPOINTERPROC = CPointer<CFunction<(GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLSECONDARYCOLOR3BPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3BPROC>
typealias PFNGLSECONDARYCOLOR3BPROC = CPointer<CFunction<(GLbyte, GLbyte, GLbyte) -> Unit>>

typealias PFNGLSECONDARYCOLOR3BVPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3BVPROC>
typealias PFNGLSECONDARYCOLOR3BVPROC = CPointer<CFunction<(CPointer<GLbyteVar>?) -> Unit>>

typealias PFNGLSECONDARYCOLOR3DPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3DPROC>
typealias PFNGLSECONDARYCOLOR3DPROC = CPointer<CFunction<(GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLSECONDARYCOLOR3DVPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3DVPROC>
typealias PFNGLSECONDARYCOLOR3DVPROC = CPointer<CFunction<(CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLSECONDARYCOLOR3FPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3FPROC>
typealias PFNGLSECONDARYCOLOR3FPROC = CPointer<CFunction<(GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLSECONDARYCOLOR3FVPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3FVPROC>
typealias PFNGLSECONDARYCOLOR3FVPROC = CPointer<CFunction<(CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLSECONDARYCOLOR3IPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3IPROC>
typealias PFNGLSECONDARYCOLOR3IPROC = CPointer<CFunction<(GLint, GLint, GLint) -> Unit>>

typealias PFNGLSECONDARYCOLOR3IVPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3IVPROC>
typealias PFNGLSECONDARYCOLOR3IVPROC = CPointer<CFunction<(CPointer<GLintVar>?) -> Unit>>

typealias PFNGLSECONDARYCOLOR3SPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3SPROC>
typealias PFNGLSECONDARYCOLOR3SPROC = CPointer<CFunction<(GLshort, GLshort, GLshort) -> Unit>>

typealias PFNGLSECONDARYCOLOR3SVPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3SVPROC>
typealias PFNGLSECONDARYCOLOR3SVPROC = CPointer<CFunction<(CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLSECONDARYCOLOR3UBPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3UBPROC>
typealias PFNGLSECONDARYCOLOR3UBPROC = CPointer<CFunction<(GLubyte, GLubyte, GLubyte) -> Unit>>

typealias PFNGLSECONDARYCOLOR3UBVPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3UBVPROC>
typealias PFNGLSECONDARYCOLOR3UBVPROC = CPointer<CFunction<(CPointer<GLubyteVar>?) -> Unit>>

typealias PFNGLSECONDARYCOLOR3UIPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3UIPROC>
typealias PFNGLSECONDARYCOLOR3UIPROC = CPointer<CFunction<(GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLSECONDARYCOLOR3UIVPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3UIVPROC>
typealias PFNGLSECONDARYCOLOR3UIVPROC = CPointer<CFunction<(CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLSECONDARYCOLOR3USPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3USPROC>
typealias PFNGLSECONDARYCOLOR3USPROC = CPointer<CFunction<(GLushort, GLushort, GLushort) -> Unit>>

typealias PFNGLSECONDARYCOLOR3USVPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3USVPROC>
typealias PFNGLSECONDARYCOLOR3USVPROC = CPointer<CFunction<(CPointer<GLushortVar>?) -> Unit>>

typealias PFNGLSECONDARYCOLORPOINTERPROCVar = CPointerVarOf<PFNGLSECONDARYCOLORPOINTERPROC>
typealias PFNGLSECONDARYCOLORPOINTERPROC = CPointer<CFunction<(GLint, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLWINDOWPOS2DPROCVar = CPointerVarOf<PFNGLWINDOWPOS2DPROC>
typealias PFNGLWINDOWPOS2DPROC = CPointer<CFunction<(GLdouble, GLdouble) -> Unit>>

typealias PFNGLWINDOWPOS2DVPROCVar = CPointerVarOf<PFNGLWINDOWPOS2DVPROC>
typealias PFNGLWINDOWPOS2DVPROC = CPointer<CFunction<(CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLWINDOWPOS2FPROCVar = CPointerVarOf<PFNGLWINDOWPOS2FPROC>
typealias PFNGLWINDOWPOS2FPROC = CPointer<CFunction<(GLfloat, GLfloat) -> Unit>>

typealias PFNGLWINDOWPOS2FVPROCVar = CPointerVarOf<PFNGLWINDOWPOS2FVPROC>
typealias PFNGLWINDOWPOS2FVPROC = CPointer<CFunction<(CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLWINDOWPOS2IPROCVar = CPointerVarOf<PFNGLWINDOWPOS2IPROC>
typealias PFNGLWINDOWPOS2IPROC = CPointer<CFunction<(GLint, GLint) -> Unit>>

typealias PFNGLWINDOWPOS2IVPROCVar = CPointerVarOf<PFNGLWINDOWPOS2IVPROC>
typealias PFNGLWINDOWPOS2IVPROC = CPointer<CFunction<(CPointer<GLintVar>?) -> Unit>>

typealias PFNGLWINDOWPOS2SPROCVar = CPointerVarOf<PFNGLWINDOWPOS2SPROC>
typealias PFNGLWINDOWPOS2SPROC = CPointer<CFunction<(GLshort, GLshort) -> Unit>>

typealias PFNGLWINDOWPOS2SVPROCVar = CPointerVarOf<PFNGLWINDOWPOS2SVPROC>
typealias PFNGLWINDOWPOS2SVPROC = CPointer<CFunction<(CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLWINDOWPOS3DPROCVar = CPointerVarOf<PFNGLWINDOWPOS3DPROC>
typealias PFNGLWINDOWPOS3DPROC = CPointer<CFunction<(GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLWINDOWPOS3DVPROCVar = CPointerVarOf<PFNGLWINDOWPOS3DVPROC>
typealias PFNGLWINDOWPOS3DVPROC = CPointer<CFunction<(CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLWINDOWPOS3FPROCVar = CPointerVarOf<PFNGLWINDOWPOS3FPROC>
typealias PFNGLWINDOWPOS3FPROC = CPointer<CFunction<(GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLWINDOWPOS3FVPROCVar = CPointerVarOf<PFNGLWINDOWPOS3FVPROC>
typealias PFNGLWINDOWPOS3FVPROC = CPointer<CFunction<(CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLWINDOWPOS3IPROCVar = CPointerVarOf<PFNGLWINDOWPOS3IPROC>
typealias PFNGLWINDOWPOS3IPROC = CPointer<CFunction<(GLint, GLint, GLint) -> Unit>>

typealias PFNGLWINDOWPOS3IVPROCVar = CPointerVarOf<PFNGLWINDOWPOS3IVPROC>
typealias PFNGLWINDOWPOS3IVPROC = CPointer<CFunction<(CPointer<GLintVar>?) -> Unit>>

typealias PFNGLWINDOWPOS3SPROCVar = CPointerVarOf<PFNGLWINDOWPOS3SPROC>
typealias PFNGLWINDOWPOS3SPROC = CPointer<CFunction<(GLshort, GLshort, GLshort) -> Unit>>

typealias PFNGLWINDOWPOS3SVPROCVar = CPointerVarOf<PFNGLWINDOWPOS3SVPROC>
typealias PFNGLWINDOWPOS3SVPROC = CPointer<CFunction<(CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLBLENDCOLORPROCVar = CPointerVarOf<PFNGLBLENDCOLORPROC>
typealias PFNGLBLENDCOLORPROC = CPointer<CFunction<(GLfloat, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLBLENDEQUATIONPROCVar = CPointerVarOf<PFNGLBLENDEQUATIONPROC>
typealias PFNGLBLENDEQUATIONPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias GLsizeiptrVar = LongVarOf<GLsizeiptr>
typealias GLsizeiptr = ptrdiff_t

typealias GLintptrVar = LongVarOf<GLintptr>
typealias GLintptr = ptrdiff_t

typealias PFNGLGENQUERIESPROCVar = CPointerVarOf<PFNGLGENQUERIESPROC>
typealias PFNGLGENQUERIESPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLDELETEQUERIESPROCVar = CPointerVarOf<PFNGLDELETEQUERIESPROC>
typealias PFNGLDELETEQUERIESPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLISQUERYPROCVar = CPointerVarOf<PFNGLISQUERYPROC>
typealias PFNGLISQUERYPROC = CPointer<CFunction<(GLuint) -> GLboolean>>

typealias PFNGLBEGINQUERYPROCVar = CPointerVarOf<PFNGLBEGINQUERYPROC>
typealias PFNGLBEGINQUERYPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLENDQUERYPROCVar = CPointerVarOf<PFNGLENDQUERYPROC>
typealias PFNGLENDQUERYPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLGETQUERYIVPROCVar = CPointerVarOf<PFNGLGETQUERYIVPROC>
typealias PFNGLGETQUERYIVPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETQUERYOBJECTIVPROCVar = CPointerVarOf<PFNGLGETQUERYOBJECTIVPROC>
typealias PFNGLGETQUERYOBJECTIVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETQUERYOBJECTUIVPROCVar = CPointerVarOf<PFNGLGETQUERYOBJECTUIVPROC>
typealias PFNGLGETQUERYOBJECTUIVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLBINDBUFFERPROCVar = CPointerVarOf<PFNGLBINDBUFFERPROC>
typealias PFNGLBINDBUFFERPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLDELETEBUFFERSPROCVar = CPointerVarOf<PFNGLDELETEBUFFERSPROC>
typealias PFNGLDELETEBUFFERSPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGENBUFFERSPROCVar = CPointerVarOf<PFNGLGENBUFFERSPROC>
typealias PFNGLGENBUFFERSPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLISBUFFERPROCVar = CPointerVarOf<PFNGLISBUFFERPROC>
typealias PFNGLISBUFFERPROC = CPointer<CFunction<(GLuint) -> GLboolean>>

typealias PFNGLBUFFERDATAPROCVar = CPointerVarOf<PFNGLBUFFERDATAPROC>
typealias PFNGLBUFFERDATAPROC = CPointer<CFunction<(GLenum, GLsizeiptr, COpaquePointer?, GLenum) -> Unit>>

typealias PFNGLBUFFERSUBDATAPROCVar = CPointerVarOf<PFNGLBUFFERSUBDATAPROC>
typealias PFNGLBUFFERSUBDATAPROC = CPointer<CFunction<(GLenum, GLintptr, GLsizeiptr, COpaquePointer?) -> Unit>>

typealias PFNGLGETBUFFERSUBDATAPROCVar = CPointerVarOf<PFNGLGETBUFFERSUBDATAPROC>
typealias PFNGLGETBUFFERSUBDATAPROC = CPointer<CFunction<(GLenum, GLintptr, GLsizeiptr, COpaquePointer?) -> Unit>>

typealias PFNGLMAPBUFFERPROCVar = CPointerVarOf<PFNGLMAPBUFFERPROC>
typealias PFNGLMAPBUFFERPROC = CPointer<CFunction<(GLenum, GLenum) -> COpaquePointer?>>

typealias PFNGLUNMAPBUFFERPROCVar = CPointerVarOf<PFNGLUNMAPBUFFERPROC>
typealias PFNGLUNMAPBUFFERPROC = CPointer<CFunction<(GLenum) -> GLboolean>>

typealias PFNGLGETBUFFERPARAMETERIVPROCVar = CPointerVarOf<PFNGLGETBUFFERPARAMETERIVPROC>
typealias PFNGLGETBUFFERPARAMETERIVPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETBUFFERPOINTERVPROCVar = CPointerVarOf<PFNGLGETBUFFERPOINTERVPROC>
typealias PFNGLGETBUFFERPOINTERVPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<COpaquePointerVar>?) -> Unit>>

typealias GLcharVar = ByteVarOf<GLchar>
typealias GLchar = Byte

typealias PFNGLBLENDEQUATIONSEPARATEPROCVar = CPointerVarOf<PFNGLBLENDEQUATIONSEPARATEPROC>
typealias PFNGLBLENDEQUATIONSEPARATEPROC = CPointer<CFunction<(GLenum, GLenum) -> Unit>>

typealias PFNGLDRAWBUFFERSPROCVar = CPointerVarOf<PFNGLDRAWBUFFERSPROC>
typealias PFNGLDRAWBUFFERSPROC = CPointer<CFunction<(GLsizei, CPointer<GLenumVar>?) -> Unit>>

typealias PFNGLSTENCILOPSEPARATEPROCVar = CPointerVarOf<PFNGLSTENCILOPSEPARATEPROC>
typealias PFNGLSTENCILOPSEPARATEPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, GLenum) -> Unit>>

typealias PFNGLSTENCILFUNCSEPARATEPROCVar = CPointerVarOf<PFNGLSTENCILFUNCSEPARATEPROC>
typealias PFNGLSTENCILFUNCSEPARATEPROC = CPointer<CFunction<(GLenum, GLenum, GLint, GLuint) -> Unit>>

typealias PFNGLSTENCILMASKSEPARATEPROCVar = CPointerVarOf<PFNGLSTENCILMASKSEPARATEPROC>
typealias PFNGLSTENCILMASKSEPARATEPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLATTACHSHADERPROCVar = CPointerVarOf<PFNGLATTACHSHADERPROC>
typealias PFNGLATTACHSHADERPROC = CPointer<CFunction<(GLuint, GLuint) -> Unit>>

typealias PFNGLBINDATTRIBLOCATIONPROCVar = CPointerVarOf<PFNGLBINDATTRIBLOCATIONPROC>
typealias PFNGLBINDATTRIBLOCATIONPROC = CPointer<CFunction<(GLuint, GLuint, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLCOMPILESHADERPROCVar = CPointerVarOf<PFNGLCOMPILESHADERPROC>
typealias PFNGLCOMPILESHADERPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLCREATEPROGRAMPROCVar = CPointerVarOf<PFNGLCREATEPROGRAMPROC>
typealias PFNGLCREATEPROGRAMPROC = CPointer<CFunction<() -> GLuint>>

typealias PFNGLCREATESHADERPROCVar = CPointerVarOf<PFNGLCREATESHADERPROC>
typealias PFNGLCREATESHADERPROC = CPointer<CFunction<(GLenum) -> GLuint>>

typealias PFNGLDELETEPROGRAMPROCVar = CPointerVarOf<PFNGLDELETEPROGRAMPROC>
typealias PFNGLDELETEPROGRAMPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLDELETESHADERPROCVar = CPointerVarOf<PFNGLDELETESHADERPROC>
typealias PFNGLDELETESHADERPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLDETACHSHADERPROCVar = CPointerVarOf<PFNGLDETACHSHADERPROC>
typealias PFNGLDETACHSHADERPROC = CPointer<CFunction<(GLuint, GLuint) -> Unit>>

typealias PFNGLDISABLEVERTEXATTRIBARRAYPROCVar = CPointerVarOf<PFNGLDISABLEVERTEXATTRIBARRAYPROC>
typealias PFNGLDISABLEVERTEXATTRIBARRAYPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLENABLEVERTEXATTRIBARRAYPROCVar = CPointerVarOf<PFNGLENABLEVERTEXATTRIBARRAYPROC>
typealias PFNGLENABLEVERTEXATTRIBARRAYPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLGETACTIVEATTRIBPROCVar = CPointerVarOf<PFNGLGETACTIVEATTRIBPROC>
typealias PFNGLGETACTIVEATTRIBPROC = CPointer<CFunction<(GLuint, GLuint, GLsizei, CPointer<GLsizeiVar>?, CPointer<GLintVar>?, CPointer<GLenumVar>?, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLGETACTIVEUNIFORMPROCVar = CPointerVarOf<PFNGLGETACTIVEUNIFORMPROC>
typealias PFNGLGETACTIVEUNIFORMPROC = CPointer<CFunction<(GLuint, GLuint, GLsizei, CPointer<GLsizeiVar>?, CPointer<GLintVar>?, CPointer<GLenumVar>?, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLGETATTACHEDSHADERSPROCVar = CPointerVarOf<PFNGLGETATTACHEDSHADERSPROC>
typealias PFNGLGETATTACHEDSHADERSPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLsizeiVar>?, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGETATTRIBLOCATIONPROCVar = CPointerVarOf<PFNGLGETATTRIBLOCATIONPROC>
typealias PFNGLGETATTRIBLOCATIONPROC = CPointer<CFunction<(GLuint, CPointer<GLcharVar>?) -> GLint>>

typealias PFNGLGETPROGRAMIVPROCVar = CPointerVarOf<PFNGLGETPROGRAMIVPROC>
typealias PFNGLGETPROGRAMIVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETPROGRAMINFOLOGPROCVar = CPointerVarOf<PFNGLGETPROGRAMINFOLOGPROC>
typealias PFNGLGETPROGRAMINFOLOGPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLsizeiVar>?, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLGETSHADERIVPROCVar = CPointerVarOf<PFNGLGETSHADERIVPROC>
typealias PFNGLGETSHADERIVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETSHADERINFOLOGPROCVar = CPointerVarOf<PFNGLGETSHADERINFOLOGPROC>
typealias PFNGLGETSHADERINFOLOGPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLsizeiVar>?, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLGETSHADERSOURCEPROCVar = CPointerVarOf<PFNGLGETSHADERSOURCEPROC>
typealias PFNGLGETSHADERSOURCEPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLsizeiVar>?, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLGETUNIFORMLOCATIONPROCVar = CPointerVarOf<PFNGLGETUNIFORMLOCATIONPROC>
typealias PFNGLGETUNIFORMLOCATIONPROC = CPointer<CFunction<(GLuint, CPointer<GLcharVar>?) -> GLint>>

typealias PFNGLGETUNIFORMFVPROCVar = CPointerVarOf<PFNGLGETUNIFORMFVPROC>
typealias PFNGLGETUNIFORMFVPROC = CPointer<CFunction<(GLuint, GLint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETUNIFORMIVPROCVar = CPointerVarOf<PFNGLGETUNIFORMIVPROC>
typealias PFNGLGETUNIFORMIVPROC = CPointer<CFunction<(GLuint, GLint, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETVERTEXATTRIBDVPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBDVPROC>
typealias PFNGLGETVERTEXATTRIBDVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLGETVERTEXATTRIBFVPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBFVPROC>
typealias PFNGLGETVERTEXATTRIBFVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETVERTEXATTRIBIVPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBIVPROC>
typealias PFNGLGETVERTEXATTRIBIVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETVERTEXATTRIBPOINTERVPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBPOINTERVPROC>
typealias PFNGLGETVERTEXATTRIBPOINTERVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<COpaquePointerVar>?) -> Unit>>

typealias PFNGLISPROGRAMPROCVar = CPointerVarOf<PFNGLISPROGRAMPROC>
typealias PFNGLISPROGRAMPROC = CPointer<CFunction<(GLuint) -> GLboolean>>

typealias PFNGLISSHADERPROCVar = CPointerVarOf<PFNGLISSHADERPROC>
typealias PFNGLISSHADERPROC = CPointer<CFunction<(GLuint) -> GLboolean>>

typealias PFNGLLINKPROGRAMPROCVar = CPointerVarOf<PFNGLLINKPROGRAMPROC>
typealias PFNGLLINKPROGRAMPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLSHADERSOURCEPROCVar = CPointerVarOf<PFNGLSHADERSOURCEPROC>
typealias PFNGLSHADERSOURCEPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<CPointerVar<GLcharVar>>?, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLUSEPROGRAMPROCVar = CPointerVarOf<PFNGLUSEPROGRAMPROC>
typealias PFNGLUSEPROGRAMPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLUNIFORM1FPROCVar = CPointerVarOf<PFNGLUNIFORM1FPROC>
typealias PFNGLUNIFORM1FPROC = CPointer<CFunction<(GLint, GLfloat) -> Unit>>

typealias PFNGLUNIFORM2FPROCVar = CPointerVarOf<PFNGLUNIFORM2FPROC>
typealias PFNGLUNIFORM2FPROC = CPointer<CFunction<(GLint, GLfloat, GLfloat) -> Unit>>

typealias PFNGLUNIFORM3FPROCVar = CPointerVarOf<PFNGLUNIFORM3FPROC>
typealias PFNGLUNIFORM3FPROC = CPointer<CFunction<(GLint, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLUNIFORM4FPROCVar = CPointerVarOf<PFNGLUNIFORM4FPROC>
typealias PFNGLUNIFORM4FPROC = CPointer<CFunction<(GLint, GLfloat, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLUNIFORM1IPROCVar = CPointerVarOf<PFNGLUNIFORM1IPROC>
typealias PFNGLUNIFORM1IPROC = CPointer<CFunction<(GLint, GLint) -> Unit>>

typealias PFNGLUNIFORM2IPROCVar = CPointerVarOf<PFNGLUNIFORM2IPROC>
typealias PFNGLUNIFORM2IPROC = CPointer<CFunction<(GLint, GLint, GLint) -> Unit>>

typealias PFNGLUNIFORM3IPROCVar = CPointerVarOf<PFNGLUNIFORM3IPROC>
typealias PFNGLUNIFORM3IPROC = CPointer<CFunction<(GLint, GLint, GLint, GLint) -> Unit>>

typealias PFNGLUNIFORM4IPROCVar = CPointerVarOf<PFNGLUNIFORM4IPROC>
typealias PFNGLUNIFORM4IPROC = CPointer<CFunction<(GLint, GLint, GLint, GLint, GLint) -> Unit>>

typealias PFNGLUNIFORM1FVPROCVar = CPointerVarOf<PFNGLUNIFORM1FVPROC>
typealias PFNGLUNIFORM1FVPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLUNIFORM2FVPROCVar = CPointerVarOf<PFNGLUNIFORM2FVPROC>
typealias PFNGLUNIFORM2FVPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLUNIFORM3FVPROCVar = CPointerVarOf<PFNGLUNIFORM3FVPROC>
typealias PFNGLUNIFORM3FVPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLUNIFORM4FVPROCVar = CPointerVarOf<PFNGLUNIFORM4FVPROC>
typealias PFNGLUNIFORM4FVPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLUNIFORM1IVPROCVar = CPointerVarOf<PFNGLUNIFORM1IVPROC>
typealias PFNGLUNIFORM1IVPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLUNIFORM2IVPROCVar = CPointerVarOf<PFNGLUNIFORM2IVPROC>
typealias PFNGLUNIFORM2IVPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLUNIFORM3IVPROCVar = CPointerVarOf<PFNGLUNIFORM3IVPROC>
typealias PFNGLUNIFORM3IVPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLUNIFORM4IVPROCVar = CPointerVarOf<PFNGLUNIFORM4IVPROC>
typealias PFNGLUNIFORM4IVPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLUNIFORMMATRIX2FVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX2FVPROC>
typealias PFNGLUNIFORMMATRIX2FVPROC = CPointer<CFunction<(GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLUNIFORMMATRIX3FVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX3FVPROC>
typealias PFNGLUNIFORMMATRIX3FVPROC = CPointer<CFunction<(GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLUNIFORMMATRIX4FVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX4FVPROC>
typealias PFNGLUNIFORMMATRIX4FVPROC = CPointer<CFunction<(GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLVALIDATEPROGRAMPROCVar = CPointerVarOf<PFNGLVALIDATEPROGRAMPROC>
typealias PFNGLVALIDATEPROGRAMPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLVERTEXATTRIB1DPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1DPROC>
typealias PFNGLVERTEXATTRIB1DPROC = CPointer<CFunction<(GLuint, GLdouble) -> Unit>>

typealias PFNGLVERTEXATTRIB1DVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1DVPROC>
typealias PFNGLVERTEXATTRIB1DVPROC = CPointer<CFunction<(GLuint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB1FPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1FPROC>
typealias PFNGLVERTEXATTRIB1FPROC = CPointer<CFunction<(GLuint, GLfloat) -> Unit>>

typealias PFNGLVERTEXATTRIB1FVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1FVPROC>
typealias PFNGLVERTEXATTRIB1FVPROC = CPointer<CFunction<(GLuint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB1SPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1SPROC>
typealias PFNGLVERTEXATTRIB1SPROC = CPointer<CFunction<(GLuint, GLshort) -> Unit>>

typealias PFNGLVERTEXATTRIB1SVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1SVPROC>
typealias PFNGLVERTEXATTRIB1SVPROC = CPointer<CFunction<(GLuint, CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB2DPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2DPROC>
typealias PFNGLVERTEXATTRIB2DPROC = CPointer<CFunction<(GLuint, GLdouble, GLdouble) -> Unit>>

typealias PFNGLVERTEXATTRIB2DVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2DVPROC>
typealias PFNGLVERTEXATTRIB2DVPROC = CPointer<CFunction<(GLuint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB2FPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2FPROC>
typealias PFNGLVERTEXATTRIB2FPROC = CPointer<CFunction<(GLuint, GLfloat, GLfloat) -> Unit>>

typealias PFNGLVERTEXATTRIB2FVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2FVPROC>
typealias PFNGLVERTEXATTRIB2FVPROC = CPointer<CFunction<(GLuint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB2SPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2SPROC>
typealias PFNGLVERTEXATTRIB2SPROC = CPointer<CFunction<(GLuint, GLshort, GLshort) -> Unit>>

typealias PFNGLVERTEXATTRIB2SVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2SVPROC>
typealias PFNGLVERTEXATTRIB2SVPROC = CPointer<CFunction<(GLuint, CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB3DPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3DPROC>
typealias PFNGLVERTEXATTRIB3DPROC = CPointer<CFunction<(GLuint, GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLVERTEXATTRIB3DVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3DVPROC>
typealias PFNGLVERTEXATTRIB3DVPROC = CPointer<CFunction<(GLuint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB3FPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3FPROC>
typealias PFNGLVERTEXATTRIB3FPROC = CPointer<CFunction<(GLuint, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLVERTEXATTRIB3FVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3FVPROC>
typealias PFNGLVERTEXATTRIB3FVPROC = CPointer<CFunction<(GLuint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB3SPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3SPROC>
typealias PFNGLVERTEXATTRIB3SPROC = CPointer<CFunction<(GLuint, GLshort, GLshort, GLshort) -> Unit>>

typealias PFNGLVERTEXATTRIB3SVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3SVPROC>
typealias PFNGLVERTEXATTRIB3SVPROC = CPointer<CFunction<(GLuint, CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4NBVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4NBVPROC>
typealias PFNGLVERTEXATTRIB4NBVPROC = CPointer<CFunction<(GLuint, CPointer<GLbyteVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4NIVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4NIVPROC>
typealias PFNGLVERTEXATTRIB4NIVPROC = CPointer<CFunction<(GLuint, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4NSVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4NSVPROC>
typealias PFNGLVERTEXATTRIB4NSVPROC = CPointer<CFunction<(GLuint, CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4NUBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4NUBPROC>
typealias PFNGLVERTEXATTRIB4NUBPROC = CPointer<CFunction<(GLuint, GLubyte, GLubyte, GLubyte, GLubyte) -> Unit>>

typealias PFNGLVERTEXATTRIB4NUBVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4NUBVPROC>
typealias PFNGLVERTEXATTRIB4NUBVPROC = CPointer<CFunction<(GLuint, CPointer<GLubyteVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4NUIVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4NUIVPROC>
typealias PFNGLVERTEXATTRIB4NUIVPROC = CPointer<CFunction<(GLuint, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4NUSVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4NUSVPROC>
typealias PFNGLVERTEXATTRIB4NUSVPROC = CPointer<CFunction<(GLuint, CPointer<GLushortVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4BVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4BVPROC>
typealias PFNGLVERTEXATTRIB4BVPROC = CPointer<CFunction<(GLuint, CPointer<GLbyteVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4DPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4DPROC>
typealias PFNGLVERTEXATTRIB4DPROC = CPointer<CFunction<(GLuint, GLdouble, GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLVERTEXATTRIB4DVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4DVPROC>
typealias PFNGLVERTEXATTRIB4DVPROC = CPointer<CFunction<(GLuint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4FPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4FPROC>
typealias PFNGLVERTEXATTRIB4FPROC = CPointer<CFunction<(GLuint, GLfloat, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLVERTEXATTRIB4FVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4FVPROC>
typealias PFNGLVERTEXATTRIB4FVPROC = CPointer<CFunction<(GLuint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4IVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4IVPROC>
typealias PFNGLVERTEXATTRIB4IVPROC = CPointer<CFunction<(GLuint, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4SPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4SPROC>
typealias PFNGLVERTEXATTRIB4SPROC = CPointer<CFunction<(GLuint, GLshort, GLshort, GLshort, GLshort) -> Unit>>

typealias PFNGLVERTEXATTRIB4SVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4SVPROC>
typealias PFNGLVERTEXATTRIB4SVPROC = CPointer<CFunction<(GLuint, CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4UBVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4UBVPROC>
typealias PFNGLVERTEXATTRIB4UBVPROC = CPointer<CFunction<(GLuint, CPointer<GLubyteVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4UIVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4UIVPROC>
typealias PFNGLVERTEXATTRIB4UIVPROC = CPointer<CFunction<(GLuint, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4USVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4USVPROC>
typealias PFNGLVERTEXATTRIB4USVPROC = CPointer<CFunction<(GLuint, CPointer<GLushortVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBPOINTERPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBPOINTERPROC>
typealias PFNGLVERTEXATTRIBPOINTERPROC = CPointer<CFunction<(GLuint, GLint, GLenum, GLboolean, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLUNIFORMMATRIX2X3FVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX2X3FVPROC>
typealias PFNGLUNIFORMMATRIX2X3FVPROC = CPointer<CFunction<(GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLUNIFORMMATRIX3X2FVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX3X2FVPROC>
typealias PFNGLUNIFORMMATRIX3X2FVPROC = CPointer<CFunction<(GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLUNIFORMMATRIX2X4FVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX2X4FVPROC>
typealias PFNGLUNIFORMMATRIX2X4FVPROC = CPointer<CFunction<(GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLUNIFORMMATRIX4X2FVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX4X2FVPROC>
typealias PFNGLUNIFORMMATRIX4X2FVPROC = CPointer<CFunction<(GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLUNIFORMMATRIX3X4FVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX3X4FVPROC>
typealias PFNGLUNIFORMMATRIX3X4FVPROC = CPointer<CFunction<(GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLUNIFORMMATRIX4X3FVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX4X3FVPROC>
typealias PFNGLUNIFORMMATRIX4X3FVPROC = CPointer<CFunction<(GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias GLhalfVar = UShortVarOf<GLhalf>
typealias GLhalf = UShort

typealias PFNGLCOLORMASKIPROCVar = CPointerVarOf<PFNGLCOLORMASKIPROC>
typealias PFNGLCOLORMASKIPROC = CPointer<CFunction<(GLuint, GLboolean, GLboolean, GLboolean, GLboolean) -> Unit>>

typealias PFNGLGETBOOLEANI_VPROCVar = CPointerVarOf<PFNGLGETBOOLEANI_VPROC>
typealias PFNGLGETBOOLEANI_VPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<GLbooleanVar>?) -> Unit>>

typealias PFNGLGETINTEGERI_VPROCVar = CPointerVarOf<PFNGLGETINTEGERI_VPROC>
typealias PFNGLGETINTEGERI_VPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLENABLEIPROCVar = CPointerVarOf<PFNGLENABLEIPROC>
typealias PFNGLENABLEIPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLDISABLEIPROCVar = CPointerVarOf<PFNGLDISABLEIPROC>
typealias PFNGLDISABLEIPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLISENABLEDIPROCVar = CPointerVarOf<PFNGLISENABLEDIPROC>
typealias PFNGLISENABLEDIPROC = CPointer<CFunction<(GLenum, GLuint) -> GLboolean>>

typealias PFNGLBEGINTRANSFORMFEEDBACKPROCVar = CPointerVarOf<PFNGLBEGINTRANSFORMFEEDBACKPROC>
typealias PFNGLBEGINTRANSFORMFEEDBACKPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLENDTRANSFORMFEEDBACKPROCVar = CPointerVarOf<PFNGLENDTRANSFORMFEEDBACKPROC>
typealias PFNGLENDTRANSFORMFEEDBACKPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLBINDBUFFERRANGEPROCVar = CPointerVarOf<PFNGLBINDBUFFERRANGEPROC>
typealias PFNGLBINDBUFFERRANGEPROC = CPointer<CFunction<(GLenum, GLuint, GLuint, GLintptr, GLsizeiptr) -> Unit>>

typealias PFNGLBINDBUFFERBASEPROCVar = CPointerVarOf<PFNGLBINDBUFFERBASEPROC>
typealias PFNGLBINDBUFFERBASEPROC = CPointer<CFunction<(GLenum, GLuint, GLuint) -> Unit>>

typealias PFNGLTRANSFORMFEEDBACKVARYINGSPROCVar = CPointerVarOf<PFNGLTRANSFORMFEEDBACKVARYINGSPROC>
typealias PFNGLTRANSFORMFEEDBACKVARYINGSPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<CPointerVar<GLcharVar>>?, GLenum) -> Unit>>

typealias PFNGLGETTRANSFORMFEEDBACKVARYINGPROCVar = CPointerVarOf<PFNGLGETTRANSFORMFEEDBACKVARYINGPROC>
typealias PFNGLGETTRANSFORMFEEDBACKVARYINGPROC = CPointer<CFunction<(GLuint, GLuint, GLsizei, CPointer<GLsizeiVar>?, CPointer<GLsizeiVar>?, CPointer<GLenumVar>?, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLCLAMPCOLORPROCVar = CPointerVarOf<PFNGLCLAMPCOLORPROC>
typealias PFNGLCLAMPCOLORPROC = CPointer<CFunction<(GLenum, GLenum) -> Unit>>

typealias PFNGLBEGINCONDITIONALRENDERPROCVar = CPointerVarOf<PFNGLBEGINCONDITIONALRENDERPROC>
typealias PFNGLBEGINCONDITIONALRENDERPROC = CPointer<CFunction<(GLuint, GLenum) -> Unit>>

typealias PFNGLENDCONDITIONALRENDERPROCVar = CPointerVarOf<PFNGLENDCONDITIONALRENDERPROC>
typealias PFNGLENDCONDITIONALRENDERPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLVERTEXATTRIBIPOINTERPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBIPOINTERPROC>
typealias PFNGLVERTEXATTRIBIPOINTERPROC = CPointer<CFunction<(GLuint, GLint, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLGETVERTEXATTRIBIIVPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBIIVPROC>
typealias PFNGLGETVERTEXATTRIBIIVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETVERTEXATTRIBIUIVPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBIUIVPROC>
typealias PFNGLGETVERTEXATTRIBIUIVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBI1IPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI1IPROC>
typealias PFNGLVERTEXATTRIBI1IPROC = CPointer<CFunction<(GLuint, GLint) -> Unit>>

typealias PFNGLVERTEXATTRIBI2IPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI2IPROC>
typealias PFNGLVERTEXATTRIBI2IPROC = CPointer<CFunction<(GLuint, GLint, GLint) -> Unit>>

typealias PFNGLVERTEXATTRIBI3IPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI3IPROC>
typealias PFNGLVERTEXATTRIBI3IPROC = CPointer<CFunction<(GLuint, GLint, GLint, GLint) -> Unit>>

typealias PFNGLVERTEXATTRIBI4IPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI4IPROC>
typealias PFNGLVERTEXATTRIBI4IPROC = CPointer<CFunction<(GLuint, GLint, GLint, GLint, GLint) -> Unit>>

typealias PFNGLVERTEXATTRIBI1UIPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI1UIPROC>
typealias PFNGLVERTEXATTRIBI1UIPROC = CPointer<CFunction<(GLuint, GLuint) -> Unit>>

typealias PFNGLVERTEXATTRIBI2UIPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI2UIPROC>
typealias PFNGLVERTEXATTRIBI2UIPROC = CPointer<CFunction<(GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLVERTEXATTRIBI3UIPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI3UIPROC>
typealias PFNGLVERTEXATTRIBI3UIPROC = CPointer<CFunction<(GLuint, GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLVERTEXATTRIBI4UIPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI4UIPROC>
typealias PFNGLVERTEXATTRIBI4UIPROC = CPointer<CFunction<(GLuint, GLuint, GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLVERTEXATTRIBI1IVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI1IVPROC>
typealias PFNGLVERTEXATTRIBI1IVPROC = CPointer<CFunction<(GLuint, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBI2IVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI2IVPROC>
typealias PFNGLVERTEXATTRIBI2IVPROC = CPointer<CFunction<(GLuint, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBI3IVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI3IVPROC>
typealias PFNGLVERTEXATTRIBI3IVPROC = CPointer<CFunction<(GLuint, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBI4IVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI4IVPROC>
typealias PFNGLVERTEXATTRIBI4IVPROC = CPointer<CFunction<(GLuint, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBI1UIVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI1UIVPROC>
typealias PFNGLVERTEXATTRIBI1UIVPROC = CPointer<CFunction<(GLuint, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBI2UIVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI2UIVPROC>
typealias PFNGLVERTEXATTRIBI2UIVPROC = CPointer<CFunction<(GLuint, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBI3UIVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI3UIVPROC>
typealias PFNGLVERTEXATTRIBI3UIVPROC = CPointer<CFunction<(GLuint, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBI4UIVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI4UIVPROC>
typealias PFNGLVERTEXATTRIBI4UIVPROC = CPointer<CFunction<(GLuint, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBI4BVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI4BVPROC>
typealias PFNGLVERTEXATTRIBI4BVPROC = CPointer<CFunction<(GLuint, CPointer<GLbyteVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBI4SVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI4SVPROC>
typealias PFNGLVERTEXATTRIBI4SVPROC = CPointer<CFunction<(GLuint, CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBI4UBVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI4UBVPROC>
typealias PFNGLVERTEXATTRIBI4UBVPROC = CPointer<CFunction<(GLuint, CPointer<GLubyteVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBI4USVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI4USVPROC>
typealias PFNGLVERTEXATTRIBI4USVPROC = CPointer<CFunction<(GLuint, CPointer<GLushortVar>?) -> Unit>>

typealias PFNGLGETUNIFORMUIVPROCVar = CPointerVarOf<PFNGLGETUNIFORMUIVPROC>
typealias PFNGLGETUNIFORMUIVPROC = CPointer<CFunction<(GLuint, GLint, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLBINDFRAGDATALOCATIONPROCVar = CPointerVarOf<PFNGLBINDFRAGDATALOCATIONPROC>
typealias PFNGLBINDFRAGDATALOCATIONPROC = CPointer<CFunction<(GLuint, GLuint, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLGETFRAGDATALOCATIONPROCVar = CPointerVarOf<PFNGLGETFRAGDATALOCATIONPROC>
typealias PFNGLGETFRAGDATALOCATIONPROC = CPointer<CFunction<(GLuint, CPointer<GLcharVar>?) -> GLint>>

typealias PFNGLUNIFORM1UIPROCVar = CPointerVarOf<PFNGLUNIFORM1UIPROC>
typealias PFNGLUNIFORM1UIPROC = CPointer<CFunction<(GLint, GLuint) -> Unit>>

typealias PFNGLUNIFORM2UIPROCVar = CPointerVarOf<PFNGLUNIFORM2UIPROC>
typealias PFNGLUNIFORM2UIPROC = CPointer<CFunction<(GLint, GLuint, GLuint) -> Unit>>

typealias PFNGLUNIFORM3UIPROCVar = CPointerVarOf<PFNGLUNIFORM3UIPROC>
typealias PFNGLUNIFORM3UIPROC = CPointer<CFunction<(GLint, GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLUNIFORM4UIPROCVar = CPointerVarOf<PFNGLUNIFORM4UIPROC>
typealias PFNGLUNIFORM4UIPROC = CPointer<CFunction<(GLint, GLuint, GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLUNIFORM1UIVPROCVar = CPointerVarOf<PFNGLUNIFORM1UIVPROC>
typealias PFNGLUNIFORM1UIVPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLUNIFORM2UIVPROCVar = CPointerVarOf<PFNGLUNIFORM2UIVPROC>
typealias PFNGLUNIFORM2UIVPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLUNIFORM3UIVPROCVar = CPointerVarOf<PFNGLUNIFORM3UIVPROC>
typealias PFNGLUNIFORM3UIVPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLUNIFORM4UIVPROCVar = CPointerVarOf<PFNGLUNIFORM4UIVPROC>
typealias PFNGLUNIFORM4UIVPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLTEXPARAMETERIIVPROCVar = CPointerVarOf<PFNGLTEXPARAMETERIIVPROC>
typealias PFNGLTEXPARAMETERIIVPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLTEXPARAMETERIUIVPROCVar = CPointerVarOf<PFNGLTEXPARAMETERIUIVPROC>
typealias PFNGLTEXPARAMETERIUIVPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGETTEXPARAMETERIIVPROCVar = CPointerVarOf<PFNGLGETTEXPARAMETERIIVPROC>
typealias PFNGLGETTEXPARAMETERIIVPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETTEXPARAMETERIUIVPROCVar = CPointerVarOf<PFNGLGETTEXPARAMETERIUIVPROC>
typealias PFNGLGETTEXPARAMETERIUIVPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLCLEARBUFFERIVPROCVar = CPointerVarOf<PFNGLCLEARBUFFERIVPROC>
typealias PFNGLCLEARBUFFERIVPROC = CPointer<CFunction<(GLenum, GLint, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLCLEARBUFFERUIVPROCVar = CPointerVarOf<PFNGLCLEARBUFFERUIVPROC>
typealias PFNGLCLEARBUFFERUIVPROC = CPointer<CFunction<(GLenum, GLint, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLCLEARBUFFERFVPROCVar = CPointerVarOf<PFNGLCLEARBUFFERFVPROC>
typealias PFNGLCLEARBUFFERFVPROC = CPointer<CFunction<(GLenum, GLint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLCLEARBUFFERFIPROCVar = CPointerVarOf<PFNGLCLEARBUFFERFIPROC>
typealias PFNGLCLEARBUFFERFIPROC = CPointer<CFunction<(GLenum, GLint, GLfloat, GLint) -> Unit>>

typealias PFNGLGETSTRINGIPROCVar = CPointerVarOf<PFNGLGETSTRINGIPROC>
typealias PFNGLGETSTRINGIPROC = CPointer<CFunction<(GLenum, GLuint) -> CPointer<GLubyteVar>?>>

typealias PFNGLISRENDERBUFFERPROCVar = CPointerVarOf<PFNGLISRENDERBUFFERPROC>
typealias PFNGLISRENDERBUFFERPROC = CPointer<CFunction<(GLuint) -> GLboolean>>

typealias PFNGLBINDRENDERBUFFERPROCVar = CPointerVarOf<PFNGLBINDRENDERBUFFERPROC>
typealias PFNGLBINDRENDERBUFFERPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLDELETERENDERBUFFERSPROCVar = CPointerVarOf<PFNGLDELETERENDERBUFFERSPROC>
typealias PFNGLDELETERENDERBUFFERSPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGENRENDERBUFFERSPROCVar = CPointerVarOf<PFNGLGENRENDERBUFFERSPROC>
typealias PFNGLGENRENDERBUFFERSPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLRENDERBUFFERSTORAGEPROCVar = CPointerVarOf<PFNGLRENDERBUFFERSTORAGEPROC>
typealias PFNGLRENDERBUFFERSTORAGEPROC = CPointer<CFunction<(GLenum, GLenum, GLsizei, GLsizei) -> Unit>>

typealias PFNGLGETRENDERBUFFERPARAMETERIVPROCVar = CPointerVarOf<PFNGLGETRENDERBUFFERPARAMETERIVPROC>
typealias PFNGLGETRENDERBUFFERPARAMETERIVPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLISFRAMEBUFFERPROCVar = CPointerVarOf<PFNGLISFRAMEBUFFERPROC>
typealias PFNGLISFRAMEBUFFERPROC = CPointer<CFunction<(GLuint) -> GLboolean>>

typealias PFNGLBINDFRAMEBUFFERPROCVar = CPointerVarOf<PFNGLBINDFRAMEBUFFERPROC>
typealias PFNGLBINDFRAMEBUFFERPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLDELETEFRAMEBUFFERSPROCVar = CPointerVarOf<PFNGLDELETEFRAMEBUFFERSPROC>
typealias PFNGLDELETEFRAMEBUFFERSPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGENFRAMEBUFFERSPROCVar = CPointerVarOf<PFNGLGENFRAMEBUFFERSPROC>
typealias PFNGLGENFRAMEBUFFERSPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLCHECKFRAMEBUFFERSTATUSPROCVar = CPointerVarOf<PFNGLCHECKFRAMEBUFFERSTATUSPROC>
typealias PFNGLCHECKFRAMEBUFFERSTATUSPROC = CPointer<CFunction<(GLenum) -> GLenum>>

typealias PFNGLFRAMEBUFFERTEXTURE1DPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERTEXTURE1DPROC>
typealias PFNGLFRAMEBUFFERTEXTURE1DPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, GLuint, GLint) -> Unit>>

typealias PFNGLFRAMEBUFFERTEXTURE2DPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERTEXTURE2DPROC>
typealias PFNGLFRAMEBUFFERTEXTURE2DPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, GLuint, GLint) -> Unit>>

typealias PFNGLFRAMEBUFFERTEXTURE3DPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERTEXTURE3DPROC>
typealias PFNGLFRAMEBUFFERTEXTURE3DPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, GLuint, GLint, GLint) -> Unit>>

typealias PFNGLFRAMEBUFFERRENDERBUFFERPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERRENDERBUFFERPROC>
typealias PFNGLFRAMEBUFFERRENDERBUFFERPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, GLuint) -> Unit>>

typealias PFNGLGETFRAMEBUFFERATTACHMENTPARAMETERIVPROCVar = CPointerVarOf<PFNGLGETFRAMEBUFFERATTACHMENTPARAMETERIVPROC>
typealias PFNGLGETFRAMEBUFFERATTACHMENTPARAMETERIVPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGENERATEMIPMAPPROCVar = CPointerVarOf<PFNGLGENERATEMIPMAPPROC>
typealias PFNGLGENERATEMIPMAPPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLBLITFRAMEBUFFERPROCVar = CPointerVarOf<PFNGLBLITFRAMEBUFFERPROC>
typealias PFNGLBLITFRAMEBUFFERPROC = CPointer<CFunction<(GLint, GLint, GLint, GLint, GLint, GLint, GLint, GLint, GLbitfield, GLenum) -> Unit>>

typealias PFNGLRENDERBUFFERSTORAGEMULTISAMPLEPROCVar = CPointerVarOf<PFNGLRENDERBUFFERSTORAGEMULTISAMPLEPROC>
typealias PFNGLRENDERBUFFERSTORAGEMULTISAMPLEPROC = CPointer<CFunction<(GLenum, GLsizei, GLenum, GLsizei, GLsizei) -> Unit>>

typealias PFNGLFRAMEBUFFERTEXTURELAYERPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERTEXTURELAYERPROC>
typealias PFNGLFRAMEBUFFERTEXTURELAYERPROC = CPointer<CFunction<(GLenum, GLenum, GLuint, GLint, GLint) -> Unit>>

typealias PFNGLMAPBUFFERRANGEPROCVar = CPointerVarOf<PFNGLMAPBUFFERRANGEPROC>
typealias PFNGLMAPBUFFERRANGEPROC = CPointer<CFunction<(GLenum, GLintptr, GLsizeiptr, GLbitfield) -> COpaquePointer?>>

typealias PFNGLFLUSHMAPPEDBUFFERRANGEPROCVar = CPointerVarOf<PFNGLFLUSHMAPPEDBUFFERRANGEPROC>
typealias PFNGLFLUSHMAPPEDBUFFERRANGEPROC = CPointer<CFunction<(GLenum, GLintptr, GLsizeiptr) -> Unit>>

typealias PFNGLBINDVERTEXARRAYPROCVar = CPointerVarOf<PFNGLBINDVERTEXARRAYPROC>
typealias PFNGLBINDVERTEXARRAYPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLDELETEVERTEXARRAYSPROCVar = CPointerVarOf<PFNGLDELETEVERTEXARRAYSPROC>
typealias PFNGLDELETEVERTEXARRAYSPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGENVERTEXARRAYSPROCVar = CPointerVarOf<PFNGLGENVERTEXARRAYSPROC>
typealias PFNGLGENVERTEXARRAYSPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLISVERTEXARRAYPROCVar = CPointerVarOf<PFNGLISVERTEXARRAYPROC>
typealias PFNGLISVERTEXARRAYPROC = CPointer<CFunction<(GLuint) -> GLboolean>>

typealias PFNGLDRAWARRAYSINSTANCEDPROCVar = CPointerVarOf<PFNGLDRAWARRAYSINSTANCEDPROC>
typealias PFNGLDRAWARRAYSINSTANCEDPROC = CPointer<CFunction<(GLenum, GLint, GLsizei, GLsizei) -> Unit>>

typealias PFNGLDRAWELEMENTSINSTANCEDPROCVar = CPointerVarOf<PFNGLDRAWELEMENTSINSTANCEDPROC>
typealias PFNGLDRAWELEMENTSINSTANCEDPROC = CPointer<CFunction<(GLenum, GLsizei, GLenum, COpaquePointer?, GLsizei) -> Unit>>

typealias PFNGLTEXBUFFERPROCVar = CPointerVarOf<PFNGLTEXBUFFERPROC>
typealias PFNGLTEXBUFFERPROC = CPointer<CFunction<(GLenum, GLenum, GLuint) -> Unit>>

typealias PFNGLPRIMITIVERESTARTINDEXPROCVar = CPointerVarOf<PFNGLPRIMITIVERESTARTINDEXPROC>
typealias PFNGLPRIMITIVERESTARTINDEXPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLCOPYBUFFERSUBDATAPROCVar = CPointerVarOf<PFNGLCOPYBUFFERSUBDATAPROC>
typealias PFNGLCOPYBUFFERSUBDATAPROC = CPointer<CFunction<(GLenum, GLenum, GLintptr, GLintptr, GLsizeiptr) -> Unit>>

typealias PFNGLGETUNIFORMINDICESPROCVar = CPointerVarOf<PFNGLGETUNIFORMINDICESPROC>
typealias PFNGLGETUNIFORMINDICESPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<CPointerVar<GLcharVar>>?, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGETACTIVEUNIFORMSIVPROCVar = CPointerVarOf<PFNGLGETACTIVEUNIFORMSIVPROC>
typealias PFNGLGETACTIVEUNIFORMSIVPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLuintVar>?, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETACTIVEUNIFORMNAMEPROCVar = CPointerVarOf<PFNGLGETACTIVEUNIFORMNAMEPROC>
typealias PFNGLGETACTIVEUNIFORMNAMEPROC = CPointer<CFunction<(GLuint, GLuint, GLsizei, CPointer<GLsizeiVar>?, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLGETUNIFORMBLOCKINDEXPROCVar = CPointerVarOf<PFNGLGETUNIFORMBLOCKINDEXPROC>
typealias PFNGLGETUNIFORMBLOCKINDEXPROC = CPointer<CFunction<(GLuint, CPointer<GLcharVar>?) -> GLuint>>

typealias PFNGLGETACTIVEUNIFORMBLOCKIVPROCVar = CPointerVarOf<PFNGLGETACTIVEUNIFORMBLOCKIVPROC>
typealias PFNGLGETACTIVEUNIFORMBLOCKIVPROC = CPointer<CFunction<(GLuint, GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETACTIVEUNIFORMBLOCKNAMEPROCVar = CPointerVarOf<PFNGLGETACTIVEUNIFORMBLOCKNAMEPROC>
typealias PFNGLGETACTIVEUNIFORMBLOCKNAMEPROC = CPointer<CFunction<(GLuint, GLuint, GLsizei, CPointer<GLsizeiVar>?, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLUNIFORMBLOCKBINDINGPROCVar = CPointerVarOf<PFNGLUNIFORMBLOCKBINDINGPROC>
typealias PFNGLUNIFORMBLOCKBINDINGPROC = CPointer<CFunction<(GLuint, GLuint, GLuint) -> Unit>>

typealias GLsyncVar = CPointerVarOf<GLsync>
typealias GLsync = CPointer<__GLsync>

typealias __gwchar_tVar = IntVarOf<__gwchar_t>
typealias __gwchar_t = Int

typealias GLuint64Var = ULongVarOf<GLuint64>
typealias GLuint64 = uint64_t

typealias GLint64Var = LongVarOf<GLint64>
typealias GLint64 = int64_t

typealias PFNGLDRAWELEMENTSBASEVERTEXPROCVar = CPointerVarOf<PFNGLDRAWELEMENTSBASEVERTEXPROC>
typealias PFNGLDRAWELEMENTSBASEVERTEXPROC = CPointer<CFunction<(GLenum, GLsizei, GLenum, COpaquePointer?, GLint) -> Unit>>

typealias PFNGLDRAWRANGEELEMENTSBASEVERTEXPROCVar = CPointerVarOf<PFNGLDRAWRANGEELEMENTSBASEVERTEXPROC>
typealias PFNGLDRAWRANGEELEMENTSBASEVERTEXPROC = CPointer<CFunction<(GLenum, GLuint, GLuint, GLsizei, GLenum, COpaquePointer?, GLint) -> Unit>>

typealias PFNGLDRAWELEMENTSINSTANCEDBASEVERTEXPROCVar = CPointerVarOf<PFNGLDRAWELEMENTSINSTANCEDBASEVERTEXPROC>
typealias PFNGLDRAWELEMENTSINSTANCEDBASEVERTEXPROC = CPointer<CFunction<(GLenum, GLsizei, GLenum, COpaquePointer?, GLsizei, GLint) -> Unit>>

typealias PFNGLMULTIDRAWELEMENTSBASEVERTEXPROCVar = CPointerVarOf<PFNGLMULTIDRAWELEMENTSBASEVERTEXPROC>
typealias PFNGLMULTIDRAWELEMENTSBASEVERTEXPROC = CPointer<CFunction<(GLenum, CPointer<GLsizeiVar>?, GLenum, CPointer<COpaquePointerVar>?, GLsizei, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLPROVOKINGVERTEXPROCVar = CPointerVarOf<PFNGLPROVOKINGVERTEXPROC>
typealias PFNGLPROVOKINGVERTEXPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLFENCESYNCPROCVar = CPointerVarOf<PFNGLFENCESYNCPROC>
typealias PFNGLFENCESYNCPROC = CPointer<CFunction<(GLenum, GLbitfield) -> GLsync?>>

typealias PFNGLISSYNCPROCVar = CPointerVarOf<PFNGLISSYNCPROC>
typealias PFNGLISSYNCPROC = CPointer<CFunction<(GLsync?) -> GLboolean>>

typealias PFNGLDELETESYNCPROCVar = CPointerVarOf<PFNGLDELETESYNCPROC>
typealias PFNGLDELETESYNCPROC = CPointer<CFunction<(GLsync?) -> Unit>>

typealias PFNGLCLIENTWAITSYNCPROCVar = CPointerVarOf<PFNGLCLIENTWAITSYNCPROC>
typealias PFNGLCLIENTWAITSYNCPROC = CPointer<CFunction<(GLsync?, GLbitfield, GLuint64) -> GLenum>>

typealias PFNGLWAITSYNCPROCVar = CPointerVarOf<PFNGLWAITSYNCPROC>
typealias PFNGLWAITSYNCPROC = CPointer<CFunction<(GLsync?, GLbitfield, GLuint64) -> Unit>>

typealias PFNGLGETINTEGER64VPROCVar = CPointerVarOf<PFNGLGETINTEGER64VPROC>
typealias PFNGLGETINTEGER64VPROC = CPointer<CFunction<(GLenum, CPointer<GLint64Var>?) -> Unit>>

typealias PFNGLGETSYNCIVPROCVar = CPointerVarOf<PFNGLGETSYNCIVPROC>
typealias PFNGLGETSYNCIVPROC = CPointer<CFunction<(GLsync?, GLenum, GLsizei, CPointer<GLsizeiVar>?, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETINTEGER64I_VPROCVar = CPointerVarOf<PFNGLGETINTEGER64I_VPROC>
typealias PFNGLGETINTEGER64I_VPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<GLint64Var>?) -> Unit>>

typealias PFNGLGETBUFFERPARAMETERI64VPROCVar = CPointerVarOf<PFNGLGETBUFFERPARAMETERI64VPROC>
typealias PFNGLGETBUFFERPARAMETERI64VPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLint64Var>?) -> Unit>>

typealias PFNGLFRAMEBUFFERTEXTUREPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERTEXTUREPROC>
typealias PFNGLFRAMEBUFFERTEXTUREPROC = CPointer<CFunction<(GLenum, GLenum, GLuint, GLint) -> Unit>>

typealias PFNGLTEXIMAGE2DMULTISAMPLEPROCVar = CPointerVarOf<PFNGLTEXIMAGE2DMULTISAMPLEPROC>
typealias PFNGLTEXIMAGE2DMULTISAMPLEPROC = CPointer<CFunction<(GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLboolean) -> Unit>>

typealias PFNGLTEXIMAGE3DMULTISAMPLEPROCVar = CPointerVarOf<PFNGLTEXIMAGE3DMULTISAMPLEPROC>
typealias PFNGLTEXIMAGE3DMULTISAMPLEPROC = CPointer<CFunction<(GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLsizei, GLboolean) -> Unit>>

typealias PFNGLGETMULTISAMPLEFVPROCVar = CPointerVarOf<PFNGLGETMULTISAMPLEFVPROC>
typealias PFNGLGETMULTISAMPLEFVPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLSAMPLEMASKIPROCVar = CPointerVarOf<PFNGLSAMPLEMASKIPROC>
typealias PFNGLSAMPLEMASKIPROC = CPointer<CFunction<(GLuint, GLbitfield) -> Unit>>

typealias PFNGLBINDFRAGDATALOCATIONINDEXEDPROCVar = CPointerVarOf<PFNGLBINDFRAGDATALOCATIONINDEXEDPROC>
typealias PFNGLBINDFRAGDATALOCATIONINDEXEDPROC = CPointer<CFunction<(GLuint, GLuint, GLuint, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLGETFRAGDATAINDEXPROCVar = CPointerVarOf<PFNGLGETFRAGDATAINDEXPROC>
typealias PFNGLGETFRAGDATAINDEXPROC = CPointer<CFunction<(GLuint, CPointer<GLcharVar>?) -> GLint>>

typealias PFNGLGENSAMPLERSPROCVar = CPointerVarOf<PFNGLGENSAMPLERSPROC>
typealias PFNGLGENSAMPLERSPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLDELETESAMPLERSPROCVar = CPointerVarOf<PFNGLDELETESAMPLERSPROC>
typealias PFNGLDELETESAMPLERSPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLISSAMPLERPROCVar = CPointerVarOf<PFNGLISSAMPLERPROC>
typealias PFNGLISSAMPLERPROC = CPointer<CFunction<(GLuint) -> GLboolean>>

typealias PFNGLBINDSAMPLERPROCVar = CPointerVarOf<PFNGLBINDSAMPLERPROC>
typealias PFNGLBINDSAMPLERPROC = CPointer<CFunction<(GLuint, GLuint) -> Unit>>

typealias PFNGLSAMPLERPARAMETERIPROCVar = CPointerVarOf<PFNGLSAMPLERPARAMETERIPROC>
typealias PFNGLSAMPLERPARAMETERIPROC = CPointer<CFunction<(GLuint, GLenum, GLint) -> Unit>>

typealias PFNGLSAMPLERPARAMETERIVPROCVar = CPointerVarOf<PFNGLSAMPLERPARAMETERIVPROC>
typealias PFNGLSAMPLERPARAMETERIVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLSAMPLERPARAMETERFPROCVar = CPointerVarOf<PFNGLSAMPLERPARAMETERFPROC>
typealias PFNGLSAMPLERPARAMETERFPROC = CPointer<CFunction<(GLuint, GLenum, GLfloat) -> Unit>>

typealias PFNGLSAMPLERPARAMETERFVPROCVar = CPointerVarOf<PFNGLSAMPLERPARAMETERFVPROC>
typealias PFNGLSAMPLERPARAMETERFVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLSAMPLERPARAMETERIIVPROCVar = CPointerVarOf<PFNGLSAMPLERPARAMETERIIVPROC>
typealias PFNGLSAMPLERPARAMETERIIVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLSAMPLERPARAMETERIUIVPROCVar = CPointerVarOf<PFNGLSAMPLERPARAMETERIUIVPROC>
typealias PFNGLSAMPLERPARAMETERIUIVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGETSAMPLERPARAMETERIVPROCVar = CPointerVarOf<PFNGLGETSAMPLERPARAMETERIVPROC>
typealias PFNGLGETSAMPLERPARAMETERIVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETSAMPLERPARAMETERIIVPROCVar = CPointerVarOf<PFNGLGETSAMPLERPARAMETERIIVPROC>
typealias PFNGLGETSAMPLERPARAMETERIIVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETSAMPLERPARAMETERFVPROCVar = CPointerVarOf<PFNGLGETSAMPLERPARAMETERFVPROC>
typealias PFNGLGETSAMPLERPARAMETERFVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETSAMPLERPARAMETERIUIVPROCVar = CPointerVarOf<PFNGLGETSAMPLERPARAMETERIUIVPROC>
typealias PFNGLGETSAMPLERPARAMETERIUIVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLQUERYCOUNTERPROCVar = CPointerVarOf<PFNGLQUERYCOUNTERPROC>
typealias PFNGLQUERYCOUNTERPROC = CPointer<CFunction<(GLuint, GLenum) -> Unit>>

typealias PFNGLGETQUERYOBJECTI64VPROCVar = CPointerVarOf<PFNGLGETQUERYOBJECTI64VPROC>
typealias PFNGLGETQUERYOBJECTI64VPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLint64Var>?) -> Unit>>

typealias PFNGLGETQUERYOBJECTUI64VPROCVar = CPointerVarOf<PFNGLGETQUERYOBJECTUI64VPROC>
typealias PFNGLGETQUERYOBJECTUI64VPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLuint64Var>?) -> Unit>>

typealias PFNGLVERTEXATTRIBDIVISORPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBDIVISORPROC>
typealias PFNGLVERTEXATTRIBDIVISORPROC = CPointer<CFunction<(GLuint, GLuint) -> Unit>>

typealias PFNGLVERTEXATTRIBP1UIPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBP1UIPROC>
typealias PFNGLVERTEXATTRIBP1UIPROC = CPointer<CFunction<(GLuint, GLenum, GLboolean, GLuint) -> Unit>>

typealias PFNGLVERTEXATTRIBP1UIVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBP1UIVPROC>
typealias PFNGLVERTEXATTRIBP1UIVPROC = CPointer<CFunction<(GLuint, GLenum, GLboolean, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBP2UIPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBP2UIPROC>
typealias PFNGLVERTEXATTRIBP2UIPROC = CPointer<CFunction<(GLuint, GLenum, GLboolean, GLuint) -> Unit>>

typealias PFNGLVERTEXATTRIBP2UIVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBP2UIVPROC>
typealias PFNGLVERTEXATTRIBP2UIVPROC = CPointer<CFunction<(GLuint, GLenum, GLboolean, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBP3UIPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBP3UIPROC>
typealias PFNGLVERTEXATTRIBP3UIPROC = CPointer<CFunction<(GLuint, GLenum, GLboolean, GLuint) -> Unit>>

typealias PFNGLVERTEXATTRIBP3UIVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBP3UIVPROC>
typealias PFNGLVERTEXATTRIBP3UIVPROC = CPointer<CFunction<(GLuint, GLenum, GLboolean, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBP4UIPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBP4UIPROC>
typealias PFNGLVERTEXATTRIBP4UIPROC = CPointer<CFunction<(GLuint, GLenum, GLboolean, GLuint) -> Unit>>

typealias PFNGLVERTEXATTRIBP4UIVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBP4UIVPROC>
typealias PFNGLVERTEXATTRIBP4UIVPROC = CPointer<CFunction<(GLuint, GLenum, GLboolean, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLVERTEXP2UIPROCVar = CPointerVarOf<PFNGLVERTEXP2UIPROC>
typealias PFNGLVERTEXP2UIPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLVERTEXP2UIVPROCVar = CPointerVarOf<PFNGLVERTEXP2UIVPROC>
typealias PFNGLVERTEXP2UIVPROC = CPointer<CFunction<(GLenum, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLVERTEXP3UIPROCVar = CPointerVarOf<PFNGLVERTEXP3UIPROC>
typealias PFNGLVERTEXP3UIPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLVERTEXP3UIVPROCVar = CPointerVarOf<PFNGLVERTEXP3UIVPROC>
typealias PFNGLVERTEXP3UIVPROC = CPointer<CFunction<(GLenum, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLVERTEXP4UIPROCVar = CPointerVarOf<PFNGLVERTEXP4UIPROC>
typealias PFNGLVERTEXP4UIPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLVERTEXP4UIVPROCVar = CPointerVarOf<PFNGLVERTEXP4UIVPROC>
typealias PFNGLVERTEXP4UIVPROC = CPointer<CFunction<(GLenum, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLTEXCOORDP1UIPROCVar = CPointerVarOf<PFNGLTEXCOORDP1UIPROC>
typealias PFNGLTEXCOORDP1UIPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLTEXCOORDP1UIVPROCVar = CPointerVarOf<PFNGLTEXCOORDP1UIVPROC>
typealias PFNGLTEXCOORDP1UIVPROC = CPointer<CFunction<(GLenum, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLTEXCOORDP2UIPROCVar = CPointerVarOf<PFNGLTEXCOORDP2UIPROC>
typealias PFNGLTEXCOORDP2UIPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLTEXCOORDP2UIVPROCVar = CPointerVarOf<PFNGLTEXCOORDP2UIVPROC>
typealias PFNGLTEXCOORDP2UIVPROC = CPointer<CFunction<(GLenum, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLTEXCOORDP3UIPROCVar = CPointerVarOf<PFNGLTEXCOORDP3UIPROC>
typealias PFNGLTEXCOORDP3UIPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLTEXCOORDP3UIVPROCVar = CPointerVarOf<PFNGLTEXCOORDP3UIVPROC>
typealias PFNGLTEXCOORDP3UIVPROC = CPointer<CFunction<(GLenum, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLTEXCOORDP4UIPROCVar = CPointerVarOf<PFNGLTEXCOORDP4UIPROC>
typealias PFNGLTEXCOORDP4UIPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLTEXCOORDP4UIVPROCVar = CPointerVarOf<PFNGLTEXCOORDP4UIVPROC>
typealias PFNGLTEXCOORDP4UIVPROC = CPointer<CFunction<(GLenum, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLMULTITEXCOORDP1UIPROCVar = CPointerVarOf<PFNGLMULTITEXCOORDP1UIPROC>
typealias PFNGLMULTITEXCOORDP1UIPROC = CPointer<CFunction<(GLenum, GLenum, GLuint) -> Unit>>

typealias PFNGLMULTITEXCOORDP1UIVPROCVar = CPointerVarOf<PFNGLMULTITEXCOORDP1UIVPROC>
typealias PFNGLMULTITEXCOORDP1UIVPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLMULTITEXCOORDP2UIPROCVar = CPointerVarOf<PFNGLMULTITEXCOORDP2UIPROC>
typealias PFNGLMULTITEXCOORDP2UIPROC = CPointer<CFunction<(GLenum, GLenum, GLuint) -> Unit>>

typealias PFNGLMULTITEXCOORDP2UIVPROCVar = CPointerVarOf<PFNGLMULTITEXCOORDP2UIVPROC>
typealias PFNGLMULTITEXCOORDP2UIVPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLMULTITEXCOORDP3UIPROCVar = CPointerVarOf<PFNGLMULTITEXCOORDP3UIPROC>
typealias PFNGLMULTITEXCOORDP3UIPROC = CPointer<CFunction<(GLenum, GLenum, GLuint) -> Unit>>

typealias PFNGLMULTITEXCOORDP3UIVPROCVar = CPointerVarOf<PFNGLMULTITEXCOORDP3UIVPROC>
typealias PFNGLMULTITEXCOORDP3UIVPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLMULTITEXCOORDP4UIPROCVar = CPointerVarOf<PFNGLMULTITEXCOORDP4UIPROC>
typealias PFNGLMULTITEXCOORDP4UIPROC = CPointer<CFunction<(GLenum, GLenum, GLuint) -> Unit>>

typealias PFNGLMULTITEXCOORDP4UIVPROCVar = CPointerVarOf<PFNGLMULTITEXCOORDP4UIVPROC>
typealias PFNGLMULTITEXCOORDP4UIVPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLNORMALP3UIPROCVar = CPointerVarOf<PFNGLNORMALP3UIPROC>
typealias PFNGLNORMALP3UIPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLNORMALP3UIVPROCVar = CPointerVarOf<PFNGLNORMALP3UIVPROC>
typealias PFNGLNORMALP3UIVPROC = CPointer<CFunction<(GLenum, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLCOLORP3UIPROCVar = CPointerVarOf<PFNGLCOLORP3UIPROC>
typealias PFNGLCOLORP3UIPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLCOLORP3UIVPROCVar = CPointerVarOf<PFNGLCOLORP3UIVPROC>
typealias PFNGLCOLORP3UIVPROC = CPointer<CFunction<(GLenum, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLCOLORP4UIPROCVar = CPointerVarOf<PFNGLCOLORP4UIPROC>
typealias PFNGLCOLORP4UIPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLCOLORP4UIVPROCVar = CPointerVarOf<PFNGLCOLORP4UIVPROC>
typealias PFNGLCOLORP4UIVPROC = CPointer<CFunction<(GLenum, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLSECONDARYCOLORP3UIPROCVar = CPointerVarOf<PFNGLSECONDARYCOLORP3UIPROC>
typealias PFNGLSECONDARYCOLORP3UIPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLSECONDARYCOLORP3UIVPROCVar = CPointerVarOf<PFNGLSECONDARYCOLORP3UIVPROC>
typealias PFNGLSECONDARYCOLORP3UIVPROC = CPointer<CFunction<(GLenum, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLMINSAMPLESHADINGPROCVar = CPointerVarOf<PFNGLMINSAMPLESHADINGPROC>
typealias PFNGLMINSAMPLESHADINGPROC = CPointer<CFunction<(GLfloat) -> Unit>>

typealias PFNGLBLENDEQUATIONIPROCVar = CPointerVarOf<PFNGLBLENDEQUATIONIPROC>
typealias PFNGLBLENDEQUATIONIPROC = CPointer<CFunction<(GLuint, GLenum) -> Unit>>

typealias PFNGLBLENDEQUATIONSEPARATEIPROCVar = CPointerVarOf<PFNGLBLENDEQUATIONSEPARATEIPROC>
typealias PFNGLBLENDEQUATIONSEPARATEIPROC = CPointer<CFunction<(GLuint, GLenum, GLenum) -> Unit>>

typealias PFNGLBLENDFUNCIPROCVar = CPointerVarOf<PFNGLBLENDFUNCIPROC>
typealias PFNGLBLENDFUNCIPROC = CPointer<CFunction<(GLuint, GLenum, GLenum) -> Unit>>

typealias PFNGLBLENDFUNCSEPARATEIPROCVar = CPointerVarOf<PFNGLBLENDFUNCSEPARATEIPROC>
typealias PFNGLBLENDFUNCSEPARATEIPROC = CPointer<CFunction<(GLuint, GLenum, GLenum, GLenum, GLenum) -> Unit>>

typealias PFNGLDRAWARRAYSINDIRECTPROCVar = CPointerVarOf<PFNGLDRAWARRAYSINDIRECTPROC>
typealias PFNGLDRAWARRAYSINDIRECTPROC = CPointer<CFunction<(GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLDRAWELEMENTSINDIRECTPROCVar = CPointerVarOf<PFNGLDRAWELEMENTSINDIRECTPROC>
typealias PFNGLDRAWELEMENTSINDIRECTPROC = CPointer<CFunction<(GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLUNIFORM1DPROCVar = CPointerVarOf<PFNGLUNIFORM1DPROC>
typealias PFNGLUNIFORM1DPROC = CPointer<CFunction<(GLint, GLdouble) -> Unit>>

typealias PFNGLUNIFORM2DPROCVar = CPointerVarOf<PFNGLUNIFORM2DPROC>
typealias PFNGLUNIFORM2DPROC = CPointer<CFunction<(GLint, GLdouble, GLdouble) -> Unit>>

typealias PFNGLUNIFORM3DPROCVar = CPointerVarOf<PFNGLUNIFORM3DPROC>
typealias PFNGLUNIFORM3DPROC = CPointer<CFunction<(GLint, GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLUNIFORM4DPROCVar = CPointerVarOf<PFNGLUNIFORM4DPROC>
typealias PFNGLUNIFORM4DPROC = CPointer<CFunction<(GLint, GLdouble, GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLUNIFORM1DVPROCVar = CPointerVarOf<PFNGLUNIFORM1DVPROC>
typealias PFNGLUNIFORM1DVPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLUNIFORM2DVPROCVar = CPointerVarOf<PFNGLUNIFORM2DVPROC>
typealias PFNGLUNIFORM2DVPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLUNIFORM3DVPROCVar = CPointerVarOf<PFNGLUNIFORM3DVPROC>
typealias PFNGLUNIFORM3DVPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLUNIFORM4DVPROCVar = CPointerVarOf<PFNGLUNIFORM4DVPROC>
typealias PFNGLUNIFORM4DVPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLUNIFORMMATRIX2DVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX2DVPROC>
typealias PFNGLUNIFORMMATRIX2DVPROC = CPointer<CFunction<(GLint, GLsizei, GLboolean, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLUNIFORMMATRIX3DVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX3DVPROC>
typealias PFNGLUNIFORMMATRIX3DVPROC = CPointer<CFunction<(GLint, GLsizei, GLboolean, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLUNIFORMMATRIX4DVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX4DVPROC>
typealias PFNGLUNIFORMMATRIX4DVPROC = CPointer<CFunction<(GLint, GLsizei, GLboolean, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLUNIFORMMATRIX2X3DVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX2X3DVPROC>
typealias PFNGLUNIFORMMATRIX2X3DVPROC = CPointer<CFunction<(GLint, GLsizei, GLboolean, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLUNIFORMMATRIX2X4DVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX2X4DVPROC>
typealias PFNGLUNIFORMMATRIX2X4DVPROC = CPointer<CFunction<(GLint, GLsizei, GLboolean, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLUNIFORMMATRIX3X2DVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX3X2DVPROC>
typealias PFNGLUNIFORMMATRIX3X2DVPROC = CPointer<CFunction<(GLint, GLsizei, GLboolean, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLUNIFORMMATRIX3X4DVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX3X4DVPROC>
typealias PFNGLUNIFORMMATRIX3X4DVPROC = CPointer<CFunction<(GLint, GLsizei, GLboolean, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLUNIFORMMATRIX4X2DVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX4X2DVPROC>
typealias PFNGLUNIFORMMATRIX4X2DVPROC = CPointer<CFunction<(GLint, GLsizei, GLboolean, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLUNIFORMMATRIX4X3DVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX4X3DVPROC>
typealias PFNGLUNIFORMMATRIX4X3DVPROC = CPointer<CFunction<(GLint, GLsizei, GLboolean, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLGETUNIFORMDVPROCVar = CPointerVarOf<PFNGLGETUNIFORMDVPROC>
typealias PFNGLGETUNIFORMDVPROC = CPointer<CFunction<(GLuint, GLint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLGETSUBROUTINEUNIFORMLOCATIONPROCVar = CPointerVarOf<PFNGLGETSUBROUTINEUNIFORMLOCATIONPROC>
typealias PFNGLGETSUBROUTINEUNIFORMLOCATIONPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLcharVar>?) -> GLint>>

typealias PFNGLGETSUBROUTINEINDEXPROCVar = CPointerVarOf<PFNGLGETSUBROUTINEINDEXPROC>
typealias PFNGLGETSUBROUTINEINDEXPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLcharVar>?) -> GLuint>>

typealias PFNGLGETACTIVESUBROUTINEUNIFORMIVPROCVar = CPointerVarOf<PFNGLGETACTIVESUBROUTINEUNIFORMIVPROC>
typealias PFNGLGETACTIVESUBROUTINEUNIFORMIVPROC = CPointer<CFunction<(GLuint, GLenum, GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETACTIVESUBROUTINEUNIFORMNAMEPROCVar = CPointerVarOf<PFNGLGETACTIVESUBROUTINEUNIFORMNAMEPROC>
typealias PFNGLGETACTIVESUBROUTINEUNIFORMNAMEPROC = CPointer<CFunction<(GLuint, GLenum, GLuint, GLsizei, CPointer<GLsizeiVar>?, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLGETACTIVESUBROUTINENAMEPROCVar = CPointerVarOf<PFNGLGETACTIVESUBROUTINENAMEPROC>
typealias PFNGLGETACTIVESUBROUTINENAMEPROC = CPointer<CFunction<(GLuint, GLenum, GLuint, GLsizei, CPointer<GLsizeiVar>?, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLUNIFORMSUBROUTINESUIVPROCVar = CPointerVarOf<PFNGLUNIFORMSUBROUTINESUIVPROC>
typealias PFNGLUNIFORMSUBROUTINESUIVPROC = CPointer<CFunction<(GLenum, GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGETUNIFORMSUBROUTINEUIVPROCVar = CPointerVarOf<PFNGLGETUNIFORMSUBROUTINEUIVPROC>
typealias PFNGLGETUNIFORMSUBROUTINEUIVPROC = CPointer<CFunction<(GLenum, GLint, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGETPROGRAMSTAGEIVPROCVar = CPointerVarOf<PFNGLGETPROGRAMSTAGEIVPROC>
typealias PFNGLGETPROGRAMSTAGEIVPROC = CPointer<CFunction<(GLuint, GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLPATCHPARAMETERIPROCVar = CPointerVarOf<PFNGLPATCHPARAMETERIPROC>
typealias PFNGLPATCHPARAMETERIPROC = CPointer<CFunction<(GLenum, GLint) -> Unit>>

typealias PFNGLPATCHPARAMETERFVPROCVar = CPointerVarOf<PFNGLPATCHPARAMETERFVPROC>
typealias PFNGLPATCHPARAMETERFVPROC = CPointer<CFunction<(GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLBINDTRANSFORMFEEDBACKPROCVar = CPointerVarOf<PFNGLBINDTRANSFORMFEEDBACKPROC>
typealias PFNGLBINDTRANSFORMFEEDBACKPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLDELETETRANSFORMFEEDBACKSPROCVar = CPointerVarOf<PFNGLDELETETRANSFORMFEEDBACKSPROC>
typealias PFNGLDELETETRANSFORMFEEDBACKSPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGENTRANSFORMFEEDBACKSPROCVar = CPointerVarOf<PFNGLGENTRANSFORMFEEDBACKSPROC>
typealias PFNGLGENTRANSFORMFEEDBACKSPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLISTRANSFORMFEEDBACKPROCVar = CPointerVarOf<PFNGLISTRANSFORMFEEDBACKPROC>
typealias PFNGLISTRANSFORMFEEDBACKPROC = CPointer<CFunction<(GLuint) -> GLboolean>>

typealias PFNGLPAUSETRANSFORMFEEDBACKPROCVar = CPointerVarOf<PFNGLPAUSETRANSFORMFEEDBACKPROC>
typealias PFNGLPAUSETRANSFORMFEEDBACKPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLRESUMETRANSFORMFEEDBACKPROCVar = CPointerVarOf<PFNGLRESUMETRANSFORMFEEDBACKPROC>
typealias PFNGLRESUMETRANSFORMFEEDBACKPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLDRAWTRANSFORMFEEDBACKPROCVar = CPointerVarOf<PFNGLDRAWTRANSFORMFEEDBACKPROC>
typealias PFNGLDRAWTRANSFORMFEEDBACKPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLDRAWTRANSFORMFEEDBACKSTREAMPROCVar = CPointerVarOf<PFNGLDRAWTRANSFORMFEEDBACKSTREAMPROC>
typealias PFNGLDRAWTRANSFORMFEEDBACKSTREAMPROC = CPointer<CFunction<(GLenum, GLuint, GLuint) -> Unit>>

typealias PFNGLBEGINQUERYINDEXEDPROCVar = CPointerVarOf<PFNGLBEGINQUERYINDEXEDPROC>
typealias PFNGLBEGINQUERYINDEXEDPROC = CPointer<CFunction<(GLenum, GLuint, GLuint) -> Unit>>

typealias PFNGLENDQUERYINDEXEDPROCVar = CPointerVarOf<PFNGLENDQUERYINDEXEDPROC>
typealias PFNGLENDQUERYINDEXEDPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLGETQUERYINDEXEDIVPROCVar = CPointerVarOf<PFNGLGETQUERYINDEXEDIVPROC>
typealias PFNGLGETQUERYINDEXEDIVPROC = CPointer<CFunction<(GLenum, GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLRELEASESHADERCOMPILERPROCVar = CPointerVarOf<PFNGLRELEASESHADERCOMPILERPROC>
typealias PFNGLRELEASESHADERCOMPILERPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLSHADERBINARYPROCVar = CPointerVarOf<PFNGLSHADERBINARYPROC>
typealias PFNGLSHADERBINARYPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?, GLenum, COpaquePointer?, GLsizei) -> Unit>>

typealias PFNGLGETSHADERPRECISIONFORMATPROCVar = CPointerVarOf<PFNGLGETSHADERPRECISIONFORMATPROC>
typealias PFNGLGETSHADERPRECISIONFORMATPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLintVar>?, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLDEPTHRANGEFPROCVar = CPointerVarOf<PFNGLDEPTHRANGEFPROC>
typealias PFNGLDEPTHRANGEFPROC = CPointer<CFunction<(GLfloat, GLfloat) -> Unit>>

typealias PFNGLCLEARDEPTHFPROCVar = CPointerVarOf<PFNGLCLEARDEPTHFPROC>
typealias PFNGLCLEARDEPTHFPROC = CPointer<CFunction<(GLfloat) -> Unit>>

typealias PFNGLGETPROGRAMBINARYPROCVar = CPointerVarOf<PFNGLGETPROGRAMBINARYPROC>
typealias PFNGLGETPROGRAMBINARYPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLsizeiVar>?, CPointer<GLenumVar>?, COpaquePointer?) -> Unit>>

typealias PFNGLPROGRAMBINARYPROCVar = CPointerVarOf<PFNGLPROGRAMBINARYPROC>
typealias PFNGLPROGRAMBINARYPROC = CPointer<CFunction<(GLuint, GLenum, COpaquePointer?, GLsizei) -> Unit>>

typealias PFNGLPROGRAMPARAMETERIPROCVar = CPointerVarOf<PFNGLPROGRAMPARAMETERIPROC>
typealias PFNGLPROGRAMPARAMETERIPROC = CPointer<CFunction<(GLuint, GLenum, GLint) -> Unit>>

typealias PFNGLUSEPROGRAMSTAGESPROCVar = CPointerVarOf<PFNGLUSEPROGRAMSTAGESPROC>
typealias PFNGLUSEPROGRAMSTAGESPROC = CPointer<CFunction<(GLuint, GLbitfield, GLuint) -> Unit>>

typealias PFNGLACTIVESHADERPROGRAMPROCVar = CPointerVarOf<PFNGLACTIVESHADERPROGRAMPROC>
typealias PFNGLACTIVESHADERPROGRAMPROC = CPointer<CFunction<(GLuint, GLuint) -> Unit>>

typealias PFNGLCREATESHADERPROGRAMVPROCVar = CPointerVarOf<PFNGLCREATESHADERPROGRAMVPROC>
typealias PFNGLCREATESHADERPROGRAMVPROC = CPointer<CFunction<(GLenum, GLsizei, CPointer<CPointerVar<GLcharVar>>?) -> GLuint>>

typealias PFNGLBINDPROGRAMPIPELINEPROCVar = CPointerVarOf<PFNGLBINDPROGRAMPIPELINEPROC>
typealias PFNGLBINDPROGRAMPIPELINEPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLDELETEPROGRAMPIPELINESPROCVar = CPointerVarOf<PFNGLDELETEPROGRAMPIPELINESPROC>
typealias PFNGLDELETEPROGRAMPIPELINESPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGENPROGRAMPIPELINESPROCVar = CPointerVarOf<PFNGLGENPROGRAMPIPELINESPROC>
typealias PFNGLGENPROGRAMPIPELINESPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLISPROGRAMPIPELINEPROCVar = CPointerVarOf<PFNGLISPROGRAMPIPELINEPROC>
typealias PFNGLISPROGRAMPIPELINEPROC = CPointer<CFunction<(GLuint) -> GLboolean>>

typealias PFNGLGETPROGRAMPIPELINEIVPROCVar = CPointerVarOf<PFNGLGETPROGRAMPIPELINEIVPROC>
typealias PFNGLGETPROGRAMPIPELINEIVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM1IPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1IPROC>
typealias PFNGLPROGRAMUNIFORM1IPROC = CPointer<CFunction<(GLuint, GLint, GLint) -> Unit>>

typealias PFNGLPROGRAMUNIFORM1IVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1IVPROC>
typealias PFNGLPROGRAMUNIFORM1IVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM1FPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1FPROC>
typealias PFNGLPROGRAMUNIFORM1FPROC = CPointer<CFunction<(GLuint, GLint, GLfloat) -> Unit>>

typealias PFNGLPROGRAMUNIFORM1FVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1FVPROC>
typealias PFNGLPROGRAMUNIFORM1FVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM1DPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1DPROC>
typealias PFNGLPROGRAMUNIFORM1DPROC = CPointer<CFunction<(GLuint, GLint, GLdouble) -> Unit>>

typealias PFNGLPROGRAMUNIFORM1DVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1DVPROC>
typealias PFNGLPROGRAMUNIFORM1DVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM1UIPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1UIPROC>
typealias PFNGLPROGRAMUNIFORM1UIPROC = CPointer<CFunction<(GLuint, GLint, GLuint) -> Unit>>

typealias PFNGLPROGRAMUNIFORM1UIVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1UIVPROC>
typealias PFNGLPROGRAMUNIFORM1UIVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM2IPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2IPROC>
typealias PFNGLPROGRAMUNIFORM2IPROC = CPointer<CFunction<(GLuint, GLint, GLint, GLint) -> Unit>>

typealias PFNGLPROGRAMUNIFORM2IVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2IVPROC>
typealias PFNGLPROGRAMUNIFORM2IVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM2FPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2FPROC>
typealias PFNGLPROGRAMUNIFORM2FPROC = CPointer<CFunction<(GLuint, GLint, GLfloat, GLfloat) -> Unit>>

typealias PFNGLPROGRAMUNIFORM2FVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2FVPROC>
typealias PFNGLPROGRAMUNIFORM2FVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM2DPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2DPROC>
typealias PFNGLPROGRAMUNIFORM2DPROC = CPointer<CFunction<(GLuint, GLint, GLdouble, GLdouble) -> Unit>>

typealias PFNGLPROGRAMUNIFORM2DVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2DVPROC>
typealias PFNGLPROGRAMUNIFORM2DVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM2UIPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2UIPROC>
typealias PFNGLPROGRAMUNIFORM2UIPROC = CPointer<CFunction<(GLuint, GLint, GLuint, GLuint) -> Unit>>

typealias PFNGLPROGRAMUNIFORM2UIVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2UIVPROC>
typealias PFNGLPROGRAMUNIFORM2UIVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM3IPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3IPROC>
typealias PFNGLPROGRAMUNIFORM3IPROC = CPointer<CFunction<(GLuint, GLint, GLint, GLint, GLint) -> Unit>>

typealias PFNGLPROGRAMUNIFORM3IVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3IVPROC>
typealias PFNGLPROGRAMUNIFORM3IVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM3FPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3FPROC>
typealias PFNGLPROGRAMUNIFORM3FPROC = CPointer<CFunction<(GLuint, GLint, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLPROGRAMUNIFORM3FVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3FVPROC>
typealias PFNGLPROGRAMUNIFORM3FVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM3DPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3DPROC>
typealias PFNGLPROGRAMUNIFORM3DPROC = CPointer<CFunction<(GLuint, GLint, GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLPROGRAMUNIFORM3DVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3DVPROC>
typealias PFNGLPROGRAMUNIFORM3DVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM3UIPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3UIPROC>
typealias PFNGLPROGRAMUNIFORM3UIPROC = CPointer<CFunction<(GLuint, GLint, GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLPROGRAMUNIFORM3UIVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3UIVPROC>
typealias PFNGLPROGRAMUNIFORM3UIVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM4IPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4IPROC>
typealias PFNGLPROGRAMUNIFORM4IPROC = CPointer<CFunction<(GLuint, GLint, GLint, GLint, GLint, GLint) -> Unit>>

typealias PFNGLPROGRAMUNIFORM4IVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4IVPROC>
typealias PFNGLPROGRAMUNIFORM4IVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM4FPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4FPROC>
typealias PFNGLPROGRAMUNIFORM4FPROC = CPointer<CFunction<(GLuint, GLint, GLfloat, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLPROGRAMUNIFORM4FVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4FVPROC>
typealias PFNGLPROGRAMUNIFORM4FVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM4DPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4DPROC>
typealias PFNGLPROGRAMUNIFORM4DPROC = CPointer<CFunction<(GLuint, GLint, GLdouble, GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLPROGRAMUNIFORM4DVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4DVPROC>
typealias PFNGLPROGRAMUNIFORM4DVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM4UIPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4UIPROC>
typealias PFNGLPROGRAMUNIFORM4UIPROC = CPointer<CFunction<(GLuint, GLint, GLuint, GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLPROGRAMUNIFORM4UIVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4UIVPROC>
typealias PFNGLPROGRAMUNIFORM4UIVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX2FVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX2FVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX2FVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX3FVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX3FVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX3FVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX4FVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX4FVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX4FVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX2DVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX2DVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX2DVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX3DVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX3DVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX3DVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX4DVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX4DVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX4DVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX2X3FVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX2X3FVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX2X3FVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX3X2FVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX3X2FVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX3X2FVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX2X4FVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX2X4FVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX2X4FVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX4X2FVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX4X2FVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX4X2FVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX3X4FVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX3X4FVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX3X4FVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX4X3FVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX4X3FVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX4X3FVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX2X3DVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX2X3DVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX2X3DVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX3X2DVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX3X2DVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX3X2DVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX2X4DVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX2X4DVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX2X4DVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX4X2DVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX4X2DVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX4X2DVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX3X4DVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX3X4DVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX3X4DVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX4X3DVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX4X3DVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX4X3DVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLVALIDATEPROGRAMPIPELINEPROCVar = CPointerVarOf<PFNGLVALIDATEPROGRAMPIPELINEPROC>
typealias PFNGLVALIDATEPROGRAMPIPELINEPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLGETPROGRAMPIPELINEINFOLOGPROCVar = CPointerVarOf<PFNGLGETPROGRAMPIPELINEINFOLOGPROC>
typealias PFNGLGETPROGRAMPIPELINEINFOLOGPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLsizeiVar>?, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBL1DPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL1DPROC>
typealias PFNGLVERTEXATTRIBL1DPROC = CPointer<CFunction<(GLuint, GLdouble) -> Unit>>

typealias PFNGLVERTEXATTRIBL2DPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL2DPROC>
typealias PFNGLVERTEXATTRIBL2DPROC = CPointer<CFunction<(GLuint, GLdouble, GLdouble) -> Unit>>

typealias PFNGLVERTEXATTRIBL3DPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL3DPROC>
typealias PFNGLVERTEXATTRIBL3DPROC = CPointer<CFunction<(GLuint, GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLVERTEXATTRIBL4DPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL4DPROC>
typealias PFNGLVERTEXATTRIBL4DPROC = CPointer<CFunction<(GLuint, GLdouble, GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLVERTEXATTRIBL1DVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL1DVPROC>
typealias PFNGLVERTEXATTRIBL1DVPROC = CPointer<CFunction<(GLuint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBL2DVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL2DVPROC>
typealias PFNGLVERTEXATTRIBL2DVPROC = CPointer<CFunction<(GLuint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBL3DVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL3DVPROC>
typealias PFNGLVERTEXATTRIBL3DVPROC = CPointer<CFunction<(GLuint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBL4DVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL4DVPROC>
typealias PFNGLVERTEXATTRIBL4DVPROC = CPointer<CFunction<(GLuint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBLPOINTERPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBLPOINTERPROC>
typealias PFNGLVERTEXATTRIBLPOINTERPROC = CPointer<CFunction<(GLuint, GLint, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLGETVERTEXATTRIBLDVPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBLDVPROC>
typealias PFNGLGETVERTEXATTRIBLDVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLVIEWPORTARRAYVPROCVar = CPointerVarOf<PFNGLVIEWPORTARRAYVPROC>
typealias PFNGLVIEWPORTARRAYVPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLVIEWPORTINDEXEDFPROCVar = CPointerVarOf<PFNGLVIEWPORTINDEXEDFPROC>
typealias PFNGLVIEWPORTINDEXEDFPROC = CPointer<CFunction<(GLuint, GLfloat, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLVIEWPORTINDEXEDFVPROCVar = CPointerVarOf<PFNGLVIEWPORTINDEXEDFVPROC>
typealias PFNGLVIEWPORTINDEXEDFVPROC = CPointer<CFunction<(GLuint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLSCISSORARRAYVPROCVar = CPointerVarOf<PFNGLSCISSORARRAYVPROC>
typealias PFNGLSCISSORARRAYVPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLSCISSORINDEXEDPROCVar = CPointerVarOf<PFNGLSCISSORINDEXEDPROC>
typealias PFNGLSCISSORINDEXEDPROC = CPointer<CFunction<(GLuint, GLint, GLint, GLsizei, GLsizei) -> Unit>>

typealias PFNGLSCISSORINDEXEDVPROCVar = CPointerVarOf<PFNGLSCISSORINDEXEDVPROC>
typealias PFNGLSCISSORINDEXEDVPROC = CPointer<CFunction<(GLuint, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLDEPTHRANGEARRAYVPROCVar = CPointerVarOf<PFNGLDEPTHRANGEARRAYVPROC>
typealias PFNGLDEPTHRANGEARRAYVPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLDEPTHRANGEINDEXEDPROCVar = CPointerVarOf<PFNGLDEPTHRANGEINDEXEDPROC>
typealias PFNGLDEPTHRANGEINDEXEDPROC = CPointer<CFunction<(GLuint, GLdouble, GLdouble) -> Unit>>

typealias PFNGLGETFLOATI_VPROCVar = CPointerVarOf<PFNGLGETFLOATI_VPROC>
typealias PFNGLGETFLOATI_VPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETDOUBLEI_VPROCVar = CPointerVarOf<PFNGLGETDOUBLEI_VPROC>
typealias PFNGLGETDOUBLEI_VPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLDRAWARRAYSINSTANCEDBASEINSTANCEPROCVar = CPointerVarOf<PFNGLDRAWARRAYSINSTANCEDBASEINSTANCEPROC>
typealias PFNGLDRAWARRAYSINSTANCEDBASEINSTANCEPROC = CPointer<CFunction<(GLenum, GLint, GLsizei, GLsizei, GLuint) -> Unit>>

typealias PFNGLDRAWELEMENTSINSTANCEDBASEINSTANCEPROCVar = CPointerVarOf<PFNGLDRAWELEMENTSINSTANCEDBASEINSTANCEPROC>
typealias PFNGLDRAWELEMENTSINSTANCEDBASEINSTANCEPROC = CPointer<CFunction<(GLenum, GLsizei, GLenum, COpaquePointer?, GLsizei, GLuint) -> Unit>>

typealias PFNGLDRAWELEMENTSINSTANCEDBASEVERTEXBASEINSTANCEPROCVar = CPointerVarOf<PFNGLDRAWELEMENTSINSTANCEDBASEVERTEXBASEINSTANCEPROC>
typealias PFNGLDRAWELEMENTSINSTANCEDBASEVERTEXBASEINSTANCEPROC = CPointer<CFunction<(GLenum, GLsizei, GLenum, COpaquePointer?, GLsizei, GLint, GLuint) -> Unit>>

typealias PFNGLGETINTERNALFORMATIVPROCVar = CPointerVarOf<PFNGLGETINTERNALFORMATIVPROC>
typealias PFNGLGETINTERNALFORMATIVPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, GLsizei, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETACTIVEATOMICCOUNTERBUFFERIVPROCVar = CPointerVarOf<PFNGLGETACTIVEATOMICCOUNTERBUFFERIVPROC>
typealias PFNGLGETACTIVEATOMICCOUNTERBUFFERIVPROC = CPointer<CFunction<(GLuint, GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLBINDIMAGETEXTUREPROCVar = CPointerVarOf<PFNGLBINDIMAGETEXTUREPROC>
typealias PFNGLBINDIMAGETEXTUREPROC = CPointer<CFunction<(GLuint, GLuint, GLint, GLboolean, GLint, GLenum, GLenum) -> Unit>>

typealias PFNGLMEMORYBARRIERPROCVar = CPointerVarOf<PFNGLMEMORYBARRIERPROC>
typealias PFNGLMEMORYBARRIERPROC = CPointer<CFunction<(GLbitfield) -> Unit>>

typealias PFNGLTEXSTORAGE1DPROCVar = CPointerVarOf<PFNGLTEXSTORAGE1DPROC>
typealias PFNGLTEXSTORAGE1DPROC = CPointer<CFunction<(GLenum, GLsizei, GLenum, GLsizei) -> Unit>>

typealias PFNGLTEXSTORAGE2DPROCVar = CPointerVarOf<PFNGLTEXSTORAGE2DPROC>
typealias PFNGLTEXSTORAGE2DPROC = CPointer<CFunction<(GLenum, GLsizei, GLenum, GLsizei, GLsizei) -> Unit>>

typealias PFNGLTEXSTORAGE3DPROCVar = CPointerVarOf<PFNGLTEXSTORAGE3DPROC>
typealias PFNGLTEXSTORAGE3DPROC = CPointer<CFunction<(GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLsizei) -> Unit>>

typealias PFNGLDRAWTRANSFORMFEEDBACKINSTANCEDPROCVar = CPointerVarOf<PFNGLDRAWTRANSFORMFEEDBACKINSTANCEDPROC>
typealias PFNGLDRAWTRANSFORMFEEDBACKINSTANCEDPROC = CPointer<CFunction<(GLenum, GLuint, GLsizei) -> Unit>>

typealias PFNGLDRAWTRANSFORMFEEDBACKSTREAMINSTANCEDPROCVar = CPointerVarOf<PFNGLDRAWTRANSFORMFEEDBACKSTREAMINSTANCEDPROC>
typealias PFNGLDRAWTRANSFORMFEEDBACKSTREAMINSTANCEDPROC = CPointer<CFunction<(GLenum, GLuint, GLuint, GLsizei) -> Unit>>

typealias GLDEBUGPROCVar = CPointerVarOf<GLDEBUGPROC>
typealias GLDEBUGPROC = CPointer<CFunction<(GLenum, GLenum, GLuint, GLenum, GLsizei, CPointer<GLcharVar>?, COpaquePointer?) -> Unit>>

typealias PFNGLCLEARBUFFERDATAPROCVar = CPointerVarOf<PFNGLCLEARBUFFERDATAPROC>
typealias PFNGLCLEARBUFFERDATAPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLCLEARBUFFERSUBDATAPROCVar = CPointerVarOf<PFNGLCLEARBUFFERSUBDATAPROC>
typealias PFNGLCLEARBUFFERSUBDATAPROC = CPointer<CFunction<(GLenum, GLenum, GLintptr, GLsizeiptr, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLDISPATCHCOMPUTEPROCVar = CPointerVarOf<PFNGLDISPATCHCOMPUTEPROC>
typealias PFNGLDISPATCHCOMPUTEPROC = CPointer<CFunction<(GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLDISPATCHCOMPUTEINDIRECTPROCVar = CPointerVarOf<PFNGLDISPATCHCOMPUTEINDIRECTPROC>
typealias PFNGLDISPATCHCOMPUTEINDIRECTPROC = CPointer<CFunction<(GLintptr) -> Unit>>

typealias PFNGLCOPYIMAGESUBDATAPROCVar = CPointerVarOf<PFNGLCOPYIMAGESUBDATAPROC>
typealias PFNGLCOPYIMAGESUBDATAPROC = CPointer<CFunction<(GLuint, GLenum, GLint, GLint, GLint, GLint, GLuint, GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei) -> Unit>>

typealias PFNGLFRAMEBUFFERPARAMETERIPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERPARAMETERIPROC>
typealias PFNGLFRAMEBUFFERPARAMETERIPROC = CPointer<CFunction<(GLenum, GLenum, GLint) -> Unit>>

typealias PFNGLGETFRAMEBUFFERPARAMETERIVPROCVar = CPointerVarOf<PFNGLGETFRAMEBUFFERPARAMETERIVPROC>
typealias PFNGLGETFRAMEBUFFERPARAMETERIVPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETINTERNALFORMATI64VPROCVar = CPointerVarOf<PFNGLGETINTERNALFORMATI64VPROC>
typealias PFNGLGETINTERNALFORMATI64VPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, GLsizei, CPointer<GLint64Var>?) -> Unit>>

typealias PFNGLINVALIDATETEXSUBIMAGEPROCVar = CPointerVarOf<PFNGLINVALIDATETEXSUBIMAGEPROC>
typealias PFNGLINVALIDATETEXSUBIMAGEPROC = CPointer<CFunction<(GLuint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei) -> Unit>>

typealias PFNGLINVALIDATETEXIMAGEPROCVar = CPointerVarOf<PFNGLINVALIDATETEXIMAGEPROC>
typealias PFNGLINVALIDATETEXIMAGEPROC = CPointer<CFunction<(GLuint, GLint) -> Unit>>

typealias PFNGLINVALIDATEBUFFERSUBDATAPROCVar = CPointerVarOf<PFNGLINVALIDATEBUFFERSUBDATAPROC>
typealias PFNGLINVALIDATEBUFFERSUBDATAPROC = CPointer<CFunction<(GLuint, GLintptr, GLsizeiptr) -> Unit>>

typealias PFNGLINVALIDATEBUFFERDATAPROCVar = CPointerVarOf<PFNGLINVALIDATEBUFFERDATAPROC>
typealias PFNGLINVALIDATEBUFFERDATAPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLINVALIDATEFRAMEBUFFERPROCVar = CPointerVarOf<PFNGLINVALIDATEFRAMEBUFFERPROC>
typealias PFNGLINVALIDATEFRAMEBUFFERPROC = CPointer<CFunction<(GLenum, GLsizei, CPointer<GLenumVar>?) -> Unit>>

typealias PFNGLINVALIDATESUBFRAMEBUFFERPROCVar = CPointerVarOf<PFNGLINVALIDATESUBFRAMEBUFFERPROC>
typealias PFNGLINVALIDATESUBFRAMEBUFFERPROC = CPointer<CFunction<(GLenum, GLsizei, CPointer<GLenumVar>?, GLint, GLint, GLsizei, GLsizei) -> Unit>>

typealias PFNGLMULTIDRAWARRAYSINDIRECTPROCVar = CPointerVarOf<PFNGLMULTIDRAWARRAYSINDIRECTPROC>
typealias PFNGLMULTIDRAWARRAYSINDIRECTPROC = CPointer<CFunction<(GLenum, COpaquePointer?, GLsizei, GLsizei) -> Unit>>

typealias PFNGLMULTIDRAWELEMENTSINDIRECTPROCVar = CPointerVarOf<PFNGLMULTIDRAWELEMENTSINDIRECTPROC>
typealias PFNGLMULTIDRAWELEMENTSINDIRECTPROC = CPointer<CFunction<(GLenum, GLenum, COpaquePointer?, GLsizei, GLsizei) -> Unit>>

typealias PFNGLGETPROGRAMINTERFACEIVPROCVar = CPointerVarOf<PFNGLGETPROGRAMINTERFACEIVPROC>
typealias PFNGLGETPROGRAMINTERFACEIVPROC = CPointer<CFunction<(GLuint, GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETPROGRAMRESOURCEINDEXPROCVar = CPointerVarOf<PFNGLGETPROGRAMRESOURCEINDEXPROC>
typealias PFNGLGETPROGRAMRESOURCEINDEXPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLcharVar>?) -> GLuint>>

typealias PFNGLGETPROGRAMRESOURCENAMEPROCVar = CPointerVarOf<PFNGLGETPROGRAMRESOURCENAMEPROC>
typealias PFNGLGETPROGRAMRESOURCENAMEPROC = CPointer<CFunction<(GLuint, GLenum, GLuint, GLsizei, CPointer<GLsizeiVar>?, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLGETPROGRAMRESOURCEIVPROCVar = CPointerVarOf<PFNGLGETPROGRAMRESOURCEIVPROC>
typealias PFNGLGETPROGRAMRESOURCEIVPROC = CPointer<CFunction<(GLuint, GLenum, GLuint, GLsizei, CPointer<GLenumVar>?, GLsizei, CPointer<GLsizeiVar>?, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETPROGRAMRESOURCELOCATIONPROCVar = CPointerVarOf<PFNGLGETPROGRAMRESOURCELOCATIONPROC>
typealias PFNGLGETPROGRAMRESOURCELOCATIONPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLcharVar>?) -> GLint>>

typealias PFNGLGETPROGRAMRESOURCELOCATIONINDEXPROCVar = CPointerVarOf<PFNGLGETPROGRAMRESOURCELOCATIONINDEXPROC>
typealias PFNGLGETPROGRAMRESOURCELOCATIONINDEXPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLcharVar>?) -> GLint>>

typealias PFNGLSHADERSTORAGEBLOCKBINDINGPROCVar = CPointerVarOf<PFNGLSHADERSTORAGEBLOCKBINDINGPROC>
typealias PFNGLSHADERSTORAGEBLOCKBINDINGPROC = CPointer<CFunction<(GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLTEXBUFFERRANGEPROCVar = CPointerVarOf<PFNGLTEXBUFFERRANGEPROC>
typealias PFNGLTEXBUFFERRANGEPROC = CPointer<CFunction<(GLenum, GLenum, GLuint, GLintptr, GLsizeiptr) -> Unit>>

typealias PFNGLTEXSTORAGE2DMULTISAMPLEPROCVar = CPointerVarOf<PFNGLTEXSTORAGE2DMULTISAMPLEPROC>
typealias PFNGLTEXSTORAGE2DMULTISAMPLEPROC = CPointer<CFunction<(GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLboolean) -> Unit>>

typealias PFNGLTEXSTORAGE3DMULTISAMPLEPROCVar = CPointerVarOf<PFNGLTEXSTORAGE3DMULTISAMPLEPROC>
typealias PFNGLTEXSTORAGE3DMULTISAMPLEPROC = CPointer<CFunction<(GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLsizei, GLboolean) -> Unit>>

typealias PFNGLTEXTUREVIEWPROCVar = CPointerVarOf<PFNGLTEXTUREVIEWPROC>
typealias PFNGLTEXTUREVIEWPROC = CPointer<CFunction<(GLuint, GLenum, GLuint, GLenum, GLuint, GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLBINDVERTEXBUFFERPROCVar = CPointerVarOf<PFNGLBINDVERTEXBUFFERPROC>
typealias PFNGLBINDVERTEXBUFFERPROC = CPointer<CFunction<(GLuint, GLuint, GLintptr, GLsizei) -> Unit>>

typealias PFNGLVERTEXATTRIBFORMATPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBFORMATPROC>
typealias PFNGLVERTEXATTRIBFORMATPROC = CPointer<CFunction<(GLuint, GLint, GLenum, GLboolean, GLuint) -> Unit>>

typealias PFNGLVERTEXATTRIBIFORMATPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBIFORMATPROC>
typealias PFNGLVERTEXATTRIBIFORMATPROC = CPointer<CFunction<(GLuint, GLint, GLenum, GLuint) -> Unit>>

typealias PFNGLVERTEXATTRIBLFORMATPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBLFORMATPROC>
typealias PFNGLVERTEXATTRIBLFORMATPROC = CPointer<CFunction<(GLuint, GLint, GLenum, GLuint) -> Unit>>

typealias PFNGLVERTEXATTRIBBINDINGPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBBINDINGPROC>
typealias PFNGLVERTEXATTRIBBINDINGPROC = CPointer<CFunction<(GLuint, GLuint) -> Unit>>

typealias PFNGLVERTEXBINDINGDIVISORPROCVar = CPointerVarOf<PFNGLVERTEXBINDINGDIVISORPROC>
typealias PFNGLVERTEXBINDINGDIVISORPROC = CPointer<CFunction<(GLuint, GLuint) -> Unit>>

typealias PFNGLDEBUGMESSAGECONTROLPROCVar = CPointerVarOf<PFNGLDEBUGMESSAGECONTROLPROC>
typealias PFNGLDEBUGMESSAGECONTROLPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, GLsizei, CPointer<GLuintVar>?, GLboolean) -> Unit>>

typealias PFNGLDEBUGMESSAGEINSERTPROCVar = CPointerVarOf<PFNGLDEBUGMESSAGEINSERTPROC>
typealias PFNGLDEBUGMESSAGEINSERTPROC = CPointer<CFunction<(GLenum, GLenum, GLuint, GLenum, GLsizei, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLDEBUGMESSAGECALLBACKPROCVar = CPointerVarOf<PFNGLDEBUGMESSAGECALLBACKPROC>
typealias PFNGLDEBUGMESSAGECALLBACKPROC = CPointer<CFunction<(GLDEBUGPROC?, COpaquePointer?) -> Unit>>

typealias PFNGLGETDEBUGMESSAGELOGPROCVar = CPointerVarOf<PFNGLGETDEBUGMESSAGELOGPROC>
typealias PFNGLGETDEBUGMESSAGELOGPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLenumVar>?, CPointer<GLenumVar>?, CPointer<GLuintVar>?, CPointer<GLenumVar>?, CPointer<GLsizeiVar>?, CPointer<GLcharVar>?) -> GLuint>>

typealias PFNGLPUSHDEBUGGROUPPROCVar = CPointerVarOf<PFNGLPUSHDEBUGGROUPPROC>
typealias PFNGLPUSHDEBUGGROUPPROC = CPointer<CFunction<(GLenum, GLuint, GLsizei, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLPOPDEBUGGROUPPROCVar = CPointerVarOf<PFNGLPOPDEBUGGROUPPROC>
typealias PFNGLPOPDEBUGGROUPPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLOBJECTLABELPROCVar = CPointerVarOf<PFNGLOBJECTLABELPROC>
typealias PFNGLOBJECTLABELPROC = CPointer<CFunction<(GLenum, GLuint, GLsizei, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLGETOBJECTLABELPROCVar = CPointerVarOf<PFNGLGETOBJECTLABELPROC>
typealias PFNGLGETOBJECTLABELPROC = CPointer<CFunction<(GLenum, GLuint, GLsizei, CPointer<GLsizeiVar>?, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLOBJECTPTRLABELPROCVar = CPointerVarOf<PFNGLOBJECTPTRLABELPROC>
typealias PFNGLOBJECTPTRLABELPROC = CPointer<CFunction<(COpaquePointer?, GLsizei, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLGETOBJECTPTRLABELPROCVar = CPointerVarOf<PFNGLGETOBJECTPTRLABELPROC>
typealias PFNGLGETOBJECTPTRLABELPROC = CPointer<CFunction<(COpaquePointer?, GLsizei, CPointer<GLsizeiVar>?, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLBUFFERSTORAGEPROCVar = CPointerVarOf<PFNGLBUFFERSTORAGEPROC>
typealias PFNGLBUFFERSTORAGEPROC = CPointer<CFunction<(GLenum, GLsizeiptr, COpaquePointer?, GLbitfield) -> Unit>>

typealias PFNGLCLEARTEXIMAGEPROCVar = CPointerVarOf<PFNGLCLEARTEXIMAGEPROC>
typealias PFNGLCLEARTEXIMAGEPROC = CPointer<CFunction<(GLuint, GLint, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLCLEARTEXSUBIMAGEPROCVar = CPointerVarOf<PFNGLCLEARTEXSUBIMAGEPROC>
typealias PFNGLCLEARTEXSUBIMAGEPROC = CPointer<CFunction<(GLuint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLBINDBUFFERSBASEPROCVar = CPointerVarOf<PFNGLBINDBUFFERSBASEPROC>
typealias PFNGLBINDBUFFERSBASEPROC = CPointer<CFunction<(GLenum, GLuint, GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLBINDBUFFERSRANGEPROCVar = CPointerVarOf<PFNGLBINDBUFFERSRANGEPROC>
typealias PFNGLBINDBUFFERSRANGEPROC = CPointer<CFunction<(GLenum, GLuint, GLsizei, CPointer<GLuintVar>?, CPointer<GLintptrVar>?, CPointer<GLsizeiptrVar>?) -> Unit>>

typealias PFNGLBINDTEXTURESPROCVar = CPointerVarOf<PFNGLBINDTEXTURESPROC>
typealias PFNGLBINDTEXTURESPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLBINDSAMPLERSPROCVar = CPointerVarOf<PFNGLBINDSAMPLERSPROC>
typealias PFNGLBINDSAMPLERSPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLBINDIMAGETEXTURESPROCVar = CPointerVarOf<PFNGLBINDIMAGETEXTURESPROC>
typealias PFNGLBINDIMAGETEXTURESPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLBINDVERTEXBUFFERSPROCVar = CPointerVarOf<PFNGLBINDVERTEXBUFFERSPROC>
typealias PFNGLBINDVERTEXBUFFERSPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLuintVar>?, CPointer<GLintptrVar>?, CPointer<GLsizeiVar>?) -> Unit>>

typealias PFNGLCLIPCONTROLPROCVar = CPointerVarOf<PFNGLCLIPCONTROLPROC>
typealias PFNGLCLIPCONTROLPROC = CPointer<CFunction<(GLenum, GLenum) -> Unit>>

typealias PFNGLCREATETRANSFORMFEEDBACKSPROCVar = CPointerVarOf<PFNGLCREATETRANSFORMFEEDBACKSPROC>
typealias PFNGLCREATETRANSFORMFEEDBACKSPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLTRANSFORMFEEDBACKBUFFERBASEPROCVar = CPointerVarOf<PFNGLTRANSFORMFEEDBACKBUFFERBASEPROC>
typealias PFNGLTRANSFORMFEEDBACKBUFFERBASEPROC = CPointer<CFunction<(GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLTRANSFORMFEEDBACKBUFFERRANGEPROCVar = CPointerVarOf<PFNGLTRANSFORMFEEDBACKBUFFERRANGEPROC>
typealias PFNGLTRANSFORMFEEDBACKBUFFERRANGEPROC = CPointer<CFunction<(GLuint, GLuint, GLuint, GLintptr, GLsizeiptr) -> Unit>>

typealias PFNGLGETTRANSFORMFEEDBACKIVPROCVar = CPointerVarOf<PFNGLGETTRANSFORMFEEDBACKIVPROC>
typealias PFNGLGETTRANSFORMFEEDBACKIVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETTRANSFORMFEEDBACKI_VPROCVar = CPointerVarOf<PFNGLGETTRANSFORMFEEDBACKI_VPROC>
typealias PFNGLGETTRANSFORMFEEDBACKI_VPROC = CPointer<CFunction<(GLuint, GLenum, GLuint, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETTRANSFORMFEEDBACKI64_VPROCVar = CPointerVarOf<PFNGLGETTRANSFORMFEEDBACKI64_VPROC>
typealias PFNGLGETTRANSFORMFEEDBACKI64_VPROC = CPointer<CFunction<(GLuint, GLenum, GLuint, CPointer<GLint64Var>?) -> Unit>>

typealias PFNGLCREATEBUFFERSPROCVar = CPointerVarOf<PFNGLCREATEBUFFERSPROC>
typealias PFNGLCREATEBUFFERSPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLNAMEDBUFFERSTORAGEPROCVar = CPointerVarOf<PFNGLNAMEDBUFFERSTORAGEPROC>
typealias PFNGLNAMEDBUFFERSTORAGEPROC = CPointer<CFunction<(GLuint, GLsizeiptr, COpaquePointer?, GLbitfield) -> Unit>>

typealias PFNGLNAMEDBUFFERDATAPROCVar = CPointerVarOf<PFNGLNAMEDBUFFERDATAPROC>
typealias PFNGLNAMEDBUFFERDATAPROC = CPointer<CFunction<(GLuint, GLsizeiptr, COpaquePointer?, GLenum) -> Unit>>

typealias PFNGLNAMEDBUFFERSUBDATAPROCVar = CPointerVarOf<PFNGLNAMEDBUFFERSUBDATAPROC>
typealias PFNGLNAMEDBUFFERSUBDATAPROC = CPointer<CFunction<(GLuint, GLintptr, GLsizeiptr, COpaquePointer?) -> Unit>>

typealias PFNGLCOPYNAMEDBUFFERSUBDATAPROCVar = CPointerVarOf<PFNGLCOPYNAMEDBUFFERSUBDATAPROC>
typealias PFNGLCOPYNAMEDBUFFERSUBDATAPROC = CPointer<CFunction<(GLuint, GLuint, GLintptr, GLintptr, GLsizeiptr) -> Unit>>

typealias PFNGLCLEARNAMEDBUFFERDATAPROCVar = CPointerVarOf<PFNGLCLEARNAMEDBUFFERDATAPROC>
typealias PFNGLCLEARNAMEDBUFFERDATAPROC = CPointer<CFunction<(GLuint, GLenum, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLCLEARNAMEDBUFFERSUBDATAPROCVar = CPointerVarOf<PFNGLCLEARNAMEDBUFFERSUBDATAPROC>
typealias PFNGLCLEARNAMEDBUFFERSUBDATAPROC = CPointer<CFunction<(GLuint, GLenum, GLintptr, GLsizeiptr, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLMAPNAMEDBUFFERPROCVar = CPointerVarOf<PFNGLMAPNAMEDBUFFERPROC>
typealias PFNGLMAPNAMEDBUFFERPROC = CPointer<CFunction<(GLuint, GLenum) -> COpaquePointer?>>

typealias PFNGLMAPNAMEDBUFFERRANGEPROCVar = CPointerVarOf<PFNGLMAPNAMEDBUFFERRANGEPROC>
typealias PFNGLMAPNAMEDBUFFERRANGEPROC = CPointer<CFunction<(GLuint, GLintptr, GLsizeiptr, GLbitfield) -> COpaquePointer?>>

typealias PFNGLUNMAPNAMEDBUFFERPROCVar = CPointerVarOf<PFNGLUNMAPNAMEDBUFFERPROC>
typealias PFNGLUNMAPNAMEDBUFFERPROC = CPointer<CFunction<(GLuint) -> GLboolean>>

typealias PFNGLFLUSHMAPPEDNAMEDBUFFERRANGEPROCVar = CPointerVarOf<PFNGLFLUSHMAPPEDNAMEDBUFFERRANGEPROC>
typealias PFNGLFLUSHMAPPEDNAMEDBUFFERRANGEPROC = CPointer<CFunction<(GLuint, GLintptr, GLsizeiptr) -> Unit>>

typealias PFNGLGETNAMEDBUFFERPARAMETERIVPROCVar = CPointerVarOf<PFNGLGETNAMEDBUFFERPARAMETERIVPROC>
typealias PFNGLGETNAMEDBUFFERPARAMETERIVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETNAMEDBUFFERPARAMETERI64VPROCVar = CPointerVarOf<PFNGLGETNAMEDBUFFERPARAMETERI64VPROC>
typealias PFNGLGETNAMEDBUFFERPARAMETERI64VPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLint64Var>?) -> Unit>>

typealias PFNGLGETNAMEDBUFFERPOINTERVPROCVar = CPointerVarOf<PFNGLGETNAMEDBUFFERPOINTERVPROC>
typealias PFNGLGETNAMEDBUFFERPOINTERVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<COpaquePointerVar>?) -> Unit>>

typealias PFNGLGETNAMEDBUFFERSUBDATAPROCVar = CPointerVarOf<PFNGLGETNAMEDBUFFERSUBDATAPROC>
typealias PFNGLGETNAMEDBUFFERSUBDATAPROC = CPointer<CFunction<(GLuint, GLintptr, GLsizeiptr, COpaquePointer?) -> Unit>>

typealias PFNGLCREATEFRAMEBUFFERSPROCVar = CPointerVarOf<PFNGLCREATEFRAMEBUFFERSPROC>
typealias PFNGLCREATEFRAMEBUFFERSPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLNAMEDFRAMEBUFFERRENDERBUFFERPROCVar = CPointerVarOf<PFNGLNAMEDFRAMEBUFFERRENDERBUFFERPROC>
typealias PFNGLNAMEDFRAMEBUFFERRENDERBUFFERPROC = CPointer<CFunction<(GLuint, GLenum, GLenum, GLuint) -> Unit>>

typealias PFNGLNAMEDFRAMEBUFFERPARAMETERIPROCVar = CPointerVarOf<PFNGLNAMEDFRAMEBUFFERPARAMETERIPROC>
typealias PFNGLNAMEDFRAMEBUFFERPARAMETERIPROC = CPointer<CFunction<(GLuint, GLenum, GLint) -> Unit>>

typealias PFNGLNAMEDFRAMEBUFFERTEXTUREPROCVar = CPointerVarOf<PFNGLNAMEDFRAMEBUFFERTEXTUREPROC>
typealias PFNGLNAMEDFRAMEBUFFERTEXTUREPROC = CPointer<CFunction<(GLuint, GLenum, GLuint, GLint) -> Unit>>

typealias PFNGLNAMEDFRAMEBUFFERTEXTURELAYERPROCVar = CPointerVarOf<PFNGLNAMEDFRAMEBUFFERTEXTURELAYERPROC>
typealias PFNGLNAMEDFRAMEBUFFERTEXTURELAYERPROC = CPointer<CFunction<(GLuint, GLenum, GLuint, GLint, GLint) -> Unit>>

typealias PFNGLNAMEDFRAMEBUFFERDRAWBUFFERPROCVar = CPointerVarOf<PFNGLNAMEDFRAMEBUFFERDRAWBUFFERPROC>
typealias PFNGLNAMEDFRAMEBUFFERDRAWBUFFERPROC = CPointer<CFunction<(GLuint, GLenum) -> Unit>>

typealias PFNGLNAMEDFRAMEBUFFERDRAWBUFFERSPROCVar = CPointerVarOf<PFNGLNAMEDFRAMEBUFFERDRAWBUFFERSPROC>
typealias PFNGLNAMEDFRAMEBUFFERDRAWBUFFERSPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLenumVar>?) -> Unit>>

typealias PFNGLNAMEDFRAMEBUFFERREADBUFFERPROCVar = CPointerVarOf<PFNGLNAMEDFRAMEBUFFERREADBUFFERPROC>
typealias PFNGLNAMEDFRAMEBUFFERREADBUFFERPROC = CPointer<CFunction<(GLuint, GLenum) -> Unit>>

typealias PFNGLINVALIDATENAMEDFRAMEBUFFERDATAPROCVar = CPointerVarOf<PFNGLINVALIDATENAMEDFRAMEBUFFERDATAPROC>
typealias PFNGLINVALIDATENAMEDFRAMEBUFFERDATAPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLenumVar>?) -> Unit>>

typealias PFNGLINVALIDATENAMEDFRAMEBUFFERSUBDATAPROCVar = CPointerVarOf<PFNGLINVALIDATENAMEDFRAMEBUFFERSUBDATAPROC>
typealias PFNGLINVALIDATENAMEDFRAMEBUFFERSUBDATAPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLenumVar>?, GLint, GLint, GLsizei, GLsizei) -> Unit>>

typealias PFNGLCLEARNAMEDFRAMEBUFFERIVPROCVar = CPointerVarOf<PFNGLCLEARNAMEDFRAMEBUFFERIVPROC>
typealias PFNGLCLEARNAMEDFRAMEBUFFERIVPROC = CPointer<CFunction<(GLuint, GLenum, GLint, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLCLEARNAMEDFRAMEBUFFERUIVPROCVar = CPointerVarOf<PFNGLCLEARNAMEDFRAMEBUFFERUIVPROC>
typealias PFNGLCLEARNAMEDFRAMEBUFFERUIVPROC = CPointer<CFunction<(GLuint, GLenum, GLint, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLCLEARNAMEDFRAMEBUFFERFVPROCVar = CPointerVarOf<PFNGLCLEARNAMEDFRAMEBUFFERFVPROC>
typealias PFNGLCLEARNAMEDFRAMEBUFFERFVPROC = CPointer<CFunction<(GLuint, GLenum, GLint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLCLEARNAMEDFRAMEBUFFERFIPROCVar = CPointerVarOf<PFNGLCLEARNAMEDFRAMEBUFFERFIPROC>
typealias PFNGLCLEARNAMEDFRAMEBUFFERFIPROC = CPointer<CFunction<(GLuint, GLenum, GLint, GLfloat, GLint) -> Unit>>

typealias PFNGLBLITNAMEDFRAMEBUFFERPROCVar = CPointerVarOf<PFNGLBLITNAMEDFRAMEBUFFERPROC>
typealias PFNGLBLITNAMEDFRAMEBUFFERPROC = CPointer<CFunction<(GLuint, GLuint, GLint, GLint, GLint, GLint, GLint, GLint, GLint, GLint, GLbitfield, GLenum) -> Unit>>

typealias PFNGLCHECKNAMEDFRAMEBUFFERSTATUSPROCVar = CPointerVarOf<PFNGLCHECKNAMEDFRAMEBUFFERSTATUSPROC>
typealias PFNGLCHECKNAMEDFRAMEBUFFERSTATUSPROC = CPointer<CFunction<(GLuint, GLenum) -> GLenum>>

typealias PFNGLGETNAMEDFRAMEBUFFERPARAMETERIVPROCVar = CPointerVarOf<PFNGLGETNAMEDFRAMEBUFFERPARAMETERIVPROC>
typealias PFNGLGETNAMEDFRAMEBUFFERPARAMETERIVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETNAMEDFRAMEBUFFERATTACHMENTPARAMETERIVPROCVar = CPointerVarOf<PFNGLGETNAMEDFRAMEBUFFERATTACHMENTPARAMETERIVPROC>
typealias PFNGLGETNAMEDFRAMEBUFFERATTACHMENTPARAMETERIVPROC = CPointer<CFunction<(GLuint, GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLCREATERENDERBUFFERSPROCVar = CPointerVarOf<PFNGLCREATERENDERBUFFERSPROC>
typealias PFNGLCREATERENDERBUFFERSPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLNAMEDRENDERBUFFERSTORAGEPROCVar = CPointerVarOf<PFNGLNAMEDRENDERBUFFERSTORAGEPROC>
typealias PFNGLNAMEDRENDERBUFFERSTORAGEPROC = CPointer<CFunction<(GLuint, GLenum, GLsizei, GLsizei) -> Unit>>

typealias PFNGLNAMEDRENDERBUFFERSTORAGEMULTISAMPLEPROCVar = CPointerVarOf<PFNGLNAMEDRENDERBUFFERSTORAGEMULTISAMPLEPROC>
typealias PFNGLNAMEDRENDERBUFFERSTORAGEMULTISAMPLEPROC = CPointer<CFunction<(GLuint, GLsizei, GLenum, GLsizei, GLsizei) -> Unit>>

typealias PFNGLGETNAMEDRENDERBUFFERPARAMETERIVPROCVar = CPointerVarOf<PFNGLGETNAMEDRENDERBUFFERPARAMETERIVPROC>
typealias PFNGLGETNAMEDRENDERBUFFERPARAMETERIVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLCREATETEXTURESPROCVar = CPointerVarOf<PFNGLCREATETEXTURESPROC>
typealias PFNGLCREATETEXTURESPROC = CPointer<CFunction<(GLenum, GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLTEXTUREBUFFERPROCVar = CPointerVarOf<PFNGLTEXTUREBUFFERPROC>
typealias PFNGLTEXTUREBUFFERPROC = CPointer<CFunction<(GLuint, GLenum, GLuint) -> Unit>>

typealias PFNGLTEXTUREBUFFERRANGEPROCVar = CPointerVarOf<PFNGLTEXTUREBUFFERRANGEPROC>
typealias PFNGLTEXTUREBUFFERRANGEPROC = CPointer<CFunction<(GLuint, GLenum, GLuint, GLintptr, GLsizeiptr) -> Unit>>

typealias PFNGLTEXTURESTORAGE1DPROCVar = CPointerVarOf<PFNGLTEXTURESTORAGE1DPROC>
typealias PFNGLTEXTURESTORAGE1DPROC = CPointer<CFunction<(GLuint, GLsizei, GLenum, GLsizei) -> Unit>>

typealias PFNGLTEXTURESTORAGE2DPROCVar = CPointerVarOf<PFNGLTEXTURESTORAGE2DPROC>
typealias PFNGLTEXTURESTORAGE2DPROC = CPointer<CFunction<(GLuint, GLsizei, GLenum, GLsizei, GLsizei) -> Unit>>

typealias PFNGLTEXTURESTORAGE3DPROCVar = CPointerVarOf<PFNGLTEXTURESTORAGE3DPROC>
typealias PFNGLTEXTURESTORAGE3DPROC = CPointer<CFunction<(GLuint, GLsizei, GLenum, GLsizei, GLsizei, GLsizei) -> Unit>>

typealias PFNGLTEXTURESTORAGE2DMULTISAMPLEPROCVar = CPointerVarOf<PFNGLTEXTURESTORAGE2DMULTISAMPLEPROC>
typealias PFNGLTEXTURESTORAGE2DMULTISAMPLEPROC = CPointer<CFunction<(GLuint, GLsizei, GLenum, GLsizei, GLsizei, GLboolean) -> Unit>>

typealias PFNGLTEXTURESTORAGE3DMULTISAMPLEPROCVar = CPointerVarOf<PFNGLTEXTURESTORAGE3DMULTISAMPLEPROC>
typealias PFNGLTEXTURESTORAGE3DMULTISAMPLEPROC = CPointer<CFunction<(GLuint, GLsizei, GLenum, GLsizei, GLsizei, GLsizei, GLboolean) -> Unit>>

typealias PFNGLTEXTURESUBIMAGE1DPROCVar = CPointerVarOf<PFNGLTEXTURESUBIMAGE1DPROC>
typealias PFNGLTEXTURESUBIMAGE1DPROC = CPointer<CFunction<(GLuint, GLint, GLint, GLsizei, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLTEXTURESUBIMAGE2DPROCVar = CPointerVarOf<PFNGLTEXTURESUBIMAGE2DPROC>
typealias PFNGLTEXTURESUBIMAGE2DPROC = CPointer<CFunction<(GLuint, GLint, GLint, GLint, GLsizei, GLsizei, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLTEXTURESUBIMAGE3DPROCVar = CPointerVarOf<PFNGLTEXTURESUBIMAGE3DPROC>
typealias PFNGLTEXTURESUBIMAGE3DPROC = CPointer<CFunction<(GLuint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLCOMPRESSEDTEXTURESUBIMAGE1DPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXTURESUBIMAGE1DPROC>
typealias PFNGLCOMPRESSEDTEXTURESUBIMAGE1DPROC = CPointer<CFunction<(GLuint, GLint, GLint, GLsizei, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLCOMPRESSEDTEXTURESUBIMAGE2DPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXTURESUBIMAGE2DPROC>
typealias PFNGLCOMPRESSEDTEXTURESUBIMAGE2DPROC = CPointer<CFunction<(GLuint, GLint, GLint, GLint, GLsizei, GLsizei, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLCOMPRESSEDTEXTURESUBIMAGE3DPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXTURESUBIMAGE3DPROC>
typealias PFNGLCOMPRESSEDTEXTURESUBIMAGE3DPROC = CPointer<CFunction<(GLuint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLCOPYTEXTURESUBIMAGE1DPROCVar = CPointerVarOf<PFNGLCOPYTEXTURESUBIMAGE1DPROC>
typealias PFNGLCOPYTEXTURESUBIMAGE1DPROC = CPointer<CFunction<(GLuint, GLint, GLint, GLint, GLint, GLsizei) -> Unit>>

typealias PFNGLCOPYTEXTURESUBIMAGE2DPROCVar = CPointerVarOf<PFNGLCOPYTEXTURESUBIMAGE2DPROC>
typealias PFNGLCOPYTEXTURESUBIMAGE2DPROC = CPointer<CFunction<(GLuint, GLint, GLint, GLint, GLint, GLint, GLsizei, GLsizei) -> Unit>>

typealias PFNGLCOPYTEXTURESUBIMAGE3DPROCVar = CPointerVarOf<PFNGLCOPYTEXTURESUBIMAGE3DPROC>
typealias PFNGLCOPYTEXTURESUBIMAGE3DPROC = CPointer<CFunction<(GLuint, GLint, GLint, GLint, GLint, GLint, GLint, GLsizei, GLsizei) -> Unit>>

typealias PFNGLTEXTUREPARAMETERFPROCVar = CPointerVarOf<PFNGLTEXTUREPARAMETERFPROC>
typealias PFNGLTEXTUREPARAMETERFPROC = CPointer<CFunction<(GLuint, GLenum, GLfloat) -> Unit>>

typealias PFNGLTEXTUREPARAMETERFVPROCVar = CPointerVarOf<PFNGLTEXTUREPARAMETERFVPROC>
typealias PFNGLTEXTUREPARAMETERFVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLTEXTUREPARAMETERIPROCVar = CPointerVarOf<PFNGLTEXTUREPARAMETERIPROC>
typealias PFNGLTEXTUREPARAMETERIPROC = CPointer<CFunction<(GLuint, GLenum, GLint) -> Unit>>

typealias PFNGLTEXTUREPARAMETERIIVPROCVar = CPointerVarOf<PFNGLTEXTUREPARAMETERIIVPROC>
typealias PFNGLTEXTUREPARAMETERIIVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLTEXTUREPARAMETERIUIVPROCVar = CPointerVarOf<PFNGLTEXTUREPARAMETERIUIVPROC>
typealias PFNGLTEXTUREPARAMETERIUIVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLTEXTUREPARAMETERIVPROCVar = CPointerVarOf<PFNGLTEXTUREPARAMETERIVPROC>
typealias PFNGLTEXTUREPARAMETERIVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGENERATETEXTUREMIPMAPPROCVar = CPointerVarOf<PFNGLGENERATETEXTUREMIPMAPPROC>
typealias PFNGLGENERATETEXTUREMIPMAPPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLBINDTEXTUREUNITPROCVar = CPointerVarOf<PFNGLBINDTEXTUREUNITPROC>
typealias PFNGLBINDTEXTUREUNITPROC = CPointer<CFunction<(GLuint, GLuint) -> Unit>>

typealias PFNGLGETTEXTUREIMAGEPROCVar = CPointerVarOf<PFNGLGETTEXTUREIMAGEPROC>
typealias PFNGLGETTEXTUREIMAGEPROC = CPointer<CFunction<(GLuint, GLint, GLenum, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLGETCOMPRESSEDTEXTUREIMAGEPROCVar = CPointerVarOf<PFNGLGETCOMPRESSEDTEXTUREIMAGEPROC>
typealias PFNGLGETCOMPRESSEDTEXTUREIMAGEPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLGETTEXTURELEVELPARAMETERFVPROCVar = CPointerVarOf<PFNGLGETTEXTURELEVELPARAMETERFVPROC>
typealias PFNGLGETTEXTURELEVELPARAMETERFVPROC = CPointer<CFunction<(GLuint, GLint, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETTEXTURELEVELPARAMETERIVPROCVar = CPointerVarOf<PFNGLGETTEXTURELEVELPARAMETERIVPROC>
typealias PFNGLGETTEXTURELEVELPARAMETERIVPROC = CPointer<CFunction<(GLuint, GLint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETTEXTUREPARAMETERFVPROCVar = CPointerVarOf<PFNGLGETTEXTUREPARAMETERFVPROC>
typealias PFNGLGETTEXTUREPARAMETERFVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETTEXTUREPARAMETERIIVPROCVar = CPointerVarOf<PFNGLGETTEXTUREPARAMETERIIVPROC>
typealias PFNGLGETTEXTUREPARAMETERIIVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETTEXTUREPARAMETERIUIVPROCVar = CPointerVarOf<PFNGLGETTEXTUREPARAMETERIUIVPROC>
typealias PFNGLGETTEXTUREPARAMETERIUIVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGETTEXTUREPARAMETERIVPROCVar = CPointerVarOf<PFNGLGETTEXTUREPARAMETERIVPROC>
typealias PFNGLGETTEXTUREPARAMETERIVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLCREATEVERTEXARRAYSPROCVar = CPointerVarOf<PFNGLCREATEVERTEXARRAYSPROC>
typealias PFNGLCREATEVERTEXARRAYSPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLDISABLEVERTEXARRAYATTRIBPROCVar = CPointerVarOf<PFNGLDISABLEVERTEXARRAYATTRIBPROC>
typealias PFNGLDISABLEVERTEXARRAYATTRIBPROC = CPointer<CFunction<(GLuint, GLuint) -> Unit>>

typealias PFNGLENABLEVERTEXARRAYATTRIBPROCVar = CPointerVarOf<PFNGLENABLEVERTEXARRAYATTRIBPROC>
typealias PFNGLENABLEVERTEXARRAYATTRIBPROC = CPointer<CFunction<(GLuint, GLuint) -> Unit>>

typealias PFNGLVERTEXARRAYELEMENTBUFFERPROCVar = CPointerVarOf<PFNGLVERTEXARRAYELEMENTBUFFERPROC>
typealias PFNGLVERTEXARRAYELEMENTBUFFERPROC = CPointer<CFunction<(GLuint, GLuint) -> Unit>>

typealias PFNGLVERTEXARRAYVERTEXBUFFERPROCVar = CPointerVarOf<PFNGLVERTEXARRAYVERTEXBUFFERPROC>
typealias PFNGLVERTEXARRAYVERTEXBUFFERPROC = CPointer<CFunction<(GLuint, GLuint, GLuint, GLintptr, GLsizei) -> Unit>>

typealias PFNGLVERTEXARRAYVERTEXBUFFERSPROCVar = CPointerVarOf<PFNGLVERTEXARRAYVERTEXBUFFERSPROC>
typealias PFNGLVERTEXARRAYVERTEXBUFFERSPROC = CPointer<CFunction<(GLuint, GLuint, GLsizei, CPointer<GLuintVar>?, CPointer<GLintptrVar>?, CPointer<GLsizeiVar>?) -> Unit>>

typealias PFNGLVERTEXARRAYATTRIBBINDINGPROCVar = CPointerVarOf<PFNGLVERTEXARRAYATTRIBBINDINGPROC>
typealias PFNGLVERTEXARRAYATTRIBBINDINGPROC = CPointer<CFunction<(GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLVERTEXARRAYATTRIBFORMATPROCVar = CPointerVarOf<PFNGLVERTEXARRAYATTRIBFORMATPROC>
typealias PFNGLVERTEXARRAYATTRIBFORMATPROC = CPointer<CFunction<(GLuint, GLuint, GLint, GLenum, GLboolean, GLuint) -> Unit>>

typealias PFNGLVERTEXARRAYATTRIBIFORMATPROCVar = CPointerVarOf<PFNGLVERTEXARRAYATTRIBIFORMATPROC>
typealias PFNGLVERTEXARRAYATTRIBIFORMATPROC = CPointer<CFunction<(GLuint, GLuint, GLint, GLenum, GLuint) -> Unit>>

typealias PFNGLVERTEXARRAYATTRIBLFORMATPROCVar = CPointerVarOf<PFNGLVERTEXARRAYATTRIBLFORMATPROC>
typealias PFNGLVERTEXARRAYATTRIBLFORMATPROC = CPointer<CFunction<(GLuint, GLuint, GLint, GLenum, GLuint) -> Unit>>

typealias PFNGLVERTEXARRAYBINDINGDIVISORPROCVar = CPointerVarOf<PFNGLVERTEXARRAYBINDINGDIVISORPROC>
typealias PFNGLVERTEXARRAYBINDINGDIVISORPROC = CPointer<CFunction<(GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLGETVERTEXARRAYIVPROCVar = CPointerVarOf<PFNGLGETVERTEXARRAYIVPROC>
typealias PFNGLGETVERTEXARRAYIVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETVERTEXARRAYINDEXEDIVPROCVar = CPointerVarOf<PFNGLGETVERTEXARRAYINDEXEDIVPROC>
typealias PFNGLGETVERTEXARRAYINDEXEDIVPROC = CPointer<CFunction<(GLuint, GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETVERTEXARRAYINDEXED64IVPROCVar = CPointerVarOf<PFNGLGETVERTEXARRAYINDEXED64IVPROC>
typealias PFNGLGETVERTEXARRAYINDEXED64IVPROC = CPointer<CFunction<(GLuint, GLuint, GLenum, CPointer<GLint64Var>?) -> Unit>>

typealias PFNGLCREATESAMPLERSPROCVar = CPointerVarOf<PFNGLCREATESAMPLERSPROC>
typealias PFNGLCREATESAMPLERSPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLCREATEPROGRAMPIPELINESPROCVar = CPointerVarOf<PFNGLCREATEPROGRAMPIPELINESPROC>
typealias PFNGLCREATEPROGRAMPIPELINESPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLCREATEQUERIESPROCVar = CPointerVarOf<PFNGLCREATEQUERIESPROC>
typealias PFNGLCREATEQUERIESPROC = CPointer<CFunction<(GLenum, GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGETQUERYBUFFEROBJECTI64VPROCVar = CPointerVarOf<PFNGLGETQUERYBUFFEROBJECTI64VPROC>
typealias PFNGLGETQUERYBUFFEROBJECTI64VPROC = CPointer<CFunction<(GLuint, GLuint, GLenum, GLintptr) -> Unit>>

typealias PFNGLGETQUERYBUFFEROBJECTIVPROCVar = CPointerVarOf<PFNGLGETQUERYBUFFEROBJECTIVPROC>
typealias PFNGLGETQUERYBUFFEROBJECTIVPROC = CPointer<CFunction<(GLuint, GLuint, GLenum, GLintptr) -> Unit>>

typealias PFNGLGETQUERYBUFFEROBJECTUI64VPROCVar = CPointerVarOf<PFNGLGETQUERYBUFFEROBJECTUI64VPROC>
typealias PFNGLGETQUERYBUFFEROBJECTUI64VPROC = CPointer<CFunction<(GLuint, GLuint, GLenum, GLintptr) -> Unit>>

typealias PFNGLGETQUERYBUFFEROBJECTUIVPROCVar = CPointerVarOf<PFNGLGETQUERYBUFFEROBJECTUIVPROC>
typealias PFNGLGETQUERYBUFFEROBJECTUIVPROC = CPointer<CFunction<(GLuint, GLuint, GLenum, GLintptr) -> Unit>>

typealias PFNGLMEMORYBARRIERBYREGIONPROCVar = CPointerVarOf<PFNGLMEMORYBARRIERBYREGIONPROC>
typealias PFNGLMEMORYBARRIERBYREGIONPROC = CPointer<CFunction<(GLbitfield) -> Unit>>

typealias PFNGLGETTEXTURESUBIMAGEPROCVar = CPointerVarOf<PFNGLGETTEXTURESUBIMAGEPROC>
typealias PFNGLGETTEXTURESUBIMAGEPROC = CPointer<CFunction<(GLuint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLGETCOMPRESSEDTEXTURESUBIMAGEPROCVar = CPointerVarOf<PFNGLGETCOMPRESSEDTEXTURESUBIMAGEPROC>
typealias PFNGLGETCOMPRESSEDTEXTURESUBIMAGEPROC = CPointer<CFunction<(GLuint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLGETGRAPHICSRESETSTATUSPROCVar = CPointerVarOf<PFNGLGETGRAPHICSRESETSTATUSPROC>
typealias PFNGLGETGRAPHICSRESETSTATUSPROC = CPointer<CFunction<() -> GLenum>>

typealias PFNGLGETNCOMPRESSEDTEXIMAGEPROCVar = CPointerVarOf<PFNGLGETNCOMPRESSEDTEXIMAGEPROC>
typealias PFNGLGETNCOMPRESSEDTEXIMAGEPROC = CPointer<CFunction<(GLenum, GLint, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLGETNTEXIMAGEPROCVar = CPointerVarOf<PFNGLGETNTEXIMAGEPROC>
typealias PFNGLGETNTEXIMAGEPROC = CPointer<CFunction<(GLenum, GLint, GLenum, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLGETNUNIFORMDVPROCVar = CPointerVarOf<PFNGLGETNUNIFORMDVPROC>
typealias PFNGLGETNUNIFORMDVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLGETNUNIFORMFVPROCVar = CPointerVarOf<PFNGLGETNUNIFORMFVPROC>
typealias PFNGLGETNUNIFORMFVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETNUNIFORMIVPROCVar = CPointerVarOf<PFNGLGETNUNIFORMIVPROC>
typealias PFNGLGETNUNIFORMIVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETNUNIFORMUIVPROCVar = CPointerVarOf<PFNGLGETNUNIFORMUIVPROC>
typealias PFNGLGETNUNIFORMUIVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLREADNPIXELSPROCVar = CPointerVarOf<PFNGLREADNPIXELSPROC>
typealias PFNGLREADNPIXELSPROC = CPointer<CFunction<(GLint, GLint, GLsizei, GLsizei, GLenum, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLGETNMAPDVPROCVar = CPointerVarOf<PFNGLGETNMAPDVPROC>
typealias PFNGLGETNMAPDVPROC = CPointer<CFunction<(GLenum, GLenum, GLsizei, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLGETNMAPFVPROCVar = CPointerVarOf<PFNGLGETNMAPFVPROC>
typealias PFNGLGETNMAPFVPROC = CPointer<CFunction<(GLenum, GLenum, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETNMAPIVPROCVar = CPointerVarOf<PFNGLGETNMAPIVPROC>
typealias PFNGLGETNMAPIVPROC = CPointer<CFunction<(GLenum, GLenum, GLsizei, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETNPIXELMAPFVPROCVar = CPointerVarOf<PFNGLGETNPIXELMAPFVPROC>
typealias PFNGLGETNPIXELMAPFVPROC = CPointer<CFunction<(GLenum, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETNPIXELMAPUIVPROCVar = CPointerVarOf<PFNGLGETNPIXELMAPUIVPROC>
typealias PFNGLGETNPIXELMAPUIVPROC = CPointer<CFunction<(GLenum, GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGETNPIXELMAPUSVPROCVar = CPointerVarOf<PFNGLGETNPIXELMAPUSVPROC>
typealias PFNGLGETNPIXELMAPUSVPROC = CPointer<CFunction<(GLenum, GLsizei, CPointer<GLushortVar>?) -> Unit>>

typealias PFNGLGETNPOLYGONSTIPPLEPROCVar = CPointerVarOf<PFNGLGETNPOLYGONSTIPPLEPROC>
typealias PFNGLGETNPOLYGONSTIPPLEPROC = CPointer<CFunction<(GLsizei, CPointer<GLubyteVar>?) -> Unit>>

typealias PFNGLGETNCOLORTABLEPROCVar = CPointerVarOf<PFNGLGETNCOLORTABLEPROC>
typealias PFNGLGETNCOLORTABLEPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLGETNCONVOLUTIONFILTERPROCVar = CPointerVarOf<PFNGLGETNCONVOLUTIONFILTERPROC>
typealias PFNGLGETNCONVOLUTIONFILTERPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLGETNSEPARABLEFILTERPROCVar = CPointerVarOf<PFNGLGETNSEPARABLEFILTERPROC>
typealias PFNGLGETNSEPARABLEFILTERPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, GLsizei, COpaquePointer?, GLsizei, COpaquePointer?, COpaquePointer?) -> Unit>>

typealias PFNGLGETNHISTOGRAMPROCVar = CPointerVarOf<PFNGLGETNHISTOGRAMPROC>
typealias PFNGLGETNHISTOGRAMPROC = CPointer<CFunction<(GLenum, GLboolean, GLenum, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLGETNMINMAXPROCVar = CPointerVarOf<PFNGLGETNMINMAXPROC>
typealias PFNGLGETNMINMAXPROC = CPointer<CFunction<(GLenum, GLboolean, GLenum, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLTEXTUREBARRIERPROCVar = CPointerVarOf<PFNGLTEXTUREBARRIERPROC>
typealias PFNGLTEXTUREBARRIERPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLSPECIALIZESHADERPROCVar = CPointerVarOf<PFNGLSPECIALIZESHADERPROC>
typealias PFNGLSPECIALIZESHADERPROC = CPointer<CFunction<(GLuint, CPointer<GLcharVar>?, GLuint, CPointer<GLuintVar>?, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLMULTIDRAWARRAYSINDIRECTCOUNTPROCVar = CPointerVarOf<PFNGLMULTIDRAWARRAYSINDIRECTCOUNTPROC>
typealias PFNGLMULTIDRAWARRAYSINDIRECTCOUNTPROC = CPointer<CFunction<(GLenum, COpaquePointer?, GLintptr, GLsizei, GLsizei) -> Unit>>

typealias PFNGLMULTIDRAWELEMENTSINDIRECTCOUNTPROCVar = CPointerVarOf<PFNGLMULTIDRAWELEMENTSINDIRECTCOUNTPROC>
typealias PFNGLMULTIDRAWELEMENTSINDIRECTCOUNTPROC = CPointer<CFunction<(GLenum, GLenum, COpaquePointer?, GLintptr, GLsizei, GLsizei) -> Unit>>

typealias PFNGLPOLYGONOFFSETCLAMPPROCVar = CPointerVarOf<PFNGLPOLYGONOFFSETCLAMPPROC>
typealias PFNGLPOLYGONOFFSETCLAMPPROC = CPointer<CFunction<(GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLPRIMITIVEBOUNDINGBOXARBPROCVar = CPointerVarOf<PFNGLPRIMITIVEBOUNDINGBOXARBPROC>
typealias PFNGLPRIMITIVEBOUNDINGBOXARBPROC = CPointer<CFunction<(GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias GLuint64EXTVar = ULongVarOf<GLuint64EXT>
typealias GLuint64EXT = uint64_t

typealias PFNGLGETTEXTUREHANDLEARBPROCVar = CPointerVarOf<PFNGLGETTEXTUREHANDLEARBPROC>
typealias PFNGLGETTEXTUREHANDLEARBPROC = CPointer<CFunction<(GLuint) -> GLuint64>>

typealias PFNGLGETTEXTURESAMPLERHANDLEARBPROCVar = CPointerVarOf<PFNGLGETTEXTURESAMPLERHANDLEARBPROC>
typealias PFNGLGETTEXTURESAMPLERHANDLEARBPROC = CPointer<CFunction<(GLuint, GLuint) -> GLuint64>>

typealias PFNGLMAKETEXTUREHANDLERESIDENTARBPROCVar = CPointerVarOf<PFNGLMAKETEXTUREHANDLERESIDENTARBPROC>
typealias PFNGLMAKETEXTUREHANDLERESIDENTARBPROC = CPointer<CFunction<(GLuint64) -> Unit>>

typealias PFNGLMAKETEXTUREHANDLENONRESIDENTARBPROCVar = CPointerVarOf<PFNGLMAKETEXTUREHANDLENONRESIDENTARBPROC>
typealias PFNGLMAKETEXTUREHANDLENONRESIDENTARBPROC = CPointer<CFunction<(GLuint64) -> Unit>>

typealias PFNGLGETIMAGEHANDLEARBPROCVar = CPointerVarOf<PFNGLGETIMAGEHANDLEARBPROC>
typealias PFNGLGETIMAGEHANDLEARBPROC = CPointer<CFunction<(GLuint, GLint, GLboolean, GLint, GLenum) -> GLuint64>>

typealias PFNGLMAKEIMAGEHANDLERESIDENTARBPROCVar = CPointerVarOf<PFNGLMAKEIMAGEHANDLERESIDENTARBPROC>
typealias PFNGLMAKEIMAGEHANDLERESIDENTARBPROC = CPointer<CFunction<(GLuint64, GLenum) -> Unit>>

typealias PFNGLMAKEIMAGEHANDLENONRESIDENTARBPROCVar = CPointerVarOf<PFNGLMAKEIMAGEHANDLENONRESIDENTARBPROC>
typealias PFNGLMAKEIMAGEHANDLENONRESIDENTARBPROC = CPointer<CFunction<(GLuint64) -> Unit>>

typealias PFNGLUNIFORMHANDLEUI64ARBPROCVar = CPointerVarOf<PFNGLUNIFORMHANDLEUI64ARBPROC>
typealias PFNGLUNIFORMHANDLEUI64ARBPROC = CPointer<CFunction<(GLint, GLuint64) -> Unit>>

typealias PFNGLUNIFORMHANDLEUI64VARBPROCVar = CPointerVarOf<PFNGLUNIFORMHANDLEUI64VARBPROC>
typealias PFNGLUNIFORMHANDLEUI64VARBPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLuint64Var>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMHANDLEUI64ARBPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMHANDLEUI64ARBPROC>
typealias PFNGLPROGRAMUNIFORMHANDLEUI64ARBPROC = CPointer<CFunction<(GLuint, GLint, GLuint64) -> Unit>>

typealias PFNGLPROGRAMUNIFORMHANDLEUI64VARBPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMHANDLEUI64VARBPROC>
typealias PFNGLPROGRAMUNIFORMHANDLEUI64VARBPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLuint64Var>?) -> Unit>>

typealias PFNGLISTEXTUREHANDLERESIDENTARBPROCVar = CPointerVarOf<PFNGLISTEXTUREHANDLERESIDENTARBPROC>
typealias PFNGLISTEXTUREHANDLERESIDENTARBPROC = CPointer<CFunction<(GLuint64) -> GLboolean>>

typealias PFNGLISIMAGEHANDLERESIDENTARBPROCVar = CPointerVarOf<PFNGLISIMAGEHANDLERESIDENTARBPROC>
typealias PFNGLISIMAGEHANDLERESIDENTARBPROC = CPointer<CFunction<(GLuint64) -> GLboolean>>

typealias PFNGLVERTEXATTRIBL1UI64ARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL1UI64ARBPROC>
typealias PFNGLVERTEXATTRIBL1UI64ARBPROC = CPointer<CFunction<(GLuint, GLuint64EXT) -> Unit>>

typealias PFNGLVERTEXATTRIBL1UI64VARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL1UI64VARBPROC>
typealias PFNGLVERTEXATTRIBL1UI64VARBPROC = CPointer<CFunction<(GLuint, CPointer<GLuint64EXTVar>?) -> Unit>>

typealias PFNGLGETVERTEXATTRIBLUI64VARBPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBLUI64VARBPROC>
typealias PFNGLGETVERTEXATTRIBLUI64VARBPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLuint64EXTVar>?) -> Unit>>

typealias PFNGLCREATESYNCFROMCLEVENTARBPROCVar = CPointerVarOf<PFNGLCREATESYNCFROMCLEVENTARBPROC>
typealias PFNGLCREATESYNCFROMCLEVENTARBPROC = CPointer<CFunction<(CPointer<_cl_context>?, CPointer<_cl_event>?, GLbitfield) -> GLsync?>>

typealias PFNGLCLAMPCOLORARBPROCVar = CPointerVarOf<PFNGLCLAMPCOLORARBPROC>
typealias PFNGLCLAMPCOLORARBPROC = CPointer<CFunction<(GLenum, GLenum) -> Unit>>

typealias PFNGLDISPATCHCOMPUTEGROUPSIZEARBPROCVar = CPointerVarOf<PFNGLDISPATCHCOMPUTEGROUPSIZEARBPROC>
typealias PFNGLDISPATCHCOMPUTEGROUPSIZEARBPROC = CPointer<CFunction<(GLuint, GLuint, GLuint, GLuint, GLuint, GLuint) -> Unit>>

typealias GLDEBUGPROCARBVar = CPointerVarOf<GLDEBUGPROCARB>
typealias GLDEBUGPROCARB = CPointer<CFunction<(GLenum, GLenum, GLuint, GLenum, GLsizei, CPointer<GLcharVar>?, COpaquePointer?) -> Unit>>

typealias PFNGLDEBUGMESSAGECONTROLARBPROCVar = CPointerVarOf<PFNGLDEBUGMESSAGECONTROLARBPROC>
typealias PFNGLDEBUGMESSAGECONTROLARBPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, GLsizei, CPointer<GLuintVar>?, GLboolean) -> Unit>>

typealias PFNGLDEBUGMESSAGEINSERTARBPROCVar = CPointerVarOf<PFNGLDEBUGMESSAGEINSERTARBPROC>
typealias PFNGLDEBUGMESSAGEINSERTARBPROC = CPointer<CFunction<(GLenum, GLenum, GLuint, GLenum, GLsizei, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLDEBUGMESSAGECALLBACKARBPROCVar = CPointerVarOf<PFNGLDEBUGMESSAGECALLBACKARBPROC>
typealias PFNGLDEBUGMESSAGECALLBACKARBPROC = CPointer<CFunction<(GLDEBUGPROCARB?, COpaquePointer?) -> Unit>>

typealias PFNGLGETDEBUGMESSAGELOGARBPROCVar = CPointerVarOf<PFNGLGETDEBUGMESSAGELOGARBPROC>
typealias PFNGLGETDEBUGMESSAGELOGARBPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLenumVar>?, CPointer<GLenumVar>?, CPointer<GLuintVar>?, CPointer<GLenumVar>?, CPointer<GLsizeiVar>?, CPointer<GLcharVar>?) -> GLuint>>

typealias PFNGLDRAWBUFFERSARBPROCVar = CPointerVarOf<PFNGLDRAWBUFFERSARBPROC>
typealias PFNGLDRAWBUFFERSARBPROC = CPointer<CFunction<(GLsizei, CPointer<GLenumVar>?) -> Unit>>

typealias PFNGLBLENDEQUATIONIARBPROCVar = CPointerVarOf<PFNGLBLENDEQUATIONIARBPROC>
typealias PFNGLBLENDEQUATIONIARBPROC = CPointer<CFunction<(GLuint, GLenum) -> Unit>>

typealias PFNGLBLENDEQUATIONSEPARATEIARBPROCVar = CPointerVarOf<PFNGLBLENDEQUATIONSEPARATEIARBPROC>
typealias PFNGLBLENDEQUATIONSEPARATEIARBPROC = CPointer<CFunction<(GLuint, GLenum, GLenum) -> Unit>>

typealias PFNGLBLENDFUNCIARBPROCVar = CPointerVarOf<PFNGLBLENDFUNCIARBPROC>
typealias PFNGLBLENDFUNCIARBPROC = CPointer<CFunction<(GLuint, GLenum, GLenum) -> Unit>>

typealias PFNGLBLENDFUNCSEPARATEIARBPROCVar = CPointerVarOf<PFNGLBLENDFUNCSEPARATEIARBPROC>
typealias PFNGLBLENDFUNCSEPARATEIARBPROC = CPointer<CFunction<(GLuint, GLenum, GLenum, GLenum, GLenum) -> Unit>>

typealias PFNGLDRAWARRAYSINSTANCEDARBPROCVar = CPointerVarOf<PFNGLDRAWARRAYSINSTANCEDARBPROC>
typealias PFNGLDRAWARRAYSINSTANCEDARBPROC = CPointer<CFunction<(GLenum, GLint, GLsizei, GLsizei) -> Unit>>

typealias PFNGLDRAWELEMENTSINSTANCEDARBPROCVar = CPointerVarOf<PFNGLDRAWELEMENTSINSTANCEDARBPROC>
typealias PFNGLDRAWELEMENTSINSTANCEDARBPROC = CPointer<CFunction<(GLenum, GLsizei, GLenum, COpaquePointer?, GLsizei) -> Unit>>

typealias PFNGLPROGRAMSTRINGARBPROCVar = CPointerVarOf<PFNGLPROGRAMSTRINGARBPROC>
typealias PFNGLPROGRAMSTRINGARBPROC = CPointer<CFunction<(GLenum, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLBINDPROGRAMARBPROCVar = CPointerVarOf<PFNGLBINDPROGRAMARBPROC>
typealias PFNGLBINDPROGRAMARBPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLDELETEPROGRAMSARBPROCVar = CPointerVarOf<PFNGLDELETEPROGRAMSARBPROC>
typealias PFNGLDELETEPROGRAMSARBPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGENPROGRAMSARBPROCVar = CPointerVarOf<PFNGLGENPROGRAMSARBPROC>
typealias PFNGLGENPROGRAMSARBPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLPROGRAMENVPARAMETER4DARBPROCVar = CPointerVarOf<PFNGLPROGRAMENVPARAMETER4DARBPROC>
typealias PFNGLPROGRAMENVPARAMETER4DARBPROC = CPointer<CFunction<(GLenum, GLuint, GLdouble, GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLPROGRAMENVPARAMETER4DVARBPROCVar = CPointerVarOf<PFNGLPROGRAMENVPARAMETER4DVARBPROC>
typealias PFNGLPROGRAMENVPARAMETER4DVARBPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLPROGRAMENVPARAMETER4FARBPROCVar = CPointerVarOf<PFNGLPROGRAMENVPARAMETER4FARBPROC>
typealias PFNGLPROGRAMENVPARAMETER4FARBPROC = CPointer<CFunction<(GLenum, GLuint, GLfloat, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLPROGRAMENVPARAMETER4FVARBPROCVar = CPointerVarOf<PFNGLPROGRAMENVPARAMETER4FVARBPROC>
typealias PFNGLPROGRAMENVPARAMETER4FVARBPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPROGRAMLOCALPARAMETER4DARBPROCVar = CPointerVarOf<PFNGLPROGRAMLOCALPARAMETER4DARBPROC>
typealias PFNGLPROGRAMLOCALPARAMETER4DARBPROC = CPointer<CFunction<(GLenum, GLuint, GLdouble, GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLPROGRAMLOCALPARAMETER4DVARBPROCVar = CPointerVarOf<PFNGLPROGRAMLOCALPARAMETER4DVARBPROC>
typealias PFNGLPROGRAMLOCALPARAMETER4DVARBPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLPROGRAMLOCALPARAMETER4FARBPROCVar = CPointerVarOf<PFNGLPROGRAMLOCALPARAMETER4FARBPROC>
typealias PFNGLPROGRAMLOCALPARAMETER4FARBPROC = CPointer<CFunction<(GLenum, GLuint, GLfloat, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLPROGRAMLOCALPARAMETER4FVARBPROCVar = CPointerVarOf<PFNGLPROGRAMLOCALPARAMETER4FVARBPROC>
typealias PFNGLPROGRAMLOCALPARAMETER4FVARBPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETPROGRAMENVPARAMETERDVARBPROCVar = CPointerVarOf<PFNGLGETPROGRAMENVPARAMETERDVARBPROC>
typealias PFNGLGETPROGRAMENVPARAMETERDVARBPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLGETPROGRAMENVPARAMETERFVARBPROCVar = CPointerVarOf<PFNGLGETPROGRAMENVPARAMETERFVARBPROC>
typealias PFNGLGETPROGRAMENVPARAMETERFVARBPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETPROGRAMLOCALPARAMETERDVARBPROCVar = CPointerVarOf<PFNGLGETPROGRAMLOCALPARAMETERDVARBPROC>
typealias PFNGLGETPROGRAMLOCALPARAMETERDVARBPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLGETPROGRAMLOCALPARAMETERFVARBPROCVar = CPointerVarOf<PFNGLGETPROGRAMLOCALPARAMETERFVARBPROC>
typealias PFNGLGETPROGRAMLOCALPARAMETERFVARBPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETPROGRAMIVARBPROCVar = CPointerVarOf<PFNGLGETPROGRAMIVARBPROC>
typealias PFNGLGETPROGRAMIVARBPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETPROGRAMSTRINGARBPROCVar = CPointerVarOf<PFNGLGETPROGRAMSTRINGARBPROC>
typealias PFNGLGETPROGRAMSTRINGARBPROC = CPointer<CFunction<(GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLISPROGRAMARBPROCVar = CPointerVarOf<PFNGLISPROGRAMARBPROC>
typealias PFNGLISPROGRAMARBPROC = CPointer<CFunction<(GLuint) -> GLboolean>>

typealias PFNGLPROGRAMPARAMETERIARBPROCVar = CPointerVarOf<PFNGLPROGRAMPARAMETERIARBPROC>
typealias PFNGLPROGRAMPARAMETERIARBPROC = CPointer<CFunction<(GLuint, GLenum, GLint) -> Unit>>

typealias PFNGLFRAMEBUFFERTEXTUREARBPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERTEXTUREARBPROC>
typealias PFNGLFRAMEBUFFERTEXTUREARBPROC = CPointer<CFunction<(GLenum, GLenum, GLuint, GLint) -> Unit>>

typealias PFNGLFRAMEBUFFERTEXTURELAYERARBPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERTEXTURELAYERARBPROC>
typealias PFNGLFRAMEBUFFERTEXTURELAYERARBPROC = CPointer<CFunction<(GLenum, GLenum, GLuint, GLint, GLint) -> Unit>>

typealias PFNGLFRAMEBUFFERTEXTUREFACEARBPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERTEXTUREFACEARBPROC>
typealias PFNGLFRAMEBUFFERTEXTUREFACEARBPROC = CPointer<CFunction<(GLenum, GLenum, GLuint, GLint, GLenum) -> Unit>>

typealias PFNGLSPECIALIZESHADERARBPROCVar = CPointerVarOf<PFNGLSPECIALIZESHADERARBPROC>
typealias PFNGLSPECIALIZESHADERARBPROC = CPointer<CFunction<(GLuint, CPointer<GLcharVar>?, GLuint, CPointer<GLuintVar>?, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLUNIFORM1I64ARBPROCVar = CPointerVarOf<PFNGLUNIFORM1I64ARBPROC>
typealias PFNGLUNIFORM1I64ARBPROC = CPointer<CFunction<(GLint, GLint64) -> Unit>>

typealias PFNGLUNIFORM2I64ARBPROCVar = CPointerVarOf<PFNGLUNIFORM2I64ARBPROC>
typealias PFNGLUNIFORM2I64ARBPROC = CPointer<CFunction<(GLint, GLint64, GLint64) -> Unit>>

typealias PFNGLUNIFORM3I64ARBPROCVar = CPointerVarOf<PFNGLUNIFORM3I64ARBPROC>
typealias PFNGLUNIFORM3I64ARBPROC = CPointer<CFunction<(GLint, GLint64, GLint64, GLint64) -> Unit>>

typealias PFNGLUNIFORM4I64ARBPROCVar = CPointerVarOf<PFNGLUNIFORM4I64ARBPROC>
typealias PFNGLUNIFORM4I64ARBPROC = CPointer<CFunction<(GLint, GLint64, GLint64, GLint64, GLint64) -> Unit>>

typealias PFNGLUNIFORM1I64VARBPROCVar = CPointerVarOf<PFNGLUNIFORM1I64VARBPROC>
typealias PFNGLUNIFORM1I64VARBPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLint64Var>?) -> Unit>>

typealias PFNGLUNIFORM2I64VARBPROCVar = CPointerVarOf<PFNGLUNIFORM2I64VARBPROC>
typealias PFNGLUNIFORM2I64VARBPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLint64Var>?) -> Unit>>

typealias PFNGLUNIFORM3I64VARBPROCVar = CPointerVarOf<PFNGLUNIFORM3I64VARBPROC>
typealias PFNGLUNIFORM3I64VARBPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLint64Var>?) -> Unit>>

typealias PFNGLUNIFORM4I64VARBPROCVar = CPointerVarOf<PFNGLUNIFORM4I64VARBPROC>
typealias PFNGLUNIFORM4I64VARBPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLint64Var>?) -> Unit>>

typealias PFNGLUNIFORM1UI64ARBPROCVar = CPointerVarOf<PFNGLUNIFORM1UI64ARBPROC>
typealias PFNGLUNIFORM1UI64ARBPROC = CPointer<CFunction<(GLint, GLuint64) -> Unit>>

typealias PFNGLUNIFORM2UI64ARBPROCVar = CPointerVarOf<PFNGLUNIFORM2UI64ARBPROC>
typealias PFNGLUNIFORM2UI64ARBPROC = CPointer<CFunction<(GLint, GLuint64, GLuint64) -> Unit>>

typealias PFNGLUNIFORM3UI64ARBPROCVar = CPointerVarOf<PFNGLUNIFORM3UI64ARBPROC>
typealias PFNGLUNIFORM3UI64ARBPROC = CPointer<CFunction<(GLint, GLuint64, GLuint64, GLuint64) -> Unit>>

typealias PFNGLUNIFORM4UI64ARBPROCVar = CPointerVarOf<PFNGLUNIFORM4UI64ARBPROC>
typealias PFNGLUNIFORM4UI64ARBPROC = CPointer<CFunction<(GLint, GLuint64, GLuint64, GLuint64, GLuint64) -> Unit>>

typealias PFNGLUNIFORM1UI64VARBPROCVar = CPointerVarOf<PFNGLUNIFORM1UI64VARBPROC>
typealias PFNGLUNIFORM1UI64VARBPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLuint64Var>?) -> Unit>>

typealias PFNGLUNIFORM2UI64VARBPROCVar = CPointerVarOf<PFNGLUNIFORM2UI64VARBPROC>
typealias PFNGLUNIFORM2UI64VARBPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLuint64Var>?) -> Unit>>

typealias PFNGLUNIFORM3UI64VARBPROCVar = CPointerVarOf<PFNGLUNIFORM3UI64VARBPROC>
typealias PFNGLUNIFORM3UI64VARBPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLuint64Var>?) -> Unit>>

typealias PFNGLUNIFORM4UI64VARBPROCVar = CPointerVarOf<PFNGLUNIFORM4UI64VARBPROC>
typealias PFNGLUNIFORM4UI64VARBPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLuint64Var>?) -> Unit>>

typealias PFNGLGETUNIFORMI64VARBPROCVar = CPointerVarOf<PFNGLGETUNIFORMI64VARBPROC>
typealias PFNGLGETUNIFORMI64VARBPROC = CPointer<CFunction<(GLuint, GLint, CPointer<GLint64Var>?) -> Unit>>

typealias PFNGLGETUNIFORMUI64VARBPROCVar = CPointerVarOf<PFNGLGETUNIFORMUI64VARBPROC>
typealias PFNGLGETUNIFORMUI64VARBPROC = CPointer<CFunction<(GLuint, GLint, CPointer<GLuint64Var>?) -> Unit>>

typealias PFNGLGETNUNIFORMI64VARBPROCVar = CPointerVarOf<PFNGLGETNUNIFORMI64VARBPROC>
typealias PFNGLGETNUNIFORMI64VARBPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLint64Var>?) -> Unit>>

typealias PFNGLGETNUNIFORMUI64VARBPROCVar = CPointerVarOf<PFNGLGETNUNIFORMUI64VARBPROC>
typealias PFNGLGETNUNIFORMUI64VARBPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLuint64Var>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM1I64ARBPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1I64ARBPROC>
typealias PFNGLPROGRAMUNIFORM1I64ARBPROC = CPointer<CFunction<(GLuint, GLint, GLint64) -> Unit>>

typealias PFNGLPROGRAMUNIFORM2I64ARBPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2I64ARBPROC>
typealias PFNGLPROGRAMUNIFORM2I64ARBPROC = CPointer<CFunction<(GLuint, GLint, GLint64, GLint64) -> Unit>>

typealias PFNGLPROGRAMUNIFORM3I64ARBPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3I64ARBPROC>
typealias PFNGLPROGRAMUNIFORM3I64ARBPROC = CPointer<CFunction<(GLuint, GLint, GLint64, GLint64, GLint64) -> Unit>>

typealias PFNGLPROGRAMUNIFORM4I64ARBPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4I64ARBPROC>
typealias PFNGLPROGRAMUNIFORM4I64ARBPROC = CPointer<CFunction<(GLuint, GLint, GLint64, GLint64, GLint64, GLint64) -> Unit>>

typealias PFNGLPROGRAMUNIFORM1I64VARBPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1I64VARBPROC>
typealias PFNGLPROGRAMUNIFORM1I64VARBPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLint64Var>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM2I64VARBPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2I64VARBPROC>
typealias PFNGLPROGRAMUNIFORM2I64VARBPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLint64Var>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM3I64VARBPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3I64VARBPROC>
typealias PFNGLPROGRAMUNIFORM3I64VARBPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLint64Var>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM4I64VARBPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4I64VARBPROC>
typealias PFNGLPROGRAMUNIFORM4I64VARBPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLint64Var>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM1UI64ARBPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1UI64ARBPROC>
typealias PFNGLPROGRAMUNIFORM1UI64ARBPROC = CPointer<CFunction<(GLuint, GLint, GLuint64) -> Unit>>

typealias PFNGLPROGRAMUNIFORM2UI64ARBPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2UI64ARBPROC>
typealias PFNGLPROGRAMUNIFORM2UI64ARBPROC = CPointer<CFunction<(GLuint, GLint, GLuint64, GLuint64) -> Unit>>

typealias PFNGLPROGRAMUNIFORM3UI64ARBPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3UI64ARBPROC>
typealias PFNGLPROGRAMUNIFORM3UI64ARBPROC = CPointer<CFunction<(GLuint, GLint, GLuint64, GLuint64, GLuint64) -> Unit>>

typealias PFNGLPROGRAMUNIFORM4UI64ARBPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4UI64ARBPROC>
typealias PFNGLPROGRAMUNIFORM4UI64ARBPROC = CPointer<CFunction<(GLuint, GLint, GLuint64, GLuint64, GLuint64, GLuint64) -> Unit>>

typealias PFNGLPROGRAMUNIFORM1UI64VARBPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1UI64VARBPROC>
typealias PFNGLPROGRAMUNIFORM1UI64VARBPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLuint64Var>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM2UI64VARBPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2UI64VARBPROC>
typealias PFNGLPROGRAMUNIFORM2UI64VARBPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLuint64Var>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM3UI64VARBPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3UI64VARBPROC>
typealias PFNGLPROGRAMUNIFORM3UI64VARBPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLuint64Var>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM4UI64VARBPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4UI64VARBPROC>
typealias PFNGLPROGRAMUNIFORM4UI64VARBPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLuint64Var>?) -> Unit>>

typealias GLhalfARBVar = UShortVarOf<GLhalfARB>
typealias GLhalfARB = UShort

typealias PFNGLMULTIDRAWARRAYSINDIRECTCOUNTARBPROCVar = CPointerVarOf<PFNGLMULTIDRAWARRAYSINDIRECTCOUNTARBPROC>
typealias PFNGLMULTIDRAWARRAYSINDIRECTCOUNTARBPROC = CPointer<CFunction<(GLenum, COpaquePointer?, GLintptr, GLsizei, GLsizei) -> Unit>>

typealias PFNGLMULTIDRAWELEMENTSINDIRECTCOUNTARBPROCVar = CPointerVarOf<PFNGLMULTIDRAWELEMENTSINDIRECTCOUNTARBPROC>
typealias PFNGLMULTIDRAWELEMENTSINDIRECTCOUNTARBPROC = CPointer<CFunction<(GLenum, GLenum, COpaquePointer?, GLintptr, GLsizei, GLsizei) -> Unit>>

typealias PFNGLVERTEXATTRIBDIVISORARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBDIVISORARBPROC>
typealias PFNGLVERTEXATTRIBDIVISORARBPROC = CPointer<CFunction<(GLuint, GLuint) -> Unit>>

typealias PFNGLCURRENTPALETTEMATRIXARBPROCVar = CPointerVarOf<PFNGLCURRENTPALETTEMATRIXARBPROC>
typealias PFNGLCURRENTPALETTEMATRIXARBPROC = CPointer<CFunction<(GLint) -> Unit>>

typealias PFNGLMATRIXINDEXUBVARBPROCVar = CPointerVarOf<PFNGLMATRIXINDEXUBVARBPROC>
typealias PFNGLMATRIXINDEXUBVARBPROC = CPointer<CFunction<(GLint, CPointer<GLubyteVar>?) -> Unit>>

typealias PFNGLMATRIXINDEXUSVARBPROCVar = CPointerVarOf<PFNGLMATRIXINDEXUSVARBPROC>
typealias PFNGLMATRIXINDEXUSVARBPROC = CPointer<CFunction<(GLint, CPointer<GLushortVar>?) -> Unit>>

typealias PFNGLMATRIXINDEXUIVARBPROCVar = CPointerVarOf<PFNGLMATRIXINDEXUIVARBPROC>
typealias PFNGLMATRIXINDEXUIVARBPROC = CPointer<CFunction<(GLint, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLMATRIXINDEXPOINTERARBPROCVar = CPointerVarOf<PFNGLMATRIXINDEXPOINTERARBPROC>
typealias PFNGLMATRIXINDEXPOINTERARBPROC = CPointer<CFunction<(GLint, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLSAMPLECOVERAGEARBPROCVar = CPointerVarOf<PFNGLSAMPLECOVERAGEARBPROC>
typealias PFNGLSAMPLECOVERAGEARBPROC = CPointer<CFunction<(GLfloat, GLboolean) -> Unit>>

typealias PFNGLGENQUERIESARBPROCVar = CPointerVarOf<PFNGLGENQUERIESARBPROC>
typealias PFNGLGENQUERIESARBPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLDELETEQUERIESARBPROCVar = CPointerVarOf<PFNGLDELETEQUERIESARBPROC>
typealias PFNGLDELETEQUERIESARBPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLISQUERYARBPROCVar = CPointerVarOf<PFNGLISQUERYARBPROC>
typealias PFNGLISQUERYARBPROC = CPointer<CFunction<(GLuint) -> GLboolean>>

typealias PFNGLBEGINQUERYARBPROCVar = CPointerVarOf<PFNGLBEGINQUERYARBPROC>
typealias PFNGLBEGINQUERYARBPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLENDQUERYARBPROCVar = CPointerVarOf<PFNGLENDQUERYARBPROC>
typealias PFNGLENDQUERYARBPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLGETQUERYIVARBPROCVar = CPointerVarOf<PFNGLGETQUERYIVARBPROC>
typealias PFNGLGETQUERYIVARBPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETQUERYOBJECTIVARBPROCVar = CPointerVarOf<PFNGLGETQUERYOBJECTIVARBPROC>
typealias PFNGLGETQUERYOBJECTIVARBPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETQUERYOBJECTUIVARBPROCVar = CPointerVarOf<PFNGLGETQUERYOBJECTUIVARBPROC>
typealias PFNGLGETQUERYOBJECTUIVARBPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLMAXSHADERCOMPILERTHREADSARBPROCVar = CPointerVarOf<PFNGLMAXSHADERCOMPILERTHREADSARBPROC>
typealias PFNGLMAXSHADERCOMPILERTHREADSARBPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLPOINTPARAMETERFARBPROCVar = CPointerVarOf<PFNGLPOINTPARAMETERFARBPROC>
typealias PFNGLPOINTPARAMETERFARBPROC = CPointer<CFunction<(GLenum, GLfloat) -> Unit>>

typealias PFNGLPOINTPARAMETERFVARBPROCVar = CPointerVarOf<PFNGLPOINTPARAMETERFVARBPROC>
typealias PFNGLPOINTPARAMETERFVARBPROC = CPointer<CFunction<(GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETGRAPHICSRESETSTATUSARBPROCVar = CPointerVarOf<PFNGLGETGRAPHICSRESETSTATUSARBPROC>
typealias PFNGLGETGRAPHICSRESETSTATUSARBPROC = CPointer<CFunction<() -> GLenum>>

typealias PFNGLGETNTEXIMAGEARBPROCVar = CPointerVarOf<PFNGLGETNTEXIMAGEARBPROC>
typealias PFNGLGETNTEXIMAGEARBPROC = CPointer<CFunction<(GLenum, GLint, GLenum, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLREADNPIXELSARBPROCVar = CPointerVarOf<PFNGLREADNPIXELSARBPROC>
typealias PFNGLREADNPIXELSARBPROC = CPointer<CFunction<(GLint, GLint, GLsizei, GLsizei, GLenum, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLGETNCOMPRESSEDTEXIMAGEARBPROCVar = CPointerVarOf<PFNGLGETNCOMPRESSEDTEXIMAGEARBPROC>
typealias PFNGLGETNCOMPRESSEDTEXIMAGEARBPROC = CPointer<CFunction<(GLenum, GLint, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLGETNUNIFORMFVARBPROCVar = CPointerVarOf<PFNGLGETNUNIFORMFVARBPROC>
typealias PFNGLGETNUNIFORMFVARBPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETNUNIFORMIVARBPROCVar = CPointerVarOf<PFNGLGETNUNIFORMIVARBPROC>
typealias PFNGLGETNUNIFORMIVARBPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETNUNIFORMUIVARBPROCVar = CPointerVarOf<PFNGLGETNUNIFORMUIVARBPROC>
typealias PFNGLGETNUNIFORMUIVARBPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGETNUNIFORMDVARBPROCVar = CPointerVarOf<PFNGLGETNUNIFORMDVARBPROC>
typealias PFNGLGETNUNIFORMDVARBPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLGETNMAPDVARBPROCVar = CPointerVarOf<PFNGLGETNMAPDVARBPROC>
typealias PFNGLGETNMAPDVARBPROC = CPointer<CFunction<(GLenum, GLenum, GLsizei, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLGETNMAPFVARBPROCVar = CPointerVarOf<PFNGLGETNMAPFVARBPROC>
typealias PFNGLGETNMAPFVARBPROC = CPointer<CFunction<(GLenum, GLenum, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETNMAPIVARBPROCVar = CPointerVarOf<PFNGLGETNMAPIVARBPROC>
typealias PFNGLGETNMAPIVARBPROC = CPointer<CFunction<(GLenum, GLenum, GLsizei, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETNPIXELMAPFVARBPROCVar = CPointerVarOf<PFNGLGETNPIXELMAPFVARBPROC>
typealias PFNGLGETNPIXELMAPFVARBPROC = CPointer<CFunction<(GLenum, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETNPIXELMAPUIVARBPROCVar = CPointerVarOf<PFNGLGETNPIXELMAPUIVARBPROC>
typealias PFNGLGETNPIXELMAPUIVARBPROC = CPointer<CFunction<(GLenum, GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGETNPIXELMAPUSVARBPROCVar = CPointerVarOf<PFNGLGETNPIXELMAPUSVARBPROC>
typealias PFNGLGETNPIXELMAPUSVARBPROC = CPointer<CFunction<(GLenum, GLsizei, CPointer<GLushortVar>?) -> Unit>>

typealias PFNGLGETNPOLYGONSTIPPLEARBPROCVar = CPointerVarOf<PFNGLGETNPOLYGONSTIPPLEARBPROC>
typealias PFNGLGETNPOLYGONSTIPPLEARBPROC = CPointer<CFunction<(GLsizei, CPointer<GLubyteVar>?) -> Unit>>

typealias PFNGLGETNCOLORTABLEARBPROCVar = CPointerVarOf<PFNGLGETNCOLORTABLEARBPROC>
typealias PFNGLGETNCOLORTABLEARBPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLGETNCONVOLUTIONFILTERARBPROCVar = CPointerVarOf<PFNGLGETNCONVOLUTIONFILTERARBPROC>
typealias PFNGLGETNCONVOLUTIONFILTERARBPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLGETNSEPARABLEFILTERARBPROCVar = CPointerVarOf<PFNGLGETNSEPARABLEFILTERARBPROC>
typealias PFNGLGETNSEPARABLEFILTERARBPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, GLsizei, COpaquePointer?, GLsizei, COpaquePointer?, COpaquePointer?) -> Unit>>

typealias PFNGLGETNHISTOGRAMARBPROCVar = CPointerVarOf<PFNGLGETNHISTOGRAMARBPROC>
typealias PFNGLGETNHISTOGRAMARBPROC = CPointer<CFunction<(GLenum, GLboolean, GLenum, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLGETNMINMAXARBPROCVar = CPointerVarOf<PFNGLGETNMINMAXARBPROC>
typealias PFNGLGETNMINMAXARBPROC = CPointer<CFunction<(GLenum, GLboolean, GLenum, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLFRAMEBUFFERSAMPLELOCATIONSFVARBPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERSAMPLELOCATIONSFVARBPROC>
typealias PFNGLFRAMEBUFFERSAMPLELOCATIONSFVARBPROC = CPointer<CFunction<(GLenum, GLuint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLNAMEDFRAMEBUFFERSAMPLELOCATIONSFVARBPROCVar = CPointerVarOf<PFNGLNAMEDFRAMEBUFFERSAMPLELOCATIONSFVARBPROC>
typealias PFNGLNAMEDFRAMEBUFFERSAMPLELOCATIONSFVARBPROC = CPointer<CFunction<(GLuint, GLuint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLEVALUATEDEPTHVALUESARBPROCVar = CPointerVarOf<PFNGLEVALUATEDEPTHVALUESARBPROC>
typealias PFNGLEVALUATEDEPTHVALUESARBPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLMINSAMPLESHADINGARBPROCVar = CPointerVarOf<PFNGLMINSAMPLESHADINGARBPROC>
typealias PFNGLMINSAMPLESHADINGARBPROC = CPointer<CFunction<(GLfloat) -> Unit>>

typealias GLhandleARBVar = UIntVarOf<GLhandleARB>
typealias GLhandleARB = UInt

typealias GLcharARBVar = ByteVarOf<GLcharARB>
typealias GLcharARB = Byte

typealias PFNGLDELETEOBJECTARBPROCVar = CPointerVarOf<PFNGLDELETEOBJECTARBPROC>
typealias PFNGLDELETEOBJECTARBPROC = CPointer<CFunction<(GLhandleARB) -> Unit>>

typealias PFNGLGETHANDLEARBPROCVar = CPointerVarOf<PFNGLGETHANDLEARBPROC>
typealias PFNGLGETHANDLEARBPROC = CPointer<CFunction<(GLenum) -> GLhandleARB>>

typealias PFNGLDETACHOBJECTARBPROCVar = CPointerVarOf<PFNGLDETACHOBJECTARBPROC>
typealias PFNGLDETACHOBJECTARBPROC = CPointer<CFunction<(GLhandleARB, GLhandleARB) -> Unit>>

typealias PFNGLCREATESHADEROBJECTARBPROCVar = CPointerVarOf<PFNGLCREATESHADEROBJECTARBPROC>
typealias PFNGLCREATESHADEROBJECTARBPROC = CPointer<CFunction<(GLenum) -> GLhandleARB>>

typealias PFNGLSHADERSOURCEARBPROCVar = CPointerVarOf<PFNGLSHADERSOURCEARBPROC>
typealias PFNGLSHADERSOURCEARBPROC = CPointer<CFunction<(GLhandleARB, GLsizei, CPointer<CPointerVar<GLcharARBVar>>?, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLCOMPILESHADERARBPROCVar = CPointerVarOf<PFNGLCOMPILESHADERARBPROC>
typealias PFNGLCOMPILESHADERARBPROC = CPointer<CFunction<(GLhandleARB) -> Unit>>

typealias PFNGLCREATEPROGRAMOBJECTARBPROCVar = CPointerVarOf<PFNGLCREATEPROGRAMOBJECTARBPROC>
typealias PFNGLCREATEPROGRAMOBJECTARBPROC = CPointer<CFunction<() -> GLhandleARB>>

typealias PFNGLATTACHOBJECTARBPROCVar = CPointerVarOf<PFNGLATTACHOBJECTARBPROC>
typealias PFNGLATTACHOBJECTARBPROC = CPointer<CFunction<(GLhandleARB, GLhandleARB) -> Unit>>

typealias PFNGLLINKPROGRAMARBPROCVar = CPointerVarOf<PFNGLLINKPROGRAMARBPROC>
typealias PFNGLLINKPROGRAMARBPROC = CPointer<CFunction<(GLhandleARB) -> Unit>>

typealias PFNGLUSEPROGRAMOBJECTARBPROCVar = CPointerVarOf<PFNGLUSEPROGRAMOBJECTARBPROC>
typealias PFNGLUSEPROGRAMOBJECTARBPROC = CPointer<CFunction<(GLhandleARB) -> Unit>>

typealias PFNGLVALIDATEPROGRAMARBPROCVar = CPointerVarOf<PFNGLVALIDATEPROGRAMARBPROC>
typealias PFNGLVALIDATEPROGRAMARBPROC = CPointer<CFunction<(GLhandleARB) -> Unit>>

typealias PFNGLUNIFORM1FARBPROCVar = CPointerVarOf<PFNGLUNIFORM1FARBPROC>
typealias PFNGLUNIFORM1FARBPROC = CPointer<CFunction<(GLint, GLfloat) -> Unit>>

typealias PFNGLUNIFORM2FARBPROCVar = CPointerVarOf<PFNGLUNIFORM2FARBPROC>
typealias PFNGLUNIFORM2FARBPROC = CPointer<CFunction<(GLint, GLfloat, GLfloat) -> Unit>>

typealias PFNGLUNIFORM3FARBPROCVar = CPointerVarOf<PFNGLUNIFORM3FARBPROC>
typealias PFNGLUNIFORM3FARBPROC = CPointer<CFunction<(GLint, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLUNIFORM4FARBPROCVar = CPointerVarOf<PFNGLUNIFORM4FARBPROC>
typealias PFNGLUNIFORM4FARBPROC = CPointer<CFunction<(GLint, GLfloat, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLUNIFORM1IARBPROCVar = CPointerVarOf<PFNGLUNIFORM1IARBPROC>
typealias PFNGLUNIFORM1IARBPROC = CPointer<CFunction<(GLint, GLint) -> Unit>>

typealias PFNGLUNIFORM2IARBPROCVar = CPointerVarOf<PFNGLUNIFORM2IARBPROC>
typealias PFNGLUNIFORM2IARBPROC = CPointer<CFunction<(GLint, GLint, GLint) -> Unit>>

typealias PFNGLUNIFORM3IARBPROCVar = CPointerVarOf<PFNGLUNIFORM3IARBPROC>
typealias PFNGLUNIFORM3IARBPROC = CPointer<CFunction<(GLint, GLint, GLint, GLint) -> Unit>>

typealias PFNGLUNIFORM4IARBPROCVar = CPointerVarOf<PFNGLUNIFORM4IARBPROC>
typealias PFNGLUNIFORM4IARBPROC = CPointer<CFunction<(GLint, GLint, GLint, GLint, GLint) -> Unit>>

typealias PFNGLUNIFORM1FVARBPROCVar = CPointerVarOf<PFNGLUNIFORM1FVARBPROC>
typealias PFNGLUNIFORM1FVARBPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLUNIFORM2FVARBPROCVar = CPointerVarOf<PFNGLUNIFORM2FVARBPROC>
typealias PFNGLUNIFORM2FVARBPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLUNIFORM3FVARBPROCVar = CPointerVarOf<PFNGLUNIFORM3FVARBPROC>
typealias PFNGLUNIFORM3FVARBPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLUNIFORM4FVARBPROCVar = CPointerVarOf<PFNGLUNIFORM4FVARBPROC>
typealias PFNGLUNIFORM4FVARBPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLUNIFORM1IVARBPROCVar = CPointerVarOf<PFNGLUNIFORM1IVARBPROC>
typealias PFNGLUNIFORM1IVARBPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLUNIFORM2IVARBPROCVar = CPointerVarOf<PFNGLUNIFORM2IVARBPROC>
typealias PFNGLUNIFORM2IVARBPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLUNIFORM3IVARBPROCVar = CPointerVarOf<PFNGLUNIFORM3IVARBPROC>
typealias PFNGLUNIFORM3IVARBPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLUNIFORM4IVARBPROCVar = CPointerVarOf<PFNGLUNIFORM4IVARBPROC>
typealias PFNGLUNIFORM4IVARBPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLUNIFORMMATRIX2FVARBPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX2FVARBPROC>
typealias PFNGLUNIFORMMATRIX2FVARBPROC = CPointer<CFunction<(GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLUNIFORMMATRIX3FVARBPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX3FVARBPROC>
typealias PFNGLUNIFORMMATRIX3FVARBPROC = CPointer<CFunction<(GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLUNIFORMMATRIX4FVARBPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX4FVARBPROC>
typealias PFNGLUNIFORMMATRIX4FVARBPROC = CPointer<CFunction<(GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETOBJECTPARAMETERFVARBPROCVar = CPointerVarOf<PFNGLGETOBJECTPARAMETERFVARBPROC>
typealias PFNGLGETOBJECTPARAMETERFVARBPROC = CPointer<CFunction<(GLhandleARB, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETOBJECTPARAMETERIVARBPROCVar = CPointerVarOf<PFNGLGETOBJECTPARAMETERIVARBPROC>
typealias PFNGLGETOBJECTPARAMETERIVARBPROC = CPointer<CFunction<(GLhandleARB, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETINFOLOGARBPROCVar = CPointerVarOf<PFNGLGETINFOLOGARBPROC>
typealias PFNGLGETINFOLOGARBPROC = CPointer<CFunction<(GLhandleARB, GLsizei, CPointer<GLsizeiVar>?, CPointer<GLcharARBVar>?) -> Unit>>

typealias PFNGLGETATTACHEDOBJECTSARBPROCVar = CPointerVarOf<PFNGLGETATTACHEDOBJECTSARBPROC>
typealias PFNGLGETATTACHEDOBJECTSARBPROC = CPointer<CFunction<(GLhandleARB, GLsizei, CPointer<GLsizeiVar>?, CPointer<GLhandleARBVar>?) -> Unit>>

typealias PFNGLGETUNIFORMLOCATIONARBPROCVar = CPointerVarOf<PFNGLGETUNIFORMLOCATIONARBPROC>
typealias PFNGLGETUNIFORMLOCATIONARBPROC = CPointer<CFunction<(GLhandleARB, CPointer<GLcharARBVar>?) -> GLint>>

typealias PFNGLGETACTIVEUNIFORMARBPROCVar = CPointerVarOf<PFNGLGETACTIVEUNIFORMARBPROC>
typealias PFNGLGETACTIVEUNIFORMARBPROC = CPointer<CFunction<(GLhandleARB, GLuint, GLsizei, CPointer<GLsizeiVar>?, CPointer<GLintVar>?, CPointer<GLenumVar>?, CPointer<GLcharARBVar>?) -> Unit>>

typealias PFNGLGETUNIFORMFVARBPROCVar = CPointerVarOf<PFNGLGETUNIFORMFVARBPROC>
typealias PFNGLGETUNIFORMFVARBPROC = CPointer<CFunction<(GLhandleARB, GLint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETUNIFORMIVARBPROCVar = CPointerVarOf<PFNGLGETUNIFORMIVARBPROC>
typealias PFNGLGETUNIFORMIVARBPROC = CPointer<CFunction<(GLhandleARB, GLint, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETSHADERSOURCEARBPROCVar = CPointerVarOf<PFNGLGETSHADERSOURCEARBPROC>
typealias PFNGLGETSHADERSOURCEARBPROC = CPointer<CFunction<(GLhandleARB, GLsizei, CPointer<GLsizeiVar>?, CPointer<GLcharARBVar>?) -> Unit>>

typealias PFNGLNAMEDSTRINGARBPROCVar = CPointerVarOf<PFNGLNAMEDSTRINGARBPROC>
typealias PFNGLNAMEDSTRINGARBPROC = CPointer<CFunction<(GLenum, GLint, CPointer<GLcharVar>?, GLint, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLDELETENAMEDSTRINGARBPROCVar = CPointerVarOf<PFNGLDELETENAMEDSTRINGARBPROC>
typealias PFNGLDELETENAMEDSTRINGARBPROC = CPointer<CFunction<(GLint, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLCOMPILESHADERINCLUDEARBPROCVar = CPointerVarOf<PFNGLCOMPILESHADERINCLUDEARBPROC>
typealias PFNGLCOMPILESHADERINCLUDEARBPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<CPointerVar<GLcharVar>>?, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLISNAMEDSTRINGARBPROCVar = CPointerVarOf<PFNGLISNAMEDSTRINGARBPROC>
typealias PFNGLISNAMEDSTRINGARBPROC = CPointer<CFunction<(GLint, CPointer<GLcharVar>?) -> GLboolean>>

typealias PFNGLGETNAMEDSTRINGARBPROCVar = CPointerVarOf<PFNGLGETNAMEDSTRINGARBPROC>
typealias PFNGLGETNAMEDSTRINGARBPROC = CPointer<CFunction<(GLint, CPointer<GLcharVar>?, GLsizei, CPointer<GLintVar>?, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLGETNAMEDSTRINGIVARBPROCVar = CPointerVarOf<PFNGLGETNAMEDSTRINGIVARBPROC>
typealias PFNGLGETNAMEDSTRINGIVARBPROC = CPointer<CFunction<(GLint, CPointer<GLcharVar>?, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLBUFFERPAGECOMMITMENTARBPROCVar = CPointerVarOf<PFNGLBUFFERPAGECOMMITMENTARBPROC>
typealias PFNGLBUFFERPAGECOMMITMENTARBPROC = CPointer<CFunction<(GLenum, GLintptr, GLsizeiptr, GLboolean) -> Unit>>

typealias PFNGLNAMEDBUFFERPAGECOMMITMENTEXTPROCVar = CPointerVarOf<PFNGLNAMEDBUFFERPAGECOMMITMENTEXTPROC>
typealias PFNGLNAMEDBUFFERPAGECOMMITMENTEXTPROC = CPointer<CFunction<(GLuint, GLintptr, GLsizeiptr, GLboolean) -> Unit>>

typealias PFNGLNAMEDBUFFERPAGECOMMITMENTARBPROCVar = CPointerVarOf<PFNGLNAMEDBUFFERPAGECOMMITMENTARBPROC>
typealias PFNGLNAMEDBUFFERPAGECOMMITMENTARBPROC = CPointer<CFunction<(GLuint, GLintptr, GLsizeiptr, GLboolean) -> Unit>>

typealias PFNGLTEXPAGECOMMITMENTARBPROCVar = CPointerVarOf<PFNGLTEXPAGECOMMITMENTARBPROC>
typealias PFNGLTEXPAGECOMMITMENTARBPROC = CPointer<CFunction<(GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLboolean) -> Unit>>

typealias PFNGLTEXBUFFERARBPROCVar = CPointerVarOf<PFNGLTEXBUFFERARBPROC>
typealias PFNGLTEXBUFFERARBPROC = CPointer<CFunction<(GLenum, GLenum, GLuint) -> Unit>>

typealias PFNGLCOMPRESSEDTEXIMAGE3DARBPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXIMAGE3DARBPROC>
typealias PFNGLCOMPRESSEDTEXIMAGE3DARBPROC = CPointer<CFunction<(GLenum, GLint, GLenum, GLsizei, GLsizei, GLsizei, GLint, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLCOMPRESSEDTEXIMAGE2DARBPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXIMAGE2DARBPROC>
typealias PFNGLCOMPRESSEDTEXIMAGE2DARBPROC = CPointer<CFunction<(GLenum, GLint, GLenum, GLsizei, GLsizei, GLint, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLCOMPRESSEDTEXIMAGE1DARBPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXIMAGE1DARBPROC>
typealias PFNGLCOMPRESSEDTEXIMAGE1DARBPROC = CPointer<CFunction<(GLenum, GLint, GLenum, GLsizei, GLint, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLCOMPRESSEDTEXSUBIMAGE3DARBPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXSUBIMAGE3DARBPROC>
typealias PFNGLCOMPRESSEDTEXSUBIMAGE3DARBPROC = CPointer<CFunction<(GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLCOMPRESSEDTEXSUBIMAGE2DARBPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXSUBIMAGE2DARBPROC>
typealias PFNGLCOMPRESSEDTEXSUBIMAGE2DARBPROC = CPointer<CFunction<(GLenum, GLint, GLint, GLint, GLsizei, GLsizei, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLCOMPRESSEDTEXSUBIMAGE1DARBPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXSUBIMAGE1DARBPROC>
typealias PFNGLCOMPRESSEDTEXSUBIMAGE1DARBPROC = CPointer<CFunction<(GLenum, GLint, GLint, GLsizei, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLGETCOMPRESSEDTEXIMAGEARBPROCVar = CPointerVarOf<PFNGLGETCOMPRESSEDTEXIMAGEARBPROC>
typealias PFNGLGETCOMPRESSEDTEXIMAGEARBPROC = CPointer<CFunction<(GLenum, GLint, COpaquePointer?) -> Unit>>

typealias PFNGLLOADTRANSPOSEMATRIXFARBPROCVar = CPointerVarOf<PFNGLLOADTRANSPOSEMATRIXFARBPROC>
typealias PFNGLLOADTRANSPOSEMATRIXFARBPROC = CPointer<CFunction<(CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLLOADTRANSPOSEMATRIXDARBPROCVar = CPointerVarOf<PFNGLLOADTRANSPOSEMATRIXDARBPROC>
typealias PFNGLLOADTRANSPOSEMATRIXDARBPROC = CPointer<CFunction<(CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLMULTTRANSPOSEMATRIXFARBPROCVar = CPointerVarOf<PFNGLMULTTRANSPOSEMATRIXFARBPROC>
typealias PFNGLMULTTRANSPOSEMATRIXFARBPROC = CPointer<CFunction<(CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLMULTTRANSPOSEMATRIXDARBPROCVar = CPointerVarOf<PFNGLMULTTRANSPOSEMATRIXDARBPROC>
typealias PFNGLMULTTRANSPOSEMATRIXDARBPROC = CPointer<CFunction<(CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLWEIGHTBVARBPROCVar = CPointerVarOf<PFNGLWEIGHTBVARBPROC>
typealias PFNGLWEIGHTBVARBPROC = CPointer<CFunction<(GLint, CPointer<GLbyteVar>?) -> Unit>>

typealias PFNGLWEIGHTSVARBPROCVar = CPointerVarOf<PFNGLWEIGHTSVARBPROC>
typealias PFNGLWEIGHTSVARBPROC = CPointer<CFunction<(GLint, CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLWEIGHTIVARBPROCVar = CPointerVarOf<PFNGLWEIGHTIVARBPROC>
typealias PFNGLWEIGHTIVARBPROC = CPointer<CFunction<(GLint, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLWEIGHTFVARBPROCVar = CPointerVarOf<PFNGLWEIGHTFVARBPROC>
typealias PFNGLWEIGHTFVARBPROC = CPointer<CFunction<(GLint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLWEIGHTDVARBPROCVar = CPointerVarOf<PFNGLWEIGHTDVARBPROC>
typealias PFNGLWEIGHTDVARBPROC = CPointer<CFunction<(GLint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLWEIGHTUBVARBPROCVar = CPointerVarOf<PFNGLWEIGHTUBVARBPROC>
typealias PFNGLWEIGHTUBVARBPROC = CPointer<CFunction<(GLint, CPointer<GLubyteVar>?) -> Unit>>

typealias PFNGLWEIGHTUSVARBPROCVar = CPointerVarOf<PFNGLWEIGHTUSVARBPROC>
typealias PFNGLWEIGHTUSVARBPROC = CPointer<CFunction<(GLint, CPointer<GLushortVar>?) -> Unit>>

typealias PFNGLWEIGHTUIVARBPROCVar = CPointerVarOf<PFNGLWEIGHTUIVARBPROC>
typealias PFNGLWEIGHTUIVARBPROC = CPointer<CFunction<(GLint, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLWEIGHTPOINTERARBPROCVar = CPointerVarOf<PFNGLWEIGHTPOINTERARBPROC>
typealias PFNGLWEIGHTPOINTERARBPROC = CPointer<CFunction<(GLint, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLVERTEXBLENDARBPROCVar = CPointerVarOf<PFNGLVERTEXBLENDARBPROC>
typealias PFNGLVERTEXBLENDARBPROC = CPointer<CFunction<(GLint) -> Unit>>

typealias GLsizeiptrARBVar = LongVarOf<GLsizeiptrARB>
typealias GLsizeiptrARB = ptrdiff_t

typealias GLintptrARBVar = LongVarOf<GLintptrARB>
typealias GLintptrARB = ptrdiff_t

typealias PFNGLBINDBUFFERARBPROCVar = CPointerVarOf<PFNGLBINDBUFFERARBPROC>
typealias PFNGLBINDBUFFERARBPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLDELETEBUFFERSARBPROCVar = CPointerVarOf<PFNGLDELETEBUFFERSARBPROC>
typealias PFNGLDELETEBUFFERSARBPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGENBUFFERSARBPROCVar = CPointerVarOf<PFNGLGENBUFFERSARBPROC>
typealias PFNGLGENBUFFERSARBPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLISBUFFERARBPROCVar = CPointerVarOf<PFNGLISBUFFERARBPROC>
typealias PFNGLISBUFFERARBPROC = CPointer<CFunction<(GLuint) -> GLboolean>>

typealias PFNGLBUFFERDATAARBPROCVar = CPointerVarOf<PFNGLBUFFERDATAARBPROC>
typealias PFNGLBUFFERDATAARBPROC = CPointer<CFunction<(GLenum, GLsizeiptrARB, COpaquePointer?, GLenum) -> Unit>>

typealias PFNGLBUFFERSUBDATAARBPROCVar = CPointerVarOf<PFNGLBUFFERSUBDATAARBPROC>
typealias PFNGLBUFFERSUBDATAARBPROC = CPointer<CFunction<(GLenum, GLintptrARB, GLsizeiptrARB, COpaquePointer?) -> Unit>>

typealias PFNGLGETBUFFERSUBDATAARBPROCVar = CPointerVarOf<PFNGLGETBUFFERSUBDATAARBPROC>
typealias PFNGLGETBUFFERSUBDATAARBPROC = CPointer<CFunction<(GLenum, GLintptrARB, GLsizeiptrARB, COpaquePointer?) -> Unit>>

typealias PFNGLMAPBUFFERARBPROCVar = CPointerVarOf<PFNGLMAPBUFFERARBPROC>
typealias PFNGLMAPBUFFERARBPROC = CPointer<CFunction<(GLenum, GLenum) -> COpaquePointer?>>

typealias PFNGLUNMAPBUFFERARBPROCVar = CPointerVarOf<PFNGLUNMAPBUFFERARBPROC>
typealias PFNGLUNMAPBUFFERARBPROC = CPointer<CFunction<(GLenum) -> GLboolean>>

typealias PFNGLGETBUFFERPARAMETERIVARBPROCVar = CPointerVarOf<PFNGLGETBUFFERPARAMETERIVARBPROC>
typealias PFNGLGETBUFFERPARAMETERIVARBPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETBUFFERPOINTERVARBPROCVar = CPointerVarOf<PFNGLGETBUFFERPOINTERVARBPROC>
typealias PFNGLGETBUFFERPOINTERVARBPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<COpaquePointerVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB1DARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1DARBPROC>
typealias PFNGLVERTEXATTRIB1DARBPROC = CPointer<CFunction<(GLuint, GLdouble) -> Unit>>

typealias PFNGLVERTEXATTRIB1DVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1DVARBPROC>
typealias PFNGLVERTEXATTRIB1DVARBPROC = CPointer<CFunction<(GLuint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB1FARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1FARBPROC>
typealias PFNGLVERTEXATTRIB1FARBPROC = CPointer<CFunction<(GLuint, GLfloat) -> Unit>>

typealias PFNGLVERTEXATTRIB1FVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1FVARBPROC>
typealias PFNGLVERTEXATTRIB1FVARBPROC = CPointer<CFunction<(GLuint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB1SARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1SARBPROC>
typealias PFNGLVERTEXATTRIB1SARBPROC = CPointer<CFunction<(GLuint, GLshort) -> Unit>>

typealias PFNGLVERTEXATTRIB1SVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1SVARBPROC>
typealias PFNGLVERTEXATTRIB1SVARBPROC = CPointer<CFunction<(GLuint, CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB2DARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2DARBPROC>
typealias PFNGLVERTEXATTRIB2DARBPROC = CPointer<CFunction<(GLuint, GLdouble, GLdouble) -> Unit>>

typealias PFNGLVERTEXATTRIB2DVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2DVARBPROC>
typealias PFNGLVERTEXATTRIB2DVARBPROC = CPointer<CFunction<(GLuint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB2FARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2FARBPROC>
typealias PFNGLVERTEXATTRIB2FARBPROC = CPointer<CFunction<(GLuint, GLfloat, GLfloat) -> Unit>>

typealias PFNGLVERTEXATTRIB2FVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2FVARBPROC>
typealias PFNGLVERTEXATTRIB2FVARBPROC = CPointer<CFunction<(GLuint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB2SARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2SARBPROC>
typealias PFNGLVERTEXATTRIB2SARBPROC = CPointer<CFunction<(GLuint, GLshort, GLshort) -> Unit>>

typealias PFNGLVERTEXATTRIB2SVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2SVARBPROC>
typealias PFNGLVERTEXATTRIB2SVARBPROC = CPointer<CFunction<(GLuint, CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB3DARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3DARBPROC>
typealias PFNGLVERTEXATTRIB3DARBPROC = CPointer<CFunction<(GLuint, GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLVERTEXATTRIB3DVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3DVARBPROC>
typealias PFNGLVERTEXATTRIB3DVARBPROC = CPointer<CFunction<(GLuint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB3FARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3FARBPROC>
typealias PFNGLVERTEXATTRIB3FARBPROC = CPointer<CFunction<(GLuint, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLVERTEXATTRIB3FVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3FVARBPROC>
typealias PFNGLVERTEXATTRIB3FVARBPROC = CPointer<CFunction<(GLuint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB3SARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3SARBPROC>
typealias PFNGLVERTEXATTRIB3SARBPROC = CPointer<CFunction<(GLuint, GLshort, GLshort, GLshort) -> Unit>>

typealias PFNGLVERTEXATTRIB3SVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3SVARBPROC>
typealias PFNGLVERTEXATTRIB3SVARBPROC = CPointer<CFunction<(GLuint, CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4NBVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4NBVARBPROC>
typealias PFNGLVERTEXATTRIB4NBVARBPROC = CPointer<CFunction<(GLuint, CPointer<GLbyteVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4NIVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4NIVARBPROC>
typealias PFNGLVERTEXATTRIB4NIVARBPROC = CPointer<CFunction<(GLuint, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4NSVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4NSVARBPROC>
typealias PFNGLVERTEXATTRIB4NSVARBPROC = CPointer<CFunction<(GLuint, CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4NUBARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4NUBARBPROC>
typealias PFNGLVERTEXATTRIB4NUBARBPROC = CPointer<CFunction<(GLuint, GLubyte, GLubyte, GLubyte, GLubyte) -> Unit>>

typealias PFNGLVERTEXATTRIB4NUBVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4NUBVARBPROC>
typealias PFNGLVERTEXATTRIB4NUBVARBPROC = CPointer<CFunction<(GLuint, CPointer<GLubyteVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4NUIVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4NUIVARBPROC>
typealias PFNGLVERTEXATTRIB4NUIVARBPROC = CPointer<CFunction<(GLuint, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4NUSVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4NUSVARBPROC>
typealias PFNGLVERTEXATTRIB4NUSVARBPROC = CPointer<CFunction<(GLuint, CPointer<GLushortVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4BVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4BVARBPROC>
typealias PFNGLVERTEXATTRIB4BVARBPROC = CPointer<CFunction<(GLuint, CPointer<GLbyteVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4DARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4DARBPROC>
typealias PFNGLVERTEXATTRIB4DARBPROC = CPointer<CFunction<(GLuint, GLdouble, GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLVERTEXATTRIB4DVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4DVARBPROC>
typealias PFNGLVERTEXATTRIB4DVARBPROC = CPointer<CFunction<(GLuint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4FARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4FARBPROC>
typealias PFNGLVERTEXATTRIB4FARBPROC = CPointer<CFunction<(GLuint, GLfloat, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLVERTEXATTRIB4FVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4FVARBPROC>
typealias PFNGLVERTEXATTRIB4FVARBPROC = CPointer<CFunction<(GLuint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4IVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4IVARBPROC>
typealias PFNGLVERTEXATTRIB4IVARBPROC = CPointer<CFunction<(GLuint, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4SARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4SARBPROC>
typealias PFNGLVERTEXATTRIB4SARBPROC = CPointer<CFunction<(GLuint, GLshort, GLshort, GLshort, GLshort) -> Unit>>

typealias PFNGLVERTEXATTRIB4SVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4SVARBPROC>
typealias PFNGLVERTEXATTRIB4SVARBPROC = CPointer<CFunction<(GLuint, CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4UBVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4UBVARBPROC>
typealias PFNGLVERTEXATTRIB4UBVARBPROC = CPointer<CFunction<(GLuint, CPointer<GLubyteVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4UIVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4UIVARBPROC>
typealias PFNGLVERTEXATTRIB4UIVARBPROC = CPointer<CFunction<(GLuint, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4USVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4USVARBPROC>
typealias PFNGLVERTEXATTRIB4USVARBPROC = CPointer<CFunction<(GLuint, CPointer<GLushortVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBPOINTERARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBPOINTERARBPROC>
typealias PFNGLVERTEXATTRIBPOINTERARBPROC = CPointer<CFunction<(GLuint, GLint, GLenum, GLboolean, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLENABLEVERTEXATTRIBARRAYARBPROCVar = CPointerVarOf<PFNGLENABLEVERTEXATTRIBARRAYARBPROC>
typealias PFNGLENABLEVERTEXATTRIBARRAYARBPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLDISABLEVERTEXATTRIBARRAYARBPROCVar = CPointerVarOf<PFNGLDISABLEVERTEXATTRIBARRAYARBPROC>
typealias PFNGLDISABLEVERTEXATTRIBARRAYARBPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLGETVERTEXATTRIBDVARBPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBDVARBPROC>
typealias PFNGLGETVERTEXATTRIBDVARBPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLGETVERTEXATTRIBFVARBPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBFVARBPROC>
typealias PFNGLGETVERTEXATTRIBFVARBPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETVERTEXATTRIBIVARBPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBIVARBPROC>
typealias PFNGLGETVERTEXATTRIBIVARBPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETVERTEXATTRIBPOINTERVARBPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBPOINTERVARBPROC>
typealias PFNGLGETVERTEXATTRIBPOINTERVARBPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<COpaquePointerVar>?) -> Unit>>

typealias PFNGLBINDATTRIBLOCATIONARBPROCVar = CPointerVarOf<PFNGLBINDATTRIBLOCATIONARBPROC>
typealias PFNGLBINDATTRIBLOCATIONARBPROC = CPointer<CFunction<(GLhandleARB, GLuint, CPointer<GLcharARBVar>?) -> Unit>>

typealias PFNGLGETACTIVEATTRIBARBPROCVar = CPointerVarOf<PFNGLGETACTIVEATTRIBARBPROC>
typealias PFNGLGETACTIVEATTRIBARBPROC = CPointer<CFunction<(GLhandleARB, GLuint, GLsizei, CPointer<GLsizeiVar>?, CPointer<GLintVar>?, CPointer<GLenumVar>?, CPointer<GLcharARBVar>?) -> Unit>>

typealias PFNGLGETATTRIBLOCATIONARBPROCVar = CPointerVarOf<PFNGLGETATTRIBLOCATIONARBPROC>
typealias PFNGLGETATTRIBLOCATIONARBPROC = CPointer<CFunction<(GLhandleARB, CPointer<GLcharARBVar>?) -> GLint>>

typealias PFNGLWINDOWPOS2DARBPROCVar = CPointerVarOf<PFNGLWINDOWPOS2DARBPROC>
typealias PFNGLWINDOWPOS2DARBPROC = CPointer<CFunction<(GLdouble, GLdouble) -> Unit>>

typealias PFNGLWINDOWPOS2DVARBPROCVar = CPointerVarOf<PFNGLWINDOWPOS2DVARBPROC>
typealias PFNGLWINDOWPOS2DVARBPROC = CPointer<CFunction<(CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLWINDOWPOS2FARBPROCVar = CPointerVarOf<PFNGLWINDOWPOS2FARBPROC>
typealias PFNGLWINDOWPOS2FARBPROC = CPointer<CFunction<(GLfloat, GLfloat) -> Unit>>

typealias PFNGLWINDOWPOS2FVARBPROCVar = CPointerVarOf<PFNGLWINDOWPOS2FVARBPROC>
typealias PFNGLWINDOWPOS2FVARBPROC = CPointer<CFunction<(CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLWINDOWPOS2IARBPROCVar = CPointerVarOf<PFNGLWINDOWPOS2IARBPROC>
typealias PFNGLWINDOWPOS2IARBPROC = CPointer<CFunction<(GLint, GLint) -> Unit>>

typealias PFNGLWINDOWPOS2IVARBPROCVar = CPointerVarOf<PFNGLWINDOWPOS2IVARBPROC>
typealias PFNGLWINDOWPOS2IVARBPROC = CPointer<CFunction<(CPointer<GLintVar>?) -> Unit>>

typealias PFNGLWINDOWPOS2SARBPROCVar = CPointerVarOf<PFNGLWINDOWPOS2SARBPROC>
typealias PFNGLWINDOWPOS2SARBPROC = CPointer<CFunction<(GLshort, GLshort) -> Unit>>

typealias PFNGLWINDOWPOS2SVARBPROCVar = CPointerVarOf<PFNGLWINDOWPOS2SVARBPROC>
typealias PFNGLWINDOWPOS2SVARBPROC = CPointer<CFunction<(CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLWINDOWPOS3DARBPROCVar = CPointerVarOf<PFNGLWINDOWPOS3DARBPROC>
typealias PFNGLWINDOWPOS3DARBPROC = CPointer<CFunction<(GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLWINDOWPOS3DVARBPROCVar = CPointerVarOf<PFNGLWINDOWPOS3DVARBPROC>
typealias PFNGLWINDOWPOS3DVARBPROC = CPointer<CFunction<(CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLWINDOWPOS3FARBPROCVar = CPointerVarOf<PFNGLWINDOWPOS3FARBPROC>
typealias PFNGLWINDOWPOS3FARBPROC = CPointer<CFunction<(GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLWINDOWPOS3FVARBPROCVar = CPointerVarOf<PFNGLWINDOWPOS3FVARBPROC>
typealias PFNGLWINDOWPOS3FVARBPROC = CPointer<CFunction<(CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLWINDOWPOS3IARBPROCVar = CPointerVarOf<PFNGLWINDOWPOS3IARBPROC>
typealias PFNGLWINDOWPOS3IARBPROC = CPointer<CFunction<(GLint, GLint, GLint) -> Unit>>

typealias PFNGLWINDOWPOS3IVARBPROCVar = CPointerVarOf<PFNGLWINDOWPOS3IVARBPROC>
typealias PFNGLWINDOWPOS3IVARBPROC = CPointer<CFunction<(CPointer<GLintVar>?) -> Unit>>

typealias PFNGLWINDOWPOS3SARBPROCVar = CPointerVarOf<PFNGLWINDOWPOS3SARBPROC>
typealias PFNGLWINDOWPOS3SARBPROC = CPointer<CFunction<(GLshort, GLshort, GLshort) -> Unit>>

typealias PFNGLWINDOWPOS3SVARBPROCVar = CPointerVarOf<PFNGLWINDOWPOS3SVARBPROC>
typealias PFNGLWINDOWPOS3SVARBPROC = CPointer<CFunction<(CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLBLENDBARRIERKHRPROCVar = CPointerVarOf<PFNGLBLENDBARRIERKHRPROC>
typealias PFNGLBLENDBARRIERKHRPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLMAXSHADERCOMPILERTHREADSKHRPROCVar = CPointerVarOf<PFNGLMAXSHADERCOMPILERTHREADSKHRPROC>
typealias PFNGLMAXSHADERCOMPILERTHREADSKHRPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLMULTITEXCOORD1BOESPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD1BOESPROC>
typealias PFNGLMULTITEXCOORD1BOESPROC = CPointer<CFunction<(GLenum, GLbyte) -> Unit>>

typealias PFNGLMULTITEXCOORD1BVOESPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD1BVOESPROC>
typealias PFNGLMULTITEXCOORD1BVOESPROC = CPointer<CFunction<(GLenum, CPointer<GLbyteVar>?) -> Unit>>

typealias PFNGLMULTITEXCOORD2BOESPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD2BOESPROC>
typealias PFNGLMULTITEXCOORD2BOESPROC = CPointer<CFunction<(GLenum, GLbyte, GLbyte) -> Unit>>

typealias PFNGLMULTITEXCOORD2BVOESPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD2BVOESPROC>
typealias PFNGLMULTITEXCOORD2BVOESPROC = CPointer<CFunction<(GLenum, CPointer<GLbyteVar>?) -> Unit>>

typealias PFNGLMULTITEXCOORD3BOESPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD3BOESPROC>
typealias PFNGLMULTITEXCOORD3BOESPROC = CPointer<CFunction<(GLenum, GLbyte, GLbyte, GLbyte) -> Unit>>

typealias PFNGLMULTITEXCOORD3BVOESPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD3BVOESPROC>
typealias PFNGLMULTITEXCOORD3BVOESPROC = CPointer<CFunction<(GLenum, CPointer<GLbyteVar>?) -> Unit>>

typealias PFNGLMULTITEXCOORD4BOESPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD4BOESPROC>
typealias PFNGLMULTITEXCOORD4BOESPROC = CPointer<CFunction<(GLenum, GLbyte, GLbyte, GLbyte, GLbyte) -> Unit>>

typealias PFNGLMULTITEXCOORD4BVOESPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD4BVOESPROC>
typealias PFNGLMULTITEXCOORD4BVOESPROC = CPointer<CFunction<(GLenum, CPointer<GLbyteVar>?) -> Unit>>

typealias PFNGLTEXCOORD1BOESPROCVar = CPointerVarOf<PFNGLTEXCOORD1BOESPROC>
typealias PFNGLTEXCOORD1BOESPROC = CPointer<CFunction<(GLbyte) -> Unit>>

typealias PFNGLTEXCOORD1BVOESPROCVar = CPointerVarOf<PFNGLTEXCOORD1BVOESPROC>
typealias PFNGLTEXCOORD1BVOESPROC = CPointer<CFunction<(CPointer<GLbyteVar>?) -> Unit>>

typealias PFNGLTEXCOORD2BOESPROCVar = CPointerVarOf<PFNGLTEXCOORD2BOESPROC>
typealias PFNGLTEXCOORD2BOESPROC = CPointer<CFunction<(GLbyte, GLbyte) -> Unit>>

typealias PFNGLTEXCOORD2BVOESPROCVar = CPointerVarOf<PFNGLTEXCOORD2BVOESPROC>
typealias PFNGLTEXCOORD2BVOESPROC = CPointer<CFunction<(CPointer<GLbyteVar>?) -> Unit>>

typealias PFNGLTEXCOORD3BOESPROCVar = CPointerVarOf<PFNGLTEXCOORD3BOESPROC>
typealias PFNGLTEXCOORD3BOESPROC = CPointer<CFunction<(GLbyte, GLbyte, GLbyte) -> Unit>>

typealias PFNGLTEXCOORD3BVOESPROCVar = CPointerVarOf<PFNGLTEXCOORD3BVOESPROC>
typealias PFNGLTEXCOORD3BVOESPROC = CPointer<CFunction<(CPointer<GLbyteVar>?) -> Unit>>

typealias PFNGLTEXCOORD4BOESPROCVar = CPointerVarOf<PFNGLTEXCOORD4BOESPROC>
typealias PFNGLTEXCOORD4BOESPROC = CPointer<CFunction<(GLbyte, GLbyte, GLbyte, GLbyte) -> Unit>>

typealias PFNGLTEXCOORD4BVOESPROCVar = CPointerVarOf<PFNGLTEXCOORD4BVOESPROC>
typealias PFNGLTEXCOORD4BVOESPROC = CPointer<CFunction<(CPointer<GLbyteVar>?) -> Unit>>

typealias PFNGLVERTEX2BOESPROCVar = CPointerVarOf<PFNGLVERTEX2BOESPROC>
typealias PFNGLVERTEX2BOESPROC = CPointer<CFunction<(GLbyte, GLbyte) -> Unit>>

typealias PFNGLVERTEX2BVOESPROCVar = CPointerVarOf<PFNGLVERTEX2BVOESPROC>
typealias PFNGLVERTEX2BVOESPROC = CPointer<CFunction<(CPointer<GLbyteVar>?) -> Unit>>

typealias PFNGLVERTEX3BOESPROCVar = CPointerVarOf<PFNGLVERTEX3BOESPROC>
typealias PFNGLVERTEX3BOESPROC = CPointer<CFunction<(GLbyte, GLbyte, GLbyte) -> Unit>>

typealias PFNGLVERTEX3BVOESPROCVar = CPointerVarOf<PFNGLVERTEX3BVOESPROC>
typealias PFNGLVERTEX3BVOESPROC = CPointer<CFunction<(CPointer<GLbyteVar>?) -> Unit>>

typealias PFNGLVERTEX4BOESPROCVar = CPointerVarOf<PFNGLVERTEX4BOESPROC>
typealias PFNGLVERTEX4BOESPROC = CPointer<CFunction<(GLbyte, GLbyte, GLbyte, GLbyte) -> Unit>>

typealias PFNGLVERTEX4BVOESPROCVar = CPointerVarOf<PFNGLVERTEX4BVOESPROC>
typealias PFNGLVERTEX4BVOESPROC = CPointer<CFunction<(CPointer<GLbyteVar>?) -> Unit>>

typealias GLfixedVar = IntVarOf<GLfixed>
typealias GLfixed = GLint

typealias PFNGLALPHAFUNCXOESPROCVar = CPointerVarOf<PFNGLALPHAFUNCXOESPROC>
typealias PFNGLALPHAFUNCXOESPROC = CPointer<CFunction<(GLenum, GLfixed) -> Unit>>

typealias PFNGLCLEARCOLORXOESPROCVar = CPointerVarOf<PFNGLCLEARCOLORXOESPROC>
typealias PFNGLCLEARCOLORXOESPROC = CPointer<CFunction<(GLfixed, GLfixed, GLfixed, GLfixed) -> Unit>>

typealias PFNGLCLEARDEPTHXOESPROCVar = CPointerVarOf<PFNGLCLEARDEPTHXOESPROC>
typealias PFNGLCLEARDEPTHXOESPROC = CPointer<CFunction<(GLfixed) -> Unit>>

typealias PFNGLCLIPPLANEXOESPROCVar = CPointerVarOf<PFNGLCLIPPLANEXOESPROC>
typealias PFNGLCLIPPLANEXOESPROC = CPointer<CFunction<(GLenum, CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLCOLOR4XOESPROCVar = CPointerVarOf<PFNGLCOLOR4XOESPROC>
typealias PFNGLCOLOR4XOESPROC = CPointer<CFunction<(GLfixed, GLfixed, GLfixed, GLfixed) -> Unit>>

typealias PFNGLDEPTHRANGEXOESPROCVar = CPointerVarOf<PFNGLDEPTHRANGEXOESPROC>
typealias PFNGLDEPTHRANGEXOESPROC = CPointer<CFunction<(GLfixed, GLfixed) -> Unit>>

typealias PFNGLFOGXOESPROCVar = CPointerVarOf<PFNGLFOGXOESPROC>
typealias PFNGLFOGXOESPROC = CPointer<CFunction<(GLenum, GLfixed) -> Unit>>

typealias PFNGLFOGXVOESPROCVar = CPointerVarOf<PFNGLFOGXVOESPROC>
typealias PFNGLFOGXVOESPROC = CPointer<CFunction<(GLenum, CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLFRUSTUMXOESPROCVar = CPointerVarOf<PFNGLFRUSTUMXOESPROC>
typealias PFNGLFRUSTUMXOESPROC = CPointer<CFunction<(GLfixed, GLfixed, GLfixed, GLfixed, GLfixed, GLfixed) -> Unit>>

typealias PFNGLGETCLIPPLANEXOESPROCVar = CPointerVarOf<PFNGLGETCLIPPLANEXOESPROC>
typealias PFNGLGETCLIPPLANEXOESPROC = CPointer<CFunction<(GLenum, CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLGETFIXEDVOESPROCVar = CPointerVarOf<PFNGLGETFIXEDVOESPROC>
typealias PFNGLGETFIXEDVOESPROC = CPointer<CFunction<(GLenum, CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLGETTEXENVXVOESPROCVar = CPointerVarOf<PFNGLGETTEXENVXVOESPROC>
typealias PFNGLGETTEXENVXVOESPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLGETTEXPARAMETERXVOESPROCVar = CPointerVarOf<PFNGLGETTEXPARAMETERXVOESPROC>
typealias PFNGLGETTEXPARAMETERXVOESPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLLIGHTMODELXOESPROCVar = CPointerVarOf<PFNGLLIGHTMODELXOESPROC>
typealias PFNGLLIGHTMODELXOESPROC = CPointer<CFunction<(GLenum, GLfixed) -> Unit>>

typealias PFNGLLIGHTMODELXVOESPROCVar = CPointerVarOf<PFNGLLIGHTMODELXVOESPROC>
typealias PFNGLLIGHTMODELXVOESPROC = CPointer<CFunction<(GLenum, CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLLIGHTXOESPROCVar = CPointerVarOf<PFNGLLIGHTXOESPROC>
typealias PFNGLLIGHTXOESPROC = CPointer<CFunction<(GLenum, GLenum, GLfixed) -> Unit>>

typealias PFNGLLIGHTXVOESPROCVar = CPointerVarOf<PFNGLLIGHTXVOESPROC>
typealias PFNGLLIGHTXVOESPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLLINEWIDTHXOESPROCVar = CPointerVarOf<PFNGLLINEWIDTHXOESPROC>
typealias PFNGLLINEWIDTHXOESPROC = CPointer<CFunction<(GLfixed) -> Unit>>

typealias PFNGLLOADMATRIXXOESPROCVar = CPointerVarOf<PFNGLLOADMATRIXXOESPROC>
typealias PFNGLLOADMATRIXXOESPROC = CPointer<CFunction<(CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLMATERIALXOESPROCVar = CPointerVarOf<PFNGLMATERIALXOESPROC>
typealias PFNGLMATERIALXOESPROC = CPointer<CFunction<(GLenum, GLenum, GLfixed) -> Unit>>

typealias PFNGLMATERIALXVOESPROCVar = CPointerVarOf<PFNGLMATERIALXVOESPROC>
typealias PFNGLMATERIALXVOESPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLMULTMATRIXXOESPROCVar = CPointerVarOf<PFNGLMULTMATRIXXOESPROC>
typealias PFNGLMULTMATRIXXOESPROC = CPointer<CFunction<(CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLMULTITEXCOORD4XOESPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD4XOESPROC>
typealias PFNGLMULTITEXCOORD4XOESPROC = CPointer<CFunction<(GLenum, GLfixed, GLfixed, GLfixed, GLfixed) -> Unit>>

typealias PFNGLNORMAL3XOESPROCVar = CPointerVarOf<PFNGLNORMAL3XOESPROC>
typealias PFNGLNORMAL3XOESPROC = CPointer<CFunction<(GLfixed, GLfixed, GLfixed) -> Unit>>

typealias PFNGLORTHOXOESPROCVar = CPointerVarOf<PFNGLORTHOXOESPROC>
typealias PFNGLORTHOXOESPROC = CPointer<CFunction<(GLfixed, GLfixed, GLfixed, GLfixed, GLfixed, GLfixed) -> Unit>>

typealias PFNGLPOINTPARAMETERXVOESPROCVar = CPointerVarOf<PFNGLPOINTPARAMETERXVOESPROC>
typealias PFNGLPOINTPARAMETERXVOESPROC = CPointer<CFunction<(GLenum, CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLPOINTSIZEXOESPROCVar = CPointerVarOf<PFNGLPOINTSIZEXOESPROC>
typealias PFNGLPOINTSIZEXOESPROC = CPointer<CFunction<(GLfixed) -> Unit>>

typealias PFNGLPOLYGONOFFSETXOESPROCVar = CPointerVarOf<PFNGLPOLYGONOFFSETXOESPROC>
typealias PFNGLPOLYGONOFFSETXOESPROC = CPointer<CFunction<(GLfixed, GLfixed) -> Unit>>

typealias PFNGLROTATEXOESPROCVar = CPointerVarOf<PFNGLROTATEXOESPROC>
typealias PFNGLROTATEXOESPROC = CPointer<CFunction<(GLfixed, GLfixed, GLfixed, GLfixed) -> Unit>>

typealias PFNGLSCALEXOESPROCVar = CPointerVarOf<PFNGLSCALEXOESPROC>
typealias PFNGLSCALEXOESPROC = CPointer<CFunction<(GLfixed, GLfixed, GLfixed) -> Unit>>

typealias PFNGLTEXENVXOESPROCVar = CPointerVarOf<PFNGLTEXENVXOESPROC>
typealias PFNGLTEXENVXOESPROC = CPointer<CFunction<(GLenum, GLenum, GLfixed) -> Unit>>

typealias PFNGLTEXENVXVOESPROCVar = CPointerVarOf<PFNGLTEXENVXVOESPROC>
typealias PFNGLTEXENVXVOESPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLTEXPARAMETERXOESPROCVar = CPointerVarOf<PFNGLTEXPARAMETERXOESPROC>
typealias PFNGLTEXPARAMETERXOESPROC = CPointer<CFunction<(GLenum, GLenum, GLfixed) -> Unit>>

typealias PFNGLTEXPARAMETERXVOESPROCVar = CPointerVarOf<PFNGLTEXPARAMETERXVOESPROC>
typealias PFNGLTEXPARAMETERXVOESPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLTRANSLATEXOESPROCVar = CPointerVarOf<PFNGLTRANSLATEXOESPROC>
typealias PFNGLTRANSLATEXOESPROC = CPointer<CFunction<(GLfixed, GLfixed, GLfixed) -> Unit>>

typealias PFNGLACCUMXOESPROCVar = CPointerVarOf<PFNGLACCUMXOESPROC>
typealias PFNGLACCUMXOESPROC = CPointer<CFunction<(GLenum, GLfixed) -> Unit>>

typealias PFNGLBITMAPXOESPROCVar = CPointerVarOf<PFNGLBITMAPXOESPROC>
typealias PFNGLBITMAPXOESPROC = CPointer<CFunction<(GLsizei, GLsizei, GLfixed, GLfixed, GLfixed, GLfixed, CPointer<GLubyteVar>?) -> Unit>>

typealias PFNGLBLENDCOLORXOESPROCVar = CPointerVarOf<PFNGLBLENDCOLORXOESPROC>
typealias PFNGLBLENDCOLORXOESPROC = CPointer<CFunction<(GLfixed, GLfixed, GLfixed, GLfixed) -> Unit>>

typealias PFNGLCLEARACCUMXOESPROCVar = CPointerVarOf<PFNGLCLEARACCUMXOESPROC>
typealias PFNGLCLEARACCUMXOESPROC = CPointer<CFunction<(GLfixed, GLfixed, GLfixed, GLfixed) -> Unit>>

typealias PFNGLCOLOR3XOESPROCVar = CPointerVarOf<PFNGLCOLOR3XOESPROC>
typealias PFNGLCOLOR3XOESPROC = CPointer<CFunction<(GLfixed, GLfixed, GLfixed) -> Unit>>

typealias PFNGLCOLOR3XVOESPROCVar = CPointerVarOf<PFNGLCOLOR3XVOESPROC>
typealias PFNGLCOLOR3XVOESPROC = CPointer<CFunction<(CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLCOLOR4XVOESPROCVar = CPointerVarOf<PFNGLCOLOR4XVOESPROC>
typealias PFNGLCOLOR4XVOESPROC = CPointer<CFunction<(CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLCONVOLUTIONPARAMETERXOESPROCVar = CPointerVarOf<PFNGLCONVOLUTIONPARAMETERXOESPROC>
typealias PFNGLCONVOLUTIONPARAMETERXOESPROC = CPointer<CFunction<(GLenum, GLenum, GLfixed) -> Unit>>

typealias PFNGLCONVOLUTIONPARAMETERXVOESPROCVar = CPointerVarOf<PFNGLCONVOLUTIONPARAMETERXVOESPROC>
typealias PFNGLCONVOLUTIONPARAMETERXVOESPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLEVALCOORD1XOESPROCVar = CPointerVarOf<PFNGLEVALCOORD1XOESPROC>
typealias PFNGLEVALCOORD1XOESPROC = CPointer<CFunction<(GLfixed) -> Unit>>

typealias PFNGLEVALCOORD1XVOESPROCVar = CPointerVarOf<PFNGLEVALCOORD1XVOESPROC>
typealias PFNGLEVALCOORD1XVOESPROC = CPointer<CFunction<(CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLEVALCOORD2XOESPROCVar = CPointerVarOf<PFNGLEVALCOORD2XOESPROC>
typealias PFNGLEVALCOORD2XOESPROC = CPointer<CFunction<(GLfixed, GLfixed) -> Unit>>

typealias PFNGLEVALCOORD2XVOESPROCVar = CPointerVarOf<PFNGLEVALCOORD2XVOESPROC>
typealias PFNGLEVALCOORD2XVOESPROC = CPointer<CFunction<(CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLFEEDBACKBUFFERXOESPROCVar = CPointerVarOf<PFNGLFEEDBACKBUFFERXOESPROC>
typealias PFNGLFEEDBACKBUFFERXOESPROC = CPointer<CFunction<(GLsizei, GLenum, CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLGETCONVOLUTIONPARAMETERXVOESPROCVar = CPointerVarOf<PFNGLGETCONVOLUTIONPARAMETERXVOESPROC>
typealias PFNGLGETCONVOLUTIONPARAMETERXVOESPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLGETHISTOGRAMPARAMETERXVOESPROCVar = CPointerVarOf<PFNGLGETHISTOGRAMPARAMETERXVOESPROC>
typealias PFNGLGETHISTOGRAMPARAMETERXVOESPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLGETLIGHTXOESPROCVar = CPointerVarOf<PFNGLGETLIGHTXOESPROC>
typealias PFNGLGETLIGHTXOESPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLGETMAPXVOESPROCVar = CPointerVarOf<PFNGLGETMAPXVOESPROC>
typealias PFNGLGETMAPXVOESPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLGETMATERIALXOESPROCVar = CPointerVarOf<PFNGLGETMATERIALXOESPROC>
typealias PFNGLGETMATERIALXOESPROC = CPointer<CFunction<(GLenum, GLenum, GLfixed) -> Unit>>

typealias PFNGLGETPIXELMAPXVPROCVar = CPointerVarOf<PFNGLGETPIXELMAPXVPROC>
typealias PFNGLGETPIXELMAPXVPROC = CPointer<CFunction<(GLenum, GLint, CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLGETTEXGENXVOESPROCVar = CPointerVarOf<PFNGLGETTEXGENXVOESPROC>
typealias PFNGLGETTEXGENXVOESPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLGETTEXLEVELPARAMETERXVOESPROCVar = CPointerVarOf<PFNGLGETTEXLEVELPARAMETERXVOESPROC>
typealias PFNGLGETTEXLEVELPARAMETERXVOESPROC = CPointer<CFunction<(GLenum, GLint, GLenum, CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLINDEXXOESPROCVar = CPointerVarOf<PFNGLINDEXXOESPROC>
typealias PFNGLINDEXXOESPROC = CPointer<CFunction<(GLfixed) -> Unit>>

typealias PFNGLINDEXXVOESPROCVar = CPointerVarOf<PFNGLINDEXXVOESPROC>
typealias PFNGLINDEXXVOESPROC = CPointer<CFunction<(CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLLOADTRANSPOSEMATRIXXOESPROCVar = CPointerVarOf<PFNGLLOADTRANSPOSEMATRIXXOESPROC>
typealias PFNGLLOADTRANSPOSEMATRIXXOESPROC = CPointer<CFunction<(CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLMAP1XOESPROCVar = CPointerVarOf<PFNGLMAP1XOESPROC>
typealias PFNGLMAP1XOESPROC = CPointer<CFunction<(GLenum, GLfixed, GLfixed, GLint, GLint, GLfixed) -> Unit>>

typealias PFNGLMAP2XOESPROCVar = CPointerVarOf<PFNGLMAP2XOESPROC>
typealias PFNGLMAP2XOESPROC = CPointer<CFunction<(GLenum, GLfixed, GLfixed, GLint, GLint, GLfixed, GLfixed, GLint, GLint, GLfixed) -> Unit>>

typealias PFNGLMAPGRID1XOESPROCVar = CPointerVarOf<PFNGLMAPGRID1XOESPROC>
typealias PFNGLMAPGRID1XOESPROC = CPointer<CFunction<(GLint, GLfixed, GLfixed) -> Unit>>

typealias PFNGLMAPGRID2XOESPROCVar = CPointerVarOf<PFNGLMAPGRID2XOESPROC>
typealias PFNGLMAPGRID2XOESPROC = CPointer<CFunction<(GLint, GLfixed, GLfixed, GLfixed, GLfixed) -> Unit>>

typealias PFNGLMULTTRANSPOSEMATRIXXOESPROCVar = CPointerVarOf<PFNGLMULTTRANSPOSEMATRIXXOESPROC>
typealias PFNGLMULTTRANSPOSEMATRIXXOESPROC = CPointer<CFunction<(CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLMULTITEXCOORD1XOESPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD1XOESPROC>
typealias PFNGLMULTITEXCOORD1XOESPROC = CPointer<CFunction<(GLenum, GLfixed) -> Unit>>

typealias PFNGLMULTITEXCOORD1XVOESPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD1XVOESPROC>
typealias PFNGLMULTITEXCOORD1XVOESPROC = CPointer<CFunction<(GLenum, CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLMULTITEXCOORD2XOESPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD2XOESPROC>
typealias PFNGLMULTITEXCOORD2XOESPROC = CPointer<CFunction<(GLenum, GLfixed, GLfixed) -> Unit>>

typealias PFNGLMULTITEXCOORD2XVOESPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD2XVOESPROC>
typealias PFNGLMULTITEXCOORD2XVOESPROC = CPointer<CFunction<(GLenum, CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLMULTITEXCOORD3XOESPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD3XOESPROC>
typealias PFNGLMULTITEXCOORD3XOESPROC = CPointer<CFunction<(GLenum, GLfixed, GLfixed, GLfixed) -> Unit>>

typealias PFNGLMULTITEXCOORD3XVOESPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD3XVOESPROC>
typealias PFNGLMULTITEXCOORD3XVOESPROC = CPointer<CFunction<(GLenum, CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLMULTITEXCOORD4XVOESPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD4XVOESPROC>
typealias PFNGLMULTITEXCOORD4XVOESPROC = CPointer<CFunction<(GLenum, CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLNORMAL3XVOESPROCVar = CPointerVarOf<PFNGLNORMAL3XVOESPROC>
typealias PFNGLNORMAL3XVOESPROC = CPointer<CFunction<(CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLPASSTHROUGHXOESPROCVar = CPointerVarOf<PFNGLPASSTHROUGHXOESPROC>
typealias PFNGLPASSTHROUGHXOESPROC = CPointer<CFunction<(GLfixed) -> Unit>>

typealias PFNGLPIXELMAPXPROCVar = CPointerVarOf<PFNGLPIXELMAPXPROC>
typealias PFNGLPIXELMAPXPROC = CPointer<CFunction<(GLenum, GLint, CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLPIXELSTOREXPROCVar = CPointerVarOf<PFNGLPIXELSTOREXPROC>
typealias PFNGLPIXELSTOREXPROC = CPointer<CFunction<(GLenum, GLfixed) -> Unit>>

typealias PFNGLPIXELTRANSFERXOESPROCVar = CPointerVarOf<PFNGLPIXELTRANSFERXOESPROC>
typealias PFNGLPIXELTRANSFERXOESPROC = CPointer<CFunction<(GLenum, GLfixed) -> Unit>>

typealias PFNGLPIXELZOOMXOESPROCVar = CPointerVarOf<PFNGLPIXELZOOMXOESPROC>
typealias PFNGLPIXELZOOMXOESPROC = CPointer<CFunction<(GLfixed, GLfixed) -> Unit>>

typealias PFNGLPRIORITIZETEXTURESXOESPROCVar = CPointerVarOf<PFNGLPRIORITIZETEXTURESXOESPROC>
typealias PFNGLPRIORITIZETEXTURESXOESPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?, CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLRASTERPOS2XOESPROCVar = CPointerVarOf<PFNGLRASTERPOS2XOESPROC>
typealias PFNGLRASTERPOS2XOESPROC = CPointer<CFunction<(GLfixed, GLfixed) -> Unit>>

typealias PFNGLRASTERPOS2XVOESPROCVar = CPointerVarOf<PFNGLRASTERPOS2XVOESPROC>
typealias PFNGLRASTERPOS2XVOESPROC = CPointer<CFunction<(CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLRASTERPOS3XOESPROCVar = CPointerVarOf<PFNGLRASTERPOS3XOESPROC>
typealias PFNGLRASTERPOS3XOESPROC = CPointer<CFunction<(GLfixed, GLfixed, GLfixed) -> Unit>>

typealias PFNGLRASTERPOS3XVOESPROCVar = CPointerVarOf<PFNGLRASTERPOS3XVOESPROC>
typealias PFNGLRASTERPOS3XVOESPROC = CPointer<CFunction<(CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLRASTERPOS4XOESPROCVar = CPointerVarOf<PFNGLRASTERPOS4XOESPROC>
typealias PFNGLRASTERPOS4XOESPROC = CPointer<CFunction<(GLfixed, GLfixed, GLfixed, GLfixed) -> Unit>>

typealias PFNGLRASTERPOS4XVOESPROCVar = CPointerVarOf<PFNGLRASTERPOS4XVOESPROC>
typealias PFNGLRASTERPOS4XVOESPROC = CPointer<CFunction<(CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLRECTXOESPROCVar = CPointerVarOf<PFNGLRECTXOESPROC>
typealias PFNGLRECTXOESPROC = CPointer<CFunction<(GLfixed, GLfixed, GLfixed, GLfixed) -> Unit>>

typealias PFNGLRECTXVOESPROCVar = CPointerVarOf<PFNGLRECTXVOESPROC>
typealias PFNGLRECTXVOESPROC = CPointer<CFunction<(CPointer<GLfixedVar>?, CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLTEXCOORD1XOESPROCVar = CPointerVarOf<PFNGLTEXCOORD1XOESPROC>
typealias PFNGLTEXCOORD1XOESPROC = CPointer<CFunction<(GLfixed) -> Unit>>

typealias PFNGLTEXCOORD1XVOESPROCVar = CPointerVarOf<PFNGLTEXCOORD1XVOESPROC>
typealias PFNGLTEXCOORD1XVOESPROC = CPointer<CFunction<(CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLTEXCOORD2XOESPROCVar = CPointerVarOf<PFNGLTEXCOORD2XOESPROC>
typealias PFNGLTEXCOORD2XOESPROC = CPointer<CFunction<(GLfixed, GLfixed) -> Unit>>

typealias PFNGLTEXCOORD2XVOESPROCVar = CPointerVarOf<PFNGLTEXCOORD2XVOESPROC>
typealias PFNGLTEXCOORD2XVOESPROC = CPointer<CFunction<(CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLTEXCOORD3XOESPROCVar = CPointerVarOf<PFNGLTEXCOORD3XOESPROC>
typealias PFNGLTEXCOORD3XOESPROC = CPointer<CFunction<(GLfixed, GLfixed, GLfixed) -> Unit>>

typealias PFNGLTEXCOORD3XVOESPROCVar = CPointerVarOf<PFNGLTEXCOORD3XVOESPROC>
typealias PFNGLTEXCOORD3XVOESPROC = CPointer<CFunction<(CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLTEXCOORD4XOESPROCVar = CPointerVarOf<PFNGLTEXCOORD4XOESPROC>
typealias PFNGLTEXCOORD4XOESPROC = CPointer<CFunction<(GLfixed, GLfixed, GLfixed, GLfixed) -> Unit>>

typealias PFNGLTEXCOORD4XVOESPROCVar = CPointerVarOf<PFNGLTEXCOORD4XVOESPROC>
typealias PFNGLTEXCOORD4XVOESPROC = CPointer<CFunction<(CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLTEXGENXOESPROCVar = CPointerVarOf<PFNGLTEXGENXOESPROC>
typealias PFNGLTEXGENXOESPROC = CPointer<CFunction<(GLenum, GLenum, GLfixed) -> Unit>>

typealias PFNGLTEXGENXVOESPROCVar = CPointerVarOf<PFNGLTEXGENXVOESPROC>
typealias PFNGLTEXGENXVOESPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLVERTEX2XOESPROCVar = CPointerVarOf<PFNGLVERTEX2XOESPROC>
typealias PFNGLVERTEX2XOESPROC = CPointer<CFunction<(GLfixed) -> Unit>>

typealias PFNGLVERTEX2XVOESPROCVar = CPointerVarOf<PFNGLVERTEX2XVOESPROC>
typealias PFNGLVERTEX2XVOESPROC = CPointer<CFunction<(CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLVERTEX3XOESPROCVar = CPointerVarOf<PFNGLVERTEX3XOESPROC>
typealias PFNGLVERTEX3XOESPROC = CPointer<CFunction<(GLfixed, GLfixed) -> Unit>>

typealias PFNGLVERTEX3XVOESPROCVar = CPointerVarOf<PFNGLVERTEX3XVOESPROC>
typealias PFNGLVERTEX3XVOESPROC = CPointer<CFunction<(CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLVERTEX4XOESPROCVar = CPointerVarOf<PFNGLVERTEX4XOESPROC>
typealias PFNGLVERTEX4XOESPROC = CPointer<CFunction<(GLfixed, GLfixed, GLfixed) -> Unit>>

typealias PFNGLVERTEX4XVOESPROCVar = CPointerVarOf<PFNGLVERTEX4XVOESPROC>
typealias PFNGLVERTEX4XVOESPROC = CPointer<CFunction<(CPointer<GLfixedVar>?) -> Unit>>

typealias PFNGLQUERYMATRIXXOESPROCVar = CPointerVarOf<PFNGLQUERYMATRIXXOESPROC>
typealias PFNGLQUERYMATRIXXOESPROC = CPointer<CFunction<(CPointer<GLfixedVar>?, CPointer<GLintVar>?) -> GLbitfield>>

typealias PFNGLCLEARDEPTHFOESPROCVar = CPointerVarOf<PFNGLCLEARDEPTHFOESPROC>
typealias PFNGLCLEARDEPTHFOESPROC = CPointer<CFunction<(GLclampf) -> Unit>>

typealias PFNGLCLIPPLANEFOESPROCVar = CPointerVarOf<PFNGLCLIPPLANEFOESPROC>
typealias PFNGLCLIPPLANEFOESPROC = CPointer<CFunction<(GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLDEPTHRANGEFOESPROCVar = CPointerVarOf<PFNGLDEPTHRANGEFOESPROC>
typealias PFNGLDEPTHRANGEFOESPROC = CPointer<CFunction<(GLclampf, GLclampf) -> Unit>>

typealias PFNGLFRUSTUMFOESPROCVar = CPointerVarOf<PFNGLFRUSTUMFOESPROC>
typealias PFNGLFRUSTUMFOESPROC = CPointer<CFunction<(GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLGETCLIPPLANEFOESPROCVar = CPointerVarOf<PFNGLGETCLIPPLANEFOESPROC>
typealias PFNGLGETCLIPPLANEFOESPROC = CPointer<CFunction<(GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLORTHOFOESPROCVar = CPointerVarOf<PFNGLORTHOFOESPROC>
typealias PFNGLORTHOFOESPROC = CPointer<CFunction<(GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLTBUFFERMASK3DFXPROCVar = CPointerVarOf<PFNGLTBUFFERMASK3DFXPROC>
typealias PFNGLTBUFFERMASK3DFXPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias GLDEBUGPROCAMDVar = CPointerVarOf<GLDEBUGPROCAMD>
typealias GLDEBUGPROCAMD = CPointer<CFunction<(GLuint, GLenum, GLenum, GLsizei, CPointer<GLcharVar>?, COpaquePointer?) -> Unit>>

typealias PFNGLDEBUGMESSAGEENABLEAMDPROCVar = CPointerVarOf<PFNGLDEBUGMESSAGEENABLEAMDPROC>
typealias PFNGLDEBUGMESSAGEENABLEAMDPROC = CPointer<CFunction<(GLenum, GLenum, GLsizei, CPointer<GLuintVar>?, GLboolean) -> Unit>>

typealias PFNGLDEBUGMESSAGEINSERTAMDPROCVar = CPointerVarOf<PFNGLDEBUGMESSAGEINSERTAMDPROC>
typealias PFNGLDEBUGMESSAGEINSERTAMDPROC = CPointer<CFunction<(GLenum, GLenum, GLuint, GLsizei, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLDEBUGMESSAGECALLBACKAMDPROCVar = CPointerVarOf<PFNGLDEBUGMESSAGECALLBACKAMDPROC>
typealias PFNGLDEBUGMESSAGECALLBACKAMDPROC = CPointer<CFunction<(GLDEBUGPROCAMD?, COpaquePointer?) -> Unit>>

typealias PFNGLGETDEBUGMESSAGELOGAMDPROCVar = CPointerVarOf<PFNGLGETDEBUGMESSAGELOGAMDPROC>
typealias PFNGLGETDEBUGMESSAGELOGAMDPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLenumVar>?, CPointer<GLuintVar>?, CPointer<GLuintVar>?, CPointer<GLsizeiVar>?, CPointer<GLcharVar>?) -> GLuint>>

typealias PFNGLBLENDFUNCINDEXEDAMDPROCVar = CPointerVarOf<PFNGLBLENDFUNCINDEXEDAMDPROC>
typealias PFNGLBLENDFUNCINDEXEDAMDPROC = CPointer<CFunction<(GLuint, GLenum, GLenum) -> Unit>>

typealias PFNGLBLENDFUNCSEPARATEINDEXEDAMDPROCVar = CPointerVarOf<PFNGLBLENDFUNCSEPARATEINDEXEDAMDPROC>
typealias PFNGLBLENDFUNCSEPARATEINDEXEDAMDPROC = CPointer<CFunction<(GLuint, GLenum, GLenum, GLenum, GLenum) -> Unit>>

typealias PFNGLBLENDEQUATIONINDEXEDAMDPROCVar = CPointerVarOf<PFNGLBLENDEQUATIONINDEXEDAMDPROC>
typealias PFNGLBLENDEQUATIONINDEXEDAMDPROC = CPointer<CFunction<(GLuint, GLenum) -> Unit>>

typealias PFNGLBLENDEQUATIONSEPARATEINDEXEDAMDPROCVar = CPointerVarOf<PFNGLBLENDEQUATIONSEPARATEINDEXEDAMDPROC>
typealias PFNGLBLENDEQUATIONSEPARATEINDEXEDAMDPROC = CPointer<CFunction<(GLuint, GLenum, GLenum) -> Unit>>

typealias PFNGLFRAMEBUFFERSAMPLEPOSITIONSFVAMDPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERSAMPLEPOSITIONSFVAMDPROC>
typealias PFNGLFRAMEBUFFERSAMPLEPOSITIONSFVAMDPROC = CPointer<CFunction<(GLenum, GLuint, GLuint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLNAMEDFRAMEBUFFERSAMPLEPOSITIONSFVAMDPROCVar = CPointerVarOf<PFNGLNAMEDFRAMEBUFFERSAMPLEPOSITIONSFVAMDPROC>
typealias PFNGLNAMEDFRAMEBUFFERSAMPLEPOSITIONSFVAMDPROC = CPointer<CFunction<(GLuint, GLuint, GLuint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETFRAMEBUFFERPARAMETERFVAMDPROCVar = CPointerVarOf<PFNGLGETFRAMEBUFFERPARAMETERFVAMDPROC>
typealias PFNGLGETFRAMEBUFFERPARAMETERFVAMDPROC = CPointer<CFunction<(GLenum, GLenum, GLuint, GLuint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETNAMEDFRAMEBUFFERPARAMETERFVAMDPROCVar = CPointerVarOf<PFNGLGETNAMEDFRAMEBUFFERPARAMETERFVAMDPROC>
typealias PFNGLGETNAMEDFRAMEBUFFERPARAMETERFVAMDPROC = CPointer<CFunction<(GLuint, GLenum, GLuint, GLuint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias GLint64EXTVar = LongVarOf<GLint64EXT>
typealias GLint64EXT = int64_t

typealias PFNGLUNIFORM1I64NVPROCVar = CPointerVarOf<PFNGLUNIFORM1I64NVPROC>
typealias PFNGLUNIFORM1I64NVPROC = CPointer<CFunction<(GLint, GLint64EXT) -> Unit>>

typealias PFNGLUNIFORM2I64NVPROCVar = CPointerVarOf<PFNGLUNIFORM2I64NVPROC>
typealias PFNGLUNIFORM2I64NVPROC = CPointer<CFunction<(GLint, GLint64EXT, GLint64EXT) -> Unit>>

typealias PFNGLUNIFORM3I64NVPROCVar = CPointerVarOf<PFNGLUNIFORM3I64NVPROC>
typealias PFNGLUNIFORM3I64NVPROC = CPointer<CFunction<(GLint, GLint64EXT, GLint64EXT, GLint64EXT) -> Unit>>

typealias PFNGLUNIFORM4I64NVPROCVar = CPointerVarOf<PFNGLUNIFORM4I64NVPROC>
typealias PFNGLUNIFORM4I64NVPROC = CPointer<CFunction<(GLint, GLint64EXT, GLint64EXT, GLint64EXT, GLint64EXT) -> Unit>>

typealias PFNGLUNIFORM1I64VNVPROCVar = CPointerVarOf<PFNGLUNIFORM1I64VNVPROC>
typealias PFNGLUNIFORM1I64VNVPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLint64EXTVar>?) -> Unit>>

typealias PFNGLUNIFORM2I64VNVPROCVar = CPointerVarOf<PFNGLUNIFORM2I64VNVPROC>
typealias PFNGLUNIFORM2I64VNVPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLint64EXTVar>?) -> Unit>>

typealias PFNGLUNIFORM3I64VNVPROCVar = CPointerVarOf<PFNGLUNIFORM3I64VNVPROC>
typealias PFNGLUNIFORM3I64VNVPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLint64EXTVar>?) -> Unit>>

typealias PFNGLUNIFORM4I64VNVPROCVar = CPointerVarOf<PFNGLUNIFORM4I64VNVPROC>
typealias PFNGLUNIFORM4I64VNVPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLint64EXTVar>?) -> Unit>>

typealias PFNGLUNIFORM1UI64NVPROCVar = CPointerVarOf<PFNGLUNIFORM1UI64NVPROC>
typealias PFNGLUNIFORM1UI64NVPROC = CPointer<CFunction<(GLint, GLuint64EXT) -> Unit>>

typealias PFNGLUNIFORM2UI64NVPROCVar = CPointerVarOf<PFNGLUNIFORM2UI64NVPROC>
typealias PFNGLUNIFORM2UI64NVPROC = CPointer<CFunction<(GLint, GLuint64EXT, GLuint64EXT) -> Unit>>

typealias PFNGLUNIFORM3UI64NVPROCVar = CPointerVarOf<PFNGLUNIFORM3UI64NVPROC>
typealias PFNGLUNIFORM3UI64NVPROC = CPointer<CFunction<(GLint, GLuint64EXT, GLuint64EXT, GLuint64EXT) -> Unit>>

typealias PFNGLUNIFORM4UI64NVPROCVar = CPointerVarOf<PFNGLUNIFORM4UI64NVPROC>
typealias PFNGLUNIFORM4UI64NVPROC = CPointer<CFunction<(GLint, GLuint64EXT, GLuint64EXT, GLuint64EXT, GLuint64EXT) -> Unit>>

typealias PFNGLUNIFORM1UI64VNVPROCVar = CPointerVarOf<PFNGLUNIFORM1UI64VNVPROC>
typealias PFNGLUNIFORM1UI64VNVPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLuint64EXTVar>?) -> Unit>>

typealias PFNGLUNIFORM2UI64VNVPROCVar = CPointerVarOf<PFNGLUNIFORM2UI64VNVPROC>
typealias PFNGLUNIFORM2UI64VNVPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLuint64EXTVar>?) -> Unit>>

typealias PFNGLUNIFORM3UI64VNVPROCVar = CPointerVarOf<PFNGLUNIFORM3UI64VNVPROC>
typealias PFNGLUNIFORM3UI64VNVPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLuint64EXTVar>?) -> Unit>>

typealias PFNGLUNIFORM4UI64VNVPROCVar = CPointerVarOf<PFNGLUNIFORM4UI64VNVPROC>
typealias PFNGLUNIFORM4UI64VNVPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLuint64EXTVar>?) -> Unit>>

typealias PFNGLGETUNIFORMI64VNVPROCVar = CPointerVarOf<PFNGLGETUNIFORMI64VNVPROC>
typealias PFNGLGETUNIFORMI64VNVPROC = CPointer<CFunction<(GLuint, GLint, CPointer<GLint64EXTVar>?) -> Unit>>

typealias PFNGLGETUNIFORMUI64VNVPROCVar = CPointerVarOf<PFNGLGETUNIFORMUI64VNVPROC>
typealias PFNGLGETUNIFORMUI64VNVPROC = CPointer<CFunction<(GLuint, GLint, CPointer<GLuint64EXTVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM1I64NVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1I64NVPROC>
typealias PFNGLPROGRAMUNIFORM1I64NVPROC = CPointer<CFunction<(GLuint, GLint, GLint64EXT) -> Unit>>

typealias PFNGLPROGRAMUNIFORM2I64NVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2I64NVPROC>
typealias PFNGLPROGRAMUNIFORM2I64NVPROC = CPointer<CFunction<(GLuint, GLint, GLint64EXT, GLint64EXT) -> Unit>>

typealias PFNGLPROGRAMUNIFORM3I64NVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3I64NVPROC>
typealias PFNGLPROGRAMUNIFORM3I64NVPROC = CPointer<CFunction<(GLuint, GLint, GLint64EXT, GLint64EXT, GLint64EXT) -> Unit>>

typealias PFNGLPROGRAMUNIFORM4I64NVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4I64NVPROC>
typealias PFNGLPROGRAMUNIFORM4I64NVPROC = CPointer<CFunction<(GLuint, GLint, GLint64EXT, GLint64EXT, GLint64EXT, GLint64EXT) -> Unit>>

typealias PFNGLPROGRAMUNIFORM1I64VNVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1I64VNVPROC>
typealias PFNGLPROGRAMUNIFORM1I64VNVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLint64EXTVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM2I64VNVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2I64VNVPROC>
typealias PFNGLPROGRAMUNIFORM2I64VNVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLint64EXTVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM3I64VNVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3I64VNVPROC>
typealias PFNGLPROGRAMUNIFORM3I64VNVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLint64EXTVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM4I64VNVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4I64VNVPROC>
typealias PFNGLPROGRAMUNIFORM4I64VNVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLint64EXTVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM1UI64NVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1UI64NVPROC>
typealias PFNGLPROGRAMUNIFORM1UI64NVPROC = CPointer<CFunction<(GLuint, GLint, GLuint64EXT) -> Unit>>

typealias PFNGLPROGRAMUNIFORM2UI64NVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2UI64NVPROC>
typealias PFNGLPROGRAMUNIFORM2UI64NVPROC = CPointer<CFunction<(GLuint, GLint, GLuint64EXT, GLuint64EXT) -> Unit>>

typealias PFNGLPROGRAMUNIFORM3UI64NVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3UI64NVPROC>
typealias PFNGLPROGRAMUNIFORM3UI64NVPROC = CPointer<CFunction<(GLuint, GLint, GLuint64EXT, GLuint64EXT, GLuint64EXT) -> Unit>>

typealias PFNGLPROGRAMUNIFORM4UI64NVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4UI64NVPROC>
typealias PFNGLPROGRAMUNIFORM4UI64NVPROC = CPointer<CFunction<(GLuint, GLint, GLuint64EXT, GLuint64EXT, GLuint64EXT, GLuint64EXT) -> Unit>>

typealias PFNGLPROGRAMUNIFORM1UI64VNVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1UI64VNVPROC>
typealias PFNGLPROGRAMUNIFORM1UI64VNVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLuint64EXTVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM2UI64VNVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2UI64VNVPROC>
typealias PFNGLPROGRAMUNIFORM2UI64VNVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLuint64EXTVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM3UI64VNVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3UI64VNVPROC>
typealias PFNGLPROGRAMUNIFORM3UI64VNVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLuint64EXTVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM4UI64VNVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4UI64VNVPROC>
typealias PFNGLPROGRAMUNIFORM4UI64VNVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLuint64EXTVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBPARAMETERIAMDPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBPARAMETERIAMDPROC>
typealias PFNGLVERTEXATTRIBPARAMETERIAMDPROC = CPointer<CFunction<(GLuint, GLenum, GLint) -> Unit>>

typealias PFNGLMULTIDRAWARRAYSINDIRECTAMDPROCVar = CPointerVarOf<PFNGLMULTIDRAWARRAYSINDIRECTAMDPROC>
typealias PFNGLMULTIDRAWARRAYSINDIRECTAMDPROC = CPointer<CFunction<(GLenum, COpaquePointer?, GLsizei, GLsizei) -> Unit>>

typealias PFNGLMULTIDRAWELEMENTSINDIRECTAMDPROCVar = CPointerVarOf<PFNGLMULTIDRAWELEMENTSINDIRECTAMDPROC>
typealias PFNGLMULTIDRAWELEMENTSINDIRECTAMDPROC = CPointer<CFunction<(GLenum, GLenum, COpaquePointer?, GLsizei, GLsizei) -> Unit>>

typealias PFNGLGENNAMESAMDPROCVar = CPointerVarOf<PFNGLGENNAMESAMDPROC>
typealias PFNGLGENNAMESAMDPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLDELETENAMESAMDPROCVar = CPointerVarOf<PFNGLDELETENAMESAMDPROC>
typealias PFNGLDELETENAMESAMDPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLISNAMEAMDPROCVar = CPointerVarOf<PFNGLISNAMEAMDPROC>
typealias PFNGLISNAMEAMDPROC = CPointer<CFunction<(GLenum, GLuint) -> GLboolean>>

typealias PFNGLQUERYOBJECTPARAMETERUIAMDPROCVar = CPointerVarOf<PFNGLQUERYOBJECTPARAMETERUIAMDPROC>
typealias PFNGLQUERYOBJECTPARAMETERUIAMDPROC = CPointer<CFunction<(GLenum, GLuint, GLenum, GLuint) -> Unit>>

typealias PFNGLGETPERFMONITORGROUPSAMDPROCVar = CPointerVarOf<PFNGLGETPERFMONITORGROUPSAMDPROC>
typealias PFNGLGETPERFMONITORGROUPSAMDPROC = CPointer<CFunction<(CPointer<GLintVar>?, GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGETPERFMONITORCOUNTERSAMDPROCVar = CPointerVarOf<PFNGLGETPERFMONITORCOUNTERSAMDPROC>
typealias PFNGLGETPERFMONITORCOUNTERSAMDPROC = CPointer<CFunction<(GLuint, CPointer<GLintVar>?, CPointer<GLintVar>?, GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGETPERFMONITORGROUPSTRINGAMDPROCVar = CPointerVarOf<PFNGLGETPERFMONITORGROUPSTRINGAMDPROC>
typealias PFNGLGETPERFMONITORGROUPSTRINGAMDPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLsizeiVar>?, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLGETPERFMONITORCOUNTERSTRINGAMDPROCVar = CPointerVarOf<PFNGLGETPERFMONITORCOUNTERSTRINGAMDPROC>
typealias PFNGLGETPERFMONITORCOUNTERSTRINGAMDPROC = CPointer<CFunction<(GLuint, GLuint, GLsizei, CPointer<GLsizeiVar>?, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLGETPERFMONITORCOUNTERINFOAMDPROCVar = CPointerVarOf<PFNGLGETPERFMONITORCOUNTERINFOAMDPROC>
typealias PFNGLGETPERFMONITORCOUNTERINFOAMDPROC = CPointer<CFunction<(GLuint, GLuint, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLGENPERFMONITORSAMDPROCVar = CPointerVarOf<PFNGLGENPERFMONITORSAMDPROC>
typealias PFNGLGENPERFMONITORSAMDPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLDELETEPERFMONITORSAMDPROCVar = CPointerVarOf<PFNGLDELETEPERFMONITORSAMDPROC>
typealias PFNGLDELETEPERFMONITORSAMDPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLSELECTPERFMONITORCOUNTERSAMDPROCVar = CPointerVarOf<PFNGLSELECTPERFMONITORCOUNTERSAMDPROC>
typealias PFNGLSELECTPERFMONITORCOUNTERSAMDPROC = CPointer<CFunction<(GLuint, GLboolean, GLuint, GLint, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLBEGINPERFMONITORAMDPROCVar = CPointerVarOf<PFNGLBEGINPERFMONITORAMDPROC>
typealias PFNGLBEGINPERFMONITORAMDPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLENDPERFMONITORAMDPROCVar = CPointerVarOf<PFNGLENDPERFMONITORAMDPROC>
typealias PFNGLENDPERFMONITORAMDPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLGETPERFMONITORCOUNTERDATAAMDPROCVar = CPointerVarOf<PFNGLGETPERFMONITORCOUNTERDATAAMDPROC>
typealias PFNGLGETPERFMONITORCOUNTERDATAAMDPROC = CPointer<CFunction<(GLuint, GLenum, GLsizei, CPointer<GLuintVar>?, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLSETMULTISAMPLEFVAMDPROCVar = CPointerVarOf<PFNGLSETMULTISAMPLEFVAMDPROC>
typealias PFNGLSETMULTISAMPLEFVAMDPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLTEXSTORAGESPARSEAMDPROCVar = CPointerVarOf<PFNGLTEXSTORAGESPARSEAMDPROC>
typealias PFNGLTEXSTORAGESPARSEAMDPROC = CPointer<CFunction<(GLenum, GLenum, GLsizei, GLsizei, GLsizei, GLsizei, GLbitfield) -> Unit>>

typealias PFNGLTEXTURESTORAGESPARSEAMDPROCVar = CPointerVarOf<PFNGLTEXTURESTORAGESPARSEAMDPROC>
typealias PFNGLTEXTURESTORAGESPARSEAMDPROC = CPointer<CFunction<(GLuint, GLenum, GLenum, GLsizei, GLsizei, GLsizei, GLsizei, GLbitfield) -> Unit>>

typealias PFNGLSTENCILOPVALUEAMDPROCVar = CPointerVarOf<PFNGLSTENCILOPVALUEAMDPROC>
typealias PFNGLSTENCILOPVALUEAMDPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLTESSELLATIONFACTORAMDPROCVar = CPointerVarOf<PFNGLTESSELLATIONFACTORAMDPROC>
typealias PFNGLTESSELLATIONFACTORAMDPROC = CPointer<CFunction<(GLfloat) -> Unit>>

typealias PFNGLTESSELLATIONMODEAMDPROCVar = CPointerVarOf<PFNGLTESSELLATIONMODEAMDPROC>
typealias PFNGLTESSELLATIONMODEAMDPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLELEMENTPOINTERAPPLEPROCVar = CPointerVarOf<PFNGLELEMENTPOINTERAPPLEPROC>
typealias PFNGLELEMENTPOINTERAPPLEPROC = CPointer<CFunction<(GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLDRAWELEMENTARRAYAPPLEPROCVar = CPointerVarOf<PFNGLDRAWELEMENTARRAYAPPLEPROC>
typealias PFNGLDRAWELEMENTARRAYAPPLEPROC = CPointer<CFunction<(GLenum, GLint, GLsizei) -> Unit>>

typealias PFNGLDRAWRANGEELEMENTARRAYAPPLEPROCVar = CPointerVarOf<PFNGLDRAWRANGEELEMENTARRAYAPPLEPROC>
typealias PFNGLDRAWRANGEELEMENTARRAYAPPLEPROC = CPointer<CFunction<(GLenum, GLuint, GLuint, GLint, GLsizei) -> Unit>>

typealias PFNGLMULTIDRAWELEMENTARRAYAPPLEPROCVar = CPointerVarOf<PFNGLMULTIDRAWELEMENTARRAYAPPLEPROC>
typealias PFNGLMULTIDRAWELEMENTARRAYAPPLEPROC = CPointer<CFunction<(GLenum, CPointer<GLintVar>?, CPointer<GLsizeiVar>?, GLsizei) -> Unit>>

typealias PFNGLMULTIDRAWRANGEELEMENTARRAYAPPLEPROCVar = CPointerVarOf<PFNGLMULTIDRAWRANGEELEMENTARRAYAPPLEPROC>
typealias PFNGLMULTIDRAWRANGEELEMENTARRAYAPPLEPROC = CPointer<CFunction<(GLenum, GLuint, GLuint, CPointer<GLintVar>?, CPointer<GLsizeiVar>?, GLsizei) -> Unit>>

typealias PFNGLGENFENCESAPPLEPROCVar = CPointerVarOf<PFNGLGENFENCESAPPLEPROC>
typealias PFNGLGENFENCESAPPLEPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLDELETEFENCESAPPLEPROCVar = CPointerVarOf<PFNGLDELETEFENCESAPPLEPROC>
typealias PFNGLDELETEFENCESAPPLEPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLSETFENCEAPPLEPROCVar = CPointerVarOf<PFNGLSETFENCEAPPLEPROC>
typealias PFNGLSETFENCEAPPLEPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLISFENCEAPPLEPROCVar = CPointerVarOf<PFNGLISFENCEAPPLEPROC>
typealias PFNGLISFENCEAPPLEPROC = CPointer<CFunction<(GLuint) -> GLboolean>>

typealias PFNGLTESTFENCEAPPLEPROCVar = CPointerVarOf<PFNGLTESTFENCEAPPLEPROC>
typealias PFNGLTESTFENCEAPPLEPROC = CPointer<CFunction<(GLuint) -> GLboolean>>

typealias PFNGLFINISHFENCEAPPLEPROCVar = CPointerVarOf<PFNGLFINISHFENCEAPPLEPROC>
typealias PFNGLFINISHFENCEAPPLEPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLTESTOBJECTAPPLEPROCVar = CPointerVarOf<PFNGLTESTOBJECTAPPLEPROC>
typealias PFNGLTESTOBJECTAPPLEPROC = CPointer<CFunction<(GLenum, GLuint) -> GLboolean>>

typealias PFNGLFINISHOBJECTAPPLEPROCVar = CPointerVarOf<PFNGLFINISHOBJECTAPPLEPROC>
typealias PFNGLFINISHOBJECTAPPLEPROC = CPointer<CFunction<(GLenum, GLint) -> Unit>>

typealias PFNGLBUFFERPARAMETERIAPPLEPROCVar = CPointerVarOf<PFNGLBUFFERPARAMETERIAPPLEPROC>
typealias PFNGLBUFFERPARAMETERIAPPLEPROC = CPointer<CFunction<(GLenum, GLenum, GLint) -> Unit>>

typealias PFNGLFLUSHMAPPEDBUFFERRANGEAPPLEPROCVar = CPointerVarOf<PFNGLFLUSHMAPPEDBUFFERRANGEAPPLEPROC>
typealias PFNGLFLUSHMAPPEDBUFFERRANGEAPPLEPROC = CPointer<CFunction<(GLenum, GLintptr, GLsizeiptr) -> Unit>>

typealias PFNGLOBJECTPURGEABLEAPPLEPROCVar = CPointerVarOf<PFNGLOBJECTPURGEABLEAPPLEPROC>
typealias PFNGLOBJECTPURGEABLEAPPLEPROC = CPointer<CFunction<(GLenum, GLuint, GLenum) -> GLenum>>

typealias PFNGLOBJECTUNPURGEABLEAPPLEPROCVar = CPointerVarOf<PFNGLOBJECTUNPURGEABLEAPPLEPROC>
typealias PFNGLOBJECTUNPURGEABLEAPPLEPROC = CPointer<CFunction<(GLenum, GLuint, GLenum) -> GLenum>>

typealias PFNGLGETOBJECTPARAMETERIVAPPLEPROCVar = CPointerVarOf<PFNGLGETOBJECTPARAMETERIVAPPLEPROC>
typealias PFNGLGETOBJECTPARAMETERIVAPPLEPROC = CPointer<CFunction<(GLenum, GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLTEXTURERANGEAPPLEPROCVar = CPointerVarOf<PFNGLTEXTURERANGEAPPLEPROC>
typealias PFNGLTEXTURERANGEAPPLEPROC = CPointer<CFunction<(GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLGETTEXPARAMETERPOINTERVAPPLEPROCVar = CPointerVarOf<PFNGLGETTEXPARAMETERPOINTERVAPPLEPROC>
typealias PFNGLGETTEXPARAMETERPOINTERVAPPLEPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<COpaquePointerVar>?) -> Unit>>

typealias PFNGLBINDVERTEXARRAYAPPLEPROCVar = CPointerVarOf<PFNGLBINDVERTEXARRAYAPPLEPROC>
typealias PFNGLBINDVERTEXARRAYAPPLEPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLDELETEVERTEXARRAYSAPPLEPROCVar = CPointerVarOf<PFNGLDELETEVERTEXARRAYSAPPLEPROC>
typealias PFNGLDELETEVERTEXARRAYSAPPLEPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGENVERTEXARRAYSAPPLEPROCVar = CPointerVarOf<PFNGLGENVERTEXARRAYSAPPLEPROC>
typealias PFNGLGENVERTEXARRAYSAPPLEPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLISVERTEXARRAYAPPLEPROCVar = CPointerVarOf<PFNGLISVERTEXARRAYAPPLEPROC>
typealias PFNGLISVERTEXARRAYAPPLEPROC = CPointer<CFunction<(GLuint) -> GLboolean>>

typealias PFNGLVERTEXARRAYRANGEAPPLEPROCVar = CPointerVarOf<PFNGLVERTEXARRAYRANGEAPPLEPROC>
typealias PFNGLVERTEXARRAYRANGEAPPLEPROC = CPointer<CFunction<(GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLFLUSHVERTEXARRAYRANGEAPPLEPROCVar = CPointerVarOf<PFNGLFLUSHVERTEXARRAYRANGEAPPLEPROC>
typealias PFNGLFLUSHVERTEXARRAYRANGEAPPLEPROC = CPointer<CFunction<(GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLVERTEXARRAYPARAMETERIAPPLEPROCVar = CPointerVarOf<PFNGLVERTEXARRAYPARAMETERIAPPLEPROC>
typealias PFNGLVERTEXARRAYPARAMETERIAPPLEPROC = CPointer<CFunction<(GLenum, GLint) -> Unit>>

typealias PFNGLENABLEVERTEXATTRIBAPPLEPROCVar = CPointerVarOf<PFNGLENABLEVERTEXATTRIBAPPLEPROC>
typealias PFNGLENABLEVERTEXATTRIBAPPLEPROC = CPointer<CFunction<(GLuint, GLenum) -> Unit>>

typealias PFNGLDISABLEVERTEXATTRIBAPPLEPROCVar = CPointerVarOf<PFNGLDISABLEVERTEXATTRIBAPPLEPROC>
typealias PFNGLDISABLEVERTEXATTRIBAPPLEPROC = CPointer<CFunction<(GLuint, GLenum) -> Unit>>

typealias PFNGLISVERTEXATTRIBENABLEDAPPLEPROCVar = CPointerVarOf<PFNGLISVERTEXATTRIBENABLEDAPPLEPROC>
typealias PFNGLISVERTEXATTRIBENABLEDAPPLEPROC = CPointer<CFunction<(GLuint, GLenum) -> GLboolean>>

typealias PFNGLMAPVERTEXATTRIB1DAPPLEPROCVar = CPointerVarOf<PFNGLMAPVERTEXATTRIB1DAPPLEPROC>
typealias PFNGLMAPVERTEXATTRIB1DAPPLEPROC = CPointer<CFunction<(GLuint, GLuint, GLdouble, GLdouble, GLint, GLint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLMAPVERTEXATTRIB1FAPPLEPROCVar = CPointerVarOf<PFNGLMAPVERTEXATTRIB1FAPPLEPROC>
typealias PFNGLMAPVERTEXATTRIB1FAPPLEPROC = CPointer<CFunction<(GLuint, GLuint, GLfloat, GLfloat, GLint, GLint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLMAPVERTEXATTRIB2DAPPLEPROCVar = CPointerVarOf<PFNGLMAPVERTEXATTRIB2DAPPLEPROC>
typealias PFNGLMAPVERTEXATTRIB2DAPPLEPROC = CPointer<CFunction<(GLuint, GLuint, GLdouble, GLdouble, GLint, GLint, GLdouble, GLdouble, GLint, GLint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLMAPVERTEXATTRIB2FAPPLEPROCVar = CPointerVarOf<PFNGLMAPVERTEXATTRIB2FAPPLEPROC>
typealias PFNGLMAPVERTEXATTRIB2FAPPLEPROC = CPointer<CFunction<(GLuint, GLuint, GLfloat, GLfloat, GLint, GLint, GLfloat, GLfloat, GLint, GLint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLDRAWBUFFERSATIPROCVar = CPointerVarOf<PFNGLDRAWBUFFERSATIPROC>
typealias PFNGLDRAWBUFFERSATIPROC = CPointer<CFunction<(GLsizei, CPointer<GLenumVar>?) -> Unit>>

typealias PFNGLELEMENTPOINTERATIPROCVar = CPointerVarOf<PFNGLELEMENTPOINTERATIPROC>
typealias PFNGLELEMENTPOINTERATIPROC = CPointer<CFunction<(GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLDRAWELEMENTARRAYATIPROCVar = CPointerVarOf<PFNGLDRAWELEMENTARRAYATIPROC>
typealias PFNGLDRAWELEMENTARRAYATIPROC = CPointer<CFunction<(GLenum, GLsizei) -> Unit>>

typealias PFNGLDRAWRANGEELEMENTARRAYATIPROCVar = CPointerVarOf<PFNGLDRAWRANGEELEMENTARRAYATIPROC>
typealias PFNGLDRAWRANGEELEMENTARRAYATIPROC = CPointer<CFunction<(GLenum, GLuint, GLuint, GLsizei) -> Unit>>

typealias PFNGLTEXBUMPPARAMETERIVATIPROCVar = CPointerVarOf<PFNGLTEXBUMPPARAMETERIVATIPROC>
typealias PFNGLTEXBUMPPARAMETERIVATIPROC = CPointer<CFunction<(GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLTEXBUMPPARAMETERFVATIPROCVar = CPointerVarOf<PFNGLTEXBUMPPARAMETERFVATIPROC>
typealias PFNGLTEXBUMPPARAMETERFVATIPROC = CPointer<CFunction<(GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETTEXBUMPPARAMETERIVATIPROCVar = CPointerVarOf<PFNGLGETTEXBUMPPARAMETERIVATIPROC>
typealias PFNGLGETTEXBUMPPARAMETERIVATIPROC = CPointer<CFunction<(GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETTEXBUMPPARAMETERFVATIPROCVar = CPointerVarOf<PFNGLGETTEXBUMPPARAMETERFVATIPROC>
typealias PFNGLGETTEXBUMPPARAMETERFVATIPROC = CPointer<CFunction<(GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGENFRAGMENTSHADERSATIPROCVar = CPointerVarOf<PFNGLGENFRAGMENTSHADERSATIPROC>
typealias PFNGLGENFRAGMENTSHADERSATIPROC = CPointer<CFunction<(GLuint) -> GLuint>>

typealias PFNGLBINDFRAGMENTSHADERATIPROCVar = CPointerVarOf<PFNGLBINDFRAGMENTSHADERATIPROC>
typealias PFNGLBINDFRAGMENTSHADERATIPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLDELETEFRAGMENTSHADERATIPROCVar = CPointerVarOf<PFNGLDELETEFRAGMENTSHADERATIPROC>
typealias PFNGLDELETEFRAGMENTSHADERATIPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLBEGINFRAGMENTSHADERATIPROCVar = CPointerVarOf<PFNGLBEGINFRAGMENTSHADERATIPROC>
typealias PFNGLBEGINFRAGMENTSHADERATIPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLENDFRAGMENTSHADERATIPROCVar = CPointerVarOf<PFNGLENDFRAGMENTSHADERATIPROC>
typealias PFNGLENDFRAGMENTSHADERATIPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLPASSTEXCOORDATIPROCVar = CPointerVarOf<PFNGLPASSTEXCOORDATIPROC>
typealias PFNGLPASSTEXCOORDATIPROC = CPointer<CFunction<(GLuint, GLuint, GLenum) -> Unit>>

typealias PFNGLSAMPLEMAPATIPROCVar = CPointerVarOf<PFNGLSAMPLEMAPATIPROC>
typealias PFNGLSAMPLEMAPATIPROC = CPointer<CFunction<(GLuint, GLuint, GLenum) -> Unit>>

typealias PFNGLCOLORFRAGMENTOP1ATIPROCVar = CPointerVarOf<PFNGLCOLORFRAGMENTOP1ATIPROC>
typealias PFNGLCOLORFRAGMENTOP1ATIPROC = CPointer<CFunction<(GLenum, GLuint, GLuint, GLuint, GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLCOLORFRAGMENTOP2ATIPROCVar = CPointerVarOf<PFNGLCOLORFRAGMENTOP2ATIPROC>
typealias PFNGLCOLORFRAGMENTOP2ATIPROC = CPointer<CFunction<(GLenum, GLuint, GLuint, GLuint, GLuint, GLuint, GLuint, GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLCOLORFRAGMENTOP3ATIPROCVar = CPointerVarOf<PFNGLCOLORFRAGMENTOP3ATIPROC>
typealias PFNGLCOLORFRAGMENTOP3ATIPROC = CPointer<CFunction<(GLenum, GLuint, GLuint, GLuint, GLuint, GLuint, GLuint, GLuint, GLuint, GLuint, GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLALPHAFRAGMENTOP1ATIPROCVar = CPointerVarOf<PFNGLALPHAFRAGMENTOP1ATIPROC>
typealias PFNGLALPHAFRAGMENTOP1ATIPROC = CPointer<CFunction<(GLenum, GLuint, GLuint, GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLALPHAFRAGMENTOP2ATIPROCVar = CPointerVarOf<PFNGLALPHAFRAGMENTOP2ATIPROC>
typealias PFNGLALPHAFRAGMENTOP2ATIPROC = CPointer<CFunction<(GLenum, GLuint, GLuint, GLuint, GLuint, GLuint, GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLALPHAFRAGMENTOP3ATIPROCVar = CPointerVarOf<PFNGLALPHAFRAGMENTOP3ATIPROC>
typealias PFNGLALPHAFRAGMENTOP3ATIPROC = CPointer<CFunction<(GLenum, GLuint, GLuint, GLuint, GLuint, GLuint, GLuint, GLuint, GLuint, GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLSETFRAGMENTSHADERCONSTANTATIPROCVar = CPointerVarOf<PFNGLSETFRAGMENTSHADERCONSTANTATIPROC>
typealias PFNGLSETFRAGMENTSHADERCONSTANTATIPROC = CPointer<CFunction<(GLuint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLMAPOBJECTBUFFERATIPROCVar = CPointerVarOf<PFNGLMAPOBJECTBUFFERATIPROC>
typealias PFNGLMAPOBJECTBUFFERATIPROC = CPointer<CFunction<(GLuint) -> COpaquePointer?>>

typealias PFNGLUNMAPOBJECTBUFFERATIPROCVar = CPointerVarOf<PFNGLUNMAPOBJECTBUFFERATIPROC>
typealias PFNGLUNMAPOBJECTBUFFERATIPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLPNTRIANGLESIATIPROCVar = CPointerVarOf<PFNGLPNTRIANGLESIATIPROC>
typealias PFNGLPNTRIANGLESIATIPROC = CPointer<CFunction<(GLenum, GLint) -> Unit>>

typealias PFNGLPNTRIANGLESFATIPROCVar = CPointerVarOf<PFNGLPNTRIANGLESFATIPROC>
typealias PFNGLPNTRIANGLESFATIPROC = CPointer<CFunction<(GLenum, GLfloat) -> Unit>>

typealias PFNGLSTENCILOPSEPARATEATIPROCVar = CPointerVarOf<PFNGLSTENCILOPSEPARATEATIPROC>
typealias PFNGLSTENCILOPSEPARATEATIPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, GLenum) -> Unit>>

typealias PFNGLSTENCILFUNCSEPARATEATIPROCVar = CPointerVarOf<PFNGLSTENCILFUNCSEPARATEATIPROC>
typealias PFNGLSTENCILFUNCSEPARATEATIPROC = CPointer<CFunction<(GLenum, GLenum, GLint, GLuint) -> Unit>>

typealias PFNGLNEWOBJECTBUFFERATIPROCVar = CPointerVarOf<PFNGLNEWOBJECTBUFFERATIPROC>
typealias PFNGLNEWOBJECTBUFFERATIPROC = CPointer<CFunction<(GLsizei, COpaquePointer?, GLenum) -> GLuint>>

typealias PFNGLISOBJECTBUFFERATIPROCVar = CPointerVarOf<PFNGLISOBJECTBUFFERATIPROC>
typealias PFNGLISOBJECTBUFFERATIPROC = CPointer<CFunction<(GLuint) -> GLboolean>>

typealias PFNGLUPDATEOBJECTBUFFERATIPROCVar = CPointerVarOf<PFNGLUPDATEOBJECTBUFFERATIPROC>
typealias PFNGLUPDATEOBJECTBUFFERATIPROC = CPointer<CFunction<(GLuint, GLuint, GLsizei, COpaquePointer?, GLenum) -> Unit>>

typealias PFNGLGETOBJECTBUFFERFVATIPROCVar = CPointerVarOf<PFNGLGETOBJECTBUFFERFVATIPROC>
typealias PFNGLGETOBJECTBUFFERFVATIPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETOBJECTBUFFERIVATIPROCVar = CPointerVarOf<PFNGLGETOBJECTBUFFERIVATIPROC>
typealias PFNGLGETOBJECTBUFFERIVATIPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLFREEOBJECTBUFFERATIPROCVar = CPointerVarOf<PFNGLFREEOBJECTBUFFERATIPROC>
typealias PFNGLFREEOBJECTBUFFERATIPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLARRAYOBJECTATIPROCVar = CPointerVarOf<PFNGLARRAYOBJECTATIPROC>
typealias PFNGLARRAYOBJECTATIPROC = CPointer<CFunction<(GLenum, GLint, GLenum, GLsizei, GLuint, GLuint) -> Unit>>

typealias PFNGLGETARRAYOBJECTFVATIPROCVar = CPointerVarOf<PFNGLGETARRAYOBJECTFVATIPROC>
typealias PFNGLGETARRAYOBJECTFVATIPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETARRAYOBJECTIVATIPROCVar = CPointerVarOf<PFNGLGETARRAYOBJECTIVATIPROC>
typealias PFNGLGETARRAYOBJECTIVATIPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLVARIANTARRAYOBJECTATIPROCVar = CPointerVarOf<PFNGLVARIANTARRAYOBJECTATIPROC>
typealias PFNGLVARIANTARRAYOBJECTATIPROC = CPointer<CFunction<(GLuint, GLenum, GLsizei, GLuint, GLuint) -> Unit>>

typealias PFNGLGETVARIANTARRAYOBJECTFVATIPROCVar = CPointerVarOf<PFNGLGETVARIANTARRAYOBJECTFVATIPROC>
typealias PFNGLGETVARIANTARRAYOBJECTFVATIPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETVARIANTARRAYOBJECTIVATIPROCVar = CPointerVarOf<PFNGLGETVARIANTARRAYOBJECTIVATIPROC>
typealias PFNGLGETVARIANTARRAYOBJECTIVATIPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBARRAYOBJECTATIPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBARRAYOBJECTATIPROC>
typealias PFNGLVERTEXATTRIBARRAYOBJECTATIPROC = CPointer<CFunction<(GLuint, GLint, GLenum, GLboolean, GLsizei, GLuint, GLuint) -> Unit>>

typealias PFNGLGETVERTEXATTRIBARRAYOBJECTFVATIPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBARRAYOBJECTFVATIPROC>
typealias PFNGLGETVERTEXATTRIBARRAYOBJECTFVATIPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETVERTEXATTRIBARRAYOBJECTIVATIPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBARRAYOBJECTIVATIPROC>
typealias PFNGLGETVERTEXATTRIBARRAYOBJECTIVATIPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLVERTEXSTREAM1SATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM1SATIPROC>
typealias PFNGLVERTEXSTREAM1SATIPROC = CPointer<CFunction<(GLenum, GLshort) -> Unit>>

typealias PFNGLVERTEXSTREAM1SVATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM1SVATIPROC>
typealias PFNGLVERTEXSTREAM1SVATIPROC = CPointer<CFunction<(GLenum, CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLVERTEXSTREAM1IATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM1IATIPROC>
typealias PFNGLVERTEXSTREAM1IATIPROC = CPointer<CFunction<(GLenum, GLint) -> Unit>>

typealias PFNGLVERTEXSTREAM1IVATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM1IVATIPROC>
typealias PFNGLVERTEXSTREAM1IVATIPROC = CPointer<CFunction<(GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLVERTEXSTREAM1FATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM1FATIPROC>
typealias PFNGLVERTEXSTREAM1FATIPROC = CPointer<CFunction<(GLenum, GLfloat) -> Unit>>

typealias PFNGLVERTEXSTREAM1FVATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM1FVATIPROC>
typealias PFNGLVERTEXSTREAM1FVATIPROC = CPointer<CFunction<(GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLVERTEXSTREAM1DATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM1DATIPROC>
typealias PFNGLVERTEXSTREAM1DATIPROC = CPointer<CFunction<(GLenum, GLdouble) -> Unit>>

typealias PFNGLVERTEXSTREAM1DVATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM1DVATIPROC>
typealias PFNGLVERTEXSTREAM1DVATIPROC = CPointer<CFunction<(GLenum, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLVERTEXSTREAM2SATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM2SATIPROC>
typealias PFNGLVERTEXSTREAM2SATIPROC = CPointer<CFunction<(GLenum, GLshort, GLshort) -> Unit>>

typealias PFNGLVERTEXSTREAM2SVATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM2SVATIPROC>
typealias PFNGLVERTEXSTREAM2SVATIPROC = CPointer<CFunction<(GLenum, CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLVERTEXSTREAM2IATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM2IATIPROC>
typealias PFNGLVERTEXSTREAM2IATIPROC = CPointer<CFunction<(GLenum, GLint, GLint) -> Unit>>

typealias PFNGLVERTEXSTREAM2IVATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM2IVATIPROC>
typealias PFNGLVERTEXSTREAM2IVATIPROC = CPointer<CFunction<(GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLVERTEXSTREAM2FATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM2FATIPROC>
typealias PFNGLVERTEXSTREAM2FATIPROC = CPointer<CFunction<(GLenum, GLfloat, GLfloat) -> Unit>>

typealias PFNGLVERTEXSTREAM2FVATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM2FVATIPROC>
typealias PFNGLVERTEXSTREAM2FVATIPROC = CPointer<CFunction<(GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLVERTEXSTREAM2DATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM2DATIPROC>
typealias PFNGLVERTEXSTREAM2DATIPROC = CPointer<CFunction<(GLenum, GLdouble, GLdouble) -> Unit>>

typealias PFNGLVERTEXSTREAM2DVATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM2DVATIPROC>
typealias PFNGLVERTEXSTREAM2DVATIPROC = CPointer<CFunction<(GLenum, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLVERTEXSTREAM3SATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM3SATIPROC>
typealias PFNGLVERTEXSTREAM3SATIPROC = CPointer<CFunction<(GLenum, GLshort, GLshort, GLshort) -> Unit>>

typealias PFNGLVERTEXSTREAM3SVATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM3SVATIPROC>
typealias PFNGLVERTEXSTREAM3SVATIPROC = CPointer<CFunction<(GLenum, CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLVERTEXSTREAM3IATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM3IATIPROC>
typealias PFNGLVERTEXSTREAM3IATIPROC = CPointer<CFunction<(GLenum, GLint, GLint, GLint) -> Unit>>

typealias PFNGLVERTEXSTREAM3IVATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM3IVATIPROC>
typealias PFNGLVERTEXSTREAM3IVATIPROC = CPointer<CFunction<(GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLVERTEXSTREAM3FATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM3FATIPROC>
typealias PFNGLVERTEXSTREAM3FATIPROC = CPointer<CFunction<(GLenum, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLVERTEXSTREAM3FVATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM3FVATIPROC>
typealias PFNGLVERTEXSTREAM3FVATIPROC = CPointer<CFunction<(GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLVERTEXSTREAM3DATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM3DATIPROC>
typealias PFNGLVERTEXSTREAM3DATIPROC = CPointer<CFunction<(GLenum, GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLVERTEXSTREAM3DVATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM3DVATIPROC>
typealias PFNGLVERTEXSTREAM3DVATIPROC = CPointer<CFunction<(GLenum, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLVERTEXSTREAM4SATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM4SATIPROC>
typealias PFNGLVERTEXSTREAM4SATIPROC = CPointer<CFunction<(GLenum, GLshort, GLshort, GLshort, GLshort) -> Unit>>

typealias PFNGLVERTEXSTREAM4SVATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM4SVATIPROC>
typealias PFNGLVERTEXSTREAM4SVATIPROC = CPointer<CFunction<(GLenum, CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLVERTEXSTREAM4IATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM4IATIPROC>
typealias PFNGLVERTEXSTREAM4IATIPROC = CPointer<CFunction<(GLenum, GLint, GLint, GLint, GLint) -> Unit>>

typealias PFNGLVERTEXSTREAM4IVATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM4IVATIPROC>
typealias PFNGLVERTEXSTREAM4IVATIPROC = CPointer<CFunction<(GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLVERTEXSTREAM4FATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM4FATIPROC>
typealias PFNGLVERTEXSTREAM4FATIPROC = CPointer<CFunction<(GLenum, GLfloat, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLVERTEXSTREAM4FVATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM4FVATIPROC>
typealias PFNGLVERTEXSTREAM4FVATIPROC = CPointer<CFunction<(GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLVERTEXSTREAM4DATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM4DATIPROC>
typealias PFNGLVERTEXSTREAM4DATIPROC = CPointer<CFunction<(GLenum, GLdouble, GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLVERTEXSTREAM4DVATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM4DVATIPROC>
typealias PFNGLVERTEXSTREAM4DVATIPROC = CPointer<CFunction<(GLenum, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLNORMALSTREAM3BATIPROCVar = CPointerVarOf<PFNGLNORMALSTREAM3BATIPROC>
typealias PFNGLNORMALSTREAM3BATIPROC = CPointer<CFunction<(GLenum, GLbyte, GLbyte, GLbyte) -> Unit>>

typealias PFNGLNORMALSTREAM3BVATIPROCVar = CPointerVarOf<PFNGLNORMALSTREAM3BVATIPROC>
typealias PFNGLNORMALSTREAM3BVATIPROC = CPointer<CFunction<(GLenum, CPointer<GLbyteVar>?) -> Unit>>

typealias PFNGLNORMALSTREAM3SATIPROCVar = CPointerVarOf<PFNGLNORMALSTREAM3SATIPROC>
typealias PFNGLNORMALSTREAM3SATIPROC = CPointer<CFunction<(GLenum, GLshort, GLshort, GLshort) -> Unit>>

typealias PFNGLNORMALSTREAM3SVATIPROCVar = CPointerVarOf<PFNGLNORMALSTREAM3SVATIPROC>
typealias PFNGLNORMALSTREAM3SVATIPROC = CPointer<CFunction<(GLenum, CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLNORMALSTREAM3IATIPROCVar = CPointerVarOf<PFNGLNORMALSTREAM3IATIPROC>
typealias PFNGLNORMALSTREAM3IATIPROC = CPointer<CFunction<(GLenum, GLint, GLint, GLint) -> Unit>>

typealias PFNGLNORMALSTREAM3IVATIPROCVar = CPointerVarOf<PFNGLNORMALSTREAM3IVATIPROC>
typealias PFNGLNORMALSTREAM3IVATIPROC = CPointer<CFunction<(GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLNORMALSTREAM3FATIPROCVar = CPointerVarOf<PFNGLNORMALSTREAM3FATIPROC>
typealias PFNGLNORMALSTREAM3FATIPROC = CPointer<CFunction<(GLenum, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLNORMALSTREAM3FVATIPROCVar = CPointerVarOf<PFNGLNORMALSTREAM3FVATIPROC>
typealias PFNGLNORMALSTREAM3FVATIPROC = CPointer<CFunction<(GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLNORMALSTREAM3DATIPROCVar = CPointerVarOf<PFNGLNORMALSTREAM3DATIPROC>
typealias PFNGLNORMALSTREAM3DATIPROC = CPointer<CFunction<(GLenum, GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLNORMALSTREAM3DVATIPROCVar = CPointerVarOf<PFNGLNORMALSTREAM3DVATIPROC>
typealias PFNGLNORMALSTREAM3DVATIPROC = CPointer<CFunction<(GLenum, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLCLIENTACTIVEVERTEXSTREAMATIPROCVar = CPointerVarOf<PFNGLCLIENTACTIVEVERTEXSTREAMATIPROC>
typealias PFNGLCLIENTACTIVEVERTEXSTREAMATIPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLVERTEXBLENDENVIATIPROCVar = CPointerVarOf<PFNGLVERTEXBLENDENVIATIPROC>
typealias PFNGLVERTEXBLENDENVIATIPROC = CPointer<CFunction<(GLenum, GLint) -> Unit>>

typealias PFNGLVERTEXBLENDENVFATIPROCVar = CPointerVarOf<PFNGLVERTEXBLENDENVFATIPROC>
typealias PFNGLVERTEXBLENDENVFATIPROC = CPointer<CFunction<(GLenum, GLfloat) -> Unit>>

typealias PFNGLUNIFORMBUFFEREXTPROCVar = CPointerVarOf<PFNGLUNIFORMBUFFEREXTPROC>
typealias PFNGLUNIFORMBUFFEREXTPROC = CPointer<CFunction<(GLuint, GLint, GLuint) -> Unit>>

typealias PFNGLGETUNIFORMBUFFERSIZEEXTPROCVar = CPointerVarOf<PFNGLGETUNIFORMBUFFERSIZEEXTPROC>
typealias PFNGLGETUNIFORMBUFFERSIZEEXTPROC = CPointer<CFunction<(GLuint, GLint) -> GLint>>

typealias PFNGLGETUNIFORMOFFSETEXTPROCVar = CPointerVarOf<PFNGLGETUNIFORMOFFSETEXTPROC>
typealias PFNGLGETUNIFORMOFFSETEXTPROC = CPointer<CFunction<(GLuint, GLint) -> GLintptr>>

typealias PFNGLBLENDCOLOREXTPROCVar = CPointerVarOf<PFNGLBLENDCOLOREXTPROC>
typealias PFNGLBLENDCOLOREXTPROC = CPointer<CFunction<(GLfloat, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLBLENDEQUATIONSEPARATEEXTPROCVar = CPointerVarOf<PFNGLBLENDEQUATIONSEPARATEEXTPROC>
typealias PFNGLBLENDEQUATIONSEPARATEEXTPROC = CPointer<CFunction<(GLenum, GLenum) -> Unit>>

typealias PFNGLBLENDFUNCSEPARATEEXTPROCVar = CPointerVarOf<PFNGLBLENDFUNCSEPARATEEXTPROC>
typealias PFNGLBLENDFUNCSEPARATEEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, GLenum) -> Unit>>

typealias PFNGLBLENDEQUATIONEXTPROCVar = CPointerVarOf<PFNGLBLENDEQUATIONEXTPROC>
typealias PFNGLBLENDEQUATIONEXTPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLCOLORSUBTABLEEXTPROCVar = CPointerVarOf<PFNGLCOLORSUBTABLEEXTPROC>
typealias PFNGLCOLORSUBTABLEEXTPROC = CPointer<CFunction<(GLenum, GLsizei, GLsizei, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLCOPYCOLORSUBTABLEEXTPROCVar = CPointerVarOf<PFNGLCOPYCOLORSUBTABLEEXTPROC>
typealias PFNGLCOPYCOLORSUBTABLEEXTPROC = CPointer<CFunction<(GLenum, GLsizei, GLint, GLint, GLsizei) -> Unit>>

typealias PFNGLLOCKARRAYSEXTPROCVar = CPointerVarOf<PFNGLLOCKARRAYSEXTPROC>
typealias PFNGLLOCKARRAYSEXTPROC = CPointer<CFunction<(GLint, GLsizei) -> Unit>>

typealias PFNGLUNLOCKARRAYSEXTPROCVar = CPointerVarOf<PFNGLUNLOCKARRAYSEXTPROC>
typealias PFNGLUNLOCKARRAYSEXTPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLCONVOLUTIONFILTER1DEXTPROCVar = CPointerVarOf<PFNGLCONVOLUTIONFILTER1DEXTPROC>
typealias PFNGLCONVOLUTIONFILTER1DEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLsizei, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLCONVOLUTIONFILTER2DEXTPROCVar = CPointerVarOf<PFNGLCONVOLUTIONFILTER2DEXTPROC>
typealias PFNGLCONVOLUTIONFILTER2DEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLsizei, GLsizei, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLCONVOLUTIONPARAMETERFEXTPROCVar = CPointerVarOf<PFNGLCONVOLUTIONPARAMETERFEXTPROC>
typealias PFNGLCONVOLUTIONPARAMETERFEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLfloat) -> Unit>>

typealias PFNGLCONVOLUTIONPARAMETERFVEXTPROCVar = CPointerVarOf<PFNGLCONVOLUTIONPARAMETERFVEXTPROC>
typealias PFNGLCONVOLUTIONPARAMETERFVEXTPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLCONVOLUTIONPARAMETERIEXTPROCVar = CPointerVarOf<PFNGLCONVOLUTIONPARAMETERIEXTPROC>
typealias PFNGLCONVOLUTIONPARAMETERIEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLint) -> Unit>>

typealias PFNGLCONVOLUTIONPARAMETERIVEXTPROCVar = CPointerVarOf<PFNGLCONVOLUTIONPARAMETERIVEXTPROC>
typealias PFNGLCONVOLUTIONPARAMETERIVEXTPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLCOPYCONVOLUTIONFILTER1DEXTPROCVar = CPointerVarOf<PFNGLCOPYCONVOLUTIONFILTER1DEXTPROC>
typealias PFNGLCOPYCONVOLUTIONFILTER1DEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLint, GLint, GLsizei) -> Unit>>

typealias PFNGLCOPYCONVOLUTIONFILTER2DEXTPROCVar = CPointerVarOf<PFNGLCOPYCONVOLUTIONFILTER2DEXTPROC>
typealias PFNGLCOPYCONVOLUTIONFILTER2DEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLint, GLint, GLsizei, GLsizei) -> Unit>>

typealias PFNGLGETCONVOLUTIONFILTEREXTPROCVar = CPointerVarOf<PFNGLGETCONVOLUTIONFILTEREXTPROC>
typealias PFNGLGETCONVOLUTIONFILTEREXTPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLGETCONVOLUTIONPARAMETERFVEXTPROCVar = CPointerVarOf<PFNGLGETCONVOLUTIONPARAMETERFVEXTPROC>
typealias PFNGLGETCONVOLUTIONPARAMETERFVEXTPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETCONVOLUTIONPARAMETERIVEXTPROCVar = CPointerVarOf<PFNGLGETCONVOLUTIONPARAMETERIVEXTPROC>
typealias PFNGLGETCONVOLUTIONPARAMETERIVEXTPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETSEPARABLEFILTEREXTPROCVar = CPointerVarOf<PFNGLGETSEPARABLEFILTEREXTPROC>
typealias PFNGLGETSEPARABLEFILTEREXTPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, COpaquePointer?, COpaquePointer?, COpaquePointer?) -> Unit>>

typealias PFNGLSEPARABLEFILTER2DEXTPROCVar = CPointerVarOf<PFNGLSEPARABLEFILTER2DEXTPROC>
typealias PFNGLSEPARABLEFILTER2DEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLsizei, GLsizei, GLenum, GLenum, COpaquePointer?, COpaquePointer?) -> Unit>>

typealias PFNGLTANGENT3BEXTPROCVar = CPointerVarOf<PFNGLTANGENT3BEXTPROC>
typealias PFNGLTANGENT3BEXTPROC = CPointer<CFunction<(GLbyte, GLbyte, GLbyte) -> Unit>>

typealias PFNGLTANGENT3BVEXTPROCVar = CPointerVarOf<PFNGLTANGENT3BVEXTPROC>
typealias PFNGLTANGENT3BVEXTPROC = CPointer<CFunction<(CPointer<GLbyteVar>?) -> Unit>>

typealias PFNGLTANGENT3DEXTPROCVar = CPointerVarOf<PFNGLTANGENT3DEXTPROC>
typealias PFNGLTANGENT3DEXTPROC = CPointer<CFunction<(GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLTANGENT3DVEXTPROCVar = CPointerVarOf<PFNGLTANGENT3DVEXTPROC>
typealias PFNGLTANGENT3DVEXTPROC = CPointer<CFunction<(CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLTANGENT3FEXTPROCVar = CPointerVarOf<PFNGLTANGENT3FEXTPROC>
typealias PFNGLTANGENT3FEXTPROC = CPointer<CFunction<(GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLTANGENT3FVEXTPROCVar = CPointerVarOf<PFNGLTANGENT3FVEXTPROC>
typealias PFNGLTANGENT3FVEXTPROC = CPointer<CFunction<(CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLTANGENT3IEXTPROCVar = CPointerVarOf<PFNGLTANGENT3IEXTPROC>
typealias PFNGLTANGENT3IEXTPROC = CPointer<CFunction<(GLint, GLint, GLint) -> Unit>>

typealias PFNGLTANGENT3IVEXTPROCVar = CPointerVarOf<PFNGLTANGENT3IVEXTPROC>
typealias PFNGLTANGENT3IVEXTPROC = CPointer<CFunction<(CPointer<GLintVar>?) -> Unit>>

typealias PFNGLTANGENT3SEXTPROCVar = CPointerVarOf<PFNGLTANGENT3SEXTPROC>
typealias PFNGLTANGENT3SEXTPROC = CPointer<CFunction<(GLshort, GLshort, GLshort) -> Unit>>

typealias PFNGLTANGENT3SVEXTPROCVar = CPointerVarOf<PFNGLTANGENT3SVEXTPROC>
typealias PFNGLTANGENT3SVEXTPROC = CPointer<CFunction<(CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLBINORMAL3BEXTPROCVar = CPointerVarOf<PFNGLBINORMAL3BEXTPROC>
typealias PFNGLBINORMAL3BEXTPROC = CPointer<CFunction<(GLbyte, GLbyte, GLbyte) -> Unit>>

typealias PFNGLBINORMAL3BVEXTPROCVar = CPointerVarOf<PFNGLBINORMAL3BVEXTPROC>
typealias PFNGLBINORMAL3BVEXTPROC = CPointer<CFunction<(CPointer<GLbyteVar>?) -> Unit>>

typealias PFNGLBINORMAL3DEXTPROCVar = CPointerVarOf<PFNGLBINORMAL3DEXTPROC>
typealias PFNGLBINORMAL3DEXTPROC = CPointer<CFunction<(GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLBINORMAL3DVEXTPROCVar = CPointerVarOf<PFNGLBINORMAL3DVEXTPROC>
typealias PFNGLBINORMAL3DVEXTPROC = CPointer<CFunction<(CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLBINORMAL3FEXTPROCVar = CPointerVarOf<PFNGLBINORMAL3FEXTPROC>
typealias PFNGLBINORMAL3FEXTPROC = CPointer<CFunction<(GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLBINORMAL3FVEXTPROCVar = CPointerVarOf<PFNGLBINORMAL3FVEXTPROC>
typealias PFNGLBINORMAL3FVEXTPROC = CPointer<CFunction<(CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLBINORMAL3IEXTPROCVar = CPointerVarOf<PFNGLBINORMAL3IEXTPROC>
typealias PFNGLBINORMAL3IEXTPROC = CPointer<CFunction<(GLint, GLint, GLint) -> Unit>>

typealias PFNGLBINORMAL3IVEXTPROCVar = CPointerVarOf<PFNGLBINORMAL3IVEXTPROC>
typealias PFNGLBINORMAL3IVEXTPROC = CPointer<CFunction<(CPointer<GLintVar>?) -> Unit>>

typealias PFNGLBINORMAL3SEXTPROCVar = CPointerVarOf<PFNGLBINORMAL3SEXTPROC>
typealias PFNGLBINORMAL3SEXTPROC = CPointer<CFunction<(GLshort, GLshort, GLshort) -> Unit>>

typealias PFNGLBINORMAL3SVEXTPROCVar = CPointerVarOf<PFNGLBINORMAL3SVEXTPROC>
typealias PFNGLBINORMAL3SVEXTPROC = CPointer<CFunction<(CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLTANGENTPOINTEREXTPROCVar = CPointerVarOf<PFNGLTANGENTPOINTEREXTPROC>
typealias PFNGLTANGENTPOINTEREXTPROC = CPointer<CFunction<(GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLBINORMALPOINTEREXTPROCVar = CPointerVarOf<PFNGLBINORMALPOINTEREXTPROC>
typealias PFNGLBINORMALPOINTEREXTPROC = CPointer<CFunction<(GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLCOPYTEXIMAGE1DEXTPROCVar = CPointerVarOf<PFNGLCOPYTEXIMAGE1DEXTPROC>
typealias PFNGLCOPYTEXIMAGE1DEXTPROC = CPointer<CFunction<(GLenum, GLint, GLenum, GLint, GLint, GLsizei, GLint) -> Unit>>

typealias PFNGLCOPYTEXIMAGE2DEXTPROCVar = CPointerVarOf<PFNGLCOPYTEXIMAGE2DEXTPROC>
typealias PFNGLCOPYTEXIMAGE2DEXTPROC = CPointer<CFunction<(GLenum, GLint, GLenum, GLint, GLint, GLsizei, GLsizei, GLint) -> Unit>>

typealias PFNGLCOPYTEXSUBIMAGE1DEXTPROCVar = CPointerVarOf<PFNGLCOPYTEXSUBIMAGE1DEXTPROC>
typealias PFNGLCOPYTEXSUBIMAGE1DEXTPROC = CPointer<CFunction<(GLenum, GLint, GLint, GLint, GLint, GLsizei) -> Unit>>

typealias PFNGLCOPYTEXSUBIMAGE2DEXTPROCVar = CPointerVarOf<PFNGLCOPYTEXSUBIMAGE2DEXTPROC>
typealias PFNGLCOPYTEXSUBIMAGE2DEXTPROC = CPointer<CFunction<(GLenum, GLint, GLint, GLint, GLint, GLint, GLsizei, GLsizei) -> Unit>>

typealias PFNGLCOPYTEXSUBIMAGE3DEXTPROCVar = CPointerVarOf<PFNGLCOPYTEXSUBIMAGE3DEXTPROC>
typealias PFNGLCOPYTEXSUBIMAGE3DEXTPROC = CPointer<CFunction<(GLenum, GLint, GLint, GLint, GLint, GLint, GLint, GLsizei, GLsizei) -> Unit>>

typealias PFNGLCULLPARAMETERDVEXTPROCVar = CPointerVarOf<PFNGLCULLPARAMETERDVEXTPROC>
typealias PFNGLCULLPARAMETERDVEXTPROC = CPointer<CFunction<(GLenum, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLCULLPARAMETERFVEXTPROCVar = CPointerVarOf<PFNGLCULLPARAMETERFVEXTPROC>
typealias PFNGLCULLPARAMETERFVEXTPROC = CPointer<CFunction<(GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLLABELOBJECTEXTPROCVar = CPointerVarOf<PFNGLLABELOBJECTEXTPROC>
typealias PFNGLLABELOBJECTEXTPROC = CPointer<CFunction<(GLenum, GLuint, GLsizei, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLGETOBJECTLABELEXTPROCVar = CPointerVarOf<PFNGLGETOBJECTLABELEXTPROC>
typealias PFNGLGETOBJECTLABELEXTPROC = CPointer<CFunction<(GLenum, GLuint, GLsizei, CPointer<GLsizeiVar>?, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLINSERTEVENTMARKEREXTPROCVar = CPointerVarOf<PFNGLINSERTEVENTMARKEREXTPROC>
typealias PFNGLINSERTEVENTMARKEREXTPROC = CPointer<CFunction<(GLsizei, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLPUSHGROUPMARKEREXTPROCVar = CPointerVarOf<PFNGLPUSHGROUPMARKEREXTPROC>
typealias PFNGLPUSHGROUPMARKEREXTPROC = CPointer<CFunction<(GLsizei, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLPOPGROUPMARKEREXTPROCVar = CPointerVarOf<PFNGLPOPGROUPMARKEREXTPROC>
typealias PFNGLPOPGROUPMARKEREXTPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLDEPTHBOUNDSEXTPROCVar = CPointerVarOf<PFNGLDEPTHBOUNDSEXTPROC>
typealias PFNGLDEPTHBOUNDSEXTPROC = CPointer<CFunction<(GLclampd, GLclampd) -> Unit>>

typealias PFNGLMATRIXLOADFEXTPROCVar = CPointerVarOf<PFNGLMATRIXLOADFEXTPROC>
typealias PFNGLMATRIXLOADFEXTPROC = CPointer<CFunction<(GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLMATRIXLOADDEXTPROCVar = CPointerVarOf<PFNGLMATRIXLOADDEXTPROC>
typealias PFNGLMATRIXLOADDEXTPROC = CPointer<CFunction<(GLenum, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLMATRIXMULTFEXTPROCVar = CPointerVarOf<PFNGLMATRIXMULTFEXTPROC>
typealias PFNGLMATRIXMULTFEXTPROC = CPointer<CFunction<(GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLMATRIXMULTDEXTPROCVar = CPointerVarOf<PFNGLMATRIXMULTDEXTPROC>
typealias PFNGLMATRIXMULTDEXTPROC = CPointer<CFunction<(GLenum, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLMATRIXLOADIDENTITYEXTPROCVar = CPointerVarOf<PFNGLMATRIXLOADIDENTITYEXTPROC>
typealias PFNGLMATRIXLOADIDENTITYEXTPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLMATRIXROTATEFEXTPROCVar = CPointerVarOf<PFNGLMATRIXROTATEFEXTPROC>
typealias PFNGLMATRIXROTATEFEXTPROC = CPointer<CFunction<(GLenum, GLfloat, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLMATRIXROTATEDEXTPROCVar = CPointerVarOf<PFNGLMATRIXROTATEDEXTPROC>
typealias PFNGLMATRIXROTATEDEXTPROC = CPointer<CFunction<(GLenum, GLdouble, GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLMATRIXSCALEFEXTPROCVar = CPointerVarOf<PFNGLMATRIXSCALEFEXTPROC>
typealias PFNGLMATRIXSCALEFEXTPROC = CPointer<CFunction<(GLenum, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLMATRIXSCALEDEXTPROCVar = CPointerVarOf<PFNGLMATRIXSCALEDEXTPROC>
typealias PFNGLMATRIXSCALEDEXTPROC = CPointer<CFunction<(GLenum, GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLMATRIXTRANSLATEFEXTPROCVar = CPointerVarOf<PFNGLMATRIXTRANSLATEFEXTPROC>
typealias PFNGLMATRIXTRANSLATEFEXTPROC = CPointer<CFunction<(GLenum, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLMATRIXTRANSLATEDEXTPROCVar = CPointerVarOf<PFNGLMATRIXTRANSLATEDEXTPROC>
typealias PFNGLMATRIXTRANSLATEDEXTPROC = CPointer<CFunction<(GLenum, GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLMATRIXFRUSTUMEXTPROCVar = CPointerVarOf<PFNGLMATRIXFRUSTUMEXTPROC>
typealias PFNGLMATRIXFRUSTUMEXTPROC = CPointer<CFunction<(GLenum, GLdouble, GLdouble, GLdouble, GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLMATRIXORTHOEXTPROCVar = CPointerVarOf<PFNGLMATRIXORTHOEXTPROC>
typealias PFNGLMATRIXORTHOEXTPROC = CPointer<CFunction<(GLenum, GLdouble, GLdouble, GLdouble, GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLMATRIXPOPEXTPROCVar = CPointerVarOf<PFNGLMATRIXPOPEXTPROC>
typealias PFNGLMATRIXPOPEXTPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLMATRIXPUSHEXTPROCVar = CPointerVarOf<PFNGLMATRIXPUSHEXTPROC>
typealias PFNGLMATRIXPUSHEXTPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLCLIENTATTRIBDEFAULTEXTPROCVar = CPointerVarOf<PFNGLCLIENTATTRIBDEFAULTEXTPROC>
typealias PFNGLCLIENTATTRIBDEFAULTEXTPROC = CPointer<CFunction<(GLbitfield) -> Unit>>

typealias PFNGLPUSHCLIENTATTRIBDEFAULTEXTPROCVar = CPointerVarOf<PFNGLPUSHCLIENTATTRIBDEFAULTEXTPROC>
typealias PFNGLPUSHCLIENTATTRIBDEFAULTEXTPROC = CPointer<CFunction<(GLbitfield) -> Unit>>

typealias PFNGLTEXTUREPARAMETERFEXTPROCVar = CPointerVarOf<PFNGLTEXTUREPARAMETERFEXTPROC>
typealias PFNGLTEXTUREPARAMETERFEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLenum, GLfloat) -> Unit>>

typealias PFNGLTEXTUREPARAMETERFVEXTPROCVar = CPointerVarOf<PFNGLTEXTUREPARAMETERFVEXTPROC>
typealias PFNGLTEXTUREPARAMETERFVEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLTEXTUREPARAMETERIEXTPROCVar = CPointerVarOf<PFNGLTEXTUREPARAMETERIEXTPROC>
typealias PFNGLTEXTUREPARAMETERIEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLenum, GLint) -> Unit>>

typealias PFNGLTEXTUREPARAMETERIVEXTPROCVar = CPointerVarOf<PFNGLTEXTUREPARAMETERIVEXTPROC>
typealias PFNGLTEXTUREPARAMETERIVEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLTEXTUREIMAGE1DEXTPROCVar = CPointerVarOf<PFNGLTEXTUREIMAGE1DEXTPROC>
typealias PFNGLTEXTUREIMAGE1DEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLint, GLint, GLsizei, GLint, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLTEXTUREIMAGE2DEXTPROCVar = CPointerVarOf<PFNGLTEXTUREIMAGE2DEXTPROC>
typealias PFNGLTEXTUREIMAGE2DEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLint, GLint, GLsizei, GLsizei, GLint, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLTEXTURESUBIMAGE1DEXTPROCVar = CPointerVarOf<PFNGLTEXTURESUBIMAGE1DEXTPROC>
typealias PFNGLTEXTURESUBIMAGE1DEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLint, GLint, GLsizei, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLTEXTURESUBIMAGE2DEXTPROCVar = CPointerVarOf<PFNGLTEXTURESUBIMAGE2DEXTPROC>
typealias PFNGLTEXTURESUBIMAGE2DEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLint, GLint, GLint, GLsizei, GLsizei, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLCOPYTEXTUREIMAGE1DEXTPROCVar = CPointerVarOf<PFNGLCOPYTEXTUREIMAGE1DEXTPROC>
typealias PFNGLCOPYTEXTUREIMAGE1DEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLint, GLenum, GLint, GLint, GLsizei, GLint) -> Unit>>

typealias PFNGLCOPYTEXTUREIMAGE2DEXTPROCVar = CPointerVarOf<PFNGLCOPYTEXTUREIMAGE2DEXTPROC>
typealias PFNGLCOPYTEXTUREIMAGE2DEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLint, GLenum, GLint, GLint, GLsizei, GLsizei, GLint) -> Unit>>

typealias PFNGLCOPYTEXTURESUBIMAGE1DEXTPROCVar = CPointerVarOf<PFNGLCOPYTEXTURESUBIMAGE1DEXTPROC>
typealias PFNGLCOPYTEXTURESUBIMAGE1DEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLint, GLint, GLint, GLint, GLsizei) -> Unit>>

typealias PFNGLCOPYTEXTURESUBIMAGE2DEXTPROCVar = CPointerVarOf<PFNGLCOPYTEXTURESUBIMAGE2DEXTPROC>
typealias PFNGLCOPYTEXTURESUBIMAGE2DEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLint, GLint, GLint, GLint, GLint, GLsizei, GLsizei) -> Unit>>

typealias PFNGLGETTEXTUREIMAGEEXTPROCVar = CPointerVarOf<PFNGLGETTEXTUREIMAGEEXTPROC>
typealias PFNGLGETTEXTUREIMAGEEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLint, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLGETTEXTUREPARAMETERFVEXTPROCVar = CPointerVarOf<PFNGLGETTEXTUREPARAMETERFVEXTPROC>
typealias PFNGLGETTEXTUREPARAMETERFVEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETTEXTUREPARAMETERIVEXTPROCVar = CPointerVarOf<PFNGLGETTEXTUREPARAMETERIVEXTPROC>
typealias PFNGLGETTEXTUREPARAMETERIVEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETTEXTURELEVELPARAMETERFVEXTPROCVar = CPointerVarOf<PFNGLGETTEXTURELEVELPARAMETERFVEXTPROC>
typealias PFNGLGETTEXTURELEVELPARAMETERFVEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLint, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETTEXTURELEVELPARAMETERIVEXTPROCVar = CPointerVarOf<PFNGLGETTEXTURELEVELPARAMETERIVEXTPROC>
typealias PFNGLGETTEXTURELEVELPARAMETERIVEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLTEXTUREIMAGE3DEXTPROCVar = CPointerVarOf<PFNGLTEXTUREIMAGE3DEXTPROC>
typealias PFNGLTEXTUREIMAGE3DEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLint, GLint, GLsizei, GLsizei, GLsizei, GLint, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLTEXTURESUBIMAGE3DEXTPROCVar = CPointerVarOf<PFNGLTEXTURESUBIMAGE3DEXTPROC>
typealias PFNGLTEXTURESUBIMAGE3DEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLCOPYTEXTURESUBIMAGE3DEXTPROCVar = CPointerVarOf<PFNGLCOPYTEXTURESUBIMAGE3DEXTPROC>
typealias PFNGLCOPYTEXTURESUBIMAGE3DEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLint, GLint, GLint, GLint, GLint, GLint, GLsizei, GLsizei) -> Unit>>

typealias PFNGLBINDMULTITEXTUREEXTPROCVar = CPointerVarOf<PFNGLBINDMULTITEXTUREEXTPROC>
typealias PFNGLBINDMULTITEXTUREEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLuint) -> Unit>>

typealias PFNGLMULTITEXCOORDPOINTEREXTPROCVar = CPointerVarOf<PFNGLMULTITEXCOORDPOINTEREXTPROC>
typealias PFNGLMULTITEXCOORDPOINTEREXTPROC = CPointer<CFunction<(GLenum, GLint, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLMULTITEXENVFEXTPROCVar = CPointerVarOf<PFNGLMULTITEXENVFEXTPROC>
typealias PFNGLMULTITEXENVFEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, GLfloat) -> Unit>>

typealias PFNGLMULTITEXENVFVEXTPROCVar = CPointerVarOf<PFNGLMULTITEXENVFVEXTPROC>
typealias PFNGLMULTITEXENVFVEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLMULTITEXENVIEXTPROCVar = CPointerVarOf<PFNGLMULTITEXENVIEXTPROC>
typealias PFNGLMULTITEXENVIEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, GLint) -> Unit>>

typealias PFNGLMULTITEXENVIVEXTPROCVar = CPointerVarOf<PFNGLMULTITEXENVIVEXTPROC>
typealias PFNGLMULTITEXENVIVEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLMULTITEXGENDEXTPROCVar = CPointerVarOf<PFNGLMULTITEXGENDEXTPROC>
typealias PFNGLMULTITEXGENDEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, GLdouble) -> Unit>>

typealias PFNGLMULTITEXGENDVEXTPROCVar = CPointerVarOf<PFNGLMULTITEXGENDVEXTPROC>
typealias PFNGLMULTITEXGENDVEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLMULTITEXGENFEXTPROCVar = CPointerVarOf<PFNGLMULTITEXGENFEXTPROC>
typealias PFNGLMULTITEXGENFEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, GLfloat) -> Unit>>

typealias PFNGLMULTITEXGENFVEXTPROCVar = CPointerVarOf<PFNGLMULTITEXGENFVEXTPROC>
typealias PFNGLMULTITEXGENFVEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLMULTITEXGENIEXTPROCVar = CPointerVarOf<PFNGLMULTITEXGENIEXTPROC>
typealias PFNGLMULTITEXGENIEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, GLint) -> Unit>>

typealias PFNGLMULTITEXGENIVEXTPROCVar = CPointerVarOf<PFNGLMULTITEXGENIVEXTPROC>
typealias PFNGLMULTITEXGENIVEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETMULTITEXENVFVEXTPROCVar = CPointerVarOf<PFNGLGETMULTITEXENVFVEXTPROC>
typealias PFNGLGETMULTITEXENVFVEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETMULTITEXENVIVEXTPROCVar = CPointerVarOf<PFNGLGETMULTITEXENVIVEXTPROC>
typealias PFNGLGETMULTITEXENVIVEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETMULTITEXGENDVEXTPROCVar = CPointerVarOf<PFNGLGETMULTITEXGENDVEXTPROC>
typealias PFNGLGETMULTITEXGENDVEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLGETMULTITEXGENFVEXTPROCVar = CPointerVarOf<PFNGLGETMULTITEXGENFVEXTPROC>
typealias PFNGLGETMULTITEXGENFVEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETMULTITEXGENIVEXTPROCVar = CPointerVarOf<PFNGLGETMULTITEXGENIVEXTPROC>
typealias PFNGLGETMULTITEXGENIVEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLMULTITEXPARAMETERIEXTPROCVar = CPointerVarOf<PFNGLMULTITEXPARAMETERIEXTPROC>
typealias PFNGLMULTITEXPARAMETERIEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, GLint) -> Unit>>

typealias PFNGLMULTITEXPARAMETERIVEXTPROCVar = CPointerVarOf<PFNGLMULTITEXPARAMETERIVEXTPROC>
typealias PFNGLMULTITEXPARAMETERIVEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLMULTITEXPARAMETERFEXTPROCVar = CPointerVarOf<PFNGLMULTITEXPARAMETERFEXTPROC>
typealias PFNGLMULTITEXPARAMETERFEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, GLfloat) -> Unit>>

typealias PFNGLMULTITEXPARAMETERFVEXTPROCVar = CPointerVarOf<PFNGLMULTITEXPARAMETERFVEXTPROC>
typealias PFNGLMULTITEXPARAMETERFVEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLMULTITEXIMAGE1DEXTPROCVar = CPointerVarOf<PFNGLMULTITEXIMAGE1DEXTPROC>
typealias PFNGLMULTITEXIMAGE1DEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLint, GLint, GLsizei, GLint, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLMULTITEXIMAGE2DEXTPROCVar = CPointerVarOf<PFNGLMULTITEXIMAGE2DEXTPROC>
typealias PFNGLMULTITEXIMAGE2DEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLint, GLint, GLsizei, GLsizei, GLint, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLMULTITEXSUBIMAGE1DEXTPROCVar = CPointerVarOf<PFNGLMULTITEXSUBIMAGE1DEXTPROC>
typealias PFNGLMULTITEXSUBIMAGE1DEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLint, GLint, GLsizei, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLMULTITEXSUBIMAGE2DEXTPROCVar = CPointerVarOf<PFNGLMULTITEXSUBIMAGE2DEXTPROC>
typealias PFNGLMULTITEXSUBIMAGE2DEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLint, GLint, GLint, GLsizei, GLsizei, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLCOPYMULTITEXIMAGE1DEXTPROCVar = CPointerVarOf<PFNGLCOPYMULTITEXIMAGE1DEXTPROC>
typealias PFNGLCOPYMULTITEXIMAGE1DEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLint, GLenum, GLint, GLint, GLsizei, GLint) -> Unit>>

typealias PFNGLCOPYMULTITEXIMAGE2DEXTPROCVar = CPointerVarOf<PFNGLCOPYMULTITEXIMAGE2DEXTPROC>
typealias PFNGLCOPYMULTITEXIMAGE2DEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLint, GLenum, GLint, GLint, GLsizei, GLsizei, GLint) -> Unit>>

typealias PFNGLCOPYMULTITEXSUBIMAGE1DEXTPROCVar = CPointerVarOf<PFNGLCOPYMULTITEXSUBIMAGE1DEXTPROC>
typealias PFNGLCOPYMULTITEXSUBIMAGE1DEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLint, GLint, GLint, GLint, GLsizei) -> Unit>>

typealias PFNGLCOPYMULTITEXSUBIMAGE2DEXTPROCVar = CPointerVarOf<PFNGLCOPYMULTITEXSUBIMAGE2DEXTPROC>
typealias PFNGLCOPYMULTITEXSUBIMAGE2DEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLint, GLint, GLint, GLint, GLint, GLsizei, GLsizei) -> Unit>>

typealias PFNGLGETMULTITEXIMAGEEXTPROCVar = CPointerVarOf<PFNGLGETMULTITEXIMAGEEXTPROC>
typealias PFNGLGETMULTITEXIMAGEEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLint, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLGETMULTITEXPARAMETERFVEXTPROCVar = CPointerVarOf<PFNGLGETMULTITEXPARAMETERFVEXTPROC>
typealias PFNGLGETMULTITEXPARAMETERFVEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETMULTITEXPARAMETERIVEXTPROCVar = CPointerVarOf<PFNGLGETMULTITEXPARAMETERIVEXTPROC>
typealias PFNGLGETMULTITEXPARAMETERIVEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETMULTITEXLEVELPARAMETERFVEXTPROCVar = CPointerVarOf<PFNGLGETMULTITEXLEVELPARAMETERFVEXTPROC>
typealias PFNGLGETMULTITEXLEVELPARAMETERFVEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLint, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETMULTITEXLEVELPARAMETERIVEXTPROCVar = CPointerVarOf<PFNGLGETMULTITEXLEVELPARAMETERIVEXTPROC>
typealias PFNGLGETMULTITEXLEVELPARAMETERIVEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLMULTITEXIMAGE3DEXTPROCVar = CPointerVarOf<PFNGLMULTITEXIMAGE3DEXTPROC>
typealias PFNGLMULTITEXIMAGE3DEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLint, GLint, GLsizei, GLsizei, GLsizei, GLint, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLMULTITEXSUBIMAGE3DEXTPROCVar = CPointerVarOf<PFNGLMULTITEXSUBIMAGE3DEXTPROC>
typealias PFNGLMULTITEXSUBIMAGE3DEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLCOPYMULTITEXSUBIMAGE3DEXTPROCVar = CPointerVarOf<PFNGLCOPYMULTITEXSUBIMAGE3DEXTPROC>
typealias PFNGLCOPYMULTITEXSUBIMAGE3DEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLint, GLint, GLint, GLint, GLint, GLint, GLsizei, GLsizei) -> Unit>>

typealias PFNGLENABLECLIENTSTATEINDEXEDEXTPROCVar = CPointerVarOf<PFNGLENABLECLIENTSTATEINDEXEDEXTPROC>
typealias PFNGLENABLECLIENTSTATEINDEXEDEXTPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLDISABLECLIENTSTATEINDEXEDEXTPROCVar = CPointerVarOf<PFNGLDISABLECLIENTSTATEINDEXEDEXTPROC>
typealias PFNGLDISABLECLIENTSTATEINDEXEDEXTPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLGETFLOATINDEXEDVEXTPROCVar = CPointerVarOf<PFNGLGETFLOATINDEXEDVEXTPROC>
typealias PFNGLGETFLOATINDEXEDVEXTPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETDOUBLEINDEXEDVEXTPROCVar = CPointerVarOf<PFNGLGETDOUBLEINDEXEDVEXTPROC>
typealias PFNGLGETDOUBLEINDEXEDVEXTPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLGETPOINTERINDEXEDVEXTPROCVar = CPointerVarOf<PFNGLGETPOINTERINDEXEDVEXTPROC>
typealias PFNGLGETPOINTERINDEXEDVEXTPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<COpaquePointerVar>?) -> Unit>>

typealias PFNGLENABLEINDEXEDEXTPROCVar = CPointerVarOf<PFNGLENABLEINDEXEDEXTPROC>
typealias PFNGLENABLEINDEXEDEXTPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLDISABLEINDEXEDEXTPROCVar = CPointerVarOf<PFNGLDISABLEINDEXEDEXTPROC>
typealias PFNGLDISABLEINDEXEDEXTPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLISENABLEDINDEXEDEXTPROCVar = CPointerVarOf<PFNGLISENABLEDINDEXEDEXTPROC>
typealias PFNGLISENABLEDINDEXEDEXTPROC = CPointer<CFunction<(GLenum, GLuint) -> GLboolean>>

typealias PFNGLGETINTEGERINDEXEDVEXTPROCVar = CPointerVarOf<PFNGLGETINTEGERINDEXEDVEXTPROC>
typealias PFNGLGETINTEGERINDEXEDVEXTPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETBOOLEANINDEXEDVEXTPROCVar = CPointerVarOf<PFNGLGETBOOLEANINDEXEDVEXTPROC>
typealias PFNGLGETBOOLEANINDEXEDVEXTPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<GLbooleanVar>?) -> Unit>>

typealias PFNGLCOMPRESSEDTEXTUREIMAGE3DEXTPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXTUREIMAGE3DEXTPROC>
typealias PFNGLCOMPRESSEDTEXTUREIMAGE3DEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLint, GLenum, GLsizei, GLsizei, GLsizei, GLint, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLCOMPRESSEDTEXTUREIMAGE2DEXTPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXTUREIMAGE2DEXTPROC>
typealias PFNGLCOMPRESSEDTEXTUREIMAGE2DEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLint, GLenum, GLsizei, GLsizei, GLint, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLCOMPRESSEDTEXTUREIMAGE1DEXTPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXTUREIMAGE1DEXTPROC>
typealias PFNGLCOMPRESSEDTEXTUREIMAGE1DEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLint, GLenum, GLsizei, GLint, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLCOMPRESSEDTEXTURESUBIMAGE3DEXTPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXTURESUBIMAGE3DEXTPROC>
typealias PFNGLCOMPRESSEDTEXTURESUBIMAGE3DEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLCOMPRESSEDTEXTURESUBIMAGE2DEXTPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXTURESUBIMAGE2DEXTPROC>
typealias PFNGLCOMPRESSEDTEXTURESUBIMAGE2DEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLint, GLint, GLint, GLsizei, GLsizei, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLCOMPRESSEDTEXTURESUBIMAGE1DEXTPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXTURESUBIMAGE1DEXTPROC>
typealias PFNGLCOMPRESSEDTEXTURESUBIMAGE1DEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLint, GLint, GLsizei, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLGETCOMPRESSEDTEXTUREIMAGEEXTPROCVar = CPointerVarOf<PFNGLGETCOMPRESSEDTEXTUREIMAGEEXTPROC>
typealias PFNGLGETCOMPRESSEDTEXTUREIMAGEEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLint, COpaquePointer?) -> Unit>>

typealias PFNGLCOMPRESSEDMULTITEXIMAGE3DEXTPROCVar = CPointerVarOf<PFNGLCOMPRESSEDMULTITEXIMAGE3DEXTPROC>
typealias PFNGLCOMPRESSEDMULTITEXIMAGE3DEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLint, GLenum, GLsizei, GLsizei, GLsizei, GLint, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLCOMPRESSEDMULTITEXIMAGE2DEXTPROCVar = CPointerVarOf<PFNGLCOMPRESSEDMULTITEXIMAGE2DEXTPROC>
typealias PFNGLCOMPRESSEDMULTITEXIMAGE2DEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLint, GLenum, GLsizei, GLsizei, GLint, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLCOMPRESSEDMULTITEXIMAGE1DEXTPROCVar = CPointerVarOf<PFNGLCOMPRESSEDMULTITEXIMAGE1DEXTPROC>
typealias PFNGLCOMPRESSEDMULTITEXIMAGE1DEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLint, GLenum, GLsizei, GLint, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLCOMPRESSEDMULTITEXSUBIMAGE3DEXTPROCVar = CPointerVarOf<PFNGLCOMPRESSEDMULTITEXSUBIMAGE3DEXTPROC>
typealias PFNGLCOMPRESSEDMULTITEXSUBIMAGE3DEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLCOMPRESSEDMULTITEXSUBIMAGE2DEXTPROCVar = CPointerVarOf<PFNGLCOMPRESSEDMULTITEXSUBIMAGE2DEXTPROC>
typealias PFNGLCOMPRESSEDMULTITEXSUBIMAGE2DEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLint, GLint, GLint, GLsizei, GLsizei, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLCOMPRESSEDMULTITEXSUBIMAGE1DEXTPROCVar = CPointerVarOf<PFNGLCOMPRESSEDMULTITEXSUBIMAGE1DEXTPROC>
typealias PFNGLCOMPRESSEDMULTITEXSUBIMAGE1DEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLint, GLint, GLsizei, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLGETCOMPRESSEDMULTITEXIMAGEEXTPROCVar = CPointerVarOf<PFNGLGETCOMPRESSEDMULTITEXIMAGEEXTPROC>
typealias PFNGLGETCOMPRESSEDMULTITEXIMAGEEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLint, COpaquePointer?) -> Unit>>

typealias PFNGLMATRIXLOADTRANSPOSEFEXTPROCVar = CPointerVarOf<PFNGLMATRIXLOADTRANSPOSEFEXTPROC>
typealias PFNGLMATRIXLOADTRANSPOSEFEXTPROC = CPointer<CFunction<(GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLMATRIXLOADTRANSPOSEDEXTPROCVar = CPointerVarOf<PFNGLMATRIXLOADTRANSPOSEDEXTPROC>
typealias PFNGLMATRIXLOADTRANSPOSEDEXTPROC = CPointer<CFunction<(GLenum, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLMATRIXMULTTRANSPOSEFEXTPROCVar = CPointerVarOf<PFNGLMATRIXMULTTRANSPOSEFEXTPROC>
typealias PFNGLMATRIXMULTTRANSPOSEFEXTPROC = CPointer<CFunction<(GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLMATRIXMULTTRANSPOSEDEXTPROCVar = CPointerVarOf<PFNGLMATRIXMULTTRANSPOSEDEXTPROC>
typealias PFNGLMATRIXMULTTRANSPOSEDEXTPROC = CPointer<CFunction<(GLenum, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLNAMEDBUFFERDATAEXTPROCVar = CPointerVarOf<PFNGLNAMEDBUFFERDATAEXTPROC>
typealias PFNGLNAMEDBUFFERDATAEXTPROC = CPointer<CFunction<(GLuint, GLsizeiptr, COpaquePointer?, GLenum) -> Unit>>

typealias PFNGLNAMEDBUFFERSUBDATAEXTPROCVar = CPointerVarOf<PFNGLNAMEDBUFFERSUBDATAEXTPROC>
typealias PFNGLNAMEDBUFFERSUBDATAEXTPROC = CPointer<CFunction<(GLuint, GLintptr, GLsizeiptr, COpaquePointer?) -> Unit>>

typealias PFNGLMAPNAMEDBUFFEREXTPROCVar = CPointerVarOf<PFNGLMAPNAMEDBUFFEREXTPROC>
typealias PFNGLMAPNAMEDBUFFEREXTPROC = CPointer<CFunction<(GLuint, GLenum) -> COpaquePointer?>>

typealias PFNGLUNMAPNAMEDBUFFEREXTPROCVar = CPointerVarOf<PFNGLUNMAPNAMEDBUFFEREXTPROC>
typealias PFNGLUNMAPNAMEDBUFFEREXTPROC = CPointer<CFunction<(GLuint) -> GLboolean>>

typealias PFNGLGETNAMEDBUFFERPARAMETERIVEXTPROCVar = CPointerVarOf<PFNGLGETNAMEDBUFFERPARAMETERIVEXTPROC>
typealias PFNGLGETNAMEDBUFFERPARAMETERIVEXTPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETNAMEDBUFFERPOINTERVEXTPROCVar = CPointerVarOf<PFNGLGETNAMEDBUFFERPOINTERVEXTPROC>
typealias PFNGLGETNAMEDBUFFERPOINTERVEXTPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<COpaquePointerVar>?) -> Unit>>

typealias PFNGLGETNAMEDBUFFERSUBDATAEXTPROCVar = CPointerVarOf<PFNGLGETNAMEDBUFFERSUBDATAEXTPROC>
typealias PFNGLGETNAMEDBUFFERSUBDATAEXTPROC = CPointer<CFunction<(GLuint, GLintptr, GLsizeiptr, COpaquePointer?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM1FEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1FEXTPROC>
typealias PFNGLPROGRAMUNIFORM1FEXTPROC = CPointer<CFunction<(GLuint, GLint, GLfloat) -> Unit>>

typealias PFNGLPROGRAMUNIFORM2FEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2FEXTPROC>
typealias PFNGLPROGRAMUNIFORM2FEXTPROC = CPointer<CFunction<(GLuint, GLint, GLfloat, GLfloat) -> Unit>>

typealias PFNGLPROGRAMUNIFORM3FEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3FEXTPROC>
typealias PFNGLPROGRAMUNIFORM3FEXTPROC = CPointer<CFunction<(GLuint, GLint, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLPROGRAMUNIFORM4FEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4FEXTPROC>
typealias PFNGLPROGRAMUNIFORM4FEXTPROC = CPointer<CFunction<(GLuint, GLint, GLfloat, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLPROGRAMUNIFORM1IEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1IEXTPROC>
typealias PFNGLPROGRAMUNIFORM1IEXTPROC = CPointer<CFunction<(GLuint, GLint, GLint) -> Unit>>

typealias PFNGLPROGRAMUNIFORM2IEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2IEXTPROC>
typealias PFNGLPROGRAMUNIFORM2IEXTPROC = CPointer<CFunction<(GLuint, GLint, GLint, GLint) -> Unit>>

typealias PFNGLPROGRAMUNIFORM3IEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3IEXTPROC>
typealias PFNGLPROGRAMUNIFORM3IEXTPROC = CPointer<CFunction<(GLuint, GLint, GLint, GLint, GLint) -> Unit>>

typealias PFNGLPROGRAMUNIFORM4IEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4IEXTPROC>
typealias PFNGLPROGRAMUNIFORM4IEXTPROC = CPointer<CFunction<(GLuint, GLint, GLint, GLint, GLint, GLint) -> Unit>>

typealias PFNGLPROGRAMUNIFORM1FVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1FVEXTPROC>
typealias PFNGLPROGRAMUNIFORM1FVEXTPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM2FVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2FVEXTPROC>
typealias PFNGLPROGRAMUNIFORM2FVEXTPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM3FVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3FVEXTPROC>
typealias PFNGLPROGRAMUNIFORM3FVEXTPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM4FVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4FVEXTPROC>
typealias PFNGLPROGRAMUNIFORM4FVEXTPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM1IVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1IVEXTPROC>
typealias PFNGLPROGRAMUNIFORM1IVEXTPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM2IVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2IVEXTPROC>
typealias PFNGLPROGRAMUNIFORM2IVEXTPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM3IVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3IVEXTPROC>
typealias PFNGLPROGRAMUNIFORM3IVEXTPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM4IVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4IVEXTPROC>
typealias PFNGLPROGRAMUNIFORM4IVEXTPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX2FVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX2FVEXTPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX2FVEXTPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX3FVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX3FVEXTPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX3FVEXTPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX4FVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX4FVEXTPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX4FVEXTPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX2X3FVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX2X3FVEXTPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX2X3FVEXTPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX3X2FVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX3X2FVEXTPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX3X2FVEXTPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX2X4FVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX2X4FVEXTPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX2X4FVEXTPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX4X2FVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX4X2FVEXTPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX4X2FVEXTPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX3X4FVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX3X4FVEXTPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX3X4FVEXTPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX4X3FVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX4X3FVEXTPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX4X3FVEXTPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLTEXTUREBUFFEREXTPROCVar = CPointerVarOf<PFNGLTEXTUREBUFFEREXTPROC>
typealias PFNGLTEXTUREBUFFEREXTPROC = CPointer<CFunction<(GLuint, GLenum, GLenum, GLuint) -> Unit>>

typealias PFNGLMULTITEXBUFFEREXTPROCVar = CPointerVarOf<PFNGLMULTITEXBUFFEREXTPROC>
typealias PFNGLMULTITEXBUFFEREXTPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, GLuint) -> Unit>>

typealias PFNGLTEXTUREPARAMETERIIVEXTPROCVar = CPointerVarOf<PFNGLTEXTUREPARAMETERIIVEXTPROC>
typealias PFNGLTEXTUREPARAMETERIIVEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLTEXTUREPARAMETERIUIVEXTPROCVar = CPointerVarOf<PFNGLTEXTUREPARAMETERIUIVEXTPROC>
typealias PFNGLTEXTUREPARAMETERIUIVEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLenum, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGETTEXTUREPARAMETERIIVEXTPROCVar = CPointerVarOf<PFNGLGETTEXTUREPARAMETERIIVEXTPROC>
typealias PFNGLGETTEXTUREPARAMETERIIVEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETTEXTUREPARAMETERIUIVEXTPROCVar = CPointerVarOf<PFNGLGETTEXTUREPARAMETERIUIVEXTPROC>
typealias PFNGLGETTEXTUREPARAMETERIUIVEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLenum, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLMULTITEXPARAMETERIIVEXTPROCVar = CPointerVarOf<PFNGLMULTITEXPARAMETERIIVEXTPROC>
typealias PFNGLMULTITEXPARAMETERIIVEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLMULTITEXPARAMETERIUIVEXTPROCVar = CPointerVarOf<PFNGLMULTITEXPARAMETERIUIVEXTPROC>
typealias PFNGLMULTITEXPARAMETERIUIVEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGETMULTITEXPARAMETERIIVEXTPROCVar = CPointerVarOf<PFNGLGETMULTITEXPARAMETERIIVEXTPROC>
typealias PFNGLGETMULTITEXPARAMETERIIVEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETMULTITEXPARAMETERIUIVEXTPROCVar = CPointerVarOf<PFNGLGETMULTITEXPARAMETERIUIVEXTPROC>
typealias PFNGLGETMULTITEXPARAMETERIUIVEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM1UIEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1UIEXTPROC>
typealias PFNGLPROGRAMUNIFORM1UIEXTPROC = CPointer<CFunction<(GLuint, GLint, GLuint) -> Unit>>

typealias PFNGLPROGRAMUNIFORM2UIEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2UIEXTPROC>
typealias PFNGLPROGRAMUNIFORM2UIEXTPROC = CPointer<CFunction<(GLuint, GLint, GLuint, GLuint) -> Unit>>

typealias PFNGLPROGRAMUNIFORM3UIEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3UIEXTPROC>
typealias PFNGLPROGRAMUNIFORM3UIEXTPROC = CPointer<CFunction<(GLuint, GLint, GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLPROGRAMUNIFORM4UIEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4UIEXTPROC>
typealias PFNGLPROGRAMUNIFORM4UIEXTPROC = CPointer<CFunction<(GLuint, GLint, GLuint, GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLPROGRAMUNIFORM1UIVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1UIVEXTPROC>
typealias PFNGLPROGRAMUNIFORM1UIVEXTPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM2UIVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2UIVEXTPROC>
typealias PFNGLPROGRAMUNIFORM2UIVEXTPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM3UIVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3UIVEXTPROC>
typealias PFNGLPROGRAMUNIFORM3UIVEXTPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM4UIVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4UIVEXTPROC>
typealias PFNGLPROGRAMUNIFORM4UIVEXTPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLNAMEDPROGRAMLOCALPARAMETERS4FVEXTPROCVar = CPointerVarOf<PFNGLNAMEDPROGRAMLOCALPARAMETERS4FVEXTPROC>
typealias PFNGLNAMEDPROGRAMLOCALPARAMETERS4FVEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLuint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLNAMEDPROGRAMLOCALPARAMETERI4IEXTPROCVar = CPointerVarOf<PFNGLNAMEDPROGRAMLOCALPARAMETERI4IEXTPROC>
typealias PFNGLNAMEDPROGRAMLOCALPARAMETERI4IEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLuint, GLint, GLint, GLint, GLint) -> Unit>>

typealias PFNGLNAMEDPROGRAMLOCALPARAMETERI4IVEXTPROCVar = CPointerVarOf<PFNGLNAMEDPROGRAMLOCALPARAMETERI4IVEXTPROC>
typealias PFNGLNAMEDPROGRAMLOCALPARAMETERI4IVEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLuint, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLNAMEDPROGRAMLOCALPARAMETERSI4IVEXTPROCVar = CPointerVarOf<PFNGLNAMEDPROGRAMLOCALPARAMETERSI4IVEXTPROC>
typealias PFNGLNAMEDPROGRAMLOCALPARAMETERSI4IVEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLuint, GLsizei, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLNAMEDPROGRAMLOCALPARAMETERI4UIEXTPROCVar = CPointerVarOf<PFNGLNAMEDPROGRAMLOCALPARAMETERI4UIEXTPROC>
typealias PFNGLNAMEDPROGRAMLOCALPARAMETERI4UIEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLuint, GLuint, GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLNAMEDPROGRAMLOCALPARAMETERI4UIVEXTPROCVar = CPointerVarOf<PFNGLNAMEDPROGRAMLOCALPARAMETERI4UIVEXTPROC>
typealias PFNGLNAMEDPROGRAMLOCALPARAMETERI4UIVEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLuint, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLNAMEDPROGRAMLOCALPARAMETERSI4UIVEXTPROCVar = CPointerVarOf<PFNGLNAMEDPROGRAMLOCALPARAMETERSI4UIVEXTPROC>
typealias PFNGLNAMEDPROGRAMLOCALPARAMETERSI4UIVEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLuint, GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGETNAMEDPROGRAMLOCALPARAMETERIIVEXTPROCVar = CPointerVarOf<PFNGLGETNAMEDPROGRAMLOCALPARAMETERIIVEXTPROC>
typealias PFNGLGETNAMEDPROGRAMLOCALPARAMETERIIVEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLuint, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETNAMEDPROGRAMLOCALPARAMETERIUIVEXTPROCVar = CPointerVarOf<PFNGLGETNAMEDPROGRAMLOCALPARAMETERIUIVEXTPROC>
typealias PFNGLGETNAMEDPROGRAMLOCALPARAMETERIUIVEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLuint, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLENABLECLIENTSTATEIEXTPROCVar = CPointerVarOf<PFNGLENABLECLIENTSTATEIEXTPROC>
typealias PFNGLENABLECLIENTSTATEIEXTPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLDISABLECLIENTSTATEIEXTPROCVar = CPointerVarOf<PFNGLDISABLECLIENTSTATEIEXTPROC>
typealias PFNGLDISABLECLIENTSTATEIEXTPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLGETFLOATI_VEXTPROCVar = CPointerVarOf<PFNGLGETFLOATI_VEXTPROC>
typealias PFNGLGETFLOATI_VEXTPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETDOUBLEI_VEXTPROCVar = CPointerVarOf<PFNGLGETDOUBLEI_VEXTPROC>
typealias PFNGLGETDOUBLEI_VEXTPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLGETPOINTERI_VEXTPROCVar = CPointerVarOf<PFNGLGETPOINTERI_VEXTPROC>
typealias PFNGLGETPOINTERI_VEXTPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<COpaquePointerVar>?) -> Unit>>

typealias PFNGLNAMEDPROGRAMSTRINGEXTPROCVar = CPointerVarOf<PFNGLNAMEDPROGRAMSTRINGEXTPROC>
typealias PFNGLNAMEDPROGRAMSTRINGEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLNAMEDPROGRAMLOCALPARAMETER4DEXTPROCVar = CPointerVarOf<PFNGLNAMEDPROGRAMLOCALPARAMETER4DEXTPROC>
typealias PFNGLNAMEDPROGRAMLOCALPARAMETER4DEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLuint, GLdouble, GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLNAMEDPROGRAMLOCALPARAMETER4DVEXTPROCVar = CPointerVarOf<PFNGLNAMEDPROGRAMLOCALPARAMETER4DVEXTPROC>
typealias PFNGLNAMEDPROGRAMLOCALPARAMETER4DVEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLuint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLNAMEDPROGRAMLOCALPARAMETER4FEXTPROCVar = CPointerVarOf<PFNGLNAMEDPROGRAMLOCALPARAMETER4FEXTPROC>
typealias PFNGLNAMEDPROGRAMLOCALPARAMETER4FEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLuint, GLfloat, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLNAMEDPROGRAMLOCALPARAMETER4FVEXTPROCVar = CPointerVarOf<PFNGLNAMEDPROGRAMLOCALPARAMETER4FVEXTPROC>
typealias PFNGLNAMEDPROGRAMLOCALPARAMETER4FVEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLuint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETNAMEDPROGRAMLOCALPARAMETERDVEXTPROCVar = CPointerVarOf<PFNGLGETNAMEDPROGRAMLOCALPARAMETERDVEXTPROC>
typealias PFNGLGETNAMEDPROGRAMLOCALPARAMETERDVEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLuint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLGETNAMEDPROGRAMLOCALPARAMETERFVEXTPROCVar = CPointerVarOf<PFNGLGETNAMEDPROGRAMLOCALPARAMETERFVEXTPROC>
typealias PFNGLGETNAMEDPROGRAMLOCALPARAMETERFVEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLuint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETNAMEDPROGRAMIVEXTPROCVar = CPointerVarOf<PFNGLGETNAMEDPROGRAMIVEXTPROC>
typealias PFNGLGETNAMEDPROGRAMIVEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETNAMEDPROGRAMSTRINGEXTPROCVar = CPointerVarOf<PFNGLGETNAMEDPROGRAMSTRINGEXTPROC>
typealias PFNGLGETNAMEDPROGRAMSTRINGEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLNAMEDRENDERBUFFERSTORAGEEXTPROCVar = CPointerVarOf<PFNGLNAMEDRENDERBUFFERSTORAGEEXTPROC>
typealias PFNGLNAMEDRENDERBUFFERSTORAGEEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLsizei, GLsizei) -> Unit>>

typealias PFNGLGETNAMEDRENDERBUFFERPARAMETERIVEXTPROCVar = CPointerVarOf<PFNGLGETNAMEDRENDERBUFFERPARAMETERIVEXTPROC>
typealias PFNGLGETNAMEDRENDERBUFFERPARAMETERIVEXTPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLNAMEDRENDERBUFFERSTORAGEMULTISAMPLEEXTPROCVar = CPointerVarOf<PFNGLNAMEDRENDERBUFFERSTORAGEMULTISAMPLEEXTPROC>
typealias PFNGLNAMEDRENDERBUFFERSTORAGEMULTISAMPLEEXTPROC = CPointer<CFunction<(GLuint, GLsizei, GLenum, GLsizei, GLsizei) -> Unit>>

typealias PFNGLNAMEDRENDERBUFFERSTORAGEMULTISAMPLECOVERAGEEXTPROCVar = CPointerVarOf<PFNGLNAMEDRENDERBUFFERSTORAGEMULTISAMPLECOVERAGEEXTPROC>
typealias PFNGLNAMEDRENDERBUFFERSTORAGEMULTISAMPLECOVERAGEEXTPROC = CPointer<CFunction<(GLuint, GLsizei, GLsizei, GLenum, GLsizei, GLsizei) -> Unit>>

typealias PFNGLCHECKNAMEDFRAMEBUFFERSTATUSEXTPROCVar = CPointerVarOf<PFNGLCHECKNAMEDFRAMEBUFFERSTATUSEXTPROC>
typealias PFNGLCHECKNAMEDFRAMEBUFFERSTATUSEXTPROC = CPointer<CFunction<(GLuint, GLenum) -> GLenum>>

typealias PFNGLNAMEDFRAMEBUFFERTEXTURE1DEXTPROCVar = CPointerVarOf<PFNGLNAMEDFRAMEBUFFERTEXTURE1DEXTPROC>
typealias PFNGLNAMEDFRAMEBUFFERTEXTURE1DEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLenum, GLuint, GLint) -> Unit>>

typealias PFNGLNAMEDFRAMEBUFFERTEXTURE2DEXTPROCVar = CPointerVarOf<PFNGLNAMEDFRAMEBUFFERTEXTURE2DEXTPROC>
typealias PFNGLNAMEDFRAMEBUFFERTEXTURE2DEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLenum, GLuint, GLint) -> Unit>>

typealias PFNGLNAMEDFRAMEBUFFERTEXTURE3DEXTPROCVar = CPointerVarOf<PFNGLNAMEDFRAMEBUFFERTEXTURE3DEXTPROC>
typealias PFNGLNAMEDFRAMEBUFFERTEXTURE3DEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLenum, GLuint, GLint, GLint) -> Unit>>

typealias PFNGLNAMEDFRAMEBUFFERRENDERBUFFEREXTPROCVar = CPointerVarOf<PFNGLNAMEDFRAMEBUFFERRENDERBUFFEREXTPROC>
typealias PFNGLNAMEDFRAMEBUFFERRENDERBUFFEREXTPROC = CPointer<CFunction<(GLuint, GLenum, GLenum, GLuint) -> Unit>>

typealias PFNGLGETNAMEDFRAMEBUFFERATTACHMENTPARAMETERIVEXTPROCVar = CPointerVarOf<PFNGLGETNAMEDFRAMEBUFFERATTACHMENTPARAMETERIVEXTPROC>
typealias PFNGLGETNAMEDFRAMEBUFFERATTACHMENTPARAMETERIVEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGENERATETEXTUREMIPMAPEXTPROCVar = CPointerVarOf<PFNGLGENERATETEXTUREMIPMAPEXTPROC>
typealias PFNGLGENERATETEXTUREMIPMAPEXTPROC = CPointer<CFunction<(GLuint, GLenum) -> Unit>>

typealias PFNGLGENERATEMULTITEXMIPMAPEXTPROCVar = CPointerVarOf<PFNGLGENERATEMULTITEXMIPMAPEXTPROC>
typealias PFNGLGENERATEMULTITEXMIPMAPEXTPROC = CPointer<CFunction<(GLenum, GLenum) -> Unit>>

typealias PFNGLFRAMEBUFFERDRAWBUFFEREXTPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERDRAWBUFFEREXTPROC>
typealias PFNGLFRAMEBUFFERDRAWBUFFEREXTPROC = CPointer<CFunction<(GLuint, GLenum) -> Unit>>

typealias PFNGLFRAMEBUFFERDRAWBUFFERSEXTPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERDRAWBUFFERSEXTPROC>
typealias PFNGLFRAMEBUFFERDRAWBUFFERSEXTPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLenumVar>?) -> Unit>>

typealias PFNGLFRAMEBUFFERREADBUFFEREXTPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERREADBUFFEREXTPROC>
typealias PFNGLFRAMEBUFFERREADBUFFEREXTPROC = CPointer<CFunction<(GLuint, GLenum) -> Unit>>

typealias PFNGLGETFRAMEBUFFERPARAMETERIVEXTPROCVar = CPointerVarOf<PFNGLGETFRAMEBUFFERPARAMETERIVEXTPROC>
typealias PFNGLGETFRAMEBUFFERPARAMETERIVEXTPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLNAMEDCOPYBUFFERSUBDATAEXTPROCVar = CPointerVarOf<PFNGLNAMEDCOPYBUFFERSUBDATAEXTPROC>
typealias PFNGLNAMEDCOPYBUFFERSUBDATAEXTPROC = CPointer<CFunction<(GLuint, GLuint, GLintptr, GLintptr, GLsizeiptr) -> Unit>>

typealias PFNGLNAMEDFRAMEBUFFERTEXTUREEXTPROCVar = CPointerVarOf<PFNGLNAMEDFRAMEBUFFERTEXTUREEXTPROC>
typealias PFNGLNAMEDFRAMEBUFFERTEXTUREEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLuint, GLint) -> Unit>>

typealias PFNGLNAMEDFRAMEBUFFERTEXTURELAYEREXTPROCVar = CPointerVarOf<PFNGLNAMEDFRAMEBUFFERTEXTURELAYEREXTPROC>
typealias PFNGLNAMEDFRAMEBUFFERTEXTURELAYEREXTPROC = CPointer<CFunction<(GLuint, GLenum, GLuint, GLint, GLint) -> Unit>>

typealias PFNGLNAMEDFRAMEBUFFERTEXTUREFACEEXTPROCVar = CPointerVarOf<PFNGLNAMEDFRAMEBUFFERTEXTUREFACEEXTPROC>
typealias PFNGLNAMEDFRAMEBUFFERTEXTUREFACEEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLuint, GLint, GLenum) -> Unit>>

typealias PFNGLTEXTURERENDERBUFFEREXTPROCVar = CPointerVarOf<PFNGLTEXTURERENDERBUFFEREXTPROC>
typealias PFNGLTEXTURERENDERBUFFEREXTPROC = CPointer<CFunction<(GLuint, GLenum, GLuint) -> Unit>>

typealias PFNGLMULTITEXRENDERBUFFEREXTPROCVar = CPointerVarOf<PFNGLMULTITEXRENDERBUFFEREXTPROC>
typealias PFNGLMULTITEXRENDERBUFFEREXTPROC = CPointer<CFunction<(GLenum, GLenum, GLuint) -> Unit>>

typealias PFNGLVERTEXARRAYVERTEXOFFSETEXTPROCVar = CPointerVarOf<PFNGLVERTEXARRAYVERTEXOFFSETEXTPROC>
typealias PFNGLVERTEXARRAYVERTEXOFFSETEXTPROC = CPointer<CFunction<(GLuint, GLuint, GLint, GLenum, GLsizei, GLintptr) -> Unit>>

typealias PFNGLVERTEXARRAYCOLOROFFSETEXTPROCVar = CPointerVarOf<PFNGLVERTEXARRAYCOLOROFFSETEXTPROC>
typealias PFNGLVERTEXARRAYCOLOROFFSETEXTPROC = CPointer<CFunction<(GLuint, GLuint, GLint, GLenum, GLsizei, GLintptr) -> Unit>>

typealias PFNGLVERTEXARRAYEDGEFLAGOFFSETEXTPROCVar = CPointerVarOf<PFNGLVERTEXARRAYEDGEFLAGOFFSETEXTPROC>
typealias PFNGLVERTEXARRAYEDGEFLAGOFFSETEXTPROC = CPointer<CFunction<(GLuint, GLuint, GLsizei, GLintptr) -> Unit>>

typealias PFNGLVERTEXARRAYINDEXOFFSETEXTPROCVar = CPointerVarOf<PFNGLVERTEXARRAYINDEXOFFSETEXTPROC>
typealias PFNGLVERTEXARRAYINDEXOFFSETEXTPROC = CPointer<CFunction<(GLuint, GLuint, GLenum, GLsizei, GLintptr) -> Unit>>

typealias PFNGLVERTEXARRAYNORMALOFFSETEXTPROCVar = CPointerVarOf<PFNGLVERTEXARRAYNORMALOFFSETEXTPROC>
typealias PFNGLVERTEXARRAYNORMALOFFSETEXTPROC = CPointer<CFunction<(GLuint, GLuint, GLenum, GLsizei, GLintptr) -> Unit>>

typealias PFNGLVERTEXARRAYTEXCOORDOFFSETEXTPROCVar = CPointerVarOf<PFNGLVERTEXARRAYTEXCOORDOFFSETEXTPROC>
typealias PFNGLVERTEXARRAYTEXCOORDOFFSETEXTPROC = CPointer<CFunction<(GLuint, GLuint, GLint, GLenum, GLsizei, GLintptr) -> Unit>>

typealias PFNGLVERTEXARRAYMULTITEXCOORDOFFSETEXTPROCVar = CPointerVarOf<PFNGLVERTEXARRAYMULTITEXCOORDOFFSETEXTPROC>
typealias PFNGLVERTEXARRAYMULTITEXCOORDOFFSETEXTPROC = CPointer<CFunction<(GLuint, GLuint, GLenum, GLint, GLenum, GLsizei, GLintptr) -> Unit>>

typealias PFNGLVERTEXARRAYFOGCOORDOFFSETEXTPROCVar = CPointerVarOf<PFNGLVERTEXARRAYFOGCOORDOFFSETEXTPROC>
typealias PFNGLVERTEXARRAYFOGCOORDOFFSETEXTPROC = CPointer<CFunction<(GLuint, GLuint, GLenum, GLsizei, GLintptr) -> Unit>>

typealias PFNGLVERTEXARRAYSECONDARYCOLOROFFSETEXTPROCVar = CPointerVarOf<PFNGLVERTEXARRAYSECONDARYCOLOROFFSETEXTPROC>
typealias PFNGLVERTEXARRAYSECONDARYCOLOROFFSETEXTPROC = CPointer<CFunction<(GLuint, GLuint, GLint, GLenum, GLsizei, GLintptr) -> Unit>>

typealias PFNGLVERTEXARRAYVERTEXATTRIBOFFSETEXTPROCVar = CPointerVarOf<PFNGLVERTEXARRAYVERTEXATTRIBOFFSETEXTPROC>
typealias PFNGLVERTEXARRAYVERTEXATTRIBOFFSETEXTPROC = CPointer<CFunction<(GLuint, GLuint, GLuint, GLint, GLenum, GLboolean, GLsizei, GLintptr) -> Unit>>

typealias PFNGLVERTEXARRAYVERTEXATTRIBIOFFSETEXTPROCVar = CPointerVarOf<PFNGLVERTEXARRAYVERTEXATTRIBIOFFSETEXTPROC>
typealias PFNGLVERTEXARRAYVERTEXATTRIBIOFFSETEXTPROC = CPointer<CFunction<(GLuint, GLuint, GLuint, GLint, GLenum, GLsizei, GLintptr) -> Unit>>

typealias PFNGLENABLEVERTEXARRAYEXTPROCVar = CPointerVarOf<PFNGLENABLEVERTEXARRAYEXTPROC>
typealias PFNGLENABLEVERTEXARRAYEXTPROC = CPointer<CFunction<(GLuint, GLenum) -> Unit>>

typealias PFNGLDISABLEVERTEXARRAYEXTPROCVar = CPointerVarOf<PFNGLDISABLEVERTEXARRAYEXTPROC>
typealias PFNGLDISABLEVERTEXARRAYEXTPROC = CPointer<CFunction<(GLuint, GLenum) -> Unit>>

typealias PFNGLENABLEVERTEXARRAYATTRIBEXTPROCVar = CPointerVarOf<PFNGLENABLEVERTEXARRAYATTRIBEXTPROC>
typealias PFNGLENABLEVERTEXARRAYATTRIBEXTPROC = CPointer<CFunction<(GLuint, GLuint) -> Unit>>

typealias PFNGLDISABLEVERTEXARRAYATTRIBEXTPROCVar = CPointerVarOf<PFNGLDISABLEVERTEXARRAYATTRIBEXTPROC>
typealias PFNGLDISABLEVERTEXARRAYATTRIBEXTPROC = CPointer<CFunction<(GLuint, GLuint) -> Unit>>

typealias PFNGLGETVERTEXARRAYINTEGERVEXTPROCVar = CPointerVarOf<PFNGLGETVERTEXARRAYINTEGERVEXTPROC>
typealias PFNGLGETVERTEXARRAYINTEGERVEXTPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETVERTEXARRAYPOINTERVEXTPROCVar = CPointerVarOf<PFNGLGETVERTEXARRAYPOINTERVEXTPROC>
typealias PFNGLGETVERTEXARRAYPOINTERVEXTPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<COpaquePointerVar>?) -> Unit>>

typealias PFNGLGETVERTEXARRAYINTEGERI_VEXTPROCVar = CPointerVarOf<PFNGLGETVERTEXARRAYINTEGERI_VEXTPROC>
typealias PFNGLGETVERTEXARRAYINTEGERI_VEXTPROC = CPointer<CFunction<(GLuint, GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETVERTEXARRAYPOINTERI_VEXTPROCVar = CPointerVarOf<PFNGLGETVERTEXARRAYPOINTERI_VEXTPROC>
typealias PFNGLGETVERTEXARRAYPOINTERI_VEXTPROC = CPointer<CFunction<(GLuint, GLuint, GLenum, CPointer<COpaquePointerVar>?) -> Unit>>

typealias PFNGLMAPNAMEDBUFFERRANGEEXTPROCVar = CPointerVarOf<PFNGLMAPNAMEDBUFFERRANGEEXTPROC>
typealias PFNGLMAPNAMEDBUFFERRANGEEXTPROC = CPointer<CFunction<(GLuint, GLintptr, GLsizeiptr, GLbitfield) -> COpaquePointer?>>

typealias PFNGLFLUSHMAPPEDNAMEDBUFFERRANGEEXTPROCVar = CPointerVarOf<PFNGLFLUSHMAPPEDNAMEDBUFFERRANGEEXTPROC>
typealias PFNGLFLUSHMAPPEDNAMEDBUFFERRANGEEXTPROC = CPointer<CFunction<(GLuint, GLintptr, GLsizeiptr) -> Unit>>

typealias PFNGLNAMEDBUFFERSTORAGEEXTPROCVar = CPointerVarOf<PFNGLNAMEDBUFFERSTORAGEEXTPROC>
typealias PFNGLNAMEDBUFFERSTORAGEEXTPROC = CPointer<CFunction<(GLuint, GLsizeiptr, COpaquePointer?, GLbitfield) -> Unit>>

typealias PFNGLCLEARNAMEDBUFFERDATAEXTPROCVar = CPointerVarOf<PFNGLCLEARNAMEDBUFFERDATAEXTPROC>
typealias PFNGLCLEARNAMEDBUFFERDATAEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLCLEARNAMEDBUFFERSUBDATAEXTPROCVar = CPointerVarOf<PFNGLCLEARNAMEDBUFFERSUBDATAEXTPROC>
typealias PFNGLCLEARNAMEDBUFFERSUBDATAEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLsizeiptr, GLsizeiptr, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLNAMEDFRAMEBUFFERPARAMETERIEXTPROCVar = CPointerVarOf<PFNGLNAMEDFRAMEBUFFERPARAMETERIEXTPROC>
typealias PFNGLNAMEDFRAMEBUFFERPARAMETERIEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLint) -> Unit>>

typealias PFNGLGETNAMEDFRAMEBUFFERPARAMETERIVEXTPROCVar = CPointerVarOf<PFNGLGETNAMEDFRAMEBUFFERPARAMETERIVEXTPROC>
typealias PFNGLGETNAMEDFRAMEBUFFERPARAMETERIVEXTPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM1DEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1DEXTPROC>
typealias PFNGLPROGRAMUNIFORM1DEXTPROC = CPointer<CFunction<(GLuint, GLint, GLdouble) -> Unit>>

typealias PFNGLPROGRAMUNIFORM2DEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2DEXTPROC>
typealias PFNGLPROGRAMUNIFORM2DEXTPROC = CPointer<CFunction<(GLuint, GLint, GLdouble, GLdouble) -> Unit>>

typealias PFNGLPROGRAMUNIFORM3DEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3DEXTPROC>
typealias PFNGLPROGRAMUNIFORM3DEXTPROC = CPointer<CFunction<(GLuint, GLint, GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLPROGRAMUNIFORM4DEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4DEXTPROC>
typealias PFNGLPROGRAMUNIFORM4DEXTPROC = CPointer<CFunction<(GLuint, GLint, GLdouble, GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLPROGRAMUNIFORM1DVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1DVEXTPROC>
typealias PFNGLPROGRAMUNIFORM1DVEXTPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM2DVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2DVEXTPROC>
typealias PFNGLPROGRAMUNIFORM2DVEXTPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM3DVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3DVEXTPROC>
typealias PFNGLPROGRAMUNIFORM3DVEXTPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM4DVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4DVEXTPROC>
typealias PFNGLPROGRAMUNIFORM4DVEXTPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX2DVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX2DVEXTPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX2DVEXTPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX3DVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX3DVEXTPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX3DVEXTPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX4DVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX4DVEXTPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX4DVEXTPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX2X3DVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX2X3DVEXTPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX2X3DVEXTPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX2X4DVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX2X4DVEXTPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX2X4DVEXTPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX3X2DVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX3X2DVEXTPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX3X2DVEXTPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX3X4DVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX3X4DVEXTPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX3X4DVEXTPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX4X2DVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX4X2DVEXTPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX4X2DVEXTPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX4X3DVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX4X3DVEXTPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX4X3DVEXTPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLTEXTUREBUFFERRANGEEXTPROCVar = CPointerVarOf<PFNGLTEXTUREBUFFERRANGEEXTPROC>
typealias PFNGLTEXTUREBUFFERRANGEEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLenum, GLuint, GLintptr, GLsizeiptr) -> Unit>>

typealias PFNGLTEXTURESTORAGE1DEXTPROCVar = CPointerVarOf<PFNGLTEXTURESTORAGE1DEXTPROC>
typealias PFNGLTEXTURESTORAGE1DEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLsizei, GLenum, GLsizei) -> Unit>>

typealias PFNGLTEXTURESTORAGE2DEXTPROCVar = CPointerVarOf<PFNGLTEXTURESTORAGE2DEXTPROC>
typealias PFNGLTEXTURESTORAGE2DEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLsizei, GLenum, GLsizei, GLsizei) -> Unit>>

typealias PFNGLTEXTURESTORAGE3DEXTPROCVar = CPointerVarOf<PFNGLTEXTURESTORAGE3DEXTPROC>
typealias PFNGLTEXTURESTORAGE3DEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLsizei) -> Unit>>

typealias PFNGLTEXTURESTORAGE2DMULTISAMPLEEXTPROCVar = CPointerVarOf<PFNGLTEXTURESTORAGE2DMULTISAMPLEEXTPROC>
typealias PFNGLTEXTURESTORAGE2DMULTISAMPLEEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLboolean) -> Unit>>

typealias PFNGLTEXTURESTORAGE3DMULTISAMPLEEXTPROCVar = CPointerVarOf<PFNGLTEXTURESTORAGE3DMULTISAMPLEEXTPROC>
typealias PFNGLTEXTURESTORAGE3DMULTISAMPLEEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLsizei, GLboolean) -> Unit>>

typealias PFNGLVERTEXARRAYBINDVERTEXBUFFEREXTPROCVar = CPointerVarOf<PFNGLVERTEXARRAYBINDVERTEXBUFFEREXTPROC>
typealias PFNGLVERTEXARRAYBINDVERTEXBUFFEREXTPROC = CPointer<CFunction<(GLuint, GLuint, GLuint, GLintptr, GLsizei) -> Unit>>

typealias PFNGLVERTEXARRAYVERTEXATTRIBFORMATEXTPROCVar = CPointerVarOf<PFNGLVERTEXARRAYVERTEXATTRIBFORMATEXTPROC>
typealias PFNGLVERTEXARRAYVERTEXATTRIBFORMATEXTPROC = CPointer<CFunction<(GLuint, GLuint, GLint, GLenum, GLboolean, GLuint) -> Unit>>

typealias PFNGLVERTEXARRAYVERTEXATTRIBIFORMATEXTPROCVar = CPointerVarOf<PFNGLVERTEXARRAYVERTEXATTRIBIFORMATEXTPROC>
typealias PFNGLVERTEXARRAYVERTEXATTRIBIFORMATEXTPROC = CPointer<CFunction<(GLuint, GLuint, GLint, GLenum, GLuint) -> Unit>>

typealias PFNGLVERTEXARRAYVERTEXATTRIBLFORMATEXTPROCVar = CPointerVarOf<PFNGLVERTEXARRAYVERTEXATTRIBLFORMATEXTPROC>
typealias PFNGLVERTEXARRAYVERTEXATTRIBLFORMATEXTPROC = CPointer<CFunction<(GLuint, GLuint, GLint, GLenum, GLuint) -> Unit>>

typealias PFNGLVERTEXARRAYVERTEXATTRIBBINDINGEXTPROCVar = CPointerVarOf<PFNGLVERTEXARRAYVERTEXATTRIBBINDINGEXTPROC>
typealias PFNGLVERTEXARRAYVERTEXATTRIBBINDINGEXTPROC = CPointer<CFunction<(GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLVERTEXARRAYVERTEXBINDINGDIVISOREXTPROCVar = CPointerVarOf<PFNGLVERTEXARRAYVERTEXBINDINGDIVISOREXTPROC>
typealias PFNGLVERTEXARRAYVERTEXBINDINGDIVISOREXTPROC = CPointer<CFunction<(GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLVERTEXARRAYVERTEXATTRIBLOFFSETEXTPROCVar = CPointerVarOf<PFNGLVERTEXARRAYVERTEXATTRIBLOFFSETEXTPROC>
typealias PFNGLVERTEXARRAYVERTEXATTRIBLOFFSETEXTPROC = CPointer<CFunction<(GLuint, GLuint, GLuint, GLint, GLenum, GLsizei, GLintptr) -> Unit>>

typealias PFNGLTEXTUREPAGECOMMITMENTEXTPROCVar = CPointerVarOf<PFNGLTEXTUREPAGECOMMITMENTEXTPROC>
typealias PFNGLTEXTUREPAGECOMMITMENTEXTPROC = CPointer<CFunction<(GLuint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLboolean) -> Unit>>

typealias PFNGLVERTEXARRAYVERTEXATTRIBDIVISOREXTPROCVar = CPointerVarOf<PFNGLVERTEXARRAYVERTEXATTRIBDIVISOREXTPROC>
typealias PFNGLVERTEXARRAYVERTEXATTRIBDIVISOREXTPROC = CPointer<CFunction<(GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLCOLORMASKINDEXEDEXTPROCVar = CPointerVarOf<PFNGLCOLORMASKINDEXEDEXTPROC>
typealias PFNGLCOLORMASKINDEXEDEXTPROC = CPointer<CFunction<(GLuint, GLboolean, GLboolean, GLboolean, GLboolean) -> Unit>>

typealias PFNGLDRAWARRAYSINSTANCEDEXTPROCVar = CPointerVarOf<PFNGLDRAWARRAYSINSTANCEDEXTPROC>
typealias PFNGLDRAWARRAYSINSTANCEDEXTPROC = CPointer<CFunction<(GLenum, GLint, GLsizei, GLsizei) -> Unit>>

typealias PFNGLDRAWELEMENTSINSTANCEDEXTPROCVar = CPointerVarOf<PFNGLDRAWELEMENTSINSTANCEDEXTPROC>
typealias PFNGLDRAWELEMENTSINSTANCEDEXTPROC = CPointer<CFunction<(GLenum, GLsizei, GLenum, COpaquePointer?, GLsizei) -> Unit>>

typealias PFNGLDRAWRANGEELEMENTSEXTPROCVar = CPointerVarOf<PFNGLDRAWRANGEELEMENTSEXTPROC>
typealias PFNGLDRAWRANGEELEMENTSEXTPROC = CPointer<CFunction<(GLenum, GLuint, GLuint, GLsizei, GLenum, COpaquePointer?) -> Unit>>

typealias GLeglClientBufferEXTVar = CPointerVarOf<GLeglClientBufferEXT>
typealias GLeglClientBufferEXT = COpaquePointer

typealias PFNGLBUFFERSTORAGEEXTERNALEXTPROCVar = CPointerVarOf<PFNGLBUFFERSTORAGEEXTERNALEXTPROC>
typealias PFNGLBUFFERSTORAGEEXTERNALEXTPROC = CPointer<CFunction<(GLenum, GLintptr, GLsizeiptr, GLeglClientBufferEXT?, GLbitfield) -> Unit>>

typealias PFNGLNAMEDBUFFERSTORAGEEXTERNALEXTPROCVar = CPointerVarOf<PFNGLNAMEDBUFFERSTORAGEEXTERNALEXTPROC>
typealias PFNGLNAMEDBUFFERSTORAGEEXTERNALEXTPROC = CPointer<CFunction<(GLuint, GLintptr, GLsizeiptr, GLeglClientBufferEXT?, GLbitfield) -> Unit>>

typealias PFNGLFOGCOORDFEXTPROCVar = CPointerVarOf<PFNGLFOGCOORDFEXTPROC>
typealias PFNGLFOGCOORDFEXTPROC = CPointer<CFunction<(GLfloat) -> Unit>>

typealias PFNGLFOGCOORDFVEXTPROCVar = CPointerVarOf<PFNGLFOGCOORDFVEXTPROC>
typealias PFNGLFOGCOORDFVEXTPROC = CPointer<CFunction<(CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLFOGCOORDDEXTPROCVar = CPointerVarOf<PFNGLFOGCOORDDEXTPROC>
typealias PFNGLFOGCOORDDEXTPROC = CPointer<CFunction<(GLdouble) -> Unit>>

typealias PFNGLFOGCOORDDVEXTPROCVar = CPointerVarOf<PFNGLFOGCOORDDVEXTPROC>
typealias PFNGLFOGCOORDDVEXTPROC = CPointer<CFunction<(CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLFOGCOORDPOINTEREXTPROCVar = CPointerVarOf<PFNGLFOGCOORDPOINTEREXTPROC>
typealias PFNGLFOGCOORDPOINTEREXTPROC = CPointer<CFunction<(GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLBLITFRAMEBUFFEREXTPROCVar = CPointerVarOf<PFNGLBLITFRAMEBUFFEREXTPROC>
typealias PFNGLBLITFRAMEBUFFEREXTPROC = CPointer<CFunction<(GLint, GLint, GLint, GLint, GLint, GLint, GLint, GLint, GLbitfield, GLenum) -> Unit>>

typealias PFNGLRENDERBUFFERSTORAGEMULTISAMPLEEXTPROCVar = CPointerVarOf<PFNGLRENDERBUFFERSTORAGEMULTISAMPLEEXTPROC>
typealias PFNGLRENDERBUFFERSTORAGEMULTISAMPLEEXTPROC = CPointer<CFunction<(GLenum, GLsizei, GLenum, GLsizei, GLsizei) -> Unit>>

typealias PFNGLISRENDERBUFFEREXTPROCVar = CPointerVarOf<PFNGLISRENDERBUFFEREXTPROC>
typealias PFNGLISRENDERBUFFEREXTPROC = CPointer<CFunction<(GLuint) -> GLboolean>>

typealias PFNGLBINDRENDERBUFFEREXTPROCVar = CPointerVarOf<PFNGLBINDRENDERBUFFEREXTPROC>
typealias PFNGLBINDRENDERBUFFEREXTPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLDELETERENDERBUFFERSEXTPROCVar = CPointerVarOf<PFNGLDELETERENDERBUFFERSEXTPROC>
typealias PFNGLDELETERENDERBUFFERSEXTPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGENRENDERBUFFERSEXTPROCVar = CPointerVarOf<PFNGLGENRENDERBUFFERSEXTPROC>
typealias PFNGLGENRENDERBUFFERSEXTPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLRENDERBUFFERSTORAGEEXTPROCVar = CPointerVarOf<PFNGLRENDERBUFFERSTORAGEEXTPROC>
typealias PFNGLRENDERBUFFERSTORAGEEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLsizei, GLsizei) -> Unit>>

typealias PFNGLGETRENDERBUFFERPARAMETERIVEXTPROCVar = CPointerVarOf<PFNGLGETRENDERBUFFERPARAMETERIVEXTPROC>
typealias PFNGLGETRENDERBUFFERPARAMETERIVEXTPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLISFRAMEBUFFEREXTPROCVar = CPointerVarOf<PFNGLISFRAMEBUFFEREXTPROC>
typealias PFNGLISFRAMEBUFFEREXTPROC = CPointer<CFunction<(GLuint) -> GLboolean>>

typealias PFNGLBINDFRAMEBUFFEREXTPROCVar = CPointerVarOf<PFNGLBINDFRAMEBUFFEREXTPROC>
typealias PFNGLBINDFRAMEBUFFEREXTPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLDELETEFRAMEBUFFERSEXTPROCVar = CPointerVarOf<PFNGLDELETEFRAMEBUFFERSEXTPROC>
typealias PFNGLDELETEFRAMEBUFFERSEXTPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGENFRAMEBUFFERSEXTPROCVar = CPointerVarOf<PFNGLGENFRAMEBUFFERSEXTPROC>
typealias PFNGLGENFRAMEBUFFERSEXTPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLCHECKFRAMEBUFFERSTATUSEXTPROCVar = CPointerVarOf<PFNGLCHECKFRAMEBUFFERSTATUSEXTPROC>
typealias PFNGLCHECKFRAMEBUFFERSTATUSEXTPROC = CPointer<CFunction<(GLenum) -> GLenum>>

typealias PFNGLFRAMEBUFFERTEXTURE1DEXTPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERTEXTURE1DEXTPROC>
typealias PFNGLFRAMEBUFFERTEXTURE1DEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, GLuint, GLint) -> Unit>>

typealias PFNGLFRAMEBUFFERTEXTURE2DEXTPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERTEXTURE2DEXTPROC>
typealias PFNGLFRAMEBUFFERTEXTURE2DEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, GLuint, GLint) -> Unit>>

typealias PFNGLFRAMEBUFFERTEXTURE3DEXTPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERTEXTURE3DEXTPROC>
typealias PFNGLFRAMEBUFFERTEXTURE3DEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, GLuint, GLint, GLint) -> Unit>>

typealias PFNGLFRAMEBUFFERRENDERBUFFEREXTPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERRENDERBUFFEREXTPROC>
typealias PFNGLFRAMEBUFFERRENDERBUFFEREXTPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, GLuint) -> Unit>>

typealias PFNGLGETFRAMEBUFFERATTACHMENTPARAMETERIVEXTPROCVar = CPointerVarOf<PFNGLGETFRAMEBUFFERATTACHMENTPARAMETERIVEXTPROC>
typealias PFNGLGETFRAMEBUFFERATTACHMENTPARAMETERIVEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGENERATEMIPMAPEXTPROCVar = CPointerVarOf<PFNGLGENERATEMIPMAPEXTPROC>
typealias PFNGLGENERATEMIPMAPEXTPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLPROGRAMPARAMETERIEXTPROCVar = CPointerVarOf<PFNGLPROGRAMPARAMETERIEXTPROC>
typealias PFNGLPROGRAMPARAMETERIEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLint) -> Unit>>

typealias PFNGLPROGRAMENVPARAMETERS4FVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMENVPARAMETERS4FVEXTPROC>
typealias PFNGLPROGRAMENVPARAMETERS4FVEXTPROC = CPointer<CFunction<(GLenum, GLuint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPROGRAMLOCALPARAMETERS4FVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMLOCALPARAMETERS4FVEXTPROC>
typealias PFNGLPROGRAMLOCALPARAMETERS4FVEXTPROC = CPointer<CFunction<(GLenum, GLuint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETUNIFORMUIVEXTPROCVar = CPointerVarOf<PFNGLGETUNIFORMUIVEXTPROC>
typealias PFNGLGETUNIFORMUIVEXTPROC = CPointer<CFunction<(GLuint, GLint, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLBINDFRAGDATALOCATIONEXTPROCVar = CPointerVarOf<PFNGLBINDFRAGDATALOCATIONEXTPROC>
typealias PFNGLBINDFRAGDATALOCATIONEXTPROC = CPointer<CFunction<(GLuint, GLuint, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLGETFRAGDATALOCATIONEXTPROCVar = CPointerVarOf<PFNGLGETFRAGDATALOCATIONEXTPROC>
typealias PFNGLGETFRAGDATALOCATIONEXTPROC = CPointer<CFunction<(GLuint, CPointer<GLcharVar>?) -> GLint>>

typealias PFNGLUNIFORM1UIEXTPROCVar = CPointerVarOf<PFNGLUNIFORM1UIEXTPROC>
typealias PFNGLUNIFORM1UIEXTPROC = CPointer<CFunction<(GLint, GLuint) -> Unit>>

typealias PFNGLUNIFORM2UIEXTPROCVar = CPointerVarOf<PFNGLUNIFORM2UIEXTPROC>
typealias PFNGLUNIFORM2UIEXTPROC = CPointer<CFunction<(GLint, GLuint, GLuint) -> Unit>>

typealias PFNGLUNIFORM3UIEXTPROCVar = CPointerVarOf<PFNGLUNIFORM3UIEXTPROC>
typealias PFNGLUNIFORM3UIEXTPROC = CPointer<CFunction<(GLint, GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLUNIFORM4UIEXTPROCVar = CPointerVarOf<PFNGLUNIFORM4UIEXTPROC>
typealias PFNGLUNIFORM4UIEXTPROC = CPointer<CFunction<(GLint, GLuint, GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLUNIFORM1UIVEXTPROCVar = CPointerVarOf<PFNGLUNIFORM1UIVEXTPROC>
typealias PFNGLUNIFORM1UIVEXTPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLUNIFORM2UIVEXTPROCVar = CPointerVarOf<PFNGLUNIFORM2UIVEXTPROC>
typealias PFNGLUNIFORM2UIVEXTPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLUNIFORM3UIVEXTPROCVar = CPointerVarOf<PFNGLUNIFORM3UIVEXTPROC>
typealias PFNGLUNIFORM3UIVEXTPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLUNIFORM4UIVEXTPROCVar = CPointerVarOf<PFNGLUNIFORM4UIVEXTPROC>
typealias PFNGLUNIFORM4UIVEXTPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGETHISTOGRAMEXTPROCVar = CPointerVarOf<PFNGLGETHISTOGRAMEXTPROC>
typealias PFNGLGETHISTOGRAMEXTPROC = CPointer<CFunction<(GLenum, GLboolean, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLGETHISTOGRAMPARAMETERFVEXTPROCVar = CPointerVarOf<PFNGLGETHISTOGRAMPARAMETERFVEXTPROC>
typealias PFNGLGETHISTOGRAMPARAMETERFVEXTPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETHISTOGRAMPARAMETERIVEXTPROCVar = CPointerVarOf<PFNGLGETHISTOGRAMPARAMETERIVEXTPROC>
typealias PFNGLGETHISTOGRAMPARAMETERIVEXTPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETMINMAXEXTPROCVar = CPointerVarOf<PFNGLGETMINMAXEXTPROC>
typealias PFNGLGETMINMAXEXTPROC = CPointer<CFunction<(GLenum, GLboolean, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLGETMINMAXPARAMETERFVEXTPROCVar = CPointerVarOf<PFNGLGETMINMAXPARAMETERFVEXTPROC>
typealias PFNGLGETMINMAXPARAMETERFVEXTPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETMINMAXPARAMETERIVEXTPROCVar = CPointerVarOf<PFNGLGETMINMAXPARAMETERIVEXTPROC>
typealias PFNGLGETMINMAXPARAMETERIVEXTPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLHISTOGRAMEXTPROCVar = CPointerVarOf<PFNGLHISTOGRAMEXTPROC>
typealias PFNGLHISTOGRAMEXTPROC = CPointer<CFunction<(GLenum, GLsizei, GLenum, GLboolean) -> Unit>>

typealias PFNGLMINMAXEXTPROCVar = CPointerVarOf<PFNGLMINMAXEXTPROC>
typealias PFNGLMINMAXEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLboolean) -> Unit>>

typealias PFNGLRESETHISTOGRAMEXTPROCVar = CPointerVarOf<PFNGLRESETHISTOGRAMEXTPROC>
typealias PFNGLRESETHISTOGRAMEXTPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLRESETMINMAXEXTPROCVar = CPointerVarOf<PFNGLRESETMINMAXEXTPROC>
typealias PFNGLRESETMINMAXEXTPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLINDEXFUNCEXTPROCVar = CPointerVarOf<PFNGLINDEXFUNCEXTPROC>
typealias PFNGLINDEXFUNCEXTPROC = CPointer<CFunction<(GLenum, GLclampf) -> Unit>>

typealias PFNGLINDEXMATERIALEXTPROCVar = CPointerVarOf<PFNGLINDEXMATERIALEXTPROC>
typealias PFNGLINDEXMATERIALEXTPROC = CPointer<CFunction<(GLenum, GLenum) -> Unit>>

typealias PFNGLAPPLYTEXTUREEXTPROCVar = CPointerVarOf<PFNGLAPPLYTEXTUREEXTPROC>
typealias PFNGLAPPLYTEXTUREEXTPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLTEXTURELIGHTEXTPROCVar = CPointerVarOf<PFNGLTEXTURELIGHTEXTPROC>
typealias PFNGLTEXTURELIGHTEXTPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLTEXTUREMATERIALEXTPROCVar = CPointerVarOf<PFNGLTEXTUREMATERIALEXTPROC>
typealias PFNGLTEXTUREMATERIALEXTPROC = CPointer<CFunction<(GLenum, GLenum) -> Unit>>

typealias PFNGLGETUNSIGNEDBYTEVEXTPROCVar = CPointerVarOf<PFNGLGETUNSIGNEDBYTEVEXTPROC>
typealias PFNGLGETUNSIGNEDBYTEVEXTPROC = CPointer<CFunction<(GLenum, CPointer<GLubyteVar>?) -> Unit>>

typealias PFNGLGETUNSIGNEDBYTEI_VEXTPROCVar = CPointerVarOf<PFNGLGETUNSIGNEDBYTEI_VEXTPROC>
typealias PFNGLGETUNSIGNEDBYTEI_VEXTPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<GLubyteVar>?) -> Unit>>

typealias PFNGLDELETEMEMORYOBJECTSEXTPROCVar = CPointerVarOf<PFNGLDELETEMEMORYOBJECTSEXTPROC>
typealias PFNGLDELETEMEMORYOBJECTSEXTPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLISMEMORYOBJECTEXTPROCVar = CPointerVarOf<PFNGLISMEMORYOBJECTEXTPROC>
typealias PFNGLISMEMORYOBJECTEXTPROC = CPointer<CFunction<(GLuint) -> GLboolean>>

typealias PFNGLCREATEMEMORYOBJECTSEXTPROCVar = CPointerVarOf<PFNGLCREATEMEMORYOBJECTSEXTPROC>
typealias PFNGLCREATEMEMORYOBJECTSEXTPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLMEMORYOBJECTPARAMETERIVEXTPROCVar = CPointerVarOf<PFNGLMEMORYOBJECTPARAMETERIVEXTPROC>
typealias PFNGLMEMORYOBJECTPARAMETERIVEXTPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETMEMORYOBJECTPARAMETERIVEXTPROCVar = CPointerVarOf<PFNGLGETMEMORYOBJECTPARAMETERIVEXTPROC>
typealias PFNGLGETMEMORYOBJECTPARAMETERIVEXTPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLTEXSTORAGEMEM2DEXTPROCVar = CPointerVarOf<PFNGLTEXSTORAGEMEM2DEXTPROC>
typealias PFNGLTEXSTORAGEMEM2DEXTPROC = CPointer<CFunction<(GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLuint, GLuint64) -> Unit>>

typealias PFNGLTEXSTORAGEMEM2DMULTISAMPLEEXTPROCVar = CPointerVarOf<PFNGLTEXSTORAGEMEM2DMULTISAMPLEEXTPROC>
typealias PFNGLTEXSTORAGEMEM2DMULTISAMPLEEXTPROC = CPointer<CFunction<(GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLboolean, GLuint, GLuint64) -> Unit>>

typealias PFNGLTEXSTORAGEMEM3DEXTPROCVar = CPointerVarOf<PFNGLTEXSTORAGEMEM3DEXTPROC>
typealias PFNGLTEXSTORAGEMEM3DEXTPROC = CPointer<CFunction<(GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLsizei, GLuint, GLuint64) -> Unit>>

typealias PFNGLTEXSTORAGEMEM3DMULTISAMPLEEXTPROCVar = CPointerVarOf<PFNGLTEXSTORAGEMEM3DMULTISAMPLEEXTPROC>
typealias PFNGLTEXSTORAGEMEM3DMULTISAMPLEEXTPROC = CPointer<CFunction<(GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLsizei, GLboolean, GLuint, GLuint64) -> Unit>>

typealias PFNGLBUFFERSTORAGEMEMEXTPROCVar = CPointerVarOf<PFNGLBUFFERSTORAGEMEMEXTPROC>
typealias PFNGLBUFFERSTORAGEMEMEXTPROC = CPointer<CFunction<(GLenum, GLsizeiptr, GLuint, GLuint64) -> Unit>>

typealias PFNGLTEXTURESTORAGEMEM2DEXTPROCVar = CPointerVarOf<PFNGLTEXTURESTORAGEMEM2DEXTPROC>
typealias PFNGLTEXTURESTORAGEMEM2DEXTPROC = CPointer<CFunction<(GLuint, GLsizei, GLenum, GLsizei, GLsizei, GLuint, GLuint64) -> Unit>>

typealias PFNGLTEXTURESTORAGEMEM2DMULTISAMPLEEXTPROCVar = CPointerVarOf<PFNGLTEXTURESTORAGEMEM2DMULTISAMPLEEXTPROC>
typealias PFNGLTEXTURESTORAGEMEM2DMULTISAMPLEEXTPROC = CPointer<CFunction<(GLuint, GLsizei, GLenum, GLsizei, GLsizei, GLboolean, GLuint, GLuint64) -> Unit>>

typealias PFNGLTEXTURESTORAGEMEM3DEXTPROCVar = CPointerVarOf<PFNGLTEXTURESTORAGEMEM3DEXTPROC>
typealias PFNGLTEXTURESTORAGEMEM3DEXTPROC = CPointer<CFunction<(GLuint, GLsizei, GLenum, GLsizei, GLsizei, GLsizei, GLuint, GLuint64) -> Unit>>

typealias PFNGLTEXTURESTORAGEMEM3DMULTISAMPLEEXTPROCVar = CPointerVarOf<PFNGLTEXTURESTORAGEMEM3DMULTISAMPLEEXTPROC>
typealias PFNGLTEXTURESTORAGEMEM3DMULTISAMPLEEXTPROC = CPointer<CFunction<(GLuint, GLsizei, GLenum, GLsizei, GLsizei, GLsizei, GLboolean, GLuint, GLuint64) -> Unit>>

typealias PFNGLNAMEDBUFFERSTORAGEMEMEXTPROCVar = CPointerVarOf<PFNGLNAMEDBUFFERSTORAGEMEMEXTPROC>
typealias PFNGLNAMEDBUFFERSTORAGEMEMEXTPROC = CPointer<CFunction<(GLuint, GLsizeiptr, GLuint, GLuint64) -> Unit>>

typealias PFNGLTEXSTORAGEMEM1DEXTPROCVar = CPointerVarOf<PFNGLTEXSTORAGEMEM1DEXTPROC>
typealias PFNGLTEXSTORAGEMEM1DEXTPROC = CPointer<CFunction<(GLenum, GLsizei, GLenum, GLsizei, GLuint, GLuint64) -> Unit>>

typealias PFNGLTEXTURESTORAGEMEM1DEXTPROCVar = CPointerVarOf<PFNGLTEXTURESTORAGEMEM1DEXTPROC>
typealias PFNGLTEXTURESTORAGEMEM1DEXTPROC = CPointer<CFunction<(GLuint, GLsizei, GLenum, GLsizei, GLuint, GLuint64) -> Unit>>

typealias PFNGLIMPORTMEMORYFDEXTPROCVar = CPointerVarOf<PFNGLIMPORTMEMORYFDEXTPROC>
typealias PFNGLIMPORTMEMORYFDEXTPROC = CPointer<CFunction<(GLuint, GLuint64, GLenum, GLint) -> Unit>>

typealias PFNGLIMPORTMEMORYWIN32HANDLEEXTPROCVar = CPointerVarOf<PFNGLIMPORTMEMORYWIN32HANDLEEXTPROC>
typealias PFNGLIMPORTMEMORYWIN32HANDLEEXTPROC = CPointer<CFunction<(GLuint, GLuint64, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLIMPORTMEMORYWIN32NAMEEXTPROCVar = CPointerVarOf<PFNGLIMPORTMEMORYWIN32NAMEEXTPROC>
typealias PFNGLIMPORTMEMORYWIN32NAMEEXTPROC = CPointer<CFunction<(GLuint, GLuint64, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLMULTIDRAWARRAYSEXTPROCVar = CPointerVarOf<PFNGLMULTIDRAWARRAYSEXTPROC>
typealias PFNGLMULTIDRAWARRAYSEXTPROC = CPointer<CFunction<(GLenum, CPointer<GLintVar>?, CPointer<GLsizeiVar>?, GLsizei) -> Unit>>

typealias PFNGLMULTIDRAWELEMENTSEXTPROCVar = CPointerVarOf<PFNGLMULTIDRAWELEMENTSEXTPROC>
typealias PFNGLMULTIDRAWELEMENTSEXTPROC = CPointer<CFunction<(GLenum, CPointer<GLsizeiVar>?, GLenum, CPointer<COpaquePointerVar>?, GLsizei) -> Unit>>

typealias PFNGLSAMPLEMASKEXTPROCVar = CPointerVarOf<PFNGLSAMPLEMASKEXTPROC>
typealias PFNGLSAMPLEMASKEXTPROC = CPointer<CFunction<(GLclampf, GLboolean) -> Unit>>

typealias PFNGLSAMPLEPATTERNEXTPROCVar = CPointerVarOf<PFNGLSAMPLEPATTERNEXTPROC>
typealias PFNGLSAMPLEPATTERNEXTPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLCOLORTABLEEXTPROCVar = CPointerVarOf<PFNGLCOLORTABLEEXTPROC>
typealias PFNGLCOLORTABLEEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLsizei, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLGETCOLORTABLEEXTPROCVar = CPointerVarOf<PFNGLGETCOLORTABLEEXTPROC>
typealias PFNGLGETCOLORTABLEEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLGETCOLORTABLEPARAMETERIVEXTPROCVar = CPointerVarOf<PFNGLGETCOLORTABLEPARAMETERIVEXTPROC>
typealias PFNGLGETCOLORTABLEPARAMETERIVEXTPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETCOLORTABLEPARAMETERFVEXTPROCVar = CPointerVarOf<PFNGLGETCOLORTABLEPARAMETERFVEXTPROC>
typealias PFNGLGETCOLORTABLEPARAMETERFVEXTPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPIXELTRANSFORMPARAMETERIEXTPROCVar = CPointerVarOf<PFNGLPIXELTRANSFORMPARAMETERIEXTPROC>
typealias PFNGLPIXELTRANSFORMPARAMETERIEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLint) -> Unit>>

typealias PFNGLPIXELTRANSFORMPARAMETERFEXTPROCVar = CPointerVarOf<PFNGLPIXELTRANSFORMPARAMETERFEXTPROC>
typealias PFNGLPIXELTRANSFORMPARAMETERFEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLfloat) -> Unit>>

typealias PFNGLPIXELTRANSFORMPARAMETERIVEXTPROCVar = CPointerVarOf<PFNGLPIXELTRANSFORMPARAMETERIVEXTPROC>
typealias PFNGLPIXELTRANSFORMPARAMETERIVEXTPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLPIXELTRANSFORMPARAMETERFVEXTPROCVar = CPointerVarOf<PFNGLPIXELTRANSFORMPARAMETERFVEXTPROC>
typealias PFNGLPIXELTRANSFORMPARAMETERFVEXTPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETPIXELTRANSFORMPARAMETERIVEXTPROCVar = CPointerVarOf<PFNGLGETPIXELTRANSFORMPARAMETERIVEXTPROC>
typealias PFNGLGETPIXELTRANSFORMPARAMETERIVEXTPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETPIXELTRANSFORMPARAMETERFVEXTPROCVar = CPointerVarOf<PFNGLGETPIXELTRANSFORMPARAMETERFVEXTPROC>
typealias PFNGLGETPIXELTRANSFORMPARAMETERFVEXTPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPOINTPARAMETERFEXTPROCVar = CPointerVarOf<PFNGLPOINTPARAMETERFEXTPROC>
typealias PFNGLPOINTPARAMETERFEXTPROC = CPointer<CFunction<(GLenum, GLfloat) -> Unit>>

typealias PFNGLPOINTPARAMETERFVEXTPROCVar = CPointerVarOf<PFNGLPOINTPARAMETERFVEXTPROC>
typealias PFNGLPOINTPARAMETERFVEXTPROC = CPointer<CFunction<(GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPOLYGONOFFSETEXTPROCVar = CPointerVarOf<PFNGLPOLYGONOFFSETEXTPROC>
typealias PFNGLPOLYGONOFFSETEXTPROC = CPointer<CFunction<(GLfloat, GLfloat) -> Unit>>

typealias PFNGLPOLYGONOFFSETCLAMPEXTPROCVar = CPointerVarOf<PFNGLPOLYGONOFFSETCLAMPEXTPROC>
typealias PFNGLPOLYGONOFFSETCLAMPEXTPROC = CPointer<CFunction<(GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLPROVOKINGVERTEXEXTPROCVar = CPointerVarOf<PFNGLPROVOKINGVERTEXEXTPROC>
typealias PFNGLPROVOKINGVERTEXEXTPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLRASTERSAMPLESEXTPROCVar = CPointerVarOf<PFNGLRASTERSAMPLESEXTPROC>
typealias PFNGLRASTERSAMPLESEXTPROC = CPointer<CFunction<(GLuint, GLboolean) -> Unit>>

typealias PFNGLSECONDARYCOLOR3BEXTPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3BEXTPROC>
typealias PFNGLSECONDARYCOLOR3BEXTPROC = CPointer<CFunction<(GLbyte, GLbyte, GLbyte) -> Unit>>

typealias PFNGLSECONDARYCOLOR3BVEXTPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3BVEXTPROC>
typealias PFNGLSECONDARYCOLOR3BVEXTPROC = CPointer<CFunction<(CPointer<GLbyteVar>?) -> Unit>>

typealias PFNGLSECONDARYCOLOR3DEXTPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3DEXTPROC>
typealias PFNGLSECONDARYCOLOR3DEXTPROC = CPointer<CFunction<(GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLSECONDARYCOLOR3DVEXTPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3DVEXTPROC>
typealias PFNGLSECONDARYCOLOR3DVEXTPROC = CPointer<CFunction<(CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLSECONDARYCOLOR3FEXTPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3FEXTPROC>
typealias PFNGLSECONDARYCOLOR3FEXTPROC = CPointer<CFunction<(GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLSECONDARYCOLOR3FVEXTPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3FVEXTPROC>
typealias PFNGLSECONDARYCOLOR3FVEXTPROC = CPointer<CFunction<(CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLSECONDARYCOLOR3IEXTPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3IEXTPROC>
typealias PFNGLSECONDARYCOLOR3IEXTPROC = CPointer<CFunction<(GLint, GLint, GLint) -> Unit>>

typealias PFNGLSECONDARYCOLOR3IVEXTPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3IVEXTPROC>
typealias PFNGLSECONDARYCOLOR3IVEXTPROC = CPointer<CFunction<(CPointer<GLintVar>?) -> Unit>>

typealias PFNGLSECONDARYCOLOR3SEXTPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3SEXTPROC>
typealias PFNGLSECONDARYCOLOR3SEXTPROC = CPointer<CFunction<(GLshort, GLshort, GLshort) -> Unit>>

typealias PFNGLSECONDARYCOLOR3SVEXTPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3SVEXTPROC>
typealias PFNGLSECONDARYCOLOR3SVEXTPROC = CPointer<CFunction<(CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLSECONDARYCOLOR3UBEXTPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3UBEXTPROC>
typealias PFNGLSECONDARYCOLOR3UBEXTPROC = CPointer<CFunction<(GLubyte, GLubyte, GLubyte) -> Unit>>

typealias PFNGLSECONDARYCOLOR3UBVEXTPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3UBVEXTPROC>
typealias PFNGLSECONDARYCOLOR3UBVEXTPROC = CPointer<CFunction<(CPointer<GLubyteVar>?) -> Unit>>

typealias PFNGLSECONDARYCOLOR3UIEXTPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3UIEXTPROC>
typealias PFNGLSECONDARYCOLOR3UIEXTPROC = CPointer<CFunction<(GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLSECONDARYCOLOR3UIVEXTPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3UIVEXTPROC>
typealias PFNGLSECONDARYCOLOR3UIVEXTPROC = CPointer<CFunction<(CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLSECONDARYCOLOR3USEXTPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3USEXTPROC>
typealias PFNGLSECONDARYCOLOR3USEXTPROC = CPointer<CFunction<(GLushort, GLushort, GLushort) -> Unit>>

typealias PFNGLSECONDARYCOLOR3USVEXTPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3USVEXTPROC>
typealias PFNGLSECONDARYCOLOR3USVEXTPROC = CPointer<CFunction<(CPointer<GLushortVar>?) -> Unit>>

typealias PFNGLSECONDARYCOLORPOINTEREXTPROCVar = CPointerVarOf<PFNGLSECONDARYCOLORPOINTEREXTPROC>
typealias PFNGLSECONDARYCOLORPOINTEREXTPROC = CPointer<CFunction<(GLint, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLGENSEMAPHORESEXTPROCVar = CPointerVarOf<PFNGLGENSEMAPHORESEXTPROC>
typealias PFNGLGENSEMAPHORESEXTPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLDELETESEMAPHORESEXTPROCVar = CPointerVarOf<PFNGLDELETESEMAPHORESEXTPROC>
typealias PFNGLDELETESEMAPHORESEXTPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLISSEMAPHOREEXTPROCVar = CPointerVarOf<PFNGLISSEMAPHOREEXTPROC>
typealias PFNGLISSEMAPHOREEXTPROC = CPointer<CFunction<(GLuint) -> GLboolean>>

typealias PFNGLSEMAPHOREPARAMETERUI64VEXTPROCVar = CPointerVarOf<PFNGLSEMAPHOREPARAMETERUI64VEXTPROC>
typealias PFNGLSEMAPHOREPARAMETERUI64VEXTPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLuint64Var>?) -> Unit>>

typealias PFNGLGETSEMAPHOREPARAMETERUI64VEXTPROCVar = CPointerVarOf<PFNGLGETSEMAPHOREPARAMETERUI64VEXTPROC>
typealias PFNGLGETSEMAPHOREPARAMETERUI64VEXTPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLuint64Var>?) -> Unit>>

typealias PFNGLWAITSEMAPHOREEXTPROCVar = CPointerVarOf<PFNGLWAITSEMAPHOREEXTPROC>
typealias PFNGLWAITSEMAPHOREEXTPROC = CPointer<CFunction<(GLuint, GLuint, CPointer<GLuintVar>?, GLuint, CPointer<GLuintVar>?, CPointer<GLenumVar>?) -> Unit>>

typealias PFNGLSIGNALSEMAPHOREEXTPROCVar = CPointerVarOf<PFNGLSIGNALSEMAPHOREEXTPROC>
typealias PFNGLSIGNALSEMAPHOREEXTPROC = CPointer<CFunction<(GLuint, GLuint, CPointer<GLuintVar>?, GLuint, CPointer<GLuintVar>?, CPointer<GLenumVar>?) -> Unit>>

typealias PFNGLIMPORTSEMAPHOREFDEXTPROCVar = CPointerVarOf<PFNGLIMPORTSEMAPHOREFDEXTPROC>
typealias PFNGLIMPORTSEMAPHOREFDEXTPROC = CPointer<CFunction<(GLuint, GLenum, GLint) -> Unit>>

typealias PFNGLIMPORTSEMAPHOREWIN32HANDLEEXTPROCVar = CPointerVarOf<PFNGLIMPORTSEMAPHOREWIN32HANDLEEXTPROC>
typealias PFNGLIMPORTSEMAPHOREWIN32HANDLEEXTPROC = CPointer<CFunction<(GLuint, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLIMPORTSEMAPHOREWIN32NAMEEXTPROCVar = CPointerVarOf<PFNGLIMPORTSEMAPHOREWIN32NAMEEXTPROC>
typealias PFNGLIMPORTSEMAPHOREWIN32NAMEEXTPROC = CPointer<CFunction<(GLuint, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLUSESHADERPROGRAMEXTPROCVar = CPointerVarOf<PFNGLUSESHADERPROGRAMEXTPROC>
typealias PFNGLUSESHADERPROGRAMEXTPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLACTIVEPROGRAMEXTPROCVar = CPointerVarOf<PFNGLACTIVEPROGRAMEXTPROC>
typealias PFNGLACTIVEPROGRAMEXTPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLCREATESHADERPROGRAMEXTPROCVar = CPointerVarOf<PFNGLCREATESHADERPROGRAMEXTPROC>
typealias PFNGLCREATESHADERPROGRAMEXTPROC = CPointer<CFunction<(GLenum, CPointer<GLcharVar>?) -> GLuint>>

typealias PFNGLBINDIMAGETEXTUREEXTPROCVar = CPointerVarOf<PFNGLBINDIMAGETEXTUREEXTPROC>
typealias PFNGLBINDIMAGETEXTUREEXTPROC = CPointer<CFunction<(GLuint, GLuint, GLint, GLboolean, GLint, GLenum, GLint) -> Unit>>

typealias PFNGLMEMORYBARRIEREXTPROCVar = CPointerVarOf<PFNGLMEMORYBARRIEREXTPROC>
typealias PFNGLMEMORYBARRIEREXTPROC = CPointer<CFunction<(GLbitfield) -> Unit>>

typealias PFNGLSTENCILCLEARTAGEXTPROCVar = CPointerVarOf<PFNGLSTENCILCLEARTAGEXTPROC>
typealias PFNGLSTENCILCLEARTAGEXTPROC = CPointer<CFunction<(GLsizei, GLuint) -> Unit>>

typealias PFNGLACTIVESTENCILFACEEXTPROCVar = CPointerVarOf<PFNGLACTIVESTENCILFACEEXTPROC>
typealias PFNGLACTIVESTENCILFACEEXTPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLTEXSUBIMAGE1DEXTPROCVar = CPointerVarOf<PFNGLTEXSUBIMAGE1DEXTPROC>
typealias PFNGLTEXSUBIMAGE1DEXTPROC = CPointer<CFunction<(GLenum, GLint, GLint, GLsizei, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLTEXSUBIMAGE2DEXTPROCVar = CPointerVarOf<PFNGLTEXSUBIMAGE2DEXTPROC>
typealias PFNGLTEXSUBIMAGE2DEXTPROC = CPointer<CFunction<(GLenum, GLint, GLint, GLint, GLsizei, GLsizei, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLTEXIMAGE3DEXTPROCVar = CPointerVarOf<PFNGLTEXIMAGE3DEXTPROC>
typealias PFNGLTEXIMAGE3DEXTPROC = CPointer<CFunction<(GLenum, GLint, GLenum, GLsizei, GLsizei, GLsizei, GLint, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLTEXSUBIMAGE3DEXTPROCVar = CPointerVarOf<PFNGLTEXSUBIMAGE3DEXTPROC>
typealias PFNGLTEXSUBIMAGE3DEXTPROC = CPointer<CFunction<(GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLFRAMEBUFFERTEXTURELAYEREXTPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERTEXTURELAYEREXTPROC>
typealias PFNGLFRAMEBUFFERTEXTURELAYEREXTPROC = CPointer<CFunction<(GLenum, GLenum, GLuint, GLint, GLint) -> Unit>>

typealias PFNGLTEXBUFFEREXTPROCVar = CPointerVarOf<PFNGLTEXBUFFEREXTPROC>
typealias PFNGLTEXBUFFEREXTPROC = CPointer<CFunction<(GLenum, GLenum, GLuint) -> Unit>>

typealias PFNGLTEXPARAMETERIIVEXTPROCVar = CPointerVarOf<PFNGLTEXPARAMETERIIVEXTPROC>
typealias PFNGLTEXPARAMETERIIVEXTPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLTEXPARAMETERIUIVEXTPROCVar = CPointerVarOf<PFNGLTEXPARAMETERIUIVEXTPROC>
typealias PFNGLTEXPARAMETERIUIVEXTPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGETTEXPARAMETERIIVEXTPROCVar = CPointerVarOf<PFNGLGETTEXPARAMETERIIVEXTPROC>
typealias PFNGLGETTEXPARAMETERIIVEXTPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETTEXPARAMETERIUIVEXTPROCVar = CPointerVarOf<PFNGLGETTEXPARAMETERIUIVEXTPROC>
typealias PFNGLGETTEXPARAMETERIUIVEXTPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLCLEARCOLORIIEXTPROCVar = CPointerVarOf<PFNGLCLEARCOLORIIEXTPROC>
typealias PFNGLCLEARCOLORIIEXTPROC = CPointer<CFunction<(GLint, GLint, GLint, GLint) -> Unit>>

typealias PFNGLCLEARCOLORIUIEXTPROCVar = CPointerVarOf<PFNGLCLEARCOLORIUIEXTPROC>
typealias PFNGLCLEARCOLORIUIEXTPROC = CPointer<CFunction<(GLuint, GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLARETEXTURESRESIDENTEXTPROCVar = CPointerVarOf<PFNGLARETEXTURESRESIDENTEXTPROC>
typealias PFNGLARETEXTURESRESIDENTEXTPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?, CPointer<GLbooleanVar>?) -> GLboolean>>

typealias PFNGLBINDTEXTUREEXTPROCVar = CPointerVarOf<PFNGLBINDTEXTUREEXTPROC>
typealias PFNGLBINDTEXTUREEXTPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLDELETETEXTURESEXTPROCVar = CPointerVarOf<PFNGLDELETETEXTURESEXTPROC>
typealias PFNGLDELETETEXTURESEXTPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGENTEXTURESEXTPROCVar = CPointerVarOf<PFNGLGENTEXTURESEXTPROC>
typealias PFNGLGENTEXTURESEXTPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLISTEXTUREEXTPROCVar = CPointerVarOf<PFNGLISTEXTUREEXTPROC>
typealias PFNGLISTEXTUREEXTPROC = CPointer<CFunction<(GLuint) -> GLboolean>>

typealias PFNGLPRIORITIZETEXTURESEXTPROCVar = CPointerVarOf<PFNGLPRIORITIZETEXTURESEXTPROC>
typealias PFNGLPRIORITIZETEXTURESEXTPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?, CPointer<GLclampfVar>?) -> Unit>>

typealias PFNGLTEXTURENORMALEXTPROCVar = CPointerVarOf<PFNGLTEXTURENORMALEXTPROC>
typealias PFNGLTEXTURENORMALEXTPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLGETQUERYOBJECTI64VEXTPROCVar = CPointerVarOf<PFNGLGETQUERYOBJECTI64VEXTPROC>
typealias PFNGLGETQUERYOBJECTI64VEXTPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLint64Var>?) -> Unit>>

typealias PFNGLGETQUERYOBJECTUI64VEXTPROCVar = CPointerVarOf<PFNGLGETQUERYOBJECTUI64VEXTPROC>
typealias PFNGLGETQUERYOBJECTUI64VEXTPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLuint64Var>?) -> Unit>>

typealias PFNGLBEGINTRANSFORMFEEDBACKEXTPROCVar = CPointerVarOf<PFNGLBEGINTRANSFORMFEEDBACKEXTPROC>
typealias PFNGLBEGINTRANSFORMFEEDBACKEXTPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLENDTRANSFORMFEEDBACKEXTPROCVar = CPointerVarOf<PFNGLENDTRANSFORMFEEDBACKEXTPROC>
typealias PFNGLENDTRANSFORMFEEDBACKEXTPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLBINDBUFFERRANGEEXTPROCVar = CPointerVarOf<PFNGLBINDBUFFERRANGEEXTPROC>
typealias PFNGLBINDBUFFERRANGEEXTPROC = CPointer<CFunction<(GLenum, GLuint, GLuint, GLintptr, GLsizeiptr) -> Unit>>

typealias PFNGLBINDBUFFEROFFSETEXTPROCVar = CPointerVarOf<PFNGLBINDBUFFEROFFSETEXTPROC>
typealias PFNGLBINDBUFFEROFFSETEXTPROC = CPointer<CFunction<(GLenum, GLuint, GLuint, GLintptr) -> Unit>>

typealias PFNGLBINDBUFFERBASEEXTPROCVar = CPointerVarOf<PFNGLBINDBUFFERBASEEXTPROC>
typealias PFNGLBINDBUFFERBASEEXTPROC = CPointer<CFunction<(GLenum, GLuint, GLuint) -> Unit>>

typealias PFNGLTRANSFORMFEEDBACKVARYINGSEXTPROCVar = CPointerVarOf<PFNGLTRANSFORMFEEDBACKVARYINGSEXTPROC>
typealias PFNGLTRANSFORMFEEDBACKVARYINGSEXTPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<CPointerVar<GLcharVar>>?, GLenum) -> Unit>>

typealias PFNGLGETTRANSFORMFEEDBACKVARYINGEXTPROCVar = CPointerVarOf<PFNGLGETTRANSFORMFEEDBACKVARYINGEXTPROC>
typealias PFNGLGETTRANSFORMFEEDBACKVARYINGEXTPROC = CPointer<CFunction<(GLuint, GLuint, GLsizei, CPointer<GLsizeiVar>?, CPointer<GLsizeiVar>?, CPointer<GLenumVar>?, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLARRAYELEMENTEXTPROCVar = CPointerVarOf<PFNGLARRAYELEMENTEXTPROC>
typealias PFNGLARRAYELEMENTEXTPROC = CPointer<CFunction<(GLint) -> Unit>>

typealias PFNGLCOLORPOINTEREXTPROCVar = CPointerVarOf<PFNGLCOLORPOINTEREXTPROC>
typealias PFNGLCOLORPOINTEREXTPROC = CPointer<CFunction<(GLint, GLenum, GLsizei, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLDRAWARRAYSEXTPROCVar = CPointerVarOf<PFNGLDRAWARRAYSEXTPROC>
typealias PFNGLDRAWARRAYSEXTPROC = CPointer<CFunction<(GLenum, GLint, GLsizei) -> Unit>>

typealias PFNGLEDGEFLAGPOINTEREXTPROCVar = CPointerVarOf<PFNGLEDGEFLAGPOINTEREXTPROC>
typealias PFNGLEDGEFLAGPOINTEREXTPROC = CPointer<CFunction<(GLsizei, GLsizei, CPointer<GLbooleanVar>?) -> Unit>>

typealias PFNGLGETPOINTERVEXTPROCVar = CPointerVarOf<PFNGLGETPOINTERVEXTPROC>
typealias PFNGLGETPOINTERVEXTPROC = CPointer<CFunction<(GLenum, CPointer<COpaquePointerVar>?) -> Unit>>

typealias PFNGLINDEXPOINTEREXTPROCVar = CPointerVarOf<PFNGLINDEXPOINTEREXTPROC>
typealias PFNGLINDEXPOINTEREXTPROC = CPointer<CFunction<(GLenum, GLsizei, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLNORMALPOINTEREXTPROCVar = CPointerVarOf<PFNGLNORMALPOINTEREXTPROC>
typealias PFNGLNORMALPOINTEREXTPROC = CPointer<CFunction<(GLenum, GLsizei, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLTEXCOORDPOINTEREXTPROCVar = CPointerVarOf<PFNGLTEXCOORDPOINTEREXTPROC>
typealias PFNGLTEXCOORDPOINTEREXTPROC = CPointer<CFunction<(GLint, GLenum, GLsizei, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLVERTEXPOINTEREXTPROCVar = CPointerVarOf<PFNGLVERTEXPOINTEREXTPROC>
typealias PFNGLVERTEXPOINTEREXTPROC = CPointer<CFunction<(GLint, GLenum, GLsizei, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLVERTEXATTRIBL1DEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL1DEXTPROC>
typealias PFNGLVERTEXATTRIBL1DEXTPROC = CPointer<CFunction<(GLuint, GLdouble) -> Unit>>

typealias PFNGLVERTEXATTRIBL2DEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL2DEXTPROC>
typealias PFNGLVERTEXATTRIBL2DEXTPROC = CPointer<CFunction<(GLuint, GLdouble, GLdouble) -> Unit>>

typealias PFNGLVERTEXATTRIBL3DEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL3DEXTPROC>
typealias PFNGLVERTEXATTRIBL3DEXTPROC = CPointer<CFunction<(GLuint, GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLVERTEXATTRIBL4DEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL4DEXTPROC>
typealias PFNGLVERTEXATTRIBL4DEXTPROC = CPointer<CFunction<(GLuint, GLdouble, GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLVERTEXATTRIBL1DVEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL1DVEXTPROC>
typealias PFNGLVERTEXATTRIBL1DVEXTPROC = CPointer<CFunction<(GLuint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBL2DVEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL2DVEXTPROC>
typealias PFNGLVERTEXATTRIBL2DVEXTPROC = CPointer<CFunction<(GLuint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBL3DVEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL3DVEXTPROC>
typealias PFNGLVERTEXATTRIBL3DVEXTPROC = CPointer<CFunction<(GLuint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBL4DVEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL4DVEXTPROC>
typealias PFNGLVERTEXATTRIBL4DVEXTPROC = CPointer<CFunction<(GLuint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBLPOINTEREXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBLPOINTEREXTPROC>
typealias PFNGLVERTEXATTRIBLPOINTEREXTPROC = CPointer<CFunction<(GLuint, GLint, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLGETVERTEXATTRIBLDVEXTPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBLDVEXTPROC>
typealias PFNGLGETVERTEXATTRIBLDVEXTPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLBEGINVERTEXSHADEREXTPROCVar = CPointerVarOf<PFNGLBEGINVERTEXSHADEREXTPROC>
typealias PFNGLBEGINVERTEXSHADEREXTPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLENDVERTEXSHADEREXTPROCVar = CPointerVarOf<PFNGLENDVERTEXSHADEREXTPROC>
typealias PFNGLENDVERTEXSHADEREXTPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLBINDVERTEXSHADEREXTPROCVar = CPointerVarOf<PFNGLBINDVERTEXSHADEREXTPROC>
typealias PFNGLBINDVERTEXSHADEREXTPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLGENVERTEXSHADERSEXTPROCVar = CPointerVarOf<PFNGLGENVERTEXSHADERSEXTPROC>
typealias PFNGLGENVERTEXSHADERSEXTPROC = CPointer<CFunction<(GLuint) -> GLuint>>

typealias PFNGLDELETEVERTEXSHADEREXTPROCVar = CPointerVarOf<PFNGLDELETEVERTEXSHADEREXTPROC>
typealias PFNGLDELETEVERTEXSHADEREXTPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLSHADEROP1EXTPROCVar = CPointerVarOf<PFNGLSHADEROP1EXTPROC>
typealias PFNGLSHADEROP1EXTPROC = CPointer<CFunction<(GLenum, GLuint, GLuint) -> Unit>>

typealias PFNGLSHADEROP2EXTPROCVar = CPointerVarOf<PFNGLSHADEROP2EXTPROC>
typealias PFNGLSHADEROP2EXTPROC = CPointer<CFunction<(GLenum, GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLSHADEROP3EXTPROCVar = CPointerVarOf<PFNGLSHADEROP3EXTPROC>
typealias PFNGLSHADEROP3EXTPROC = CPointer<CFunction<(GLenum, GLuint, GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLSWIZZLEEXTPROCVar = CPointerVarOf<PFNGLSWIZZLEEXTPROC>
typealias PFNGLSWIZZLEEXTPROC = CPointer<CFunction<(GLuint, GLuint, GLenum, GLenum, GLenum, GLenum) -> Unit>>

typealias PFNGLWRITEMASKEXTPROCVar = CPointerVarOf<PFNGLWRITEMASKEXTPROC>
typealias PFNGLWRITEMASKEXTPROC = CPointer<CFunction<(GLuint, GLuint, GLenum, GLenum, GLenum, GLenum) -> Unit>>

typealias PFNGLINSERTCOMPONENTEXTPROCVar = CPointerVarOf<PFNGLINSERTCOMPONENTEXTPROC>
typealias PFNGLINSERTCOMPONENTEXTPROC = CPointer<CFunction<(GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLEXTRACTCOMPONENTEXTPROCVar = CPointerVarOf<PFNGLEXTRACTCOMPONENTEXTPROC>
typealias PFNGLEXTRACTCOMPONENTEXTPROC = CPointer<CFunction<(GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLGENSYMBOLSEXTPROCVar = CPointerVarOf<PFNGLGENSYMBOLSEXTPROC>
typealias PFNGLGENSYMBOLSEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, GLuint) -> GLuint>>

typealias PFNGLSETINVARIANTEXTPROCVar = CPointerVarOf<PFNGLSETINVARIANTEXTPROC>
typealias PFNGLSETINVARIANTEXTPROC = CPointer<CFunction<(GLuint, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLSETLOCALCONSTANTEXTPROCVar = CPointerVarOf<PFNGLSETLOCALCONSTANTEXTPROC>
typealias PFNGLSETLOCALCONSTANTEXTPROC = CPointer<CFunction<(GLuint, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLVARIANTBVEXTPROCVar = CPointerVarOf<PFNGLVARIANTBVEXTPROC>
typealias PFNGLVARIANTBVEXTPROC = CPointer<CFunction<(GLuint, CPointer<GLbyteVar>?) -> Unit>>

typealias PFNGLVARIANTSVEXTPROCVar = CPointerVarOf<PFNGLVARIANTSVEXTPROC>
typealias PFNGLVARIANTSVEXTPROC = CPointer<CFunction<(GLuint, CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLVARIANTIVEXTPROCVar = CPointerVarOf<PFNGLVARIANTIVEXTPROC>
typealias PFNGLVARIANTIVEXTPROC = CPointer<CFunction<(GLuint, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLVARIANTFVEXTPROCVar = CPointerVarOf<PFNGLVARIANTFVEXTPROC>
typealias PFNGLVARIANTFVEXTPROC = CPointer<CFunction<(GLuint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLVARIANTDVEXTPROCVar = CPointerVarOf<PFNGLVARIANTDVEXTPROC>
typealias PFNGLVARIANTDVEXTPROC = CPointer<CFunction<(GLuint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLVARIANTUBVEXTPROCVar = CPointerVarOf<PFNGLVARIANTUBVEXTPROC>
typealias PFNGLVARIANTUBVEXTPROC = CPointer<CFunction<(GLuint, CPointer<GLubyteVar>?) -> Unit>>

typealias PFNGLVARIANTUSVEXTPROCVar = CPointerVarOf<PFNGLVARIANTUSVEXTPROC>
typealias PFNGLVARIANTUSVEXTPROC = CPointer<CFunction<(GLuint, CPointer<GLushortVar>?) -> Unit>>

typealias PFNGLVARIANTUIVEXTPROCVar = CPointerVarOf<PFNGLVARIANTUIVEXTPROC>
typealias PFNGLVARIANTUIVEXTPROC = CPointer<CFunction<(GLuint, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLVARIANTPOINTEREXTPROCVar = CPointerVarOf<PFNGLVARIANTPOINTEREXTPROC>
typealias PFNGLVARIANTPOINTEREXTPROC = CPointer<CFunction<(GLuint, GLenum, GLuint, COpaquePointer?) -> Unit>>

typealias PFNGLENABLEVARIANTCLIENTSTATEEXTPROCVar = CPointerVarOf<PFNGLENABLEVARIANTCLIENTSTATEEXTPROC>
typealias PFNGLENABLEVARIANTCLIENTSTATEEXTPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLDISABLEVARIANTCLIENTSTATEEXTPROCVar = CPointerVarOf<PFNGLDISABLEVARIANTCLIENTSTATEEXTPROC>
typealias PFNGLDISABLEVARIANTCLIENTSTATEEXTPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLBINDLIGHTPARAMETEREXTPROCVar = CPointerVarOf<PFNGLBINDLIGHTPARAMETEREXTPROC>
typealias PFNGLBINDLIGHTPARAMETEREXTPROC = CPointer<CFunction<(GLenum, GLenum) -> GLuint>>

typealias PFNGLBINDMATERIALPARAMETEREXTPROCVar = CPointerVarOf<PFNGLBINDMATERIALPARAMETEREXTPROC>
typealias PFNGLBINDMATERIALPARAMETEREXTPROC = CPointer<CFunction<(GLenum, GLenum) -> GLuint>>

typealias PFNGLBINDTEXGENPARAMETEREXTPROCVar = CPointerVarOf<PFNGLBINDTEXGENPARAMETEREXTPROC>
typealias PFNGLBINDTEXGENPARAMETEREXTPROC = CPointer<CFunction<(GLenum, GLenum, GLenum) -> GLuint>>

typealias PFNGLBINDTEXTUREUNITPARAMETEREXTPROCVar = CPointerVarOf<PFNGLBINDTEXTUREUNITPARAMETEREXTPROC>
typealias PFNGLBINDTEXTUREUNITPARAMETEREXTPROC = CPointer<CFunction<(GLenum, GLenum) -> GLuint>>

typealias PFNGLBINDPARAMETEREXTPROCVar = CPointerVarOf<PFNGLBINDPARAMETEREXTPROC>
typealias PFNGLBINDPARAMETEREXTPROC = CPointer<CFunction<(GLenum) -> GLuint>>

typealias PFNGLISVARIANTENABLEDEXTPROCVar = CPointerVarOf<PFNGLISVARIANTENABLEDEXTPROC>
typealias PFNGLISVARIANTENABLEDEXTPROC = CPointer<CFunction<(GLuint, GLenum) -> GLboolean>>

typealias PFNGLGETVARIANTBOOLEANVEXTPROCVar = CPointerVarOf<PFNGLGETVARIANTBOOLEANVEXTPROC>
typealias PFNGLGETVARIANTBOOLEANVEXTPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLbooleanVar>?) -> Unit>>

typealias PFNGLGETVARIANTINTEGERVEXTPROCVar = CPointerVarOf<PFNGLGETVARIANTINTEGERVEXTPROC>
typealias PFNGLGETVARIANTINTEGERVEXTPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETVARIANTFLOATVEXTPROCVar = CPointerVarOf<PFNGLGETVARIANTFLOATVEXTPROC>
typealias PFNGLGETVARIANTFLOATVEXTPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETVARIANTPOINTERVEXTPROCVar = CPointerVarOf<PFNGLGETVARIANTPOINTERVEXTPROC>
typealias PFNGLGETVARIANTPOINTERVEXTPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<COpaquePointerVar>?) -> Unit>>

typealias PFNGLGETINVARIANTBOOLEANVEXTPROCVar = CPointerVarOf<PFNGLGETINVARIANTBOOLEANVEXTPROC>
typealias PFNGLGETINVARIANTBOOLEANVEXTPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLbooleanVar>?) -> Unit>>

typealias PFNGLGETINVARIANTINTEGERVEXTPROCVar = CPointerVarOf<PFNGLGETINVARIANTINTEGERVEXTPROC>
typealias PFNGLGETINVARIANTINTEGERVEXTPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETINVARIANTFLOATVEXTPROCVar = CPointerVarOf<PFNGLGETINVARIANTFLOATVEXTPROC>
typealias PFNGLGETINVARIANTFLOATVEXTPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETLOCALCONSTANTBOOLEANVEXTPROCVar = CPointerVarOf<PFNGLGETLOCALCONSTANTBOOLEANVEXTPROC>
typealias PFNGLGETLOCALCONSTANTBOOLEANVEXTPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLbooleanVar>?) -> Unit>>

typealias PFNGLGETLOCALCONSTANTINTEGERVEXTPROCVar = CPointerVarOf<PFNGLGETLOCALCONSTANTINTEGERVEXTPROC>
typealias PFNGLGETLOCALCONSTANTINTEGERVEXTPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETLOCALCONSTANTFLOATVEXTPROCVar = CPointerVarOf<PFNGLGETLOCALCONSTANTFLOATVEXTPROC>
typealias PFNGLGETLOCALCONSTANTFLOATVEXTPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLVERTEXWEIGHTFEXTPROCVar = CPointerVarOf<PFNGLVERTEXWEIGHTFEXTPROC>
typealias PFNGLVERTEXWEIGHTFEXTPROC = CPointer<CFunction<(GLfloat) -> Unit>>

typealias PFNGLVERTEXWEIGHTFVEXTPROCVar = CPointerVarOf<PFNGLVERTEXWEIGHTFVEXTPROC>
typealias PFNGLVERTEXWEIGHTFVEXTPROC = CPointer<CFunction<(CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLVERTEXWEIGHTPOINTEREXTPROCVar = CPointerVarOf<PFNGLVERTEXWEIGHTPOINTEREXTPROC>
typealias PFNGLVERTEXWEIGHTPOINTEREXTPROC = CPointer<CFunction<(GLint, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLACQUIREKEYEDMUTEXWIN32EXTPROCVar = CPointerVarOf<PFNGLACQUIREKEYEDMUTEXWIN32EXTPROC>
typealias PFNGLACQUIREKEYEDMUTEXWIN32EXTPROC = CPointer<CFunction<(GLuint, GLuint64, GLuint) -> GLboolean>>

typealias PFNGLRELEASEKEYEDMUTEXWIN32EXTPROCVar = CPointerVarOf<PFNGLRELEASEKEYEDMUTEXWIN32EXTPROC>
typealias PFNGLRELEASEKEYEDMUTEXWIN32EXTPROC = CPointer<CFunction<(GLuint, GLuint64) -> GLboolean>>

typealias PFNGLWINDOWRECTANGLESEXTPROCVar = CPointerVarOf<PFNGLWINDOWRECTANGLESEXTPROC>
typealias PFNGLWINDOWRECTANGLESEXTPROC = CPointer<CFunction<(GLenum, GLsizei, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLIMPORTSYNCEXTPROCVar = CPointerVarOf<PFNGLIMPORTSYNCEXTPROC>
typealias PFNGLIMPORTSYNCEXTPROC = CPointer<CFunction<(GLenum, GLintptr, GLbitfield) -> GLsync?>>

typealias PFNGLFRAMETERMINATORGREMEDYPROCVar = CPointerVarOf<PFNGLFRAMETERMINATORGREMEDYPROC>
typealias PFNGLFRAMETERMINATORGREMEDYPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLSTRINGMARKERGREMEDYPROCVar = CPointerVarOf<PFNGLSTRINGMARKERGREMEDYPROC>
typealias PFNGLSTRINGMARKERGREMEDYPROC = CPointer<CFunction<(GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLIMAGETRANSFORMPARAMETERIHPPROCVar = CPointerVarOf<PFNGLIMAGETRANSFORMPARAMETERIHPPROC>
typealias PFNGLIMAGETRANSFORMPARAMETERIHPPROC = CPointer<CFunction<(GLenum, GLenum, GLint) -> Unit>>

typealias PFNGLIMAGETRANSFORMPARAMETERFHPPROCVar = CPointerVarOf<PFNGLIMAGETRANSFORMPARAMETERFHPPROC>
typealias PFNGLIMAGETRANSFORMPARAMETERFHPPROC = CPointer<CFunction<(GLenum, GLenum, GLfloat) -> Unit>>

typealias PFNGLIMAGETRANSFORMPARAMETERIVHPPROCVar = CPointerVarOf<PFNGLIMAGETRANSFORMPARAMETERIVHPPROC>
typealias PFNGLIMAGETRANSFORMPARAMETERIVHPPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLIMAGETRANSFORMPARAMETERFVHPPROCVar = CPointerVarOf<PFNGLIMAGETRANSFORMPARAMETERFVHPPROC>
typealias PFNGLIMAGETRANSFORMPARAMETERFVHPPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETIMAGETRANSFORMPARAMETERIVHPPROCVar = CPointerVarOf<PFNGLGETIMAGETRANSFORMPARAMETERIVHPPROC>
typealias PFNGLGETIMAGETRANSFORMPARAMETERIVHPPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETIMAGETRANSFORMPARAMETERFVHPPROCVar = CPointerVarOf<PFNGLGETIMAGETRANSFORMPARAMETERFVHPPROC>
typealias PFNGLGETIMAGETRANSFORMPARAMETERFVHPPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLMULTIMODEDRAWARRAYSIBMPROCVar = CPointerVarOf<PFNGLMULTIMODEDRAWARRAYSIBMPROC>
typealias PFNGLMULTIMODEDRAWARRAYSIBMPROC = CPointer<CFunction<(CPointer<GLenumVar>?, CPointer<GLintVar>?, CPointer<GLsizeiVar>?, GLsizei, GLint) -> Unit>>

typealias PFNGLMULTIMODEDRAWELEMENTSIBMPROCVar = CPointerVarOf<PFNGLMULTIMODEDRAWELEMENTSIBMPROC>
typealias PFNGLMULTIMODEDRAWELEMENTSIBMPROC = CPointer<CFunction<(CPointer<GLenumVar>?, CPointer<GLsizeiVar>?, GLenum, CPointer<COpaquePointerVar>?, GLsizei, GLint) -> Unit>>

typealias PFNGLFLUSHSTATICDATAIBMPROCVar = CPointerVarOf<PFNGLFLUSHSTATICDATAIBMPROC>
typealias PFNGLFLUSHSTATICDATAIBMPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLCOLORPOINTERLISTIBMPROCVar = CPointerVarOf<PFNGLCOLORPOINTERLISTIBMPROC>
typealias PFNGLCOLORPOINTERLISTIBMPROC = CPointer<CFunction<(GLint, GLenum, GLint, CPointer<COpaquePointerVar>?, GLint) -> Unit>>

typealias PFNGLSECONDARYCOLORPOINTERLISTIBMPROCVar = CPointerVarOf<PFNGLSECONDARYCOLORPOINTERLISTIBMPROC>
typealias PFNGLSECONDARYCOLORPOINTERLISTIBMPROC = CPointer<CFunction<(GLint, GLenum, GLint, CPointer<COpaquePointerVar>?, GLint) -> Unit>>

typealias PFNGLEDGEFLAGPOINTERLISTIBMPROCVar = CPointerVarOf<PFNGLEDGEFLAGPOINTERLISTIBMPROC>
typealias PFNGLEDGEFLAGPOINTERLISTIBMPROC = CPointer<CFunction<(GLint, CPointer<CPointerVar<GLbooleanVar>>?, GLint) -> Unit>>

typealias PFNGLFOGCOORDPOINTERLISTIBMPROCVar = CPointerVarOf<PFNGLFOGCOORDPOINTERLISTIBMPROC>
typealias PFNGLFOGCOORDPOINTERLISTIBMPROC = CPointer<CFunction<(GLenum, GLint, CPointer<COpaquePointerVar>?, GLint) -> Unit>>

typealias PFNGLINDEXPOINTERLISTIBMPROCVar = CPointerVarOf<PFNGLINDEXPOINTERLISTIBMPROC>
typealias PFNGLINDEXPOINTERLISTIBMPROC = CPointer<CFunction<(GLenum, GLint, CPointer<COpaquePointerVar>?, GLint) -> Unit>>

typealias PFNGLNORMALPOINTERLISTIBMPROCVar = CPointerVarOf<PFNGLNORMALPOINTERLISTIBMPROC>
typealias PFNGLNORMALPOINTERLISTIBMPROC = CPointer<CFunction<(GLenum, GLint, CPointer<COpaquePointerVar>?, GLint) -> Unit>>

typealias PFNGLTEXCOORDPOINTERLISTIBMPROCVar = CPointerVarOf<PFNGLTEXCOORDPOINTERLISTIBMPROC>
typealias PFNGLTEXCOORDPOINTERLISTIBMPROC = CPointer<CFunction<(GLint, GLenum, GLint, CPointer<COpaquePointerVar>?, GLint) -> Unit>>

typealias PFNGLVERTEXPOINTERLISTIBMPROCVar = CPointerVarOf<PFNGLVERTEXPOINTERLISTIBMPROC>
typealias PFNGLVERTEXPOINTERLISTIBMPROC = CPointer<CFunction<(GLint, GLenum, GLint, CPointer<COpaquePointerVar>?, GLint) -> Unit>>

typealias PFNGLBLENDFUNCSEPARATEINGRPROCVar = CPointerVarOf<PFNGLBLENDFUNCSEPARATEINGRPROC>
typealias PFNGLBLENDFUNCSEPARATEINGRPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, GLenum) -> Unit>>

typealias PFNGLAPPLYFRAMEBUFFERATTACHMENTCMAAINTELPROCVar = CPointerVarOf<PFNGLAPPLYFRAMEBUFFERATTACHMENTCMAAINTELPROC>
typealias PFNGLAPPLYFRAMEBUFFERATTACHMENTCMAAINTELPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLSYNCTEXTUREINTELPROCVar = CPointerVarOf<PFNGLSYNCTEXTUREINTELPROC>
typealias PFNGLSYNCTEXTUREINTELPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLUNMAPTEXTURE2DINTELPROCVar = CPointerVarOf<PFNGLUNMAPTEXTURE2DINTELPROC>
typealias PFNGLUNMAPTEXTURE2DINTELPROC = CPointer<CFunction<(GLuint, GLint) -> Unit>>

typealias PFNGLMAPTEXTURE2DINTELPROCVar = CPointerVarOf<PFNGLMAPTEXTURE2DINTELPROC>
typealias PFNGLMAPTEXTURE2DINTELPROC = CPointer<CFunction<(GLuint, GLint, GLbitfield, CPointer<GLintVar>?, CPointer<GLenumVar>?) -> COpaquePointer?>>

typealias PFNGLVERTEXPOINTERVINTELPROCVar = CPointerVarOf<PFNGLVERTEXPOINTERVINTELPROC>
typealias PFNGLVERTEXPOINTERVINTELPROC = CPointer<CFunction<(GLint, GLenum, CPointer<COpaquePointerVar>?) -> Unit>>

typealias PFNGLNORMALPOINTERVINTELPROCVar = CPointerVarOf<PFNGLNORMALPOINTERVINTELPROC>
typealias PFNGLNORMALPOINTERVINTELPROC = CPointer<CFunction<(GLenum, CPointer<COpaquePointerVar>?) -> Unit>>

typealias PFNGLCOLORPOINTERVINTELPROCVar = CPointerVarOf<PFNGLCOLORPOINTERVINTELPROC>
typealias PFNGLCOLORPOINTERVINTELPROC = CPointer<CFunction<(GLint, GLenum, CPointer<COpaquePointerVar>?) -> Unit>>

typealias PFNGLTEXCOORDPOINTERVINTELPROCVar = CPointerVarOf<PFNGLTEXCOORDPOINTERVINTELPROC>
typealias PFNGLTEXCOORDPOINTERVINTELPROC = CPointer<CFunction<(GLint, GLenum, CPointer<COpaquePointerVar>?) -> Unit>>

typealias PFNGLBEGINPERFQUERYINTELPROCVar = CPointerVarOf<PFNGLBEGINPERFQUERYINTELPROC>
typealias PFNGLBEGINPERFQUERYINTELPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLCREATEPERFQUERYINTELPROCVar = CPointerVarOf<PFNGLCREATEPERFQUERYINTELPROC>
typealias PFNGLCREATEPERFQUERYINTELPROC = CPointer<CFunction<(GLuint, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLDELETEPERFQUERYINTELPROCVar = CPointerVarOf<PFNGLDELETEPERFQUERYINTELPROC>
typealias PFNGLDELETEPERFQUERYINTELPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLENDPERFQUERYINTELPROCVar = CPointerVarOf<PFNGLENDPERFQUERYINTELPROC>
typealias PFNGLENDPERFQUERYINTELPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLGETFIRSTPERFQUERYIDINTELPROCVar = CPointerVarOf<PFNGLGETFIRSTPERFQUERYIDINTELPROC>
typealias PFNGLGETFIRSTPERFQUERYIDINTELPROC = CPointer<CFunction<(CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGETNEXTPERFQUERYIDINTELPROCVar = CPointerVarOf<PFNGLGETNEXTPERFQUERYIDINTELPROC>
typealias PFNGLGETNEXTPERFQUERYIDINTELPROC = CPointer<CFunction<(GLuint, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGETPERFCOUNTERINFOINTELPROCVar = CPointerVarOf<PFNGLGETPERFCOUNTERINFOINTELPROC>
typealias PFNGLGETPERFCOUNTERINFOINTELPROC = CPointer<CFunction<(GLuint, GLuint, GLuint, CPointer<GLcharVar>?, GLuint, CPointer<GLcharVar>?, CPointer<GLuintVar>?, CPointer<GLuintVar>?, CPointer<GLuintVar>?, CPointer<GLuintVar>?, CPointer<GLuint64Var>?) -> Unit>>

typealias PFNGLGETPERFQUERYDATAINTELPROCVar = CPointerVarOf<PFNGLGETPERFQUERYDATAINTELPROC>
typealias PFNGLGETPERFQUERYDATAINTELPROC = CPointer<CFunction<(GLuint, GLuint, GLsizei, COpaquePointer?, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGETPERFQUERYIDBYNAMEINTELPROCVar = CPointerVarOf<PFNGLGETPERFQUERYIDBYNAMEINTELPROC>
typealias PFNGLGETPERFQUERYIDBYNAMEINTELPROC = CPointer<CFunction<(CPointer<GLcharVar>?, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGETPERFQUERYINFOINTELPROCVar = CPointerVarOf<PFNGLGETPERFQUERYINFOINTELPROC>
typealias PFNGLGETPERFQUERYINFOINTELPROC = CPointer<CFunction<(GLuint, GLuint, CPointer<GLcharVar>?, CPointer<GLuintVar>?, CPointer<GLuintVar>?, CPointer<GLuintVar>?, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLRESIZEBUFFERSMESAPROCVar = CPointerVarOf<PFNGLRESIZEBUFFERSMESAPROC>
typealias PFNGLRESIZEBUFFERSMESAPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLWINDOWPOS2DMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS2DMESAPROC>
typealias PFNGLWINDOWPOS2DMESAPROC = CPointer<CFunction<(GLdouble, GLdouble) -> Unit>>

typealias PFNGLWINDOWPOS2DVMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS2DVMESAPROC>
typealias PFNGLWINDOWPOS2DVMESAPROC = CPointer<CFunction<(CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLWINDOWPOS2FMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS2FMESAPROC>
typealias PFNGLWINDOWPOS2FMESAPROC = CPointer<CFunction<(GLfloat, GLfloat) -> Unit>>

typealias PFNGLWINDOWPOS2FVMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS2FVMESAPROC>
typealias PFNGLWINDOWPOS2FVMESAPROC = CPointer<CFunction<(CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLWINDOWPOS2IMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS2IMESAPROC>
typealias PFNGLWINDOWPOS2IMESAPROC = CPointer<CFunction<(GLint, GLint) -> Unit>>

typealias PFNGLWINDOWPOS2IVMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS2IVMESAPROC>
typealias PFNGLWINDOWPOS2IVMESAPROC = CPointer<CFunction<(CPointer<GLintVar>?) -> Unit>>

typealias PFNGLWINDOWPOS2SMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS2SMESAPROC>
typealias PFNGLWINDOWPOS2SMESAPROC = CPointer<CFunction<(GLshort, GLshort) -> Unit>>

typealias PFNGLWINDOWPOS2SVMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS2SVMESAPROC>
typealias PFNGLWINDOWPOS2SVMESAPROC = CPointer<CFunction<(CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLWINDOWPOS3DMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS3DMESAPROC>
typealias PFNGLWINDOWPOS3DMESAPROC = CPointer<CFunction<(GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLWINDOWPOS3DVMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS3DVMESAPROC>
typealias PFNGLWINDOWPOS3DVMESAPROC = CPointer<CFunction<(CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLWINDOWPOS3FMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS3FMESAPROC>
typealias PFNGLWINDOWPOS3FMESAPROC = CPointer<CFunction<(GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLWINDOWPOS3FVMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS3FVMESAPROC>
typealias PFNGLWINDOWPOS3FVMESAPROC = CPointer<CFunction<(CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLWINDOWPOS3IMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS3IMESAPROC>
typealias PFNGLWINDOWPOS3IMESAPROC = CPointer<CFunction<(GLint, GLint, GLint) -> Unit>>

typealias PFNGLWINDOWPOS3IVMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS3IVMESAPROC>
typealias PFNGLWINDOWPOS3IVMESAPROC = CPointer<CFunction<(CPointer<GLintVar>?) -> Unit>>

typealias PFNGLWINDOWPOS3SMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS3SMESAPROC>
typealias PFNGLWINDOWPOS3SMESAPROC = CPointer<CFunction<(GLshort, GLshort, GLshort) -> Unit>>

typealias PFNGLWINDOWPOS3SVMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS3SVMESAPROC>
typealias PFNGLWINDOWPOS3SVMESAPROC = CPointer<CFunction<(CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLWINDOWPOS4DMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS4DMESAPROC>
typealias PFNGLWINDOWPOS4DMESAPROC = CPointer<CFunction<(GLdouble, GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLWINDOWPOS4DVMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS4DVMESAPROC>
typealias PFNGLWINDOWPOS4DVMESAPROC = CPointer<CFunction<(CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLWINDOWPOS4FMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS4FMESAPROC>
typealias PFNGLWINDOWPOS4FMESAPROC = CPointer<CFunction<(GLfloat, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLWINDOWPOS4FVMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS4FVMESAPROC>
typealias PFNGLWINDOWPOS4FVMESAPROC = CPointer<CFunction<(CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLWINDOWPOS4IMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS4IMESAPROC>
typealias PFNGLWINDOWPOS4IMESAPROC = CPointer<CFunction<(GLint, GLint, GLint, GLint) -> Unit>>

typealias PFNGLWINDOWPOS4IVMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS4IVMESAPROC>
typealias PFNGLWINDOWPOS4IVMESAPROC = CPointer<CFunction<(CPointer<GLintVar>?) -> Unit>>

typealias PFNGLWINDOWPOS4SMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS4SMESAPROC>
typealias PFNGLWINDOWPOS4SMESAPROC = CPointer<CFunction<(GLshort, GLshort, GLshort, GLshort) -> Unit>>

typealias PFNGLWINDOWPOS4SVMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS4SVMESAPROC>
typealias PFNGLWINDOWPOS4SVMESAPROC = CPointer<CFunction<(CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLBEGINCONDITIONALRENDERNVXPROCVar = CPointerVarOf<PFNGLBEGINCONDITIONALRENDERNVXPROC>
typealias PFNGLBEGINCONDITIONALRENDERNVXPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLENDCONDITIONALRENDERNVXPROCVar = CPointerVarOf<PFNGLENDCONDITIONALRENDERNVXPROC>
typealias PFNGLENDCONDITIONALRENDERNVXPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLLGPUNAMEDBUFFERSUBDATANVXPROCVar = CPointerVarOf<PFNGLLGPUNAMEDBUFFERSUBDATANVXPROC>
typealias PFNGLLGPUNAMEDBUFFERSUBDATANVXPROC = CPointer<CFunction<(GLbitfield, GLuint, GLintptr, GLsizeiptr, COpaquePointer?) -> Unit>>

typealias PFNGLLGPUCOPYIMAGESUBDATANVXPROCVar = CPointerVarOf<PFNGLLGPUCOPYIMAGESUBDATANVXPROC>
typealias PFNGLLGPUCOPYIMAGESUBDATANVXPROC = CPointer<CFunction<(GLuint, GLbitfield, GLuint, GLenum, GLint, GLint, GLint, GLint, GLuint, GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei) -> Unit>>

typealias PFNGLLGPUINTERLOCKNVXPROCVar = CPointerVarOf<PFNGLLGPUINTERLOCKNVXPROC>
typealias PFNGLLGPUINTERLOCKNVXPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLALPHATOCOVERAGEDITHERCONTROLNVPROCVar = CPointerVarOf<PFNGLALPHATOCOVERAGEDITHERCONTROLNVPROC>
typealias PFNGLALPHATOCOVERAGEDITHERCONTROLNVPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLMULTIDRAWARRAYSINDIRECTBINDLESSNVPROCVar = CPointerVarOf<PFNGLMULTIDRAWARRAYSINDIRECTBINDLESSNVPROC>
typealias PFNGLMULTIDRAWARRAYSINDIRECTBINDLESSNVPROC = CPointer<CFunction<(GLenum, COpaquePointer?, GLsizei, GLsizei, GLint) -> Unit>>

typealias PFNGLMULTIDRAWELEMENTSINDIRECTBINDLESSNVPROCVar = CPointerVarOf<PFNGLMULTIDRAWELEMENTSINDIRECTBINDLESSNVPROC>
typealias PFNGLMULTIDRAWELEMENTSINDIRECTBINDLESSNVPROC = CPointer<CFunction<(GLenum, GLenum, COpaquePointer?, GLsizei, GLsizei, GLint) -> Unit>>

typealias PFNGLMULTIDRAWARRAYSINDIRECTBINDLESSCOUNTNVPROCVar = CPointerVarOf<PFNGLMULTIDRAWARRAYSINDIRECTBINDLESSCOUNTNVPROC>
typealias PFNGLMULTIDRAWARRAYSINDIRECTBINDLESSCOUNTNVPROC = CPointer<CFunction<(GLenum, COpaquePointer?, GLsizei, GLsizei, GLsizei, GLint) -> Unit>>

typealias PFNGLMULTIDRAWELEMENTSINDIRECTBINDLESSCOUNTNVPROCVar = CPointerVarOf<PFNGLMULTIDRAWELEMENTSINDIRECTBINDLESSCOUNTNVPROC>
typealias PFNGLMULTIDRAWELEMENTSINDIRECTBINDLESSCOUNTNVPROC = CPointer<CFunction<(GLenum, GLenum, COpaquePointer?, GLsizei, GLsizei, GLsizei, GLint) -> Unit>>

typealias PFNGLGETTEXTUREHANDLENVPROCVar = CPointerVarOf<PFNGLGETTEXTUREHANDLENVPROC>
typealias PFNGLGETTEXTUREHANDLENVPROC = CPointer<CFunction<(GLuint) -> GLuint64>>

typealias PFNGLGETTEXTURESAMPLERHANDLENVPROCVar = CPointerVarOf<PFNGLGETTEXTURESAMPLERHANDLENVPROC>
typealias PFNGLGETTEXTURESAMPLERHANDLENVPROC = CPointer<CFunction<(GLuint, GLuint) -> GLuint64>>

typealias PFNGLMAKETEXTUREHANDLERESIDENTNVPROCVar = CPointerVarOf<PFNGLMAKETEXTUREHANDLERESIDENTNVPROC>
typealias PFNGLMAKETEXTUREHANDLERESIDENTNVPROC = CPointer<CFunction<(GLuint64) -> Unit>>

typealias PFNGLMAKETEXTUREHANDLENONRESIDENTNVPROCVar = CPointerVarOf<PFNGLMAKETEXTUREHANDLENONRESIDENTNVPROC>
typealias PFNGLMAKETEXTUREHANDLENONRESIDENTNVPROC = CPointer<CFunction<(GLuint64) -> Unit>>

typealias PFNGLGETIMAGEHANDLENVPROCVar = CPointerVarOf<PFNGLGETIMAGEHANDLENVPROC>
typealias PFNGLGETIMAGEHANDLENVPROC = CPointer<CFunction<(GLuint, GLint, GLboolean, GLint, GLenum) -> GLuint64>>

typealias PFNGLMAKEIMAGEHANDLERESIDENTNVPROCVar = CPointerVarOf<PFNGLMAKEIMAGEHANDLERESIDENTNVPROC>
typealias PFNGLMAKEIMAGEHANDLERESIDENTNVPROC = CPointer<CFunction<(GLuint64, GLenum) -> Unit>>

typealias PFNGLMAKEIMAGEHANDLENONRESIDENTNVPROCVar = CPointerVarOf<PFNGLMAKEIMAGEHANDLENONRESIDENTNVPROC>
typealias PFNGLMAKEIMAGEHANDLENONRESIDENTNVPROC = CPointer<CFunction<(GLuint64) -> Unit>>

typealias PFNGLUNIFORMHANDLEUI64NVPROCVar = CPointerVarOf<PFNGLUNIFORMHANDLEUI64NVPROC>
typealias PFNGLUNIFORMHANDLEUI64NVPROC = CPointer<CFunction<(GLint, GLuint64) -> Unit>>

typealias PFNGLUNIFORMHANDLEUI64VNVPROCVar = CPointerVarOf<PFNGLUNIFORMHANDLEUI64VNVPROC>
typealias PFNGLUNIFORMHANDLEUI64VNVPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLuint64Var>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMHANDLEUI64NVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMHANDLEUI64NVPROC>
typealias PFNGLPROGRAMUNIFORMHANDLEUI64NVPROC = CPointer<CFunction<(GLuint, GLint, GLuint64) -> Unit>>

typealias PFNGLPROGRAMUNIFORMHANDLEUI64VNVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMHANDLEUI64VNVPROC>
typealias PFNGLPROGRAMUNIFORMHANDLEUI64VNVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLuint64Var>?) -> Unit>>

typealias PFNGLISTEXTUREHANDLERESIDENTNVPROCVar = CPointerVarOf<PFNGLISTEXTUREHANDLERESIDENTNVPROC>
typealias PFNGLISTEXTUREHANDLERESIDENTNVPROC = CPointer<CFunction<(GLuint64) -> GLboolean>>

typealias PFNGLISIMAGEHANDLERESIDENTNVPROCVar = CPointerVarOf<PFNGLISIMAGEHANDLERESIDENTNVPROC>
typealias PFNGLISIMAGEHANDLERESIDENTNVPROC = CPointer<CFunction<(GLuint64) -> GLboolean>>

typealias PFNGLBLENDPARAMETERINVPROCVar = CPointerVarOf<PFNGLBLENDPARAMETERINVPROC>
typealias PFNGLBLENDPARAMETERINVPROC = CPointer<CFunction<(GLenum, GLint) -> Unit>>

typealias PFNGLBLENDBARRIERNVPROCVar = CPointerVarOf<PFNGLBLENDBARRIERNVPROC>
typealias PFNGLBLENDBARRIERNVPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLVIEWPORTPOSITIONWSCALENVPROCVar = CPointerVarOf<PFNGLVIEWPORTPOSITIONWSCALENVPROC>
typealias PFNGLVIEWPORTPOSITIONWSCALENVPROC = CPointer<CFunction<(GLuint, GLfloat, GLfloat) -> Unit>>

typealias PFNGLCREATESTATESNVPROCVar = CPointerVarOf<PFNGLCREATESTATESNVPROC>
typealias PFNGLCREATESTATESNVPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLDELETESTATESNVPROCVar = CPointerVarOf<PFNGLDELETESTATESNVPROC>
typealias PFNGLDELETESTATESNVPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLISSTATENVPROCVar = CPointerVarOf<PFNGLISSTATENVPROC>
typealias PFNGLISSTATENVPROC = CPointer<CFunction<(GLuint) -> GLboolean>>

typealias PFNGLSTATECAPTURENVPROCVar = CPointerVarOf<PFNGLSTATECAPTURENVPROC>
typealias PFNGLSTATECAPTURENVPROC = CPointer<CFunction<(GLuint, GLenum) -> Unit>>

typealias PFNGLGETCOMMANDHEADERNVPROCVar = CPointerVarOf<PFNGLGETCOMMANDHEADERNVPROC>
typealias PFNGLGETCOMMANDHEADERNVPROC = CPointer<CFunction<(GLenum, GLuint) -> GLuint>>

typealias PFNGLGETSTAGEINDEXNVPROCVar = CPointerVarOf<PFNGLGETSTAGEINDEXNVPROC>
typealias PFNGLGETSTAGEINDEXNVPROC = CPointer<CFunction<(GLenum) -> GLushort>>

typealias PFNGLDRAWCOMMANDSNVPROCVar = CPointerVarOf<PFNGLDRAWCOMMANDSNVPROC>
typealias PFNGLDRAWCOMMANDSNVPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<GLintptrVar>?, CPointer<GLsizeiVar>?, GLuint) -> Unit>>

typealias PFNGLDRAWCOMMANDSADDRESSNVPROCVar = CPointerVarOf<PFNGLDRAWCOMMANDSADDRESSNVPROC>
typealias PFNGLDRAWCOMMANDSADDRESSNVPROC = CPointer<CFunction<(GLenum, CPointer<GLuint64Var>?, CPointer<GLsizeiVar>?, GLuint) -> Unit>>

typealias PFNGLDRAWCOMMANDSSTATESNVPROCVar = CPointerVarOf<PFNGLDRAWCOMMANDSSTATESNVPROC>
typealias PFNGLDRAWCOMMANDSSTATESNVPROC = CPointer<CFunction<(GLuint, CPointer<GLintptrVar>?, CPointer<GLsizeiVar>?, CPointer<GLuintVar>?, CPointer<GLuintVar>?, GLuint) -> Unit>>

typealias PFNGLDRAWCOMMANDSSTATESADDRESSNVPROCVar = CPointerVarOf<PFNGLDRAWCOMMANDSSTATESADDRESSNVPROC>
typealias PFNGLDRAWCOMMANDSSTATESADDRESSNVPROC = CPointer<CFunction<(CPointer<GLuint64Var>?, CPointer<GLsizeiVar>?, CPointer<GLuintVar>?, CPointer<GLuintVar>?, GLuint) -> Unit>>

typealias PFNGLCREATECOMMANDLISTSNVPROCVar = CPointerVarOf<PFNGLCREATECOMMANDLISTSNVPROC>
typealias PFNGLCREATECOMMANDLISTSNVPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLDELETECOMMANDLISTSNVPROCVar = CPointerVarOf<PFNGLDELETECOMMANDLISTSNVPROC>
typealias PFNGLDELETECOMMANDLISTSNVPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLISCOMMANDLISTNVPROCVar = CPointerVarOf<PFNGLISCOMMANDLISTNVPROC>
typealias PFNGLISCOMMANDLISTNVPROC = CPointer<CFunction<(GLuint) -> GLboolean>>

typealias PFNGLLISTDRAWCOMMANDSSTATESCLIENTNVPROCVar = CPointerVarOf<PFNGLLISTDRAWCOMMANDSSTATESCLIENTNVPROC>
typealias PFNGLLISTDRAWCOMMANDSSTATESCLIENTNVPROC = CPointer<CFunction<(GLuint, GLuint, CPointer<COpaquePointerVar>?, CPointer<GLsizeiVar>?, CPointer<GLuintVar>?, CPointer<GLuintVar>?, GLuint) -> Unit>>

typealias PFNGLCOMMANDLISTSEGMENTSNVPROCVar = CPointerVarOf<PFNGLCOMMANDLISTSEGMENTSNVPROC>
typealias PFNGLCOMMANDLISTSEGMENTSNVPROC = CPointer<CFunction<(GLuint, GLuint) -> Unit>>

typealias PFNGLCOMPILECOMMANDLISTNVPROCVar = CPointerVarOf<PFNGLCOMPILECOMMANDLISTNVPROC>
typealias PFNGLCOMPILECOMMANDLISTNVPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLCALLCOMMANDLISTNVPROCVar = CPointerVarOf<PFNGLCALLCOMMANDLISTNVPROC>
typealias PFNGLCALLCOMMANDLISTNVPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLBEGINCONDITIONALRENDERNVPROCVar = CPointerVarOf<PFNGLBEGINCONDITIONALRENDERNVPROC>
typealias PFNGLBEGINCONDITIONALRENDERNVPROC = CPointer<CFunction<(GLuint, GLenum) -> Unit>>

typealias PFNGLENDCONDITIONALRENDERNVPROCVar = CPointerVarOf<PFNGLENDCONDITIONALRENDERNVPROC>
typealias PFNGLENDCONDITIONALRENDERNVPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLSUBPIXELPRECISIONBIASNVPROCVar = CPointerVarOf<PFNGLSUBPIXELPRECISIONBIASNVPROC>
typealias PFNGLSUBPIXELPRECISIONBIASNVPROC = CPointer<CFunction<(GLuint, GLuint) -> Unit>>

typealias PFNGLCONSERVATIVERASTERPARAMETERFNVPROCVar = CPointerVarOf<PFNGLCONSERVATIVERASTERPARAMETERFNVPROC>
typealias PFNGLCONSERVATIVERASTERPARAMETERFNVPROC = CPointer<CFunction<(GLenum, GLfloat) -> Unit>>

typealias PFNGLCONSERVATIVERASTERPARAMETERINVPROCVar = CPointerVarOf<PFNGLCONSERVATIVERASTERPARAMETERINVPROC>
typealias PFNGLCONSERVATIVERASTERPARAMETERINVPROC = CPointer<CFunction<(GLenum, GLint) -> Unit>>

typealias PFNGLCOPYIMAGESUBDATANVPROCVar = CPointerVarOf<PFNGLCOPYIMAGESUBDATANVPROC>
typealias PFNGLCOPYIMAGESUBDATANVPROC = CPointer<CFunction<(GLuint, GLenum, GLint, GLint, GLint, GLint, GLuint, GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei) -> Unit>>

typealias PFNGLDEPTHRANGEDNVPROCVar = CPointerVarOf<PFNGLDEPTHRANGEDNVPROC>
typealias PFNGLDEPTHRANGEDNVPROC = CPointer<CFunction<(GLdouble, GLdouble) -> Unit>>

typealias PFNGLCLEARDEPTHDNVPROCVar = CPointerVarOf<PFNGLCLEARDEPTHDNVPROC>
typealias PFNGLCLEARDEPTHDNVPROC = CPointer<CFunction<(GLdouble) -> Unit>>

typealias PFNGLDEPTHBOUNDSDNVPROCVar = CPointerVarOf<PFNGLDEPTHBOUNDSDNVPROC>
typealias PFNGLDEPTHBOUNDSDNVPROC = CPointer<CFunction<(GLdouble, GLdouble) -> Unit>>

typealias PFNGLDRAWTEXTURENVPROCVar = CPointerVarOf<PFNGLDRAWTEXTURENVPROC>
typealias PFNGLDRAWTEXTURENVPROC = CPointer<CFunction<(GLuint, GLuint, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias GLVULKANPROCNVVar = CPointerVarOf<GLVULKANPROCNV>
typealias GLVULKANPROCNV = CPointer<CFunction<() -> Unit>>

typealias PFNGLDRAWVKIMAGENVPROCVar = CPointerVarOf<PFNGLDRAWVKIMAGENVPROC>
typealias PFNGLDRAWVKIMAGENVPROC = CPointer<CFunction<(GLuint64, GLuint, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLGETVKPROCADDRNVPROCVar = CPointerVarOf<PFNGLGETVKPROCADDRNVPROC>
typealias PFNGLGETVKPROCADDRNVPROC = CPointer<CFunction<(CPointer<GLcharVar>?) -> GLVULKANPROCNV?>>

typealias PFNGLWAITVKSEMAPHORENVPROCVar = CPointerVarOf<PFNGLWAITVKSEMAPHORENVPROC>
typealias PFNGLWAITVKSEMAPHORENVPROC = CPointer<CFunction<(GLuint64) -> Unit>>

typealias PFNGLSIGNALVKSEMAPHORENVPROCVar = CPointerVarOf<PFNGLSIGNALVKSEMAPHORENVPROC>
typealias PFNGLSIGNALVKSEMAPHORENVPROC = CPointer<CFunction<(GLuint64) -> Unit>>

typealias PFNGLSIGNALVKFENCENVPROCVar = CPointerVarOf<PFNGLSIGNALVKFENCENVPROC>
typealias PFNGLSIGNALVKFENCENVPROC = CPointer<CFunction<(GLuint64) -> Unit>>

typealias PFNGLMAPCONTROLPOINTSNVPROCVar = CPointerVarOf<PFNGLMAPCONTROLPOINTSNVPROC>
typealias PFNGLMAPCONTROLPOINTSNVPROC = CPointer<CFunction<(GLenum, GLuint, GLenum, GLsizei, GLsizei, GLint, GLint, GLboolean, COpaquePointer?) -> Unit>>

typealias PFNGLMAPPARAMETERIVNVPROCVar = CPointerVarOf<PFNGLMAPPARAMETERIVNVPROC>
typealias PFNGLMAPPARAMETERIVNVPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLMAPPARAMETERFVNVPROCVar = CPointerVarOf<PFNGLMAPPARAMETERFVNVPROC>
typealias PFNGLMAPPARAMETERFVNVPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETMAPCONTROLPOINTSNVPROCVar = CPointerVarOf<PFNGLGETMAPCONTROLPOINTSNVPROC>
typealias PFNGLGETMAPCONTROLPOINTSNVPROC = CPointer<CFunction<(GLenum, GLuint, GLenum, GLsizei, GLsizei, GLboolean, COpaquePointer?) -> Unit>>

typealias PFNGLGETMAPPARAMETERIVNVPROCVar = CPointerVarOf<PFNGLGETMAPPARAMETERIVNVPROC>
typealias PFNGLGETMAPPARAMETERIVNVPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETMAPPARAMETERFVNVPROCVar = CPointerVarOf<PFNGLGETMAPPARAMETERFVNVPROC>
typealias PFNGLGETMAPPARAMETERFVNVPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETMAPATTRIBPARAMETERIVNVPROCVar = CPointerVarOf<PFNGLGETMAPATTRIBPARAMETERIVNVPROC>
typealias PFNGLGETMAPATTRIBPARAMETERIVNVPROC = CPointer<CFunction<(GLenum, GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETMAPATTRIBPARAMETERFVNVPROCVar = CPointerVarOf<PFNGLGETMAPATTRIBPARAMETERFVNVPROC>
typealias PFNGLGETMAPATTRIBPARAMETERFVNVPROC = CPointer<CFunction<(GLenum, GLuint, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLEVALMAPSNVPROCVar = CPointerVarOf<PFNGLEVALMAPSNVPROC>
typealias PFNGLEVALMAPSNVPROC = CPointer<CFunction<(GLenum, GLenum) -> Unit>>

typealias PFNGLGETMULTISAMPLEFVNVPROCVar = CPointerVarOf<PFNGLGETMULTISAMPLEFVNVPROC>
typealias PFNGLGETMULTISAMPLEFVNVPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLSAMPLEMASKINDEXEDNVPROCVar = CPointerVarOf<PFNGLSAMPLEMASKINDEXEDNVPROC>
typealias PFNGLSAMPLEMASKINDEXEDNVPROC = CPointer<CFunction<(GLuint, GLbitfield) -> Unit>>

typealias PFNGLTEXRENDERBUFFERNVPROCVar = CPointerVarOf<PFNGLTEXRENDERBUFFERNVPROC>
typealias PFNGLTEXRENDERBUFFERNVPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLDELETEFENCESNVPROCVar = CPointerVarOf<PFNGLDELETEFENCESNVPROC>
typealias PFNGLDELETEFENCESNVPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGENFENCESNVPROCVar = CPointerVarOf<PFNGLGENFENCESNVPROC>
typealias PFNGLGENFENCESNVPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLISFENCENVPROCVar = CPointerVarOf<PFNGLISFENCENVPROC>
typealias PFNGLISFENCENVPROC = CPointer<CFunction<(GLuint) -> GLboolean>>

typealias PFNGLTESTFENCENVPROCVar = CPointerVarOf<PFNGLTESTFENCENVPROC>
typealias PFNGLTESTFENCENVPROC = CPointer<CFunction<(GLuint) -> GLboolean>>

typealias PFNGLGETFENCEIVNVPROCVar = CPointerVarOf<PFNGLGETFENCEIVNVPROC>
typealias PFNGLGETFENCEIVNVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLFINISHFENCENVPROCVar = CPointerVarOf<PFNGLFINISHFENCENVPROC>
typealias PFNGLFINISHFENCENVPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLSETFENCENVPROCVar = CPointerVarOf<PFNGLSETFENCENVPROC>
typealias PFNGLSETFENCENVPROC = CPointer<CFunction<(GLuint, GLenum) -> Unit>>

typealias PFNGLFRAGMENTCOVERAGECOLORNVPROCVar = CPointerVarOf<PFNGLFRAGMENTCOVERAGECOLORNVPROC>
typealias PFNGLFRAGMENTCOVERAGECOLORNVPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLPROGRAMNAMEDPARAMETER4FNVPROCVar = CPointerVarOf<PFNGLPROGRAMNAMEDPARAMETER4FNVPROC>
typealias PFNGLPROGRAMNAMEDPARAMETER4FNVPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLubyteVar>?, GLfloat, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLPROGRAMNAMEDPARAMETER4FVNVPROCVar = CPointerVarOf<PFNGLPROGRAMNAMEDPARAMETER4FVNVPROC>
typealias PFNGLPROGRAMNAMEDPARAMETER4FVNVPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLubyteVar>?, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPROGRAMNAMEDPARAMETER4DNVPROCVar = CPointerVarOf<PFNGLPROGRAMNAMEDPARAMETER4DNVPROC>
typealias PFNGLPROGRAMNAMEDPARAMETER4DNVPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLubyteVar>?, GLdouble, GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLPROGRAMNAMEDPARAMETER4DVNVPROCVar = CPointerVarOf<PFNGLPROGRAMNAMEDPARAMETER4DVNVPROC>
typealias PFNGLPROGRAMNAMEDPARAMETER4DVNVPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLubyteVar>?, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLGETPROGRAMNAMEDPARAMETERFVNVPROCVar = CPointerVarOf<PFNGLGETPROGRAMNAMEDPARAMETERFVNVPROC>
typealias PFNGLGETPROGRAMNAMEDPARAMETERFVNVPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLubyteVar>?, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETPROGRAMNAMEDPARAMETERDVNVPROCVar = CPointerVarOf<PFNGLGETPROGRAMNAMEDPARAMETERDVNVPROC>
typealias PFNGLGETPROGRAMNAMEDPARAMETERDVNVPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLubyteVar>?, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLCOVERAGEMODULATIONTABLENVPROCVar = CPointerVarOf<PFNGLCOVERAGEMODULATIONTABLENVPROC>
typealias PFNGLCOVERAGEMODULATIONTABLENVPROC = CPointer<CFunction<(GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETCOVERAGEMODULATIONTABLENVPROCVar = CPointerVarOf<PFNGLGETCOVERAGEMODULATIONTABLENVPROC>
typealias PFNGLGETCOVERAGEMODULATIONTABLENVPROC = CPointer<CFunction<(GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLCOVERAGEMODULATIONNVPROCVar = CPointerVarOf<PFNGLCOVERAGEMODULATIONNVPROC>
typealias PFNGLCOVERAGEMODULATIONNVPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLRENDERBUFFERSTORAGEMULTISAMPLECOVERAGENVPROCVar = CPointerVarOf<PFNGLRENDERBUFFERSTORAGEMULTISAMPLECOVERAGENVPROC>
typealias PFNGLRENDERBUFFERSTORAGEMULTISAMPLECOVERAGENVPROC = CPointer<CFunction<(GLenum, GLsizei, GLsizei, GLenum, GLsizei, GLsizei) -> Unit>>

typealias PFNGLPROGRAMVERTEXLIMITNVPROCVar = CPointerVarOf<PFNGLPROGRAMVERTEXLIMITNVPROC>
typealias PFNGLPROGRAMVERTEXLIMITNVPROC = CPointer<CFunction<(GLenum, GLint) -> Unit>>

typealias PFNGLFRAMEBUFFERTEXTUREEXTPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERTEXTUREEXTPROC>
typealias PFNGLFRAMEBUFFERTEXTUREEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLuint, GLint) -> Unit>>

typealias PFNGLFRAMEBUFFERTEXTUREFACEEXTPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERTEXTUREFACEEXTPROC>
typealias PFNGLFRAMEBUFFERTEXTUREFACEEXTPROC = CPointer<CFunction<(GLenum, GLenum, GLuint, GLint, GLenum) -> Unit>>

typealias PFNGLRENDERGPUMASKNVPROCVar = CPointerVarOf<PFNGLRENDERGPUMASKNVPROC>
typealias PFNGLRENDERGPUMASKNVPROC = CPointer<CFunction<(GLbitfield) -> Unit>>

typealias PFNGLMULTICASTBUFFERSUBDATANVPROCVar = CPointerVarOf<PFNGLMULTICASTBUFFERSUBDATANVPROC>
typealias PFNGLMULTICASTBUFFERSUBDATANVPROC = CPointer<CFunction<(GLbitfield, GLuint, GLintptr, GLsizeiptr, COpaquePointer?) -> Unit>>

typealias PFNGLMULTICASTCOPYBUFFERSUBDATANVPROCVar = CPointerVarOf<PFNGLMULTICASTCOPYBUFFERSUBDATANVPROC>
typealias PFNGLMULTICASTCOPYBUFFERSUBDATANVPROC = CPointer<CFunction<(GLuint, GLbitfield, GLuint, GLuint, GLintptr, GLintptr, GLsizeiptr) -> Unit>>

typealias PFNGLMULTICASTCOPYIMAGESUBDATANVPROCVar = CPointerVarOf<PFNGLMULTICASTCOPYIMAGESUBDATANVPROC>
typealias PFNGLMULTICASTCOPYIMAGESUBDATANVPROC = CPointer<CFunction<(GLuint, GLbitfield, GLuint, GLenum, GLint, GLint, GLint, GLint, GLuint, GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei) -> Unit>>

typealias PFNGLMULTICASTBLITFRAMEBUFFERNVPROCVar = CPointerVarOf<PFNGLMULTICASTBLITFRAMEBUFFERNVPROC>
typealias PFNGLMULTICASTBLITFRAMEBUFFERNVPROC = CPointer<CFunction<(GLuint, GLuint, GLint, GLint, GLint, GLint, GLint, GLint, GLint, GLint, GLbitfield, GLenum) -> Unit>>

typealias PFNGLMULTICASTFRAMEBUFFERSAMPLELOCATIONSFVNVPROCVar = CPointerVarOf<PFNGLMULTICASTFRAMEBUFFERSAMPLELOCATIONSFVNVPROC>
typealias PFNGLMULTICASTFRAMEBUFFERSAMPLELOCATIONSFVNVPROC = CPointer<CFunction<(GLuint, GLuint, GLuint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLMULTICASTBARRIERNVPROCVar = CPointerVarOf<PFNGLMULTICASTBARRIERNVPROC>
typealias PFNGLMULTICASTBARRIERNVPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLMULTICASTWAITSYNCNVPROCVar = CPointerVarOf<PFNGLMULTICASTWAITSYNCNVPROC>
typealias PFNGLMULTICASTWAITSYNCNVPROC = CPointer<CFunction<(GLuint, GLbitfield) -> Unit>>

typealias PFNGLMULTICASTGETQUERYOBJECTIVNVPROCVar = CPointerVarOf<PFNGLMULTICASTGETQUERYOBJECTIVNVPROC>
typealias PFNGLMULTICASTGETQUERYOBJECTIVNVPROC = CPointer<CFunction<(GLuint, GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLMULTICASTGETQUERYOBJECTUIVNVPROCVar = CPointerVarOf<PFNGLMULTICASTGETQUERYOBJECTUIVNVPROC>
typealias PFNGLMULTICASTGETQUERYOBJECTUIVNVPROC = CPointer<CFunction<(GLuint, GLuint, GLenum, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLMULTICASTGETQUERYOBJECTI64VNVPROCVar = CPointerVarOf<PFNGLMULTICASTGETQUERYOBJECTI64VNVPROC>
typealias PFNGLMULTICASTGETQUERYOBJECTI64VNVPROC = CPointer<CFunction<(GLuint, GLuint, GLenum, CPointer<GLint64Var>?) -> Unit>>

typealias PFNGLMULTICASTGETQUERYOBJECTUI64VNVPROCVar = CPointerVarOf<PFNGLMULTICASTGETQUERYOBJECTUI64VNVPROC>
typealias PFNGLMULTICASTGETQUERYOBJECTUI64VNVPROC = CPointer<CFunction<(GLuint, GLuint, GLenum, CPointer<GLuint64Var>?) -> Unit>>

typealias PFNGLPROGRAMLOCALPARAMETERI4INVPROCVar = CPointerVarOf<PFNGLPROGRAMLOCALPARAMETERI4INVPROC>
typealias PFNGLPROGRAMLOCALPARAMETERI4INVPROC = CPointer<CFunction<(GLenum, GLuint, GLint, GLint, GLint, GLint) -> Unit>>

typealias PFNGLPROGRAMLOCALPARAMETERI4IVNVPROCVar = CPointerVarOf<PFNGLPROGRAMLOCALPARAMETERI4IVNVPROC>
typealias PFNGLPROGRAMLOCALPARAMETERI4IVNVPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLPROGRAMLOCALPARAMETERSI4IVNVPROCVar = CPointerVarOf<PFNGLPROGRAMLOCALPARAMETERSI4IVNVPROC>
typealias PFNGLPROGRAMLOCALPARAMETERSI4IVNVPROC = CPointer<CFunction<(GLenum, GLuint, GLsizei, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLPROGRAMLOCALPARAMETERI4UINVPROCVar = CPointerVarOf<PFNGLPROGRAMLOCALPARAMETERI4UINVPROC>
typealias PFNGLPROGRAMLOCALPARAMETERI4UINVPROC = CPointer<CFunction<(GLenum, GLuint, GLuint, GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLPROGRAMLOCALPARAMETERI4UIVNVPROCVar = CPointerVarOf<PFNGLPROGRAMLOCALPARAMETERI4UIVNVPROC>
typealias PFNGLPROGRAMLOCALPARAMETERI4UIVNVPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLPROGRAMLOCALPARAMETERSI4UIVNVPROCVar = CPointerVarOf<PFNGLPROGRAMLOCALPARAMETERSI4UIVNVPROC>
typealias PFNGLPROGRAMLOCALPARAMETERSI4UIVNVPROC = CPointer<CFunction<(GLenum, GLuint, GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLPROGRAMENVPARAMETERI4INVPROCVar = CPointerVarOf<PFNGLPROGRAMENVPARAMETERI4INVPROC>
typealias PFNGLPROGRAMENVPARAMETERI4INVPROC = CPointer<CFunction<(GLenum, GLuint, GLint, GLint, GLint, GLint) -> Unit>>

typealias PFNGLPROGRAMENVPARAMETERI4IVNVPROCVar = CPointerVarOf<PFNGLPROGRAMENVPARAMETERI4IVNVPROC>
typealias PFNGLPROGRAMENVPARAMETERI4IVNVPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLPROGRAMENVPARAMETERSI4IVNVPROCVar = CPointerVarOf<PFNGLPROGRAMENVPARAMETERSI4IVNVPROC>
typealias PFNGLPROGRAMENVPARAMETERSI4IVNVPROC = CPointer<CFunction<(GLenum, GLuint, GLsizei, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLPROGRAMENVPARAMETERI4UINVPROCVar = CPointerVarOf<PFNGLPROGRAMENVPARAMETERI4UINVPROC>
typealias PFNGLPROGRAMENVPARAMETERI4UINVPROC = CPointer<CFunction<(GLenum, GLuint, GLuint, GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLPROGRAMENVPARAMETERI4UIVNVPROCVar = CPointerVarOf<PFNGLPROGRAMENVPARAMETERI4UIVNVPROC>
typealias PFNGLPROGRAMENVPARAMETERI4UIVNVPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLPROGRAMENVPARAMETERSI4UIVNVPROCVar = CPointerVarOf<PFNGLPROGRAMENVPARAMETERSI4UIVNVPROC>
typealias PFNGLPROGRAMENVPARAMETERSI4UIVNVPROC = CPointer<CFunction<(GLenum, GLuint, GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGETPROGRAMLOCALPARAMETERIIVNVPROCVar = CPointerVarOf<PFNGLGETPROGRAMLOCALPARAMETERIIVNVPROC>
typealias PFNGLGETPROGRAMLOCALPARAMETERIIVNVPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETPROGRAMLOCALPARAMETERIUIVNVPROCVar = CPointerVarOf<PFNGLGETPROGRAMLOCALPARAMETERIUIVNVPROC>
typealias PFNGLGETPROGRAMLOCALPARAMETERIUIVNVPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGETPROGRAMENVPARAMETERIIVNVPROCVar = CPointerVarOf<PFNGLGETPROGRAMENVPARAMETERIIVNVPROC>
typealias PFNGLGETPROGRAMENVPARAMETERIIVNVPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETPROGRAMENVPARAMETERIUIVNVPROCVar = CPointerVarOf<PFNGLGETPROGRAMENVPARAMETERIUIVNVPROC>
typealias PFNGLGETPROGRAMENVPARAMETERIUIVNVPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLPROGRAMSUBROUTINEPARAMETERSUIVNVPROCVar = CPointerVarOf<PFNGLPROGRAMSUBROUTINEPARAMETERSUIVNVPROC>
typealias PFNGLPROGRAMSUBROUTINEPARAMETERSUIVNVPROC = CPointer<CFunction<(GLenum, GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGETPROGRAMSUBROUTINEPARAMETERUIVNVPROCVar = CPointerVarOf<PFNGLGETPROGRAMSUBROUTINEPARAMETERUIVNVPROC>
typealias PFNGLGETPROGRAMSUBROUTINEPARAMETERUIVNVPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<GLuintVar>?) -> Unit>>

typealias GLhalfNVVar = UShortVarOf<GLhalfNV>
typealias GLhalfNV = UShort

typealias PFNGLVERTEX2HNVPROCVar = CPointerVarOf<PFNGLVERTEX2HNVPROC>
typealias PFNGLVERTEX2HNVPROC = CPointer<CFunction<(GLhalfNV, GLhalfNV) -> Unit>>

typealias PFNGLVERTEX2HVNVPROCVar = CPointerVarOf<PFNGLVERTEX2HVNVPROC>
typealias PFNGLVERTEX2HVNVPROC = CPointer<CFunction<(CPointer<GLhalfNVVar>?) -> Unit>>

typealias PFNGLVERTEX3HNVPROCVar = CPointerVarOf<PFNGLVERTEX3HNVPROC>
typealias PFNGLVERTEX3HNVPROC = CPointer<CFunction<(GLhalfNV, GLhalfNV, GLhalfNV) -> Unit>>

typealias PFNGLVERTEX3HVNVPROCVar = CPointerVarOf<PFNGLVERTEX3HVNVPROC>
typealias PFNGLVERTEX3HVNVPROC = CPointer<CFunction<(CPointer<GLhalfNVVar>?) -> Unit>>

typealias PFNGLVERTEX4HNVPROCVar = CPointerVarOf<PFNGLVERTEX4HNVPROC>
typealias PFNGLVERTEX4HNVPROC = CPointer<CFunction<(GLhalfNV, GLhalfNV, GLhalfNV, GLhalfNV) -> Unit>>

typealias PFNGLVERTEX4HVNVPROCVar = CPointerVarOf<PFNGLVERTEX4HVNVPROC>
typealias PFNGLVERTEX4HVNVPROC = CPointer<CFunction<(CPointer<GLhalfNVVar>?) -> Unit>>

typealias PFNGLNORMAL3HNVPROCVar = CPointerVarOf<PFNGLNORMAL3HNVPROC>
typealias PFNGLNORMAL3HNVPROC = CPointer<CFunction<(GLhalfNV, GLhalfNV, GLhalfNV) -> Unit>>

typealias PFNGLNORMAL3HVNVPROCVar = CPointerVarOf<PFNGLNORMAL3HVNVPROC>
typealias PFNGLNORMAL3HVNVPROC = CPointer<CFunction<(CPointer<GLhalfNVVar>?) -> Unit>>

typealias PFNGLCOLOR3HNVPROCVar = CPointerVarOf<PFNGLCOLOR3HNVPROC>
typealias PFNGLCOLOR3HNVPROC = CPointer<CFunction<(GLhalfNV, GLhalfNV, GLhalfNV) -> Unit>>

typealias PFNGLCOLOR3HVNVPROCVar = CPointerVarOf<PFNGLCOLOR3HVNVPROC>
typealias PFNGLCOLOR3HVNVPROC = CPointer<CFunction<(CPointer<GLhalfNVVar>?) -> Unit>>

typealias PFNGLCOLOR4HNVPROCVar = CPointerVarOf<PFNGLCOLOR4HNVPROC>
typealias PFNGLCOLOR4HNVPROC = CPointer<CFunction<(GLhalfNV, GLhalfNV, GLhalfNV, GLhalfNV) -> Unit>>

typealias PFNGLCOLOR4HVNVPROCVar = CPointerVarOf<PFNGLCOLOR4HVNVPROC>
typealias PFNGLCOLOR4HVNVPROC = CPointer<CFunction<(CPointer<GLhalfNVVar>?) -> Unit>>

typealias PFNGLTEXCOORD1HNVPROCVar = CPointerVarOf<PFNGLTEXCOORD1HNVPROC>
typealias PFNGLTEXCOORD1HNVPROC = CPointer<CFunction<(GLhalfNV) -> Unit>>

typealias PFNGLTEXCOORD1HVNVPROCVar = CPointerVarOf<PFNGLTEXCOORD1HVNVPROC>
typealias PFNGLTEXCOORD1HVNVPROC = CPointer<CFunction<(CPointer<GLhalfNVVar>?) -> Unit>>

typealias PFNGLTEXCOORD2HNVPROCVar = CPointerVarOf<PFNGLTEXCOORD2HNVPROC>
typealias PFNGLTEXCOORD2HNVPROC = CPointer<CFunction<(GLhalfNV, GLhalfNV) -> Unit>>

typealias PFNGLTEXCOORD2HVNVPROCVar = CPointerVarOf<PFNGLTEXCOORD2HVNVPROC>
typealias PFNGLTEXCOORD2HVNVPROC = CPointer<CFunction<(CPointer<GLhalfNVVar>?) -> Unit>>

typealias PFNGLTEXCOORD3HNVPROCVar = CPointerVarOf<PFNGLTEXCOORD3HNVPROC>
typealias PFNGLTEXCOORD3HNVPROC = CPointer<CFunction<(GLhalfNV, GLhalfNV, GLhalfNV) -> Unit>>

typealias PFNGLTEXCOORD3HVNVPROCVar = CPointerVarOf<PFNGLTEXCOORD3HVNVPROC>
typealias PFNGLTEXCOORD3HVNVPROC = CPointer<CFunction<(CPointer<GLhalfNVVar>?) -> Unit>>

typealias PFNGLTEXCOORD4HNVPROCVar = CPointerVarOf<PFNGLTEXCOORD4HNVPROC>
typealias PFNGLTEXCOORD4HNVPROC = CPointer<CFunction<(GLhalfNV, GLhalfNV, GLhalfNV, GLhalfNV) -> Unit>>

typealias PFNGLTEXCOORD4HVNVPROCVar = CPointerVarOf<PFNGLTEXCOORD4HVNVPROC>
typealias PFNGLTEXCOORD4HVNVPROC = CPointer<CFunction<(CPointer<GLhalfNVVar>?) -> Unit>>

typealias PFNGLMULTITEXCOORD1HNVPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD1HNVPROC>
typealias PFNGLMULTITEXCOORD1HNVPROC = CPointer<CFunction<(GLenum, GLhalfNV) -> Unit>>

typealias PFNGLMULTITEXCOORD1HVNVPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD1HVNVPROC>
typealias PFNGLMULTITEXCOORD1HVNVPROC = CPointer<CFunction<(GLenum, CPointer<GLhalfNVVar>?) -> Unit>>

typealias PFNGLMULTITEXCOORD2HNVPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD2HNVPROC>
typealias PFNGLMULTITEXCOORD2HNVPROC = CPointer<CFunction<(GLenum, GLhalfNV, GLhalfNV) -> Unit>>

typealias PFNGLMULTITEXCOORD2HVNVPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD2HVNVPROC>
typealias PFNGLMULTITEXCOORD2HVNVPROC = CPointer<CFunction<(GLenum, CPointer<GLhalfNVVar>?) -> Unit>>

typealias PFNGLMULTITEXCOORD3HNVPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD3HNVPROC>
typealias PFNGLMULTITEXCOORD3HNVPROC = CPointer<CFunction<(GLenum, GLhalfNV, GLhalfNV, GLhalfNV) -> Unit>>

typealias PFNGLMULTITEXCOORD3HVNVPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD3HVNVPROC>
typealias PFNGLMULTITEXCOORD3HVNVPROC = CPointer<CFunction<(GLenum, CPointer<GLhalfNVVar>?) -> Unit>>

typealias PFNGLMULTITEXCOORD4HNVPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD4HNVPROC>
typealias PFNGLMULTITEXCOORD4HNVPROC = CPointer<CFunction<(GLenum, GLhalfNV, GLhalfNV, GLhalfNV, GLhalfNV) -> Unit>>

typealias PFNGLMULTITEXCOORD4HVNVPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD4HVNVPROC>
typealias PFNGLMULTITEXCOORD4HVNVPROC = CPointer<CFunction<(GLenum, CPointer<GLhalfNVVar>?) -> Unit>>

typealias PFNGLFOGCOORDHNVPROCVar = CPointerVarOf<PFNGLFOGCOORDHNVPROC>
typealias PFNGLFOGCOORDHNVPROC = CPointer<CFunction<(GLhalfNV) -> Unit>>

typealias PFNGLFOGCOORDHVNVPROCVar = CPointerVarOf<PFNGLFOGCOORDHVNVPROC>
typealias PFNGLFOGCOORDHVNVPROC = CPointer<CFunction<(CPointer<GLhalfNVVar>?) -> Unit>>

typealias PFNGLSECONDARYCOLOR3HNVPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3HNVPROC>
typealias PFNGLSECONDARYCOLOR3HNVPROC = CPointer<CFunction<(GLhalfNV, GLhalfNV, GLhalfNV) -> Unit>>

typealias PFNGLSECONDARYCOLOR3HVNVPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3HVNVPROC>
typealias PFNGLSECONDARYCOLOR3HVNVPROC = CPointer<CFunction<(CPointer<GLhalfNVVar>?) -> Unit>>

typealias PFNGLVERTEXWEIGHTHNVPROCVar = CPointerVarOf<PFNGLVERTEXWEIGHTHNVPROC>
typealias PFNGLVERTEXWEIGHTHNVPROC = CPointer<CFunction<(GLhalfNV) -> Unit>>

typealias PFNGLVERTEXWEIGHTHVNVPROCVar = CPointerVarOf<PFNGLVERTEXWEIGHTHVNVPROC>
typealias PFNGLVERTEXWEIGHTHVNVPROC = CPointer<CFunction<(CPointer<GLhalfNVVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB1HNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1HNVPROC>
typealias PFNGLVERTEXATTRIB1HNVPROC = CPointer<CFunction<(GLuint, GLhalfNV) -> Unit>>

typealias PFNGLVERTEXATTRIB1HVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1HVNVPROC>
typealias PFNGLVERTEXATTRIB1HVNVPROC = CPointer<CFunction<(GLuint, CPointer<GLhalfNVVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB2HNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2HNVPROC>
typealias PFNGLVERTEXATTRIB2HNVPROC = CPointer<CFunction<(GLuint, GLhalfNV, GLhalfNV) -> Unit>>

typealias PFNGLVERTEXATTRIB2HVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2HVNVPROC>
typealias PFNGLVERTEXATTRIB2HVNVPROC = CPointer<CFunction<(GLuint, CPointer<GLhalfNVVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB3HNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3HNVPROC>
typealias PFNGLVERTEXATTRIB3HNVPROC = CPointer<CFunction<(GLuint, GLhalfNV, GLhalfNV, GLhalfNV) -> Unit>>

typealias PFNGLVERTEXATTRIB3HVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3HVNVPROC>
typealias PFNGLVERTEXATTRIB3HVNVPROC = CPointer<CFunction<(GLuint, CPointer<GLhalfNVVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4HNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4HNVPROC>
typealias PFNGLVERTEXATTRIB4HNVPROC = CPointer<CFunction<(GLuint, GLhalfNV, GLhalfNV, GLhalfNV, GLhalfNV) -> Unit>>

typealias PFNGLVERTEXATTRIB4HVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4HVNVPROC>
typealias PFNGLVERTEXATTRIB4HVNVPROC = CPointer<CFunction<(GLuint, CPointer<GLhalfNVVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBS1HVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBS1HVNVPROC>
typealias PFNGLVERTEXATTRIBS1HVNVPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLhalfNVVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBS2HVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBS2HVNVPROC>
typealias PFNGLVERTEXATTRIBS2HVNVPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLhalfNVVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBS3HVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBS3HVNVPROC>
typealias PFNGLVERTEXATTRIBS3HVNVPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLhalfNVVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBS4HVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBS4HVNVPROC>
typealias PFNGLVERTEXATTRIBS4HVNVPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLhalfNVVar>?) -> Unit>>

typealias PFNGLGETINTERNALFORMATSAMPLEIVNVPROCVar = CPointerVarOf<PFNGLGETINTERNALFORMATSAMPLEIVNVPROC>
typealias PFNGLGETINTERNALFORMATSAMPLEIVNVPROC = CPointer<CFunction<(GLenum, GLenum, GLsizei, GLenum, GLsizei, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGENOCCLUSIONQUERIESNVPROCVar = CPointerVarOf<PFNGLGENOCCLUSIONQUERIESNVPROC>
typealias PFNGLGENOCCLUSIONQUERIESNVPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLDELETEOCCLUSIONQUERIESNVPROCVar = CPointerVarOf<PFNGLDELETEOCCLUSIONQUERIESNVPROC>
typealias PFNGLDELETEOCCLUSIONQUERIESNVPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLISOCCLUSIONQUERYNVPROCVar = CPointerVarOf<PFNGLISOCCLUSIONQUERYNVPROC>
typealias PFNGLISOCCLUSIONQUERYNVPROC = CPointer<CFunction<(GLuint) -> GLboolean>>

typealias PFNGLBEGINOCCLUSIONQUERYNVPROCVar = CPointerVarOf<PFNGLBEGINOCCLUSIONQUERYNVPROC>
typealias PFNGLBEGINOCCLUSIONQUERYNVPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLENDOCCLUSIONQUERYNVPROCVar = CPointerVarOf<PFNGLENDOCCLUSIONQUERYNVPROC>
typealias PFNGLENDOCCLUSIONQUERYNVPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLGETOCCLUSIONQUERYIVNVPROCVar = CPointerVarOf<PFNGLGETOCCLUSIONQUERYIVNVPROC>
typealias PFNGLGETOCCLUSIONQUERYIVNVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETOCCLUSIONQUERYUIVNVPROCVar = CPointerVarOf<PFNGLGETOCCLUSIONQUERYUIVNVPROC>
typealias PFNGLGETOCCLUSIONQUERYUIVNVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLPROGRAMBUFFERPARAMETERSFVNVPROCVar = CPointerVarOf<PFNGLPROGRAMBUFFERPARAMETERSFVNVPROC>
typealias PFNGLPROGRAMBUFFERPARAMETERSFVNVPROC = CPointer<CFunction<(GLenum, GLuint, GLuint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPROGRAMBUFFERPARAMETERSIIVNVPROCVar = CPointerVarOf<PFNGLPROGRAMBUFFERPARAMETERSIIVNVPROC>
typealias PFNGLPROGRAMBUFFERPARAMETERSIIVNVPROC = CPointer<CFunction<(GLenum, GLuint, GLuint, GLsizei, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLPROGRAMBUFFERPARAMETERSIUIVNVPROCVar = CPointerVarOf<PFNGLPROGRAMBUFFERPARAMETERSIUIVNVPROC>
typealias PFNGLPROGRAMBUFFERPARAMETERSIUIVNVPROC = CPointer<CFunction<(GLenum, GLuint, GLuint, GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGENPATHSNVPROCVar = CPointerVarOf<PFNGLGENPATHSNVPROC>
typealias PFNGLGENPATHSNVPROC = CPointer<CFunction<(GLsizei) -> GLuint>>

typealias PFNGLDELETEPATHSNVPROCVar = CPointerVarOf<PFNGLDELETEPATHSNVPROC>
typealias PFNGLDELETEPATHSNVPROC = CPointer<CFunction<(GLuint, GLsizei) -> Unit>>

typealias PFNGLISPATHNVPROCVar = CPointerVarOf<PFNGLISPATHNVPROC>
typealias PFNGLISPATHNVPROC = CPointer<CFunction<(GLuint) -> GLboolean>>

typealias PFNGLPATHCOMMANDSNVPROCVar = CPointerVarOf<PFNGLPATHCOMMANDSNVPROC>
typealias PFNGLPATHCOMMANDSNVPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLubyteVar>?, GLsizei, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLPATHCOORDSNVPROCVar = CPointerVarOf<PFNGLPATHCOORDSNVPROC>
typealias PFNGLPATHCOORDSNVPROC = CPointer<CFunction<(GLuint, GLsizei, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLPATHSUBCOMMANDSNVPROCVar = CPointerVarOf<PFNGLPATHSUBCOMMANDSNVPROC>
typealias PFNGLPATHSUBCOMMANDSNVPROC = CPointer<CFunction<(GLuint, GLsizei, GLsizei, GLsizei, CPointer<GLubyteVar>?, GLsizei, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLPATHSUBCOORDSNVPROCVar = CPointerVarOf<PFNGLPATHSUBCOORDSNVPROC>
typealias PFNGLPATHSUBCOORDSNVPROC = CPointer<CFunction<(GLuint, GLsizei, GLsizei, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLPATHSTRINGNVPROCVar = CPointerVarOf<PFNGLPATHSTRINGNVPROC>
typealias PFNGLPATHSTRINGNVPROC = CPointer<CFunction<(GLuint, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLPATHGLYPHSNVPROCVar = CPointerVarOf<PFNGLPATHGLYPHSNVPROC>
typealias PFNGLPATHGLYPHSNVPROC = CPointer<CFunction<(GLuint, GLenum, COpaquePointer?, GLbitfield, GLsizei, GLenum, COpaquePointer?, GLenum, GLuint, GLfloat) -> Unit>>

typealias PFNGLPATHGLYPHRANGENVPROCVar = CPointerVarOf<PFNGLPATHGLYPHRANGENVPROC>
typealias PFNGLPATHGLYPHRANGENVPROC = CPointer<CFunction<(GLuint, GLenum, COpaquePointer?, GLbitfield, GLuint, GLsizei, GLenum, GLuint, GLfloat) -> Unit>>

typealias PFNGLWEIGHTPATHSNVPROCVar = CPointerVarOf<PFNGLWEIGHTPATHSNVPROC>
typealias PFNGLWEIGHTPATHSNVPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLuintVar>?, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLCOPYPATHNVPROCVar = CPointerVarOf<PFNGLCOPYPATHNVPROC>
typealias PFNGLCOPYPATHNVPROC = CPointer<CFunction<(GLuint, GLuint) -> Unit>>

typealias PFNGLINTERPOLATEPATHSNVPROCVar = CPointerVarOf<PFNGLINTERPOLATEPATHSNVPROC>
typealias PFNGLINTERPOLATEPATHSNVPROC = CPointer<CFunction<(GLuint, GLuint, GLuint, GLfloat) -> Unit>>

typealias PFNGLTRANSFORMPATHNVPROCVar = CPointerVarOf<PFNGLTRANSFORMPATHNVPROC>
typealias PFNGLTRANSFORMPATHNVPROC = CPointer<CFunction<(GLuint, GLuint, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPATHPARAMETERIVNVPROCVar = CPointerVarOf<PFNGLPATHPARAMETERIVNVPROC>
typealias PFNGLPATHPARAMETERIVNVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLPATHPARAMETERINVPROCVar = CPointerVarOf<PFNGLPATHPARAMETERINVPROC>
typealias PFNGLPATHPARAMETERINVPROC = CPointer<CFunction<(GLuint, GLenum, GLint) -> Unit>>

typealias PFNGLPATHPARAMETERFVNVPROCVar = CPointerVarOf<PFNGLPATHPARAMETERFVNVPROC>
typealias PFNGLPATHPARAMETERFVNVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPATHPARAMETERFNVPROCVar = CPointerVarOf<PFNGLPATHPARAMETERFNVPROC>
typealias PFNGLPATHPARAMETERFNVPROC = CPointer<CFunction<(GLuint, GLenum, GLfloat) -> Unit>>

typealias PFNGLPATHDASHARRAYNVPROCVar = CPointerVarOf<PFNGLPATHDASHARRAYNVPROC>
typealias PFNGLPATHDASHARRAYNVPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPATHSTENCILFUNCNVPROCVar = CPointerVarOf<PFNGLPATHSTENCILFUNCNVPROC>
typealias PFNGLPATHSTENCILFUNCNVPROC = CPointer<CFunction<(GLenum, GLint, GLuint) -> Unit>>

typealias PFNGLPATHSTENCILDEPTHOFFSETNVPROCVar = CPointerVarOf<PFNGLPATHSTENCILDEPTHOFFSETNVPROC>
typealias PFNGLPATHSTENCILDEPTHOFFSETNVPROC = CPointer<CFunction<(GLfloat, GLfloat) -> Unit>>

typealias PFNGLSTENCILFILLPATHNVPROCVar = CPointerVarOf<PFNGLSTENCILFILLPATHNVPROC>
typealias PFNGLSTENCILFILLPATHNVPROC = CPointer<CFunction<(GLuint, GLenum, GLuint) -> Unit>>

typealias PFNGLSTENCILSTROKEPATHNVPROCVar = CPointerVarOf<PFNGLSTENCILSTROKEPATHNVPROC>
typealias PFNGLSTENCILSTROKEPATHNVPROC = CPointer<CFunction<(GLuint, GLint, GLuint) -> Unit>>

typealias PFNGLSTENCILFILLPATHINSTANCEDNVPROCVar = CPointerVarOf<PFNGLSTENCILFILLPATHINSTANCEDNVPROC>
typealias PFNGLSTENCILFILLPATHINSTANCEDNVPROC = CPointer<CFunction<(GLsizei, GLenum, COpaquePointer?, GLuint, GLenum, GLuint, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLSTENCILSTROKEPATHINSTANCEDNVPROCVar = CPointerVarOf<PFNGLSTENCILSTROKEPATHINSTANCEDNVPROC>
typealias PFNGLSTENCILSTROKEPATHINSTANCEDNVPROC = CPointer<CFunction<(GLsizei, GLenum, COpaquePointer?, GLuint, GLint, GLuint, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPATHCOVERDEPTHFUNCNVPROCVar = CPointerVarOf<PFNGLPATHCOVERDEPTHFUNCNVPROC>
typealias PFNGLPATHCOVERDEPTHFUNCNVPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLCOVERFILLPATHNVPROCVar = CPointerVarOf<PFNGLCOVERFILLPATHNVPROC>
typealias PFNGLCOVERFILLPATHNVPROC = CPointer<CFunction<(GLuint, GLenum) -> Unit>>

typealias PFNGLCOVERSTROKEPATHNVPROCVar = CPointerVarOf<PFNGLCOVERSTROKEPATHNVPROC>
typealias PFNGLCOVERSTROKEPATHNVPROC = CPointer<CFunction<(GLuint, GLenum) -> Unit>>

typealias PFNGLCOVERFILLPATHINSTANCEDNVPROCVar = CPointerVarOf<PFNGLCOVERFILLPATHINSTANCEDNVPROC>
typealias PFNGLCOVERFILLPATHINSTANCEDNVPROC = CPointer<CFunction<(GLsizei, GLenum, COpaquePointer?, GLuint, GLenum, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLCOVERSTROKEPATHINSTANCEDNVPROCVar = CPointerVarOf<PFNGLCOVERSTROKEPATHINSTANCEDNVPROC>
typealias PFNGLCOVERSTROKEPATHINSTANCEDNVPROC = CPointer<CFunction<(GLsizei, GLenum, COpaquePointer?, GLuint, GLenum, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETPATHPARAMETERIVNVPROCVar = CPointerVarOf<PFNGLGETPATHPARAMETERIVNVPROC>
typealias PFNGLGETPATHPARAMETERIVNVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETPATHPARAMETERFVNVPROCVar = CPointerVarOf<PFNGLGETPATHPARAMETERFVNVPROC>
typealias PFNGLGETPATHPARAMETERFVNVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETPATHCOMMANDSNVPROCVar = CPointerVarOf<PFNGLGETPATHCOMMANDSNVPROC>
typealias PFNGLGETPATHCOMMANDSNVPROC = CPointer<CFunction<(GLuint, CPointer<GLubyteVar>?) -> Unit>>

typealias PFNGLGETPATHCOORDSNVPROCVar = CPointerVarOf<PFNGLGETPATHCOORDSNVPROC>
typealias PFNGLGETPATHCOORDSNVPROC = CPointer<CFunction<(GLuint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETPATHDASHARRAYNVPROCVar = CPointerVarOf<PFNGLGETPATHDASHARRAYNVPROC>
typealias PFNGLGETPATHDASHARRAYNVPROC = CPointer<CFunction<(GLuint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETPATHMETRICSNVPROCVar = CPointerVarOf<PFNGLGETPATHMETRICSNVPROC>
typealias PFNGLGETPATHMETRICSNVPROC = CPointer<CFunction<(GLbitfield, GLsizei, GLenum, COpaquePointer?, GLuint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETPATHMETRICRANGENVPROCVar = CPointerVarOf<PFNGLGETPATHMETRICRANGENVPROC>
typealias PFNGLGETPATHMETRICRANGENVPROC = CPointer<CFunction<(GLbitfield, GLuint, GLsizei, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETPATHSPACINGNVPROCVar = CPointerVarOf<PFNGLGETPATHSPACINGNVPROC>
typealias PFNGLGETPATHSPACINGNVPROC = CPointer<CFunction<(GLenum, GLsizei, GLenum, COpaquePointer?, GLuint, GLfloat, GLfloat, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLISPOINTINFILLPATHNVPROCVar = CPointerVarOf<PFNGLISPOINTINFILLPATHNVPROC>
typealias PFNGLISPOINTINFILLPATHNVPROC = CPointer<CFunction<(GLuint, GLuint, GLfloat, GLfloat) -> GLboolean>>

typealias PFNGLISPOINTINSTROKEPATHNVPROCVar = CPointerVarOf<PFNGLISPOINTINSTROKEPATHNVPROC>
typealias PFNGLISPOINTINSTROKEPATHNVPROC = CPointer<CFunction<(GLuint, GLfloat, GLfloat) -> GLboolean>>

typealias PFNGLGETPATHLENGTHNVPROCVar = CPointerVarOf<PFNGLGETPATHLENGTHNVPROC>
typealias PFNGLGETPATHLENGTHNVPROC = CPointer<CFunction<(GLuint, GLsizei, GLsizei) -> GLfloat>>

typealias PFNGLPOINTALONGPATHNVPROCVar = CPointerVarOf<PFNGLPOINTALONGPATHNVPROC>
typealias PFNGLPOINTALONGPATHNVPROC = CPointer<CFunction<(GLuint, GLsizei, GLsizei, GLfloat, CPointer<GLfloatVar>?, CPointer<GLfloatVar>?, CPointer<GLfloatVar>?, CPointer<GLfloatVar>?) -> GLboolean>>

typealias PFNGLMATRIXLOAD3X2FNVPROCVar = CPointerVarOf<PFNGLMATRIXLOAD3X2FNVPROC>
typealias PFNGLMATRIXLOAD3X2FNVPROC = CPointer<CFunction<(GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLMATRIXLOAD3X3FNVPROCVar = CPointerVarOf<PFNGLMATRIXLOAD3X3FNVPROC>
typealias PFNGLMATRIXLOAD3X3FNVPROC = CPointer<CFunction<(GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLMATRIXLOADTRANSPOSE3X3FNVPROCVar = CPointerVarOf<PFNGLMATRIXLOADTRANSPOSE3X3FNVPROC>
typealias PFNGLMATRIXLOADTRANSPOSE3X3FNVPROC = CPointer<CFunction<(GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLMATRIXMULT3X2FNVPROCVar = CPointerVarOf<PFNGLMATRIXMULT3X2FNVPROC>
typealias PFNGLMATRIXMULT3X2FNVPROC = CPointer<CFunction<(GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLMATRIXMULT3X3FNVPROCVar = CPointerVarOf<PFNGLMATRIXMULT3X3FNVPROC>
typealias PFNGLMATRIXMULT3X3FNVPROC = CPointer<CFunction<(GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLMATRIXMULTTRANSPOSE3X3FNVPROCVar = CPointerVarOf<PFNGLMATRIXMULTTRANSPOSE3X3FNVPROC>
typealias PFNGLMATRIXMULTTRANSPOSE3X3FNVPROC = CPointer<CFunction<(GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLSTENCILTHENCOVERFILLPATHNVPROCVar = CPointerVarOf<PFNGLSTENCILTHENCOVERFILLPATHNVPROC>
typealias PFNGLSTENCILTHENCOVERFILLPATHNVPROC = CPointer<CFunction<(GLuint, GLenum, GLuint, GLenum) -> Unit>>

typealias PFNGLSTENCILTHENCOVERSTROKEPATHNVPROCVar = CPointerVarOf<PFNGLSTENCILTHENCOVERSTROKEPATHNVPROC>
typealias PFNGLSTENCILTHENCOVERSTROKEPATHNVPROC = CPointer<CFunction<(GLuint, GLint, GLuint, GLenum) -> Unit>>

typealias PFNGLSTENCILTHENCOVERFILLPATHINSTANCEDNVPROCVar = CPointerVarOf<PFNGLSTENCILTHENCOVERFILLPATHINSTANCEDNVPROC>
typealias PFNGLSTENCILTHENCOVERFILLPATHINSTANCEDNVPROC = CPointer<CFunction<(GLsizei, GLenum, COpaquePointer?, GLuint, GLenum, GLuint, GLenum, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLSTENCILTHENCOVERSTROKEPATHINSTANCEDNVPROCVar = CPointerVarOf<PFNGLSTENCILTHENCOVERSTROKEPATHINSTANCEDNVPROC>
typealias PFNGLSTENCILTHENCOVERSTROKEPATHINSTANCEDNVPROC = CPointer<CFunction<(GLsizei, GLenum, COpaquePointer?, GLuint, GLint, GLuint, GLenum, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPATHGLYPHINDEXRANGENVPROCVar = CPointerVarOf<PFNGLPATHGLYPHINDEXRANGENVPROC>
typealias PFNGLPATHGLYPHINDEXRANGENVPROC = CPointer<CFunction<(GLenum, COpaquePointer?, GLbitfield, GLuint, GLfloat, CArrayPointer<GLuintVar>?) -> GLenum>>

typealias PFNGLPATHGLYPHINDEXARRAYNVPROCVar = CPointerVarOf<PFNGLPATHGLYPHINDEXARRAYNVPROC>
typealias PFNGLPATHGLYPHINDEXARRAYNVPROC = CPointer<CFunction<(GLuint, GLenum, COpaquePointer?, GLbitfield, GLuint, GLsizei, GLuint, GLfloat) -> GLenum>>

typealias PFNGLPATHMEMORYGLYPHINDEXARRAYNVPROCVar = CPointerVarOf<PFNGLPATHMEMORYGLYPHINDEXARRAYNVPROC>
typealias PFNGLPATHMEMORYGLYPHINDEXARRAYNVPROC = CPointer<CFunction<(GLuint, GLenum, GLsizeiptr, COpaquePointer?, GLsizei, GLuint, GLsizei, GLuint, GLfloat) -> GLenum>>

typealias PFNGLPROGRAMPATHFRAGMENTINPUTGENNVPROCVar = CPointerVarOf<PFNGLPROGRAMPATHFRAGMENTINPUTGENNVPROC>
typealias PFNGLPROGRAMPATHFRAGMENTINPUTGENNVPROC = CPointer<CFunction<(GLuint, GLint, GLenum, GLint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETPROGRAMRESOURCEFVNVPROCVar = CPointerVarOf<PFNGLGETPROGRAMRESOURCEFVNVPROC>
typealias PFNGLGETPROGRAMRESOURCEFVNVPROC = CPointer<CFunction<(GLuint, GLenum, GLuint, GLsizei, CPointer<GLenumVar>?, GLsizei, CPointer<GLsizeiVar>?, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPATHCOLORGENNVPROCVar = CPointerVarOf<PFNGLPATHCOLORGENNVPROC>
typealias PFNGLPATHCOLORGENNVPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPATHTEXGENNVPROCVar = CPointerVarOf<PFNGLPATHTEXGENNVPROC>
typealias PFNGLPATHTEXGENNVPROC = CPointer<CFunction<(GLenum, GLenum, GLint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPATHFOGGENNVPROCVar = CPointerVarOf<PFNGLPATHFOGGENNVPROC>
typealias PFNGLPATHFOGGENNVPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLGETPATHCOLORGENIVNVPROCVar = CPointerVarOf<PFNGLGETPATHCOLORGENIVNVPROC>
typealias PFNGLGETPATHCOLORGENIVNVPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETPATHCOLORGENFVNVPROCVar = CPointerVarOf<PFNGLGETPATHCOLORGENFVNVPROC>
typealias PFNGLGETPATHCOLORGENFVNVPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETPATHTEXGENIVNVPROCVar = CPointerVarOf<PFNGLGETPATHTEXGENIVNVPROC>
typealias PFNGLGETPATHTEXGENIVNVPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETPATHTEXGENFVNVPROCVar = CPointerVarOf<PFNGLGETPATHTEXGENFVNVPROC>
typealias PFNGLGETPATHTEXGENFVNVPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPIXELDATARANGENVPROCVar = CPointerVarOf<PFNGLPIXELDATARANGENVPROC>
typealias PFNGLPIXELDATARANGENVPROC = CPointer<CFunction<(GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLFLUSHPIXELDATARANGENVPROCVar = CPointerVarOf<PFNGLFLUSHPIXELDATARANGENVPROC>
typealias PFNGLFLUSHPIXELDATARANGENVPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLPOINTPARAMETERINVPROCVar = CPointerVarOf<PFNGLPOINTPARAMETERINVPROC>
typealias PFNGLPOINTPARAMETERINVPROC = CPointer<CFunction<(GLenum, GLint) -> Unit>>

typealias PFNGLPOINTPARAMETERIVNVPROCVar = CPointerVarOf<PFNGLPOINTPARAMETERIVNVPROC>
typealias PFNGLPOINTPARAMETERIVNVPROC = CPointer<CFunction<(GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLPRESENTFRAMEKEYEDNVPROCVar = CPointerVarOf<PFNGLPRESENTFRAMEKEYEDNVPROC>
typealias PFNGLPRESENTFRAMEKEYEDNVPROC = CPointer<CFunction<(GLuint, GLuint64EXT, GLuint, GLuint, GLenum, GLenum, GLuint, GLuint, GLenum, GLuint, GLuint) -> Unit>>

typealias PFNGLPRESENTFRAMEDUALFILLNVPROCVar = CPointerVarOf<PFNGLPRESENTFRAMEDUALFILLNVPROC>
typealias PFNGLPRESENTFRAMEDUALFILLNVPROC = CPointer<CFunction<(GLuint, GLuint64EXT, GLuint, GLuint, GLenum, GLenum, GLuint, GLenum, GLuint, GLenum, GLuint, GLenum, GLuint) -> Unit>>

typealias PFNGLGETVIDEOIVNVPROCVar = CPointerVarOf<PFNGLGETVIDEOIVNVPROC>
typealias PFNGLGETVIDEOIVNVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETVIDEOUIVNVPROCVar = CPointerVarOf<PFNGLGETVIDEOUIVNVPROC>
typealias PFNGLGETVIDEOUIVNVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGETVIDEOI64VNVPROCVar = CPointerVarOf<PFNGLGETVIDEOI64VNVPROC>
typealias PFNGLGETVIDEOI64VNVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLint64EXTVar>?) -> Unit>>

typealias PFNGLGETVIDEOUI64VNVPROCVar = CPointerVarOf<PFNGLGETVIDEOUI64VNVPROC>
typealias PFNGLGETVIDEOUI64VNVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLuint64EXTVar>?) -> Unit>>

typealias PFNGLPRIMITIVERESTARTNVPROCVar = CPointerVarOf<PFNGLPRIMITIVERESTARTNVPROC>
typealias PFNGLPRIMITIVERESTARTNVPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLPRIMITIVERESTARTINDEXNVPROCVar = CPointerVarOf<PFNGLPRIMITIVERESTARTINDEXNVPROC>
typealias PFNGLPRIMITIVERESTARTINDEXNVPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLQUERYRESOURCENVPROCVar = CPointerVarOf<PFNGLQUERYRESOURCENVPROC>
typealias PFNGLQUERYRESOURCENVPROC = CPointer<CFunction<(GLenum, GLint, GLuint, CPointer<GLintVar>?) -> GLint>>

typealias PFNGLGENQUERYRESOURCETAGNVPROCVar = CPointerVarOf<PFNGLGENQUERYRESOURCETAGNVPROC>
typealias PFNGLGENQUERYRESOURCETAGNVPROC = CPointer<CFunction<(GLsizei, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLDELETEQUERYRESOURCETAGNVPROCVar = CPointerVarOf<PFNGLDELETEQUERYRESOURCETAGNVPROC>
typealias PFNGLDELETEQUERYRESOURCETAGNVPROC = CPointer<CFunction<(GLsizei, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLQUERYRESOURCETAGNVPROCVar = CPointerVarOf<PFNGLQUERYRESOURCETAGNVPROC>
typealias PFNGLQUERYRESOURCETAGNVPROC = CPointer<CFunction<(GLint, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLCOMBINERPARAMETERFVNVPROCVar = CPointerVarOf<PFNGLCOMBINERPARAMETERFVNVPROC>
typealias PFNGLCOMBINERPARAMETERFVNVPROC = CPointer<CFunction<(GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLCOMBINERPARAMETERFNVPROCVar = CPointerVarOf<PFNGLCOMBINERPARAMETERFNVPROC>
typealias PFNGLCOMBINERPARAMETERFNVPROC = CPointer<CFunction<(GLenum, GLfloat) -> Unit>>

typealias PFNGLCOMBINERPARAMETERIVNVPROCVar = CPointerVarOf<PFNGLCOMBINERPARAMETERIVNVPROC>
typealias PFNGLCOMBINERPARAMETERIVNVPROC = CPointer<CFunction<(GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLCOMBINERPARAMETERINVPROCVar = CPointerVarOf<PFNGLCOMBINERPARAMETERINVPROC>
typealias PFNGLCOMBINERPARAMETERINVPROC = CPointer<CFunction<(GLenum, GLint) -> Unit>>

typealias PFNGLCOMBINERINPUTNVPROCVar = CPointerVarOf<PFNGLCOMBINERINPUTNVPROC>
typealias PFNGLCOMBINERINPUTNVPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, GLenum, GLenum, GLenum) -> Unit>>

typealias PFNGLCOMBINEROUTPUTNVPROCVar = CPointerVarOf<PFNGLCOMBINEROUTPUTNVPROC>
typealias PFNGLCOMBINEROUTPUTNVPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, GLenum, GLenum, GLenum, GLenum, GLboolean, GLboolean, GLboolean) -> Unit>>

typealias PFNGLFINALCOMBINERINPUTNVPROCVar = CPointerVarOf<PFNGLFINALCOMBINERINPUTNVPROC>
typealias PFNGLFINALCOMBINERINPUTNVPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, GLenum) -> Unit>>

typealias PFNGLGETCOMBINERINPUTPARAMETERFVNVPROCVar = CPointerVarOf<PFNGLGETCOMBINERINPUTPARAMETERFVNVPROC>
typealias PFNGLGETCOMBINERINPUTPARAMETERFVNVPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETCOMBINERINPUTPARAMETERIVNVPROCVar = CPointerVarOf<PFNGLGETCOMBINERINPUTPARAMETERIVNVPROC>
typealias PFNGLGETCOMBINERINPUTPARAMETERIVNVPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETCOMBINEROUTPUTPARAMETERFVNVPROCVar = CPointerVarOf<PFNGLGETCOMBINEROUTPUTPARAMETERFVNVPROC>
typealias PFNGLGETCOMBINEROUTPUTPARAMETERFVNVPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETCOMBINEROUTPUTPARAMETERIVNVPROCVar = CPointerVarOf<PFNGLGETCOMBINEROUTPUTPARAMETERIVNVPROC>
typealias PFNGLGETCOMBINEROUTPUTPARAMETERIVNVPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETFINALCOMBINERINPUTPARAMETERFVNVPROCVar = CPointerVarOf<PFNGLGETFINALCOMBINERINPUTPARAMETERFVNVPROC>
typealias PFNGLGETFINALCOMBINERINPUTPARAMETERFVNVPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETFINALCOMBINERINPUTPARAMETERIVNVPROCVar = CPointerVarOf<PFNGLGETFINALCOMBINERINPUTPARAMETERIVNVPROC>
typealias PFNGLGETFINALCOMBINERINPUTPARAMETERIVNVPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLCOMBINERSTAGEPARAMETERFVNVPROCVar = CPointerVarOf<PFNGLCOMBINERSTAGEPARAMETERFVNVPROC>
typealias PFNGLCOMBINERSTAGEPARAMETERFVNVPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETCOMBINERSTAGEPARAMETERFVNVPROCVar = CPointerVarOf<PFNGLGETCOMBINERSTAGEPARAMETERFVNVPROC>
typealias PFNGLGETCOMBINERSTAGEPARAMETERFVNVPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLFRAMEBUFFERSAMPLELOCATIONSFVNVPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERSAMPLELOCATIONSFVNVPROC>
typealias PFNGLFRAMEBUFFERSAMPLELOCATIONSFVNVPROC = CPointer<CFunction<(GLenum, GLuint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLNAMEDFRAMEBUFFERSAMPLELOCATIONSFVNVPROCVar = CPointerVarOf<PFNGLNAMEDFRAMEBUFFERSAMPLELOCATIONSFVNVPROC>
typealias PFNGLNAMEDFRAMEBUFFERSAMPLELOCATIONSFVNVPROC = CPointer<CFunction<(GLuint, GLuint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLRESOLVEDEPTHVALUESNVPROCVar = CPointerVarOf<PFNGLRESOLVEDEPTHVALUESNVPROC>
typealias PFNGLRESOLVEDEPTHVALUESNVPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLMAKEBUFFERRESIDENTNVPROCVar = CPointerVarOf<PFNGLMAKEBUFFERRESIDENTNVPROC>
typealias PFNGLMAKEBUFFERRESIDENTNVPROC = CPointer<CFunction<(GLenum, GLenum) -> Unit>>

typealias PFNGLMAKEBUFFERNONRESIDENTNVPROCVar = CPointerVarOf<PFNGLMAKEBUFFERNONRESIDENTNVPROC>
typealias PFNGLMAKEBUFFERNONRESIDENTNVPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLISBUFFERRESIDENTNVPROCVar = CPointerVarOf<PFNGLISBUFFERRESIDENTNVPROC>
typealias PFNGLISBUFFERRESIDENTNVPROC = CPointer<CFunction<(GLenum) -> GLboolean>>

typealias PFNGLMAKENAMEDBUFFERRESIDENTNVPROCVar = CPointerVarOf<PFNGLMAKENAMEDBUFFERRESIDENTNVPROC>
typealias PFNGLMAKENAMEDBUFFERRESIDENTNVPROC = CPointer<CFunction<(GLuint, GLenum) -> Unit>>

typealias PFNGLMAKENAMEDBUFFERNONRESIDENTNVPROCVar = CPointerVarOf<PFNGLMAKENAMEDBUFFERNONRESIDENTNVPROC>
typealias PFNGLMAKENAMEDBUFFERNONRESIDENTNVPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLISNAMEDBUFFERRESIDENTNVPROCVar = CPointerVarOf<PFNGLISNAMEDBUFFERRESIDENTNVPROC>
typealias PFNGLISNAMEDBUFFERRESIDENTNVPROC = CPointer<CFunction<(GLuint) -> GLboolean>>

typealias PFNGLGETBUFFERPARAMETERUI64VNVPROCVar = CPointerVarOf<PFNGLGETBUFFERPARAMETERUI64VNVPROC>
typealias PFNGLGETBUFFERPARAMETERUI64VNVPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLuint64EXTVar>?) -> Unit>>

typealias PFNGLGETNAMEDBUFFERPARAMETERUI64VNVPROCVar = CPointerVarOf<PFNGLGETNAMEDBUFFERPARAMETERUI64VNVPROC>
typealias PFNGLGETNAMEDBUFFERPARAMETERUI64VNVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLuint64EXTVar>?) -> Unit>>

typealias PFNGLGETINTEGERUI64VNVPROCVar = CPointerVarOf<PFNGLGETINTEGERUI64VNVPROC>
typealias PFNGLGETINTEGERUI64VNVPROC = CPointer<CFunction<(GLenum, CPointer<GLuint64EXTVar>?) -> Unit>>

typealias PFNGLUNIFORMUI64NVPROCVar = CPointerVarOf<PFNGLUNIFORMUI64NVPROC>
typealias PFNGLUNIFORMUI64NVPROC = CPointer<CFunction<(GLint, GLuint64EXT) -> Unit>>

typealias PFNGLUNIFORMUI64VNVPROCVar = CPointerVarOf<PFNGLUNIFORMUI64VNVPROC>
typealias PFNGLUNIFORMUI64VNVPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLuint64EXTVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMUI64NVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMUI64NVPROC>
typealias PFNGLPROGRAMUNIFORMUI64NVPROC = CPointer<CFunction<(GLuint, GLint, GLuint64EXT) -> Unit>>

typealias PFNGLPROGRAMUNIFORMUI64VNVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMUI64VNVPROC>
typealias PFNGLPROGRAMUNIFORMUI64VNVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLuint64EXTVar>?) -> Unit>>

typealias PFNGLTEXTUREBARRIERNVPROCVar = CPointerVarOf<PFNGLTEXTUREBARRIERNVPROC>
typealias PFNGLTEXTUREBARRIERNVPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLTEXIMAGE2DMULTISAMPLECOVERAGENVPROCVar = CPointerVarOf<PFNGLTEXIMAGE2DMULTISAMPLECOVERAGENVPROC>
typealias PFNGLTEXIMAGE2DMULTISAMPLECOVERAGENVPROC = CPointer<CFunction<(GLenum, GLsizei, GLsizei, GLint, GLsizei, GLsizei, GLboolean) -> Unit>>

typealias PFNGLTEXIMAGE3DMULTISAMPLECOVERAGENVPROCVar = CPointerVarOf<PFNGLTEXIMAGE3DMULTISAMPLECOVERAGENVPROC>
typealias PFNGLTEXIMAGE3DMULTISAMPLECOVERAGENVPROC = CPointer<CFunction<(GLenum, GLsizei, GLsizei, GLint, GLsizei, GLsizei, GLsizei, GLboolean) -> Unit>>

typealias PFNGLTEXTUREIMAGE2DMULTISAMPLENVPROCVar = CPointerVarOf<PFNGLTEXTUREIMAGE2DMULTISAMPLENVPROC>
typealias PFNGLTEXTUREIMAGE2DMULTISAMPLENVPROC = CPointer<CFunction<(GLuint, GLenum, GLsizei, GLint, GLsizei, GLsizei, GLboolean) -> Unit>>

typealias PFNGLTEXTUREIMAGE3DMULTISAMPLENVPROCVar = CPointerVarOf<PFNGLTEXTUREIMAGE3DMULTISAMPLENVPROC>
typealias PFNGLTEXTUREIMAGE3DMULTISAMPLENVPROC = CPointer<CFunction<(GLuint, GLenum, GLsizei, GLint, GLsizei, GLsizei, GLsizei, GLboolean) -> Unit>>

typealias PFNGLTEXTUREIMAGE2DMULTISAMPLECOVERAGENVPROCVar = CPointerVarOf<PFNGLTEXTUREIMAGE2DMULTISAMPLECOVERAGENVPROC>
typealias PFNGLTEXTUREIMAGE2DMULTISAMPLECOVERAGENVPROC = CPointer<CFunction<(GLuint, GLenum, GLsizei, GLsizei, GLint, GLsizei, GLsizei, GLboolean) -> Unit>>

typealias PFNGLTEXTUREIMAGE3DMULTISAMPLECOVERAGENVPROCVar = CPointerVarOf<PFNGLTEXTUREIMAGE3DMULTISAMPLECOVERAGENVPROC>
typealias PFNGLTEXTUREIMAGE3DMULTISAMPLECOVERAGENVPROC = CPointer<CFunction<(GLuint, GLenum, GLsizei, GLsizei, GLint, GLsizei, GLsizei, GLsizei, GLboolean) -> Unit>>

typealias PFNGLBEGINTRANSFORMFEEDBACKNVPROCVar = CPointerVarOf<PFNGLBEGINTRANSFORMFEEDBACKNVPROC>
typealias PFNGLBEGINTRANSFORMFEEDBACKNVPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLENDTRANSFORMFEEDBACKNVPROCVar = CPointerVarOf<PFNGLENDTRANSFORMFEEDBACKNVPROC>
typealias PFNGLENDTRANSFORMFEEDBACKNVPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLTRANSFORMFEEDBACKATTRIBSNVPROCVar = CPointerVarOf<PFNGLTRANSFORMFEEDBACKATTRIBSNVPROC>
typealias PFNGLTRANSFORMFEEDBACKATTRIBSNVPROC = CPointer<CFunction<(GLsizei, CPointer<GLintVar>?, GLenum) -> Unit>>

typealias PFNGLBINDBUFFERRANGENVPROCVar = CPointerVarOf<PFNGLBINDBUFFERRANGENVPROC>
typealias PFNGLBINDBUFFERRANGENVPROC = CPointer<CFunction<(GLenum, GLuint, GLuint, GLintptr, GLsizeiptr) -> Unit>>

typealias PFNGLBINDBUFFEROFFSETNVPROCVar = CPointerVarOf<PFNGLBINDBUFFEROFFSETNVPROC>
typealias PFNGLBINDBUFFEROFFSETNVPROC = CPointer<CFunction<(GLenum, GLuint, GLuint, GLintptr) -> Unit>>

typealias PFNGLBINDBUFFERBASENVPROCVar = CPointerVarOf<PFNGLBINDBUFFERBASENVPROC>
typealias PFNGLBINDBUFFERBASENVPROC = CPointer<CFunction<(GLenum, GLuint, GLuint) -> Unit>>

typealias PFNGLTRANSFORMFEEDBACKVARYINGSNVPROCVar = CPointerVarOf<PFNGLTRANSFORMFEEDBACKVARYINGSNVPROC>
typealias PFNGLTRANSFORMFEEDBACKVARYINGSNVPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLintVar>?, GLenum) -> Unit>>

typealias PFNGLACTIVEVARYINGNVPROCVar = CPointerVarOf<PFNGLACTIVEVARYINGNVPROC>
typealias PFNGLACTIVEVARYINGNVPROC = CPointer<CFunction<(GLuint, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLGETVARYINGLOCATIONNVPROCVar = CPointerVarOf<PFNGLGETVARYINGLOCATIONNVPROC>
typealias PFNGLGETVARYINGLOCATIONNVPROC = CPointer<CFunction<(GLuint, CPointer<GLcharVar>?) -> GLint>>

typealias PFNGLGETACTIVEVARYINGNVPROCVar = CPointerVarOf<PFNGLGETACTIVEVARYINGNVPROC>
typealias PFNGLGETACTIVEVARYINGNVPROC = CPointer<CFunction<(GLuint, GLuint, GLsizei, CPointer<GLsizeiVar>?, CPointer<GLsizeiVar>?, CPointer<GLenumVar>?, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLGETTRANSFORMFEEDBACKVARYINGNVPROCVar = CPointerVarOf<PFNGLGETTRANSFORMFEEDBACKVARYINGNVPROC>
typealias PFNGLGETTRANSFORMFEEDBACKVARYINGNVPROC = CPointer<CFunction<(GLuint, GLuint, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLTRANSFORMFEEDBACKSTREAMATTRIBSNVPROCVar = CPointerVarOf<PFNGLTRANSFORMFEEDBACKSTREAMATTRIBSNVPROC>
typealias PFNGLTRANSFORMFEEDBACKSTREAMATTRIBSNVPROC = CPointer<CFunction<(GLsizei, CPointer<GLintVar>?, GLsizei, CPointer<GLintVar>?, GLenum) -> Unit>>

typealias PFNGLBINDTRANSFORMFEEDBACKNVPROCVar = CPointerVarOf<PFNGLBINDTRANSFORMFEEDBACKNVPROC>
typealias PFNGLBINDTRANSFORMFEEDBACKNVPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLDELETETRANSFORMFEEDBACKSNVPROCVar = CPointerVarOf<PFNGLDELETETRANSFORMFEEDBACKSNVPROC>
typealias PFNGLDELETETRANSFORMFEEDBACKSNVPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGENTRANSFORMFEEDBACKSNVPROCVar = CPointerVarOf<PFNGLGENTRANSFORMFEEDBACKSNVPROC>
typealias PFNGLGENTRANSFORMFEEDBACKSNVPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLISTRANSFORMFEEDBACKNVPROCVar = CPointerVarOf<PFNGLISTRANSFORMFEEDBACKNVPROC>
typealias PFNGLISTRANSFORMFEEDBACKNVPROC = CPointer<CFunction<(GLuint) -> GLboolean>>

typealias PFNGLPAUSETRANSFORMFEEDBACKNVPROCVar = CPointerVarOf<PFNGLPAUSETRANSFORMFEEDBACKNVPROC>
typealias PFNGLPAUSETRANSFORMFEEDBACKNVPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLRESUMETRANSFORMFEEDBACKNVPROCVar = CPointerVarOf<PFNGLRESUMETRANSFORMFEEDBACKNVPROC>
typealias PFNGLRESUMETRANSFORMFEEDBACKNVPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLDRAWTRANSFORMFEEDBACKNVPROCVar = CPointerVarOf<PFNGLDRAWTRANSFORMFEEDBACKNVPROC>
typealias PFNGLDRAWTRANSFORMFEEDBACKNVPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias GLvdpauSurfaceNVVar = LongVarOf<GLvdpauSurfaceNV>
typealias GLvdpauSurfaceNV = GLintptr

typealias PFNGLVDPAUINITNVPROCVar = CPointerVarOf<PFNGLVDPAUINITNVPROC>
typealias PFNGLVDPAUINITNVPROC = CPointer<CFunction<(COpaquePointer?, COpaquePointer?) -> Unit>>

typealias PFNGLVDPAUFININVPROCVar = CPointerVarOf<PFNGLVDPAUFININVPROC>
typealias PFNGLVDPAUFININVPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLVDPAUREGISTERVIDEOSURFACENVPROCVar = CPointerVarOf<PFNGLVDPAUREGISTERVIDEOSURFACENVPROC>
typealias PFNGLVDPAUREGISTERVIDEOSURFACENVPROC = CPointer<CFunction<(COpaquePointer?, GLenum, GLsizei, CPointer<GLuintVar>?) -> GLvdpauSurfaceNV>>

typealias PFNGLVDPAUREGISTEROUTPUTSURFACENVPROCVar = CPointerVarOf<PFNGLVDPAUREGISTEROUTPUTSURFACENVPROC>
typealias PFNGLVDPAUREGISTEROUTPUTSURFACENVPROC = CPointer<CFunction<(COpaquePointer?, GLenum, GLsizei, CPointer<GLuintVar>?) -> GLvdpauSurfaceNV>>

typealias PFNGLVDPAUISSURFACENVPROCVar = CPointerVarOf<PFNGLVDPAUISSURFACENVPROC>
typealias PFNGLVDPAUISSURFACENVPROC = CPointer<CFunction<(GLvdpauSurfaceNV) -> GLboolean>>

typealias PFNGLVDPAUUNREGISTERSURFACENVPROCVar = CPointerVarOf<PFNGLVDPAUUNREGISTERSURFACENVPROC>
typealias PFNGLVDPAUUNREGISTERSURFACENVPROC = CPointer<CFunction<(GLvdpauSurfaceNV) -> Unit>>

typealias PFNGLVDPAUGETSURFACEIVNVPROCVar = CPointerVarOf<PFNGLVDPAUGETSURFACEIVNVPROC>
typealias PFNGLVDPAUGETSURFACEIVNVPROC = CPointer<CFunction<(GLvdpauSurfaceNV, GLenum, GLsizei, CPointer<GLsizeiVar>?, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLVDPAUSURFACEACCESSNVPROCVar = CPointerVarOf<PFNGLVDPAUSURFACEACCESSNVPROC>
typealias PFNGLVDPAUSURFACEACCESSNVPROC = CPointer<CFunction<(GLvdpauSurfaceNV, GLenum) -> Unit>>

typealias PFNGLVDPAUMAPSURFACESNVPROCVar = CPointerVarOf<PFNGLVDPAUMAPSURFACESNVPROC>
typealias PFNGLVDPAUMAPSURFACESNVPROC = CPointer<CFunction<(GLsizei, CPointer<GLvdpauSurfaceNVVar>?) -> Unit>>

typealias PFNGLVDPAUUNMAPSURFACESNVPROCVar = CPointerVarOf<PFNGLVDPAUUNMAPSURFACESNVPROC>
typealias PFNGLVDPAUUNMAPSURFACESNVPROC = CPointer<CFunction<(GLsizei, CPointer<GLvdpauSurfaceNVVar>?) -> Unit>>

typealias PFNGLFLUSHVERTEXARRAYRANGENVPROCVar = CPointerVarOf<PFNGLFLUSHVERTEXARRAYRANGENVPROC>
typealias PFNGLFLUSHVERTEXARRAYRANGENVPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLVERTEXARRAYRANGENVPROCVar = CPointerVarOf<PFNGLVERTEXARRAYRANGENVPROC>
typealias PFNGLVERTEXARRAYRANGENVPROC = CPointer<CFunction<(GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLVERTEXATTRIBL1I64NVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL1I64NVPROC>
typealias PFNGLVERTEXATTRIBL1I64NVPROC = CPointer<CFunction<(GLuint, GLint64EXT) -> Unit>>

typealias PFNGLVERTEXATTRIBL2I64NVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL2I64NVPROC>
typealias PFNGLVERTEXATTRIBL2I64NVPROC = CPointer<CFunction<(GLuint, GLint64EXT, GLint64EXT) -> Unit>>

typealias PFNGLVERTEXATTRIBL3I64NVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL3I64NVPROC>
typealias PFNGLVERTEXATTRIBL3I64NVPROC = CPointer<CFunction<(GLuint, GLint64EXT, GLint64EXT, GLint64EXT) -> Unit>>

typealias PFNGLVERTEXATTRIBL4I64NVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL4I64NVPROC>
typealias PFNGLVERTEXATTRIBL4I64NVPROC = CPointer<CFunction<(GLuint, GLint64EXT, GLint64EXT, GLint64EXT, GLint64EXT) -> Unit>>

typealias PFNGLVERTEXATTRIBL1I64VNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL1I64VNVPROC>
typealias PFNGLVERTEXATTRIBL1I64VNVPROC = CPointer<CFunction<(GLuint, CPointer<GLint64EXTVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBL2I64VNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL2I64VNVPROC>
typealias PFNGLVERTEXATTRIBL2I64VNVPROC = CPointer<CFunction<(GLuint, CPointer<GLint64EXTVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBL3I64VNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL3I64VNVPROC>
typealias PFNGLVERTEXATTRIBL3I64VNVPROC = CPointer<CFunction<(GLuint, CPointer<GLint64EXTVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBL4I64VNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL4I64VNVPROC>
typealias PFNGLVERTEXATTRIBL4I64VNVPROC = CPointer<CFunction<(GLuint, CPointer<GLint64EXTVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBL1UI64NVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL1UI64NVPROC>
typealias PFNGLVERTEXATTRIBL1UI64NVPROC = CPointer<CFunction<(GLuint, GLuint64EXT) -> Unit>>

typealias PFNGLVERTEXATTRIBL2UI64NVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL2UI64NVPROC>
typealias PFNGLVERTEXATTRIBL2UI64NVPROC = CPointer<CFunction<(GLuint, GLuint64EXT, GLuint64EXT) -> Unit>>

typealias PFNGLVERTEXATTRIBL3UI64NVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL3UI64NVPROC>
typealias PFNGLVERTEXATTRIBL3UI64NVPROC = CPointer<CFunction<(GLuint, GLuint64EXT, GLuint64EXT, GLuint64EXT) -> Unit>>

typealias PFNGLVERTEXATTRIBL4UI64NVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL4UI64NVPROC>
typealias PFNGLVERTEXATTRIBL4UI64NVPROC = CPointer<CFunction<(GLuint, GLuint64EXT, GLuint64EXT, GLuint64EXT, GLuint64EXT) -> Unit>>

typealias PFNGLVERTEXATTRIBL1UI64VNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL1UI64VNVPROC>
typealias PFNGLVERTEXATTRIBL1UI64VNVPROC = CPointer<CFunction<(GLuint, CPointer<GLuint64EXTVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBL2UI64VNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL2UI64VNVPROC>
typealias PFNGLVERTEXATTRIBL2UI64VNVPROC = CPointer<CFunction<(GLuint, CPointer<GLuint64EXTVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBL3UI64VNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL3UI64VNVPROC>
typealias PFNGLVERTEXATTRIBL3UI64VNVPROC = CPointer<CFunction<(GLuint, CPointer<GLuint64EXTVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBL4UI64VNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL4UI64VNVPROC>
typealias PFNGLVERTEXATTRIBL4UI64VNVPROC = CPointer<CFunction<(GLuint, CPointer<GLuint64EXTVar>?) -> Unit>>

typealias PFNGLGETVERTEXATTRIBLI64VNVPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBLI64VNVPROC>
typealias PFNGLGETVERTEXATTRIBLI64VNVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLint64EXTVar>?) -> Unit>>

typealias PFNGLGETVERTEXATTRIBLUI64VNVPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBLUI64VNVPROC>
typealias PFNGLGETVERTEXATTRIBLUI64VNVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLuint64EXTVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBLFORMATNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBLFORMATNVPROC>
typealias PFNGLVERTEXATTRIBLFORMATNVPROC = CPointer<CFunction<(GLuint, GLint, GLenum, GLsizei) -> Unit>>

typealias PFNGLBUFFERADDRESSRANGENVPROCVar = CPointerVarOf<PFNGLBUFFERADDRESSRANGENVPROC>
typealias PFNGLBUFFERADDRESSRANGENVPROC = CPointer<CFunction<(GLenum, GLuint, GLuint64EXT, GLsizeiptr) -> Unit>>

typealias PFNGLVERTEXFORMATNVPROCVar = CPointerVarOf<PFNGLVERTEXFORMATNVPROC>
typealias PFNGLVERTEXFORMATNVPROC = CPointer<CFunction<(GLint, GLenum, GLsizei) -> Unit>>

typealias PFNGLNORMALFORMATNVPROCVar = CPointerVarOf<PFNGLNORMALFORMATNVPROC>
typealias PFNGLNORMALFORMATNVPROC = CPointer<CFunction<(GLenum, GLsizei) -> Unit>>

typealias PFNGLCOLORFORMATNVPROCVar = CPointerVarOf<PFNGLCOLORFORMATNVPROC>
typealias PFNGLCOLORFORMATNVPROC = CPointer<CFunction<(GLint, GLenum, GLsizei) -> Unit>>

typealias PFNGLINDEXFORMATNVPROCVar = CPointerVarOf<PFNGLINDEXFORMATNVPROC>
typealias PFNGLINDEXFORMATNVPROC = CPointer<CFunction<(GLenum, GLsizei) -> Unit>>

typealias PFNGLTEXCOORDFORMATNVPROCVar = CPointerVarOf<PFNGLTEXCOORDFORMATNVPROC>
typealias PFNGLTEXCOORDFORMATNVPROC = CPointer<CFunction<(GLint, GLenum, GLsizei) -> Unit>>

typealias PFNGLEDGEFLAGFORMATNVPROCVar = CPointerVarOf<PFNGLEDGEFLAGFORMATNVPROC>
typealias PFNGLEDGEFLAGFORMATNVPROC = CPointer<CFunction<(GLsizei) -> Unit>>

typealias PFNGLSECONDARYCOLORFORMATNVPROCVar = CPointerVarOf<PFNGLSECONDARYCOLORFORMATNVPROC>
typealias PFNGLSECONDARYCOLORFORMATNVPROC = CPointer<CFunction<(GLint, GLenum, GLsizei) -> Unit>>

typealias PFNGLFOGCOORDFORMATNVPROCVar = CPointerVarOf<PFNGLFOGCOORDFORMATNVPROC>
typealias PFNGLFOGCOORDFORMATNVPROC = CPointer<CFunction<(GLenum, GLsizei) -> Unit>>

typealias PFNGLVERTEXATTRIBFORMATNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBFORMATNVPROC>
typealias PFNGLVERTEXATTRIBFORMATNVPROC = CPointer<CFunction<(GLuint, GLint, GLenum, GLboolean, GLsizei) -> Unit>>

typealias PFNGLVERTEXATTRIBIFORMATNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBIFORMATNVPROC>
typealias PFNGLVERTEXATTRIBIFORMATNVPROC = CPointer<CFunction<(GLuint, GLint, GLenum, GLsizei) -> Unit>>

typealias PFNGLGETINTEGERUI64I_VNVPROCVar = CPointerVarOf<PFNGLGETINTEGERUI64I_VNVPROC>
typealias PFNGLGETINTEGERUI64I_VNVPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<GLuint64EXTVar>?) -> Unit>>

typealias PFNGLAREPROGRAMSRESIDENTNVPROCVar = CPointerVarOf<PFNGLAREPROGRAMSRESIDENTNVPROC>
typealias PFNGLAREPROGRAMSRESIDENTNVPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?, CPointer<GLbooleanVar>?) -> GLboolean>>

typealias PFNGLBINDPROGRAMNVPROCVar = CPointerVarOf<PFNGLBINDPROGRAMNVPROC>
typealias PFNGLBINDPROGRAMNVPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLDELETEPROGRAMSNVPROCVar = CPointerVarOf<PFNGLDELETEPROGRAMSNVPROC>
typealias PFNGLDELETEPROGRAMSNVPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLEXECUTEPROGRAMNVPROCVar = CPointerVarOf<PFNGLEXECUTEPROGRAMNVPROC>
typealias PFNGLEXECUTEPROGRAMNVPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGENPROGRAMSNVPROCVar = CPointerVarOf<PFNGLGENPROGRAMSNVPROC>
typealias PFNGLGENPROGRAMSNVPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGETPROGRAMPARAMETERDVNVPROCVar = CPointerVarOf<PFNGLGETPROGRAMPARAMETERDVNVPROC>
typealias PFNGLGETPROGRAMPARAMETERDVNVPROC = CPointer<CFunction<(GLenum, GLuint, GLenum, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLGETPROGRAMPARAMETERFVNVPROCVar = CPointerVarOf<PFNGLGETPROGRAMPARAMETERFVNVPROC>
typealias PFNGLGETPROGRAMPARAMETERFVNVPROC = CPointer<CFunction<(GLenum, GLuint, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETPROGRAMIVNVPROCVar = CPointerVarOf<PFNGLGETPROGRAMIVNVPROC>
typealias PFNGLGETPROGRAMIVNVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETPROGRAMSTRINGNVPROCVar = CPointerVarOf<PFNGLGETPROGRAMSTRINGNVPROC>
typealias PFNGLGETPROGRAMSTRINGNVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLubyteVar>?) -> Unit>>

typealias PFNGLGETTRACKMATRIXIVNVPROCVar = CPointerVarOf<PFNGLGETTRACKMATRIXIVNVPROC>
typealias PFNGLGETTRACKMATRIXIVNVPROC = CPointer<CFunction<(GLenum, GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETVERTEXATTRIBDVNVPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBDVNVPROC>
typealias PFNGLGETVERTEXATTRIBDVNVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLGETVERTEXATTRIBFVNVPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBFVNVPROC>
typealias PFNGLGETVERTEXATTRIBFVNVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETVERTEXATTRIBIVNVPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBIVNVPROC>
typealias PFNGLGETVERTEXATTRIBIVNVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETVERTEXATTRIBPOINTERVNVPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBPOINTERVNVPROC>
typealias PFNGLGETVERTEXATTRIBPOINTERVNVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<COpaquePointerVar>?) -> Unit>>

typealias PFNGLISPROGRAMNVPROCVar = CPointerVarOf<PFNGLISPROGRAMNVPROC>
typealias PFNGLISPROGRAMNVPROC = CPointer<CFunction<(GLuint) -> GLboolean>>

typealias PFNGLLOADPROGRAMNVPROCVar = CPointerVarOf<PFNGLLOADPROGRAMNVPROC>
typealias PFNGLLOADPROGRAMNVPROC = CPointer<CFunction<(GLenum, GLuint, GLsizei, CPointer<GLubyteVar>?) -> Unit>>

typealias PFNGLPROGRAMPARAMETER4DNVPROCVar = CPointerVarOf<PFNGLPROGRAMPARAMETER4DNVPROC>
typealias PFNGLPROGRAMPARAMETER4DNVPROC = CPointer<CFunction<(GLenum, GLuint, GLdouble, GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLPROGRAMPARAMETER4DVNVPROCVar = CPointerVarOf<PFNGLPROGRAMPARAMETER4DVNVPROC>
typealias PFNGLPROGRAMPARAMETER4DVNVPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLPROGRAMPARAMETER4FNVPROCVar = CPointerVarOf<PFNGLPROGRAMPARAMETER4FNVPROC>
typealias PFNGLPROGRAMPARAMETER4FNVPROC = CPointer<CFunction<(GLenum, GLuint, GLfloat, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLPROGRAMPARAMETER4FVNVPROCVar = CPointerVarOf<PFNGLPROGRAMPARAMETER4FVNVPROC>
typealias PFNGLPROGRAMPARAMETER4FVNVPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPROGRAMPARAMETERS4DVNVPROCVar = CPointerVarOf<PFNGLPROGRAMPARAMETERS4DVNVPROC>
typealias PFNGLPROGRAMPARAMETERS4DVNVPROC = CPointer<CFunction<(GLenum, GLuint, GLsizei, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLPROGRAMPARAMETERS4FVNVPROCVar = CPointerVarOf<PFNGLPROGRAMPARAMETERS4FVNVPROC>
typealias PFNGLPROGRAMPARAMETERS4FVNVPROC = CPointer<CFunction<(GLenum, GLuint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLREQUESTRESIDENTPROGRAMSNVPROCVar = CPointerVarOf<PFNGLREQUESTRESIDENTPROGRAMSNVPROC>
typealias PFNGLREQUESTRESIDENTPROGRAMSNVPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLTRACKMATRIXNVPROCVar = CPointerVarOf<PFNGLTRACKMATRIXNVPROC>
typealias PFNGLTRACKMATRIXNVPROC = CPointer<CFunction<(GLenum, GLuint, GLenum, GLenum) -> Unit>>

typealias PFNGLVERTEXATTRIBPOINTERNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBPOINTERNVPROC>
typealias PFNGLVERTEXATTRIBPOINTERNVPROC = CPointer<CFunction<(GLuint, GLint, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLVERTEXATTRIB1DNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1DNVPROC>
typealias PFNGLVERTEXATTRIB1DNVPROC = CPointer<CFunction<(GLuint, GLdouble) -> Unit>>

typealias PFNGLVERTEXATTRIB1DVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1DVNVPROC>
typealias PFNGLVERTEXATTRIB1DVNVPROC = CPointer<CFunction<(GLuint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB1FNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1FNVPROC>
typealias PFNGLVERTEXATTRIB1FNVPROC = CPointer<CFunction<(GLuint, GLfloat) -> Unit>>

typealias PFNGLVERTEXATTRIB1FVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1FVNVPROC>
typealias PFNGLVERTEXATTRIB1FVNVPROC = CPointer<CFunction<(GLuint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB1SNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1SNVPROC>
typealias PFNGLVERTEXATTRIB1SNVPROC = CPointer<CFunction<(GLuint, GLshort) -> Unit>>

typealias PFNGLVERTEXATTRIB1SVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1SVNVPROC>
typealias PFNGLVERTEXATTRIB1SVNVPROC = CPointer<CFunction<(GLuint, CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB2DNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2DNVPROC>
typealias PFNGLVERTEXATTRIB2DNVPROC = CPointer<CFunction<(GLuint, GLdouble, GLdouble) -> Unit>>

typealias PFNGLVERTEXATTRIB2DVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2DVNVPROC>
typealias PFNGLVERTEXATTRIB2DVNVPROC = CPointer<CFunction<(GLuint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB2FNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2FNVPROC>
typealias PFNGLVERTEXATTRIB2FNVPROC = CPointer<CFunction<(GLuint, GLfloat, GLfloat) -> Unit>>

typealias PFNGLVERTEXATTRIB2FVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2FVNVPROC>
typealias PFNGLVERTEXATTRIB2FVNVPROC = CPointer<CFunction<(GLuint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB2SNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2SNVPROC>
typealias PFNGLVERTEXATTRIB2SNVPROC = CPointer<CFunction<(GLuint, GLshort, GLshort) -> Unit>>

typealias PFNGLVERTEXATTRIB2SVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2SVNVPROC>
typealias PFNGLVERTEXATTRIB2SVNVPROC = CPointer<CFunction<(GLuint, CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB3DNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3DNVPROC>
typealias PFNGLVERTEXATTRIB3DNVPROC = CPointer<CFunction<(GLuint, GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLVERTEXATTRIB3DVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3DVNVPROC>
typealias PFNGLVERTEXATTRIB3DVNVPROC = CPointer<CFunction<(GLuint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB3FNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3FNVPROC>
typealias PFNGLVERTEXATTRIB3FNVPROC = CPointer<CFunction<(GLuint, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLVERTEXATTRIB3FVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3FVNVPROC>
typealias PFNGLVERTEXATTRIB3FVNVPROC = CPointer<CFunction<(GLuint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB3SNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3SNVPROC>
typealias PFNGLVERTEXATTRIB3SNVPROC = CPointer<CFunction<(GLuint, GLshort, GLshort, GLshort) -> Unit>>

typealias PFNGLVERTEXATTRIB3SVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3SVNVPROC>
typealias PFNGLVERTEXATTRIB3SVNVPROC = CPointer<CFunction<(GLuint, CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4DNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4DNVPROC>
typealias PFNGLVERTEXATTRIB4DNVPROC = CPointer<CFunction<(GLuint, GLdouble, GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLVERTEXATTRIB4DVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4DVNVPROC>
typealias PFNGLVERTEXATTRIB4DVNVPROC = CPointer<CFunction<(GLuint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4FNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4FNVPROC>
typealias PFNGLVERTEXATTRIB4FNVPROC = CPointer<CFunction<(GLuint, GLfloat, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLVERTEXATTRIB4FVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4FVNVPROC>
typealias PFNGLVERTEXATTRIB4FVNVPROC = CPointer<CFunction<(GLuint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4SNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4SNVPROC>
typealias PFNGLVERTEXATTRIB4SNVPROC = CPointer<CFunction<(GLuint, GLshort, GLshort, GLshort, GLshort) -> Unit>>

typealias PFNGLVERTEXATTRIB4SVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4SVNVPROC>
typealias PFNGLVERTEXATTRIB4SVNVPROC = CPointer<CFunction<(GLuint, CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4UBNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4UBNVPROC>
typealias PFNGLVERTEXATTRIB4UBNVPROC = CPointer<CFunction<(GLuint, GLubyte, GLubyte, GLubyte, GLubyte) -> Unit>>

typealias PFNGLVERTEXATTRIB4UBVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4UBVNVPROC>
typealias PFNGLVERTEXATTRIB4UBVNVPROC = CPointer<CFunction<(GLuint, CPointer<GLubyteVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBS1DVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBS1DVNVPROC>
typealias PFNGLVERTEXATTRIBS1DVNVPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBS1FVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBS1FVNVPROC>
typealias PFNGLVERTEXATTRIBS1FVNVPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBS1SVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBS1SVNVPROC>
typealias PFNGLVERTEXATTRIBS1SVNVPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBS2DVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBS2DVNVPROC>
typealias PFNGLVERTEXATTRIBS2DVNVPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBS2FVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBS2FVNVPROC>
typealias PFNGLVERTEXATTRIBS2FVNVPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBS2SVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBS2SVNVPROC>
typealias PFNGLVERTEXATTRIBS2SVNVPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBS3DVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBS3DVNVPROC>
typealias PFNGLVERTEXATTRIBS3DVNVPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBS3FVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBS3FVNVPROC>
typealias PFNGLVERTEXATTRIBS3FVNVPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBS3SVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBS3SVNVPROC>
typealias PFNGLVERTEXATTRIBS3SVNVPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBS4DVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBS4DVNVPROC>
typealias PFNGLVERTEXATTRIBS4DVNVPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBS4FVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBS4FVNVPROC>
typealias PFNGLVERTEXATTRIBS4FVNVPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBS4SVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBS4SVNVPROC>
typealias PFNGLVERTEXATTRIBS4SVNVPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBS4UBVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBS4UBVNVPROC>
typealias PFNGLVERTEXATTRIBS4UBVNVPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLubyteVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBI1IEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI1IEXTPROC>
typealias PFNGLVERTEXATTRIBI1IEXTPROC = CPointer<CFunction<(GLuint, GLint) -> Unit>>

typealias PFNGLVERTEXATTRIBI2IEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI2IEXTPROC>
typealias PFNGLVERTEXATTRIBI2IEXTPROC = CPointer<CFunction<(GLuint, GLint, GLint) -> Unit>>

typealias PFNGLVERTEXATTRIBI3IEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI3IEXTPROC>
typealias PFNGLVERTEXATTRIBI3IEXTPROC = CPointer<CFunction<(GLuint, GLint, GLint, GLint) -> Unit>>

typealias PFNGLVERTEXATTRIBI4IEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI4IEXTPROC>
typealias PFNGLVERTEXATTRIBI4IEXTPROC = CPointer<CFunction<(GLuint, GLint, GLint, GLint, GLint) -> Unit>>

typealias PFNGLVERTEXATTRIBI1UIEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI1UIEXTPROC>
typealias PFNGLVERTEXATTRIBI1UIEXTPROC = CPointer<CFunction<(GLuint, GLuint) -> Unit>>

typealias PFNGLVERTEXATTRIBI2UIEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI2UIEXTPROC>
typealias PFNGLVERTEXATTRIBI2UIEXTPROC = CPointer<CFunction<(GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLVERTEXATTRIBI3UIEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI3UIEXTPROC>
typealias PFNGLVERTEXATTRIBI3UIEXTPROC = CPointer<CFunction<(GLuint, GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLVERTEXATTRIBI4UIEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI4UIEXTPROC>
typealias PFNGLVERTEXATTRIBI4UIEXTPROC = CPointer<CFunction<(GLuint, GLuint, GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLVERTEXATTRIBI1IVEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI1IVEXTPROC>
typealias PFNGLVERTEXATTRIBI1IVEXTPROC = CPointer<CFunction<(GLuint, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBI2IVEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI2IVEXTPROC>
typealias PFNGLVERTEXATTRIBI2IVEXTPROC = CPointer<CFunction<(GLuint, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBI3IVEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI3IVEXTPROC>
typealias PFNGLVERTEXATTRIBI3IVEXTPROC = CPointer<CFunction<(GLuint, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBI4IVEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI4IVEXTPROC>
typealias PFNGLVERTEXATTRIBI4IVEXTPROC = CPointer<CFunction<(GLuint, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBI1UIVEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI1UIVEXTPROC>
typealias PFNGLVERTEXATTRIBI1UIVEXTPROC = CPointer<CFunction<(GLuint, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBI2UIVEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI2UIVEXTPROC>
typealias PFNGLVERTEXATTRIBI2UIVEXTPROC = CPointer<CFunction<(GLuint, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBI3UIVEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI3UIVEXTPROC>
typealias PFNGLVERTEXATTRIBI3UIVEXTPROC = CPointer<CFunction<(GLuint, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBI4UIVEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI4UIVEXTPROC>
typealias PFNGLVERTEXATTRIBI4UIVEXTPROC = CPointer<CFunction<(GLuint, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBI4BVEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI4BVEXTPROC>
typealias PFNGLVERTEXATTRIBI4BVEXTPROC = CPointer<CFunction<(GLuint, CPointer<GLbyteVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBI4SVEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI4SVEXTPROC>
typealias PFNGLVERTEXATTRIBI4SVEXTPROC = CPointer<CFunction<(GLuint, CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBI4UBVEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI4UBVEXTPROC>
typealias PFNGLVERTEXATTRIBI4UBVEXTPROC = CPointer<CFunction<(GLuint, CPointer<GLubyteVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBI4USVEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI4USVEXTPROC>
typealias PFNGLVERTEXATTRIBI4USVEXTPROC = CPointer<CFunction<(GLuint, CPointer<GLushortVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBIPOINTEREXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBIPOINTEREXTPROC>
typealias PFNGLVERTEXATTRIBIPOINTEREXTPROC = CPointer<CFunction<(GLuint, GLint, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLGETVERTEXATTRIBIIVEXTPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBIIVEXTPROC>
typealias PFNGLGETVERTEXATTRIBIIVEXTPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETVERTEXATTRIBIUIVEXTPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBIUIVEXTPROC>
typealias PFNGLGETVERTEXATTRIBIUIVEXTPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLBEGINVIDEOCAPTURENVPROCVar = CPointerVarOf<PFNGLBEGINVIDEOCAPTURENVPROC>
typealias PFNGLBEGINVIDEOCAPTURENVPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLBINDVIDEOCAPTURESTREAMBUFFERNVPROCVar = CPointerVarOf<PFNGLBINDVIDEOCAPTURESTREAMBUFFERNVPROC>
typealias PFNGLBINDVIDEOCAPTURESTREAMBUFFERNVPROC = CPointer<CFunction<(GLuint, GLuint, GLenum, GLintptrARB) -> Unit>>

typealias PFNGLBINDVIDEOCAPTURESTREAMTEXTURENVPROCVar = CPointerVarOf<PFNGLBINDVIDEOCAPTURESTREAMTEXTURENVPROC>
typealias PFNGLBINDVIDEOCAPTURESTREAMTEXTURENVPROC = CPointer<CFunction<(GLuint, GLuint, GLenum, GLenum, GLuint) -> Unit>>

typealias PFNGLENDVIDEOCAPTURENVPROCVar = CPointerVarOf<PFNGLENDVIDEOCAPTURENVPROC>
typealias PFNGLENDVIDEOCAPTURENVPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLGETVIDEOCAPTUREIVNVPROCVar = CPointerVarOf<PFNGLGETVIDEOCAPTUREIVNVPROC>
typealias PFNGLGETVIDEOCAPTUREIVNVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETVIDEOCAPTURESTREAMIVNVPROCVar = CPointerVarOf<PFNGLGETVIDEOCAPTURESTREAMIVNVPROC>
typealias PFNGLGETVIDEOCAPTURESTREAMIVNVPROC = CPointer<CFunction<(GLuint, GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETVIDEOCAPTURESTREAMFVNVPROCVar = CPointerVarOf<PFNGLGETVIDEOCAPTURESTREAMFVNVPROC>
typealias PFNGLGETVIDEOCAPTURESTREAMFVNVPROC = CPointer<CFunction<(GLuint, GLuint, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETVIDEOCAPTURESTREAMDVNVPROCVar = CPointerVarOf<PFNGLGETVIDEOCAPTURESTREAMDVNVPROC>
typealias PFNGLGETVIDEOCAPTURESTREAMDVNVPROC = CPointer<CFunction<(GLuint, GLuint, GLenum, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLVIDEOCAPTURENVPROCVar = CPointerVarOf<PFNGLVIDEOCAPTURENVPROC>
typealias PFNGLVIDEOCAPTURENVPROC = CPointer<CFunction<(GLuint, CPointer<GLuintVar>?, CPointer<GLuint64EXTVar>?) -> GLenum>>

typealias PFNGLVIDEOCAPTURESTREAMPARAMETERIVNVPROCVar = CPointerVarOf<PFNGLVIDEOCAPTURESTREAMPARAMETERIVNVPROC>
typealias PFNGLVIDEOCAPTURESTREAMPARAMETERIVNVPROC = CPointer<CFunction<(GLuint, GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLVIDEOCAPTURESTREAMPARAMETERFVNVPROCVar = CPointerVarOf<PFNGLVIDEOCAPTURESTREAMPARAMETERFVNVPROC>
typealias PFNGLVIDEOCAPTURESTREAMPARAMETERFVNVPROC = CPointer<CFunction<(GLuint, GLuint, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLVIDEOCAPTURESTREAMPARAMETERDVNVPROCVar = CPointerVarOf<PFNGLVIDEOCAPTURESTREAMPARAMETERDVNVPROC>
typealias PFNGLVIDEOCAPTURESTREAMPARAMETERDVNVPROC = CPointer<CFunction<(GLuint, GLuint, GLenum, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLVIEWPORTSWIZZLENVPROCVar = CPointerVarOf<PFNGLVIEWPORTSWIZZLENVPROC>
typealias PFNGLVIEWPORTSWIZZLENVPROC = CPointer<CFunction<(GLuint, GLenum, GLenum, GLenum, GLenum) -> Unit>>

typealias PFNGLFRAMEBUFFERTEXTUREMULTIVIEWOVRPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERTEXTUREMULTIVIEWOVRPROC>
typealias PFNGLFRAMEBUFFERTEXTUREMULTIVIEWOVRPROC = CPointer<CFunction<(GLenum, GLenum, GLuint, GLint, GLint, GLsizei) -> Unit>>

typealias PFNGLHINTPGIPROCVar = CPointerVarOf<PFNGLHINTPGIPROC>
typealias PFNGLHINTPGIPROC = CPointer<CFunction<(GLenum, GLint) -> Unit>>

typealias PFNGLDETAILTEXFUNCSGISPROCVar = CPointerVarOf<PFNGLDETAILTEXFUNCSGISPROC>
typealias PFNGLDETAILTEXFUNCSGISPROC = CPointer<CFunction<(GLenum, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETDETAILTEXFUNCSGISPROCVar = CPointerVarOf<PFNGLGETDETAILTEXFUNCSGISPROC>
typealias PFNGLGETDETAILTEXFUNCSGISPROC = CPointer<CFunction<(GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLFOGFUNCSGISPROCVar = CPointerVarOf<PFNGLFOGFUNCSGISPROC>
typealias PFNGLFOGFUNCSGISPROC = CPointer<CFunction<(GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETFOGFUNCSGISPROCVar = CPointerVarOf<PFNGLGETFOGFUNCSGISPROC>
typealias PFNGLGETFOGFUNCSGISPROC = CPointer<CFunction<(CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLSAMPLEMASKSGISPROCVar = CPointerVarOf<PFNGLSAMPLEMASKSGISPROC>
typealias PFNGLSAMPLEMASKSGISPROC = CPointer<CFunction<(GLclampf, GLboolean) -> Unit>>

typealias PFNGLSAMPLEPATTERNSGISPROCVar = CPointerVarOf<PFNGLSAMPLEPATTERNSGISPROC>
typealias PFNGLSAMPLEPATTERNSGISPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLPIXELTEXGENPARAMETERISGISPROCVar = CPointerVarOf<PFNGLPIXELTEXGENPARAMETERISGISPROC>
typealias PFNGLPIXELTEXGENPARAMETERISGISPROC = CPointer<CFunction<(GLenum, GLint) -> Unit>>

typealias PFNGLPIXELTEXGENPARAMETERIVSGISPROCVar = CPointerVarOf<PFNGLPIXELTEXGENPARAMETERIVSGISPROC>
typealias PFNGLPIXELTEXGENPARAMETERIVSGISPROC = CPointer<CFunction<(GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLPIXELTEXGENPARAMETERFSGISPROCVar = CPointerVarOf<PFNGLPIXELTEXGENPARAMETERFSGISPROC>
typealias PFNGLPIXELTEXGENPARAMETERFSGISPROC = CPointer<CFunction<(GLenum, GLfloat) -> Unit>>

typealias PFNGLPIXELTEXGENPARAMETERFVSGISPROCVar = CPointerVarOf<PFNGLPIXELTEXGENPARAMETERFVSGISPROC>
typealias PFNGLPIXELTEXGENPARAMETERFVSGISPROC = CPointer<CFunction<(GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETPIXELTEXGENPARAMETERIVSGISPROCVar = CPointerVarOf<PFNGLGETPIXELTEXGENPARAMETERIVSGISPROC>
typealias PFNGLGETPIXELTEXGENPARAMETERIVSGISPROC = CPointer<CFunction<(GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETPIXELTEXGENPARAMETERFVSGISPROCVar = CPointerVarOf<PFNGLGETPIXELTEXGENPARAMETERFVSGISPROC>
typealias PFNGLGETPIXELTEXGENPARAMETERFVSGISPROC = CPointer<CFunction<(GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPOINTPARAMETERFSGISPROCVar = CPointerVarOf<PFNGLPOINTPARAMETERFSGISPROC>
typealias PFNGLPOINTPARAMETERFSGISPROC = CPointer<CFunction<(GLenum, GLfloat) -> Unit>>

typealias PFNGLPOINTPARAMETERFVSGISPROCVar = CPointerVarOf<PFNGLPOINTPARAMETERFVSGISPROC>
typealias PFNGLPOINTPARAMETERFVSGISPROC = CPointer<CFunction<(GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLSHARPENTEXFUNCSGISPROCVar = CPointerVarOf<PFNGLSHARPENTEXFUNCSGISPROC>
typealias PFNGLSHARPENTEXFUNCSGISPROC = CPointer<CFunction<(GLenum, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETSHARPENTEXFUNCSGISPROCVar = CPointerVarOf<PFNGLGETSHARPENTEXFUNCSGISPROC>
typealias PFNGLGETSHARPENTEXFUNCSGISPROC = CPointer<CFunction<(GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLTEXIMAGE4DSGISPROCVar = CPointerVarOf<PFNGLTEXIMAGE4DSGISPROC>
typealias PFNGLTEXIMAGE4DSGISPROC = CPointer<CFunction<(GLenum, GLint, GLenum, GLsizei, GLsizei, GLsizei, GLsizei, GLint, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLTEXSUBIMAGE4DSGISPROCVar = CPointerVarOf<PFNGLTEXSUBIMAGE4DSGISPROC>
typealias PFNGLTEXSUBIMAGE4DSGISPROC = CPointer<CFunction<(GLenum, GLint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLsizei, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLTEXTURECOLORMASKSGISPROCVar = CPointerVarOf<PFNGLTEXTURECOLORMASKSGISPROC>
typealias PFNGLTEXTURECOLORMASKSGISPROC = CPointer<CFunction<(GLboolean, GLboolean, GLboolean, GLboolean) -> Unit>>

typealias PFNGLGETTEXFILTERFUNCSGISPROCVar = CPointerVarOf<PFNGLGETTEXFILTERFUNCSGISPROC>
typealias PFNGLGETTEXFILTERFUNCSGISPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLTEXFILTERFUNCSGISPROCVar = CPointerVarOf<PFNGLTEXFILTERFUNCSGISPROC>
typealias PFNGLTEXFILTERFUNCSGISPROC = CPointer<CFunction<(GLenum, GLenum, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLASYNCMARKERSGIXPROCVar = CPointerVarOf<PFNGLASYNCMARKERSGIXPROC>
typealias PFNGLASYNCMARKERSGIXPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLFINISHASYNCSGIXPROCVar = CPointerVarOf<PFNGLFINISHASYNCSGIXPROC>
typealias PFNGLFINISHASYNCSGIXPROC = CPointer<CFunction<(CPointer<GLuintVar>?) -> GLint>>

typealias PFNGLPOLLASYNCSGIXPROCVar = CPointerVarOf<PFNGLPOLLASYNCSGIXPROC>
typealias PFNGLPOLLASYNCSGIXPROC = CPointer<CFunction<(CPointer<GLuintVar>?) -> GLint>>

typealias PFNGLGENASYNCMARKERSSGIXPROCVar = CPointerVarOf<PFNGLGENASYNCMARKERSSGIXPROC>
typealias PFNGLGENASYNCMARKERSSGIXPROC = CPointer<CFunction<(GLsizei) -> GLuint>>

typealias PFNGLDELETEASYNCMARKERSSGIXPROCVar = CPointerVarOf<PFNGLDELETEASYNCMARKERSSGIXPROC>
typealias PFNGLDELETEASYNCMARKERSSGIXPROC = CPointer<CFunction<(GLuint, GLsizei) -> Unit>>

typealias PFNGLISASYNCMARKERSGIXPROCVar = CPointerVarOf<PFNGLISASYNCMARKERSGIXPROC>
typealias PFNGLISASYNCMARKERSGIXPROC = CPointer<CFunction<(GLuint) -> GLboolean>>

typealias PFNGLFLUSHRASTERSGIXPROCVar = CPointerVarOf<PFNGLFLUSHRASTERSGIXPROC>
typealias PFNGLFLUSHRASTERSGIXPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLFRAGMENTCOLORMATERIALSGIXPROCVar = CPointerVarOf<PFNGLFRAGMENTCOLORMATERIALSGIXPROC>
typealias PFNGLFRAGMENTCOLORMATERIALSGIXPROC = CPointer<CFunction<(GLenum, GLenum) -> Unit>>

typealias PFNGLFRAGMENTLIGHTFSGIXPROCVar = CPointerVarOf<PFNGLFRAGMENTLIGHTFSGIXPROC>
typealias PFNGLFRAGMENTLIGHTFSGIXPROC = CPointer<CFunction<(GLenum, GLenum, GLfloat) -> Unit>>

typealias PFNGLFRAGMENTLIGHTFVSGIXPROCVar = CPointerVarOf<PFNGLFRAGMENTLIGHTFVSGIXPROC>
typealias PFNGLFRAGMENTLIGHTFVSGIXPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLFRAGMENTLIGHTISGIXPROCVar = CPointerVarOf<PFNGLFRAGMENTLIGHTISGIXPROC>
typealias PFNGLFRAGMENTLIGHTISGIXPROC = CPointer<CFunction<(GLenum, GLenum, GLint) -> Unit>>

typealias PFNGLFRAGMENTLIGHTIVSGIXPROCVar = CPointerVarOf<PFNGLFRAGMENTLIGHTIVSGIXPROC>
typealias PFNGLFRAGMENTLIGHTIVSGIXPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLFRAGMENTLIGHTMODELFSGIXPROCVar = CPointerVarOf<PFNGLFRAGMENTLIGHTMODELFSGIXPROC>
typealias PFNGLFRAGMENTLIGHTMODELFSGIXPROC = CPointer<CFunction<(GLenum, GLfloat) -> Unit>>

typealias PFNGLFRAGMENTLIGHTMODELFVSGIXPROCVar = CPointerVarOf<PFNGLFRAGMENTLIGHTMODELFVSGIXPROC>
typealias PFNGLFRAGMENTLIGHTMODELFVSGIXPROC = CPointer<CFunction<(GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLFRAGMENTLIGHTMODELISGIXPROCVar = CPointerVarOf<PFNGLFRAGMENTLIGHTMODELISGIXPROC>
typealias PFNGLFRAGMENTLIGHTMODELISGIXPROC = CPointer<CFunction<(GLenum, GLint) -> Unit>>

typealias PFNGLFRAGMENTLIGHTMODELIVSGIXPROCVar = CPointerVarOf<PFNGLFRAGMENTLIGHTMODELIVSGIXPROC>
typealias PFNGLFRAGMENTLIGHTMODELIVSGIXPROC = CPointer<CFunction<(GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLFRAGMENTMATERIALFSGIXPROCVar = CPointerVarOf<PFNGLFRAGMENTMATERIALFSGIXPROC>
typealias PFNGLFRAGMENTMATERIALFSGIXPROC = CPointer<CFunction<(GLenum, GLenum, GLfloat) -> Unit>>

typealias PFNGLFRAGMENTMATERIALFVSGIXPROCVar = CPointerVarOf<PFNGLFRAGMENTMATERIALFVSGIXPROC>
typealias PFNGLFRAGMENTMATERIALFVSGIXPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLFRAGMENTMATERIALISGIXPROCVar = CPointerVarOf<PFNGLFRAGMENTMATERIALISGIXPROC>
typealias PFNGLFRAGMENTMATERIALISGIXPROC = CPointer<CFunction<(GLenum, GLenum, GLint) -> Unit>>

typealias PFNGLFRAGMENTMATERIALIVSGIXPROCVar = CPointerVarOf<PFNGLFRAGMENTMATERIALIVSGIXPROC>
typealias PFNGLFRAGMENTMATERIALIVSGIXPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETFRAGMENTLIGHTFVSGIXPROCVar = CPointerVarOf<PFNGLGETFRAGMENTLIGHTFVSGIXPROC>
typealias PFNGLGETFRAGMENTLIGHTFVSGIXPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETFRAGMENTLIGHTIVSGIXPROCVar = CPointerVarOf<PFNGLGETFRAGMENTLIGHTIVSGIXPROC>
typealias PFNGLGETFRAGMENTLIGHTIVSGIXPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETFRAGMENTMATERIALFVSGIXPROCVar = CPointerVarOf<PFNGLGETFRAGMENTMATERIALFVSGIXPROC>
typealias PFNGLGETFRAGMENTMATERIALFVSGIXPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETFRAGMENTMATERIALIVSGIXPROCVar = CPointerVarOf<PFNGLGETFRAGMENTMATERIALIVSGIXPROC>
typealias PFNGLGETFRAGMENTMATERIALIVSGIXPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLLIGHTENVISGIXPROCVar = CPointerVarOf<PFNGLLIGHTENVISGIXPROC>
typealias PFNGLLIGHTENVISGIXPROC = CPointer<CFunction<(GLenum, GLint) -> Unit>>

typealias PFNGLFRAMEZOOMSGIXPROCVar = CPointerVarOf<PFNGLFRAMEZOOMSGIXPROC>
typealias PFNGLFRAMEZOOMSGIXPROC = CPointer<CFunction<(GLint) -> Unit>>

typealias PFNGLIGLOOINTERFACESGIXPROCVar = CPointerVarOf<PFNGLIGLOOINTERFACESGIXPROC>
typealias PFNGLIGLOOINTERFACESGIXPROC = CPointer<CFunction<(GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLGETINSTRUMENTSSGIXPROCVar = CPointerVarOf<PFNGLGETINSTRUMENTSSGIXPROC>
typealias PFNGLGETINSTRUMENTSSGIXPROC = CPointer<CFunction<() -> GLint>>

typealias PFNGLINSTRUMENTSBUFFERSGIXPROCVar = CPointerVarOf<PFNGLINSTRUMENTSBUFFERSGIXPROC>
typealias PFNGLINSTRUMENTSBUFFERSGIXPROC = CPointer<CFunction<(GLsizei, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLPOLLINSTRUMENTSSGIXPROCVar = CPointerVarOf<PFNGLPOLLINSTRUMENTSSGIXPROC>
typealias PFNGLPOLLINSTRUMENTSSGIXPROC = CPointer<CFunction<(CPointer<GLintVar>?) -> GLint>>

typealias PFNGLREADINSTRUMENTSSGIXPROCVar = CPointerVarOf<PFNGLREADINSTRUMENTSSGIXPROC>
typealias PFNGLREADINSTRUMENTSSGIXPROC = CPointer<CFunction<(GLint) -> Unit>>

typealias PFNGLSTARTINSTRUMENTSSGIXPROCVar = CPointerVarOf<PFNGLSTARTINSTRUMENTSSGIXPROC>
typealias PFNGLSTARTINSTRUMENTSSGIXPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLSTOPINSTRUMENTSSGIXPROCVar = CPointerVarOf<PFNGLSTOPINSTRUMENTSSGIXPROC>
typealias PFNGLSTOPINSTRUMENTSSGIXPROC = CPointer<CFunction<(GLint) -> Unit>>

typealias PFNGLGETLISTPARAMETERFVSGIXPROCVar = CPointerVarOf<PFNGLGETLISTPARAMETERFVSGIXPROC>
typealias PFNGLGETLISTPARAMETERFVSGIXPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETLISTPARAMETERIVSGIXPROCVar = CPointerVarOf<PFNGLGETLISTPARAMETERIVSGIXPROC>
typealias PFNGLGETLISTPARAMETERIVSGIXPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLLISTPARAMETERFSGIXPROCVar = CPointerVarOf<PFNGLLISTPARAMETERFSGIXPROC>
typealias PFNGLLISTPARAMETERFSGIXPROC = CPointer<CFunction<(GLuint, GLenum, GLfloat) -> Unit>>

typealias PFNGLLISTPARAMETERFVSGIXPROCVar = CPointerVarOf<PFNGLLISTPARAMETERFVSGIXPROC>
typealias PFNGLLISTPARAMETERFVSGIXPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLLISTPARAMETERISGIXPROCVar = CPointerVarOf<PFNGLLISTPARAMETERISGIXPROC>
typealias PFNGLLISTPARAMETERISGIXPROC = CPointer<CFunction<(GLuint, GLenum, GLint) -> Unit>>

typealias PFNGLLISTPARAMETERIVSGIXPROCVar = CPointerVarOf<PFNGLLISTPARAMETERIVSGIXPROC>
typealias PFNGLLISTPARAMETERIVSGIXPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLPIXELTEXGENSGIXPROCVar = CPointerVarOf<PFNGLPIXELTEXGENSGIXPROC>
typealias PFNGLPIXELTEXGENSGIXPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLDEFORMATIONMAP3DSGIXPROCVar = CPointerVarOf<PFNGLDEFORMATIONMAP3DSGIXPROC>
typealias PFNGLDEFORMATIONMAP3DSGIXPROC = CPointer<CFunction<(GLenum, GLdouble, GLdouble, GLint, GLint, GLdouble, GLdouble, GLint, GLint, GLdouble, GLdouble, GLint, GLint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLDEFORMATIONMAP3FSGIXPROCVar = CPointerVarOf<PFNGLDEFORMATIONMAP3FSGIXPROC>
typealias PFNGLDEFORMATIONMAP3FSGIXPROC = CPointer<CFunction<(GLenum, GLfloat, GLfloat, GLint, GLint, GLfloat, GLfloat, GLint, GLint, GLfloat, GLfloat, GLint, GLint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLDEFORMSGIXPROCVar = CPointerVarOf<PFNGLDEFORMSGIXPROC>
typealias PFNGLDEFORMSGIXPROC = CPointer<CFunction<(GLbitfield) -> Unit>>

typealias PFNGLLOADIDENTITYDEFORMATIONMAPSGIXPROCVar = CPointerVarOf<PFNGLLOADIDENTITYDEFORMATIONMAPSGIXPROC>
typealias PFNGLLOADIDENTITYDEFORMATIONMAPSGIXPROC = CPointer<CFunction<(GLbitfield) -> Unit>>

typealias PFNGLREFERENCEPLANESGIXPROCVar = CPointerVarOf<PFNGLREFERENCEPLANESGIXPROC>
typealias PFNGLREFERENCEPLANESGIXPROC = CPointer<CFunction<(CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLSPRITEPARAMETERFSGIXPROCVar = CPointerVarOf<PFNGLSPRITEPARAMETERFSGIXPROC>
typealias PFNGLSPRITEPARAMETERFSGIXPROC = CPointer<CFunction<(GLenum, GLfloat) -> Unit>>

typealias PFNGLSPRITEPARAMETERFVSGIXPROCVar = CPointerVarOf<PFNGLSPRITEPARAMETERFVSGIXPROC>
typealias PFNGLSPRITEPARAMETERFVSGIXPROC = CPointer<CFunction<(GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLSPRITEPARAMETERISGIXPROCVar = CPointerVarOf<PFNGLSPRITEPARAMETERISGIXPROC>
typealias PFNGLSPRITEPARAMETERISGIXPROC = CPointer<CFunction<(GLenum, GLint) -> Unit>>

typealias PFNGLSPRITEPARAMETERIVSGIXPROCVar = CPointerVarOf<PFNGLSPRITEPARAMETERIVSGIXPROC>
typealias PFNGLSPRITEPARAMETERIVSGIXPROC = CPointer<CFunction<(GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLTAGSAMPLEBUFFERSGIXPROCVar = CPointerVarOf<PFNGLTAGSAMPLEBUFFERSGIXPROC>
typealias PFNGLTAGSAMPLEBUFFERSGIXPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLCOLORTABLESGIPROCVar = CPointerVarOf<PFNGLCOLORTABLESGIPROC>
typealias PFNGLCOLORTABLESGIPROC = CPointer<CFunction<(GLenum, GLenum, GLsizei, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLCOLORTABLEPARAMETERFVSGIPROCVar = CPointerVarOf<PFNGLCOLORTABLEPARAMETERFVSGIPROC>
typealias PFNGLCOLORTABLEPARAMETERFVSGIPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLCOLORTABLEPARAMETERIVSGIPROCVar = CPointerVarOf<PFNGLCOLORTABLEPARAMETERIVSGIPROC>
typealias PFNGLCOLORTABLEPARAMETERIVSGIPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLCOPYCOLORTABLESGIPROCVar = CPointerVarOf<PFNGLCOPYCOLORTABLESGIPROC>
typealias PFNGLCOPYCOLORTABLESGIPROC = CPointer<CFunction<(GLenum, GLenum, GLint, GLint, GLsizei) -> Unit>>

typealias PFNGLGETCOLORTABLESGIPROCVar = CPointerVarOf<PFNGLGETCOLORTABLESGIPROC>
typealias PFNGLGETCOLORTABLESGIPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLGETCOLORTABLEPARAMETERFVSGIPROCVar = CPointerVarOf<PFNGLGETCOLORTABLEPARAMETERFVSGIPROC>
typealias PFNGLGETCOLORTABLEPARAMETERFVSGIPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETCOLORTABLEPARAMETERIVSGIPROCVar = CPointerVarOf<PFNGLGETCOLORTABLEPARAMETERIVSGIPROC>
typealias PFNGLGETCOLORTABLEPARAMETERIVSGIPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLFINISHTEXTURESUNXPROCVar = CPointerVarOf<PFNGLFINISHTEXTURESUNXPROC>
typealias PFNGLFINISHTEXTURESUNXPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLGLOBALALPHAFACTORBSUNPROCVar = CPointerVarOf<PFNGLGLOBALALPHAFACTORBSUNPROC>
typealias PFNGLGLOBALALPHAFACTORBSUNPROC = CPointer<CFunction<(GLbyte) -> Unit>>

typealias PFNGLGLOBALALPHAFACTORSSUNPROCVar = CPointerVarOf<PFNGLGLOBALALPHAFACTORSSUNPROC>
typealias PFNGLGLOBALALPHAFACTORSSUNPROC = CPointer<CFunction<(GLshort) -> Unit>>

typealias PFNGLGLOBALALPHAFACTORISUNPROCVar = CPointerVarOf<PFNGLGLOBALALPHAFACTORISUNPROC>
typealias PFNGLGLOBALALPHAFACTORISUNPROC = CPointer<CFunction<(GLint) -> Unit>>

typealias PFNGLGLOBALALPHAFACTORFSUNPROCVar = CPointerVarOf<PFNGLGLOBALALPHAFACTORFSUNPROC>
typealias PFNGLGLOBALALPHAFACTORFSUNPROC = CPointer<CFunction<(GLfloat) -> Unit>>

typealias PFNGLGLOBALALPHAFACTORDSUNPROCVar = CPointerVarOf<PFNGLGLOBALALPHAFACTORDSUNPROC>
typealias PFNGLGLOBALALPHAFACTORDSUNPROC = CPointer<CFunction<(GLdouble) -> Unit>>

typealias PFNGLGLOBALALPHAFACTORUBSUNPROCVar = CPointerVarOf<PFNGLGLOBALALPHAFACTORUBSUNPROC>
typealias PFNGLGLOBALALPHAFACTORUBSUNPROC = CPointer<CFunction<(GLubyte) -> Unit>>

typealias PFNGLGLOBALALPHAFACTORUSSUNPROCVar = CPointerVarOf<PFNGLGLOBALALPHAFACTORUSSUNPROC>
typealias PFNGLGLOBALALPHAFACTORUSSUNPROC = CPointer<CFunction<(GLushort) -> Unit>>

typealias PFNGLGLOBALALPHAFACTORUISUNPROCVar = CPointerVarOf<PFNGLGLOBALALPHAFACTORUISUNPROC>
typealias PFNGLGLOBALALPHAFACTORUISUNPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLDRAWMESHARRAYSSUNPROCVar = CPointerVarOf<PFNGLDRAWMESHARRAYSSUNPROC>
typealias PFNGLDRAWMESHARRAYSSUNPROC = CPointer<CFunction<(GLenum, GLint, GLsizei, GLsizei) -> Unit>>

typealias PFNGLREPLACEMENTCODEUISUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEUISUNPROC>
typealias PFNGLREPLACEMENTCODEUISUNPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLREPLACEMENTCODEUSSUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEUSSUNPROC>
typealias PFNGLREPLACEMENTCODEUSSUNPROC = CPointer<CFunction<(GLushort) -> Unit>>

typealias PFNGLREPLACEMENTCODEUBSUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEUBSUNPROC>
typealias PFNGLREPLACEMENTCODEUBSUNPROC = CPointer<CFunction<(GLubyte) -> Unit>>

typealias PFNGLREPLACEMENTCODEUIVSUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEUIVSUNPROC>
typealias PFNGLREPLACEMENTCODEUIVSUNPROC = CPointer<CFunction<(CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLREPLACEMENTCODEUSVSUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEUSVSUNPROC>
typealias PFNGLREPLACEMENTCODEUSVSUNPROC = CPointer<CFunction<(CPointer<GLushortVar>?) -> Unit>>

typealias PFNGLREPLACEMENTCODEUBVSUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEUBVSUNPROC>
typealias PFNGLREPLACEMENTCODEUBVSUNPROC = CPointer<CFunction<(CPointer<GLubyteVar>?) -> Unit>>

typealias PFNGLREPLACEMENTCODEPOINTERSUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEPOINTERSUNPROC>
typealias PFNGLREPLACEMENTCODEPOINTERSUNPROC = CPointer<CFunction<(GLenum, GLsizei, CPointer<COpaquePointerVar>?) -> Unit>>

typealias PFNGLCOLOR4UBVERTEX2FSUNPROCVar = CPointerVarOf<PFNGLCOLOR4UBVERTEX2FSUNPROC>
typealias PFNGLCOLOR4UBVERTEX2FSUNPROC = CPointer<CFunction<(GLubyte, GLubyte, GLubyte, GLubyte, GLfloat, GLfloat) -> Unit>>

typealias PFNGLCOLOR4UBVERTEX2FVSUNPROCVar = CPointerVarOf<PFNGLCOLOR4UBVERTEX2FVSUNPROC>
typealias PFNGLCOLOR4UBVERTEX2FVSUNPROC = CPointer<CFunction<(CPointer<GLubyteVar>?, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLCOLOR4UBVERTEX3FSUNPROCVar = CPointerVarOf<PFNGLCOLOR4UBVERTEX3FSUNPROC>
typealias PFNGLCOLOR4UBVERTEX3FSUNPROC = CPointer<CFunction<(GLubyte, GLubyte, GLubyte, GLubyte, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLCOLOR4UBVERTEX3FVSUNPROCVar = CPointerVarOf<PFNGLCOLOR4UBVERTEX3FVSUNPROC>
typealias PFNGLCOLOR4UBVERTEX3FVSUNPROC = CPointer<CFunction<(CPointer<GLubyteVar>?, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLCOLOR3FVERTEX3FSUNPROCVar = CPointerVarOf<PFNGLCOLOR3FVERTEX3FSUNPROC>
typealias PFNGLCOLOR3FVERTEX3FSUNPROC = CPointer<CFunction<(GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLCOLOR3FVERTEX3FVSUNPROCVar = CPointerVarOf<PFNGLCOLOR3FVERTEX3FVSUNPROC>
typealias PFNGLCOLOR3FVERTEX3FVSUNPROC = CPointer<CFunction<(CPointer<GLfloatVar>?, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLNORMAL3FVERTEX3FSUNPROCVar = CPointerVarOf<PFNGLNORMAL3FVERTEX3FSUNPROC>
typealias PFNGLNORMAL3FVERTEX3FSUNPROC = CPointer<CFunction<(GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLNORMAL3FVERTEX3FVSUNPROCVar = CPointerVarOf<PFNGLNORMAL3FVERTEX3FVSUNPROC>
typealias PFNGLNORMAL3FVERTEX3FVSUNPROC = CPointer<CFunction<(CPointer<GLfloatVar>?, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLCOLOR4FNORMAL3FVERTEX3FSUNPROCVar = CPointerVarOf<PFNGLCOLOR4FNORMAL3FVERTEX3FSUNPROC>
typealias PFNGLCOLOR4FNORMAL3FVERTEX3FSUNPROC = CPointer<CFunction<(GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLCOLOR4FNORMAL3FVERTEX3FVSUNPROCVar = CPointerVarOf<PFNGLCOLOR4FNORMAL3FVERTEX3FVSUNPROC>
typealias PFNGLCOLOR4FNORMAL3FVERTEX3FVSUNPROC = CPointer<CFunction<(CPointer<GLfloatVar>?, CPointer<GLfloatVar>?, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLTEXCOORD2FVERTEX3FSUNPROCVar = CPointerVarOf<PFNGLTEXCOORD2FVERTEX3FSUNPROC>
typealias PFNGLTEXCOORD2FVERTEX3FSUNPROC = CPointer<CFunction<(GLfloat, GLfloat, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLTEXCOORD2FVERTEX3FVSUNPROCVar = CPointerVarOf<PFNGLTEXCOORD2FVERTEX3FVSUNPROC>
typealias PFNGLTEXCOORD2FVERTEX3FVSUNPROC = CPointer<CFunction<(CPointer<GLfloatVar>?, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLTEXCOORD4FVERTEX4FSUNPROCVar = CPointerVarOf<PFNGLTEXCOORD4FVERTEX4FSUNPROC>
typealias PFNGLTEXCOORD4FVERTEX4FSUNPROC = CPointer<CFunction<(GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLTEXCOORD4FVERTEX4FVSUNPROCVar = CPointerVarOf<PFNGLTEXCOORD4FVERTEX4FVSUNPROC>
typealias PFNGLTEXCOORD4FVERTEX4FVSUNPROC = CPointer<CFunction<(CPointer<GLfloatVar>?, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLTEXCOORD2FCOLOR4UBVERTEX3FSUNPROCVar = CPointerVarOf<PFNGLTEXCOORD2FCOLOR4UBVERTEX3FSUNPROC>
typealias PFNGLTEXCOORD2FCOLOR4UBVERTEX3FSUNPROC = CPointer<CFunction<(GLfloat, GLfloat, GLubyte, GLubyte, GLubyte, GLubyte, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLTEXCOORD2FCOLOR4UBVERTEX3FVSUNPROCVar = CPointerVarOf<PFNGLTEXCOORD2FCOLOR4UBVERTEX3FVSUNPROC>
typealias PFNGLTEXCOORD2FCOLOR4UBVERTEX3FVSUNPROC = CPointer<CFunction<(CPointer<GLfloatVar>?, CPointer<GLubyteVar>?, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLTEXCOORD2FCOLOR3FVERTEX3FSUNPROCVar = CPointerVarOf<PFNGLTEXCOORD2FCOLOR3FVERTEX3FSUNPROC>
typealias PFNGLTEXCOORD2FCOLOR3FVERTEX3FSUNPROC = CPointer<CFunction<(GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLTEXCOORD2FCOLOR3FVERTEX3FVSUNPROCVar = CPointerVarOf<PFNGLTEXCOORD2FCOLOR3FVERTEX3FVSUNPROC>
typealias PFNGLTEXCOORD2FCOLOR3FVERTEX3FVSUNPROC = CPointer<CFunction<(CPointer<GLfloatVar>?, CPointer<GLfloatVar>?, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLTEXCOORD2FNORMAL3FVERTEX3FSUNPROCVar = CPointerVarOf<PFNGLTEXCOORD2FNORMAL3FVERTEX3FSUNPROC>
typealias PFNGLTEXCOORD2FNORMAL3FVERTEX3FSUNPROC = CPointer<CFunction<(GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLTEXCOORD2FNORMAL3FVERTEX3FVSUNPROCVar = CPointerVarOf<PFNGLTEXCOORD2FNORMAL3FVERTEX3FVSUNPROC>
typealias PFNGLTEXCOORD2FNORMAL3FVERTEX3FVSUNPROC = CPointer<CFunction<(CPointer<GLfloatVar>?, CPointer<GLfloatVar>?, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLTEXCOORD2FCOLOR4FNORMAL3FVERTEX3FSUNPROCVar = CPointerVarOf<PFNGLTEXCOORD2FCOLOR4FNORMAL3FVERTEX3FSUNPROC>
typealias PFNGLTEXCOORD2FCOLOR4FNORMAL3FVERTEX3FSUNPROC = CPointer<CFunction<(GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLTEXCOORD2FCOLOR4FNORMAL3FVERTEX3FVSUNPROCVar = CPointerVarOf<PFNGLTEXCOORD2FCOLOR4FNORMAL3FVERTEX3FVSUNPROC>
typealias PFNGLTEXCOORD2FCOLOR4FNORMAL3FVERTEX3FVSUNPROC = CPointer<CFunction<(CPointer<GLfloatVar>?, CPointer<GLfloatVar>?, CPointer<GLfloatVar>?, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLTEXCOORD4FCOLOR4FNORMAL3FVERTEX4FSUNPROCVar = CPointerVarOf<PFNGLTEXCOORD4FCOLOR4FNORMAL3FVERTEX4FSUNPROC>
typealias PFNGLTEXCOORD4FCOLOR4FNORMAL3FVERTEX4FSUNPROC = CPointer<CFunction<(GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLTEXCOORD4FCOLOR4FNORMAL3FVERTEX4FVSUNPROCVar = CPointerVarOf<PFNGLTEXCOORD4FCOLOR4FNORMAL3FVERTEX4FVSUNPROC>
typealias PFNGLTEXCOORD4FCOLOR4FNORMAL3FVERTEX4FVSUNPROC = CPointer<CFunction<(CPointer<GLfloatVar>?, CPointer<GLfloatVar>?, CPointer<GLfloatVar>?, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLREPLACEMENTCODEUIVERTEX3FSUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEUIVERTEX3FSUNPROC>
typealias PFNGLREPLACEMENTCODEUIVERTEX3FSUNPROC = CPointer<CFunction<(GLuint, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLREPLACEMENTCODEUIVERTEX3FVSUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEUIVERTEX3FVSUNPROC>
typealias PFNGLREPLACEMENTCODEUIVERTEX3FVSUNPROC = CPointer<CFunction<(CPointer<GLuintVar>?, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLREPLACEMENTCODEUICOLOR4UBVERTEX3FSUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEUICOLOR4UBVERTEX3FSUNPROC>
typealias PFNGLREPLACEMENTCODEUICOLOR4UBVERTEX3FSUNPROC = CPointer<CFunction<(GLuint, GLubyte, GLubyte, GLubyte, GLubyte, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLREPLACEMENTCODEUICOLOR4UBVERTEX3FVSUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEUICOLOR4UBVERTEX3FVSUNPROC>
typealias PFNGLREPLACEMENTCODEUICOLOR4UBVERTEX3FVSUNPROC = CPointer<CFunction<(CPointer<GLuintVar>?, CPointer<GLubyteVar>?, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLREPLACEMENTCODEUICOLOR3FVERTEX3FSUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEUICOLOR3FVERTEX3FSUNPROC>
typealias PFNGLREPLACEMENTCODEUICOLOR3FVERTEX3FSUNPROC = CPointer<CFunction<(GLuint, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLREPLACEMENTCODEUICOLOR3FVERTEX3FVSUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEUICOLOR3FVERTEX3FVSUNPROC>
typealias PFNGLREPLACEMENTCODEUICOLOR3FVERTEX3FVSUNPROC = CPointer<CFunction<(CPointer<GLuintVar>?, CPointer<GLfloatVar>?, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLREPLACEMENTCODEUINORMAL3FVERTEX3FSUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEUINORMAL3FVERTEX3FSUNPROC>
typealias PFNGLREPLACEMENTCODEUINORMAL3FVERTEX3FSUNPROC = CPointer<CFunction<(GLuint, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLREPLACEMENTCODEUINORMAL3FVERTEX3FVSUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEUINORMAL3FVERTEX3FVSUNPROC>
typealias PFNGLREPLACEMENTCODEUINORMAL3FVERTEX3FVSUNPROC = CPointer<CFunction<(CPointer<GLuintVar>?, CPointer<GLfloatVar>?, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLREPLACEMENTCODEUICOLOR4FNORMAL3FVERTEX3FSUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEUICOLOR4FNORMAL3FVERTEX3FSUNPROC>
typealias PFNGLREPLACEMENTCODEUICOLOR4FNORMAL3FVERTEX3FSUNPROC = CPointer<CFunction<(GLuint, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLREPLACEMENTCODEUICOLOR4FNORMAL3FVERTEX3FVSUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEUICOLOR4FNORMAL3FVERTEX3FVSUNPROC>
typealias PFNGLREPLACEMENTCODEUICOLOR4FNORMAL3FVERTEX3FVSUNPROC = CPointer<CFunction<(CPointer<GLuintVar>?, CPointer<GLfloatVar>?, CPointer<GLfloatVar>?, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLREPLACEMENTCODEUITEXCOORD2FVERTEX3FSUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEUITEXCOORD2FVERTEX3FSUNPROC>
typealias PFNGLREPLACEMENTCODEUITEXCOORD2FVERTEX3FSUNPROC = CPointer<CFunction<(GLuint, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLREPLACEMENTCODEUITEXCOORD2FVERTEX3FVSUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEUITEXCOORD2FVERTEX3FVSUNPROC>
typealias PFNGLREPLACEMENTCODEUITEXCOORD2FVERTEX3FVSUNPROC = CPointer<CFunction<(CPointer<GLuintVar>?, CPointer<GLfloatVar>?, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLREPLACEMENTCODEUITEXCOORD2FNORMAL3FVERTEX3FSUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEUITEXCOORD2FNORMAL3FVERTEX3FSUNPROC>
typealias PFNGLREPLACEMENTCODEUITEXCOORD2FNORMAL3FVERTEX3FSUNPROC = CPointer<CFunction<(GLuint, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLREPLACEMENTCODEUITEXCOORD2FNORMAL3FVERTEX3FVSUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEUITEXCOORD2FNORMAL3FVERTEX3FVSUNPROC>
typealias PFNGLREPLACEMENTCODEUITEXCOORD2FNORMAL3FVERTEX3FVSUNPROC = CPointer<CFunction<(CPointer<GLuintVar>?, CPointer<GLfloatVar>?, CPointer<GLfloatVar>?, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLREPLACEMENTCODEUITEXCOORD2FCOLOR4FNORMAL3FVERTEX3FSUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEUITEXCOORD2FCOLOR4FNORMAL3FVERTEX3FSUNPROC>
typealias PFNGLREPLACEMENTCODEUITEXCOORD2FCOLOR4FNORMAL3FVERTEX3FSUNPROC = CPointer<CFunction<(GLuint, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLREPLACEMENTCODEUITEXCOORD2FCOLOR4FNORMAL3FVERTEX3FVSUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEUITEXCOORD2FCOLOR4FNORMAL3FVERTEX3FVSUNPROC>
typealias PFNGLREPLACEMENTCODEUITEXCOORD2FCOLOR4FNORMAL3FVERTEX3FVSUNPROC = CPointer<CFunction<(CPointer<GLuintVar>?, CPointer<GLfloatVar>?, CPointer<GLfloatVar>?, CPointer<GLfloatVar>?, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLBLENDEQUATIONSEPARATEATIPROCVar = CPointerVarOf<PFNGLBLENDEQUATIONSEPARATEATIPROC>
typealias PFNGLBLENDEQUATIONSEPARATEATIPROC = CPointer<CFunction<(GLenum, GLenum) -> Unit>>

typealias GLeglImageOESVar = CPointerVarOf<GLeglImageOES>
typealias GLeglImageOES = COpaquePointer

typealias PFNGLEGLIMAGETARGETTEXTURE2DOESPROCVar = CPointerVarOf<PFNGLEGLIMAGETARGETTEXTURE2DOESPROC>
typealias PFNGLEGLIMAGETARGETTEXTURE2DOESPROC = CPointer<CFunction<(GLenum, GLeglImageOES?) -> Unit>>

typealias PFNGLEGLIMAGETARGETRENDERBUFFERSTORAGEOESPROCVar = CPointerVarOf<PFNGLEGLIMAGETARGETRENDERBUFFERSTORAGEOESPROC>
typealias PFNGLEGLIMAGETARGETRENDERBUFFERSTORAGEOESPROC = CPointer<CFunction<(GLenum, GLeglImageOES?) -> Unit>>

typealias GLFWglprocVar = CPointerVarOf<GLFWglproc>
typealias GLFWglproc = CPointer<CFunction<() -> Unit>>

typealias GLFWvkprocVar = CPointerVarOf<GLFWvkproc>
typealias GLFWvkproc = CPointer<CFunction<() -> Unit>>

typealias GLFWerrorfunVar = CPointerVarOf<GLFWerrorfun>
typealias GLFWerrorfun = CPointer<CFunction<(Int, CPointer<ByteVar>?) -> Unit>>

typealias GLFWwindowposfunVar = CPointerVarOf<GLFWwindowposfun>
typealias GLFWwindowposfun = CPointer<CFunction<(CPointer<GLFWwindow>?, Int, Int) -> Unit>>

typealias GLFWwindowsizefunVar = CPointerVarOf<GLFWwindowsizefun>
typealias GLFWwindowsizefun = CPointer<CFunction<(CPointer<GLFWwindow>?, Int, Int) -> Unit>>

typealias GLFWwindowclosefunVar = CPointerVarOf<GLFWwindowclosefun>
typealias GLFWwindowclosefun = CPointer<CFunction<(CPointer<GLFWwindow>?) -> Unit>>

typealias GLFWwindowrefreshfunVar = CPointerVarOf<GLFWwindowrefreshfun>
typealias GLFWwindowrefreshfun = CPointer<CFunction<(CPointer<GLFWwindow>?) -> Unit>>

typealias GLFWwindowfocusfunVar = CPointerVarOf<GLFWwindowfocusfun>
typealias GLFWwindowfocusfun = CPointer<CFunction<(CPointer<GLFWwindow>?, Int) -> Unit>>

typealias GLFWwindowiconifyfunVar = CPointerVarOf<GLFWwindowiconifyfun>
typealias GLFWwindowiconifyfun = CPointer<CFunction<(CPointer<GLFWwindow>?, Int) -> Unit>>

typealias GLFWframebuffersizefunVar = CPointerVarOf<GLFWframebuffersizefun>
typealias GLFWframebuffersizefun = CPointer<CFunction<(CPointer<GLFWwindow>?, Int, Int) -> Unit>>

typealias GLFWmousebuttonfunVar = CPointerVarOf<GLFWmousebuttonfun>
typealias GLFWmousebuttonfun = CPointer<CFunction<(CPointer<GLFWwindow>?, Int, Int, Int) -> Unit>>

typealias GLFWcursorposfunVar = CPointerVarOf<GLFWcursorposfun>
typealias GLFWcursorposfun = CPointer<CFunction<(CPointer<GLFWwindow>?, Double, Double) -> Unit>>

typealias GLFWcursorenterfunVar = CPointerVarOf<GLFWcursorenterfun>
typealias GLFWcursorenterfun = CPointer<CFunction<(CPointer<GLFWwindow>?, Int) -> Unit>>

typealias GLFWscrollfunVar = CPointerVarOf<GLFWscrollfun>
typealias GLFWscrollfun = CPointer<CFunction<(CPointer<GLFWwindow>?, Double, Double) -> Unit>>

typealias GLFWkeyfunVar = CPointerVarOf<GLFWkeyfun>
typealias GLFWkeyfun = CPointer<CFunction<(CPointer<GLFWwindow>?, Int, Int, Int, Int) -> Unit>>

typealias GLFWcharfunVar = CPointerVarOf<GLFWcharfun>
typealias GLFWcharfun = CPointer<CFunction<(CPointer<GLFWwindow>?, UInt) -> Unit>>

typealias GLFWcharmodsfunVar = CPointerVarOf<GLFWcharmodsfun>
typealias GLFWcharmodsfun = CPointer<CFunction<(CPointer<GLFWwindow>?, UInt, Int) -> Unit>>

typealias GLFWdropfunVar = CPointerVarOf<GLFWdropfun>
typealias GLFWdropfun = CPointer<CFunction<(CPointer<GLFWwindow>?, Int, CPointer<CPointerVar<ByteVar>>?) -> Unit>>

typealias GLFWmonitorfunVar = CPointerVarOf<GLFWmonitorfun>
typealias GLFWmonitorfun = CPointer<CFunction<(CPointer<GLFWmonitor>?, Int) -> Unit>>

typealias GLFWjoystickfunVar = CPointerVarOf<GLFWjoystickfun>
typealias GLFWjoystickfun = CPointer<CFunction<(Int, Int) -> Unit>>

@SymbolName("glfw_kniBridge0")
private external fun kniBridge0(p0: Float): Unit
@SymbolName("glfw_kniBridge1")
private external fun kniBridge1(p0: Float, p1: Float, p2: Float, p3: Float): Unit
@SymbolName("glfw_kniBridge2")
private external fun kniBridge2(p0: UInt): Unit
@SymbolName("glfw_kniBridge3")
private external fun kniBridge3(p0: UInt): Unit
@SymbolName("glfw_kniBridge4")
private external fun kniBridge4(p0: UByte, p1: UByte, p2: UByte, p3: UByte): Unit
@SymbolName("glfw_kniBridge5")
private external fun kniBridge5(p0: UInt, p1: Float): Unit
@SymbolName("glfw_kniBridge6")
private external fun kniBridge6(p0: UInt, p1: UInt): Unit
@SymbolName("glfw_kniBridge7")
private external fun kniBridge7(p0: UInt): Unit
@SymbolName("glfw_kniBridge8")
private external fun kniBridge8(p0: UInt): Unit
@SymbolName("glfw_kniBridge9")
private external fun kniBridge9(p0: UInt): Unit
@SymbolName("glfw_kniBridge10")
private external fun kniBridge10(p0: Float): Unit
@SymbolName("glfw_kniBridge11")
private external fun kniBridge11(p0: Float): Unit
@SymbolName("glfw_kniBridge12")
private external fun kniBridge12(p0: Int, p1: UShort): Unit
@SymbolName("glfw_kniBridge13")
private external fun kniBridge13(p0: UInt, p1: UInt): Unit
@SymbolName("glfw_kniBridge14")
private external fun kniBridge14(p0: Float, p1: Float): Unit
@SymbolName("glfw_kniBridge15")
private external fun kniBridge15(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge16")
private external fun kniBridge16(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge17")
private external fun kniBridge17(p0: UByte): Unit
@SymbolName("glfw_kniBridge18")
private external fun kniBridge18(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge19")
private external fun kniBridge19(p0: Int, p1: Int, p2: Int, p3: Int): Unit
@SymbolName("glfw_kniBridge20")
private external fun kniBridge20(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge21")
private external fun kniBridge21(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge22")
private external fun kniBridge22(p0: UInt): Unit
@SymbolName("glfw_kniBridge23")
private external fun kniBridge23(p0: UInt): Unit
@SymbolName("glfw_kniBridge24")
private external fun kniBridge24(p0: UInt): Unit
@SymbolName("glfw_kniBridge25")
private external fun kniBridge25(p0: UInt): Unit
@SymbolName("glfw_kniBridge26")
private external fun kniBridge26(p0: UInt): UByte
@SymbolName("glfw_kniBridge27")
private external fun kniBridge27(p0: UInt): Unit
@SymbolName("glfw_kniBridge28")
private external fun kniBridge28(p0: UInt): Unit
@SymbolName("glfw_kniBridge29")
private external fun kniBridge29(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge30")
private external fun kniBridge30(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge31")
private external fun kniBridge31(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge32")
private external fun kniBridge32(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge33")
private external fun kniBridge33(p0: UInt): Unit
@SymbolName("glfw_kniBridge34")
private external fun kniBridge34(): Unit
@SymbolName("glfw_kniBridge35")
private external fun kniBridge35(p0: UInt): Unit
@SymbolName("glfw_kniBridge36")
private external fun kniBridge36(): Unit
@SymbolName("glfw_kniBridge37")
private external fun kniBridge37(p0: UInt): Int
@SymbolName("glfw_kniBridge38")
private external fun kniBridge38(): UInt
@SymbolName("glfw_kniBridge39")
private external fun kniBridge39(p0: UInt): NativePtr
@SymbolName("glfw_kniBridge40")
private external fun kniBridge40(): Unit
@SymbolName("glfw_kniBridge41")
private external fun kniBridge41(): Unit
@SymbolName("glfw_kniBridge42")
private external fun kniBridge42(p0: UInt, p1: UInt): Unit
@SymbolName("glfw_kniBridge43")
private external fun kniBridge43(p0: Double): Unit
@SymbolName("glfw_kniBridge44")
private external fun kniBridge44(p0: UInt): Unit
@SymbolName("glfw_kniBridge45")
private external fun kniBridge45(p0: UByte): Unit
@SymbolName("glfw_kniBridge46")
private external fun kniBridge46(p0: Double, p1: Double): Unit
@SymbolName("glfw_kniBridge47")
private external fun kniBridge47(p0: Float, p1: Float, p2: Float, p3: Float): Unit
@SymbolName("glfw_kniBridge48")
private external fun kniBridge48(p0: UInt, p1: Float): Unit
@SymbolName("glfw_kniBridge49")
private external fun kniBridge49(p0: UInt): Unit
@SymbolName("glfw_kniBridge50")
private external fun kniBridge50(p0: Double, p1: Double, p2: Double, p3: Double, p4: Double, p5: Double): Unit
@SymbolName("glfw_kniBridge51")
private external fun kniBridge51(p0: Double, p1: Double, p2: Double, p3: Double, p4: Double, p5: Double): Unit
@SymbolName("glfw_kniBridge52")
private external fun kniBridge52(p0: Int, p1: Int, p2: Int, p3: Int): Unit
@SymbolName("glfw_kniBridge53")
private external fun kniBridge53(): Unit
@SymbolName("glfw_kniBridge54")
private external fun kniBridge54(): Unit
@SymbolName("glfw_kniBridge55")
private external fun kniBridge55(): Unit
@SymbolName("glfw_kniBridge56")
private external fun kniBridge56(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge57")
private external fun kniBridge57(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge58")
private external fun kniBridge58(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge59")
private external fun kniBridge59(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge60")
private external fun kniBridge60(p0: Double, p1: Double, p2: Double, p3: Double): Unit
@SymbolName("glfw_kniBridge61")
private external fun kniBridge61(p0: Float, p1: Float, p2: Float, p3: Float): Unit
@SymbolName("glfw_kniBridge62")
private external fun kniBridge62(p0: Double, p1: Double, p2: Double): Unit
@SymbolName("glfw_kniBridge63")
private external fun kniBridge63(p0: Float, p1: Float, p2: Float): Unit
@SymbolName("glfw_kniBridge64")
private external fun kniBridge64(p0: Double, p1: Double, p2: Double): Unit
@SymbolName("glfw_kniBridge65")
private external fun kniBridge65(p0: Float, p1: Float, p2: Float): Unit
@SymbolName("glfw_kniBridge66")
private external fun kniBridge66(p0: UInt): UByte
@SymbolName("glfw_kniBridge67")
private external fun kniBridge67(p0: UInt, p1: Int): Unit
@SymbolName("glfw_kniBridge68")
private external fun kniBridge68(p0: Int): UInt
@SymbolName("glfw_kniBridge69")
private external fun kniBridge69(p0: UInt, p1: UInt): Unit
@SymbolName("glfw_kniBridge70")
private external fun kniBridge70(): Unit
@SymbolName("glfw_kniBridge71")
private external fun kniBridge71(p0: UInt): Unit
@SymbolName("glfw_kniBridge72")
private external fun kniBridge72(p0: Int, p1: UInt, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge73")
private external fun kniBridge73(p0: UInt): Unit
@SymbolName("glfw_kniBridge74")
private external fun kniBridge74(p0: UInt): Unit
@SymbolName("glfw_kniBridge75")
private external fun kniBridge75(): Unit
@SymbolName("glfw_kniBridge76")
private external fun kniBridge76(p0: Double, p1: Double): Unit
@SymbolName("glfw_kniBridge77")
private external fun kniBridge77(p0: Float, p1: Float): Unit
@SymbolName("glfw_kniBridge78")
private external fun kniBridge78(p0: Int, p1: Int): Unit
@SymbolName("glfw_kniBridge79")
private external fun kniBridge79(p0: Short, p1: Short): Unit
@SymbolName("glfw_kniBridge80")
private external fun kniBridge80(p0: Double, p1: Double, p2: Double): Unit
@SymbolName("glfw_kniBridge81")
private external fun kniBridge81(p0: Float, p1: Float, p2: Float): Unit
@SymbolName("glfw_kniBridge82")
private external fun kniBridge82(p0: Int, p1: Int, p2: Int): Unit
@SymbolName("glfw_kniBridge83")
private external fun kniBridge83(p0: Short, p1: Short, p2: Short): Unit
@SymbolName("glfw_kniBridge84")
private external fun kniBridge84(p0: Double, p1: Double, p2: Double, p3: Double): Unit
@SymbolName("glfw_kniBridge85")
private external fun kniBridge85(p0: Float, p1: Float, p2: Float, p3: Float): Unit
@SymbolName("glfw_kniBridge86")
private external fun kniBridge86(p0: Int, p1: Int, p2: Int, p3: Int): Unit
@SymbolName("glfw_kniBridge87")
private external fun kniBridge87(p0: Short, p1: Short, p2: Short, p3: Short): Unit
@SymbolName("glfw_kniBridge88")
private external fun kniBridge88(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge89")
private external fun kniBridge89(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge90")
private external fun kniBridge90(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge91")
private external fun kniBridge91(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge92")
private external fun kniBridge92(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge93")
private external fun kniBridge93(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge94")
private external fun kniBridge94(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge95")
private external fun kniBridge95(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge96")
private external fun kniBridge96(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge97")
private external fun kniBridge97(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge98")
private external fun kniBridge98(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge99")
private external fun kniBridge99(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge100")
private external fun kniBridge100(p0: Byte, p1: Byte, p2: Byte): Unit
@SymbolName("glfw_kniBridge101")
private external fun kniBridge101(p0: Double, p1: Double, p2: Double): Unit
@SymbolName("glfw_kniBridge102")
private external fun kniBridge102(p0: Float, p1: Float, p2: Float): Unit
@SymbolName("glfw_kniBridge103")
private external fun kniBridge103(p0: Int, p1: Int, p2: Int): Unit
@SymbolName("glfw_kniBridge104")
private external fun kniBridge104(p0: Short, p1: Short, p2: Short): Unit
@SymbolName("glfw_kniBridge105")
private external fun kniBridge105(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge106")
private external fun kniBridge106(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge107")
private external fun kniBridge107(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge108")
private external fun kniBridge108(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge109")
private external fun kniBridge109(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge110")
private external fun kniBridge110(p0: Double): Unit
@SymbolName("glfw_kniBridge111")
private external fun kniBridge111(p0: Float): Unit
@SymbolName("glfw_kniBridge112")
private external fun kniBridge112(p0: Int): Unit
@SymbolName("glfw_kniBridge113")
private external fun kniBridge113(p0: Short): Unit
@SymbolName("glfw_kniBridge114")
private external fun kniBridge114(p0: UByte): Unit
@SymbolName("glfw_kniBridge115")
private external fun kniBridge115(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge116")
private external fun kniBridge116(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge117")
private external fun kniBridge117(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge118")
private external fun kniBridge118(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge119")
private external fun kniBridge119(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge120")
private external fun kniBridge120(p0: Byte, p1: Byte, p2: Byte): Unit
@SymbolName("glfw_kniBridge121")
private external fun kniBridge121(p0: Double, p1: Double, p2: Double): Unit
@SymbolName("glfw_kniBridge122")
private external fun kniBridge122(p0: Float, p1: Float, p2: Float): Unit
@SymbolName("glfw_kniBridge123")
private external fun kniBridge123(p0: Int, p1: Int, p2: Int): Unit
@SymbolName("glfw_kniBridge124")
private external fun kniBridge124(p0: Short, p1: Short, p2: Short): Unit
@SymbolName("glfw_kniBridge125")
private external fun kniBridge125(p0: UByte, p1: UByte, p2: UByte): Unit
@SymbolName("glfw_kniBridge126")
private external fun kniBridge126(p0: UInt, p1: UInt, p2: UInt): Unit
@SymbolName("glfw_kniBridge127")
private external fun kniBridge127(p0: UShort, p1: UShort, p2: UShort): Unit
@SymbolName("glfw_kniBridge128")
private external fun kniBridge128(p0: Byte, p1: Byte, p2: Byte, p3: Byte): Unit
@SymbolName("glfw_kniBridge129")
private external fun kniBridge129(p0: Double, p1: Double, p2: Double, p3: Double): Unit
@SymbolName("glfw_kniBridge130")
private external fun kniBridge130(p0: Float, p1: Float, p2: Float, p3: Float): Unit
@SymbolName("glfw_kniBridge131")
private external fun kniBridge131(p0: Int, p1: Int, p2: Int, p3: Int): Unit
@SymbolName("glfw_kniBridge132")
private external fun kniBridge132(p0: Short, p1: Short, p2: Short, p3: Short): Unit
@SymbolName("glfw_kniBridge133")
private external fun kniBridge133(p0: UByte, p1: UByte, p2: UByte, p3: UByte): Unit
@SymbolName("glfw_kniBridge134")
private external fun kniBridge134(p0: UInt, p1: UInt, p2: UInt, p3: UInt): Unit
@SymbolName("glfw_kniBridge135")
private external fun kniBridge135(p0: UShort, p1: UShort, p2: UShort, p3: UShort): Unit
@SymbolName("glfw_kniBridge136")
private external fun kniBridge136(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge137")
private external fun kniBridge137(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge138")
private external fun kniBridge138(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge139")
private external fun kniBridge139(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge140")
private external fun kniBridge140(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge141")
private external fun kniBridge141(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge142")
private external fun kniBridge142(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge143")
private external fun kniBridge143(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge144")
private external fun kniBridge144(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge145")
private external fun kniBridge145(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge146")
private external fun kniBridge146(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge147")
private external fun kniBridge147(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge148")
private external fun kniBridge148(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge149")
private external fun kniBridge149(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge150")
private external fun kniBridge150(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge151")
private external fun kniBridge151(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge152")
private external fun kniBridge152(p0: Double): Unit
@SymbolName("glfw_kniBridge153")
private external fun kniBridge153(p0: Float): Unit
@SymbolName("glfw_kniBridge154")
private external fun kniBridge154(p0: Int): Unit
@SymbolName("glfw_kniBridge155")
private external fun kniBridge155(p0: Short): Unit
@SymbolName("glfw_kniBridge156")
private external fun kniBridge156(p0: Double, p1: Double): Unit
@SymbolName("glfw_kniBridge157")
private external fun kniBridge157(p0: Float, p1: Float): Unit
@SymbolName("glfw_kniBridge158")
private external fun kniBridge158(p0: Int, p1: Int): Unit
@SymbolName("glfw_kniBridge159")
private external fun kniBridge159(p0: Short, p1: Short): Unit
@SymbolName("glfw_kniBridge160")
private external fun kniBridge160(p0: Double, p1: Double, p2: Double): Unit
@SymbolName("glfw_kniBridge161")
private external fun kniBridge161(p0: Float, p1: Float, p2: Float): Unit
@SymbolName("glfw_kniBridge162")
private external fun kniBridge162(p0: Int, p1: Int, p2: Int): Unit
@SymbolName("glfw_kniBridge163")
private external fun kniBridge163(p0: Short, p1: Short, p2: Short): Unit
@SymbolName("glfw_kniBridge164")
private external fun kniBridge164(p0: Double, p1: Double, p2: Double, p3: Double): Unit
@SymbolName("glfw_kniBridge165")
private external fun kniBridge165(p0: Float, p1: Float, p2: Float, p3: Float): Unit
@SymbolName("glfw_kniBridge166")
private external fun kniBridge166(p0: Int, p1: Int, p2: Int, p3: Int): Unit
@SymbolName("glfw_kniBridge167")
private external fun kniBridge167(p0: Short, p1: Short, p2: Short, p3: Short): Unit
@SymbolName("glfw_kniBridge168")
private external fun kniBridge168(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge169")
private external fun kniBridge169(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge170")
private external fun kniBridge170(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge171")
private external fun kniBridge171(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge172")
private external fun kniBridge172(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge173")
private external fun kniBridge173(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge174")
private external fun kniBridge174(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge175")
private external fun kniBridge175(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge176")
private external fun kniBridge176(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge177")
private external fun kniBridge177(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge178")
private external fun kniBridge178(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge179")
private external fun kniBridge179(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge180")
private external fun kniBridge180(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge181")
private external fun kniBridge181(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge182")
private external fun kniBridge182(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge183")
private external fun kniBridge183(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge184")
private external fun kniBridge184(p0: Double, p1: Double): Unit
@SymbolName("glfw_kniBridge185")
private external fun kniBridge185(p0: Float, p1: Float): Unit
@SymbolName("glfw_kniBridge186")
private external fun kniBridge186(p0: Int, p1: Int): Unit
@SymbolName("glfw_kniBridge187")
private external fun kniBridge187(p0: Short, p1: Short): Unit
@SymbolName("glfw_kniBridge188")
private external fun kniBridge188(p0: Double, p1: Double, p2: Double): Unit
@SymbolName("glfw_kniBridge189")
private external fun kniBridge189(p0: Float, p1: Float, p2: Float): Unit
@SymbolName("glfw_kniBridge190")
private external fun kniBridge190(p0: Int, p1: Int, p2: Int): Unit
@SymbolName("glfw_kniBridge191")
private external fun kniBridge191(p0: Short, p1: Short, p2: Short): Unit
@SymbolName("glfw_kniBridge192")
private external fun kniBridge192(p0: Double, p1: Double, p2: Double, p3: Double): Unit
@SymbolName("glfw_kniBridge193")
private external fun kniBridge193(p0: Float, p1: Float, p2: Float, p3: Float): Unit
@SymbolName("glfw_kniBridge194")
private external fun kniBridge194(p0: Int, p1: Int, p2: Int, p3: Int): Unit
@SymbolName("glfw_kniBridge195")
private external fun kniBridge195(p0: Short, p1: Short, p2: Short, p3: Short): Unit
@SymbolName("glfw_kniBridge196")
private external fun kniBridge196(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge197")
private external fun kniBridge197(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge198")
private external fun kniBridge198(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge199")
private external fun kniBridge199(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge200")
private external fun kniBridge200(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge201")
private external fun kniBridge201(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge202")
private external fun kniBridge202(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge203")
private external fun kniBridge203(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge204")
private external fun kniBridge204(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge205")
private external fun kniBridge205(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge206")
private external fun kniBridge206(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge207")
private external fun kniBridge207(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge208")
private external fun kniBridge208(p0: Double, p1: Double, p2: Double, p3: Double): Unit
@SymbolName("glfw_kniBridge209")
private external fun kniBridge209(p0: Float, p1: Float, p2: Float, p3: Float): Unit
@SymbolName("glfw_kniBridge210")
private external fun kniBridge210(p0: Int, p1: Int, p2: Int, p3: Int): Unit
@SymbolName("glfw_kniBridge211")
private external fun kniBridge211(p0: Short, p1: Short, p2: Short, p3: Short): Unit
@SymbolName("glfw_kniBridge212")
private external fun kniBridge212(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge213")
private external fun kniBridge213(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge214")
private external fun kniBridge214(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge215")
private external fun kniBridge215(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge216")
private external fun kniBridge216(p0: Int, p1: UInt, p2: Int, p3: NativePtr): Unit
@SymbolName("glfw_kniBridge217")
private external fun kniBridge217(p0: UInt, p1: Int, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge218")
private external fun kniBridge218(p0: Int, p1: UInt, p2: Int, p3: NativePtr): Unit
@SymbolName("glfw_kniBridge219")
private external fun kniBridge219(p0: UInt, p1: Int, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge220")
private external fun kniBridge220(p0: Int, p1: UInt, p2: Int, p3: NativePtr): Unit
@SymbolName("glfw_kniBridge221")
private external fun kniBridge221(p0: Int, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge222")
private external fun kniBridge222(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge223")
private external fun kniBridge223(p0: Int): Unit
@SymbolName("glfw_kniBridge224")
private external fun kniBridge224(p0: UInt, p1: Int, p2: Int): Unit
@SymbolName("glfw_kniBridge225")
private external fun kniBridge225(p0: UInt, p1: Int, p2: UInt, p3: NativePtr): Unit
@SymbolName("glfw_kniBridge226")
private external fun kniBridge226(p0: UInt, p1: Int, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge227")
private external fun kniBridge227(p0: UInt): Unit
@SymbolName("glfw_kniBridge228")
private external fun kniBridge228(p0: UInt, p1: UInt, p2: Float): Unit
@SymbolName("glfw_kniBridge229")
private external fun kniBridge229(p0: UInt, p1: UInt, p2: Int): Unit
@SymbolName("glfw_kniBridge230")
private external fun kniBridge230(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge231")
private external fun kniBridge231(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge232")
private external fun kniBridge232(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge233")
private external fun kniBridge233(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge234")
private external fun kniBridge234(p0: UInt, p1: Float): Unit
@SymbolName("glfw_kniBridge235")
private external fun kniBridge235(p0: UInt, p1: Int): Unit
@SymbolName("glfw_kniBridge236")
private external fun kniBridge236(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge237")
private external fun kniBridge237(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge238")
private external fun kniBridge238(p0: UInt, p1: UInt, p2: Float): Unit
@SymbolName("glfw_kniBridge239")
private external fun kniBridge239(p0: UInt, p1: UInt, p2: Int): Unit
@SymbolName("glfw_kniBridge240")
private external fun kniBridge240(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge241")
private external fun kniBridge241(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge242")
private external fun kniBridge242(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge243")
private external fun kniBridge243(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge244")
private external fun kniBridge244(p0: UInt, p1: UInt): Unit
@SymbolName("glfw_kniBridge245")
private external fun kniBridge245(p0: Float, p1: Float): Unit
@SymbolName("glfw_kniBridge246")
private external fun kniBridge246(p0: UInt, p1: Float): Unit
@SymbolName("glfw_kniBridge247")
private external fun kniBridge247(p0: UInt, p1: Int): Unit
@SymbolName("glfw_kniBridge248")
private external fun kniBridge248(p0: UInt, p1: Float): Unit
@SymbolName("glfw_kniBridge249")
private external fun kniBridge249(p0: UInt, p1: Int): Unit
@SymbolName("glfw_kniBridge250")
private external fun kniBridge250(p0: UInt, p1: Int, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge251")
private external fun kniBridge251(p0: UInt, p1: Int, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge252")
private external fun kniBridge252(p0: UInt, p1: Int, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge253")
private external fun kniBridge253(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge254")
private external fun kniBridge254(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge255")
private external fun kniBridge255(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge256")
private external fun kniBridge256(p0: Int, p1: Int, p2: Float, p3: Float, p4: Float, p5: Float, p6: NativePtr): Unit
@SymbolName("glfw_kniBridge257")
private external fun kniBridge257(p0: Int, p1: Int, p2: Int, p3: Int, p4: UInt, p5: UInt, p6: NativePtr): Unit
@SymbolName("glfw_kniBridge258")
private external fun kniBridge258(p0: Int, p1: Int, p2: UInt, p3: UInt, p4: NativePtr): Unit
@SymbolName("glfw_kniBridge259")
private external fun kniBridge259(p0: Int, p1: Int, p2: Int, p3: Int, p4: UInt): Unit
@SymbolName("glfw_kniBridge260")
private external fun kniBridge260(p0: UInt, p1: Int, p2: UInt): Unit
@SymbolName("glfw_kniBridge261")
private external fun kniBridge261(p0: UInt): Unit
@SymbolName("glfw_kniBridge262")
private external fun kniBridge262(p0: UInt, p1: UInt, p2: UInt): Unit
@SymbolName("glfw_kniBridge263")
private external fun kniBridge263(p0: Int): Unit
@SymbolName("glfw_kniBridge264")
private external fun kniBridge264(p0: UInt, p1: UInt, p2: Double): Unit
@SymbolName("glfw_kniBridge265")
private external fun kniBridge265(p0: UInt, p1: UInt, p2: Float): Unit
@SymbolName("glfw_kniBridge266")
private external fun kniBridge266(p0: UInt, p1: UInt, p2: Int): Unit
@SymbolName("glfw_kniBridge267")
private external fun kniBridge267(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge268")
private external fun kniBridge268(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge269")
private external fun kniBridge269(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge270")
private external fun kniBridge270(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge271")
private external fun kniBridge271(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge272")
private external fun kniBridge272(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge273")
private external fun kniBridge273(p0: UInt, p1: UInt, p2: Float): Unit
@SymbolName("glfw_kniBridge274")
private external fun kniBridge274(p0: UInt, p1: UInt, p2: Int): Unit
@SymbolName("glfw_kniBridge275")
private external fun kniBridge275(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge276")
private external fun kniBridge276(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge277")
private external fun kniBridge277(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge278")
private external fun kniBridge278(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge279")
private external fun kniBridge279(p0: UInt, p1: UInt, p2: Float): Unit
@SymbolName("glfw_kniBridge280")
private external fun kniBridge280(p0: UInt, p1: UInt, p2: Int): Unit
@SymbolName("glfw_kniBridge281")
private external fun kniBridge281(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge282")
private external fun kniBridge282(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge283")
private external fun kniBridge283(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge284")
private external fun kniBridge284(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge285")
private external fun kniBridge285(p0: UInt, p1: Int, p2: UInt, p3: NativePtr): Unit
@SymbolName("glfw_kniBridge286")
private external fun kniBridge286(p0: UInt, p1: Int, p2: UInt, p3: NativePtr): Unit
@SymbolName("glfw_kniBridge287")
private external fun kniBridge287(p0: UInt, p1: Int, p2: Int, p3: Int, p4: Int, p5: UInt, p6: UInt, p7: NativePtr): Unit
@SymbolName("glfw_kniBridge288")
private external fun kniBridge288(p0: UInt, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: UInt, p7: UInt, p8: NativePtr): Unit
@SymbolName("glfw_kniBridge289")
private external fun kniBridge289(p0: UInt, p1: Int, p2: UInt, p3: UInt, p4: NativePtr): Unit
@SymbolName("glfw_kniBridge290")
private external fun kniBridge290(p0: Int, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge291")
private external fun kniBridge291(p0: Int, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge292")
private external fun kniBridge292(p0: UInt, p1: UInt): Unit
@SymbolName("glfw_kniBridge293")
private external fun kniBridge293(p0: Int, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge294")
private external fun kniBridge294(p0: Int, p1: NativePtr, p2: NativePtr): UByte
@SymbolName("glfw_kniBridge295")
private external fun kniBridge295(p0: UInt): UByte
@SymbolName("glfw_kniBridge296")
private external fun kniBridge296(p0: UInt, p1: Int, p2: Int, p3: Int, p4: UInt, p5: UInt, p6: NativePtr): Unit
@SymbolName("glfw_kniBridge297")
private external fun kniBridge297(p0: UInt, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: UInt, p7: UInt, p8: NativePtr): Unit
@SymbolName("glfw_kniBridge298")
private external fun kniBridge298(p0: UInt, p1: Int, p2: UInt, p3: Int, p4: Int, p5: Int, p6: Int): Unit
@SymbolName("glfw_kniBridge299")
private external fun kniBridge299(p0: UInt, p1: Int, p2: UInt, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int): Unit
@SymbolName("glfw_kniBridge300")
private external fun kniBridge300(p0: UInt, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int): Unit
@SymbolName("glfw_kniBridge301")
private external fun kniBridge301(p0: UInt, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int): Unit
@SymbolName("glfw_kniBridge302")
private external fun kniBridge302(p0: UInt, p1: Double, p2: Double, p3: Int, p4: Int, p5: NativePtr): Unit
@SymbolName("glfw_kniBridge303")
private external fun kniBridge303(p0: UInt, p1: Float, p2: Float, p3: Int, p4: Int, p5: NativePtr): Unit
@SymbolName("glfw_kniBridge304")
private external fun kniBridge304(p0: UInt, p1: Double, p2: Double, p3: Int, p4: Int, p5: Double, p6: Double, p7: Int, p8: Int, p9: NativePtr): Unit
@SymbolName("glfw_kniBridge305")
private external fun kniBridge305(p0: UInt, p1: Float, p2: Float, p3: Int, p4: Int, p5: Float, p6: Float, p7: Int, p8: Int, p9: NativePtr): Unit
@SymbolName("glfw_kniBridge306")
private external fun kniBridge306(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge307")
private external fun kniBridge307(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge308")
private external fun kniBridge308(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge309")
private external fun kniBridge309(p0: Double): Unit
@SymbolName("glfw_kniBridge310")
private external fun kniBridge310(p0: Float): Unit
@SymbolName("glfw_kniBridge311")
private external fun kniBridge311(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge312")
private external fun kniBridge312(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge313")
private external fun kniBridge313(p0: Double, p1: Double): Unit
@SymbolName("glfw_kniBridge314")
private external fun kniBridge314(p0: Float, p1: Float): Unit
@SymbolName("glfw_kniBridge315")
private external fun kniBridge315(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge316")
private external fun kniBridge316(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge317")
private external fun kniBridge317(p0: Int, p1: Double, p2: Double): Unit
@SymbolName("glfw_kniBridge318")
private external fun kniBridge318(p0: Int, p1: Float, p2: Float): Unit
@SymbolName("glfw_kniBridge319")
private external fun kniBridge319(p0: Int, p1: Double, p2: Double, p3: Int, p4: Double, p5: Double): Unit
@SymbolName("glfw_kniBridge320")
private external fun kniBridge320(p0: Int, p1: Float, p2: Float, p3: Int, p4: Float, p5: Float): Unit
@SymbolName("glfw_kniBridge321")
private external fun kniBridge321(p0: Int): Unit
@SymbolName("glfw_kniBridge322")
private external fun kniBridge322(p0: Int, p1: Int): Unit
@SymbolName("glfw_kniBridge323")
private external fun kniBridge323(p0: UInt, p1: Int, p2: Int): Unit
@SymbolName("glfw_kniBridge324")
private external fun kniBridge324(p0: UInt, p1: Int, p2: Int, p3: Int, p4: Int): Unit
@SymbolName("glfw_kniBridge325")
private external fun kniBridge325(p0: UInt, p1: Float): Unit
@SymbolName("glfw_kniBridge326")
private external fun kniBridge326(p0: UInt, p1: Int): Unit
@SymbolName("glfw_kniBridge327")
private external fun kniBridge327(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge328")
private external fun kniBridge328(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge329")
private external fun kniBridge329(p0: Int, p1: UInt, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge330")
private external fun kniBridge330(p0: Float): Unit
@SymbolName("glfw_kniBridge331")
private external fun kniBridge331(p0: Int, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge332")
private external fun kniBridge332(): Unit
@SymbolName("glfw_kniBridge333")
private external fun kniBridge333(p0: UInt): Unit
@SymbolName("glfw_kniBridge334")
private external fun kniBridge334(p0: UInt): Unit
@SymbolName("glfw_kniBridge335")
private external fun kniBridge335(): Unit
@SymbolName("glfw_kniBridge336")
private external fun kniBridge336(p0: UInt, p1: UInt, p2: UInt, p3: Int, p4: UInt, p5: NativePtr): Unit
@SymbolName("glfw_kniBridge337")
private external fun kniBridge337(p0: UInt, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: UInt, p8: UInt, p9: NativePtr): Unit
@SymbolName("glfw_kniBridge338")
private external fun kniBridge338(p0: UInt, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int, p8: UInt, p9: UInt, p10: NativePtr): Unit
@SymbolName("glfw_kniBridge339")
private external fun kniBridge339(p0: UInt, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int, p8: Int): Unit
@SymbolName("glfw_kniBridge340")
private external fun kniBridge340(p0: UInt, p1: UInt, p2: Int, p3: UInt, p4: UInt, p5: NativePtr): Unit
@SymbolName("glfw_kniBridge341")
private external fun kniBridge341(p0: UInt, p1: Int, p2: Int, p3: UInt, p4: UInt, p5: NativePtr): Unit
@SymbolName("glfw_kniBridge342")
private external fun kniBridge342(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge343")
private external fun kniBridge343(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge344")
private external fun kniBridge344(p0: UInt, p1: Int, p2: Int, p3: Int, p4: Int): Unit
@SymbolName("glfw_kniBridge345")
private external fun kniBridge345(p0: UInt, p1: UInt, p2: Int, p3: Int, p4: Int): Unit
@SymbolName("glfw_kniBridge346")
private external fun kniBridge346(p0: UInt, p1: UInt, p2: UInt, p3: NativePtr): Unit
@SymbolName("glfw_kniBridge347")
private external fun kniBridge347(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge348")
private external fun kniBridge348(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge349")
private external fun kniBridge349(p0: UInt): Unit
@SymbolName("glfw_kniBridge350")
private external fun kniBridge350(p0: Float, p1: Float, p2: Float, p3: Float): Unit
@SymbolName("glfw_kniBridge351")
private external fun kniBridge351(p0: UInt, p1: Int, p2: UInt, p3: UByte): Unit
@SymbolName("glfw_kniBridge352")
private external fun kniBridge352(p0: UInt): Unit
@SymbolName("glfw_kniBridge353")
private external fun kniBridge353(p0: UInt, p1: UByte, p2: UInt, p3: UInt, p4: NativePtr): Unit
@SymbolName("glfw_kniBridge354")
private external fun kniBridge354(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge355")
private external fun kniBridge355(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge356")
private external fun kniBridge356(p0: UInt, p1: UInt, p2: UByte): Unit
@SymbolName("glfw_kniBridge357")
private external fun kniBridge357(p0: UInt): Unit
@SymbolName("glfw_kniBridge358")
private external fun kniBridge358(p0: UInt, p1: UByte, p2: UInt, p3: UInt, p4: NativePtr): Unit
@SymbolName("glfw_kniBridge359")
private external fun kniBridge359(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge360")
private external fun kniBridge360(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge361")
private external fun kniBridge361(p0: UInt, p1: UInt, p2: Int, p3: UInt, p4: UInt, p5: NativePtr): Unit
@SymbolName("glfw_kniBridge362")
private external fun kniBridge362(p0: UInt, p1: UInt, p2: Int, p3: Int, p4: UInt, p5: UInt, p6: NativePtr): Unit
@SymbolName("glfw_kniBridge363")
private external fun kniBridge363(p0: UInt, p1: UInt, p2: Float): Unit
@SymbolName("glfw_kniBridge364")
private external fun kniBridge364(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge365")
private external fun kniBridge365(p0: UInt, p1: UInt, p2: Int): Unit
@SymbolName("glfw_kniBridge366")
private external fun kniBridge366(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge367")
private external fun kniBridge367(p0: UInt, p1: UInt, p2: Int, p3: Int, p4: Int): Unit
@SymbolName("glfw_kniBridge368")
private external fun kniBridge368(p0: UInt, p1: UInt, p2: Int, p3: Int, p4: Int, p5: Int): Unit
@SymbolName("glfw_kniBridge369")
private external fun kniBridge369(p0: UInt, p1: UInt, p2: UInt, p3: NativePtr): Unit
@SymbolName("glfw_kniBridge370")
private external fun kniBridge370(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge371")
private external fun kniBridge371(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge372")
private external fun kniBridge372(p0: UInt, p1: UInt, p2: Int, p3: Int, p4: UInt, p5: UInt, p6: NativePtr, p7: NativePtr): Unit
@SymbolName("glfw_kniBridge373")
private external fun kniBridge373(p0: UInt, p1: UInt, p2: UInt, p3: NativePtr, p4: NativePtr, p5: NativePtr): Unit
@SymbolName("glfw_kniBridge374")
private external fun kniBridge374(p0: UInt): Unit
@SymbolName("glfw_kniBridge375")
private external fun kniBridge375(p0: UInt): Unit
@SymbolName("glfw_kniBridge376")
private external fun kniBridge376(p0: UInt, p1: Int, p2: UInt, p3: Int, p4: Int, p5: Int, p6: NativePtr): Unit
@SymbolName("glfw_kniBridge377")
private external fun kniBridge377(p0: UInt, p1: Int, p2: UInt, p3: Int, p4: Int, p5: Int, p6: Int, p7: NativePtr): Unit
@SymbolName("glfw_kniBridge378")
private external fun kniBridge378(p0: UInt, p1: Int, p2: UInt, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int, p8: NativePtr): Unit
@SymbolName("glfw_kniBridge379")
private external fun kniBridge379(p0: UInt, p1: Int, p2: Int, p3: Int, p4: UInt, p5: Int, p6: NativePtr): Unit
@SymbolName("glfw_kniBridge380")
private external fun kniBridge380(p0: UInt, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: UInt, p7: Int, p8: NativePtr): Unit
@SymbolName("glfw_kniBridge381")
private external fun kniBridge381(p0: UInt, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int, p8: UInt, p9: Int, p10: NativePtr): Unit
@SymbolName("glfw_kniBridge382")
private external fun kniBridge382(p0: UInt, p1: Int, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge383")
private external fun kniBridge383(p0: UInt, p1: Double): Unit
@SymbolName("glfw_kniBridge384")
private external fun kniBridge384(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge385")
private external fun kniBridge385(p0: UInt, p1: Float): Unit
@SymbolName("glfw_kniBridge386")
private external fun kniBridge386(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge387")
private external fun kniBridge387(p0: UInt, p1: Int): Unit
@SymbolName("glfw_kniBridge388")
private external fun kniBridge388(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge389")
private external fun kniBridge389(p0: UInt, p1: Short): Unit
@SymbolName("glfw_kniBridge390")
private external fun kniBridge390(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge391")
private external fun kniBridge391(p0: UInt, p1: Double, p2: Double): Unit
@SymbolName("glfw_kniBridge392")
private external fun kniBridge392(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge393")
private external fun kniBridge393(p0: UInt, p1: Float, p2: Float): Unit
@SymbolName("glfw_kniBridge394")
private external fun kniBridge394(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge395")
private external fun kniBridge395(p0: UInt, p1: Int, p2: Int): Unit
@SymbolName("glfw_kniBridge396")
private external fun kniBridge396(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge397")
private external fun kniBridge397(p0: UInt, p1: Short, p2: Short): Unit
@SymbolName("glfw_kniBridge398")
private external fun kniBridge398(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge399")
private external fun kniBridge399(p0: UInt, p1: Double, p2: Double, p3: Double): Unit
@SymbolName("glfw_kniBridge400")
private external fun kniBridge400(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge401")
private external fun kniBridge401(p0: UInt, p1: Float, p2: Float, p3: Float): Unit
@SymbolName("glfw_kniBridge402")
private external fun kniBridge402(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge403")
private external fun kniBridge403(p0: UInt, p1: Int, p2: Int, p3: Int): Unit
@SymbolName("glfw_kniBridge404")
private external fun kniBridge404(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge405")
private external fun kniBridge405(p0: UInt, p1: Short, p2: Short, p3: Short): Unit
@SymbolName("glfw_kniBridge406")
private external fun kniBridge406(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge407")
private external fun kniBridge407(p0: UInt, p1: Double, p2: Double, p3: Double, p4: Double): Unit
@SymbolName("glfw_kniBridge408")
private external fun kniBridge408(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge409")
private external fun kniBridge409(p0: UInt, p1: Float, p2: Float, p3: Float, p4: Float): Unit
@SymbolName("glfw_kniBridge410")
private external fun kniBridge410(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge411")
private external fun kniBridge411(p0: UInt, p1: Int, p2: Int, p3: Int, p4: Int): Unit
@SymbolName("glfw_kniBridge412")
private external fun kniBridge412(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge413")
private external fun kniBridge413(p0: UInt, p1: Short, p2: Short, p3: Short, p4: Short): Unit
@SymbolName("glfw_kniBridge414")
private external fun kniBridge414(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge415")
private external fun kniBridge415(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge416")
private external fun kniBridge416(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge417")
private external fun kniBridge417(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge418")
private external fun kniBridge418(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge419")
private external fun kniBridge419(p0: Float, p1: UByte): Unit
@SymbolName("glfw_kniBridge420")
private external fun kniBridge420(p0: UInt): Unit
@SymbolName("glfw_kniBridge421")
private external fun kniBridge421(p0: UInt): Unit
@SymbolName("glfw_kniBridge422")
private external fun kniBridge422(p0: UInt, p1: Double): Unit
@SymbolName("glfw_kniBridge423")
private external fun kniBridge423(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge424")
private external fun kniBridge424(p0: UInt, p1: Float): Unit
@SymbolName("glfw_kniBridge425")
private external fun kniBridge425(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge426")
private external fun kniBridge426(p0: UInt, p1: Int): Unit
@SymbolName("glfw_kniBridge427")
private external fun kniBridge427(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge428")
private external fun kniBridge428(p0: UInt, p1: Short): Unit
@SymbolName("glfw_kniBridge429")
private external fun kniBridge429(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge430")
private external fun kniBridge430(p0: UInt, p1: Double, p2: Double): Unit
@SymbolName("glfw_kniBridge431")
private external fun kniBridge431(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge432")
private external fun kniBridge432(p0: UInt, p1: Float, p2: Float): Unit
@SymbolName("glfw_kniBridge433")
private external fun kniBridge433(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge434")
private external fun kniBridge434(p0: UInt, p1: Int, p2: Int): Unit
@SymbolName("glfw_kniBridge435")
private external fun kniBridge435(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge436")
private external fun kniBridge436(p0: UInt, p1: Short, p2: Short): Unit
@SymbolName("glfw_kniBridge437")
private external fun kniBridge437(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge438")
private external fun kniBridge438(p0: UInt, p1: Double, p2: Double, p3: Double): Unit
@SymbolName("glfw_kniBridge439")
private external fun kniBridge439(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge440")
private external fun kniBridge440(p0: UInt, p1: Float, p2: Float, p3: Float): Unit
@SymbolName("glfw_kniBridge441")
private external fun kniBridge441(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge442")
private external fun kniBridge442(p0: UInt, p1: Int, p2: Int, p3: Int): Unit
@SymbolName("glfw_kniBridge443")
private external fun kniBridge443(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge444")
private external fun kniBridge444(p0: UInt, p1: Short, p2: Short, p3: Short): Unit
@SymbolName("glfw_kniBridge445")
private external fun kniBridge445(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge446")
private external fun kniBridge446(p0: UInt, p1: Double, p2: Double, p3: Double, p4: Double): Unit
@SymbolName("glfw_kniBridge447")
private external fun kniBridge447(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge448")
private external fun kniBridge448(p0: UInt, p1: Float, p2: Float, p3: Float, p4: Float): Unit
@SymbolName("glfw_kniBridge449")
private external fun kniBridge449(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge450")
private external fun kniBridge450(p0: UInt, p1: Int, p2: Int, p3: Int, p4: Int): Unit
@SymbolName("glfw_kniBridge451")
private external fun kniBridge451(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge452")
private external fun kniBridge452(p0: UInt, p1: Short, p2: Short, p3: Short, p4: Short): Unit
@SymbolName("glfw_kniBridge453")
private external fun kniBridge453(p0: UInt, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge454")
private external fun kniBridge454(p0: Long): Long
@SymbolName("glfw_kniBridge455")
private external fun kniBridge455(p0: Long, p1: Long, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge456")
private external fun kniBridge456(p0: NativePtr, p1: NativePtr, p2: Int): Long
@SymbolName("glfw_kniBridge457")
private external fun kniBridge457(p0: NativePtr, p1: NativePtr, p2: Int): ULong
@SymbolName("glfw_kniBridge458")
private external fun kniBridge458(p0: NativePtr, p1: NativePtr, p2: Int): Long
@SymbolName("glfw_kniBridge459")
private external fun kniBridge459(p0: NativePtr, p1: NativePtr, p2: Int): ULong
@SymbolName("glfw_kniBridge460")
private external fun kniBridge460(p0: UInt, p1: UInt): Unit
@SymbolName("glfw_kniBridge461")
private external fun kniBridge461(): Int
@SymbolName("glfw_kniBridge462")
private external fun kniBridge462(): Unit
@SymbolName("glfw_kniBridge463")
private external fun kniBridge463(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge464")
private external fun kniBridge464(): NativePtr
@SymbolName("glfw_kniBridge465")
private external fun kniBridge465(p0: NativePtr): NativePtr
@SymbolName("glfw_kniBridge466")
private external fun kniBridge466(p0: NativePtr): NativePtr
@SymbolName("glfw_kniBridge467")
private external fun kniBridge467(): NativePtr
@SymbolName("glfw_kniBridge468")
private external fun kniBridge468(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge469")
private external fun kniBridge469(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge470")
private external fun kniBridge470(p0: NativePtr): NativePtr
@SymbolName("glfw_kniBridge471")
private external fun kniBridge471(p0: NativePtr): NativePtr
@SymbolName("glfw_kniBridge472")
private external fun kniBridge472(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("glfw_kniBridge473")
private external fun kniBridge473(p0: NativePtr): NativePtr
@SymbolName("glfw_kniBridge474")
private external fun kniBridge474(p0: NativePtr, p1: Float): Unit
@SymbolName("glfw_kniBridge475")
private external fun kniBridge475(p0: NativePtr): NativePtr
@SymbolName("glfw_kniBridge476")
private external fun kniBridge476(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge477")
private external fun kniBridge477(): Unit
@SymbolName("glfw_kniBridge478")
private external fun kniBridge478(p0: Int, p1: Int): Unit
@SymbolName("glfw_kniBridge479")
private external fun kniBridge479(p0: Int, p1: Int, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr
@SymbolName("glfw_kniBridge480")
private external fun kniBridge480(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge481")
private external fun kniBridge481(p0: NativePtr): Int
@SymbolName("glfw_kniBridge482")
private external fun kniBridge482(p0: NativePtr, p1: Int): Unit
@SymbolName("glfw_kniBridge483")
private external fun kniBridge483(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge484")
private external fun kniBridge484(p0: NativePtr, p1: Int, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge485")
private external fun kniBridge485(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge486")
private external fun kniBridge486(p0: NativePtr, p1: Int, p2: Int): Unit
@SymbolName("glfw_kniBridge487")
private external fun kniBridge487(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge488")
private external fun kniBridge488(p0: NativePtr, p1: Int, p2: Int, p3: Int, p4: Int): Unit
@SymbolName("glfw_kniBridge489")
private external fun kniBridge489(p0: NativePtr, p1: Int, p2: Int): Unit
@SymbolName("glfw_kniBridge490")
private external fun kniBridge490(p0: NativePtr, p1: Int, p2: Int): Unit
@SymbolName("glfw_kniBridge491")
private external fun kniBridge491(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge492")
private external fun kniBridge492(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Unit
@SymbolName("glfw_kniBridge493")
private external fun kniBridge493(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge494")
private external fun kniBridge494(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge495")
private external fun kniBridge495(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge496")
private external fun kniBridge496(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge497")
private external fun kniBridge497(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge498")
private external fun kniBridge498(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge499")
private external fun kniBridge499(p0: NativePtr): NativePtr
@SymbolName("glfw_kniBridge500")
private external fun kniBridge500(p0: NativePtr, p1: NativePtr, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int): Unit
@SymbolName("glfw_kniBridge501")
private external fun kniBridge501(p0: NativePtr, p1: Int): Int
@SymbolName("glfw_kniBridge502")
private external fun kniBridge502(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge503")
private external fun kniBridge503(p0: NativePtr): NativePtr
@SymbolName("glfw_kniBridge504")
private external fun kniBridge504(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("glfw_kniBridge505")
private external fun kniBridge505(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("glfw_kniBridge506")
private external fun kniBridge506(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("glfw_kniBridge507")
private external fun kniBridge507(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("glfw_kniBridge508")
private external fun kniBridge508(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("glfw_kniBridge509")
private external fun kniBridge509(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("glfw_kniBridge510")
private external fun kniBridge510(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("glfw_kniBridge511")
private external fun kniBridge511(): Unit
@SymbolName("glfw_kniBridge512")
private external fun kniBridge512(): Unit
@SymbolName("glfw_kniBridge513")
private external fun kniBridge513(p0: Double): Unit
@SymbolName("glfw_kniBridge514")
private external fun kniBridge514(): Unit
@SymbolName("glfw_kniBridge515")
private external fun kniBridge515(p0: NativePtr, p1: Int): Int
@SymbolName("glfw_kniBridge516")
private external fun kniBridge516(p0: NativePtr, p1: Int, p2: Int): Unit
@SymbolName("glfw_kniBridge517")
private external fun kniBridge517(p0: Int, p1: Int): NativePtr
@SymbolName("glfw_kniBridge518")
private external fun kniBridge518(p0: NativePtr, p1: Int): Int
@SymbolName("glfw_kniBridge519")
private external fun kniBridge519(p0: NativePtr, p1: Int): Int
@SymbolName("glfw_kniBridge520")
private external fun kniBridge520(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge521")
private external fun kniBridge521(p0: NativePtr, p1: Double, p2: Double): Unit
@SymbolName("glfw_kniBridge522")
private external fun kniBridge522(p0: NativePtr, p1: Int, p2: Int): NativePtr
@SymbolName("glfw_kniBridge523")
private external fun kniBridge523(p0: Int): NativePtr
@SymbolName("glfw_kniBridge524")
private external fun kniBridge524(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge525")
private external fun kniBridge525(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge526")
private external fun kniBridge526(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("glfw_kniBridge527")
private external fun kniBridge527(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("glfw_kniBridge528")
private external fun kniBridge528(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("glfw_kniBridge529")
private external fun kniBridge529(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("glfw_kniBridge530")
private external fun kniBridge530(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("glfw_kniBridge531")
private external fun kniBridge531(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("glfw_kniBridge532")
private external fun kniBridge532(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("glfw_kniBridge533")
private external fun kniBridge533(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("glfw_kniBridge534")
private external fun kniBridge534(p0: Int): Int
@SymbolName("glfw_kniBridge535")
private external fun kniBridge535(p0: Int, p1: NativePtr): NativePtr
@SymbolName("glfw_kniBridge536")
private external fun kniBridge536(p0: Int, p1: NativePtr): NativePtr
@SymbolName("glfw_kniBridge537")
private external fun kniBridge537(p0: Int): NativePtr
@SymbolName("glfw_kniBridge538")
private external fun kniBridge538(p0: NativePtr): NativePtr
@SymbolName("glfw_kniBridge539")
private external fun kniBridge539(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge540")
private external fun kniBridge540(p0: NativePtr): NativePtr
@SymbolName("glfw_kniBridge541")
private external fun kniBridge541(): Double
@SymbolName("glfw_kniBridge542")
private external fun kniBridge542(p0: Double): Unit
@SymbolName("glfw_kniBridge543")
private external fun kniBridge543(): ULong
@SymbolName("glfw_kniBridge544")
private external fun kniBridge544(): ULong
@SymbolName("glfw_kniBridge545")
private external fun kniBridge545(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge546")
private external fun kniBridge546(): NativePtr
@SymbolName("glfw_kniBridge547")
private external fun kniBridge547(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge548")
private external fun kniBridge548(p0: Int): Unit
@SymbolName("glfw_kniBridge549")
private external fun kniBridge549(p0: NativePtr): Int
@SymbolName("glfw_kniBridge550")
private external fun kniBridge550(p0: NativePtr): NativePtr
@SymbolName("glfw_kniBridge551")
private external fun kniBridge551(): Int
@SymbolName("glfw_kniBridge552")
private external fun kniBridge552(p0: NativePtr): NativePtr
