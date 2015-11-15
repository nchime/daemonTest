package com.mnlsolution.kt.common.util;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.LineNumberReader;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.PushbackInputStream;
import java.io.PushbackReader;
import java.io.SequenceInputStream;
import java.io.RandomAccessFile;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;

public final class IoCloseUtils
{
	private IoCloseUtils( )
	{}
	
	
	public static void close( ByteArrayInputStream io )
	{
		if ( io != null )
		{
			try
			{
				io.close( );
			}
			catch ( IOException e )
			{}
		}
	}
	
	
	public static void close( ByteArrayOutputStream io )
	{
		if ( io != null )
		{
			try
			{
				io.close( );
			}
			catch ( IOException e )
			{}
		}
	}
	
	
	public static void close( BufferedInputStream io )
	{
		if ( io != null )
		{
			try
			{
				io.close( );
			}
			catch ( IOException e )
			{}
		}
	}
	
	
	public static void close( BufferedOutputStream io )
	{
		if ( io != null )
		{
			try
			{
				io.close( );
			}
			catch ( IOException e )
			{}
		}
	}
	
	
	public static void close( InputStreamReader io )
	{
		if ( io != null )
		{
			try
			{
				io.close( );
			}
			catch ( IOException e )
			{}
		}
	}
	
	
	public static void close( OutputStreamWriter io )
	{
		if ( io != null )
		{
			try
			{
				io.close( );
			}
			catch ( IOException e )
			{}
		}
	}
	
	
	public static void close( BufferedReader io )
	{
		if ( io != null )
		{
			try
			{
				io.close( );
			}
			catch ( IOException e )
			{}
		}
	}
	
	
	public static void close( BufferedWriter io )
	{
		if ( io != null )
		{
			try
			{
				io.close( );
			}
			catch ( IOException e )
			{}
		}
	}
	
	
	public static void close( FileChannel io )
	{
		if ( io != null )
		{
			try
			{
				io.close( );
			}
			catch ( IOException e )
			{}
		}
	}
	
	
	public static void close( FileInputStream io )
	{
		if ( io != null )
		{
			try
			{
				io.close( );
			}
			catch ( IOException e )
			{}
		}
	}
	
	
	public static void close( FileOutputStream io )
	{
		if ( io != null )
		{
			try
			{
				io.close( );
			}
			catch ( IOException e )
			{}
		}
	}
	
	
	public static void close( FileReader io )
	{
		if ( io != null )
		{
			try
			{
				io.close( );
			}
			catch ( IOException e )
			{}
		}
	}
	
	
	public static void close( FileWriter io )
	{
		if ( io != null )
		{
			try
			{
				io.close( );
			}
			catch ( IOException e )
			{}
		}
	}
	
	
	public static void close( ObjectOutputStream io )
	{
		if ( io != null )
		{
			try
			{
				io.close( );
			}
			catch ( IOException e )
			{}
		}
	}
	
	
	public static void close( ObjectInputStream io )
	{
		if ( io != null )
		{
			try
			{
				io.close( );
			}
			catch ( IOException e )
			{}
		}
	}
	
	
	public static void close( CharArrayReader io )
	{
		if ( io != null )
		{
			io.close( );
		}
	}
	
	
	public static void close( CharArrayWriter io )
	{
		if ( io != null )
		{
			io.close( );
		}
	}
	
	
	public static void close( LineNumberReader io )
	{
		if ( io != null )
		{
			try
			{
				io.close( );
			}
			catch ( IOException e )
			{}
		}
	}
	
	
	public static void close( PipedInputStream io )
	{
		if ( io != null )
		{
			try
			{
				io.close( );
			}
			catch ( IOException e )
			{}
		}
	}
	
	
	public static void close( PipedOutputStream io )
	{
		if ( io != null )
		{
			try
			{
				io.close( );
			}
			catch ( IOException e )
			{}
		}
	}
	
	
	public static void close( PipedReader io )
	{
		if ( io != null )
		{
			try
			{
				io.close( );
			}
			catch ( IOException e )
			{}
		}
	}
	
	
	public static void close( PipedWriter io )
	{
		if ( io != null )
		{
			try
			{
				io.close( );
			}
			catch ( IOException e )
			{}
		}
	}
	
	
	public static void close( PrintStream io )
	{
		if ( io != null )
		{
			io.close( );
		}
	}
	
	
	public static void close( PrintWriter io )
	{
		if ( io != null )
		{
			io.close( );
		}
	}
	
	
	public static void close( PushbackInputStream io )
	{
		if ( io != null )
		{
			try
			{
				io.close( );
			}
			catch ( IOException e )
			{}
		}
	}
	
	
	public static void close( PushbackReader io )
	{
		if ( io != null )
		{
			try
			{
				io.close( );
			}
			catch ( IOException e )
			{}
		}
	}
	
	
	public static void close( SequenceInputStream io )
	{
		if ( io != null )
		{
			try
			{
				io.close( );
			}
			catch ( IOException e )
			{}
		}
	}
	
	
	public static void close( RandomAccessFile io )
	{
		if ( io != null )
		{
			try
			{
				io.close( );
			}
			catch ( IOException e )
			{}
		}
	}
	
	
	public static void close( StringReader io )
	{
		if ( io != null )
		{
			io.close( );
		}
	}
	
	
	public static void close( StringWriter io )
	{
		if ( io != null )
		{
			try
			{
				io.close( );
			}
			catch ( IOException e )
			{}
		}
	}
	
	
	public static void close( InputStream io )
	{
		if ( io != null )
		{
			try
			{
				io.close( );
			}
			catch ( IOException e )
			{}
		}
	}
	
	
	public static void close( OutputStream io )
	{
		if ( io != null )
		{
			try
			{
				io.close( );
			}
			catch ( IOException e )
			{}
		}
	}
}
